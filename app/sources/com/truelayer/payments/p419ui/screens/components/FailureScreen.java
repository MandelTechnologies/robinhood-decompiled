package com.truelayer.payments.p419ui.screens.components;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.plaid.internal.EnumC7081g;
import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.screens.coordinator.FlowState;
import com.truelayer.payments.p419ui.screens.processor.ProcessorResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FailureScreen.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a:\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032#\b\u0002\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\n\u001a \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f*\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0000¨\u0006\u0010"}, m3636d2 = {"FailureScreen", "", "failure", "Lcom/truelayer/payments/ui/screens/coordinator/FlowState$Failure;", "onDismiss", "Lkotlin/Function1;", "Lcom/truelayer/payments/ui/screens/processor/ProcessorResult$Failure;", "Lkotlin/ParameterName;", "name", "result", "(Lcom/truelayer/payments/ui/screens/coordinator/FlowState$Failure;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "intoUiError", "Lkotlin/Pair;", "", "resources", "Landroid/content/res/Resources;", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.screens.components.FailureScreenKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class FailureScreen {
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FailureScreen(final FlowState.Failure failure, Function1<? super ProcessorResult.Failure, Unit> function1, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        int i3;
        Function1<? super ProcessorResult.Failure, Unit> function12;
        final Function1<? super ProcessorResult.Failure, Unit> function13;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(failure, "failure");
        Composer composerStartRestartGroup = composer.startRestartGroup(683330539);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(failure) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 112) == 0) {
                function12 = function1;
                i3 |= composerStartRestartGroup.changedInstance(function12) ? 32 : 16;
            }
            if ((i3 & 91) == 18 || !composerStartRestartGroup.getSkipping()) {
                function13 = i4 == 0 ? new Function1<ProcessorResult.Failure, Unit>() { // from class: com.truelayer.payments.ui.screens.components.FailureScreenKt.FailureScreen.1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(ProcessorResult.Failure it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ProcessorResult.Failure failure2) {
                        invoke2(failure2);
                        return Unit.INSTANCE;
                    }
                } : function12;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(683330539, i3, -1, "com.truelayer.payments.ui.screens.components.FailureScreen (FailureScreen.kt:14)");
                }
                Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                Tuples2<String, String> tuples2IntoUiError = intoUiError(failure, resources);
                String strComponent1 = tuples2IntoUiError.component1();
                String strComponent2 = tuples2IntoUiError.component2();
                Intrinsics.checkNotNull(strComponent1);
                Intrinsics.checkNotNull(strComponent2);
                ErrorDialog6.ErrorDialog(strComponent1, strComponent2, StringResources_androidKt.stringResource(C42830R.string.f6471ok, composerStartRestartGroup, 0), null, new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.components.FailureScreenKt.FailureScreen.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        function13.invoke(failure.intoProcessorResult());
                    }
                }, null, false, false, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                function13 = function12;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.components.FailureScreenKt.FailureScreen.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) throws Resources.NotFoundException {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) throws Resources.NotFoundException {
                        FailureScreen.FailureScreen(failure, function13, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        function12 = function1;
        if ((i3 & 91) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Resources resources2 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            Tuples2<String, String> tuples2IntoUiError2 = intoUiError(failure, resources2);
            String strComponent12 = tuples2IntoUiError2.component1();
            String strComponent22 = tuples2IntoUiError2.component2();
            Intrinsics.checkNotNull(strComponent12);
            Intrinsics.checkNotNull(strComponent22);
            ErrorDialog6.ErrorDialog(strComponent12, strComponent22, StringResources_androidKt.stringResource(C42830R.string.f6471ok, composerStartRestartGroup, 0), null, new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.components.FailureScreenKt.FailureScreen.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    function13.invoke(failure.intoProcessorResult());
                }
            }, null, false, false, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final Tuples2<String, String> intoUiError(FlowState.Failure failure, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(failure, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        FlowState.Failure.Reason reason = failure.getReason();
        if (Intrinsics.areEqual(reason, FlowState.Failure.Reason.Failed.INSTANCE)) {
            return new Tuples2<>(resources.getString(C42830R.string.payment_rejected_title), resources.getString(C42830R.string.payment_rejected_text));
        }
        if (reason instanceof FlowState.Failure.Reason.AuthorizationFailed) {
            return new Tuples2<>(resources.getString(C42830R.string.payment_rejected_title), resources.getString(C42830R.string.payment_rejected_text) + "\n\n" + resources.getString(C42830R.string.unexpected_error_code, ((FlowState.Failure.Reason.AuthorizationFailed) failure.getReason()).getReason() + " - " + ((FlowState.Failure.Reason.AuthorizationFailed) failure.getReason()).getStage()));
        }
        if (!(reason instanceof FlowState.Failure.Reason.Internal)) {
            throw new NoWhenBranchMatchedException();
        }
        return new Tuples2<>(resources.getString(C42830R.string.unexpected_error_title), resources.getString(C42830R.string.unexpected_error_text) + "\n\n" + resources.getString(C42830R.string.unexpected_error_code, ((FlowState.Failure.Reason.Internal) failure.getReason()).getErrorCode().getErrorCode()));
    }
}
