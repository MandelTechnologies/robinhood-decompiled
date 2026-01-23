package com.robinhood.android.transfers.international.p266ui.amountinput;

import java.math.BigDecimal;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: KeyEventConsumer.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0002H\u0002¨\u0006\u0005"}, m3636d2 = {"isNumber", "", "", "toNumber", "Ljava/math/BigDecimal;", "feature-international-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.international.ui.amountinput.KeyEventConsumerKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class KeyEventConsumer2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isNumber(char[] cArr) {
        return toNumber(cArr) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BigDecimal toNumber(char[] cArr) {
        try {
            ArrayList arrayList = new ArrayList();
            for (char c : cArr) {
                if (c != ',') {
                    arrayList.add(Character.valueOf(c));
                }
            }
            return new BigDecimal(CollectionsKt.toCharArray(arrayList));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
