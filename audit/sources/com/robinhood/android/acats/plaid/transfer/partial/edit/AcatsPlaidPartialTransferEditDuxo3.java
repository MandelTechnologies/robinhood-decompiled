package com.robinhood.android.acats.plaid.transfer.partial.edit;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AcatsPlaidPartialTransferEditDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0003"}, m3636d2 = {"DEFAULT_ADJUSTMENT_AMOUNT", "", "cleansedString", "lib-acats-plaid_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditDuxoKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AcatsPlaidPartialTransferEditDuxo3 {
    private static final String DEFAULT_ADJUSTMENT_AMOUNT = "0";

    public static final String cleansedString(String str) throws IOException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ',' && cCharAt != '$') {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }
}
