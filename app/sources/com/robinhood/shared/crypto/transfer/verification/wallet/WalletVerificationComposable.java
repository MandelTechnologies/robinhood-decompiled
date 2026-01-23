package com.robinhood.shared.crypto.transfer.verification.wallet;

import android.app.Activity;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.p011ui.Modifier;
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
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
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
import androidx.view.compose.ActivityResultRegistry3;
import androidx.view.compose.ActivityResultRegistry8;
import androidx.view.compose.LocalActivity;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.api.transfer.verification.ApiCryptoVerificationResponse;
import com.robinhood.shared.crypto.transfer.verification.VerificationType;
import com.robinhood.shared.crypto.transfer.verification.wallet.WalletVerificationDuxo2;
import com.robinhood.shared.lib.crypto.transfer.CryptoTransferErrorHandler;
import com.robinhood.shared.rhweb.contracts.RhWebIntentKey2;
import com.robinhood.shared.rhweb.contracts.RhWebIntentKey3;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WalletVerificationComposable.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aE\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\u0012\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u008a\u0084\u0002²\u0006\f\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002"}, m3636d2 = {"WalletVerificationComposable", "", "verificationId", "Ljava/util/UUID;", "verificationType", "Lcom/robinhood/shared/crypto/transfer/verification/VerificationType;", "onWalletVerificationCompleted", "Lkotlin/Function1;", "Lcom/robinhood/models/api/transfer/verification/ApiCryptoVerificationResponse;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/crypto/transfer/verification/wallet/WalletVerificationDuxo;", "(Ljava/util/UUID;Lcom/robinhood/shared/crypto/transfer/verification/VerificationType;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/crypto/transfer/verification/wallet/WalletVerificationDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-transfer_externalDebug", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/crypto/transfer/verification/wallet/WalletVerificationEvent;", "alreadyLaunchedForVerificationId"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.verification.wallet.WalletVerificationComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class WalletVerificationComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WalletVerificationComposable$lambda$14(UUID uuid, VerificationType verificationType, Function1 function1, Modifier modifier, WalletVerificationDuxo walletVerificationDuxo, int i, int i2, Composer composer, int i3) {
        WalletVerificationComposable(uuid, verificationType, function1, modifier, walletVerificationDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Navigator WalletVerificationComposable$lambda$7$lambda$6(Navigator navigator) {
        return navigator;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WalletVerificationComposable(final UUID verificationId, final VerificationType verificationType, final Function1<? super ApiCryptoVerificationResponse, Unit> onWalletVerificationCompleted, Modifier modifier, WalletVerificationDuxo walletVerificationDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        WalletVerificationDuxo walletVerificationDuxo2;
        int i4;
        int i5;
        Modifier modifier3;
        final WalletVerificationDuxo walletVerificationDuxo3;
        boolean isDay;
        final Navigator navigator;
        Object objRememberedValue;
        Composer.Companion companion;
        final CryptoTransferErrorHandler cryptoTransferErrorHandler;
        final LifecycleAwareNavigator lifecycleAwareNavigator;
        Object objRememberedValue2;
        SnapshotState snapshotState;
        boolean zChangedInstance;
        Object objRememberedValue3;
        boolean zChangedInstance2;
        Object objRememberedValue4;
        final ActivityResultRegistry8 activityResultRegistry8RememberLauncherForActivityResult;
        boolean zChanged;
        Object objRememberedValue5;
        WalletVerificationDuxo walletVerificationDuxo4;
        Modifier modifier4;
        final Event<WalletVerificationDuxo2> eventWalletVerificationComposable$lambda$0;
        final Event<WalletVerificationDuxo2> eventWalletVerificationComposable$lambda$02;
        final Event<WalletVerificationDuxo2> eventWalletVerificationComposable$lambda$03;
        final WalletVerificationDuxo walletVerificationDuxo5;
        final Modifier modifier5;
        EventConsumer<WalletVerificationDuxo2> eventConsumerInvoke;
        EventConsumer<WalletVerificationDuxo2> eventConsumerInvoke2;
        EventConsumer<WalletVerificationDuxo2> eventConsumerInvoke3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(verificationId, "verificationId");
        Intrinsics.checkNotNullParameter(verificationType, "verificationType");
        Intrinsics.checkNotNullParameter(onWalletVerificationCompleted, "onWalletVerificationCompleted");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2146711216);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(verificationId) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(verificationType.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onWalletVerificationCompleted) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    walletVerificationDuxo2 = walletVerificationDuxo;
                    int i7 = composerStartRestartGroup.changedInstance(walletVerificationDuxo2) ? 16384 : 8192;
                    i3 |= i7;
                } else {
                    walletVerificationDuxo2 = walletVerificationDuxo;
                }
                i3 |= i7;
            } else {
                walletVerificationDuxo2 = walletVerificationDuxo;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier6 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        i4 = 0;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(WalletVerificationDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.crypto.transfer.verification.wallet.WalletVerificationComposableKt$WalletVerificationComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.transfer.verification.wallet.WalletVerificationComposableKt$WalletVerificationComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue6, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        walletVerificationDuxo2 = (WalletVerificationDuxo) baseDuxo;
                        i3 &= -57345;
                    } else {
                        i4 = 0;
                    }
                    WalletVerificationDuxo walletVerificationDuxo6 = walletVerificationDuxo2;
                    i5 = i3;
                    modifier3 = modifier6;
                    walletVerificationDuxo3 = walletVerificationDuxo6;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    walletVerificationDuxo3 = walletVerificationDuxo2;
                    i5 = i3;
                    modifier3 = modifier2;
                    i4 = 0;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2146711216, i5, -1, "com.robinhood.shared.crypto.transfer.verification.wallet.WalletVerificationComposable (WalletVerificationComposable.kt:34)");
                }
                int i8 = i5;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(walletVerificationDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                isDay = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay();
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                Object objConsume = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type android.app.Activity");
                Activity activity = (Activity) objConsume;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new CryptoTransferErrorHandler(activity, null, null, null, null, false, 48, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                cryptoTransferErrorHandler = (CryptoTransferErrorHandler) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                lifecycleAwareNavigator = (LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                Object[] objArr = new Object[i4];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.wallet.WalletVerificationComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return WalletVerificationComposable.WalletVerificationComposable$lambda$3$lambda$2();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 6);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(navigator);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.wallet.WalletVerificationComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return WalletVerificationComposable.WalletVerificationComposable$lambda$7$lambda$6(navigator);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                RhWebIntentKey2 rhWebIntentKey2 = new RhWebIntentKey2((Function0) objRememberedValue3);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance2 = ((i8 & 112) != 32) | composerStartRestartGroup.changedInstance(walletVerificationDuxo3) | composerStartRestartGroup.changedInstance(verificationId) | composerStartRestartGroup.changed(lifecycleAwareNavigator);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.wallet.WalletVerificationComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return WalletVerificationComposable.WalletVerificationComposable$lambda$9$lambda$8(walletVerificationDuxo3, verificationId, verificationType, lifecycleAwareNavigator, (RhWebIntentKey3) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                activityResultRegistry8RememberLauncherForActivityResult = ActivityResultRegistry3.rememberLauncherForActivityResult(rhWebIntentKey2, (Function1) objRememberedValue4, composerStartRestartGroup, 0);
                BoxKt.Box(modifier3, composerStartRestartGroup, (i8 >> 9) & 14);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged = composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changedInstance(verificationId) | composerStartRestartGroup.changedInstance(walletVerificationDuxo3) | composerStartRestartGroup.changed(isDay);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue5 == companion.getEmpty()) {
                    Modifier modifier7 = modifier3;
                    walletVerificationDuxo4 = walletVerificationDuxo3;
                    modifier4 = modifier7;
                    WalletVerificationComposable2 walletVerificationComposable2 = new WalletVerificationComposable2(verificationId, walletVerificationDuxo4, isDay, snapshotState, null);
                    composerStartRestartGroup.updateRememberedValue(walletVerificationComposable2);
                    objRememberedValue5 = walletVerificationComposable2;
                } else {
                    modifier4 = modifier3;
                    walletVerificationDuxo4 = walletVerificationDuxo3;
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(verificationId, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, i8 & 14);
                eventWalletVerificationComposable$lambda$0 = WalletVerificationComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                if (eventWalletVerificationComposable$lambda$0 != null && (eventWalletVerificationComposable$lambda$0.getData() instanceof WalletVerificationDuxo2.Success) && (eventConsumerInvoke3 = eventWalletVerificationComposable$lambda$0.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke3.consume(eventWalletVerificationComposable$lambda$0, new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.wallet.WalletVerificationComposableKt$WalletVerificationComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25210invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25210invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            onWalletVerificationCompleted.invoke(((WalletVerificationDuxo2.Success) eventWalletVerificationComposable$lambda$0.getData()).getNext());
                        }
                    });
                }
                eventWalletVerificationComposable$lambda$02 = WalletVerificationComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                if (eventWalletVerificationComposable$lambda$02 != null && (eventWalletVerificationComposable$lambda$02.getData() instanceof WalletVerificationDuxo2.Error) && (eventConsumerInvoke2 = eventWalletVerificationComposable$lambda$02.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke2.consume(eventWalletVerificationComposable$lambda$02, new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.wallet.WalletVerificationComposableKt$WalletVerificationComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25211invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25211invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            AbsErrorHandler.handleError$default(cryptoTransferErrorHandler, ((WalletVerificationDuxo2.Error) eventWalletVerificationComposable$lambda$02.getData()).getThrowable(), false, 2, null);
                        }
                    });
                }
                eventWalletVerificationComposable$lambda$03 = WalletVerificationComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                if (eventWalletVerificationComposable$lambda$03 != null && (eventWalletVerificationComposable$lambda$03.getData() instanceof WalletVerificationDuxo2.Load) && (eventConsumerInvoke = eventWalletVerificationComposable$lambda$03.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventWalletVerificationComposable$lambda$03, new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.wallet.WalletVerificationComposableKt$WalletVerificationComposable$$inlined$consumeIfType$3
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25212invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25212invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            NavigationActivityResultContract3.launch$default(activityResultRegistry8RememberLauncherForActivityResult, ((WalletVerificationDuxo2.Load) eventWalletVerificationComposable$lambda$03.getData()).getKey(), null, false, 6, null);
                        }
                    });
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                walletVerificationDuxo5 = walletVerificationDuxo4;
                modifier5 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier5 = modifier2;
                walletVerificationDuxo5 = walletVerificationDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.verification.wallet.WalletVerificationComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return WalletVerificationComposable.WalletVerificationComposable$lambda$14(verificationId, verificationType, onWalletVerificationCompleted, modifier5, walletVerificationDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            if ((i & 1) != 0) {
                if (i6 == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                WalletVerificationDuxo walletVerificationDuxo62 = walletVerificationDuxo2;
                i5 = i3;
                modifier3 = modifier6;
                walletVerificationDuxo3 = walletVerificationDuxo62;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i82 = i5;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(walletVerificationDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                isDay = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay();
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                Object objConsume2 = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                Intrinsics.checkNotNull(objConsume2, "null cannot be cast to non-null type android.app.Activity");
                Activity activity2 = (Activity) objConsume2;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                cryptoTransferErrorHandler = (CryptoTransferErrorHandler) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                lifecycleAwareNavigator = (LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                Object[] objArr2 = new Object[i4];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 6);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(navigator);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.wallet.WalletVerificationComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return WalletVerificationComposable.WalletVerificationComposable$lambda$7$lambda$6(navigator);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    composerStartRestartGroup.endReplaceGroup();
                    RhWebIntentKey2 rhWebIntentKey22 = new RhWebIntentKey2((Function0) objRememberedValue3);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChangedInstance2 = ((i82 & 112) != 32) | composerStartRestartGroup.changedInstance(walletVerificationDuxo3) | composerStartRestartGroup.changedInstance(verificationId) | composerStartRestartGroup.changed(lifecycleAwareNavigator);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2) {
                        objRememberedValue4 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.wallet.WalletVerificationComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return WalletVerificationComposable.WalletVerificationComposable$lambda$9$lambda$8(walletVerificationDuxo3, verificationId, verificationType, lifecycleAwareNavigator, (RhWebIntentKey3) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        composerStartRestartGroup.endReplaceGroup();
                        activityResultRegistry8RememberLauncherForActivityResult = ActivityResultRegistry3.rememberLauncherForActivityResult(rhWebIntentKey22, (Function1) objRememberedValue4, composerStartRestartGroup, 0);
                        BoxKt.Box(modifier3, composerStartRestartGroup, (i82 >> 9) & 14);
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        zChanged = composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changedInstance(verificationId) | composerStartRestartGroup.changedInstance(walletVerificationDuxo3) | composerStartRestartGroup.changed(isDay);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            Modifier modifier72 = modifier3;
                            walletVerificationDuxo4 = walletVerificationDuxo3;
                            modifier4 = modifier72;
                            WalletVerificationComposable2 walletVerificationComposable22 = new WalletVerificationComposable2(verificationId, walletVerificationDuxo4, isDay, snapshotState, null);
                            composerStartRestartGroup.updateRememberedValue(walletVerificationComposable22);
                            objRememberedValue5 = walletVerificationComposable22;
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(verificationId, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, i82 & 14);
                            eventWalletVerificationComposable$lambda$0 = WalletVerificationComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
                            if (eventWalletVerificationComposable$lambda$0 != null) {
                                eventConsumerInvoke3.consume(eventWalletVerificationComposable$lambda$0, new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.wallet.WalletVerificationComposableKt$WalletVerificationComposable$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        m25210invoke(obj);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m25210invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        onWalletVerificationCompleted.invoke(((WalletVerificationDuxo2.Success) eventWalletVerificationComposable$lambda$0.getData()).getNext());
                                    }
                                });
                            }
                            eventWalletVerificationComposable$lambda$02 = WalletVerificationComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
                            if (eventWalletVerificationComposable$lambda$02 != null) {
                                eventConsumerInvoke2.consume(eventWalletVerificationComposable$lambda$02, new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.wallet.WalletVerificationComposableKt$WalletVerificationComposable$$inlined$consumeIfType$2
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        m25211invoke(obj);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m25211invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        AbsErrorHandler.handleError$default(cryptoTransferErrorHandler, ((WalletVerificationDuxo2.Error) eventWalletVerificationComposable$lambda$02.getData()).getThrowable(), false, 2, null);
                                    }
                                });
                            }
                            eventWalletVerificationComposable$lambda$03 = WalletVerificationComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
                            if (eventWalletVerificationComposable$lambda$03 != null) {
                                eventConsumerInvoke.consume(eventWalletVerificationComposable$lambda$03, new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.wallet.WalletVerificationComposableKt$WalletVerificationComposable$$inlined$consumeIfType$3
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        m25212invoke(obj);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m25212invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        NavigationActivityResultContract3.launch$default(activityResultRegistry8RememberLauncherForActivityResult, ((WalletVerificationDuxo2.Load) eventWalletVerificationComposable$lambda$03.getData()).getKey(), null, false, 6, null);
                                    }
                                });
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            walletVerificationDuxo5 = walletVerificationDuxo4;
                            modifier5 = modifier4;
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
    public static final SnapshotState WalletVerificationComposable$lambda$3$lambda$2() {
        return SnapshotState3.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WalletVerificationComposable$lambda$9$lambda$8(WalletVerificationDuxo walletVerificationDuxo, UUID uuid, VerificationType verificationType, LifecycleAwareNavigator lifecycleAwareNavigator, RhWebIntentKey3 rhWebIntentKey3) {
        if (rhWebIntentKey3 instanceof RhWebIntentKey3.Continue) {
            walletVerificationDuxo.submit(uuid, verificationType);
        } else {
            if (!(rhWebIntentKey3 instanceof RhWebIntentKey3.Dismissed) && rhWebIntentKey3 != null) {
                throw new NoWhenBranchMatchedException();
            }
            LifecycleAwareNavigator.popBackStack$default(lifecycleAwareNavigator, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    private static final Event<WalletVerificationDuxo2> WalletVerificationComposable$lambda$0(SnapshotState4<Event<WalletVerificationDuxo2>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UUID WalletVerificationComposable$lambda$4(SnapshotState<UUID> snapshotState) {
        return snapshotState.getValue();
    }
}
