package com.robinhood.android.beneficiaries.p067ui.trustflow.date;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;
import p479j$.time.format.DateTimeFormatter;
import p479j$.time.format.DateTimeParseException;

/* compiled from: BeneficiaryTrustDateDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001c\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0002¨\u0006\u0004"}, m3636d2 = {"formatDateFromBackendToAndroid", "", "templatePattern", "input", "feature-beneficiaries_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.beneficiaries.ui.trustflow.date.BeneficiaryTrustDateDuxoKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class BeneficiaryTrustDateDuxo2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String formatDateFromBackendToAndroid(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                String str3 = LocalDate.parse(str2).format(DateTimeFormatter.ofPattern(str));
                Intrinsics.checkNotNull(str3);
                return str3;
            } catch (DateTimeParseException unused) {
            }
        }
        return "";
    }
}
