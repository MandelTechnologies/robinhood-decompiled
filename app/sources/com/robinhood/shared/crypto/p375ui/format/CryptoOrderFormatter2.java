package com.robinhood.shared.crypto.p375ui.format;

import com.robinhood.models.p320db.OrderSide;
import com.robinhood.shared.crypto.p375ui.C38572R;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderFormatter.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"sideLabel", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/models/db/OrderSide;", "getSideLabel", "(Lcom/robinhood/models/db/OrderSide;)Lcom/robinhood/utils/resource/StringResource;", "lib-crypto-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.ui.format.CryptoOrderFormatterKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoOrderFormatter2 {

    /* compiled from: CryptoOrderFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.ui.format.CryptoOrderFormatterKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderSide.values().length];
            try {
                iArr[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final StringResource getSideLabel(OrderSide orderSide) {
        int i;
        Intrinsics.checkNotNullParameter(orderSide, "<this>");
        StringResource.Companion companion = StringResource.INSTANCE;
        int i2 = WhenMappings.$EnumSwitchMapping$0[orderSide.ordinal()];
        if (i2 == 1) {
            i = C38572R.string.general_label_buy;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C38572R.string.general_label_sell;
        }
        return companion.invoke(i, new Object[0]);
    }
}
