package com.robinhood.shared.crypto.history;

import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.models.serverdriven.experimental.api.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Colors.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"toTint", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Tint;", "Lcom/robinhood/models/serverdriven/experimental/api/Color;", "getToTint", "(Lcom/robinhood/models/serverdriven/experimental/api/Color;)Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Tint;", "lib-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.history.ColorsKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class Colors6 {

    /* compiled from: Colors.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.history.ColorsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Color.values().length];
            try {
                iArr[Color.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Color.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Color.FG2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Color.SOL_LIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final TransactionSummary.Tint getToTint(Color color) {
        Intrinsics.checkNotNullParameter(color, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[color.ordinal()];
        if (i == 1) {
            return TransactionSummary.Tint.POSITIVE;
        }
        if (i == 2) {
            return TransactionSummary.Tint.NEGATIVE;
        }
        if (i == 3) {
            return TransactionSummary.Tint.FOREGROUND_2;
        }
        if (i == 4) {
            return TransactionSummary.Tint.SOL_LIGHT;
        }
        return TransactionSummary.Tint.FOREGROUND_2;
    }
}
