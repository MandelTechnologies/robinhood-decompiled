package com.robinhood.android.crypto.p094ui.upgrade.disclosure;

import com.robinhood.android.crypto.p094ui.upgrade.CryptoUpgradeResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoUpgradeDisclosureDuxo.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class CryptoUpgradeDisclosureDuxo$onTermsAccepted$1$3 extends FunctionReferenceImpl implements Function1<CryptoUpgradeResult, Unit> {
    CryptoUpgradeDisclosureDuxo$onTermsAccepted$1$3(Object obj) {
        super(1, obj, CryptoUpgradeDisclosureDuxo.class, "onNext", "onNext(Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeResult;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CryptoUpgradeResult cryptoUpgradeResult) {
        invoke2(cryptoUpgradeResult);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CryptoUpgradeResult p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((CryptoUpgradeDisclosureDuxo) this.receiver).onNext(p0);
    }
}
