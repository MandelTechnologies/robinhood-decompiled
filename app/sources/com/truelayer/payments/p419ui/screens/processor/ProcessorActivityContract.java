package com.truelayer.payments.p419ui.screens.processor;

import android.content.Context;
import android.content.Intent;
import androidx.view.result.contract.ActivityResultContract;
import com.truelayer.payments.p419ui.screens.processor.ProcessorResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProcessorActivityContract.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u000f"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/processor/ProcessorActivityContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/truelayer/payments/ui/screens/processor/ProcessorContext;", "Lcom/truelayer/payments/ui/screens/processor/ProcessorResult;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "Companion", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ProcessorActivityContract extends ActivityResultContract<ProcessorContext, ProcessorResult> {
    public static final int $stable = 0;
    public static final String PAYMENT_CONTEXT_KEY = "PAYMENT_CONTEXT_KEY";

    @Override // androidx.view.result.contract.ActivityResultContract
    public Intent createIntent(Context context, ProcessorContext input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent intent = new Intent(context, (Class<?>) ProcessorActivity.class);
        intent.putExtra(PAYMENT_CONTEXT_KEY, input);
        return intent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.view.result.contract.ActivityResultContract
    public ProcessorResult parseResult(int resultCode, Intent intent) {
        ProcessorResult processorResultUnwrapResult = ProcessorResult.INSTANCE.unwrapResult(intent);
        return processorResultUnwrapResult == null ? new ProcessorResult.Failure(ProcessorResult.FailureReason.Unknown) : processorResultUnwrapResult;
    }
}
