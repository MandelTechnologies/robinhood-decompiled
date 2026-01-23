package com.robinhood.shared.crypto.transfer.verification.category;

import android.app.Activity;
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
import androidx.view.compose.LocalActivity;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
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
import com.robinhood.compose.util.StringResource2;
import com.robinhood.models.api.transfer.verification.ApiCryptoVerificationResponse;
import com.robinhood.models.api.transfer.verification.TransferCategory;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.CryptoTransferContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.verification.VerificationType;
import com.robinhood.shared.crypto.transfer.verification.category.TransferCategoryComposable;
import com.robinhood.shared.crypto.transfer.verification.category.TransferCategoryDuxo2;
import com.robinhood.shared.lib.crypto.transfer.CryptoTransferErrorHandler;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TransferCategoryComposable.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aK\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\u0012\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u008a\u0084\u0002²\u0006\n\u0010\u0015\u001a\u00020\bX\u008a\u008e\u0002"}, m3636d2 = {"TransferCategoryComposable", "", "verificationId", "Ljava/util/UUID;", "verificationType", "Lcom/robinhood/shared/crypto/transfer/verification/VerificationType;", "onTransferCategoryConfirmed", "Lkotlin/Function2;", "Lcom/robinhood/models/api/transfer/verification/TransferCategory;", "Lcom/robinhood/models/api/transfer/verification/ApiCryptoVerificationResponse;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/crypto/transfer/verification/category/TransferCategoryDuxo;", "(Ljava/util/UUID;Lcom/robinhood/shared/crypto/transfer/verification/VerificationType;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/crypto/transfer/verification/category/TransferCategoryDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-transfer_externalDebug", "viewState", "Lcom/robinhood/shared/crypto/transfer/verification/category/TransferCategoryViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/crypto/transfer/verification/category/TransferCategoryEvent;", "transferCategory"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.verification.category.TransferCategoryComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class TransferCategoryComposable {

    /* compiled from: TransferCategoryComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.transfer.verification.category.TransferCategoryComposableKt$WhenMappings */
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
    public static final Unit TransferCategoryComposable$lambda$10(UUID uuid, VerificationType verificationType, Function2 function2, Modifier modifier, TransferCategoryDuxo transferCategoryDuxo, int i, int i2, Composer composer, int i3) {
        TransferCategoryComposable(uuid, verificationType, function2, modifier, transferCategoryDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TransferCategoryComposable(final UUID verificationId, final VerificationType verificationType, final Function2<? super TransferCategory, ? super ApiCryptoVerificationResponse, Unit> onTransferCategoryConfirmed, Modifier modifier, TransferCategoryDuxo transferCategoryDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        TransferCategoryDuxo transferCategoryDuxo2;
        Modifier modifier3;
        int i4;
        final TransferCategoryDuxo transferCategoryDuxo3;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        Object objRememberedValue2;
        final CryptoTransferErrorHandler cryptoTransferErrorHandler;
        int i5;
        Screen.Name name;
        TransferCategoryDuxo transferCategoryDuxo4;
        final Event<TransferCategoryDuxo2> eventTransferCategoryComposable$lambda$1;
        final Event<TransferCategoryDuxo2> eventTransferCategoryComposable$lambda$12;
        int i6;
        Object objRememberedValue3;
        final TransferCategoryDuxo transferCategoryDuxo5;
        final Modifier modifier4;
        EventConsumer<TransferCategoryDuxo2> eventConsumerInvoke;
        EventConsumer<TransferCategoryDuxo2> eventConsumerInvoke2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final VerificationType verificationType2 = verificationType;
        Intrinsics.checkNotNullParameter(verificationId, "verificationId");
        Intrinsics.checkNotNullParameter(verificationType2, "verificationType");
        Intrinsics.checkNotNullParameter(onTransferCategoryConfirmed, "onTransferCategoryConfirmed");
        Composer composerStartRestartGroup = composer.startRestartGroup(1794870827);
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
            i3 |= composerStartRestartGroup.changed(verificationType2.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onTransferCategoryConfirmed) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    transferCategoryDuxo2 = transferCategoryDuxo;
                    int i8 = composerStartRestartGroup.changedInstance(transferCategoryDuxo2) ? 16384 : 8192;
                    i3 |= i8;
                } else {
                    transferCategoryDuxo2 = transferCategoryDuxo;
                }
                i3 |= i8;
            } else {
                transferCategoryDuxo2 = transferCategoryDuxo;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        i4 = 0;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(TransferCategoryDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.crypto.transfer.verification.category.TransferCategoryComposableKt$TransferCategoryComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.transfer.verification.category.TransferCategoryComposableKt$TransferCategoryComposable$$inlined$duxo$1.1
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
                        i3 &= -57345;
                        transferCategoryDuxo3 = (TransferCategoryDuxo) baseDuxo;
                    } else {
                        i4 = 0;
                        transferCategoryDuxo3 = transferCategoryDuxo2;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    modifier3 = modifier2;
                    transferCategoryDuxo3 = transferCategoryDuxo2;
                    i4 = 0;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1794870827, i3, -1, "com.robinhood.shared.crypto.transfer.verification.category.TransferCategoryComposable (TransferCategoryComposable.kt:53)");
                }
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(transferCategoryDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(transferCategoryDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Object[] objArr = new Object[i4];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.category.TransferCategoryComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TransferCategoryComposable.TransferCategoryComposable$lambda$3$lambda$2();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                Object objConsume = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type android.app.Activity");
                Activity activity = (Activity) objConsume;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new CryptoTransferErrorHandler(activity, null, null, null, null, false, 48, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                cryptoTransferErrorHandler = (CryptoTransferErrorHandler) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                i5 = WhenMappings.$EnumSwitchMapping$0[verificationType.ordinal()];
                if (i5 != 1) {
                    name = Screen.Name.CRYPTO_TRANSFER_RECEIVE_PARTY_SELECTION;
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    name = Screen.Name.CRYPTO_TRANSFER_SEND_PARTY_SELECTION;
                }
                UserInteractionEventDescriptor userInteractionEventDescriptorCopy$default = UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, new Screen(name, null, null, null, 14, null), null, null, null, null, 61, null);
                int i9 = i3;
                final Modifier modifier5 = modifier3;
                int i10 = i4;
                Function2<Composer, Integer, Unit> function2 = new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.verification.category.TransferCategoryComposableKt.TransferCategoryComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11) {
                        if ((i11 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-623919338, i11, -1, "com.robinhood.shared.crypto.transfer.verification.category.TransferCategoryComposable.<anonymous> (TransferCategoryComposable.kt:77)");
                        }
                        Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(modifier5, null, 1, null);
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1773539147, true, new AnonymousClass1(transferCategoryDuxo3, verificationId, verificationType, snapshotState, snapshotState4CollectAsStateWithLifecycle), composer2, 54);
                        final SnapshotState4<TransferCategoryViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                        final SnapshotState<TransferCategory> snapshotState2 = snapshotState;
                        BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierLogScreenTransitions$default, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(-508121602, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.verification.category.TransferCategoryComposableKt.TransferCategoryComposable.1.2

                            /* compiled from: TransferCategoryComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.shared.crypto.transfer.verification.category.TransferCategoryComposableKt$TransferCategoryComposable$1$2$1, reason: invalid class name */
                            static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ SnapshotState<TransferCategory> $transferCategory$delegate;
                                final /* synthetic */ SnapshotState4<TransferCategoryViewState> $viewState$delegate;

                                AnonymousClass1(SnapshotState<TransferCategory> snapshotState, SnapshotState4<TransferCategoryViewState> snapshotState4) {
                                    this.$transferCategory$delegate = snapshotState;
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
                                        ComposerKt.traceEventStart(-121737330, i, -1, "com.robinhood.shared.crypto.transfer.verification.category.TransferCategoryComposable.<anonymous>.<anonymous>.<anonymous> (TransferCategoryComposable.kt:81)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i2 = BentoTheme.$stable;
                                    Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM());
                                    final SnapshotState<TransferCategory> snapshotState = this.$transferCategory$delegate;
                                    SnapshotState4<TransferCategoryViewState> snapshotState4 = this.$viewState$delegate;
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
                                    Modifier modifierWithBentoPlaceholder$default = LocalShowPlaceholder.withBentoPlaceholder$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), false, null, 3, null);
                                    StringResource title = TransferCategoryComposable.TransferCategoryComposable$lambda$0(snapshotState4).getTitle();
                                    int i3 = StringResource.$stable;
                                    BentoText2.m20747BentoText38GnDrw(StringResource2.getString(title, composer, i3), modifierWithBentoPlaceholder$default, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall(), composer, 0, 0, 8188);
                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM()), composer, 0);
                                    Modifier modifierWithBentoPlaceholder$default2 = LocalShowPlaceholder.withBentoPlaceholder$default(companion, false, null, 3, null);
                                    boolean interfaceEnabled = TransferCategoryComposable.TransferCategoryComposable$lambda$0(snapshotState4).getInterfaceEnabled();
                                    BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
                                    BentoSelectionRowState bentoSelectionRowState = new BentoSelectionRowState(type2, StringResource2.getString(TransferCategoryComposable.TransferCategoryComposable$lambda$0(snapshotState4).getFirstPartyText(), composer, i3), TransferCategoryComposable.TransferCategoryComposable$lambda$4(snapshotState) == TransferCategory.FIRST_PARTY, (BentoBaseRowState.Text) null, interfaceEnabled, false, (BentoSelectionRowState.IconPosition) null, true, false, (ImmutableMap) null, (Function0) null, 1896, (DefaultConstructorMarker) null);
                                    composer.startReplaceGroup(5004770);
                                    boolean zChanged = composer.changed(snapshotState);
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.category.TransferCategoryComposableKt$TransferCategoryComposable$1$2$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return TransferCategoryComposable.C385251.AnonymousClass2.AnonymousClass1.invoke$lambda$4$lambda$1$lambda$0(snapshotState);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    int i4 = BentoSelectionRowState.$stable;
                                    BentoSelectionRow2.BentoSelectionRow(modifierWithBentoPlaceholder$default2, bentoSelectionRowState, (Function0) objRememberedValue, composer, i4 << 3, 0);
                                    Modifier modifierWithBentoPlaceholder$default3 = LocalShowPlaceholder.withBentoPlaceholder$default(companion, false, null, 3, null);
                                    BentoSelectionRowState bentoSelectionRowState2 = new BentoSelectionRowState(type2, StringResource2.getString(TransferCategoryComposable.TransferCategoryComposable$lambda$0(snapshotState4).getThirdPartyText(), composer, i3), TransferCategoryComposable.TransferCategoryComposable$lambda$4(snapshotState) == TransferCategory.THIRD_PARTY, (BentoBaseRowState.Text) null, TransferCategoryComposable.TransferCategoryComposable$lambda$0(snapshotState4).getInterfaceEnabled(), false, (BentoSelectionRowState.IconPosition) null, true, false, (ImmutableMap) null, (Function0) null, 1896, (DefaultConstructorMarker) null);
                                    composer.startReplaceGroup(5004770);
                                    boolean zChanged2 = composer.changed(snapshotState);
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.category.TransferCategoryComposableKt$TransferCategoryComposable$1$2$1$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return TransferCategoryComposable.C385251.AnonymousClass2.AnonymousClass1.invoke$lambda$4$lambda$3$lambda$2(snapshotState);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer.endReplaceGroup();
                                    BentoSelectionRow2.BentoSelectionRow(modifierWithBentoPlaceholder$default3, bentoSelectionRowState2, (Function0) objRememberedValue2, composer, i4 << 3, 0);
                                    composer.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$4$lambda$1$lambda$0(SnapshotState snapshotState) {
                                    TransferCategoryComposable.TransferCategoryComposable$lambda$5(snapshotState, TransferCategory.FIRST_PARTY);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$4$lambda$3$lambda$2(SnapshotState snapshotState) {
                                    TransferCategoryComposable.TransferCategoryComposable$lambda$5(snapshotState, TransferCategory.THIRD_PARTY);
                                    return Unit.INSTANCE;
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                                invoke(boxScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer3, int i12) {
                                Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                if ((i12 & 17) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-508121602, i12, -1, "com.robinhood.shared.crypto.transfer.verification.category.TransferCategoryComposable.<anonymous>.<anonymous> (TransferCategoryComposable.kt:80)");
                                }
                                LocalShowPlaceholder.Loadable(TransferCategoryComposable.TransferCategoryComposable$lambda$0(snapshotState4).getShimmer(), null, null, ComposableLambda3.rememberComposableLambda(-121737330, true, new AnonymousClass1(snapshotState2, snapshotState4), composer3, 54), composer3, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 3504, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: TransferCategoryComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.transfer.verification.category.TransferCategoryComposableKt$TransferCategoryComposable$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                        final /* synthetic */ TransferCategoryDuxo $duxo;
                        final /* synthetic */ SnapshotState<TransferCategory> $transferCategory$delegate;
                        final /* synthetic */ UUID $verificationId;
                        final /* synthetic */ VerificationType $verificationType;
                        final /* synthetic */ SnapshotState4<TransferCategoryViewState> $viewState$delegate;

                        AnonymousClass1(TransferCategoryDuxo transferCategoryDuxo, UUID uuid, VerificationType verificationType, SnapshotState<TransferCategory> snapshotState, SnapshotState4<TransferCategoryViewState> snapshotState4) {
                            this.$duxo = transferCategoryDuxo;
                            this.$verificationId = uuid;
                            this.$verificationType = verificationType;
                            this.$transferCategory$delegate = snapshotState;
                            this.$viewState$delegate = snapshotState4;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                            invoke(bentoButtonBar3, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
                            int i2;
                            CryptoTransferContext crypto_transfer_context;
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i & 6) == 0) {
                                i2 = i | ((i & 8) == 0 ? composer.changed(BentoButtonBarScreenLayout) : composer.changedInstance(BentoButtonBarScreenLayout) ? 4 : 2);
                            } else {
                                i2 = i;
                            }
                            if ((i2 & 19) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1773539147, i2, -1, "com.robinhood.shared.crypto.transfer.verification.category.TransferCategoryComposable.<anonymous>.<anonymous> (TransferCategoryComposable.kt:122)");
                            }
                            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                            CryptoTransferContext cryptoTransferContextCopy = null;
                            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                            UserInteractionEventData.Action action = UserInteractionEventData.Action.CONTINUE;
                            Component component = new Component(Component.ComponentType.BUTTON, null, null, 6, null);
                            Context context = userInteractionEventDescriptor.getContext();
                            if (context != null && (crypto_transfer_context = context.getCrypto_transfer_context()) != null) {
                                cryptoTransferContextCopy = crypto_transfer_context.copy((16367 & 1) != 0 ? crypto_transfer_context.currency_id : null, (16367 & 2) != 0 ? crypto_transfer_context.session_id : null, (16367 & 4) != 0 ? crypto_transfer_context.withdrawal_id : null, (16367 & 8) != 0 ? crypto_transfer_context.amount : 0.0d, (16367 & 16) != 0 ? crypto_transfer_context.error_code : null, (16367 & 32) != 0 ? crypto_transfer_context.title : null, (16367 & 64) != 0 ? crypto_transfer_context.completed_kyc : null, (16367 & 128) != 0 ? crypto_transfer_context.completed_mfa : null, (16367 & 256) != 0 ? crypto_transfer_context.security_context : null, (16367 & 512) != 0 ? crypto_transfer_context.transfer_id : null, (16367 & 1024) != 0 ? crypto_transfer_context.party_selection : TransferCategoryComposable.TransferCategoryComposable$lambda$4(this.$transferCategory$delegate).getServerValue(), (16367 & 2048) != 0 ? crypto_transfer_context.wallet_selection : null, (16367 & 4096) != 0 ? crypto_transfer_context.error_message : null, (16367 & 8192) != 0 ? crypto_transfer_context.unknownFields() : null);
                            }
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, action, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cryptoTransferContextCopy, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -257, -1, -1, -1, 16383, null), component, null, 35, null), false, false, false, true, false, null, 110, null);
                            boolean loading = TransferCategoryComposable.TransferCategoryComposable$lambda$0(this.$viewState$delegate).getLoading();
                            String strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_continue_button_label, composer, 0);
                            composer.startReplaceGroup(-1224400529);
                            boolean zChangedInstance = composer.changedInstance(this.$duxo) | composer.changedInstance(this.$verificationId) | composer.changed(this.$verificationType.ordinal()) | composer.changed(this.$transferCategory$delegate);
                            final TransferCategoryDuxo transferCategoryDuxo = this.$duxo;
                            final UUID uuid = this.$verificationId;
                            final VerificationType verificationType = this.$verificationType;
                            final SnapshotState<TransferCategory> snapshotState = this.$transferCategory$delegate;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.category.TransferCategoryComposableKt$TransferCategoryComposable$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return TransferCategoryComposable.C385251.AnonymousClass1.invoke$lambda$1$lambda$0(transferCategoryDuxo, uuid, verificationType, snapshotState);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoButtonBarScreenLayout.PrimaryButtonOnly(modifierAutoLogEvents$default, null, (Function0) objRememberedValue, strStringResource, loading, null, false, composer, (BentoButtonBar3.$stable << 21) | ((i2 << 21) & 29360128), 98);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(TransferCategoryDuxo transferCategoryDuxo, UUID uuid, VerificationType verificationType, SnapshotState snapshotState) {
                            transferCategoryDuxo.submit(uuid, verificationType, TransferCategoryComposable.TransferCategoryComposable$lambda$4(snapshotState));
                            return Unit.INSTANCE;
                        }
                    }
                };
                transferCategoryDuxo4 = transferCategoryDuxo3;
                verificationType2 = verificationType;
                AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptorCopy$default, ComposableLambda3.rememberComposableLambda(-623919338, true, function2, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                eventTransferCategoryComposable$lambda$1 = TransferCategoryComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventTransferCategoryComposable$lambda$1 != null && (eventTransferCategoryComposable$lambda$1.getData() instanceof TransferCategoryDuxo2.Success) && (eventConsumerInvoke2 = eventTransferCategoryComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke2.consume(eventTransferCategoryComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.category.TransferCategoryComposableKt$TransferCategoryComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25193invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25193invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            onTransferCategoryConfirmed.invoke(TransferCategoryComposable.TransferCategoryComposable$lambda$4(snapshotState), ((TransferCategoryDuxo2.Success) eventTransferCategoryComposable$lambda$1.getData()).getNext());
                        }
                    });
                }
                eventTransferCategoryComposable$lambda$12 = TransferCategoryComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventTransferCategoryComposable$lambda$12 != null && (eventTransferCategoryComposable$lambda$12.getData() instanceof TransferCategoryDuxo2.Error) && (eventConsumerInvoke = eventTransferCategoryComposable$lambda$12.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventTransferCategoryComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.category.TransferCategoryComposableKt$TransferCategoryComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25194invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25194invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            AbsErrorHandler.handleError$default(cryptoTransferErrorHandler, ((TransferCategoryDuxo2.Error) eventTransferCategoryComposable$lambda$12.getData()).getThrowable(), false, 2, null);
                        }
                    });
                }
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                i6 = (composerStartRestartGroup.changedInstance(transferCategoryDuxo4) ? 1 : 0) | ((i9 & 112) != 32 ? i10 : 1);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (i6 == 0 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new TransferCategoryComposable2(transferCategoryDuxo4, verificationType2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(verificationType2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, (i9 >> 3) & 14);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                transferCategoryDuxo5 = transferCategoryDuxo4;
                modifier4 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                transferCategoryDuxo5 = transferCategoryDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.verification.category.TransferCategoryComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TransferCategoryComposable.TransferCategoryComposable$lambda$10(verificationId, verificationType2, onTransferCategoryConfirmed, modifier4, transferCategoryDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                if (i7 == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4<TransferCategoryViewState> snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(transferCategoryDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(transferCategoryDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Object[] objArr2 = new Object[i4];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                Object objConsume2 = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                Intrinsics.checkNotNull(objConsume2, "null cannot be cast to non-null type android.app.Activity");
                Activity activity2 = (Activity) objConsume2;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                cryptoTransferErrorHandler = (CryptoTransferErrorHandler) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                i5 = WhenMappings.$EnumSwitchMapping$0[verificationType.ordinal()];
                if (i5 != 1) {
                }
                UserInteractionEventDescriptor userInteractionEventDescriptorCopy$default2 = UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, new Screen(name, null, null, null, 14, null), null, null, null, null, 61, null);
                int i92 = i3;
                final Modifier modifier52 = modifier3;
                int i102 = i4;
                Function2<Composer, Integer, Unit> function22 = new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.verification.category.TransferCategoryComposableKt.TransferCategoryComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11) {
                        if ((i11 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-623919338, i11, -1, "com.robinhood.shared.crypto.transfer.verification.category.TransferCategoryComposable.<anonymous> (TransferCategoryComposable.kt:77)");
                        }
                        Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(modifier52, null, 1, null);
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1773539147, true, new AnonymousClass1(transferCategoryDuxo3, verificationId, verificationType, snapshotState, snapshotState4CollectAsStateWithLifecycle3), composer2, 54);
                        final SnapshotState4<TransferCategoryViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle3;
                        final SnapshotState<TransferCategory> snapshotState2 = snapshotState;
                        BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierLogScreenTransitions$default, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(-508121602, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.verification.category.TransferCategoryComposableKt.TransferCategoryComposable.1.2

                            /* compiled from: TransferCategoryComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.shared.crypto.transfer.verification.category.TransferCategoryComposableKt$TransferCategoryComposable$1$2$1, reason: invalid class name */
                            static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ SnapshotState<TransferCategory> $transferCategory$delegate;
                                final /* synthetic */ SnapshotState4<TransferCategoryViewState> $viewState$delegate;

                                AnonymousClass1(SnapshotState<TransferCategory> snapshotState, SnapshotState4<TransferCategoryViewState> snapshotState4) {
                                    this.$transferCategory$delegate = snapshotState;
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
                                        ComposerKt.traceEventStart(-121737330, i, -1, "com.robinhood.shared.crypto.transfer.verification.category.TransferCategoryComposable.<anonymous>.<anonymous>.<anonymous> (TransferCategoryComposable.kt:81)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i2 = BentoTheme.$stable;
                                    Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM());
                                    final SnapshotState snapshotState = this.$transferCategory$delegate;
                                    SnapshotState4<TransferCategoryViewState> snapshotState4 = this.$viewState$delegate;
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
                                    Modifier modifierWithBentoPlaceholder$default = LocalShowPlaceholder.withBentoPlaceholder$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), false, null, 3, null);
                                    StringResource title = TransferCategoryComposable.TransferCategoryComposable$lambda$0(snapshotState4).getTitle();
                                    int i3 = StringResource.$stable;
                                    BentoText2.m20747BentoText38GnDrw(StringResource2.getString(title, composer, i3), modifierWithBentoPlaceholder$default, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall(), composer, 0, 0, 8188);
                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM()), composer, 0);
                                    Modifier modifierWithBentoPlaceholder$default2 = LocalShowPlaceholder.withBentoPlaceholder$default(companion, false, null, 3, null);
                                    boolean interfaceEnabled = TransferCategoryComposable.TransferCategoryComposable$lambda$0(snapshotState4).getInterfaceEnabled();
                                    BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
                                    BentoSelectionRowState bentoSelectionRowState = new BentoSelectionRowState(type2, StringResource2.getString(TransferCategoryComposable.TransferCategoryComposable$lambda$0(snapshotState4).getFirstPartyText(), composer, i3), TransferCategoryComposable.TransferCategoryComposable$lambda$4(snapshotState) == TransferCategory.FIRST_PARTY, (BentoBaseRowState.Text) null, interfaceEnabled, false, (BentoSelectionRowState.IconPosition) null, true, false, (ImmutableMap) null, (Function0) null, 1896, (DefaultConstructorMarker) null);
                                    composer.startReplaceGroup(5004770);
                                    boolean zChanged = composer.changed(snapshotState);
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.category.TransferCategoryComposableKt$TransferCategoryComposable$1$2$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return TransferCategoryComposable.C385251.AnonymousClass2.AnonymousClass1.invoke$lambda$4$lambda$1$lambda$0(snapshotState);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    int i4 = BentoSelectionRowState.$stable;
                                    BentoSelectionRow2.BentoSelectionRow(modifierWithBentoPlaceholder$default2, bentoSelectionRowState, (Function0) objRememberedValue, composer, i4 << 3, 0);
                                    Modifier modifierWithBentoPlaceholder$default3 = LocalShowPlaceholder.withBentoPlaceholder$default(companion, false, null, 3, null);
                                    BentoSelectionRowState bentoSelectionRowState2 = new BentoSelectionRowState(type2, StringResource2.getString(TransferCategoryComposable.TransferCategoryComposable$lambda$0(snapshotState4).getThirdPartyText(), composer, i3), TransferCategoryComposable.TransferCategoryComposable$lambda$4(snapshotState) == TransferCategory.THIRD_PARTY, (BentoBaseRowState.Text) null, TransferCategoryComposable.TransferCategoryComposable$lambda$0(snapshotState4).getInterfaceEnabled(), false, (BentoSelectionRowState.IconPosition) null, true, false, (ImmutableMap) null, (Function0) null, 1896, (DefaultConstructorMarker) null);
                                    composer.startReplaceGroup(5004770);
                                    boolean zChanged2 = composer.changed(snapshotState);
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.category.TransferCategoryComposableKt$TransferCategoryComposable$1$2$1$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return TransferCategoryComposable.C385251.AnonymousClass2.AnonymousClass1.invoke$lambda$4$lambda$3$lambda$2(snapshotState);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer.endReplaceGroup();
                                    BentoSelectionRow2.BentoSelectionRow(modifierWithBentoPlaceholder$default3, bentoSelectionRowState2, (Function0) objRememberedValue2, composer, i4 << 3, 0);
                                    composer.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$4$lambda$1$lambda$0(SnapshotState snapshotState) {
                                    TransferCategoryComposable.TransferCategoryComposable$lambda$5(snapshotState, TransferCategory.FIRST_PARTY);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$4$lambda$3$lambda$2(SnapshotState snapshotState) {
                                    TransferCategoryComposable.TransferCategoryComposable$lambda$5(snapshotState, TransferCategory.THIRD_PARTY);
                                    return Unit.INSTANCE;
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                                invoke(boxScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer3, int i12) {
                                Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                if ((i12 & 17) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-508121602, i12, -1, "com.robinhood.shared.crypto.transfer.verification.category.TransferCategoryComposable.<anonymous>.<anonymous> (TransferCategoryComposable.kt:80)");
                                }
                                LocalShowPlaceholder.Loadable(TransferCategoryComposable.TransferCategoryComposable$lambda$0(snapshotState4).getShimmer(), null, null, ComposableLambda3.rememberComposableLambda(-121737330, true, new AnonymousClass1(snapshotState2, snapshotState4), composer3, 54), composer3, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 3504, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: TransferCategoryComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.transfer.verification.category.TransferCategoryComposableKt$TransferCategoryComposable$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                        final /* synthetic */ TransferCategoryDuxo $duxo;
                        final /* synthetic */ SnapshotState<TransferCategory> $transferCategory$delegate;
                        final /* synthetic */ UUID $verificationId;
                        final /* synthetic */ VerificationType $verificationType;
                        final /* synthetic */ SnapshotState4<TransferCategoryViewState> $viewState$delegate;

                        AnonymousClass1(TransferCategoryDuxo transferCategoryDuxo, UUID uuid, VerificationType verificationType, SnapshotState<TransferCategory> snapshotState, SnapshotState4<TransferCategoryViewState> snapshotState4) {
                            this.$duxo = transferCategoryDuxo;
                            this.$verificationId = uuid;
                            this.$verificationType = verificationType;
                            this.$transferCategory$delegate = snapshotState;
                            this.$viewState$delegate = snapshotState4;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                            invoke(bentoButtonBar3, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
                            int i2;
                            CryptoTransferContext crypto_transfer_context;
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i & 6) == 0) {
                                i2 = i | ((i & 8) == 0 ? composer.changed(BentoButtonBarScreenLayout) : composer.changedInstance(BentoButtonBarScreenLayout) ? 4 : 2);
                            } else {
                                i2 = i;
                            }
                            if ((i2 & 19) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1773539147, i2, -1, "com.robinhood.shared.crypto.transfer.verification.category.TransferCategoryComposable.<anonymous>.<anonymous> (TransferCategoryComposable.kt:122)");
                            }
                            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                            CryptoTransferContext cryptoTransferContextCopy = null;
                            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                            UserInteractionEventData.Action action = UserInteractionEventData.Action.CONTINUE;
                            Component component = new Component(Component.ComponentType.BUTTON, null, null, 6, null);
                            Context context = userInteractionEventDescriptor.getContext();
                            if (context != null && (crypto_transfer_context = context.getCrypto_transfer_context()) != null) {
                                cryptoTransferContextCopy = crypto_transfer_context.copy((16367 & 1) != 0 ? crypto_transfer_context.currency_id : null, (16367 & 2) != 0 ? crypto_transfer_context.session_id : null, (16367 & 4) != 0 ? crypto_transfer_context.withdrawal_id : null, (16367 & 8) != 0 ? crypto_transfer_context.amount : 0.0d, (16367 & 16) != 0 ? crypto_transfer_context.error_code : null, (16367 & 32) != 0 ? crypto_transfer_context.title : null, (16367 & 64) != 0 ? crypto_transfer_context.completed_kyc : null, (16367 & 128) != 0 ? crypto_transfer_context.completed_mfa : null, (16367 & 256) != 0 ? crypto_transfer_context.security_context : null, (16367 & 512) != 0 ? crypto_transfer_context.transfer_id : null, (16367 & 1024) != 0 ? crypto_transfer_context.party_selection : TransferCategoryComposable.TransferCategoryComposable$lambda$4(this.$transferCategory$delegate).getServerValue(), (16367 & 2048) != 0 ? crypto_transfer_context.wallet_selection : null, (16367 & 4096) != 0 ? crypto_transfer_context.error_message : null, (16367 & 8192) != 0 ? crypto_transfer_context.unknownFields() : null);
                            }
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, action, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cryptoTransferContextCopy, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -257, -1, -1, -1, 16383, null), component, null, 35, null), false, false, false, true, false, null, 110, null);
                            boolean loading = TransferCategoryComposable.TransferCategoryComposable$lambda$0(this.$viewState$delegate).getLoading();
                            String strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_continue_button_label, composer, 0);
                            composer.startReplaceGroup(-1224400529);
                            boolean zChangedInstance = composer.changedInstance(this.$duxo) | composer.changedInstance(this.$verificationId) | composer.changed(this.$verificationType.ordinal()) | composer.changed(this.$transferCategory$delegate);
                            final TransferCategoryDuxo transferCategoryDuxo = this.$duxo;
                            final UUID uuid = this.$verificationId;
                            final VerificationType verificationType = this.$verificationType;
                            final SnapshotState snapshotState = this.$transferCategory$delegate;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.category.TransferCategoryComposableKt$TransferCategoryComposable$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return TransferCategoryComposable.C385251.AnonymousClass1.invoke$lambda$1$lambda$0(transferCategoryDuxo, uuid, verificationType, snapshotState);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoButtonBarScreenLayout.PrimaryButtonOnly(modifierAutoLogEvents$default, null, (Function0) objRememberedValue, strStringResource, loading, null, false, composer, (BentoButtonBar3.$stable << 21) | ((i2 << 21) & 29360128), 98);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(TransferCategoryDuxo transferCategoryDuxo, UUID uuid, VerificationType verificationType, SnapshotState snapshotState) {
                            transferCategoryDuxo.submit(uuid, verificationType, TransferCategoryComposable.TransferCategoryComposable$lambda$4(snapshotState));
                            return Unit.INSTANCE;
                        }
                    }
                };
                transferCategoryDuxo4 = transferCategoryDuxo3;
                verificationType2 = verificationType;
                AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptorCopy$default2, ComposableLambda3.rememberComposableLambda(-623919338, true, function22, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                eventTransferCategoryComposable$lambda$1 = TransferCategoryComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventTransferCategoryComposable$lambda$1 != null) {
                    eventConsumerInvoke2.consume(eventTransferCategoryComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.category.TransferCategoryComposableKt$TransferCategoryComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25193invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25193invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            onTransferCategoryConfirmed.invoke(TransferCategoryComposable.TransferCategoryComposable$lambda$4(snapshotState), ((TransferCategoryDuxo2.Success) eventTransferCategoryComposable$lambda$1.getData()).getNext());
                        }
                    });
                }
                eventTransferCategoryComposable$lambda$12 = TransferCategoryComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventTransferCategoryComposable$lambda$12 != null) {
                    eventConsumerInvoke.consume(eventTransferCategoryComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.category.TransferCategoryComposableKt$TransferCategoryComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25194invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25194invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            AbsErrorHandler.handleError$default(cryptoTransferErrorHandler, ((TransferCategoryDuxo2.Error) eventTransferCategoryComposable$lambda$12.getData()).getThrowable(), false, 2, null);
                        }
                    });
                }
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                i6 = (composerStartRestartGroup.changedInstance(transferCategoryDuxo4) ? 1 : 0) | ((i92 & 112) != 32 ? i102 : 1);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (i6 == 0) {
                    objRememberedValue3 = new TransferCategoryComposable2(transferCategoryDuxo4, verificationType2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(verificationType2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, (i92 >> 3) & 14);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    transferCategoryDuxo5 = transferCategoryDuxo4;
                    modifier4 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState TransferCategoryComposable$lambda$3$lambda$2() {
        return SnapshotState3.mutableStateOf$default(TransferCategory.FIRST_PARTY, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransferCategoryViewState TransferCategoryComposable$lambda$0(SnapshotState4<TransferCategoryViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<TransferCategoryDuxo2> TransferCategoryComposable$lambda$1(SnapshotState4<Event<TransferCategoryDuxo2>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransferCategory TransferCategoryComposable$lambda$4(SnapshotState<TransferCategory> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TransferCategoryComposable$lambda$5(SnapshotState<TransferCategory> snapshotState, TransferCategory transferCategory) {
        snapshotState.setValue(transferCategory);
    }
}
