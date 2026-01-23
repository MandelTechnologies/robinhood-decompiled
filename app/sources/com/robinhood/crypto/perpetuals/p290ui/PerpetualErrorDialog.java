package com.robinhood.crypto.perpetuals.p290ui;

import android.content.Context;
import android.net.Uri;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.crypto.models.perpetuals.p289ui.PerpetualErrorDetails;
import com.robinhood.utils.resource.StringResource;
import com.squareup.wire.AnyMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.ButtonDto;
import rh_server_driven_ui.p531v1.GenericAction;
import rh_server_driven_ui.p531v1.GenericActionDto;

/* compiled from: PerpetualErrorDialog.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"PerpetualErrorDialog", "", "errorDetails", "Lcom/robinhood/crypto/models/perpetuals/ui/PerpetualErrorDetails;", "onDismissRequest", "Lkotlin/Function0;", "(Lcom/robinhood/crypto/models/perpetuals/ui/PerpetualErrorDetails;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "lib-perpetuals-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.crypto.perpetuals.ui.PerpetualErrorDialogKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class PerpetualErrorDialog {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PerpetualErrorDialog$lambda$9(PerpetualErrorDetails perpetualErrorDetails, Function0 function0, int i, Composer composer, int i2) {
        PerpetualErrorDialog(perpetualErrorDetails, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void PerpetualErrorDialog(final PerpetualErrorDetails errorDetails, final Function0<Unit> onDismissRequest, Composer composer, final int i) {
        int i2;
        BentoAlertButton bentoAlertButton;
        final BentoAlertButton bentoAlertButton2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(errorDetails, "errorDetails");
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Composer composerStartRestartGroup = composer.startRestartGroup(-860594961);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(errorDetails) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismissRequest) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-860594961, i2, -1, "com.robinhood.crypto.perpetuals.ui.PerpetualErrorDialog (PerpetualErrorDialog.kt:24)");
            }
            final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance = ((i2 & 112) == 32) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.crypto.perpetuals.ui.PerpetualErrorDialogKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PerpetualErrorDialog.PerpetualErrorDialog$lambda$2$lambda$1(navigator, context, onDismissRequest, (ActionDto) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final Function1 function1 = (Function1) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            final BentoAlertButton bentoAlertButton3 = new BentoAlertButton(StringResources_androidKt.stringResource(C11048R.string.general_label_ok, composerStartRestartGroup, 0), onDismissRequest);
            final ButtonDto buttonDto = (ButtonDto) CollectionsKt.firstOrNull((List) errorDetails.getCtas());
            composerStartRestartGroup.startReplaceGroup(1896982864);
            if (buttonDto == null) {
                bentoAlertButton = null;
            } else {
                String label = buttonDto.getLabel();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChanged = composerStartRestartGroup.changed(function1) | composerStartRestartGroup.changedInstance(buttonDto);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.crypto.perpetuals.ui.PerpetualErrorDialogKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PerpetualErrorDialog.PerpetualErrorDialog$lambda$5$lambda$4$lambda$3(function1, buttonDto);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                bentoAlertButton = new BentoAlertButton(label, (Function0) objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            final ButtonDto buttonDto2 = (ButtonDto) CollectionsKt.getOrNull(errorDetails.getCtas(), 1);
            composerStartRestartGroup.startReplaceGroup(1896988784);
            if (buttonDto2 == null) {
                bentoAlertButton2 = null;
            } else {
                String label2 = buttonDto2.getLabel();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChanged2 = composerStartRestartGroup.changed(function1) | composerStartRestartGroup.changedInstance(buttonDto2);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.crypto.perpetuals.ui.PerpetualErrorDialogKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PerpetualErrorDialog.PerpetualErrorDialog$lambda$8$lambda$7$lambda$6(function1, buttonDto2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                bentoAlertButton2 = new BentoAlertButton(label2, (Function0) objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            final BentoAlertButton bentoAlertButton4 = bentoAlertButton;
            composer2 = composerStartRestartGroup;
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(-1715277657, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.crypto.perpetuals.ui.PerpetualErrorDialogKt.PerpetualErrorDialog.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1715277657, i3, -1, "com.robinhood.crypto.perpetuals.ui.PerpetualErrorDialog.<anonymous> (PerpetualErrorDialog.kt:75)");
                    }
                    StringResource title = errorDetails.getTitle();
                    int i4 = StringResource.$stable;
                    String string2 = StringResource2.getString(title, composer3, i4);
                    StringResource message = errorDetails.getMessage();
                    composer3.startReplaceGroup(885618290);
                    String string3 = message == null ? null : StringResource2.getString(message, composer3, i4);
                    composer3.endReplaceGroup();
                    if (string3 == null) {
                        string3 = "";
                    }
                    BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(string3);
                    BentoAlertButton bentoAlertButton5 = bentoAlertButton4;
                    if (bentoAlertButton5 == null) {
                        bentoAlertButton5 = bentoAlertButton3;
                    }
                    BentoAlertButton bentoAlertButton6 = bentoAlertButton5;
                    BentoAlertButton bentoAlertButton7 = bentoAlertButton2;
                    Function0<Unit> function0 = onDismissRequest;
                    int i5 = BentoAlertDialog2.Body.Text.$stable << 3;
                    int i6 = BentoAlertButton.$stable;
                    BentoAlertDialog.BentoAlertDialog(string2, text, bentoAlertButton6, null, bentoAlertButton7, null, false, null, function0, composer3, i5 | (i6 << 6) | (i6 << 12), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.crypto.perpetuals.ui.PerpetualErrorDialogKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PerpetualErrorDialog.PerpetualErrorDialog$lambda$9(errorDetails, onDismissRequest, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PerpetualErrorDialog$lambda$2$lambda$1(Navigator navigator, Context context, Function0 function0, ActionDto actionDto) {
        AnyMessage concrete;
        GenericAction genericAction;
        GenericActionDto genericActionDtoFromProto = (actionDto == null || (concrete = actionDto.getConcrete()) == null || (genericAction = (GenericAction) concrete.unpack(GenericAction.ADAPTER)) == null) ? null : GenericActionDto.INSTANCE.fromProto(genericAction);
        GenericActionDto.ActionDto action = genericActionDtoFromProto != null ? genericActionDtoFromProto.getAction() : null;
        if (action instanceof GenericActionDto.ActionDto.Deeplink) {
            Navigator.DefaultImpls.handleDeepLink$default(navigator, context, Uri.parse(((GenericActionDto.ActionDto.Deeplink) action).getValue().getUrl()), null, null, false, NavigationType.PRESENT, 28, null);
        } else if (action instanceof GenericActionDto.ActionDto.Dismiss) {
            function0.invoke();
        } else {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PerpetualErrorDialog$lambda$5$lambda$4$lambda$3(Function1 function1, ButtonDto buttonDto) {
        function1.invoke(buttonDto.getAction());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PerpetualErrorDialog$lambda$8$lambda$7$lambda$6(Function1 function1, ButtonDto buttonDto) {
        function1.invoke(buttonDto.getAction());
        return Unit.INSTANCE;
    }
}
