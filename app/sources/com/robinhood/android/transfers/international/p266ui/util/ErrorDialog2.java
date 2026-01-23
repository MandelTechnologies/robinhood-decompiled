package com.robinhood.android.transfers.international.p266ui.util;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.doc.p109ui.photo.DocUploadReviewPdfFragment;
import com.robinhood.android.transfers.international.p266ui.util.ErrorDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: ErrorDialog.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0007\u001a\u0012\u0010\b\u001a\u00020\t*\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, m3636d2 = {"ErrorDialogComposable", "", DocUploadReviewPdfFragment.ERROR_DIALOG_TAG, "Lcom/robinhood/android/transfers/international/ui/util/ErrorDialog;", "onFinishRequest", "Lkotlin/Function0;", "onDismissRequest", "(Lcom/robinhood/android/transfers/international/ui/util/ErrorDialog;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "createRhDialogFragment", "Lcom/robinhood/android/common/ui/RhDialogFragment$Builder;", "context", "Landroid/content/Context;", "feature-international-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.international.ui.util.ErrorDialogKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class ErrorDialog2 {

    /* compiled from: ErrorDialog.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.international.ui.util.ErrorDialogKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ErrorDialog.DismissAction.values().length];
            try {
                iArr[ErrorDialog.DismissAction.FINISH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorDialogComposable$lambda$2(ErrorDialog errorDialog, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        ErrorDialogComposable(errorDialog, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ErrorDialogComposable(final ErrorDialog errorDialog, final Function0<Unit> onFinishRequest, final Function0<Unit> onDismissRequest, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(errorDialog, "errorDialog");
        Intrinsics.checkNotNullParameter(onFinishRequest, "onFinishRequest");
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Composer composerStartRestartGroup = composer.startRestartGroup(1531762617);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(errorDialog) : composerStartRestartGroup.changedInstance(errorDialog) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onFinishRequest) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismissRequest) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1531762617, i2, -1, "com.robinhood.android.transfers.international.ui.util.ErrorDialogComposable (ErrorDialog.kt:49)");
            }
            StringResource title = errorDialog.getTitle();
            int i3 = StringResource.$stable;
            String string2 = StringResource2.getString(title, composerStartRestartGroup, i3);
            BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResource2.getString(errorDialog.getMessage(), composerStartRestartGroup, i3));
            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            int i4 = i2 & 896;
            int i5 = i2 & 14;
            int i6 = i2 & 112;
            boolean z = (i4 == 256) | (i5 == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(errorDialog))) | (i6 == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ErrorDialog3(onDismissRequest, errorDialog, onFinishRequest);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource, (Function0) ((KFunction) objRememberedValue));
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean z2 = (i5 == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(errorDialog))) | (i4 == 256) | (i6 == 32);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new ErrorDialog4(onDismissRequest, errorDialog, onFinishRequest);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoAlertDialog.BentoAlertDialog(string2, text, bentoAlertButton, null, null, null, false, null, (Function0) ((KFunction) objRememberedValue2), composerStartRestartGroup, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.international.ui.util.ErrorDialogKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ErrorDialog2.ErrorDialogComposable$lambda$2(errorDialog, onFinishRequest, onDismissRequest, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ErrorDialogComposable$handleDismiss(Function0<Unit> function0, ErrorDialog errorDialog, Function0<Unit> function02) {
        function0.invoke();
        ErrorDialog.DismissAction dismissAction = errorDialog.getDismissAction();
        int i = dismissAction == null ? -1 : WhenMappings.$EnumSwitchMapping$0[dismissAction.ordinal()];
        if (i != -1) {
            if (i != 1) {
                throw new NoWhenBranchMatchedException();
            }
            function02.invoke();
        }
    }

    public static final RhDialogFragment.Builder createRhDialogFragment(ErrorDialog errorDialog, Context context) {
        Intrinsics.checkNotNullParameter(errorDialog, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        RhDialogFragment.Builder id = RhDialogFragment.INSTANCE.create(context).setId(errorDialog.getId());
        StringResource title = errorDialog.getTitle();
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        RhDialogFragment.Builder title2 = id.setTitle(title.getText(resources));
        StringResource message = errorDialog.getMessage();
        Resources resources2 = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        return title2.setMessage(message.getText(resources2)).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome).setCancelable(false);
    }
}
