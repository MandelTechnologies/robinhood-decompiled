package com.robinhood.shared.trade.crypto.p397ui.recurringHook;

import android.view.View;
import com.robinhood.shared.trade.crypto.databinding.FragmentCryptoRecurringHookBottomSheetBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderRecurringHookBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.recurringHook.CryptoOrderRecurringHookBottomSheet$binding$2, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class CryptoOrderRecurringHookBottomSheet2 extends FunctionReferenceImpl implements Function1<View, FragmentCryptoRecurringHookBottomSheetBinding> {
    public static final CryptoOrderRecurringHookBottomSheet2 INSTANCE = new CryptoOrderRecurringHookBottomSheet2();

    CryptoOrderRecurringHookBottomSheet2() {
        super(1, FragmentCryptoRecurringHookBottomSheetBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/trade/crypto/databinding/FragmentCryptoRecurringHookBottomSheetBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentCryptoRecurringHookBottomSheetBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentCryptoRecurringHookBottomSheetBinding.bind(p0);
    }
}
