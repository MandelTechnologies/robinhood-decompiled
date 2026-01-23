package com.robinhood.android.transfers.p271ui.p272v2.alerts;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.window.AndroidDialog_androidKt;
import androidx.compose.p011ui.window.DialogProperties;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import bff_money_movement.service.p019v1.TransferActionDto;
import bff_money_movement.service.p019v1.TransferButtonDto;
import bff_money_movement.service.p019v1.TransferValidationErrorDetailsDto;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.transfers.p271ui.p272v2.alerts.ValidationAlertPopup;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.component.alerts.BentoAlerts2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ValidationAlertPopup.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aF\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"ValidationAlertPopup", "", WebsocketGatewayConstants.DATA_KEY, "Lbff_money_movement/service/v1/TransferValidationErrorDetailsDto;", "onDismiss", "Lkotlin/Function0;", "alertSelected", "Lkotlin/Function1;", "Lbff_money_movement/service/v1/TransferActionDto;", "Lkotlin/ParameterName;", "name", "action", "(Lbff_money_movement/service/v1/TransferValidationErrorDetailsDto;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.v2.alerts.ValidationAlertPopupKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class ValidationAlertPopup {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ValidationAlertPopup$lambda$0(TransferValidationErrorDetailsDto transferValidationErrorDetailsDto, Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        ValidationAlertPopup(transferValidationErrorDetailsDto, function0, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ValidationAlertPopup(final TransferValidationErrorDetailsDto data, Function0<Unit> onDismiss, final Function1<? super TransferActionDto, Unit> alertSelected, Composer composer, final int i) {
        int i2;
        final Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(alertSelected, "alertSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(1665027287);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(data) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismiss) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(alertSelected) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1665027287, i2, -1, "com.robinhood.android.transfers.ui.v2.alerts.ValidationAlertPopup (ValidationAlertPopup.kt:26)");
            }
            function0 = onDismiss;
            AndroidDialog_androidKt.Dialog(function0, new DialogProperties(false, false, false, 3, (DefaultConstructorMarker) null), ComposableLambda3.rememberComposableLambda(-451107858, true, new C312371(data, alertSelected), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 3) & 14) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function0 = onDismiss;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.v2.alerts.ValidationAlertPopupKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ValidationAlertPopup.ValidationAlertPopup$lambda$0(data, function0, alertSelected, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: ValidationAlertPopup.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.transfers.ui.v2.alerts.ValidationAlertPopupKt$ValidationAlertPopup$1 */
    static final class C312371 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function1<TransferActionDto, Unit> $alertSelected;
        final /* synthetic */ TransferValidationErrorDetailsDto $data;

        /* JADX WARN: Multi-variable type inference failed */
        C312371(TransferValidationErrorDetailsDto transferValidationErrorDetailsDto, Function1<? super TransferActionDto, Unit> function1) {
            this.$data = transferValidationErrorDetailsDto;
            this.$alertSelected = function1;
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
                ComposerKt.traceEventStart(-451107858, i, -1, "com.robinhood.android.transfers.ui.v2.alerts.ValidationAlertPopup.<anonymous> (ValidationAlertPopup.kt:31)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoAlertDialog2 bentoAlertDialog2 = BentoAlertDialog2.INSTANCE;
            Modifier modifierClip = Clip.clip(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoAlertDialog2.m20851getHorizontalPaddingD9Ej5fM(), 0.0f, 2, null), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoAlertDialog2.m20850getCornerRadiusD9Ej5fM()));
            String title = this.$data.getTitle();
            composer.startReplaceGroup(277054606);
            List<TransferButtonDto> buttons = this.$data.getButtons();
            final Function1<TransferActionDto, Unit> function1 = this.$alertSelected;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(buttons, 10));
            for (final TransferButtonDto transferButtonDto : buttons) {
                String label = transferButtonDto.getLabel();
                Modifier modifierAutoLogEvents = UtilKt.autoLogEvents(Modifier.INSTANCE, Component.ComponentType.BUTTON, transferButtonDto.getLogging_identifier(), false, composer, 54, 4);
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composer.changedInstance(transferButtonDto) | composer.changed(function1);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.ui.v2.alerts.ValidationAlertPopupKt$ValidationAlertPopup$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ValidationAlertPopup.C312371.invoke$lambda$3$lambda$2$lambda$1(transferButtonDto, function1);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                arrayList.add(new BentoAlertButton(label, (Function0) objRememberedValue, modifierAutoLogEvents, null, null, false, 56, null));
            }
            composer.endReplaceGroup();
            final TransferValidationErrorDetailsDto transferValidationErrorDetailsDto = this.$data;
            BentoAlerts2.AlertContent(modifierClip, null, title, null, arrayList, false, ComposableLambda3.rememberComposableLambda(-1302049922, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.v2.alerts.ValidationAlertPopupKt.ValidationAlertPopup.1.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1302049922, i2, -1, "com.robinhood.android.transfers.ui.v2.alerts.ValidationAlertPopup.<anonymous>.<anonymous> (ValidationAlertPopup.kt:51)");
                    }
                    BentoText2.m20747BentoText38GnDrw(transferValidationErrorDetailsDto.getSubtitle(), null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextM(), composer2, 0, 0, 8126);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 1769520, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2$lambda$1(TransferButtonDto transferButtonDto, Function1 function1) {
            TransferActionDto action = transferButtonDto.getAction();
            if (action != null) {
                function1.invoke(action);
            }
            return Unit.INSTANCE;
        }
    }
}
