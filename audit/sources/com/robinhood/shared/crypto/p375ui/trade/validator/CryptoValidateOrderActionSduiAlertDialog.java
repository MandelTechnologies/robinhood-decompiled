package com.robinhood.shared.crypto.p375ui.trade.validator;

import android.content.Context;
import android.net.Uri;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.models.serverdriven.experimental.api.CryptoAcknowledgeAlertAndContinueAction;
import com.robinhood.models.serverdriven.experimental.api.CryptoValidateOrderAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoValidateOrderActionSduiAlertDialog.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ao\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\bH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"CryptoValidateOrderActionSduiAlertDialog", "", "alertContent", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/CryptoValidateOrderAction;", "onContinue", "Lkotlin/Function0;", "onCryptoAcknowledgeAlertAndContinue", "Lkotlin/Function1;", "Lcom/robinhood/models/serverdriven/experimental/api/CryptoAcknowledgeAlertAndContinueAction;", "onCryptoCancelTradeFlow", "onDismiss", "onSetQuantity", "Ljava/math/BigDecimal;", "(Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "lib-crypto-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.ui.trade.validator.CryptoValidateOrderActionSduiAlertDialogKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoValidateOrderActionSduiAlertDialog {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoValidateOrderActionSduiAlertDialog$lambda$1(GenericAlertContent genericAlertContent, Function0 function0, Function1 function1, Function0 function02, Function0 function03, Function1 function12, int i, Composer composer, int i2) {
        CryptoValidateOrderActionSduiAlertDialog(genericAlertContent, function0, function1, function02, function03, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void CryptoValidateOrderActionSduiAlertDialog(final GenericAlertContent<? extends CryptoValidateOrderAction> genericAlertContent, final Function0<Unit> onContinue, final Function1<? super CryptoAcknowledgeAlertAndContinueAction, Unit> onCryptoAcknowledgeAlertAndContinue, final Function0<Unit> onCryptoCancelTradeFlow, final Function0<Unit> onDismiss, final Function1<? super BigDecimal, Unit> onSetQuantity, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Intrinsics.checkNotNullParameter(onCryptoAcknowledgeAlertAndContinue, "onCryptoAcknowledgeAlertAndContinue");
        Intrinsics.checkNotNullParameter(onCryptoCancelTradeFlow, "onCryptoCancelTradeFlow");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onSetQuantity, "onSetQuantity");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2098415217);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(genericAlertContent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onContinue) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onCryptoAcknowledgeAlertAndContinue) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onCryptoCancelTradeFlow) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismiss) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSetQuantity) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2098415217, i2, -1, "com.robinhood.shared.crypto.ui.trade.validator.CryptoValidateOrderActionSduiAlertDialog (CryptoValidateOrderActionSduiAlertDialog.kt:32)");
            }
            final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                SduiActionHandler sduiActionHandler = new SduiActionHandler() { // from class: com.robinhood.shared.crypto.ui.trade.validator.CryptoValidateOrderActionSduiAlertDialogKt$CryptoValidateOrderActionSduiAlertDialog$actionHandler$1$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                    /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                    public final boolean mo15941handle(CryptoValidateOrderAction action) {
                        Intrinsics.checkNotNullParameter(action, "action");
                        if (action instanceof CryptoValidateOrderAction.ContinueAction) {
                            onContinue.invoke();
                            return true;
                        }
                        if (action instanceof CryptoValidateOrderAction.CryptoAcknowledgeAlertAndContinue) {
                            onCryptoAcknowledgeAlertAndContinue.invoke(((CryptoValidateOrderAction.CryptoAcknowledgeAlertAndContinue) action).getValue2());
                            return true;
                        }
                        if (action instanceof CryptoValidateOrderAction.CryptoCancelTradeFlow) {
                            onCryptoCancelTradeFlow.invoke();
                            return true;
                        }
                        if (action instanceof CryptoValidateOrderAction.Deeplink) {
                            return Navigator.DefaultImpls.handleDeepLink$default(navigator, context, Uri.parse(((CryptoValidateOrderAction.Deeplink) action).getValue2().getUri()), null, null, false, null, 60, null);
                        }
                        if (action instanceof CryptoValidateOrderAction.Dismiss) {
                            onDismiss.invoke();
                            return true;
                        }
                        if (action instanceof CryptoValidateOrderAction.SetCryptoOrderQuantity) {
                            onSetQuantity.invoke(((CryptoValidateOrderAction.SetCryptoOrderQuantity) action).getValue2().getQuantity());
                            return true;
                        }
                        if (action instanceof CryptoValidateOrderAction.InfoAlert) {
                            return true;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(sduiActionHandler);
                objRememberedValue = sduiActionHandler;
            }
            final SduiActionHandler sduiActionHandler2 = (SduiActionHandler) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            if (genericAlertContent != null) {
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                CompositionLocal6<UserInteractionEventDescriptor> localUserInteractionEventDescriptor = AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor();
                Component.ComponentType componentType = Component.ComponentType.ALERT;
                String logging_identifier = genericAlertContent.getLogging_identifier();
                if (logging_identifier == null) {
                    logging_identifier = "";
                }
                CompositionLocal3.CompositionLocalProvider(localUserInteractionEventDescriptor.provides(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, null, new ComponentHierarchy(new Component(componentType, logging_identifier, null, 4, null), null, null, null, null, 30, null), 31, null)), ComposableLambda3.rememberComposableLambda(570014314, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.ui.trade.validator.CryptoValidateOrderActionSduiAlertDialogKt.CryptoValidateOrderActionSduiAlertDialog.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i3) {
                        if ((i3 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(570014314, i3, -1, "com.robinhood.shared.crypto.ui.trade.validator.CryptoValidateOrderActionSduiAlertDialog.<anonymous> (CryptoValidateOrderActionSduiAlertDialog.kt:83)");
                        }
                        SduiAlert.INSTANCE.Dialog(genericAlertContent, sduiActionHandler2, null, onDismiss, composer2, SduiAlert.$stable << 12, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.trade.validator.CryptoValidateOrderActionSduiAlertDialogKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoValidateOrderActionSduiAlertDialog.CryptoValidateOrderActionSduiAlertDialog$lambda$1(genericAlertContent, onContinue, onCryptoAcknowledgeAlertAndContinue, onCryptoCancelTradeFlow, onDismiss, onSetQuantity, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
