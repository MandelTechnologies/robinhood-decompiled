package com.robinhood.shared.crypto.p375ui.trade.validator;

import android.content.Context;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import com.robinhood.shared.crypto.p375ui.trade.validator.MicrogramOrderValidatorAlertDialog;
import com.squareup.wire.AnyMessage;
import contracts.crypto.trade.proto.p431v1.ValidateCryptoOrderResponse;
import contracts.crypto.trade.proto.p431v1.ValidateCryptoOrderResponseDto;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.AlertDto;

/* compiled from: MicrogramOrderValidatorAlertDialog.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ai\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m3636d2 = {"MicrogramOrderValidatorAlertDialog", "", "alert", "Lrh_server_driven_ui/v1/AlertDto;", "onAcknowledgeAlertAndContinue", "Lkotlin/Function1;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$AcknowledgeAndContinueDto;", "onDismiss", "Lkotlin/Function0;", "onConvertToSellAllSideEffect", "onSetOrderSizeSideEffect", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetOrderSizeDto;", "onStartDepositFlowSideEffect", "(Lrh_server_driven_ui/v1/AlertDto;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "lib-crypto-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.ui.trade.validator.MicrogramOrderValidatorAlertDialogKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class MicrogramOrderValidatorAlertDialog {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MicrogramOrderValidatorAlertDialog$lambda$1(AlertDto alertDto, Function1 function1, Function0 function0, Function0 function02, Function1 function12, Function0 function03, int i, Composer composer, int i2) {
        MicrogramOrderValidatorAlertDialog(alertDto, function1, function0, function02, function12, function03, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void MicrogramOrderValidatorAlertDialog(final AlertDto alertDto, final Function1<? super ValidateCryptoOrderResponseDto.MobileDto.ActionDto.AcknowledgeAndContinueDto, Unit> onAcknowledgeAlertAndContinue, final Function0<Unit> onDismiss, final Function0<Unit> onConvertToSellAllSideEffect, final Function1<? super ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.SetOrderSizeDto, Unit> onSetOrderSizeSideEffect, final Function0<Unit> onStartDepositFlowSideEffect, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onAcknowledgeAlertAndContinue, "onAcknowledgeAlertAndContinue");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onConvertToSellAllSideEffect, "onConvertToSellAllSideEffect");
        Intrinsics.checkNotNullParameter(onSetOrderSizeSideEffect, "onSetOrderSizeSideEffect");
        Intrinsics.checkNotNullParameter(onStartDepositFlowSideEffect, "onStartDepositFlowSideEffect");
        Composer composerStartRestartGroup = composer.startRestartGroup(1633651728);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(alertDto) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onAcknowledgeAlertAndContinue) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismiss) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onConvertToSellAllSideEffect) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSetOrderSizeSideEffect) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onStartDepositFlowSideEffect) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1633651728, i2, -1, "com.robinhood.shared.crypto.ui.trade.validator.MicrogramOrderValidatorAlertDialog (MicrogramOrderValidatorAlertDialog.kt:32)");
            }
            final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                SduiActionHandler sduiActionHandler = new SduiActionHandler() { // from class: com.robinhood.shared.crypto.ui.trade.validator.MicrogramOrderValidatorAlertDialogKt$MicrogramOrderValidatorAlertDialog$actionHandler$1$1
                    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                    /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                    public final boolean mo15941handle(ValidateCryptoOrderResponseDto.MobileDto.ActionDto actionDto) {
                        Intrinsics.checkNotNullParameter(actionDto, "actionDto");
                        ValidateCryptoOrderResponseDto.MobileDto.ActionDto.TypeDto type2 = actionDto.getType();
                        if (type2 instanceof ValidateCryptoOrderResponseDto.MobileDto.ActionDto.TypeDto.AcknowledgeAndContinue) {
                            onAcknowledgeAlertAndContinue.invoke(((ValidateCryptoOrderResponseDto.MobileDto.ActionDto.TypeDto.AcknowledgeAndContinue) type2).getValue());
                            return true;
                        }
                        if (!(type2 instanceof ValidateCryptoOrderResponseDto.MobileDto.ActionDto.TypeDto.Dismiss)) {
                            if (type2 == null) {
                                return false;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        onDismiss.invoke();
                        List<ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto> side_effects = ((ValidateCryptoOrderResponseDto.MobileDto.ActionDto.TypeDto.Dismiss) type2).getValue().getSide_effects();
                        Function0<Unit> function0 = onConvertToSellAllSideEffect;
                        Navigator navigator2 = navigator;
                        Context context2 = context;
                        Function1<ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.SetOrderSizeDto, Unit> function1 = onSetOrderSizeSideEffect;
                        Function0<Unit> function02 = onStartDepositFlowSideEffect;
                        Iterator<T> it = side_effects.iterator();
                        while (it.hasNext()) {
                            ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.TypeDto type3 = ((ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto) it.next()).getType();
                            if (type3 instanceof ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.TypeDto.ConvertToSellAll) {
                                function0.invoke();
                            } else if (type3 instanceof ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.TypeDto.DeeplinkAction) {
                                GenericActionHandlerKt.handleDeeplinkActionDto$default(navigator2, context2, ((ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.TypeDto.DeeplinkAction) type3).getValue(), null, 4, null);
                            } else if (type3 instanceof ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.TypeDto.SetOrderSize) {
                                function1.invoke(((ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.TypeDto.SetOrderSize) type3).getValue());
                            } else if (type3 instanceof ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.TypeDto.StartDepositFlow) {
                                function02.invoke();
                            }
                        }
                        return true;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(sduiActionHandler);
                objRememberedValue = sduiActionHandler;
            }
            SduiActionHandler sduiActionHandler2 = (SduiActionHandler) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            if (alertDto != null) {
                CompositionLocal3.CompositionLocalProvider(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor().provides(UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, null, new ComponentHierarchy(new Component(Component.ComponentType.ALERT, null, null, 6, null), null, null, null, null, 30, null), 31, null)), ComposableLambda3.rememberComposableLambda(1096131989, true, new C386461(alertDto, sduiActionHandler2, (UriHandler) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalUriHandler())), composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.trade.validator.MicrogramOrderValidatorAlertDialogKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MicrogramOrderValidatorAlertDialog.MicrogramOrderValidatorAlertDialog$lambda$1(alertDto, onAcknowledgeAlertAndContinue, onDismiss, onConvertToSellAllSideEffect, onSetOrderSizeSideEffect, onStartDepositFlowSideEffect, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: MicrogramOrderValidatorAlertDialog.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.ui.trade.validator.MicrogramOrderValidatorAlertDialogKt$MicrogramOrderValidatorAlertDialog$1 */
    static final class C386461 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SduiActionHandler<ValidateCryptoOrderResponseDto.MobileDto.ActionDto> $actionHandler;
        final /* synthetic */ AlertDto $alert;
        final /* synthetic */ UriHandler $uriHandler;

        /* JADX WARN: Multi-variable type inference failed */
        C386461(AlertDto alertDto, SduiActionHandler<? super ValidateCryptoOrderResponseDto.MobileDto.ActionDto> sduiActionHandler, UriHandler uriHandler) {
            this.$alert = alertDto;
            this.$actionHandler = sduiActionHandler;
            this.$uriHandler = uriHandler;
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
                ComposerKt.traceEventStart(1096131989, i, -1, "com.robinhood.shared.crypto.ui.trade.validator.MicrogramOrderValidatorAlertDialog.<anonymous> (MicrogramOrderValidatorAlertDialog.kt:77)");
            }
            SduiAlert sduiAlert = SduiAlert.INSTANCE;
            AlertDto alertDto = this.$alert;
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.ui.trade.validator.MicrogramOrderValidatorAlertDialogKt$MicrogramOrderValidatorAlertDialog$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MicrogramOrderValidatorAlertDialog.C386461.invoke$lambda$2$lambda$1((ActionDto) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            SduiActionHandler<ValidateCryptoOrderResponseDto.MobileDto.ActionDto> sduiActionHandler = this.$actionHandler;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.$uriHandler);
            final UriHandler uriHandler = this.$uriHandler;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.crypto.ui.trade.validator.MicrogramOrderValidatorAlertDialogKt$MicrogramOrderValidatorAlertDialog$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MicrogramOrderValidatorAlertDialog.C386461.invoke$lambda$4$lambda$3(uriHandler, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            sduiAlert.Dialog(alertDto, function1, sduiActionHandler, (Function1<? super String, Unit>) objRememberedValue2, (Function0<Unit>) null, composer, (SduiAlert.$stable << 15) | 48, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ValidateCryptoOrderResponseDto.MobileDto.ActionDto invoke$lambda$2$lambda$1(ActionDto actionDto) {
            AnyMessage concrete;
            if (actionDto == null || (concrete = actionDto.getConcrete()) == null) {
                return null;
            }
            ValidateCryptoOrderResponseDto.MobileDto.ActionDto.Companion companion = ValidateCryptoOrderResponseDto.MobileDto.ActionDto.INSTANCE;
            ValidateCryptoOrderResponse.Mobile.Action action = (ValidateCryptoOrderResponse.Mobile.Action) concrete.unpack(companion.getProtoAdapter());
            if (action != null) {
                return companion.fromProto(action);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3(UriHandler uriHandler, String uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            uriHandler.openUri(uri);
            return Unit.INSTANCE;
        }
    }
}
