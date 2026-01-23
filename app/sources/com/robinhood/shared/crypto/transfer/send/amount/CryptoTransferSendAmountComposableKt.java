package com.robinhood.shared.crypto.transfer.send.amount;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.view.KeyEvent;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SheetValue;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
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
import androidx.view.compose.ActivityResultRegistry3;
import androidx.view.compose.ActivityResultRegistry8;
import androidx.view.compose.LocalActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.crypto.contracts.CryptoOrderIntentKey;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoProgressBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.component.numpad.BentoNumpad4;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScreenLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.AnimateShake;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.models.api.ErrorResponse3;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.CryptoTransferContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.contracts.CryptoSettings;
import com.robinhood.shared.crypto.contracts.lib.TradeAction;
import com.robinhood.shared.crypto.contracts.transfers.CryptoTransferVerificationIntentKey2;
import com.robinhood.shared.crypto.contracts.transfers.CryptoTransferVerificationIntentKey3;
import com.robinhood.shared.crypto.transfer.GatewayDeepLinkIntent;
import com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt;
import com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountEvent;
import com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountFragment;
import com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountSheetContent;
import com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountViewState;
import com.robinhood.shared.lib.crypto.transfer.CryptoTransferErrorHandler;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoTransferSendAmountComposable.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001aa\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u0012H\u0003¢\u0006\u0002\u0010\u0019\u001a\u001d\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016H\u0003¢\u0006\u0002\u0010\u001b\u001aP\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\n\u0010%\u001a\u00060&j\u0002`'2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00010)H\u0002¨\u0006*²\u0006\n\u0010+\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010,\u001a\u00020-X\u008a\u0084\u0002²\u0006\n\u0010.\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\f\u0010/\u001a\u0004\u0018\u000100X\u008a\u008e\u0002²\u0006\n\u00101\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\n\u00102\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\u0012\u00103\u001a\n\u0012\u0004\u0012\u000205\u0018\u000104X\u008a\u0084\u0002²\u0006\f\u00106\u001a\u0004\u0018\u000107X\u008a\u008e\u0002²\u0006\f\u00108\u001a\u0004\u0018\u000109X\u008a\u008e\u0002"}, m3636d2 = {"CryptoTransferSendAmountComposable", "", "args", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountFragment$Args;", "callbacks", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountFragment$Callbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountDuxo;", "(Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountFragment$Args;Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountFragment$Callbacks;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountDuxo;Landroidx/compose/runtime/Composer;II)V", "AmountDetails", "availableText", "", "typedAmountText", "estimatedAmountText", "sendAllButtonText", "isSendAllButtonEnabled", "", "onSendAllButtonClick", "Lkotlin/Function0;", "shakeAnimationKey", "", "showAvailabilitySheet", "canShowAvailabilitySheet", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;ILkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "QuantityText", "(Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)V", "handleError", "activity", "Landroid/app/Activity;", "errorWrapper", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$CryptoValidationErrorWrapper;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "onErrorWithAddress", "Lkotlin/Function1;", "feature-crypto-transfer_externalDebug", "menuItemText", "viewState", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState;", "showBottomSheet", "sheetContent", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountSheetContent;", "buyPromptHasBeenDismissedOnceThisFlow", "shouldLogFirstInput", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountEvent;", "showInsufficientHoldingsDialog", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountEvent$InsufficientHoldings;", "showInputModeSelectorBottomSheet", "Lcom/robinhood/shared/crypto/transfer/send/amount/InputModeSelectorSheetContentState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CryptoTransferSendAmountComposableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AmountDetails$lambda$9(String str, String str2, String str3, String str4, boolean z, Function0 function0, int i, Function0 function02, boolean z2, int i2, Composer composer, int i3) {
        AmountDetails(str, str2, str3, str4, z, function0, i, function02, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTransferSendAmountComposable$lambda$3(CryptoTransferSendAmountFragment.Args args, CryptoTransferSendAmountFragment.Callbacks callbacks, Modifier modifier, CryptoTransferSendAmountDuxo cryptoTransferSendAmountDuxo, int i, int i2, Composer composer, int i3) {
        CryptoTransferSendAmountComposable(args, callbacks, modifier, cryptoTransferSendAmountDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuantityText$lambda$10(String str, int i, int i2, Composer composer, int i3) {
        QuantityText(str, i, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoTransferSendAmountComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2 */
    static final class C382952 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ CryptoTransferSendAmountFragment.Args $args;
        final /* synthetic */ CryptoTransferSendAmountFragment.Callbacks $callbacks;
        final /* synthetic */ CryptoTransferSendAmountDuxo $duxo;
        final /* synthetic */ SnapshotState<String> $menuItemText$delegate;

        C382952(CryptoTransferSendAmountDuxo cryptoTransferSendAmountDuxo, CryptoTransferSendAmountFragment.Args args, Activity activity, CryptoTransferSendAmountFragment.Callbacks callbacks, SnapshotState<String> snapshotState) {
            this.$duxo = cryptoTransferSendAmountDuxo;
            this.$args = args;
            this.$activity = activity;
            this.$callbacks = callbacks;
            this.$menuItemText$delegate = snapshotState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Navigator invoke$lambda$14$lambda$13(Navigator navigator) {
            return navigator;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$22$lambda$21(SheetValue it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$40$lambda$39$lambda$38(SheetValue it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return false;
        }

        /* compiled from: CryptoTransferSendAmountComposable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2$3, reason: invalid class name */
        static final class AnonymousClass3 implements Function3<BentoNumpad4, Composer, Integer, Unit> {
            final /* synthetic */ CryptoTransferSendAmountDuxo $duxo;
            final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
            final /* synthetic */ EventLogger $eventLogger;
            final /* synthetic */ Function0<Unit> $onReviewButtonClick;
            final /* synthetic */ SnapshotState4<CryptoTransferSendAmountViewState> $viewState$delegate;

            AnonymousClass3(CryptoTransferSendAmountDuxo cryptoTransferSendAmountDuxo, UserInteractionEventDescriptor userInteractionEventDescriptor, SnapshotState4<CryptoTransferSendAmountViewState> snapshotState4, EventLogger eventLogger, Function0<Unit> function0) {
                this.$duxo = cryptoTransferSendAmountDuxo;
                this.$eventDescriptor = userInteractionEventDescriptor;
                this.$viewState$delegate = snapshotState4;
                this.$eventLogger = eventLogger;
                this.$onReviewButtonClick = function0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean invoke$lambda$1(SnapshotState<Boolean> snapshotState) {
                return snapshotState.getValue().booleanValue();
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BentoNumpad4 bentoNumpad4, Composer composer, Integer num) {
                invoke(bentoNumpad4, composer, num.intValue());
                return Unit.INSTANCE;
            }

            private static final void invoke$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
                snapshotState.setValue(Boolean.valueOf(z));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$6$lambda$5(UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, Function0 function0, SnapshotState4 snapshotState4) {
                CryptoTransferContext crypto_transfer_context;
                Screen screen = userInteractionEventDescriptor.getScreen();
                Context context = userInteractionEventDescriptor.getContext();
                Context contextCopy$default = null;
                cryptoTransferContextCopy = null;
                CryptoTransferContext cryptoTransferContextCopy = null;
                if (context != null) {
                    Context context2 = userInteractionEventDescriptor.getContext();
                    if (context2 != null && (crypto_transfer_context = context2.getCrypto_transfer_context()) != null) {
                        cryptoTransferContextCopy = crypto_transfer_context.copy((16367 & 1) != 0 ? crypto_transfer_context.currency_id : null, (16367 & 2) != 0 ? crypto_transfer_context.session_id : null, (16367 & 4) != 0 ? crypto_transfer_context.withdrawal_id : null, (16367 & 8) != 0 ? crypto_transfer_context.amount : C382952.invoke$lambda$0(snapshotState4).getTypedAmount(), (16367 & 16) != 0 ? crypto_transfer_context.error_code : null, (16367 & 32) != 0 ? crypto_transfer_context.title : null, (16367 & 64) != 0 ? crypto_transfer_context.completed_kyc : null, (16367 & 128) != 0 ? crypto_transfer_context.completed_mfa : null, (16367 & 256) != 0 ? crypto_transfer_context.security_context : null, (16367 & 512) != 0 ? crypto_transfer_context.transfer_id : null, (16367 & 1024) != 0 ? crypto_transfer_context.party_selection : null, (16367 & 2048) != 0 ? crypto_transfer_context.wallet_selection : null, (16367 & 4096) != 0 ? crypto_transfer_context.error_message : null, (16367 & 8192) != 0 ? crypto_transfer_context.unknownFields() : null);
                    }
                    contextCopy$default = Context.copy$default(context, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cryptoTransferContextCopy, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -257, -1, -1, -1, 16383, null);
                }
                EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.CONTINUE, screen, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, contextCopy$default, false, 40, null);
                function0.invoke();
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$4$lambda$3(CryptoTransferSendAmountDuxo cryptoTransferSendAmountDuxo, SnapshotState snapshotState, KeyEvent keyEvent) {
                Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
                if (!invoke$lambda$1(snapshotState)) {
                    invoke$lambda$2(snapshotState, true);
                }
                cryptoTransferSendAmountDuxo.consumeKeyEvent(keyEvent);
                return Unit.INSTANCE;
            }

            public final void invoke(BentoNumpad4 BentoNumpadScreenLayout, Composer composer, int i) {
                int i2;
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
                    ComposerKt.traceEventStart(-1760448634, i2, -1, "com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposable.<anonymous>.<anonymous> (CryptoTransferSendAmountComposable.kt:208)");
                }
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composer.endReplaceGroup();
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.ENTER_TRANSFER_AMOUNT, null, null, null, 59, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_action_review, composer, 0);
                boolean zIsReviewButtonEnabled = C382952.invoke$lambda$0(this.$viewState$delegate).isReviewButtonEnabled();
                boolean zIsLoading = C382952.invoke$lambda$0(this.$viewState$delegate).isLoading();
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composer.changedInstance(this.$duxo);
                final CryptoTransferSendAmountDuxo cryptoTransferSendAmountDuxo = this.$duxo;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoTransferSendAmountComposableKt.C382952.AnonymousClass3.invoke$lambda$4$lambda$3(cryptoTransferSendAmountDuxo, snapshotState, (KeyEvent) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function1<? super KeyEvent, Unit> function1 = (Function1) objRememberedValue2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1224400529);
                boolean zChangedInstance2 = composer.changedInstance(this.$eventDescriptor) | composer.changed(this.$viewState$delegate) | composer.changedInstance(this.$eventLogger) | composer.changed(this.$onReviewButtonClick);
                final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
                final EventLogger eventLogger = this.$eventLogger;
                final Function0<Unit> function0 = this.$onReviewButtonClick;
                final SnapshotState4<CryptoTransferSendAmountViewState> snapshotState4 = this.$viewState$delegate;
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2$3$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoTransferSendAmountComposableKt.C382952.AnonymousClass3.invoke$lambda$6$lambda$5(userInteractionEventDescriptor, eventLogger, function0, snapshotState4);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                BentoNumpadScreenLayout.BentoNumpadWithButton(modifierAutoLogEvents$default, function1, strStringResource, (Function0) objRememberedValue3, false, zIsReviewButtonEnabled, true, zIsLoading, false, true, null, false, composer, 806879232, ((i2 << 6) & 896) | (BentoNumpad4.$stable << 6), 3344);
                Boolean boolValueOf = Boolean.valueOf(invoke$lambda$1(snapshotState));
                composer.startReplaceGroup(-1746271574);
                boolean zChangedInstance3 = composer.changedInstance(this.$eventDescriptor) | composer.changedInstance(this.$eventLogger);
                UserInteractionEventDescriptor userInteractionEventDescriptor2 = this.$eventDescriptor;
                EventLogger eventLogger2 = this.$eventLogger;
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new C38300x50d5614(userInteractionEventDescriptor2, eventLogger2, snapshotState, null);
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CryptoTransferSendAmountViewState invoke$lambda$0(SnapshotState4<CryptoTransferSendAmountViewState> snapshotState4) {
            return snapshotState4.getValue();
        }

        private static final Event<CryptoTransferSendAmountEvent> invoke$lambda$17(SnapshotState4<Event<CryptoTransferSendAmountEvent>> snapshotState4) {
            return snapshotState4.getValue();
        }

        private static final boolean invoke$lambda$2(SnapshotState<Boolean> snapshotState) {
            return snapshotState.getValue().booleanValue();
        }

        private static final CryptoTransferSendAmountEvent.InsufficientHoldings invoke$lambda$24(SnapshotState<CryptoTransferSendAmountEvent.InsufficientHoldings> snapshotState) {
            return snapshotState.getValue();
        }

        private static final InputModeSelectorSheetContentState invoke$lambda$34(SnapshotState<InputModeSelectorSheetContentState> snapshotState) {
            return snapshotState.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CryptoTransferSendAmountSheetContent invoke$lambda$5(SnapshotState<CryptoTransferSendAmountSheetContent> snapshotState) {
            return snapshotState.getValue();
        }

        private static final boolean invoke$lambda$8(SnapshotState<Boolean> snapshotState) {
            return snapshotState.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$6(SnapshotState<CryptoTransferSendAmountSheetContent> snapshotState, CryptoTransferSendAmountSheetContent cryptoTransferSendAmountSheetContent) {
            snapshotState.setValue(cryptoTransferSendAmountSheetContent);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
            snapshotState.setValue(Boolean.valueOf(z));
        }

        private static final void invoke$lambda$9(SnapshotState<Boolean> snapshotState, boolean z) {
            snapshotState.setValue(Boolean.valueOf(z));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$12$lambda$11(CryptoTransferSendAmountFragment.Args args, CryptoTransferSendAmountDuxo cryptoTransferSendAmountDuxo, SnapshotState4 snapshotState4) {
            cryptoTransferSendAmountDuxo.prepareWithdrawal(args.getUiCurrencyPair(), args.getAddress(), invoke$lambda$0(snapshotState4).getAmount(), invoke$lambda$0(snapshotState4).isAmountInFiat(), invoke$lambda$0(snapshotState4).isFullAmount(), invoke$lambda$0(snapshotState4).getNetworkCode(), invoke$lambda$0(snapshotState4).getAddressTag(), args.getLoggingSessionId());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$16$lambda$15(Function0 function0, CryptoTransferVerificationIntentKey3 cryptoTransferVerificationIntentKey3) {
            if (Intrinsics.areEqual(cryptoTransferVerificationIntentKey3, CryptoTransferVerificationIntentKey3.Completed.INSTANCE)) {
                function0.invoke();
            } else if (!Intrinsics.areEqual(cryptoTransferVerificationIntentKey3, CryptoTransferVerificationIntentKey3.Canceled.INSTANCE) && cryptoTransferVerificationIntentKey3 != null) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoTransferSendAmountComposable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2$2, reason: invalid class name */
        static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ String $amountAvailableForWithdrawal;
            final /* synthetic */ CryptoTransferSendAmountDuxo $duxo;
            final /* synthetic */ SnapshotState<CryptoTransferSendAmountSheetContent> $sheetContent$delegate;
            final /* synthetic */ SnapshotState<Boolean> $showBottomSheet$delegate;
            final /* synthetic */ SnapshotState4<CryptoTransferSendAmountViewState> $viewState$delegate;

            AnonymousClass2(CryptoTransferSendAmountDuxo cryptoTransferSendAmountDuxo, String str, SnapshotState4<CryptoTransferSendAmountViewState> snapshotState4, SnapshotState<CryptoTransferSendAmountSheetContent> snapshotState, SnapshotState<Boolean> snapshotState2) {
                this.$duxo = cryptoTransferSendAmountDuxo;
                this.$amountAvailableForWithdrawal = str;
                this.$viewState$delegate = snapshotState4;
                this.$sheetContent$delegate = snapshotState;
                this.$showBottomSheet$delegate = snapshotState2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                String string2;
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1819535478, i, -1, "com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposable.<anonymous>.<anonymous> (CryptoTransferSendAmountComposable.kt:184)");
                }
                StringResource availableText = C382952.invoke$lambda$0(this.$viewState$delegate).getAvailableText();
                int i2 = StringResource.$stable;
                String string3 = StringResource2.getString(availableText, composer, i2);
                String string4 = StringResource2.getString(C382952.invoke$lambda$0(this.$viewState$delegate).getTypedAmountText(), composer, i2);
                if (C382952.invoke$lambda$0(this.$viewState$delegate).getOverTransferLimit()) {
                    composer.startReplaceGroup(-1000558897);
                    string2 = StringResource2.getString(C382952.invoke$lambda$0(this.$viewState$delegate).getOverAvailableAmountText(), composer, i2);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-1000460813);
                    string2 = StringResource2.getString(C382952.invoke$lambda$0(this.$viewState$delegate).getEstimatedAmountText(), composer, i2);
                    composer.endReplaceGroup();
                }
                String str = string2;
                String string5 = StringResource2.getString(C382952.invoke$lambda$0(this.$viewState$delegate).getSendAllButtonText(), composer, i2);
                boolean zIsSendAllButtonEnabled = C382952.invoke$lambda$0(this.$viewState$delegate).isSendAllButtonEnabled();
                CryptoTransferSendAmountDuxo cryptoTransferSendAmountDuxo = this.$duxo;
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(cryptoTransferSendAmountDuxo);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new C38299x4ff3711(cryptoTransferSendAmountDuxo);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                Function0 function0 = (Function0) ((KFunction) objRememberedValue);
                int shakeAnimationKey = C382952.invoke$lambda$0(this.$viewState$delegate).getShakeAnimationKey();
                composer.startReplaceGroup(-1746271574);
                boolean zChanged = composer.changed(this.$amountAvailableForWithdrawal);
                final String str2 = this.$amountAvailableForWithdrawal;
                final SnapshotState<CryptoTransferSendAmountSheetContent> snapshotState = this.$sheetContent$delegate;
                final SnapshotState<Boolean> snapshotState2 = this.$showBottomSheet$delegate;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoTransferSendAmountComposableKt.C382952.AnonymousClass2.invoke$lambda$2$lambda$1(str2, snapshotState, snapshotState2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function0 function02 = (Function0) objRememberedValue2;
                composer.endReplaceGroup();
                CryptoTransferSendAmountComposableKt.AmountDetails(string3, string4, str, string5, zIsSendAllButtonEnabled, function0, shakeAnimationKey, function02, this.$amountAvailableForWithdrawal != null, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$2$lambda$1(String str, SnapshotState snapshotState, SnapshotState snapshotState2) {
                if (str != null) {
                    C382952.invoke$lambda$6(snapshotState, new CryptoTransferSendAmountSheetContent.AmountAvailableSheetContent(str));
                    C382952.invoke$lambda$3(snapshotState2, true);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$20$lambda$19(SnapshotState snapshotState) {
            invoke$lambda$3(snapshotState, false);
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoTransferSendAmountComposable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2$7, reason: invalid class name */
        static final class AnonymousClass7 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
            final /* synthetic */ CryptoTransferSendAmountFragment.Callbacks $callbacks;
            final /* synthetic */ android.content.Context $context;
            final /* synthetic */ Navigator $navigator;
            final /* synthetic */ SnapshotState<CryptoTransferSendAmountSheetContent> $sheetContent$delegate;
            final /* synthetic */ SnapshotState4<CryptoTransferSendAmountViewState> $viewState$delegate;

            AnonymousClass7(Navigator navigator, android.content.Context context, CryptoTransferSendAmountFragment.Callbacks callbacks, SnapshotState<CryptoTransferSendAmountSheetContent> snapshotState, SnapshotState4<CryptoTransferSendAmountViewState> snapshotState4) {
                this.$navigator = navigator;
                this.$context = context;
                this.$callbacks = callbacks;
                this.$sheetContent$delegate = snapshotState;
                this.$viewState$delegate = snapshotState4;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
                invoke(rhModalBottomSheet5, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(final RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
                int i2;
                Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                if ((i & 6) == 0) {
                    i2 = ((i & 8) == 0 ? composer.changed(RhModalBottomSheet) : composer.changedInstance(RhModalBottomSheet) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i2 & 19) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(260925869, i2, -1, "com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposable.<anonymous>.<anonymous> (CryptoTransferSendAmountComposable.kt:278)");
                }
                final CryptoTransferSendAmountSheetContent cryptoTransferSendAmountSheetContentInvoke$lambda$5 = C382952.invoke$lambda$5(this.$sheetContent$delegate);
                boolean z = false;
                if (cryptoTransferSendAmountSheetContentInvoke$lambda$5 instanceof CryptoTransferSendAmountSheetContent.AmountAvailableSheetContent) {
                    composer.startReplaceGroup(-648095966);
                    final String string2 = StringResource2.getString(C382952.invoke$lambda$0(this.$viewState$delegate).getLearnMoreUrl(), composer, StringResource.$stable);
                    String amountAvailableForWithdrawal = ((CryptoTransferSendAmountSheetContent.AmountAvailableSheetContent) cryptoTransferSendAmountSheetContentInvoke$lambda$5).getAmountAvailableForWithdrawal();
                    String bodyTextLoggingIdentifier = C382952.invoke$lambda$0(this.$viewState$delegate).getBodyTextLoggingIdentifier();
                    composer.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context);
                    final Navigator navigator = this.$navigator;
                    final android.content.Context context = this.$context;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2$7$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoTransferSendAmountComposableKt.C382952.AnonymousClass7.invoke$lambda$1$lambda$0(navigator, context);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function0 = (Function0) objRememberedValue;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(5004770);
                    int i3 = i2 & 14;
                    if (i3 == 4 || ((i2 & 8) != 0 && composer.changedInstance(RhModalBottomSheet))) {
                        z = true;
                    }
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2$7$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoTransferSendAmountComposableKt.C382952.AnonymousClass7.invoke$lambda$3$lambda$2(RhModalBottomSheet);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    Function0 function02 = (Function0) objRememberedValue2;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(-1746271574);
                    boolean zChangedInstance2 = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context) | composer.changed(string2);
                    final Navigator navigator2 = this.$navigator;
                    final android.content.Context context2 = this.$context;
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2$7$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoTransferSendAmountComposableKt.C382952.AnonymousClass7.invoke$lambda$5$lambda$4(navigator2, context2, string2);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    composer.endReplaceGroup();
                    AmountAvailableSheetContent2.AmountAvailableSheetContent(RhModalBottomSheet, amountAvailableForWithdrawal, bodyTextLoggingIdentifier, function0, function02, (Function0) objRememberedValue3, C382952.invoke$lambda$0(this.$viewState$delegate).getAmountAvailabilityPrimary(), C382952.invoke$lambda$0(this.$viewState$delegate).getAmountAvailabilitySecondary(), composer, RhModalBottomSheet5.$stable | i3);
                    composer.endReplaceGroup();
                } else if (cryptoTransferSendAmountSheetContentInvoke$lambda$5 instanceof CryptoTransferSendAmountSheetContent.WarningSheetContent) {
                    composer.startReplaceGroup(-646778125);
                    CryptoTransferSendAmountSheetContent.WarningSheetContent warningSheetContent = (CryptoTransferSendAmountSheetContent.WarningSheetContent) cryptoTransferSendAmountSheetContentInvoke$lambda$5;
                    int i4 = i2;
                    String title = warningSheetContent.getTitle();
                    String descriptionMarkdown = warningSheetContent.getDescriptionMarkdown();
                    CryptoTransferSendAmountViewState.WithdrawalWarningButtonState primaryCta = warningSheetContent.getPrimaryCta();
                    CryptoTransferSendAmountViewState.WithdrawalWarningButtonState secondaryCta = warningSheetContent.getSecondaryCta();
                    composer.startReplaceGroup(-1633490746);
                    boolean zChangedInstance3 = composer.changedInstance(this.$callbacks) | composer.changed(cryptoTransferSendAmountSheetContentInvoke$lambda$5);
                    final CryptoTransferSendAmountFragment.Callbacks callbacks = this.$callbacks;
                    Object objRememberedValue4 = composer.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2$7$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoTransferSendAmountComposableKt.C382952.AnonymousClass7.invoke$lambda$7$lambda$6(callbacks, cryptoTransferSendAmountSheetContentInvoke$lambda$5);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue4);
                    }
                    composer.endReplaceGroup();
                    WarningSheetContent6.WarningSheetContent(RhModalBottomSheet, title, descriptionMarkdown, primaryCta, secondaryCta, (Function0) objRememberedValue4, null, 0.0f, composer, RhModalBottomSheet5.$stable | (i4 & 14), 96);
                    composer.endReplaceGroup();
                } else {
                    if (cryptoTransferSendAmountSheetContentInvoke$lambda$5 != null) {
                        composer.startReplaceGroup(1641659561);
                        composer.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer.startReplaceGroup(1641721109);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(0)), composer, 6);
                    composer.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$1$lambda$0(Navigator navigator, android.content.Context context) {
                Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, CryptoSettings.INSTANCE, false, false, false, false, null, false, null, null, 1020, null);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$3$lambda$2(RhModalBottomSheet5 rhModalBottomSheet5) {
                RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$5$lambda$4(Navigator navigator, android.content.Context context, String str) {
                Navigators3.showHelpCenterWebViewFragment(navigator, context, str);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$7$lambda$6(CryptoTransferSendAmountFragment.Callbacks callbacks, CryptoTransferSendAmountSheetContent cryptoTransferSendAmountSheetContent) {
                callbacks.reviewWithdrawalDetails(((CryptoTransferSendAmountSheetContent.WarningSheetContent) cryptoTransferSendAmountSheetContent).getWithdrawalData());
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$32$lambda$27$lambda$26(Navigator navigator, android.content.Context context, CryptoTransferSendAmountFragment.Args args) {
            Navigator.DefaultImpls.startActivity$default(navigator, context, new CryptoOrderIntentKey(args.getUiCurrencyPair().getId(), TradeAction.BUY, null, null, null, 28, null), null, false, null, null, 60, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$32$lambda$29$lambda$28(CryptoTransferSendAmountEvent.InsufficientHoldings insufficientHoldings, Activity activity, SnapshotState snapshotState, SnapshotState snapshotState2) {
            if (insufficientHoldings.isFromGateway() && activity != null) {
                try {
                    activity.finish();
                    activity.startActivity(GatewayDeepLinkIntent.gatewayDeepLinkIntent$default(null, 1, null));
                } catch (ActivityNotFoundException unused) {
                }
            }
            invoke$lambda$9(snapshotState, true);
            snapshotState2.setValue(null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$32$lambda$31$lambda$30(SnapshotState snapshotState, SnapshotState snapshotState2) {
            snapshotState.setValue(null);
            invoke$lambda$9(snapshotState2, true);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$40$lambda$37$lambda$36(SnapshotState snapshotState) {
            snapshotState.setValue(null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$48$lambda$47(SnapshotState4 snapshotState4, final Activity activity, final UserInteractionEventDescriptor userInteractionEventDescriptor, final CryptoTransferSendAmountFragment.Callbacks callbacks, final CryptoTransferSendAmountFragment.Args args, final EventLogger eventLogger) {
            EventConsumer<CryptoTransferSendAmountEvent> eventConsumerInvoke;
            final Event<CryptoTransferSendAmountEvent> eventInvoke$lambda$17 = invoke$lambda$17(snapshotState4);
            if (eventInvoke$lambda$17 != null && (eventInvoke$lambda$17.getData() instanceof CryptoTransferSendAmountEvent.InputErrorEvent) && (eventConsumerInvoke = eventInvoke$lambda$17.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke.consume(eventInvoke$lambda$17, new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2$invoke$lambda$48$lambda$47$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m25103invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m25103invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        CryptoTransferSendAmountViewState.CryptoValidationErrorWrapper error = ((CryptoTransferSendAmountEvent.InputErrorEvent) eventInvoke$lambda$17.getData()).getError();
                        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type android.app.Activity");
                        Activity activity2 = activity;
                        Screen screen = userInteractionEventDescriptor.getScreen();
                        if (screen == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        Context context = userInteractionEventDescriptor.getContext();
                        if (context == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        CryptoTransferSendAmountComposableKt.handleError(activity2, args, error, eventLogger, screen, context, new C38297x8594eae6(callbacks));
                    }
                });
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r15v17, types: [androidx.compose.runtime.SnapshotMutationPolicy, java.lang.Object, kotlin.coroutines.Continuation] */
        /* JADX WARN: Type inference failed for: r15v18 */
        /* JADX WARN: Type inference failed for: r15v21 */
        public final void invoke(PaddingValues contentPadding, Composer composer, int i) {
            int i2;
            Composer composer2;
            int i3;
            ActivityResultRegistry8 activityResultRegistry8;
            UserInteractionEventDescriptor userInteractionEventDescriptor;
            SnapshotState4 snapshotState4;
            EventLogger eventLogger;
            final android.content.Context context;
            final Navigator navigator;
            SnapshotState4 snapshotState42;
            Object obj;
            final SnapshotState snapshotState;
            Object obj2;
            final SnapshotState snapshotState2;
            ?? r15;
            EventConsumer<CryptoTransferSendAmountEvent> eventConsumerInvoke;
            EventConsumer<CryptoTransferSendAmountEvent> eventConsumerInvoke2;
            EventConsumer<CryptoTransferSendAmountEvent> eventConsumerInvoke3;
            EventConsumer<CryptoTransferSendAmountEvent> eventConsumerInvoke4;
            EventConsumer<CryptoTransferSendAmountEvent> eventConsumerInvoke5;
            EventConsumer<CryptoTransferSendAmountEvent> eventConsumerInvoke6;
            Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(contentPadding) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1698303623, i2, -1, "com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposable.<anonymous> (CryptoTransferSendAmountComposable.kt:125)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(this.$duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 0, 7);
            StringResource amountAvailableForWithdrawal = invoke$lambda$0(snapshotState4CollectAsStateWithLifecycle).getAmountAvailableForWithdrawal();
            composer.startReplaceGroup(17796324);
            String string2 = amountAvailableForWithdrawal == null ? null : StringResource2.getString(amountAvailableForWithdrawal, composer, StringResource.$stable);
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState snapshotState5 = (SnapshotState) objRememberedValue2;
            composer.endReplaceGroup();
            EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer, AutoLoggingCompositionLocals4.$stable);
            UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            final Navigator navigator2 = (Navigator) composer.consume(LocalNavigator.getLocalNavigator());
            android.content.Context context2 = (android.content.Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(objRememberedValue3);
            }
            SnapshotState snapshotState6 = (SnapshotState) objRememberedValue3;
            composer.endReplaceGroup();
            Boolean boolValueOf = Boolean.valueOf(invoke$lambda$0(snapshotState4CollectAsStateWithLifecycle).getOverTransferLimit());
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(snapshotState4CollectAsStateWithLifecycle) | composer.changedInstance(this.$duxo);
            CryptoTransferSendAmountDuxo cryptoTransferSendAmountDuxo = this.$duxo;
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new C38296x9971ffc3(cryptoTransferSendAmountDuxo, snapshotState4CollectAsStateWithLifecycle, null);
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer, 0);
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(this.$args) | composer.changed(snapshotState4CollectAsStateWithLifecycle) | composer.changedInstance(this.$duxo);
            final CryptoTransferSendAmountFragment.Args args = this.$args;
            final CryptoTransferSendAmountDuxo cryptoTransferSendAmountDuxo2 = this.$duxo;
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoTransferSendAmountComposableKt.C382952.invoke$lambda$12$lambda$11(args, cryptoTransferSendAmountDuxo2, snapshotState4CollectAsStateWithLifecycle);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            final Function0 function0 = (Function0) objRememberedValue5;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(navigator2);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoTransferSendAmountComposableKt.C382952.invoke$lambda$14$lambda$13(navigator2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue6);
            }
            composer.endReplaceGroup();
            CryptoTransferVerificationIntentKey2 cryptoTransferVerificationIntentKey2 = new CryptoTransferVerificationIntentKey2((Function0) objRememberedValue6);
            composer.startReplaceGroup(5004770);
            boolean zChanged2 = composer.changed(function0);
            Object objRememberedValue7 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return CryptoTransferSendAmountComposableKt.C382952.invoke$lambda$16$lambda$15(function0, (CryptoTransferVerificationIntentKey3) obj3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue7);
            }
            composer.endReplaceGroup();
            ActivityResultRegistry8 activityResultRegistry8RememberLauncherForActivityResult = ActivityResultRegistry3.rememberLauncherForActivityResult(cryptoTransferVerificationIntentKey2, (Function1) objRememberedValue7, composer, 0);
            BentoNumpadScreenLayout.BentoNumpadScreenLayout(ModifiersKt.autoLogEvents$default(PaddingKt.padding(Modifier.INSTANCE, contentPadding), null, true, false, true, false, false, null, 117, null), ComposableLambda3.rememberComposableLambda(1819535478, true, new AnonymousClass2(this.$duxo, string2, snapshotState4CollectAsStateWithLifecycle, snapshotState5, snapshotState3), composer, 54), ComposableLambda3.rememberComposableLambda(-1760448634, true, new AnonymousClass3(this.$duxo, userInteractionEventDescriptor2, snapshotState4CollectAsStateWithLifecycle, current, function0), composer, 54), composer, 432, 0);
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(this.$duxo.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 0, 7);
            final Event<CryptoTransferSendAmountEvent> eventInvoke$lambda$17 = invoke$lambda$17(snapshotState4CollectAsStateWithLifecycle2);
            if (eventInvoke$lambda$17 != null) {
                if ((eventInvoke$lambda$17.getData() instanceof CryptoTransferSendAmountEvent.ShowWarnSheet) && (eventConsumerInvoke6 = eventInvoke$lambda$17.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke6.consume(eventInvoke$lambda$17, new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2$invoke$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                            m25097invoke(obj3);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25097invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            CryptoTransferSendAmountViewState.CryptoTransferSendWarningSheetState sheetState = ((CryptoTransferSendAmountEvent.ShowWarnSheet) eventInvoke$lambda$17.getData()).getSheetState();
                            CryptoTransferSendAmountComposableKt.C382952.invoke$lambda$6(snapshotState5, new CryptoTransferSendAmountSheetContent.WarningSheetContent(sheetState.getTitle(), sheetState.getDescriptionMarkdown(), sheetState.getPrimaryCta(), sheetState.getSecondaryCta(), sheetState.getWithdrawalAttempt()));
                            CryptoTransferSendAmountComposableKt.C382952.invoke$lambda$3(snapshotState3, true);
                        }
                    });
                }
                Unit unit = Unit.INSTANCE;
            }
            composer.startReplaceGroup(17999641);
            if (invoke$lambda$2(snapshotState3)) {
                composer.startReplaceGroup(5004770);
                Object objRememberedValue8 = composer.rememberedValue();
                if (objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoTransferSendAmountComposableKt.C382952.invoke$lambda$20$lambda$19(snapshotState3);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue8);
                }
                Function0 function02 = (Function0) objRememberedValue8;
                composer.endReplaceGroup();
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue9 = composer.rememberedValue();
                if (objRememberedValue9 == companion.getEmpty()) {
                    objRememberedValue9 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return Boolean.valueOf(CryptoTransferSendAmountComposableKt.C382952.invoke$lambda$22$lambda$21((SheetValue) obj3));
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue9);
                }
                composer.endReplaceGroup();
                navigator = navigator2;
                snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                context = context2;
                activityResultRegistry8 = activityResultRegistry8RememberLauncherForActivityResult;
                i3 = 1849434622;
                userInteractionEventDescriptor = userInteractionEventDescriptor2;
                eventLogger = current;
                snapshotState42 = snapshotState4CollectAsStateWithLifecycle2;
                composer2 = composer;
                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(function02, null, false, ModalBottomSheetKt.rememberModalBottomSheetState(true, (Function1) objRememberedValue9, composer, 54, 0), null, 0L, ComposableLambda3.rememberComposableLambda(260925869, true, new AnonymousClass7(navigator, context2, this.$callbacks, snapshotState5, snapshotState4CollectAsStateWithLifecycle), composer, 54), composer2, 1572870, 54);
            } else {
                composer2 = composer;
                i3 = 1849434622;
                activityResultRegistry8 = activityResultRegistry8RememberLauncherForActivityResult;
                userInteractionEventDescriptor = userInteractionEventDescriptor2;
                snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                eventLogger = current;
                context = context2;
                navigator = navigator2;
                snapshotState42 = snapshotState4CollectAsStateWithLifecycle2;
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(i3);
            Object objRememberedValue10 = composer2.rememberedValue();
            if (objRememberedValue10 == companion.getEmpty()) {
                obj = null;
                objRememberedValue10 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composer2.updateRememberedValue(objRememberedValue10);
            } else {
                obj = null;
            }
            final SnapshotState snapshotState7 = (SnapshotState) objRememberedValue10;
            composer2.endReplaceGroup();
            final CryptoTransferSendAmountEvent.InsufficientHoldings insufficientHoldingsInvoke$lambda$24 = invoke$lambda$24(snapshotState7);
            composer2.startReplaceGroup(18080696);
            if (insufficientHoldingsInvoke$lambda$24 == null) {
                snapshotState = snapshotState7;
                r15 = obj;
            } else {
                final CryptoTransferSendAmountFragment.Args args2 = this.$args;
                final Activity activity = this.$activity;
                composer2.startReplaceGroup(18081492);
                if (invoke$lambda$8(snapshotState6)) {
                    snapshotState = snapshotState7;
                    obj2 = obj;
                } else {
                    String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_error_title, composer2, 0);
                    StringResource message = insufficientHoldingsInvoke$lambda$24.getMessage();
                    int i4 = StringResource.$stable;
                    BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResource2.getString(message, composer2, i4));
                    String string3 = StringResource2.getString(insufficientHoldingsInvoke$lambda$24.getPositiveButton(), composer2, i4);
                    composer2.startReplaceGroup(-1746271574);
                    boolean zChangedInstance3 = composer2.changedInstance(navigator) | composer2.changedInstance(context) | composer2.changedInstance(args2);
                    Object objRememberedValue11 = composer2.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue11 == companion.getEmpty()) {
                        objRememberedValue11 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoTransferSendAmountComposableKt.C382952.invoke$lambda$32$lambda$27$lambda$26(navigator, context, args2);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue11);
                    }
                    composer2.endReplaceGroup();
                    BentoAlertButton bentoAlertButton = new BentoAlertButton(string3, (Function0) objRememberedValue11);
                    String string4 = StringResource2.getString(insufficientHoldingsInvoke$lambda$24.getNegativeButton(), composer2, i4);
                    composer2.startReplaceGroup(-1224400529);
                    boolean zChangedInstance4 = composer2.changedInstance(insufficientHoldingsInvoke$lambda$24) | composer2.changedInstance(activity);
                    Object objRememberedValue12 = composer2.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue12 == companion.getEmpty()) {
                        snapshotState2 = snapshotState6;
                        objRememberedValue12 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoTransferSendAmountComposableKt.C382952.invoke$lambda$32$lambda$29$lambda$28(insufficientHoldingsInvoke$lambda$24, activity, snapshotState2, snapshotState7);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue12);
                    } else {
                        snapshotState2 = snapshotState6;
                    }
                    composer2.endReplaceGroup();
                    BentoAlertButton bentoAlertButton2 = new BentoAlertButton(string4, (Function0) objRememberedValue12);
                    composer2.startReplaceGroup(-1633490746);
                    Object objRememberedValue13 = composer2.rememberedValue();
                    if (objRememberedValue13 == companion.getEmpty()) {
                        objRememberedValue13 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoTransferSendAmountComposableKt.C382952.invoke$lambda$32$lambda$31$lambda$30(snapshotState7, snapshotState2);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue13);
                    }
                    composer2.endReplaceGroup();
                    int i5 = (BentoAlertDialog2.Body.Text.$stable << 3) | 100663296;
                    int i6 = BentoAlertButton.$stable;
                    snapshotState = snapshotState7;
                    obj2 = null;
                    BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, null, bentoAlertButton2, null, false, null, (Function0) objRememberedValue13, composer, i5 | (i6 << 6) | (i6 << 12), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                    composer2 = composer;
                }
                composer2.endReplaceGroup();
                Unit unit2 = Unit.INSTANCE;
                r15 = obj2;
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(1849434622);
            Object objRememberedValue14 = composer2.rememberedValue();
            if (objRememberedValue14 == companion.getEmpty()) {
                objRememberedValue14 = SnapshotState3.mutableStateOf$default(r15, r15, 2, r15);
                composer2.updateRememberedValue(objRememberedValue14);
            }
            final SnapshotState snapshotState8 = (SnapshotState) objRememberedValue14;
            composer2.endReplaceGroup();
            final InputModeSelectorSheetContentState inputModeSelectorSheetContentStateInvoke$lambda$34 = invoke$lambda$34(snapshotState8);
            composer2.startReplaceGroup(18148895);
            if (inputModeSelectorSheetContentStateInvoke$lambda$34 != null) {
                final CryptoTransferSendAmountDuxo cryptoTransferSendAmountDuxo3 = this.$duxo;
                composer2.startReplaceGroup(5004770);
                Object objRememberedValue15 = composer2.rememberedValue();
                if (objRememberedValue15 == companion.getEmpty()) {
                    objRememberedValue15 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoTransferSendAmountComposableKt.C382952.invoke$lambda$40$lambda$37$lambda$36(snapshotState8);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue15);
                }
                Function0 function03 = (Function0) objRememberedValue15;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(1849434622);
                Object objRememberedValue16 = composer2.rememberedValue();
                if (objRememberedValue16 == companion.getEmpty()) {
                    objRememberedValue16 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return Boolean.valueOf(CryptoTransferSendAmountComposableKt.C382952.invoke$lambda$40$lambda$39$lambda$38((SheetValue) obj3));
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue16);
                }
                composer2.endReplaceGroup();
                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(function03, null, false, ModalBottomSheetKt.rememberModalBottomSheetState(true, (Function1) objRememberedValue16, composer2, 54, 0), null, 0L, ComposableLambda3.rememberComposableLambda(1820535124, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2$9$3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer3, Integer num) {
                        invoke(rhModalBottomSheet5, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer3, int i7) {
                        Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                        if ((i7 & 6) == 0) {
                            i7 |= (i7 & 8) == 0 ? composer3.changed(RhModalBottomSheet) : composer3.changedInstance(RhModalBottomSheet) ? 4 : 2;
                        }
                        if ((i7 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1820535124, i7, -1, "com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposable.<anonymous>.<anonymous>.<anonymous> (CryptoTransferSendAmountComposable.kt:373)");
                        }
                        InputModeSelectorSheetContentState inputModeSelectorSheetContentState = inputModeSelectorSheetContentStateInvoke$lambda$34;
                        CryptoTransferSendAmountDuxo cryptoTransferSendAmountDuxo4 = cryptoTransferSendAmountDuxo3;
                        composer3.startReplaceGroup(5004770);
                        boolean zChangedInstance5 = composer3.changedInstance(cryptoTransferSendAmountDuxo4);
                        Object objRememberedValue17 = composer3.rememberedValue();
                        if (zChangedInstance5 || objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue17 = new C38302x34758927(cryptoTransferSendAmountDuxo4);
                            composer3.updateRememberedValue(objRememberedValue17);
                        }
                        composer3.endReplaceGroup();
                        InputModeSelectorSheetContent3.InputModeSelectorSheetContent(RhModalBottomSheet, inputModeSelectorSheetContentState, null, (Function1) ((KFunction) objRememberedValue17), composer3, RhModalBottomSheet5.$stable | (i7 & 14), 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), composer2, 1572870, 54);
                Unit unit3 = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            final Event<CryptoTransferSendAmountEvent> eventInvoke$lambda$172 = invoke$lambda$17(snapshotState42);
            if (eventInvoke$lambda$172 != null) {
                final SnapshotState<String> snapshotState9 = this.$menuItemText$delegate;
                if ((eventInvoke$lambda$172.getData() instanceof CryptoTransferSendAmountEvent.UpdateToolbarItem) && (eventConsumerInvoke5 = eventInvoke$lambda$172.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke5.consume(eventInvoke$lambda$172, new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2$invoke$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                            m25098invoke(obj3);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25098invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            snapshotState9.setValue(((CryptoTransferSendAmountEvent.UpdateToolbarItem) eventInvoke$lambda$172.getData()).getMenuText());
                        }
                    });
                }
                Unit unit4 = Unit.INSTANCE;
            }
            final Event<CryptoTransferSendAmountEvent> eventInvoke$lambda$173 = invoke$lambda$17(snapshotState42);
            if (eventInvoke$lambda$173 != null) {
                final CryptoTransferSendAmountFragment.Callbacks callbacks = this.$callbacks;
                if ((eventInvoke$lambda$173.getData() instanceof CryptoTransferSendAmountEvent.WithdrawalPrepared) && (eventConsumerInvoke4 = eventInvoke$lambda$173.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke4.consume(eventInvoke$lambda$173, new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2$invoke$$inlined$consumeIfType$3
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                            m25099invoke(obj3);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25099invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            callbacks.reviewWithdrawalDetails(((CryptoTransferSendAmountEvent.WithdrawalPrepared) eventInvoke$lambda$173.getData()).getData());
                        }
                    });
                }
                Unit unit5 = Unit.INSTANCE;
            }
            final Event<CryptoTransferSendAmountEvent> eventInvoke$lambda$174 = invoke$lambda$17(snapshotState42);
            if (eventInvoke$lambda$174 != null) {
                if ((eventInvoke$lambda$174.getData() instanceof CryptoTransferSendAmountEvent.InsufficientHoldings) && (eventConsumerInvoke3 = eventInvoke$lambda$174.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke3.consume(eventInvoke$lambda$174, new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2$invoke$$inlined$consumeIfType$4
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                            m25100invoke(obj3);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25100invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            snapshotState.setValue((CryptoTransferSendAmountEvent.InsufficientHoldings) eventInvoke$lambda$174.getData());
                        }
                    });
                }
                Unit unit6 = Unit.INSTANCE;
            }
            final Event<CryptoTransferSendAmountEvent> eventInvoke$lambda$175 = invoke$lambda$17(snapshotState42);
            if (eventInvoke$lambda$175 != null) {
                if ((eventInvoke$lambda$175.getData() instanceof CryptoTransferSendAmountEvent.ShowInputModeSelector) && (eventConsumerInvoke2 = eventInvoke$lambda$175.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke2.consume(eventInvoke$lambda$175, new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2$invoke$$inlined$consumeIfType$5
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                            m25101invoke(obj3);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25101invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            snapshotState8.setValue(((CryptoTransferSendAmountEvent.ShowInputModeSelector) eventInvoke$lambda$175.getData()).getState());
                        }
                    });
                }
                Unit unit7 = Unit.INSTANCE;
            }
            final Event<CryptoTransferSendAmountEvent> eventInvoke$lambda$176 = invoke$lambda$17(snapshotState42);
            if (eventInvoke$lambda$176 != null) {
                if ((eventInvoke$lambda$176.getData() instanceof CryptoTransferSendAmountEvent.VerifyAddressOwnership) && (eventConsumerInvoke = eventInvoke$lambda$176.getGetEventConsumer().invoke()) != null) {
                    final ActivityResultRegistry8 activityResultRegistry82 = activityResultRegistry8;
                    eventConsumerInvoke.consume(eventInvoke$lambda$176, new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2$invoke$$inlined$consumeIfType$6
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                            m25102invoke(obj3);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25102invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            NavigationActivityResultContract3.launch$default(activityResultRegistry82, ((CryptoTransferSendAmountEvent.VerifyAddressOwnership) eventInvoke$lambda$176.getData()).getData(), null, false, 6, null);
                        }
                    });
                }
                Unit unit8 = Unit.INSTANCE;
            }
            composer2.startReplaceGroup(-1224400529);
            final SnapshotState4 snapshotState43 = snapshotState42;
            final UserInteractionEventDescriptor userInteractionEventDescriptor3 = userInteractionEventDescriptor;
            final EventLogger eventLogger2 = eventLogger;
            boolean zChanged3 = composer2.changed(snapshotState43) | composer2.changedInstance(this.$activity) | composer2.changedInstance(userInteractionEventDescriptor3) | composer2.changedInstance(this.$callbacks) | composer2.changedInstance(this.$args) | composer2.changedInstance(eventLogger2);
            final Activity activity2 = this.$activity;
            final CryptoTransferSendAmountFragment.Callbacks callbacks2 = this.$callbacks;
            final CryptoTransferSendAmountFragment.Args args3 = this.$args;
            Object objRememberedValue17 = composer2.rememberedValue();
            if (zChanged3 || objRememberedValue17 == companion.getEmpty()) {
                objRememberedValue17 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoTransferSendAmountComposableKt.C382952.invoke$lambda$48$lambda$47(snapshotState43, activity2, userInteractionEventDescriptor3, callbacks2, args3, eventLogger2);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue17);
            }
            composer2.endReplaceGroup();
            EffectsKt.SideEffect((Function0) objRememberedValue17, composer2, 0);
            CryptoTransferSendAmountViewState.AmountState amountState$feature_crypto_transfer_externalDebug = invoke$lambda$0(snapshotState4).getAmountState$feature_crypto_transfer_externalDebug();
            composer2.startReplaceGroup(-1746271574);
            boolean zChangedInstance5 = composer2.changedInstance(this.$duxo) | composer2.changed(snapshotState4) | composer2.changedInstance(this.$callbacks);
            CryptoTransferSendAmountDuxo cryptoTransferSendAmountDuxo4 = this.$duxo;
            CryptoTransferSendAmountFragment.Callbacks callbacks3 = this.$callbacks;
            Object objRememberedValue18 = composer2.rememberedValue();
            if (zChangedInstance5 || objRememberedValue18 == companion.getEmpty()) {
                objRememberedValue18 = new C38298x94ce3acd(cryptoTransferSendAmountDuxo4, callbacks3, snapshotState4, r15);
                composer2.updateRememberedValue(objRememberedValue18);
            }
            composer2.endReplaceGroup();
            EffectsKt.LaunchedEffect(amountState$feature_crypto_transfer_externalDebug, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue18, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String CryptoTransferSendAmountComposable$lambda$1(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoTransferSendAmountComposable(final CryptoTransferSendAmountFragment.Args args, final CryptoTransferSendAmountFragment.Callbacks callbacks, Modifier modifier, CryptoTransferSendAmountDuxo cryptoTransferSendAmountDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoTransferSendAmountDuxo cryptoTransferSendAmountDuxo2;
        CreationExtras defaultViewModelCreationExtras;
        int i4;
        final CryptoTransferSendAmountDuxo cryptoTransferSendAmountDuxo3;
        Object objRememberedValue;
        final CryptoTransferSendAmountDuxo cryptoTransferSendAmountDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(1428445928);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(args) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    cryptoTransferSendAmountDuxo2 = cryptoTransferSendAmountDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(cryptoTransferSendAmountDuxo2) ? 2048 : 1024;
                    i3 |= i6;
                } else {
                    cryptoTransferSendAmountDuxo2 = cryptoTransferSendAmountDuxo;
                }
                i3 |= i6;
            } else {
                cryptoTransferSendAmountDuxo2 = cryptoTransferSendAmountDuxo;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                } else {
                    Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoTransferSendAmountDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$$inlined$duxo$1.1
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
                        i4 = i3 & (-7169);
                        cryptoTransferSendAmountDuxo3 = (CryptoTransferSendAmountDuxo) baseDuxo;
                        modifier2 = modifier3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1428445928, i4, -1, "com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposable (CryptoTransferSendAmountComposable.kt:86)");
                        }
                        final Activity activity = (Activity) composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = SnapshotState3.mutableStateOf$default("", null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifier2, ComposableLambda3.rememberComposableLambda(-1337557596, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt.CryptoTransferSendAmountComposable.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i7) {
                                if ((i7 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1337557596, i7, -1, "com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposable.<anonymous> (CryptoTransferSendAmountComposable.kt:92)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                Activity activity2 = activity;
                                CryptoTransferSendAmountDuxo cryptoTransferSendAmountDuxo5 = cryptoTransferSendAmountDuxo3;
                                SnapshotState<String> snapshotState2 = snapshotState;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                if (composer2.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableSingletons$CryptoTransferSendAmountComposableKt.INSTANCE.m25092getLambda$1029232543$feature_crypto_transfer_externalDebug(), null, ComposableLambda3.rememberComposableLambda(2103483021, true, new C38293x9963e842(activity2), composer2, 54), ComposableLambda3.rememberComposableLambda(-1927028212, true, new C38294x9963e843(cryptoTransferSendAmountDuxo5, snapshotState2), composer2, 54), null, false, false, null, null, 0L, null, composer2, 3462, 0, 2034);
                                BentoProgressBar2.m20698BentoProgressBarjB83MbM(0.66f, PaddingKt.m5144paddingVpY3zN4$default(companion, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 1, 0L, 0L, false, composer2, 390, 56);
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1698303623, true, new C382952(cryptoTransferSendAmountDuxo3, args, activity, callbacks, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 6) & 14) | 805306416, 508);
                        composerStartRestartGroup = composerStartRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        cryptoTransferSendAmountDuxo4 = cryptoTransferSendAmountDuxo3;
                    } else {
                        modifier2 = modifier3;
                    }
                }
                cryptoTransferSendAmountDuxo3 = cryptoTransferSendAmountDuxo2;
                i4 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final Activity activity2 = (Activity) composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                final SnapshotState<String> snapshotState2 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier2, ComposableLambda3.rememberComposableLambda(-1337557596, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt.CryptoTransferSendAmountComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1337557596, i7, -1, "com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposable.<anonymous> (CryptoTransferSendAmountComposable.kt:92)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        Activity activity22 = activity2;
                        CryptoTransferSendAmountDuxo cryptoTransferSendAmountDuxo5 = cryptoTransferSendAmountDuxo3;
                        SnapshotState<String> snapshotState22 = snapshotState2;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableSingletons$CryptoTransferSendAmountComposableKt.INSTANCE.m25092getLambda$1029232543$feature_crypto_transfer_externalDebug(), null, ComposableLambda3.rememberComposableLambda(2103483021, true, new C38293x9963e842(activity22), composer2, 54), ComposableLambda3.rememberComposableLambda(-1927028212, true, new C38294x9963e843(cryptoTransferSendAmountDuxo5, snapshotState22), composer2, 54), null, false, false, null, null, 0L, null, composer2, 3462, 0, 2034);
                        BentoProgressBar2.m20698BentoProgressBarjB83MbM(0.66f, PaddingKt.m5144paddingVpY3zN4$default(companion, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 1, 0L, 0L, false, composer2, 390, 56);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1698303623, true, new C382952(cryptoTransferSendAmountDuxo3, args, activity2, callbacks, snapshotState2), composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 6) & 14) | 805306416, 508);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                }
                cryptoTransferSendAmountDuxo4 = cryptoTransferSendAmountDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                cryptoTransferSendAmountDuxo4 = cryptoTransferSendAmountDuxo2;
            }
            final Modifier modifier4 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoTransferSendAmountComposableKt.CryptoTransferSendAmountComposable$lambda$3(args, callbacks, modifier4, cryptoTransferSendAmountDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            if ((i & 1) == 0) {
                if (i5 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
            }
        }
        final Modifier modifier42 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AmountDetails(final String str, final String str2, final String str3, final String str4, final boolean z, final Function0<Unit> function0, final int i, final Function0<Unit> function02, final boolean z2, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(538062962);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(str3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(str4) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function02) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 67108864 : 33554432;
        }
        if ((38347923 & i3) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(538062962, i3, -1, "com.robinhood.shared.crypto.transfer.send.amount.AmountDetails (CryptoTransferSendAmountComposable.kt:431)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            int i5 = i3;
            Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM());
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5145paddingqDBjuR0);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z3 = (i5 & 29360128) == 8388608;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoTransferSendAmountComposableKt.AmountDetails$lambda$8$lambda$5$lambda$4(function02);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue, 7, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM()), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i4).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextS(), composerStartRestartGroup, i5 & 14, 0, 8186);
            Composer composer3 = composerStartRestartGroup;
            composer3.startReplaceGroup(133791352);
            if (z2) {
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16), null, bentoTheme.getColors(composer3, i4).m21426getFg20d7_KjU(), null, null, false, composer3, BentoIcon4.Size16.$stable | 48, 56);
                composer3 = composer3;
            }
            composer3.endReplaceGroup();
            composer3.endNode();
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer3, i4).m21592getMediumD9Ej5fM()), composer3, 0);
            QuantityText(str2, i, composer3, ((i5 >> 3) & 14) | ((i5 >> 15) & 112));
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer3, i4).m21595getXsmallD9Ej5fM()), composer3, 0);
            Composer composer4 = composer3;
            BentoText2.m20747BentoText38GnDrw(str3, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i4).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i4).getTextS(), composer4, (i5 >> 6) & 14, 0, 8186);
            composer2 = composer4;
            Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer2, 0);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composer2.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1466456779, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$AmountDetails$1$3$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                    invoke(composer5, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer5, int i6) {
                    if ((i6 & 3) == 2 && composer5.getSkipping()) {
                        composer5.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1466456779, i6, -1, "com.robinhood.shared.crypto.transfer.send.amount.AmountDetails.<anonymous>.<anonymous>.<anonymous> (CryptoTransferSendAmountComposable.kt:478)");
                    }
                    BentoTextButton2.m20715BentoTextButtonPIknLig(function0, str4, ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer5.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.ENTER_TRANSFER_AMOUNT, null, new Component(Component.ComponentType.TEXT_FIELD, "source_send_all_cta", null, 4, null), null, 43, null), false, false, false, true, false, null, 108, null), null, null, z, null, composer5, 0, 88);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), composer2, 6);
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoTransferSendAmountComposableKt.AmountDetails$lambda$9(str, str2, str3, str4, z, function0, i, function02, z2, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AmountDetails$lambda$8$lambda$5$lambda$4(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final void QuantityText(final String str, int i, Composer composer, final int i2) {
        int i3;
        final int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(1929418351);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1929418351, i3, -1, "com.robinhood.shared.crypto.transfer.send.amount.QuantityText (CryptoTransferSendAmountComposable.kt:503)");
            }
            i4 = i;
            AnimateShake.AnimateShake(null, i4, ComposableLambda3.rememberComposableLambda(-1554666693, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt.QuantityText.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1554666693, i5, -1, "com.robinhood.shared.crypto.transfer.send.amount.QuantityText.<anonymous> (CryptoTransferSendAmountComposable.kt:505)");
                    }
                    TextStyle bookCoverCapsuleSmall = BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getBookCoverCapsuleSmall();
                    BentoText2.m20747BentoText38GnDrw(str, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, null, null, 0, false, 3, 0, null, 0, bookCoverCapsuleSmall, composer2, 805306416, 0, 7676);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 112) | 384, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            i4 = i;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoTransferSendAmountComposableKt.QuantityText$lambda$10(str, i4, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleError(Activity activity, CryptoTransferSendAmountFragment.Args args, CryptoTransferSendAmountViewState.CryptoValidationErrorWrapper cryptoValidationErrorWrapper, EventLogger eventLogger, Screen screen, Context context, Function1<? super CryptoTransferSendAmountViewState.CryptoValidationErrorWrapper, Unit> function1) {
        Component.ComponentType componentType = Component.ComponentType.ERROR_ALERT;
        Component component = new Component(componentType, null, null, 6, null);
        String currencyIdString = args.getCurrencyIdString();
        String loggingSessionIdString = args.getLoggingSessionIdString();
        ErrorResponse3.ErrorCode errorCode = cryptoValidationErrorWrapper.getErrorCode();
        CryptoTransferContext cryptoTransferContextCopy = null;
        String serverValue = errorCode != null ? errorCode.getServerValue() : null;
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, screen, component, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new CryptoTransferContext(currencyIdString, loggingSessionIdString, null, 0.0d, serverValue == null ? "" : serverValue, null, null, null, null, null, null, null, null, null, 16364, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -257, -1, -1, -1, 16383, null), 9, null);
        if (cryptoValidationErrorWrapper.isErrorInAmount()) {
            CryptoTransferContext crypto_transfer_context = context.getCrypto_transfer_context();
            if (crypto_transfer_context != null) {
                ErrorResponse3.ErrorCode errorCode2 = cryptoValidationErrorWrapper.getErrorCode();
                String serverValue2 = errorCode2 != null ? errorCode2.getServerValue() : null;
                cryptoTransferContextCopy = crypto_transfer_context.copy((16367 & 1) != 0 ? crypto_transfer_context.currency_id : null, (16367 & 2) != 0 ? crypto_transfer_context.session_id : null, (16367 & 4) != 0 ? crypto_transfer_context.withdrawal_id : null, (16367 & 8) != 0 ? crypto_transfer_context.amount : 0.0d, (16367 & 16) != 0 ? crypto_transfer_context.error_code : serverValue2 == null ? "" : serverValue2, (16367 & 32) != 0 ? crypto_transfer_context.title : null, (16367 & 64) != 0 ? crypto_transfer_context.completed_kyc : null, (16367 & 128) != 0 ? crypto_transfer_context.completed_mfa : null, (16367 & 256) != 0 ? crypto_transfer_context.security_context : null, (16367 & 512) != 0 ? crypto_transfer_context.transfer_id : null, (16367 & 1024) != 0 ? crypto_transfer_context.party_selection : null, (16367 & 2048) != 0 ? crypto_transfer_context.wallet_selection : null, (16367 & 4096) != 0 ? crypto_transfer_context.error_message : null, (16367 & 8192) != 0 ? crypto_transfer_context.unknownFields() : null);
            }
            EventLogger.DefaultImpls.logAppear$default(eventLogger, null, screen, new Component(componentType, null, null, 6, null), null, Context.copy$default(context, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cryptoTransferContextCopy, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -257, -1, -1, -1, 16383, null), 9, null);
            CryptoTransferErrorHandler.Companion.handle$default(CryptoTransferErrorHandler.INSTANCE, activity, cryptoValidationErrorWrapper.getThrowable(), cryptoValidationErrorWrapper.getTitleText(), cryptoValidationErrorWrapper.getButtonText(), null, cryptoValidationErrorWrapper.getTitleOverride(), false, 80, null);
            return;
        }
        function1.invoke(cryptoValidationErrorWrapper);
    }
}
