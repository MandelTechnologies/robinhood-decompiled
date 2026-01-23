package com.truelayer.payments.p419ui.screens.components;

import android.content.Context;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.errors.InternalError;
import com.truelayer.payments.p419ui.screens.processor.ProcessorResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NetworkErrorView.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0007\u001a\f\u0010\b\u001a\u00020\t*\u00020\u0003H\u0000\u001a \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b*\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0000¨\u0006\u000f"}, m3636d2 = {"NetworkErrorView", "", "error", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "onDismiss", "Lkotlin/Function0;", "onRetry", "(Lcom/truelayer/payments/core/domain/errors/CoreError;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "intoProcessorResult", "Lcom/truelayer/payments/ui/screens/processor/ProcessorResult$Failure;", "intoUIMessage", "Lkotlin/Pair;", "", "context", "Landroid/content/Context;", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.screens.components.NetworkErrorViewKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class NetworkErrorView {
    public static final void NetworkErrorView(final CoreError error, final Function0<Unit> onDismiss, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        final Function0<Unit> function02;
        Unit unit;
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(675459071);
        Function0<Unit> function03 = (i2 & 4) != 0 ? null : function0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(675459071, i, -1, "com.truelayer.payments.ui.screens.components.NetworkErrorView (NetworkErrorView.kt:16)");
        }
        Tuples2<String, String> tuples2IntoUIMessage = intoUIMessage(error, (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        String strComponent1 = tuples2IntoUIMessage.component1();
        String strComponent2 = tuples2IntoUIMessage.component2();
        composerStartRestartGroup.startReplaceableGroup(738849324);
        if (function03 == null) {
            unit = null;
            function02 = function03;
        } else {
            Intrinsics.checkNotNull(strComponent1);
            Intrinsics.checkNotNull(strComponent2);
            ErrorDialog6.ErrorDialog(strComponent1, strComponent2, StringResources_androidKt.stringResource(C42830R.string.cancel_payment_button, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C42830R.string.retry, composerStartRestartGroup, 0), onDismiss, function03, false, false, composerStartRestartGroup, (i << 9) & 57344, 192);
            function02 = function03;
            unit = Unit.INSTANCE;
        }
        composerStartRestartGroup.endReplaceableGroup();
        if (unit == null) {
            Intrinsics.checkNotNull(strComponent1);
            Intrinsics.checkNotNull(strComponent2);
            ErrorDialog6.ErrorDialog(strComponent1, strComponent2, StringResources_androidKt.stringResource(C42830R.string.f6471ok, composerStartRestartGroup, 0), null, onDismiss, null, false, false, composerStartRestartGroup, (57344 & (i << 9)) | 3072, 224);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.components.NetworkErrorViewKt.NetworkErrorView.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    NetworkErrorView.NetworkErrorView(error, onDismiss, function02, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    public static final Tuples2<String, String> intoUIMessage(CoreError coreError, Context context) {
        String str;
        Intrinsics.checkNotNullParameter(coreError, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (coreError instanceof CoreError.CertificateValidationError) {
            return new Tuples2<>(context.getString(C42830R.string.certificate_error), context.getString(C42830R.string.certificate_error_desc));
        }
        if (coreError instanceof CoreError.ConnectionError) {
            return new Tuples2<>(context.getString(C42830R.string.network_error), context.getString(C42830R.string.network_error_desc));
        }
        if (coreError instanceof CoreError.HttpError) {
            String string2 = context.getString(C42830R.string.server_error);
            String string3 = context.getString(C42830R.string.server_error_desc);
            CoreError.HttpError httpError = (CoreError.HttpError) coreError;
            if (httpError instanceof CoreError.HttpError.InvalidParameters) {
                CoreError.HttpError.InvalidParameters invalidParameters = (CoreError.HttpError.InvalidParameters) coreError;
                str = invalidParameters.getTitle() + ": " + invalidParameters.getDescription() + "\n" + invalidParameters.invalidParametersToString();
            } else if (httpError instanceof CoreError.HttpError.ServerError) {
                CoreError.HttpError.ServerError serverError = (CoreError.HttpError.ServerError) coreError;
                str = serverError.getTitle() + ": " + serverError.getDescription();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return new Tuples2<>(string2, string3 + "\n\n" + str);
        }
        if (!(coreError instanceof CoreError.ValidationError)) {
            throw new NoWhenBranchMatchedException();
        }
        return new Tuples2<>(context.getString(C42830R.string.unexpected_error_title), context.getString(C42830R.string.unexpected_error_text) + "\n\n" + context.getString(C42830R.string.unexpected_error_code, InternalError.ResponseValidationUnableToParseResponse.getErrorCode()));
    }

    public static final ProcessorResult.Failure intoProcessorResult(CoreError coreError) {
        Intrinsics.checkNotNullParameter(coreError, "<this>");
        if (coreError instanceof CoreError.ConnectionError) {
            return new ProcessorResult.Failure(ProcessorResult.FailureReason.NoInternet);
        }
        if (coreError instanceof CoreError.CertificateValidationError) {
            return new ProcessorResult.Failure(ProcessorResult.FailureReason.ConnectionSecurityIssue);
        }
        if (coreError instanceof CoreError.HttpError ? true : coreError instanceof CoreError.ValidationError) {
            return new ProcessorResult.Failure(ProcessorResult.FailureReason.CommunicationIssue);
        }
        throw new NoWhenBranchMatchedException();
    }
}
