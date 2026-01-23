package com.robinhood.android.banking.p065ui;

import com.robinhood.android.banking.lib.C9631R;
import com.robinhood.android.common.C11048R;
import com.robinhood.models.api.bonfire.paymentinstruments.CardNetworkType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardNetworkTypes.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¨\u0006\u0003"}, m3636d2 = {"getStringResource", "", "Lcom/robinhood/models/api/bonfire/paymentinstruments/CardNetworkType;", "feature-lib-banking_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.banking.ui.CardNetworkTypesKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class CardNetworkTypes {

    /* compiled from: CardNetworkTypes.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.banking.ui.CardNetworkTypesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardNetworkType.values().length];
            try {
                iArr[CardNetworkType.DISCOVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardNetworkType.MASTERCARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardNetworkType.VISA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CardNetworkType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int getStringResource(CardNetworkType cardNetworkType) {
        Intrinsics.checkNotNullParameter(cardNetworkType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[cardNetworkType.ordinal()];
        if (i == 1) {
            return C9631R.string.discover;
        }
        if (i == 2) {
            return C9631R.string.mastercard;
        }
        if (i == 3) {
            return C9631R.string.visa;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return C11048R.string.general_label_unknown;
    }
}
