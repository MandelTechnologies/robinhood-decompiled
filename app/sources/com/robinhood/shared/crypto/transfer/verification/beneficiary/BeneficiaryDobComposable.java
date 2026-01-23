package com.robinhood.shared.crypto.transfer.verification.beneficiary;

import android.app.Activity;
import android.view.KeyEvent;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.focus.FocusRequesterModifier3;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.InspectionMode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.input.KeyboardType;
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
import androidx.view.compose.LocalActivity;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.numpad.BentoNumpad4;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScreenLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.DateOfBirthVisualTransformation;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.g11n.CurrencyFormatterLocale;
import com.robinhood.models.api.transfer.verification.ApiCryptoVerificationResponse;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.verification.VerificationType;
import com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobComposable;
import com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobDuxo2;
import com.robinhood.shared.lib.crypto.transfer.CryptoTransferErrorHandler;
import com.robinhood.utils.extensions.KeyEvents2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BeneficiaryDobComposable.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\u001a[\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010\u0010\"\u0010\u0010\u0011\u001a\u00020\u00078\u0000X\u0081T¢\u0006\u0002\n\u0000¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002²\u0006\u0012\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u008a\u0084\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u0084\u0002"}, m3636d2 = {"BeneficiaryDobComposable", "", "verificationId", "Ljava/util/UUID;", "verificationType", "Lcom/robinhood/shared/crypto/transfer/verification/VerificationType;", "firstName", "", "lastName", "onBeneficiaryDob", "Lkotlin/Function2;", "Lcom/robinhood/models/api/transfer/verification/ApiCryptoVerificationResponse;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/crypto/transfer/verification/beneficiary/BeneficiaryDobDuxo;", "(Ljava/util/UUID;Lcom/robinhood/shared/crypto/transfer/verification/VerificationType;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/crypto/transfer/verification/beneficiary/BeneficiaryDobDuxo;Landroidx/compose/runtime/Composer;II)V", "DobTestTag", "feature-crypto-transfer_externalDebug", "viewState", "Lcom/robinhood/shared/crypto/transfer/verification/beneficiary/BeneficiaryDobViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/crypto/transfer/verification/beneficiary/BeneficiaryDobEvent;", "dateOfBirth", "ctaEnabled", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class BeneficiaryDobComposable {
    public static final String DobTestTag = "firstNameTestTag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BeneficiaryDobComposable$lambda$14(UUID uuid, VerificationType verificationType, String str, String str2, Function2 function2, Modifier modifier, BeneficiaryDobDuxo beneficiaryDobDuxo, int i, int i2, Composer composer, int i3) {
        BeneficiaryDobComposable(uuid, verificationType, str, str2, function2, modifier, beneficiaryDobDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BeneficiaryDobComposable(final UUID verificationId, final VerificationType verificationType, final String firstName, final String lastName, final Function2<? super String, ? super ApiCryptoVerificationResponse, Unit> onBeneficiaryDob, Modifier modifier, BeneficiaryDobDuxo beneficiaryDobDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final BeneficiaryDobDuxo beneficiaryDobDuxo2;
        Modifier modifier3;
        Composer composer2;
        int i4;
        Object objRememberedValue;
        Composer.Companion companion;
        Composer composer3;
        final SnapshotState snapshotState;
        Object objRememberedValue2;
        final CryptoTransferErrorHandler cryptoTransferErrorHandler;
        Object objRememberedValue3;
        Object objRememberedValue4;
        final Event<BeneficiaryDobDuxo2> eventBeneficiaryDobComposable$lambda$1;
        final Event<BeneficiaryDobDuxo2> eventBeneficiaryDobComposable$lambda$12;
        Object objRememberedValue5;
        final Modifier modifier4;
        EventConsumer<BeneficiaryDobDuxo2> eventConsumerInvoke;
        EventConsumer<BeneficiaryDobDuxo2> eventConsumerInvoke2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(verificationId, "verificationId");
        Intrinsics.checkNotNullParameter(verificationType, "verificationType");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(onBeneficiaryDob, "onBeneficiaryDob");
        Composer composerStartRestartGroup = composer.startRestartGroup(1380496921);
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
            i3 |= composerStartRestartGroup.changed(firstName) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(lastName) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBeneficiaryDob) ? 16384 : 8192;
        }
        int i5 = i2 & 32;
        if (i5 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((1572864 & i) != 0) {
                if ((i2 & 64) == 0) {
                    beneficiaryDobDuxo2 = beneficiaryDobDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(beneficiaryDobDuxo2) ? 1048576 : 524288;
                    i3 |= i6;
                } else {
                    beneficiaryDobDuxo2 = beneficiaryDobDuxo;
                }
                i3 |= i6;
            } else {
                beneficiaryDobDuxo2 = beneficiaryDobDuxo;
            }
            if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 64) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        i4 = 0;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(BeneficiaryDobDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue6 = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobComposableKt$BeneficiaryDobComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobComposableKt$BeneficiaryDobComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue6);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue6, composer2, 0);
                        composer2.endReplaceGroup();
                        i3 &= -3670017;
                        beneficiaryDobDuxo2 = (BeneficiaryDobDuxo) baseDuxo;
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1380496921, i3, -1, "com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobComposable (BeneficiaryDobComposable.kt:59)");
                        }
                        Composer composer4 = composer2;
                        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(beneficiaryDobDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(beneficiaryDobDuxo2.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                        Object[] objArr = new Object[i4];
                        composer2.startReplaceGroup(1849434622);
                        objRememberedValue = composer2.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return BeneficiaryDobComposable.BeneficiaryDobComposable$lambda$3$lambda$2();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        Composer composer5 = composer2;
                        Object objM6426rememberSaveable = RememberSaveable.m6426rememberSaveable(objArr, (Saver<Object, ? extends Object>) null, (String) null, (Function0<? extends Object>) objRememberedValue, composer5, 3072, 6);
                        composer3 = composer5;
                        snapshotState = (SnapshotState) objM6426rememberSaveable;
                        Object objConsume = composer3.consume(LocalActivity.getLocalActivity());
                        Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type android.app.Activity");
                        Activity activity = (Activity) objConsume;
                        composer3.startReplaceGroup(1849434622);
                        objRememberedValue2 = composer3.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new CryptoTransferErrorHandler(activity, null, null, null, null, false, 48, null);
                            composer3.updateRememberedValue(objRememberedValue2);
                        }
                        cryptoTransferErrorHandler = (CryptoTransferErrorHandler) objRememberedValue2;
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(1849434622);
                        objRememberedValue3 = composer3.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobComposableKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Boolean.valueOf(BeneficiaryDobComposable.BeneficiaryDobComposable$lambda$8$lambda$7(snapshotState));
                                }
                            });
                            composer3.updateRememberedValue(objRememberedValue3);
                        }
                        final SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue3;
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(1849434622);
                        objRememberedValue4 = composer3.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = new FocusRequester();
                            composer3.updateRememberedValue(objRememberedValue4);
                        }
                        final FocusRequester focusRequester = (FocusRequester) objRememberedValue4;
                        composer3.endReplaceGroup();
                        final Modifier modifier5 = modifier3;
                        AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, new Screen(Screen.Name.CRYPTO_TRANSFER_SEND_RECEIVER_DOB, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-720808882, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobComposableKt.BeneficiaryDobComposable.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                invoke(composer6, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer6, int i7) {
                                if ((i7 & 3) == 2 && composer6.getSkipping()) {
                                    composer6.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-720808882, i7, -1, "com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobComposable.<anonymous> (BeneficiaryDobComposable.kt:80)");
                                }
                                BentoNumpadScreenLayout.BentoNumpadScreenLayout(ModifiersKt.logScreenTransitions$default(modifier5, null, 1, null), ComposableLambda3.rememberComposableLambda(1970231691, true, new AnonymousClass1(focusRequester, snapshotState, snapshotState4CollectAsStateWithLifecycle), composer6, 54), ComposableLambda3.rememberComposableLambda(-1128295269, true, new AnonymousClass2(snapshotState, beneficiaryDobDuxo2, verificationId, verificationType, firstName, lastName, snapshotState4CollectAsStateWithLifecycle, snapshotState4), composer6, 54), composer6, 432, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: BeneficiaryDobComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobComposableKt$BeneficiaryDobComposable$1$1, reason: invalid class name */
                            static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ SnapshotState<String> $dateOfBirth$delegate;
                                final /* synthetic */ FocusRequester $focusRequester;
                                final /* synthetic */ SnapshotState4<BeneficiaryDobViewState> $viewState$delegate;

                                AnonymousClass1(FocusRequester focusRequester, SnapshotState<String> snapshotState, SnapshotState4<BeneficiaryDobViewState> snapshotState4) {
                                    this.$focusRequester = focusRequester;
                                    this.$dateOfBirth$delegate = snapshotState;
                                    this.$viewState$delegate = snapshotState4;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                    invoke(composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer, int i) {
                                    if ((i & 3) == 2 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1970231691, i, -1, "com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobComposable.<anonymous>.<anonymous> (BeneficiaryDobComposable.kt:83)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i2 = BentoTheme.$stable;
                                    Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM());
                                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                    FocusRequester focusRequester = this.$focusRequester;
                                    SnapshotState<String> snapshotState = this.$dateOfBirth$delegate;
                                    SnapshotState4<BeneficiaryDobViewState> snapshotState4 = this.$viewState$delegate;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
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
                                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C37934R.string.withdrawal_beneficiary_dob_title, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall(), composer, 0, 0, 8190);
                                    Spacer2.Spacer(SizeKt.m5158heightInVpY3zN4$default(Column5.weight$default(column6, companion, 1.0f, false, 2, null), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), composer, 0);
                                    Modifier modifierTestTag = TestTag3.testTag(FocusRequesterModifier3.focusRequester(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), focusRequester), "firstNameTestTag");
                                    String strBeneficiaryDobComposable$lambda$4 = BeneficiaryDobComposable.BeneficiaryDobComposable$lambda$4(snapshotState);
                                    boolean interfaceEnabled = BeneficiaryDobComposable.BeneficiaryDobComposable$lambda$0(snapshotState4).getInterfaceEnabled();
                                    String strStringResource = StringResources_androidKt.stringResource(C37934R.string.withdrawal_beneficiary_dob_hint, composer, 0);
                                    KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.m7782getNumberPasswordPjHm6EE(), 0, null, null, null, 123, null);
                                    DateOfBirthVisualTransformation dateOfBirthVisualTransformation = new DateOfBirthVisualTransformation(CurrencyFormatterLocale.INSTANCE.getInstance().getDateTimeFormatterLocale(), "dd/MM/yyyy");
                                    boolean z = !((Boolean) composer.consume(InspectionMode.getLocalInspectionMode())).booleanValue();
                                    composer.startReplaceGroup(1849434622);
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobComposableKt$BeneficiaryDobComposable$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return BeneficiaryDobComposable.C385081.AnonymousClass1.invoke$lambda$2$lambda$1$lambda$0((String) obj);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    BentoTextInput4.BentoHeroTextInput(strBeneficiaryDobComposable$lambda$4, (Function1) objRememberedValue, modifierTestTag, null, strStringResource, null, null, null, null, keyboardOptions, null, dateOfBirthVisualTransformation, interfaceEnabled, z, composer, 805306416, 0, 1512);
                                    Spacer2.Spacer(SizeKt.m5158heightInVpY3zN4$default(Column5.weight$default(column6, companion, 1.0f, false, 2, null), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), composer, 0);
                                    composer.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$2$lambda$1$lambda$0(String it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    return Unit.INSTANCE;
                                }
                            }

                            /* compiled from: BeneficiaryDobComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobComposableKt$BeneficiaryDobComposable$1$2, reason: invalid class name */
                            static final class AnonymousClass2 implements Function3<BentoNumpad4, Composer, Integer, Unit> {
                                final /* synthetic */ SnapshotState4<Boolean> $ctaEnabled$delegate;
                                final /* synthetic */ SnapshotState<String> $dateOfBirth$delegate;
                                final /* synthetic */ BeneficiaryDobDuxo $duxo;
                                final /* synthetic */ String $firstName;
                                final /* synthetic */ String $lastName;
                                final /* synthetic */ UUID $verificationId;
                                final /* synthetic */ VerificationType $verificationType;
                                final /* synthetic */ SnapshotState4<BeneficiaryDobViewState> $viewState$delegate;

                                AnonymousClass2(SnapshotState<String> snapshotState, BeneficiaryDobDuxo beneficiaryDobDuxo, UUID uuid, VerificationType verificationType, String str, String str2, SnapshotState4<BeneficiaryDobViewState> snapshotState4, SnapshotState4<Boolean> snapshotState42) {
                                    this.$dateOfBirth$delegate = snapshotState;
                                    this.$duxo = beneficiaryDobDuxo;
                                    this.$verificationId = uuid;
                                    this.$verificationType = verificationType;
                                    this.$firstName = str;
                                    this.$lastName = str2;
                                    this.$viewState$delegate = snapshotState4;
                                    this.$ctaEnabled$delegate = snapshotState42;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoNumpad4 bentoNumpad4, Composer composer, Integer num) {
                                    invoke(bentoNumpad4, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:32:0x00fd  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void invoke(BentoNumpad4 BentoNumpadScreenLayout, Composer composer, int i) {
                                    int i2;
                                    Object obj;
                                    Intrinsics.checkNotNullParameter(BentoNumpadScreenLayout, "$this$BentoNumpadScreenLayout");
                                    if ((i & 6) == 0) {
                                        i2 = i | ((i & 8) == 0 ? composer.changed(BentoNumpadScreenLayout) : composer.changedInstance(BentoNumpadScreenLayout) ? 4 : 2);
                                    } else {
                                        i2 = i;
                                    }
                                    if ((i2 & 19) == 18 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1128295269, i2, -1, "com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobComposable.<anonymous>.<anonymous> (BeneficiaryDobComposable.kt:120)");
                                    }
                                    final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                                    final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer, AutoLoggingCompositionLocals4.$stable);
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    String strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_continue_button_label, composer, 0);
                                    boolean interfaceEnabled = BeneficiaryDobComposable.BeneficiaryDobComposable$lambda$0(this.$viewState$delegate).getInterfaceEnabled();
                                    boolean zBeneficiaryDobComposable$lambda$9 = BeneficiaryDobComposable.BeneficiaryDobComposable$lambda$9(this.$ctaEnabled$delegate);
                                    composer.startReplaceGroup(5004770);
                                    boolean zChanged = composer.changed(this.$dateOfBirth$delegate);
                                    final SnapshotState<String> snapshotState = this.$dateOfBirth$delegate;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobComposableKt$BeneficiaryDobComposable$1$2$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                return BeneficiaryDobComposable.C385081.AnonymousClass2.invoke$lambda$1$lambda$0(snapshotState, (KeyEvent) obj2);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    Function1<? super KeyEvent, Unit> function1 = (Function1) objRememberedValue;
                                    composer.endReplaceGroup();
                                    composer.startReplaceGroup(-1224400529);
                                    boolean zChangedInstance = composer.changedInstance(userInteractionEventDescriptor) | composer.changedInstance(current) | composer.changedInstance(this.$duxo) | composer.changedInstance(this.$verificationId) | composer.changed(this.$verificationType.ordinal()) | composer.changed(this.$firstName) | composer.changed(this.$lastName) | composer.changed(this.$dateOfBirth$delegate);
                                    final BeneficiaryDobDuxo beneficiaryDobDuxo = this.$duxo;
                                    final UUID uuid = this.$verificationId;
                                    final VerificationType verificationType = this.$verificationType;
                                    final String str = this.$firstName;
                                    final String str2 = this.$lastName;
                                    final SnapshotState<String> snapshotState2 = this.$dateOfBirth$delegate;
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (!zChangedInstance) {
                                        obj = objRememberedValue2;
                                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            Object obj2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobComposableKt$BeneficiaryDobComposable$1$2$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return BeneficiaryDobComposable.C385081.AnonymousClass2.invoke$lambda$3$lambda$2(userInteractionEventDescriptor, current, beneficiaryDobDuxo, uuid, verificationType, str, str2, snapshotState2);
                                                }
                                            };
                                            composer.updateRememberedValue(obj2);
                                            obj = obj2;
                                        }
                                    }
                                    composer.endReplaceGroup();
                                    BentoNumpadScreenLayout.BentoNumpadWithButton(modifierFillMaxWidth$default, function1, strStringResource, (Function0) obj, interfaceEnabled, zBeneficiaryDobComposable$lambda$9, false, false, false, false, null, false, composer, 100663302, (BentoNumpad4.$stable << 6) | ((i2 << 6) & 896), 3776);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$3$lambda$2(UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, BeneficiaryDobDuxo beneficiaryDobDuxo, UUID uuid, VerificationType verificationType, String str, String str2, SnapshotState snapshotState) {
                                    EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.CONTINUE, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
                                    beneficiaryDobDuxo.submit(uuid, verificationType, str, str2, BeneficiaryDobComposable.BeneficiaryDobComposable$lambda$4(snapshotState));
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, KeyEvent it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    if (KeyEvents2.isDigit(it)) {
                                        if (BeneficiaryDobComposable.BeneficiaryDobComposable$lambda$4(snapshotState).length() < 8) {
                                            BeneficiaryDobComposable.BeneficiaryDobComposable$lambda$5(snapshotState, BeneficiaryDobComposable.BeneficiaryDobComposable$lambda$4(snapshotState) + it.getNumber());
                                        }
                                    } else if (KeyEvents2.isDelete(it) && BeneficiaryDobComposable.BeneficiaryDobComposable$lambda$4(snapshotState).length() > 0) {
                                        BeneficiaryDobComposable.BeneficiaryDobComposable$lambda$5(snapshotState, StringsKt.dropLast(BeneficiaryDobComposable.BeneficiaryDobComposable$lambda$4(snapshotState), 1));
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        }, composer3, 54), composer3, 48);
                        eventBeneficiaryDobComposable$lambda$1 = BeneficiaryDobComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                        if (eventBeneficiaryDobComposable$lambda$1 != null && (eventBeneficiaryDobComposable$lambda$1.getData() instanceof BeneficiaryDobDuxo2.Success) && (eventConsumerInvoke2 = eventBeneficiaryDobComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke2.consume(eventBeneficiaryDobComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobComposableKt$BeneficiaryDobComposable$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m25185invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m25185invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    onBeneficiaryDob.invoke(BeneficiaryDobComposable.BeneficiaryDobComposable$lambda$4(snapshotState), ((BeneficiaryDobDuxo2.Success) eventBeneficiaryDobComposable$lambda$1.getData()).getNext());
                                }
                            });
                        }
                        eventBeneficiaryDobComposable$lambda$12 = BeneficiaryDobComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                        if (eventBeneficiaryDobComposable$lambda$12 != null && (eventBeneficiaryDobComposable$lambda$12.getData() instanceof BeneficiaryDobDuxo2.Error) && (eventConsumerInvoke = eventBeneficiaryDobComposable$lambda$12.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(eventBeneficiaryDobComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobComposableKt$BeneficiaryDobComposable$$inlined$consumeIfType$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m25186invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m25186invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AbsErrorHandler.handleError$default(cryptoTransferErrorHandler, ((BeneficiaryDobDuxo2.Error) eventBeneficiaryDobComposable$lambda$12.getData()).getThrowable(), false, 2, null);
                                }
                            });
                        }
                        Unit unit = Unit.INSTANCE;
                        composer3.startReplaceGroup(5004770);
                        objRememberedValue5 = composer3.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = new BeneficiaryDobComposable2(focusRequester, null);
                            composer3.updateRememberedValue(objRememberedValue5);
                        }
                        composer3.endReplaceGroup();
                        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composer3, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier5;
                    } else {
                        composer2 = composerStartRestartGroup;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                }
                i4 = 0;
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Composer composer42 = composer2;
                final SnapshotState4<BeneficiaryDobViewState> snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(beneficiaryDobDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(beneficiaryDobDuxo2.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                Object[] objArr2 = new Object[i4];
                composer2.startReplaceGroup(1849434622);
                objRememberedValue = composer2.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                composer2.endReplaceGroup();
                Composer composer52 = composer2;
                Object objM6426rememberSaveable2 = RememberSaveable.m6426rememberSaveable(objArr2, (Saver<Object, ? extends Object>) null, (String) null, (Function0<? extends Object>) objRememberedValue, composer52, 3072, 6);
                composer3 = composer52;
                snapshotState = (SnapshotState) objM6426rememberSaveable2;
                Object objConsume2 = composer3.consume(LocalActivity.getLocalActivity());
                Intrinsics.checkNotNull(objConsume2, "null cannot be cast to non-null type android.app.Activity");
                Activity activity2 = (Activity) objConsume2;
                composer3.startReplaceGroup(1849434622);
                objRememberedValue2 = composer3.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                cryptoTransferErrorHandler = (CryptoTransferErrorHandler) objRememberedValue2;
                composer3.endReplaceGroup();
                composer3.startReplaceGroup(1849434622);
                objRememberedValue3 = composer3.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                final SnapshotState4<Boolean> snapshotState42 = (SnapshotState4) objRememberedValue3;
                composer3.endReplaceGroup();
                composer3.startReplaceGroup(1849434622);
                objRememberedValue4 = composer3.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                }
                final FocusRequester focusRequester2 = (FocusRequester) objRememberedValue4;
                composer3.endReplaceGroup();
                final Modifier modifier52 = modifier3;
                AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, new Screen(Screen.Name.CRYPTO_TRANSFER_SEND_RECEIVER_DOB, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-720808882, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobComposableKt.BeneficiaryDobComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                        invoke(composer6, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer6, int i7) {
                        if ((i7 & 3) == 2 && composer6.getSkipping()) {
                            composer6.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-720808882, i7, -1, "com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobComposable.<anonymous> (BeneficiaryDobComposable.kt:80)");
                        }
                        BentoNumpadScreenLayout.BentoNumpadScreenLayout(ModifiersKt.logScreenTransitions$default(modifier52, null, 1, null), ComposableLambda3.rememberComposableLambda(1970231691, true, new AnonymousClass1(focusRequester2, snapshotState, snapshotState4CollectAsStateWithLifecycle3), composer6, 54), ComposableLambda3.rememberComposableLambda(-1128295269, true, new AnonymousClass2(snapshotState, beneficiaryDobDuxo2, verificationId, verificationType, firstName, lastName, snapshotState4CollectAsStateWithLifecycle3, snapshotState42), composer6, 54), composer6, 432, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: BeneficiaryDobComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobComposableKt$BeneficiaryDobComposable$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ SnapshotState<String> $dateOfBirth$delegate;
                        final /* synthetic */ FocusRequester $focusRequester;
                        final /* synthetic */ SnapshotState4<BeneficiaryDobViewState> $viewState$delegate;

                        AnonymousClass1(FocusRequester focusRequester, SnapshotState<String> snapshotState, SnapshotState4<BeneficiaryDobViewState> snapshotState4) {
                            this.$focusRequester = focusRequester;
                            this.$dateOfBirth$delegate = snapshotState;
                            this.$viewState$delegate = snapshotState4;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer, int i) {
                            if ((i & 3) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1970231691, i, -1, "com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobComposable.<anonymous>.<anonymous> (BeneficiaryDobComposable.kt:83)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM());
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            FocusRequester focusRequester = this.$focusRequester;
                            SnapshotState<String> snapshotState = this.$dateOfBirth$delegate;
                            SnapshotState4<BeneficiaryDobViewState> snapshotState4 = this.$viewState$delegate;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
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
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C37934R.string.withdrawal_beneficiary_dob_title, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall(), composer, 0, 0, 8190);
                            Spacer2.Spacer(SizeKt.m5158heightInVpY3zN4$default(Column5.weight$default(column6, companion, 1.0f, false, 2, null), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), composer, 0);
                            Modifier modifierTestTag = TestTag3.testTag(FocusRequesterModifier3.focusRequester(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), focusRequester), "firstNameTestTag");
                            String strBeneficiaryDobComposable$lambda$4 = BeneficiaryDobComposable.BeneficiaryDobComposable$lambda$4(snapshotState);
                            boolean interfaceEnabled = BeneficiaryDobComposable.BeneficiaryDobComposable$lambda$0(snapshotState4).getInterfaceEnabled();
                            String strStringResource = StringResources_androidKt.stringResource(C37934R.string.withdrawal_beneficiary_dob_hint, composer, 0);
                            KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.m7782getNumberPasswordPjHm6EE(), 0, null, null, null, 123, null);
                            DateOfBirthVisualTransformation dateOfBirthVisualTransformation = new DateOfBirthVisualTransformation(CurrencyFormatterLocale.INSTANCE.getInstance().getDateTimeFormatterLocale(), "dd/MM/yyyy");
                            boolean z = !((Boolean) composer.consume(InspectionMode.getLocalInspectionMode())).booleanValue();
                            composer.startReplaceGroup(1849434622);
                            Object objRememberedValue = composer.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobComposableKt$BeneficiaryDobComposable$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return BeneficiaryDobComposable.C385081.AnonymousClass1.invoke$lambda$2$lambda$1$lambda$0((String) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoTextInput4.BentoHeroTextInput(strBeneficiaryDobComposable$lambda$4, (Function1) objRememberedValue, modifierTestTag, null, strStringResource, null, null, null, null, keyboardOptions, null, dateOfBirthVisualTransformation, interfaceEnabled, z, composer, 805306416, 0, 1512);
                            Spacer2.Spacer(SizeKt.m5158heightInVpY3zN4$default(Column5.weight$default(column6, companion, 1.0f, false, 2, null), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), composer, 0);
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$2$lambda$1$lambda$0(String it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return Unit.INSTANCE;
                        }
                    }

                    /* compiled from: BeneficiaryDobComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobComposableKt$BeneficiaryDobComposable$1$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function3<BentoNumpad4, Composer, Integer, Unit> {
                        final /* synthetic */ SnapshotState4<Boolean> $ctaEnabled$delegate;
                        final /* synthetic */ SnapshotState<String> $dateOfBirth$delegate;
                        final /* synthetic */ BeneficiaryDobDuxo $duxo;
                        final /* synthetic */ String $firstName;
                        final /* synthetic */ String $lastName;
                        final /* synthetic */ UUID $verificationId;
                        final /* synthetic */ VerificationType $verificationType;
                        final /* synthetic */ SnapshotState4<BeneficiaryDobViewState> $viewState$delegate;

                        AnonymousClass2(SnapshotState<String> snapshotState, BeneficiaryDobDuxo beneficiaryDobDuxo, UUID uuid, VerificationType verificationType, String str, String str2, SnapshotState4<BeneficiaryDobViewState> snapshotState4, SnapshotState4<Boolean> snapshotState42) {
                            this.$dateOfBirth$delegate = snapshotState;
                            this.$duxo = beneficiaryDobDuxo;
                            this.$verificationId = uuid;
                            this.$verificationType = verificationType;
                            this.$firstName = str;
                            this.$lastName = str2;
                            this.$viewState$delegate = snapshotState4;
                            this.$ctaEnabled$delegate = snapshotState42;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoNumpad4 bentoNumpad4, Composer composer, Integer num) {
                            invoke(bentoNumpad4, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:32:0x00fd  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void invoke(BentoNumpad4 BentoNumpadScreenLayout, Composer composer, int i) {
                            int i2;
                            Object obj;
                            Intrinsics.checkNotNullParameter(BentoNumpadScreenLayout, "$this$BentoNumpadScreenLayout");
                            if ((i & 6) == 0) {
                                i2 = i | ((i & 8) == 0 ? composer.changed(BentoNumpadScreenLayout) : composer.changedInstance(BentoNumpadScreenLayout) ? 4 : 2);
                            } else {
                                i2 = i;
                            }
                            if ((i2 & 19) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1128295269, i2, -1, "com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobComposable.<anonymous>.<anonymous> (BeneficiaryDobComposable.kt:120)");
                            }
                            final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer, AutoLoggingCompositionLocals4.$stable);
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            String strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_continue_button_label, composer, 0);
                            boolean interfaceEnabled = BeneficiaryDobComposable.BeneficiaryDobComposable$lambda$0(this.$viewState$delegate).getInterfaceEnabled();
                            boolean zBeneficiaryDobComposable$lambda$9 = BeneficiaryDobComposable.BeneficiaryDobComposable$lambda$9(this.$ctaEnabled$delegate);
                            composer.startReplaceGroup(5004770);
                            boolean zChanged = composer.changed(this.$dateOfBirth$delegate);
                            final SnapshotState snapshotState = this.$dateOfBirth$delegate;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobComposableKt$BeneficiaryDobComposable$1$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return BeneficiaryDobComposable.C385081.AnonymousClass2.invoke$lambda$1$lambda$0(snapshotState, (KeyEvent) obj2);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            Function1<? super KeyEvent, Unit> function1 = (Function1) objRememberedValue;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(-1224400529);
                            boolean zChangedInstance = composer.changedInstance(userInteractionEventDescriptor) | composer.changedInstance(current) | composer.changedInstance(this.$duxo) | composer.changedInstance(this.$verificationId) | composer.changed(this.$verificationType.ordinal()) | composer.changed(this.$firstName) | composer.changed(this.$lastName) | composer.changed(this.$dateOfBirth$delegate);
                            final BeneficiaryDobDuxo beneficiaryDobDuxo = this.$duxo;
                            final UUID uuid = this.$verificationId;
                            final VerificationType verificationType = this.$verificationType;
                            final String str = this.$firstName;
                            final String str2 = this.$lastName;
                            final SnapshotState snapshotState2 = this.$dateOfBirth$delegate;
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (!zChangedInstance) {
                                obj = objRememberedValue2;
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    Object obj2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobComposableKt$BeneficiaryDobComposable$1$2$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return BeneficiaryDobComposable.C385081.AnonymousClass2.invoke$lambda$3$lambda$2(userInteractionEventDescriptor, current, beneficiaryDobDuxo, uuid, verificationType, str, str2, snapshotState2);
                                        }
                                    };
                                    composer.updateRememberedValue(obj2);
                                    obj = obj2;
                                }
                            }
                            composer.endReplaceGroup();
                            BentoNumpadScreenLayout.BentoNumpadWithButton(modifierFillMaxWidth$default, function1, strStringResource, (Function0) obj, interfaceEnabled, zBeneficiaryDobComposable$lambda$9, false, false, false, false, null, false, composer, 100663302, (BentoNumpad4.$stable << 6) | ((i2 << 6) & 896), 3776);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$3$lambda$2(UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, BeneficiaryDobDuxo beneficiaryDobDuxo, UUID uuid, VerificationType verificationType, String str, String str2, SnapshotState snapshotState) {
                            EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.CONTINUE, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
                            beneficiaryDobDuxo.submit(uuid, verificationType, str, str2, BeneficiaryDobComposable.BeneficiaryDobComposable$lambda$4(snapshotState));
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, KeyEvent it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (KeyEvents2.isDigit(it)) {
                                if (BeneficiaryDobComposable.BeneficiaryDobComposable$lambda$4(snapshotState).length() < 8) {
                                    BeneficiaryDobComposable.BeneficiaryDobComposable$lambda$5(snapshotState, BeneficiaryDobComposable.BeneficiaryDobComposable$lambda$4(snapshotState) + it.getNumber());
                                }
                            } else if (KeyEvents2.isDelete(it) && BeneficiaryDobComposable.BeneficiaryDobComposable$lambda$4(snapshotState).length() > 0) {
                                BeneficiaryDobComposable.BeneficiaryDobComposable$lambda$5(snapshotState, StringsKt.dropLast(BeneficiaryDobComposable.BeneficiaryDobComposable$lambda$4(snapshotState), 1));
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }, composer3, 54), composer3, 48);
                eventBeneficiaryDobComposable$lambda$1 = BeneficiaryDobComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventBeneficiaryDobComposable$lambda$1 != null) {
                    eventConsumerInvoke2.consume(eventBeneficiaryDobComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobComposableKt$BeneficiaryDobComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25185invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25185invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            onBeneficiaryDob.invoke(BeneficiaryDobComposable.BeneficiaryDobComposable$lambda$4(snapshotState), ((BeneficiaryDobDuxo2.Success) eventBeneficiaryDobComposable$lambda$1.getData()).getNext());
                        }
                    });
                }
                eventBeneficiaryDobComposable$lambda$12 = BeneficiaryDobComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventBeneficiaryDobComposable$lambda$12 != null) {
                    eventConsumerInvoke.consume(eventBeneficiaryDobComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobComposableKt$BeneficiaryDobComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25186invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25186invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            AbsErrorHandler.handleError$default(cryptoTransferErrorHandler, ((BeneficiaryDobDuxo2.Error) eventBeneficiaryDobComposable$lambda$12.getData()).getThrowable(), false, 2, null);
                        }
                    });
                }
                Unit unit2 = Unit.INSTANCE;
                composer3.startReplaceGroup(5004770);
                objRememberedValue5 = composer3.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                }
                composer3.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composer3, 6);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier52;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer3 = composerStartRestartGroup;
                modifier4 = modifier2;
            }
            final BeneficiaryDobDuxo beneficiaryDobDuxo3 = beneficiaryDobDuxo2;
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryDobComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BeneficiaryDobComposable.BeneficiaryDobComposable$lambda$14(verificationId, verificationType, firstName, lastName, onBeneficiaryDob, modifier4, beneficiaryDobDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((1572864 & i) != 0) {
        }
        if ((599187 & i3) == 599186) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 64) == 0) {
                }
            }
        }
        final BeneficiaryDobDuxo beneficiaryDobDuxo32 = beneficiaryDobDuxo2;
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState BeneficiaryDobComposable$lambda$3$lambda$2() {
        return SnapshotState3.mutableStateOf$default("", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BeneficiaryDobComposable$lambda$8$lambda$7(SnapshotState snapshotState) {
        return BeneficiaryDobComposable$lambda$4(snapshotState).length() == 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BeneficiaryDobViewState BeneficiaryDobComposable$lambda$0(SnapshotState4<BeneficiaryDobViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<BeneficiaryDobDuxo2> BeneficiaryDobComposable$lambda$1(SnapshotState4<Event<BeneficiaryDobDuxo2>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String BeneficiaryDobComposable$lambda$4(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BeneficiaryDobComposable$lambda$9(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BeneficiaryDobComposable$lambda$5(SnapshotState<String> snapshotState, String str) {
        snapshotState.setValue(str);
    }
}
