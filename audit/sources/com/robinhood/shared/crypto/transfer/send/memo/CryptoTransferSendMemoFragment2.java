package com.robinhood.shared.crypto.transfer.send.memo;

import com.robinhood.shared.crypto.transfer.send.memo.CryptoTransferSendMemoFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferSendMemoFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.send.memo.CryptoTransferSendMemoFragment$ComposeContent$1$1$1, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class CryptoTransferSendMemoFragment2 extends FunctionReferenceImpl implements Function1<String, Unit> {
    CryptoTransferSendMemoFragment2(Object obj) {
        super(1, obj, CryptoTransferSendMemoFragment.Callbacks.class, "continueWithAddressTag", "continueWithAddressTag(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((CryptoTransferSendMemoFragment.Callbacks) this.receiver).continueWithAddressTag(p0);
    }
}
