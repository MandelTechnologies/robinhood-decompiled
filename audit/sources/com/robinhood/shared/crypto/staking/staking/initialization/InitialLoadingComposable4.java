package com.robinhood.shared.crypto.staking.staking.initialization;

import android.app.Activity;
import android.content.Context;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
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
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.ActivityResultRegistry3;
import androidx.view.compose.ActivityResultRegistry8;
import androidx.view.compose.BackHandler5;
import androidx.view.result.ActivityResult;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.models.crypto.p314db.staking.StakingConfig;
import com.robinhood.shared.crypto.contracts.account.CryptoUpgradeIntentKey;
import com.robinhood.shared.crypto.staking.staking.C37760R;
import com.robinhood.shared.crypto.staking.staking.initialization.InitialLoadingComposable4;
import com.robinhood.shared.crypto.staking.staking.initialization.InitialLoadingEvent;
import com.robinhood.shared.staking.contracts.CryptoStakingIntentKey;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: InitialLoadingComposable.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001aK\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010\u0011\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\u0012\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u008a\u0084\u0002"}, m3636d2 = {"InitialLoadingComposable", "", "initArgs", "Lcom/robinhood/shared/staking/contracts/CryptoStakingIntentKey;", "navigateToInterstitial", "Lkotlin/Function1;", "Lcom/robinhood/models/crypto/db/staking/StakingConfig$OnboardingPage;", "navigateToInput", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/crypto/staking/staking/initialization/InitialLoadingDuxo;", "(Lcom/robinhood/shared/staking/contracts/CryptoStakingIntentKey;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/crypto/staking/staking/initialization/InitialLoadingDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-staking_externalDebug", "showAccountAgreementAlert", "", "showStakingUnavailableAlert", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/crypto/staking/staking/initialization/InitialLoadingEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.staking.staking.initialization.InitialLoadingComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class InitialLoadingComposable4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InitialLoadingComposable$lambda$20(CryptoStakingIntentKey cryptoStakingIntentKey, Function1 function1, Function0 function0, Modifier modifier, InitialLoadingDuxo initialLoadingDuxo, int i, int i2, Composer composer, int i3) {
        InitialLoadingComposable(cryptoStakingIntentKey, function1, function0, modifier, initialLoadingDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InitialLoadingComposable(final CryptoStakingIntentKey initArgs, final Function1<? super StakingConfig.OnboardingPage, Unit> navigateToInterstitial, final Function0<Unit> navigateToInput, Modifier modifier, InitialLoadingDuxo initialLoadingDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        InitialLoadingDuxo initialLoadingDuxo2;
        int i4;
        final InitialLoadingDuxo initialLoadingDuxo3;
        Modifier modifier3;
        int i5;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        SnapshotState snapshotState;
        boolean zChangedInstance;
        Object objRememberedValue3;
        SnapshotState snapshotState2;
        final SnapshotState snapshotState3;
        Event<InitialLoadingEvent> event;
        final Event<InitialLoadingEvent> eventInitialLoadingComposable$lambda$18;
        final InitialLoadingDuxo initialLoadingDuxo4;
        final Modifier modifier4;
        EventConsumer<InitialLoadingEvent> eventConsumerInvoke;
        final SnapshotState snapshotState4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(initArgs, "initArgs");
        Intrinsics.checkNotNullParameter(navigateToInterstitial, "navigateToInterstitial");
        Intrinsics.checkNotNullParameter(navigateToInput, "navigateToInput");
        Composer composerStartRestartGroup = composer.startRestartGroup(1454249634);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(initArgs) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(navigateToInterstitial) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(navigateToInput) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    initialLoadingDuxo2 = initialLoadingDuxo;
                    int i7 = composerStartRestartGroup.changedInstance(initialLoadingDuxo2) ? 16384 : 8192;
                    i3 |= i7;
                } else {
                    initialLoadingDuxo2 = initialLoadingDuxo;
                }
                i3 |= i7;
            } else {
                initialLoadingDuxo2 = initialLoadingDuxo;
            }
            i4 = i3;
            if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) == 0) {
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, initArgs)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(InitialLoadingDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.crypto.staking.staking.initialization.InitialLoadingComposableKt$InitialLoadingComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.staking.staking.initialization.InitialLoadingComposableKt$InitialLoadingComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        i5 = i4 & (-57345);
                        initialLoadingDuxo3 = (InitialLoadingDuxo) baseDuxo;
                        modifier3 = modifier5;
                    } else {
                        initialLoadingDuxo3 = initialLoadingDuxo2;
                        modifier3 = modifier5;
                        i5 = i4;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                    }
                    modifier3 = modifier2;
                    initialLoadingDuxo3 = initialLoadingDuxo2;
                    i5 = i4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1454249634, i5, -1, "com.robinhood.shared.crypto.staking.staking.initialization.InitialLoadingComposable (InitialLoadingComposable.kt:42)");
                }
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
                final Activity activity = (Activity) context;
                final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                OnBackPressedDispatcherOwner current2 = BackHandler5.INSTANCE.getCurrent(composerStartRestartGroup, BackHandler5.$stable);
                final OnBackPressedDispatcher onBackPressedDispatcher = current2 == null ? current2.getOnBackPressedDispatcher() : null;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                SnapshotState snapshotState5 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                snapshotState = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult = new ActivityResultContracts$StartActivityForResult();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(initialLoadingDuxo3);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.crypto.staking.staking.initialization.InitialLoadingComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return InitialLoadingComposable4.InitialLoadingComposable$lambda$7$lambda$6(initialLoadingDuxo3, (ActivityResult) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                final ActivityResultRegistry8 activityResultRegistry8RememberLauncherForActivityResult = ActivityResultRegistry3.rememberLauncherForActivityResult(activityResultContracts$StartActivityForResult, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                final OnBackPressedDispatcher onBackPressedDispatcher2 = onBackPressedDispatcher;
                snapshotState2 = snapshotState5;
                InitialLoadingDuxo initialLoadingDuxo5 = initialLoadingDuxo3;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier3, ComposableLambda3.rememberComposableLambda(1758444894, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.initialization.InitialLoadingComposableKt.InitialLoadingComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i8) {
                        if ((i8 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1758444894, i8, -1, "com.robinhood.shared.crypto.staking.staking.initialization.InitialLoadingComposable.<anonymous> (InitialLoadingComposable.kt:61)");
                        }
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(InitialLoadingComposable.INSTANCE.getLambda$434378577$feature_crypto_staking_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-1695409283, true, new AnonymousClass1(onBackPressedDispatcher), composer2, 54), null, null, false, false, null, null, 0L, null, composer2, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: InitialLoadingComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.staking.staking.initialization.InitialLoadingComposableKt$InitialLoadingComposable$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                        final /* synthetic */ OnBackPressedDispatcher $backPressDispatcher;

                        AnonymousClass1(OnBackPressedDispatcher onBackPressedDispatcher) {
                            this.$backPressDispatcher = onBackPressedDispatcher;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                            invoke(bentoAppBarScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i & 6) == 0) {
                                i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i & 19) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1695409283, i, -1, "com.robinhood.shared.crypto.staking.staking.initialization.InitialLoadingComposable.<anonymous>.<anonymous> (InitialLoadingComposable.kt:64)");
                            }
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(this.$backPressDispatcher);
                            final OnBackPressedDispatcher onBackPressedDispatcher = this.$backPressDispatcher;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.initialization.InitialLoadingComposableKt$InitialLoadingComposable$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return InitialLoadingComposable4.C377861.AnonymousClass1.invoke$lambda$1$lambda$0(onBackPressedDispatcher);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(OnBackPressedDispatcher onBackPressedDispatcher) {
                            if (onBackPressedDispatcher != null) {
                                onBackPressedDispatcher.onBackPressed();
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, InitialLoadingComposable.INSTANCE.getLambda$2132577331$feature_crypto_staking_externalDebug(), composerStartRestartGroup, ((i5 >> 9) & 14) | 805306416, 508);
                composerStartRestartGroup = composerStartRestartGroup;
                Modifier modifier6 = modifier3;
                composerStartRestartGroup.startReplaceGroup(1669576110);
                if (InitialLoadingComposable$lambda$1(snapshotState2)) {
                    String strStringResource = StringResources_androidKt.stringResource(C37760R.string.staking_upgrade_warning_title, composerStartRestartGroup, 0);
                    BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C37760R.string.staking_upgrade_warning_message, composerStartRestartGroup, 0));
                    String strStringResource2 = StringResources_androidKt.stringResource(C37760R.string.staking_upgrade_warning_button, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(activityResultRegistry8RememberLauncherForActivityResult) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue5 == companion.getEmpty()) {
                        snapshotState4 = snapshotState2;
                        objRememberedValue5 = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.initialization.InitialLoadingComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return InitialLoadingComposable4.InitialLoadingComposable$lambda$9$lambda$8(activityResultRegistry8RememberLauncherForActivityResult, navigator, context, snapshotState4);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        snapshotState4 = snapshotState2;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource2, (Function0) objRememberedValue5);
                    String strStringResource3 = StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.initialization.InitialLoadingComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return InitialLoadingComposable4.InitialLoadingComposable$lambda$11$lambda$10(snapshotState4);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoAlertButton bentoAlertButton2 = new BentoAlertButton(strStringResource3, (Function0) objRememberedValue6);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.initialization.InitialLoadingComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return InitialLoadingComposable4.InitialLoadingComposable$lambda$13$lambda$12(snapshotState4);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    Function0 function0 = (Function0) objRememberedValue7;
                    composerStartRestartGroup.endReplaceGroup();
                    int i8 = (BentoAlertDialog2.Body.Text.$stable << 3) | 100663296;
                    int i9 = BentoAlertButton.$stable;
                    snapshotState2 = snapshotState4;
                    BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, null, bentoAlertButton2, null, false, null, function0, composerStartRestartGroup, i8 | (i9 << 6) | (i9 << 12), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                    composerStartRestartGroup = composerStartRestartGroup;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1669610035);
                if (InitialLoadingComposable$lambda$4(snapshotState)) {
                    snapshotState3 = snapshotState;
                } else {
                    String strStringResource4 = StringResources_androidKt.stringResource(C37760R.string.staking_not_available_title, composerStartRestartGroup, 0);
                    BentoAlertDialog2.Body.Text text2 = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C37760R.string.staking_not_available_subtitle, composerStartRestartGroup, 0));
                    String strStringResource5 = StringResources_androidKt.stringResource(C11048R.string.general_label_got_it, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(onBackPressedDispatcher2);
                    Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue8 == companion.getEmpty()) {
                        snapshotState3 = snapshotState;
                        objRememberedValue8 = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.initialization.InitialLoadingComposableKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return InitialLoadingComposable4.InitialLoadingComposable$lambda$15$lambda$14(onBackPressedDispatcher2, snapshotState3);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    } else {
                        snapshotState3 = snapshotState;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoAlertButton bentoAlertButton3 = new BentoAlertButton(strStringResource5, (Function0) objRememberedValue8);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue9 == companion.getEmpty()) {
                        objRememberedValue9 = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.initialization.InitialLoadingComposableKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return InitialLoadingComposable4.InitialLoadingComposable$lambda$17$lambda$16(snapshotState3);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Composer composer2 = composerStartRestartGroup;
                    BentoAlertDialog.BentoAlertDialog(strStringResource4, text2, bentoAlertButton3, null, null, null, false, null, (Function0) objRememberedValue9, composer2, (BentoAlertDialog2.Body.Text.$stable << 3) | 100663296 | (BentoAlertButton.$stable << 6), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                    composerStartRestartGroup = composer2;
                }
                composerStartRestartGroup.endReplaceGroup();
                final StateFlow<Event<InitialLoadingEvent>> eventFlow = initialLoadingDuxo5.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.shared.crypto.staking.staking.initialization.InitialLoadingComposableKt$InitialLoadingComposable$$inlined$collectEventAsStateWithLifecycle$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                        Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.staking.staking.initialization.InitialLoadingComposableKt$InitialLoadingComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.initialization.InitialLoadingComposableKt$InitialLoadingComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "InitialLoadingComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.crypto.staking.staking.initialization.InitialLoadingComposableKt$InitialLoadingComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                Event event = (Event) obj;
                                if ((event != null ? event.getData() : null) instanceof InitialLoadingEvent) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
                Event<InitialLoadingEvent> value = eventFlow.getValue();
                event = value;
                if (!((event == null ? event.getData() : null) instanceof InitialLoadingEvent)) {
                    value = null;
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                eventInitialLoadingComposable$lambda$18 = InitialLoadingComposable$lambda$18(snapshotState4CollectAsStateWithLifecycle);
                if (eventInitialLoadingComposable$lambda$18 != null) {
                    if ((eventInitialLoadingComposable$lambda$18.getData() instanceof InitialLoadingEvent) && (eventConsumerInvoke = eventInitialLoadingComposable$lambda$18.getGetEventConsumer().invoke()) != null) {
                        final SnapshotState snapshotState6 = snapshotState3;
                        final SnapshotState snapshotState7 = snapshotState2;
                        eventConsumerInvoke.consume(eventInitialLoadingComposable$lambda$18, new Function1() { // from class: com.robinhood.shared.crypto.staking.staking.initialization.InitialLoadingComposableKt$InitialLoadingComposable$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                                m24940invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m24940invoke(Object it) throws Throwable {
                                Intrinsics.checkNotNullParameter(it, "it");
                                InitialLoadingEvent initialLoadingEvent = (InitialLoadingEvent) eventInitialLoadingComposable$lambda$18.getData();
                                if (Intrinsics.areEqual(initialLoadingEvent, InitialLoadingEvent.PromptCryptoAccountAgreement.INSTANCE)) {
                                    InitialLoadingComposable4.InitialLoadingComposable$lambda$2(snapshotState7, true);
                                    return;
                                }
                                if (Intrinsics.areEqual(initialLoadingEvent, InitialLoadingEvent.StakingNotAvailable.INSTANCE)) {
                                    InitialLoadingComposable4.InitialLoadingComposable$lambda$5(snapshotState6, true);
                                    return;
                                }
                                if (initialLoadingEvent instanceof InitialLoadingEvent.ShowInterstitial) {
                                    navigateToInterstitial.invoke(((InitialLoadingEvent.ShowInterstitial) initialLoadingEvent).getPageContent());
                                } else if (Intrinsics.areEqual(initialLoadingEvent, InitialLoadingEvent.ShowInputPage.INSTANCE)) {
                                    navigateToInput.invoke();
                                } else {
                                    if (!(initialLoadingEvent instanceof InitialLoadingEvent.Error)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, activity, ((InitialLoadingEvent.Error) initialLoadingEvent).getThrowable(), true, true, 0, null, 48, null);
                                }
                            }
                        });
                    }
                    Unit unit = Unit.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                initialLoadingDuxo4 = initialLoadingDuxo5;
                modifier4 = modifier6;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                initialLoadingDuxo4 = initialLoadingDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.initialization.InitialLoadingComposableKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InitialLoadingComposable4.InitialLoadingComposable$lambda$20(initArgs, navigateToInterstitial, navigateToInput, modifier4, initialLoadingDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
        i4 = i3;
        if ((i4 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type android.app.Activity");
                final Activity activity2 = (Activity) context2;
                final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                OnBackPressedDispatcherOwner current22 = BackHandler5.INSTANCE.getCurrent(composerStartRestartGroup, BackHandler5.$stable);
                if (current22 == null) {
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                SnapshotState snapshotState52 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult2 = new ActivityResultContracts$StartActivityForResult();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(initialLoadingDuxo3);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.crypto.staking.staking.initialization.InitialLoadingComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return InitialLoadingComposable4.InitialLoadingComposable$lambda$7$lambda$6(initialLoadingDuxo3, (ActivityResult) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    composerStartRestartGroup.endReplaceGroup();
                    final ActivityResultRegistry8 activityResultRegistry8RememberLauncherForActivityResult2 = ActivityResultRegistry3.rememberLauncherForActivityResult(activityResultContracts$StartActivityForResult2, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                    final OnBackPressedDispatcher onBackPressedDispatcher22 = onBackPressedDispatcher;
                    snapshotState2 = snapshotState52;
                    InitialLoadingDuxo initialLoadingDuxo52 = initialLoadingDuxo3;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifier3, ComposableLambda3.rememberComposableLambda(1758444894, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.initialization.InitialLoadingComposableKt.InitialLoadingComposable.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer22, Integer num) {
                            invoke(composer22, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer22, int i82) {
                            if ((i82 & 3) == 2 && composer22.getSkipping()) {
                                composer22.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1758444894, i82, -1, "com.robinhood.shared.crypto.staking.staking.initialization.InitialLoadingComposable.<anonymous> (InitialLoadingComposable.kt:61)");
                            }
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(InitialLoadingComposable.INSTANCE.getLambda$434378577$feature_crypto_staking_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-1695409283, true, new AnonymousClass1(onBackPressedDispatcher), composer22, 54), null, null, false, false, null, null, 0L, null, composer22, 390, 0, 2042);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: InitialLoadingComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.crypto.staking.staking.initialization.InitialLoadingComposableKt$InitialLoadingComposable$1$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                            final /* synthetic */ OnBackPressedDispatcher $backPressDispatcher;

                            AnonymousClass1(OnBackPressedDispatcher onBackPressedDispatcher) {
                                this.$backPressDispatcher = onBackPressedDispatcher;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                invoke(bentoAppBarScope, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i & 6) == 0) {
                                    i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i & 19) == 18 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1695409283, i, -1, "com.robinhood.shared.crypto.staking.staking.initialization.InitialLoadingComposable.<anonymous>.<anonymous> (InitialLoadingComposable.kt:64)");
                                }
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(this.$backPressDispatcher);
                                final OnBackPressedDispatcher onBackPressedDispatcher = this.$backPressDispatcher;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.initialization.InitialLoadingComposableKt$InitialLoadingComposable$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return InitialLoadingComposable4.C377861.AnonymousClass1.invoke$lambda$1$lambda$0(onBackPressedDispatcher);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(OnBackPressedDispatcher onBackPressedDispatcher) {
                                if (onBackPressedDispatcher != null) {
                                    onBackPressedDispatcher.onBackPressed();
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, InitialLoadingComposable.INSTANCE.getLambda$2132577331$feature_crypto_staking_externalDebug(), composerStartRestartGroup, ((i5 >> 9) & 14) | 805306416, 508);
                    composerStartRestartGroup = composerStartRestartGroup;
                    Modifier modifier62 = modifier3;
                    composerStartRestartGroup.startReplaceGroup(1669576110);
                    if (InitialLoadingComposable$lambda$1(snapshotState2)) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1669610035);
                    if (InitialLoadingComposable$lambda$4(snapshotState)) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    final Flow eventFlow2 = initialLoadingDuxo52.getEventFlow();
                    composerStartRestartGroup.startReplaceGroup(-523522313);
                    LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    Lifecycle.State state2 = Lifecycle.State.STARTED;
                    CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                    Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.shared.crypto.staking.staking.initialization.InitialLoadingComposableKt$InitialLoadingComposable$$inlined$collectEventAsStateWithLifecycle$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                            Object objCollect = eventFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.crypto.staking.staking.initialization.InitialLoadingComposableKt$InitialLoadingComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.initialization.InitialLoadingComposableKt$InitialLoadingComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "InitialLoadingComposable.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.shared.crypto.staking.staking.initialization.InitialLoadingComposableKt$InitialLoadingComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    Event event = (Event) obj;
                                    if ((event != null ? event.getData() : null) instanceof InitialLoadingEvent) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    };
                    Event<InitialLoadingEvent> value2 = eventFlow2.getValue();
                    event = value2;
                    if (!((event == null ? event.getData() : null) instanceof InitialLoadingEvent)) {
                    }
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    eventInitialLoadingComposable$lambda$18 = InitialLoadingComposable$lambda$18(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventInitialLoadingComposable$lambda$18 != null) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    initialLoadingDuxo4 = initialLoadingDuxo52;
                    modifier4 = modifier62;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InitialLoadingComposable$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InitialLoadingComposable$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InitialLoadingComposable$lambda$7$lambda$6(InitialLoadingDuxo initialLoadingDuxo, ActivityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.getResultCode() == -1) {
            initialLoadingDuxo.initialize();
        }
        return Unit.INSTANCE;
    }

    private static final boolean InitialLoadingComposable$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final Event<InitialLoadingEvent> InitialLoadingComposable$lambda$18(SnapshotState4<Event<InitialLoadingEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean InitialLoadingComposable$lambda$4(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InitialLoadingComposable$lambda$9$lambda$8(ActivityResultRegistry8 activityResultRegistry8, Navigator navigator, Context context, SnapshotState snapshotState) {
        InitialLoadingComposable$lambda$2(snapshotState, false);
        activityResultRegistry8.launch(Navigator.DefaultImpls.createIntent$default(navigator, context, new CryptoUpgradeIntentKey(false, null, 3, null), null, false, 12, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InitialLoadingComposable$lambda$11$lambda$10(SnapshotState snapshotState) {
        InitialLoadingComposable$lambda$2(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InitialLoadingComposable$lambda$13$lambda$12(SnapshotState snapshotState) {
        InitialLoadingComposable$lambda$2(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InitialLoadingComposable$lambda$15$lambda$14(OnBackPressedDispatcher onBackPressedDispatcher, SnapshotState snapshotState) {
        InitialLoadingComposable$lambda$5(snapshotState, false);
        if (onBackPressedDispatcher != null) {
            onBackPressedDispatcher.onBackPressed();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InitialLoadingComposable$lambda$17$lambda$16(SnapshotState snapshotState) {
        InitialLoadingComposable$lambda$5(snapshotState, false);
        return Unit.INSTANCE;
    }
}
