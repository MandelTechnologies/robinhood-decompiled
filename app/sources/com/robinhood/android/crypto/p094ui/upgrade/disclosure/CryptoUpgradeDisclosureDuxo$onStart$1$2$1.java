package com.robinhood.android.crypto.p094ui.upgrade.disclosure;

import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.crypto.p094ui.upgrade.disclosure.CryptoUpgradeDisclosureDataState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoUpgradeDisclosureDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.upgrade.disclosure.CryptoUpgradeDisclosureDuxo$onStart$1$2$1", m3645f = "CryptoUpgradeDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CryptoUpgradeDisclosureDuxo$onStart$1$2$1 extends ContinuationImpl7 implements Function2<CryptoUpgradeDisclosureDataState, Continuation<? super CryptoUpgradeDisclosureDataState>, Object> {
    final /* synthetic */ UiAgreementWithContent $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoUpgradeDisclosureDuxo$onStart$1$2$1(UiAgreementWithContent uiAgreementWithContent, Continuation<? super CryptoUpgradeDisclosureDuxo$onStart$1$2$1> continuation) {
        super(2, continuation);
        this.$it = uiAgreementWithContent;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoUpgradeDisclosureDuxo$onStart$1$2$1(this.$it, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoUpgradeDisclosureDataState cryptoUpgradeDisclosureDataState, Continuation<? super CryptoUpgradeDisclosureDataState> continuation) {
        return ((CryptoUpgradeDisclosureDuxo$onStart$1$2$1) create(cryptoUpgradeDisclosureDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return new CryptoUpgradeDisclosureDataState.Loaded(this.$it);
    }
}
