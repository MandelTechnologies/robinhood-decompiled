package com.robinhood.shared.crypto.transfer.verification.type;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.LinkAnnotation;
import androidx.compose.p011ui.text.LinkInteractionListener;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
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
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.AnnotatedStringResource;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.models.api.transfer.verification.ApiCryptoVerificationResponse;
import com.robinhood.models.api.transfer.verification.ApiCryptoVerificationResponse3;
import com.robinhood.models.api.transfer.verification.WalletType;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.CryptoTransferContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.verification.VerificationType;
import com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposable;
import com.robinhood.shared.crypto.transfer.verification.type.WalletTypeDuxo3;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableMap;

/* compiled from: WalletTypeComposable.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aS\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002²\u0006\u0012\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u008a\u0084\u0002²\u0006\n\u0010\u0017\u001a\u00020\nX\u008a\u008e\u0002"}, m3636d2 = {"WalletTypeComposable", "", "checkIfHostedInfo", "Lcom/robinhood/models/api/transfer/verification/NextStepData$CheckIfHosted;", "verificationId", "Ljava/util/UUID;", "verificationType", "Lcom/robinhood/shared/crypto/transfer/verification/VerificationType;", "onWalletTypeConfirmed", "Lkotlin/Function2;", "Lcom/robinhood/models/api/transfer/verification/WalletType;", "Lcom/robinhood/models/api/transfer/verification/ApiCryptoVerificationResponse;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/crypto/transfer/verification/type/WalletTypeDuxo;", "(Lcom/robinhood/models/api/transfer/verification/NextStepData$CheckIfHosted;Ljava/util/UUID;Lcom/robinhood/shared/crypto/transfer/verification/VerificationType;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/crypto/transfer/verification/type/WalletTypeDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-transfer_externalDebug", "viewState", "Lcom/robinhood/shared/crypto/transfer/verification/type/WalletTypeViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/crypto/transfer/verification/type/WalletTypeEvent;", "walletType"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class WalletTypeComposable {

    /* compiled from: WalletTypeComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VerificationType.values().length];
            try {
                iArr[VerificationType.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerificationType.WITHDRAWAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WalletTypeComposable$lambda$8(ApiCryptoVerificationResponse3.CheckIfHosted checkIfHosted, UUID uuid, VerificationType verificationType, Function2 function2, Modifier modifier, WalletTypeDuxo walletTypeDuxo, int i, int i2, Composer composer, int i3) {
        WalletTypeComposable(checkIfHosted, uuid, verificationType, function2, modifier, walletTypeDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WalletTypeComposable(final ApiCryptoVerificationResponse3.CheckIfHosted checkIfHostedInfo, final UUID verificationId, VerificationType verificationType, final Function2<? super WalletType, ? super ApiCryptoVerificationResponse, Unit> onWalletTypeConfirmed, Modifier modifier, WalletTypeDuxo walletTypeDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        WalletTypeDuxo walletTypeDuxo2;
        Modifier modifier3;
        int i4;
        int i5;
        WalletTypeDuxo walletTypeDuxo3;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        int i6;
        Screen.Name name;
        final WalletTypeDuxo walletTypeDuxo4;
        final Event<WalletTypeDuxo3> eventWalletTypeComposable$lambda$1;
        int i7;
        Object objRememberedValue2;
        final WalletTypeDuxo walletTypeDuxo5;
        final Modifier modifier4;
        EventConsumer<WalletTypeDuxo3> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final VerificationType verificationType2 = verificationType;
        Intrinsics.checkNotNullParameter(checkIfHostedInfo, "checkIfHostedInfo");
        Intrinsics.checkNotNullParameter(verificationId, "verificationId");
        Intrinsics.checkNotNullParameter(verificationType2, "verificationType");
        Intrinsics.checkNotNullParameter(onWalletTypeConfirmed, "onWalletTypeConfirmed");
        Composer composerStartRestartGroup = composer.startRestartGroup(1509412337);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(checkIfHostedInfo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(verificationId) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(verificationType2.ordinal()) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onWalletTypeConfirmed) ? 2048 : 1024;
        }
        int i8 = i2 & 16;
        if (i8 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    walletTypeDuxo2 = walletTypeDuxo;
                    int i9 = composerStartRestartGroup.changedInstance(walletTypeDuxo2) ? 131072 : 65536;
                    i3 |= i9;
                } else {
                    walletTypeDuxo2 = walletTypeDuxo;
                }
                i3 |= i9;
            } else {
                walletTypeDuxo2 = walletTypeDuxo;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 32) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        i4 = 0;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(WalletTypeDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposableKt$WalletTypeComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposableKt$WalletTypeComposable$$inlined$duxo$1.1
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
                        WalletTypeDuxo walletTypeDuxo6 = (WalletTypeDuxo) baseDuxo;
                        i5 = i3 & (-458753);
                        walletTypeDuxo3 = walletTypeDuxo6;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1509412337, i5, -1, "com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposable (WalletTypeComposable.kt:58)");
                    }
                    int i10 = i5;
                    final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(walletTypeDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(walletTypeDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    Object[] objArr = new Object[i4];
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return WalletTypeComposable.WalletTypeComposable$lambda$3$lambda$2();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                    UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    i6 = WhenMappings.$EnumSwitchMapping$0[verificationType2.ordinal()];
                    if (i6 == 1) {
                        name = Screen.Name.CRYPTO_TRANSFER_RECEIVE_WALLET_SELECTION;
                    } else {
                        if (i6 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        name = Screen.Name.CRYPTO_TRANSFER_SEND_WALLET_SELECTION;
                    }
                    UserInteractionEventDescriptor userInteractionEventDescriptorCopy$default = UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, new Screen(name, null, null, null, 14, null), null, null, null, null, 61, null);
                    int i11 = i4;
                    final Modifier modifier5 = modifier3;
                    walletTypeDuxo4 = walletTypeDuxo3;
                    Function2<Composer, Integer, Unit> function2 = new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposableKt.WalletTypeComposable.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i12) {
                            if ((i12 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1869945308, i12, -1, "com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposable.<anonymous> (WalletTypeComposable.kt:73)");
                            }
                            final Navigator navigator = (Navigator) composer2.consume(LocalNavigator.getLocalNavigator());
                            final Context context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(modifier5, null, 1, null);
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1934978833, true, new AnonymousClass1(context, walletTypeDuxo4, verificationId, verificationType2, snapshotState, snapshotState4CollectAsStateWithLifecycle), composer2, 54);
                            final SnapshotState4<WalletTypeViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                            final SnapshotState<WalletType> snapshotState2 = snapshotState;
                            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierLogScreenTransitions$default, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(856518852, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposableKt.WalletTypeComposable.1.2

                                /* compiled from: WalletTypeComposable.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposableKt$WalletTypeComposable$1$2$1, reason: invalid class name */
                                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                                    final /* synthetic */ Context $context;
                                    final /* synthetic */ Navigator $navigator;
                                    final /* synthetic */ SnapshotState4<WalletTypeViewState> $viewState$delegate;
                                    final /* synthetic */ SnapshotState<WalletType> $walletType$delegate;

                                    AnonymousClass1(Navigator navigator, Context context, SnapshotState<WalletType> snapshotState, SnapshotState4<WalletTypeViewState> snapshotState4) {
                                        this.$navigator = navigator;
                                        this.$context = context;
                                        this.$walletType$delegate = snapshotState;
                                        this.$viewState$delegate = snapshotState4;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
                                        invoke(composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
                                        boolean z;
                                        BentoBaseRowState.Text annotated;
                                        if ((i & 3) == 2 && composer.getSkipping()) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1182253652, i, -1, "com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposable.<anonymous>.<anonymous>.<anonymous> (WalletTypeComposable.kt:80)");
                                        }
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i2 = BentoTheme.$stable;
                                        Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM());
                                        final Navigator navigator = this.$navigator;
                                        final Context context = this.$context;
                                        final SnapshotState<WalletType> snapshotState = this.$walletType$delegate;
                                        SnapshotState4<WalletTypeViewState> snapshotState4 = this.$viewState$delegate;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM21618defaultFillMaxWidthPadding3ABfNKs);
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                        if (composer.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer.startReusableNode();
                                        if (composer.getInserting()) {
                                            composer.createNode(constructor);
                                        } else {
                                            composer.useNode();
                                        }
                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                        Column6 column6 = Column6.INSTANCE;
                                        final String strStringResource = StringResources_androidKt.stringResource(C37934R.string.wallet_type_learn_more_url, composer, 0);
                                        Modifier modifierWithBentoPlaceholder$default = LocalShowPlaceholder.withBentoPlaceholder$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), false, null, 3, null);
                                        StringResource title = WalletTypeComposable.WalletTypeComposable$lambda$0(snapshotState4).getTitle();
                                        int i3 = StringResource.$stable;
                                        BentoText2.m20747BentoText38GnDrw(StringResource2.getString(title, composer, i3), modifierWithBentoPlaceholder$default, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall(), composer, 0, 0, 8188);
                                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM()), composer, 0);
                                        int i4 = C37934R.string.wallet_type_centralized_subtitle;
                                        long jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU();
                                        composer.startReplaceGroup(-1746271574);
                                        boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context) | composer.changed(strStringResource);
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new LinkInteractionListener() { // from class: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposableKt$WalletTypeComposable$1$2$1$1$secondaryTextForCentralizedPlatform$1$1
                                                @Override // androidx.compose.p011ui.text.LinkInteractionListener
                                                public final void onClick(LinkAnnotation link) {
                                                    Intrinsics.checkNotNullParameter(link, "link");
                                                    Navigators3.showHelpCenterWebViewFragment(navigator, context, strStringResource);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        composer.endReplaceGroup();
                                        AnnotatedString annotatedStringM22062annotatedStringResourceV2eopBjH0 = AnnotatedStringResource.m22062annotatedStringResourceV2eopBjH0(i4, jM21426getFg20d7_KjU, 0L, (LinkInteractionListener) objRememberedValue, composer, 0, 4);
                                        Composer composer2 = composer;
                                        Modifier modifierWithBentoPlaceholder$default2 = LocalShowPlaceholder.withBentoPlaceholder$default(companion, false, null, 3, null);
                                        boolean interfaceEnabled = WalletTypeComposable.WalletTypeComposable$lambda$0(snapshotState4).getInterfaceEnabled();
                                        BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
                                        BentoSelectionRowState bentoSelectionRowState = new BentoSelectionRowState(type2, StringResources_androidKt.stringResource(C37934R.string.wallet_type_centralized_title, composer2, 0), WalletTypeComposable.WalletTypeComposable$lambda$4(snapshotState) == WalletType.HOSTED, (BentoBaseRowState.Text) new BentoBaseRowState.Text.Annotated(annotatedStringM22062annotatedStringResourceV2eopBjH0, null, 2, null), interfaceEnabled, false, (BentoSelectionRowState.IconPosition) null, true, false, (ImmutableMap) null, (Function0) null, 1888, (DefaultConstructorMarker) null);
                                        composer2.startReplaceGroup(5004770);
                                        boolean zChanged = composer2.changed(snapshotState);
                                        Object objRememberedValue2 = composer2.rememberedValue();
                                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposableKt$WalletTypeComposable$1$2$1$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return WalletTypeComposable.C385621.AnonymousClass2.AnonymousClass1.invoke$lambda$6$lambda$2$lambda$1(snapshotState);
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer2.endReplaceGroup();
                                        int i5 = BentoSelectionRowState.$stable;
                                        BentoSelectionRow2.BentoSelectionRow(modifierWithBentoPlaceholder$default2, bentoSelectionRowState, (Function0) objRememberedValue2, composer2, i5 << 3, 0);
                                        CharSequence text = StringResources6.getText(WalletTypeComposable.WalletTypeComposable$lambda$0(snapshotState4).getDecentralizedSubtitle(), composer2, i3);
                                        Modifier modifierWithBentoPlaceholder$default3 = LocalShowPlaceholder.withBentoPlaceholder$default(companion, false, null, 3, null);
                                        boolean decentralizedOptionEnabled = WalletTypeComposable.WalletTypeComposable$lambda$0(snapshotState4).getDecentralizedOptionEnabled();
                                        String strStringResource2 = StringResources_androidKt.stringResource(C37934R.string.wallet_type_decentralized_title, composer2, 0);
                                        composer2.startReplaceGroup(-1948776801);
                                        if (text instanceof Spanned) {
                                            long jM21426getFg20d7_KjU2 = bentoTheme.getColors(composer2, i2).m21426getFg20d7_KjU();
                                            composer2.startReplaceGroup(-1746271574);
                                            boolean zChangedInstance2 = composer2.changedInstance(navigator) | composer2.changedInstance(context) | composer2.changed(strStringResource);
                                            Object objRememberedValue3 = composer2.rememberedValue();
                                            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue3 = new LinkInteractionListener() { // from class: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposableKt$WalletTypeComposable$1$2$1$1$annotatedSecondaryTextForDecentralizedPlatform$1$1
                                                    @Override // androidx.compose.p011ui.text.LinkInteractionListener
                                                    public final void onClick(LinkAnnotation link) {
                                                        Intrinsics.checkNotNullParameter(link, "link");
                                                        Navigators3.showHelpCenterWebViewFragment(navigator, context, strStringResource);
                                                    }
                                                };
                                                composer2.updateRememberedValue(objRememberedValue3);
                                            }
                                            composer2.endReplaceGroup();
                                            z = false;
                                            composer2 = composer;
                                            annotated = new BentoBaseRowState.Text.Annotated(AnnotatedStringResource.m22063annotatedStringResourceV2eopBjH0(text, jM21426getFg20d7_KjU2, 0L, (LinkInteractionListener) objRememberedValue3, composer, 0, 4), null, 2, null);
                                        } else {
                                            annotated = new BentoBaseRowState.Text.Plain(text.toString());
                                            z = false;
                                        }
                                        composer2.endReplaceGroup();
                                        BentoSelectionRowState bentoSelectionRowState2 = new BentoSelectionRowState(type2, strStringResource2, WalletTypeComposable.WalletTypeComposable$lambda$4(snapshotState) == WalletType.UNHOSTED ? true : z, annotated, decentralizedOptionEnabled, false, (BentoSelectionRowState.IconPosition) null, true, false, (ImmutableMap) null, (Function0) null, 1888, (DefaultConstructorMarker) null);
                                        composer2.startReplaceGroup(5004770);
                                        boolean zChanged2 = composer2.changed(snapshotState);
                                        Object objRememberedValue4 = composer2.rememberedValue();
                                        if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposableKt$WalletTypeComposable$1$2$1$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return WalletTypeComposable.C385621.AnonymousClass2.AnonymousClass1.invoke$lambda$6$lambda$5$lambda$4(snapshotState);
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue4);
                                        }
                                        composer2.endReplaceGroup();
                                        BentoSelectionRow2.BentoSelectionRow(modifierWithBentoPlaceholder$default3, bentoSelectionRowState2, (Function0) objRememberedValue4, composer2, i5 << 3, 0);
                                        composer.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$6$lambda$2$lambda$1(SnapshotState snapshotState) {
                                        WalletTypeComposable.WalletTypeComposable$lambda$5(snapshotState, WalletType.HOSTED);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$6$lambda$5$lambda$4(SnapshotState snapshotState) {
                                        WalletTypeComposable.WalletTypeComposable$lambda$5(snapshotState, WalletType.UNHOSTED);
                                        return Unit.INSTANCE;
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                                    invoke(boxScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer3, int i13) {
                                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                    if ((i13 & 17) == 16 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(856518852, i13, -1, "com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposable.<anonymous>.<anonymous> (WalletTypeComposable.kt:79)");
                                    }
                                    LocalShowPlaceholder.Loadable(WalletTypeComposable.WalletTypeComposable$lambda$0(snapshotState4).getShimmer(), null, null, ComposableLambda3.rememberComposableLambda(1182253652, true, new AnonymousClass1(navigator, context, snapshotState2, snapshotState4), composer3, 54), composer3, 3072, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 3504, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: WalletTypeComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposableKt$WalletTypeComposable$1$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                            final /* synthetic */ Context $context;
                            final /* synthetic */ WalletTypeDuxo $duxo;
                            final /* synthetic */ UUID $verificationId;
                            final /* synthetic */ VerificationType $verificationType;
                            final /* synthetic */ SnapshotState4<WalletTypeViewState> $viewState$delegate;
                            final /* synthetic */ SnapshotState<WalletType> $walletType$delegate;

                            AnonymousClass1(Context context, WalletTypeDuxo walletTypeDuxo, UUID uuid, VerificationType verificationType, SnapshotState<WalletType> snapshotState, SnapshotState4<WalletTypeViewState> snapshotState4) {
                                this.$context = context;
                                this.$duxo = walletTypeDuxo;
                                this.$verificationId = uuid;
                                this.$verificationType = verificationType;
                                this.$walletType$delegate = snapshotState;
                                this.$viewState$delegate = snapshotState4;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                                invoke(bentoButtonBar3, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
                                CryptoTransferContext crypto_transfer_context;
                                Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                if ((i & 17) == 16 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1934978833, i, -1, "com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposable.<anonymous>.<anonymous> (WalletTypeComposable.kt:152)");
                                }
                                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                                boolean loading = WalletTypeComposable.WalletTypeComposable$lambda$0(this.$viewState$delegate).getLoading();
                                CryptoTransferContext cryptoTransferContextCopy = null;
                                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                                UserInteractionEventData.Action action = UserInteractionEventData.Action.CONTINUE;
                                Component component = new Component(Component.ComponentType.BUTTON, null, null, 6, null);
                                com.robinhood.rosetta.eventlogging.Context context = userInteractionEventDescriptor.getContext();
                                if (context != null && (crypto_transfer_context = context.getCrypto_transfer_context()) != null) {
                                    cryptoTransferContextCopy = crypto_transfer_context.copy((16367 & 1) != 0 ? crypto_transfer_context.currency_id : null, (16367 & 2) != 0 ? crypto_transfer_context.session_id : null, (16367 & 4) != 0 ? crypto_transfer_context.withdrawal_id : null, (16367 & 8) != 0 ? crypto_transfer_context.amount : 0.0d, (16367 & 16) != 0 ? crypto_transfer_context.error_code : null, (16367 & 32) != 0 ? crypto_transfer_context.title : null, (16367 & 64) != 0 ? crypto_transfer_context.completed_kyc : null, (16367 & 128) != 0 ? crypto_transfer_context.completed_mfa : null, (16367 & 256) != 0 ? crypto_transfer_context.security_context : null, (16367 & 512) != 0 ? crypto_transfer_context.transfer_id : null, (16367 & 1024) != 0 ? crypto_transfer_context.party_selection : null, (16367 & 2048) != 0 ? crypto_transfer_context.wallet_selection : WalletTypeComposable.WalletTypeComposable$lambda$4(this.$walletType$delegate).getServerValue(), (16367 & 4096) != 0 ? crypto_transfer_context.error_message : null, (16367 & 8192) != 0 ? crypto_transfer_context.unknownFields() : null);
                                }
                                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, action, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cryptoTransferContextCopy, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -257, -1, -1, -1, 16383, null), component, null, 35, null), false, false, false, true, false, null, 110, null);
                                String strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_continue_button_label, composer, 0);
                                String strStringResource2 = StringResources_androidKt.stringResource(C37934R.string.wallet_type_disclosure, composer, 0);
                                String strStringResource3 = StringResources_androidKt.stringResource(C37934R.string.wallet_type_disclosure_privacy_notice, composer, 0);
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(this.$context);
                                final Context context2 = this.$context;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposableKt$WalletTypeComposable$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return WalletTypeComposable.C385621.AnonymousClass1.invoke$lambda$1$lambda$0(context2);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                Function0 function0 = (Function0) objRememberedValue;
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(-1224400529);
                                boolean zChangedInstance2 = composer.changedInstance(this.$duxo) | composer.changedInstance(this.$verificationId) | composer.changed(this.$verificationType.ordinal()) | composer.changed(this.$walletType$delegate);
                                final WalletTypeDuxo walletTypeDuxo = this.$duxo;
                                final UUID uuid = this.$verificationId;
                                final VerificationType verificationType = this.$verificationType;
                                final SnapshotState<WalletType> snapshotState = this.$walletType$delegate;
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposableKt$WalletTypeComposable$1$1$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return WalletTypeComposable.C385621.AnonymousClass1.invoke$lambda$3$lambda$2(walletTypeDuxo, uuid, verificationType, snapshotState);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                BentoButtonBar2.BentoButtonBar(modifierAutoLogEvents$default, strStringResource2, strStringResource3, false, function0, null, (Function0) objRememberedValue2, strStringResource, loading, null, false, null, null, false, null, false, composer, 0, 0, 65064);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$3$lambda$2(WalletTypeDuxo walletTypeDuxo, UUID uuid, VerificationType verificationType, SnapshotState snapshotState) {
                                walletTypeDuxo.submit(uuid, verificationType, WalletTypeComposable.WalletTypeComposable$lambda$4(snapshotState));
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(Context context) {
                                WebUtils.viewUrl(context, C37934R.string.wallet_type_disclosure_privacy_notice_url, C20690R.attr.colorForeground1);
                                return Unit.INSTANCE;
                            }
                        }
                    };
                    verificationType2 = verificationType2;
                    AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptorCopy$default, ComposableLambda3.rememberComposableLambda(1869945308, true, function2, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                    eventWalletTypeComposable$lambda$1 = WalletTypeComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventWalletTypeComposable$lambda$1 != null && (eventWalletTypeComposable$lambda$1.getData() instanceof WalletTypeDuxo3.Success) && (eventConsumerInvoke = eventWalletTypeComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke.consume(eventWalletTypeComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposableKt$WalletTypeComposable$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m25204invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m25204invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                onWalletTypeConfirmed.invoke(WalletTypeComposable.WalletTypeComposable$lambda$4(snapshotState), ((WalletTypeDuxo3.Success) eventWalletTypeComposable$lambda$1.getData()).getNext());
                            }
                        });
                    }
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    i7 = (composerStartRestartGroup.changedInstance(walletTypeDuxo4) ? 1 : 0) | (composerStartRestartGroup.changedInstance(checkIfHostedInfo) ? 1 : 0) | ((i10 & 896) != 256 ? i11 : 1);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (i7 != 0 || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new WalletTypeComposable4(walletTypeDuxo4, checkIfHostedInfo, verificationType2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(checkIfHostedInfo, verificationType2, (Function2) objRememberedValue2, composerStartRestartGroup, (i10 & 14) | ((i10 >> 3) & 112));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    walletTypeDuxo5 = walletTypeDuxo4;
                    modifier4 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    modifier3 = modifier2;
                }
                i4 = 0;
                i5 = i3;
                walletTypeDuxo3 = walletTypeDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i102 = i5;
                final SnapshotState4<WalletTypeViewState> snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(walletTypeDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(walletTypeDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Object[] objArr2 = new Object[i4];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                i6 = WhenMappings.$EnumSwitchMapping$0[verificationType2.ordinal()];
                if (i6 == 1) {
                }
                UserInteractionEventDescriptor userInteractionEventDescriptorCopy$default2 = UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, new Screen(name, null, null, null, 14, null), null, null, null, null, 61, null);
                int i112 = i4;
                final Modifier modifier52 = modifier3;
                walletTypeDuxo4 = walletTypeDuxo3;
                Function2<Composer, Integer, Unit> function22 = new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposableKt.WalletTypeComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i12) {
                        if ((i12 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1869945308, i12, -1, "com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposable.<anonymous> (WalletTypeComposable.kt:73)");
                        }
                        final Navigator navigator = (Navigator) composer2.consume(LocalNavigator.getLocalNavigator());
                        final Context context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(modifier52, null, 1, null);
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1934978833, true, new AnonymousClass1(context, walletTypeDuxo4, verificationId, verificationType2, snapshotState, snapshotState4CollectAsStateWithLifecycle3), composer2, 54);
                        final SnapshotState4<WalletTypeViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle3;
                        final SnapshotState<WalletType> snapshotState2 = snapshotState;
                        BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierLogScreenTransitions$default, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(856518852, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposableKt.WalletTypeComposable.1.2

                            /* compiled from: WalletTypeComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposableKt$WalletTypeComposable$1$2$1, reason: invalid class name */
                            static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ Context $context;
                                final /* synthetic */ Navigator $navigator;
                                final /* synthetic */ SnapshotState4<WalletTypeViewState> $viewState$delegate;
                                final /* synthetic */ SnapshotState<WalletType> $walletType$delegate;

                                AnonymousClass1(Navigator navigator, Context context, SnapshotState<WalletType> snapshotState, SnapshotState4<WalletTypeViewState> snapshotState4) {
                                    this.$navigator = navigator;
                                    this.$context = context;
                                    this.$walletType$delegate = snapshotState;
                                    this.$viewState$delegate = snapshotState4;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
                                    invoke(composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
                                    boolean z;
                                    BentoBaseRowState.Text annotated;
                                    if ((i & 3) == 2 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1182253652, i, -1, "com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposable.<anonymous>.<anonymous>.<anonymous> (WalletTypeComposable.kt:80)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i2 = BentoTheme.$stable;
                                    Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM());
                                    final Navigator navigator = this.$navigator;
                                    final Context context = this.$context;
                                    final SnapshotState snapshotState = this.$walletType$delegate;
                                    SnapshotState4<WalletTypeViewState> snapshotState4 = this.$viewState$delegate;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM21618defaultFillMaxWidthPadding3ABfNKs);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                    if (composer.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer.startReusableNode();
                                    if (composer.getInserting()) {
                                        composer.createNode(constructor);
                                    } else {
                                        composer.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    final String strStringResource = StringResources_androidKt.stringResource(C37934R.string.wallet_type_learn_more_url, composer, 0);
                                    Modifier modifierWithBentoPlaceholder$default = LocalShowPlaceholder.withBentoPlaceholder$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), false, null, 3, null);
                                    StringResource title = WalletTypeComposable.WalletTypeComposable$lambda$0(snapshotState4).getTitle();
                                    int i3 = StringResource.$stable;
                                    BentoText2.m20747BentoText38GnDrw(StringResource2.getString(title, composer, i3), modifierWithBentoPlaceholder$default, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall(), composer, 0, 0, 8188);
                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM()), composer, 0);
                                    int i4 = C37934R.string.wallet_type_centralized_subtitle;
                                    long jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU();
                                    composer.startReplaceGroup(-1746271574);
                                    boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context) | composer.changed(strStringResource);
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new LinkInteractionListener() { // from class: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposableKt$WalletTypeComposable$1$2$1$1$secondaryTextForCentralizedPlatform$1$1
                                            @Override // androidx.compose.p011ui.text.LinkInteractionListener
                                            public final void onClick(LinkAnnotation link) {
                                                Intrinsics.checkNotNullParameter(link, "link");
                                                Navigators3.showHelpCenterWebViewFragment(navigator, context, strStringResource);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    AnnotatedString annotatedStringM22062annotatedStringResourceV2eopBjH0 = AnnotatedStringResource.m22062annotatedStringResourceV2eopBjH0(i4, jM21426getFg20d7_KjU, 0L, (LinkInteractionListener) objRememberedValue, composer, 0, 4);
                                    Composer composer2 = composer;
                                    Modifier modifierWithBentoPlaceholder$default2 = LocalShowPlaceholder.withBentoPlaceholder$default(companion, false, null, 3, null);
                                    boolean interfaceEnabled = WalletTypeComposable.WalletTypeComposable$lambda$0(snapshotState4).getInterfaceEnabled();
                                    BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
                                    BentoSelectionRowState bentoSelectionRowState = new BentoSelectionRowState(type2, StringResources_androidKt.stringResource(C37934R.string.wallet_type_centralized_title, composer2, 0), WalletTypeComposable.WalletTypeComposable$lambda$4(snapshotState) == WalletType.HOSTED, (BentoBaseRowState.Text) new BentoBaseRowState.Text.Annotated(annotatedStringM22062annotatedStringResourceV2eopBjH0, null, 2, null), interfaceEnabled, false, (BentoSelectionRowState.IconPosition) null, true, false, (ImmutableMap) null, (Function0) null, 1888, (DefaultConstructorMarker) null);
                                    composer2.startReplaceGroup(5004770);
                                    boolean zChanged = composer2.changed(snapshotState);
                                    Object objRememberedValue2 = composer2.rememberedValue();
                                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposableKt$WalletTypeComposable$1$2$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return WalletTypeComposable.C385621.AnonymousClass2.AnonymousClass1.invoke$lambda$6$lambda$2$lambda$1(snapshotState);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer2.endReplaceGroup();
                                    int i5 = BentoSelectionRowState.$stable;
                                    BentoSelectionRow2.BentoSelectionRow(modifierWithBentoPlaceholder$default2, bentoSelectionRowState, (Function0) objRememberedValue2, composer2, i5 << 3, 0);
                                    CharSequence text = StringResources6.getText(WalletTypeComposable.WalletTypeComposable$lambda$0(snapshotState4).getDecentralizedSubtitle(), composer2, i3);
                                    Modifier modifierWithBentoPlaceholder$default3 = LocalShowPlaceholder.withBentoPlaceholder$default(companion, false, null, 3, null);
                                    boolean decentralizedOptionEnabled = WalletTypeComposable.WalletTypeComposable$lambda$0(snapshotState4).getDecentralizedOptionEnabled();
                                    String strStringResource2 = StringResources_androidKt.stringResource(C37934R.string.wallet_type_decentralized_title, composer2, 0);
                                    composer2.startReplaceGroup(-1948776801);
                                    if (text instanceof Spanned) {
                                        long jM21426getFg20d7_KjU2 = bentoTheme.getColors(composer2, i2).m21426getFg20d7_KjU();
                                        composer2.startReplaceGroup(-1746271574);
                                        boolean zChangedInstance2 = composer2.changedInstance(navigator) | composer2.changedInstance(context) | composer2.changed(strStringResource);
                                        Object objRememberedValue3 = composer2.rememberedValue();
                                        if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = new LinkInteractionListener() { // from class: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposableKt$WalletTypeComposable$1$2$1$1$annotatedSecondaryTextForDecentralizedPlatform$1$1
                                                @Override // androidx.compose.p011ui.text.LinkInteractionListener
                                                public final void onClick(LinkAnnotation link) {
                                                    Intrinsics.checkNotNullParameter(link, "link");
                                                    Navigators3.showHelpCenterWebViewFragment(navigator, context, strStringResource);
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue3);
                                        }
                                        composer2.endReplaceGroup();
                                        z = false;
                                        composer2 = composer;
                                        annotated = new BentoBaseRowState.Text.Annotated(AnnotatedStringResource.m22063annotatedStringResourceV2eopBjH0(text, jM21426getFg20d7_KjU2, 0L, (LinkInteractionListener) objRememberedValue3, composer, 0, 4), null, 2, null);
                                    } else {
                                        annotated = new BentoBaseRowState.Text.Plain(text.toString());
                                        z = false;
                                    }
                                    composer2.endReplaceGroup();
                                    BentoSelectionRowState bentoSelectionRowState2 = new BentoSelectionRowState(type2, strStringResource2, WalletTypeComposable.WalletTypeComposable$lambda$4(snapshotState) == WalletType.UNHOSTED ? true : z, annotated, decentralizedOptionEnabled, false, (BentoSelectionRowState.IconPosition) null, true, false, (ImmutableMap) null, (Function0) null, 1888, (DefaultConstructorMarker) null);
                                    composer2.startReplaceGroup(5004770);
                                    boolean zChanged2 = composer2.changed(snapshotState);
                                    Object objRememberedValue4 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposableKt$WalletTypeComposable$1$2$1$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return WalletTypeComposable.C385621.AnonymousClass2.AnonymousClass1.invoke$lambda$6$lambda$5$lambda$4(snapshotState);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue4);
                                    }
                                    composer2.endReplaceGroup();
                                    BentoSelectionRow2.BentoSelectionRow(modifierWithBentoPlaceholder$default3, bentoSelectionRowState2, (Function0) objRememberedValue4, composer2, i5 << 3, 0);
                                    composer.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$6$lambda$2$lambda$1(SnapshotState snapshotState) {
                                    WalletTypeComposable.WalletTypeComposable$lambda$5(snapshotState, WalletType.HOSTED);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$6$lambda$5$lambda$4(SnapshotState snapshotState) {
                                    WalletTypeComposable.WalletTypeComposable$lambda$5(snapshotState, WalletType.UNHOSTED);
                                    return Unit.INSTANCE;
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                                invoke(boxScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer3, int i13) {
                                Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                if ((i13 & 17) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(856518852, i13, -1, "com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposable.<anonymous>.<anonymous> (WalletTypeComposable.kt:79)");
                                }
                                LocalShowPlaceholder.Loadable(WalletTypeComposable.WalletTypeComposable$lambda$0(snapshotState4).getShimmer(), null, null, ComposableLambda3.rememberComposableLambda(1182253652, true, new AnonymousClass1(navigator, context, snapshotState2, snapshotState4), composer3, 54), composer3, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 3504, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: WalletTypeComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposableKt$WalletTypeComposable$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                        final /* synthetic */ Context $context;
                        final /* synthetic */ WalletTypeDuxo $duxo;
                        final /* synthetic */ UUID $verificationId;
                        final /* synthetic */ VerificationType $verificationType;
                        final /* synthetic */ SnapshotState4<WalletTypeViewState> $viewState$delegate;
                        final /* synthetic */ SnapshotState<WalletType> $walletType$delegate;

                        AnonymousClass1(Context context, WalletTypeDuxo walletTypeDuxo, UUID uuid, VerificationType verificationType, SnapshotState<WalletType> snapshotState, SnapshotState4<WalletTypeViewState> snapshotState4) {
                            this.$context = context;
                            this.$duxo = walletTypeDuxo;
                            this.$verificationId = uuid;
                            this.$verificationType = verificationType;
                            this.$walletType$delegate = snapshotState;
                            this.$viewState$delegate = snapshotState4;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                            invoke(bentoButtonBar3, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
                            CryptoTransferContext crypto_transfer_context;
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i & 17) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1934978833, i, -1, "com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposable.<anonymous>.<anonymous> (WalletTypeComposable.kt:152)");
                            }
                            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                            boolean loading = WalletTypeComposable.WalletTypeComposable$lambda$0(this.$viewState$delegate).getLoading();
                            CryptoTransferContext cryptoTransferContextCopy = null;
                            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                            UserInteractionEventData.Action action = UserInteractionEventData.Action.CONTINUE;
                            Component component = new Component(Component.ComponentType.BUTTON, null, null, 6, null);
                            com.robinhood.rosetta.eventlogging.Context context = userInteractionEventDescriptor.getContext();
                            if (context != null && (crypto_transfer_context = context.getCrypto_transfer_context()) != null) {
                                cryptoTransferContextCopy = crypto_transfer_context.copy((16367 & 1) != 0 ? crypto_transfer_context.currency_id : null, (16367 & 2) != 0 ? crypto_transfer_context.session_id : null, (16367 & 4) != 0 ? crypto_transfer_context.withdrawal_id : null, (16367 & 8) != 0 ? crypto_transfer_context.amount : 0.0d, (16367 & 16) != 0 ? crypto_transfer_context.error_code : null, (16367 & 32) != 0 ? crypto_transfer_context.title : null, (16367 & 64) != 0 ? crypto_transfer_context.completed_kyc : null, (16367 & 128) != 0 ? crypto_transfer_context.completed_mfa : null, (16367 & 256) != 0 ? crypto_transfer_context.security_context : null, (16367 & 512) != 0 ? crypto_transfer_context.transfer_id : null, (16367 & 1024) != 0 ? crypto_transfer_context.party_selection : null, (16367 & 2048) != 0 ? crypto_transfer_context.wallet_selection : WalletTypeComposable.WalletTypeComposable$lambda$4(this.$walletType$delegate).getServerValue(), (16367 & 4096) != 0 ? crypto_transfer_context.error_message : null, (16367 & 8192) != 0 ? crypto_transfer_context.unknownFields() : null);
                            }
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, action, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cryptoTransferContextCopy, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -257, -1, -1, -1, 16383, null), component, null, 35, null), false, false, false, true, false, null, 110, null);
                            String strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_continue_button_label, composer, 0);
                            String strStringResource2 = StringResources_androidKt.stringResource(C37934R.string.wallet_type_disclosure, composer, 0);
                            String strStringResource3 = StringResources_androidKt.stringResource(C37934R.string.wallet_type_disclosure_privacy_notice, composer, 0);
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(this.$context);
                            final Context context2 = this.$context;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposableKt$WalletTypeComposable$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return WalletTypeComposable.C385621.AnonymousClass1.invoke$lambda$1$lambda$0(context2);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            Function0 function0 = (Function0) objRememberedValue;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(-1224400529);
                            boolean zChangedInstance2 = composer.changedInstance(this.$duxo) | composer.changedInstance(this.$verificationId) | composer.changed(this.$verificationType.ordinal()) | composer.changed(this.$walletType$delegate);
                            final WalletTypeDuxo walletTypeDuxo = this.$duxo;
                            final UUID uuid = this.$verificationId;
                            final VerificationType verificationType = this.$verificationType;
                            final SnapshotState snapshotState = this.$walletType$delegate;
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposableKt$WalletTypeComposable$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return WalletTypeComposable.C385621.AnonymousClass1.invoke$lambda$3$lambda$2(walletTypeDuxo, uuid, verificationType, snapshotState);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            BentoButtonBar2.BentoButtonBar(modifierAutoLogEvents$default, strStringResource2, strStringResource3, false, function0, null, (Function0) objRememberedValue2, strStringResource, loading, null, false, null, null, false, null, false, composer, 0, 0, 65064);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$3$lambda$2(WalletTypeDuxo walletTypeDuxo, UUID uuid, VerificationType verificationType, SnapshotState snapshotState) {
                            walletTypeDuxo.submit(uuid, verificationType, WalletTypeComposable.WalletTypeComposable$lambda$4(snapshotState));
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(Context context) {
                            WebUtils.viewUrl(context, C37934R.string.wallet_type_disclosure_privacy_notice_url, C20690R.attr.colorForeground1);
                            return Unit.INSTANCE;
                        }
                    }
                };
                verificationType2 = verificationType2;
                AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptorCopy$default2, ComposableLambda3.rememberComposableLambda(1869945308, true, function22, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                eventWalletTypeComposable$lambda$1 = WalletTypeComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventWalletTypeComposable$lambda$1 != null) {
                    eventConsumerInvoke.consume(eventWalletTypeComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposableKt$WalletTypeComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25204invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25204invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            onWalletTypeConfirmed.invoke(WalletTypeComposable.WalletTypeComposable$lambda$4(snapshotState), ((WalletTypeDuxo3.Success) eventWalletTypeComposable$lambda$1.getData()).getNext());
                        }
                    });
                }
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                i7 = (composerStartRestartGroup.changedInstance(walletTypeDuxo4) ? 1 : 0) | (composerStartRestartGroup.changedInstance(checkIfHostedInfo) ? 1 : 0) | ((i102 & 896) != 256 ? i112 : 1);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (i7 != 0) {
                    objRememberedValue2 = new WalletTypeComposable4(walletTypeDuxo4, checkIfHostedInfo, verificationType2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(checkIfHostedInfo, verificationType2, (Function2) objRememberedValue2, composerStartRestartGroup, (i102 & 14) | ((i102 >> 3) & 112));
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    walletTypeDuxo5 = walletTypeDuxo4;
                    modifier4 = modifier52;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                walletTypeDuxo5 = walletTypeDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return WalletTypeComposable.WalletTypeComposable$lambda$8(checkIfHostedInfo, verificationId, verificationType2, onWalletTypeConfirmed, modifier4, walletTypeDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
        if ((74899 & i3) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i8 == 0) {
                }
                if ((i2 & 32) == 0) {
                    i4 = 0;
                    i5 = i3;
                    walletTypeDuxo3 = walletTypeDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i1022 = i5;
                final SnapshotState4<WalletTypeViewState> snapshotState4CollectAsStateWithLifecycle32 = FlowExtKt.collectAsStateWithLifecycle(walletTypeDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle222 = FlowExtKt.collectAsStateWithLifecycle(walletTypeDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Object[] objArr22 = new Object[i4];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr22, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                UserInteractionEventDescriptor userInteractionEventDescriptor22 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                i6 = WhenMappings.$EnumSwitchMapping$0[verificationType2.ordinal()];
                if (i6 == 1) {
                }
                UserInteractionEventDescriptor userInteractionEventDescriptorCopy$default22 = UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor22, null, new Screen(name, null, null, null, 14, null), null, null, null, null, 61, null);
                int i1122 = i4;
                final Modifier modifier522 = modifier3;
                walletTypeDuxo4 = walletTypeDuxo3;
                Function2<Composer, Integer, Unit> function222 = new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposableKt.WalletTypeComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i12) {
                        if ((i12 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1869945308, i12, -1, "com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposable.<anonymous> (WalletTypeComposable.kt:73)");
                        }
                        final Navigator navigator = (Navigator) composer2.consume(LocalNavigator.getLocalNavigator());
                        final Context context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(modifier522, null, 1, null);
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1934978833, true, new AnonymousClass1(context, walletTypeDuxo4, verificationId, verificationType2, snapshotState, snapshotState4CollectAsStateWithLifecycle32), composer2, 54);
                        final SnapshotState4<WalletTypeViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle32;
                        final SnapshotState<WalletType> snapshotState2 = snapshotState;
                        BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierLogScreenTransitions$default, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(856518852, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposableKt.WalletTypeComposable.1.2

                            /* compiled from: WalletTypeComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposableKt$WalletTypeComposable$1$2$1, reason: invalid class name */
                            static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ Context $context;
                                final /* synthetic */ Navigator $navigator;
                                final /* synthetic */ SnapshotState4<WalletTypeViewState> $viewState$delegate;
                                final /* synthetic */ SnapshotState<WalletType> $walletType$delegate;

                                AnonymousClass1(Navigator navigator, Context context, SnapshotState<WalletType> snapshotState, SnapshotState4<WalletTypeViewState> snapshotState4) {
                                    this.$navigator = navigator;
                                    this.$context = context;
                                    this.$walletType$delegate = snapshotState;
                                    this.$viewState$delegate = snapshotState4;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
                                    invoke(composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
                                    boolean z;
                                    BentoBaseRowState.Text annotated;
                                    if ((i & 3) == 2 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1182253652, i, -1, "com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposable.<anonymous>.<anonymous>.<anonymous> (WalletTypeComposable.kt:80)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i2 = BentoTheme.$stable;
                                    Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM());
                                    final Navigator navigator = this.$navigator;
                                    final Context context = this.$context;
                                    final SnapshotState snapshotState = this.$walletType$delegate;
                                    SnapshotState4<WalletTypeViewState> snapshotState4 = this.$viewState$delegate;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM21618defaultFillMaxWidthPadding3ABfNKs);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                    if (composer.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer.startReusableNode();
                                    if (composer.getInserting()) {
                                        composer.createNode(constructor);
                                    } else {
                                        composer.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    final String strStringResource = StringResources_androidKt.stringResource(C37934R.string.wallet_type_learn_more_url, composer, 0);
                                    Modifier modifierWithBentoPlaceholder$default = LocalShowPlaceholder.withBentoPlaceholder$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), false, null, 3, null);
                                    StringResource title = WalletTypeComposable.WalletTypeComposable$lambda$0(snapshotState4).getTitle();
                                    int i3 = StringResource.$stable;
                                    BentoText2.m20747BentoText38GnDrw(StringResource2.getString(title, composer, i3), modifierWithBentoPlaceholder$default, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall(), composer, 0, 0, 8188);
                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM()), composer, 0);
                                    int i4 = C37934R.string.wallet_type_centralized_subtitle;
                                    long jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU();
                                    composer.startReplaceGroup(-1746271574);
                                    boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context) | composer.changed(strStringResource);
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new LinkInteractionListener() { // from class: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposableKt$WalletTypeComposable$1$2$1$1$secondaryTextForCentralizedPlatform$1$1
                                            @Override // androidx.compose.p011ui.text.LinkInteractionListener
                                            public final void onClick(LinkAnnotation link) {
                                                Intrinsics.checkNotNullParameter(link, "link");
                                                Navigators3.showHelpCenterWebViewFragment(navigator, context, strStringResource);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    AnnotatedString annotatedStringM22062annotatedStringResourceV2eopBjH0 = AnnotatedStringResource.m22062annotatedStringResourceV2eopBjH0(i4, jM21426getFg20d7_KjU, 0L, (LinkInteractionListener) objRememberedValue, composer, 0, 4);
                                    Composer composer2 = composer;
                                    Modifier modifierWithBentoPlaceholder$default2 = LocalShowPlaceholder.withBentoPlaceholder$default(companion, false, null, 3, null);
                                    boolean interfaceEnabled = WalletTypeComposable.WalletTypeComposable$lambda$0(snapshotState4).getInterfaceEnabled();
                                    BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
                                    BentoSelectionRowState bentoSelectionRowState = new BentoSelectionRowState(type2, StringResources_androidKt.stringResource(C37934R.string.wallet_type_centralized_title, composer2, 0), WalletTypeComposable.WalletTypeComposable$lambda$4(snapshotState) == WalletType.HOSTED, (BentoBaseRowState.Text) new BentoBaseRowState.Text.Annotated(annotatedStringM22062annotatedStringResourceV2eopBjH0, null, 2, null), interfaceEnabled, false, (BentoSelectionRowState.IconPosition) null, true, false, (ImmutableMap) null, (Function0) null, 1888, (DefaultConstructorMarker) null);
                                    composer2.startReplaceGroup(5004770);
                                    boolean zChanged = composer2.changed(snapshotState);
                                    Object objRememberedValue2 = composer2.rememberedValue();
                                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposableKt$WalletTypeComposable$1$2$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return WalletTypeComposable.C385621.AnonymousClass2.AnonymousClass1.invoke$lambda$6$lambda$2$lambda$1(snapshotState);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer2.endReplaceGroup();
                                    int i5 = BentoSelectionRowState.$stable;
                                    BentoSelectionRow2.BentoSelectionRow(modifierWithBentoPlaceholder$default2, bentoSelectionRowState, (Function0) objRememberedValue2, composer2, i5 << 3, 0);
                                    CharSequence text = StringResources6.getText(WalletTypeComposable.WalletTypeComposable$lambda$0(snapshotState4).getDecentralizedSubtitle(), composer2, i3);
                                    Modifier modifierWithBentoPlaceholder$default3 = LocalShowPlaceholder.withBentoPlaceholder$default(companion, false, null, 3, null);
                                    boolean decentralizedOptionEnabled = WalletTypeComposable.WalletTypeComposable$lambda$0(snapshotState4).getDecentralizedOptionEnabled();
                                    String strStringResource2 = StringResources_androidKt.stringResource(C37934R.string.wallet_type_decentralized_title, composer2, 0);
                                    composer2.startReplaceGroup(-1948776801);
                                    if (text instanceof Spanned) {
                                        long jM21426getFg20d7_KjU2 = bentoTheme.getColors(composer2, i2).m21426getFg20d7_KjU();
                                        composer2.startReplaceGroup(-1746271574);
                                        boolean zChangedInstance2 = composer2.changedInstance(navigator) | composer2.changedInstance(context) | composer2.changed(strStringResource);
                                        Object objRememberedValue3 = composer2.rememberedValue();
                                        if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = new LinkInteractionListener() { // from class: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposableKt$WalletTypeComposable$1$2$1$1$annotatedSecondaryTextForDecentralizedPlatform$1$1
                                                @Override // androidx.compose.p011ui.text.LinkInteractionListener
                                                public final void onClick(LinkAnnotation link) {
                                                    Intrinsics.checkNotNullParameter(link, "link");
                                                    Navigators3.showHelpCenterWebViewFragment(navigator, context, strStringResource);
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue3);
                                        }
                                        composer2.endReplaceGroup();
                                        z = false;
                                        composer2 = composer;
                                        annotated = new BentoBaseRowState.Text.Annotated(AnnotatedStringResource.m22063annotatedStringResourceV2eopBjH0(text, jM21426getFg20d7_KjU2, 0L, (LinkInteractionListener) objRememberedValue3, composer, 0, 4), null, 2, null);
                                    } else {
                                        annotated = new BentoBaseRowState.Text.Plain(text.toString());
                                        z = false;
                                    }
                                    composer2.endReplaceGroup();
                                    BentoSelectionRowState bentoSelectionRowState2 = new BentoSelectionRowState(type2, strStringResource2, WalletTypeComposable.WalletTypeComposable$lambda$4(snapshotState) == WalletType.UNHOSTED ? true : z, annotated, decentralizedOptionEnabled, false, (BentoSelectionRowState.IconPosition) null, true, false, (ImmutableMap) null, (Function0) null, 1888, (DefaultConstructorMarker) null);
                                    composer2.startReplaceGroup(5004770);
                                    boolean zChanged2 = composer2.changed(snapshotState);
                                    Object objRememberedValue4 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposableKt$WalletTypeComposable$1$2$1$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return WalletTypeComposable.C385621.AnonymousClass2.AnonymousClass1.invoke$lambda$6$lambda$5$lambda$4(snapshotState);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue4);
                                    }
                                    composer2.endReplaceGroup();
                                    BentoSelectionRow2.BentoSelectionRow(modifierWithBentoPlaceholder$default3, bentoSelectionRowState2, (Function0) objRememberedValue4, composer2, i5 << 3, 0);
                                    composer.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$6$lambda$2$lambda$1(SnapshotState snapshotState) {
                                    WalletTypeComposable.WalletTypeComposable$lambda$5(snapshotState, WalletType.HOSTED);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$6$lambda$5$lambda$4(SnapshotState snapshotState) {
                                    WalletTypeComposable.WalletTypeComposable$lambda$5(snapshotState, WalletType.UNHOSTED);
                                    return Unit.INSTANCE;
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                                invoke(boxScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer3, int i13) {
                                Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                if ((i13 & 17) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(856518852, i13, -1, "com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposable.<anonymous>.<anonymous> (WalletTypeComposable.kt:79)");
                                }
                                LocalShowPlaceholder.Loadable(WalletTypeComposable.WalletTypeComposable$lambda$0(snapshotState4).getShimmer(), null, null, ComposableLambda3.rememberComposableLambda(1182253652, true, new AnonymousClass1(navigator, context, snapshotState2, snapshotState4), composer3, 54), composer3, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 3504, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: WalletTypeComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposableKt$WalletTypeComposable$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                        final /* synthetic */ Context $context;
                        final /* synthetic */ WalletTypeDuxo $duxo;
                        final /* synthetic */ UUID $verificationId;
                        final /* synthetic */ VerificationType $verificationType;
                        final /* synthetic */ SnapshotState4<WalletTypeViewState> $viewState$delegate;
                        final /* synthetic */ SnapshotState<WalletType> $walletType$delegate;

                        AnonymousClass1(Context context, WalletTypeDuxo walletTypeDuxo, UUID uuid, VerificationType verificationType, SnapshotState<WalletType> snapshotState, SnapshotState4<WalletTypeViewState> snapshotState4) {
                            this.$context = context;
                            this.$duxo = walletTypeDuxo;
                            this.$verificationId = uuid;
                            this.$verificationType = verificationType;
                            this.$walletType$delegate = snapshotState;
                            this.$viewState$delegate = snapshotState4;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                            invoke(bentoButtonBar3, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
                            CryptoTransferContext crypto_transfer_context;
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i & 17) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1934978833, i, -1, "com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposable.<anonymous>.<anonymous> (WalletTypeComposable.kt:152)");
                            }
                            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                            boolean loading = WalletTypeComposable.WalletTypeComposable$lambda$0(this.$viewState$delegate).getLoading();
                            CryptoTransferContext cryptoTransferContextCopy = null;
                            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                            UserInteractionEventData.Action action = UserInteractionEventData.Action.CONTINUE;
                            Component component = new Component(Component.ComponentType.BUTTON, null, null, 6, null);
                            com.robinhood.rosetta.eventlogging.Context context = userInteractionEventDescriptor.getContext();
                            if (context != null && (crypto_transfer_context = context.getCrypto_transfer_context()) != null) {
                                cryptoTransferContextCopy = crypto_transfer_context.copy((16367 & 1) != 0 ? crypto_transfer_context.currency_id : null, (16367 & 2) != 0 ? crypto_transfer_context.session_id : null, (16367 & 4) != 0 ? crypto_transfer_context.withdrawal_id : null, (16367 & 8) != 0 ? crypto_transfer_context.amount : 0.0d, (16367 & 16) != 0 ? crypto_transfer_context.error_code : null, (16367 & 32) != 0 ? crypto_transfer_context.title : null, (16367 & 64) != 0 ? crypto_transfer_context.completed_kyc : null, (16367 & 128) != 0 ? crypto_transfer_context.completed_mfa : null, (16367 & 256) != 0 ? crypto_transfer_context.security_context : null, (16367 & 512) != 0 ? crypto_transfer_context.transfer_id : null, (16367 & 1024) != 0 ? crypto_transfer_context.party_selection : null, (16367 & 2048) != 0 ? crypto_transfer_context.wallet_selection : WalletTypeComposable.WalletTypeComposable$lambda$4(this.$walletType$delegate).getServerValue(), (16367 & 4096) != 0 ? crypto_transfer_context.error_message : null, (16367 & 8192) != 0 ? crypto_transfer_context.unknownFields() : null);
                            }
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, action, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cryptoTransferContextCopy, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -257, -1, -1, -1, 16383, null), component, null, 35, null), false, false, false, true, false, null, 110, null);
                            String strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_continue_button_label, composer, 0);
                            String strStringResource2 = StringResources_androidKt.stringResource(C37934R.string.wallet_type_disclosure, composer, 0);
                            String strStringResource3 = StringResources_androidKt.stringResource(C37934R.string.wallet_type_disclosure_privacy_notice, composer, 0);
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(this.$context);
                            final Context context2 = this.$context;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposableKt$WalletTypeComposable$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return WalletTypeComposable.C385621.AnonymousClass1.invoke$lambda$1$lambda$0(context2);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            Function0 function0 = (Function0) objRememberedValue;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(-1224400529);
                            boolean zChangedInstance2 = composer.changedInstance(this.$duxo) | composer.changedInstance(this.$verificationId) | composer.changed(this.$verificationType.ordinal()) | composer.changed(this.$walletType$delegate);
                            final WalletTypeDuxo walletTypeDuxo = this.$duxo;
                            final UUID uuid = this.$verificationId;
                            final VerificationType verificationType = this.$verificationType;
                            final SnapshotState snapshotState = this.$walletType$delegate;
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.type.WalletTypeComposableKt$WalletTypeComposable$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return WalletTypeComposable.C385621.AnonymousClass1.invoke$lambda$3$lambda$2(walletTypeDuxo, uuid, verificationType, snapshotState);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            BentoButtonBar2.BentoButtonBar(modifierAutoLogEvents$default, strStringResource2, strStringResource3, false, function0, null, (Function0) objRememberedValue2, strStringResource, loading, null, false, null, null, false, null, false, composer, 0, 0, 65064);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$3$lambda$2(WalletTypeDuxo walletTypeDuxo, UUID uuid, VerificationType verificationType, SnapshotState snapshotState) {
                            walletTypeDuxo.submit(uuid, verificationType, WalletTypeComposable.WalletTypeComposable$lambda$4(snapshotState));
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(Context context) {
                            WebUtils.viewUrl(context, C37934R.string.wallet_type_disclosure_privacy_notice_url, C20690R.attr.colorForeground1);
                            return Unit.INSTANCE;
                        }
                    }
                };
                verificationType2 = verificationType2;
                AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptorCopy$default22, ComposableLambda3.rememberComposableLambda(1869945308, true, function222, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                eventWalletTypeComposable$lambda$1 = WalletTypeComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle222);
                if (eventWalletTypeComposable$lambda$1 != null) {
                }
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                i7 = (composerStartRestartGroup.changedInstance(walletTypeDuxo4) ? 1 : 0) | (composerStartRestartGroup.changedInstance(checkIfHostedInfo) ? 1 : 0) | ((i1022 & 896) != 256 ? i1122 : 1);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (i7 != 0) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState WalletTypeComposable$lambda$3$lambda$2() {
        return SnapshotState3.mutableStateOf$default(WalletType.HOSTED, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WalletTypeViewState WalletTypeComposable$lambda$0(SnapshotState4<WalletTypeViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<WalletTypeDuxo3> WalletTypeComposable$lambda$1(SnapshotState4<Event<WalletTypeDuxo3>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WalletType WalletTypeComposable$lambda$4(SnapshotState<WalletType> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void WalletTypeComposable$lambda$5(SnapshotState<WalletType> snapshotState, WalletType walletType) {
        snapshotState.setValue(walletType);
    }
}
