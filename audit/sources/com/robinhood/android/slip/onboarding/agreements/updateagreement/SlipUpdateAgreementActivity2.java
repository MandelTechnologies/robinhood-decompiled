package com.robinhood.android.slip.onboarding.agreements.updateagreement;

import android.content.Context;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.slip.C28532R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlipUpdateAgreementActivity.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m3636d2 = {"slipUpdateAgreementDialog", "Lcom/robinhood/android/common/ui/RhDialogFragment$Builder;", "context", "Landroid/content/Context;", "feature-slip_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.slip.onboarding.agreements.updateagreement.SlipUpdateAgreementActivityKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class SlipUpdateAgreementActivity2 {
    public static final RhDialogFragment.Builder slipUpdateAgreementDialog(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return RhDialogFragment.INSTANCE.create(context).setId(C28532R.id.dialog_id_slip_already_signed).setUseDesignSystemOverlay(true).setUseParentFragmentScarletContext(true).setTitle(C28532R.string.slip_updated_agreements_already_signed_title, new Object[0]).setMessage(C28532R.string.slip_updated_agreements_already_signed_message, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]);
    }
}
