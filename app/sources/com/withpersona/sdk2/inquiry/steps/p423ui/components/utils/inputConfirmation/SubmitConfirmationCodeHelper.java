package com.withpersona.sdk2.inquiry.steps.p423ui.components.utils.inputConfirmation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SubmitConfirmationCodeHelper.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/inputConfirmation/SubmitConfirmationCodeHelper;", "", "<init>", "()V", "submitCode", "Lkotlin/Function0;", "", "getSubmitCode", "()Lkotlin/jvm/functions/Function0;", "setSubmitCode", "(Lkotlin/jvm/functions/Function0;)V", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class SubmitConfirmationCodeHelper {
    private Function0<Unit> submitCode = new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.utils.inputConfirmation.SubmitConfirmationCodeHelper$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Unit.INSTANCE;
        }
    };

    public final Function0<Unit> getSubmitCode() {
        return this.submitCode;
    }

    public final void setSubmitCode(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.submitCode = function0;
    }
}
