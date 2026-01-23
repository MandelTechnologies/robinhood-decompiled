package com.withpersona.sdk2.inquiry.governmentid;

import android.widget.TextView;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* compiled from: GovernmentIdInstructionsRunner.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\u0005"}, m3636d2 = {"setOrHideText", "", "Landroid/widget/TextView;", "to", "", "government-id_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdInstructionsRunnerKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class GovernmentIdInstructionsRunner2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOrHideText(TextView textView, String str) {
        if (StringsKt.isBlank(str)) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
    }
}
