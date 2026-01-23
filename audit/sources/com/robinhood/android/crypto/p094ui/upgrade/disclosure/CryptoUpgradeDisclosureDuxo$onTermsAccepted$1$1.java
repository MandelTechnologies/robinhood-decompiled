package com.robinhood.android.crypto.p094ui.upgrade.disclosure;

import com.robinhood.android.agreements.AgreementsStore;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoUpgradeDisclosureDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.upgrade.disclosure.CryptoUpgradeDisclosureDuxo$onTermsAccepted$1$1", m3645f = "CryptoUpgradeDisclosureDuxo.kt", m3646l = {50}, m3647m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CryptoUpgradeDisclosureDuxo$onTermsAccepted$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CryptoUpgradeDisclosureDataState $dataState;
    int label;
    final /* synthetic */ CryptoUpgradeDisclosureDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoUpgradeDisclosureDuxo$onTermsAccepted$1$1(CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo, CryptoUpgradeDisclosureDataState cryptoUpgradeDisclosureDataState, Continuation<? super CryptoUpgradeDisclosureDuxo$onTermsAccepted$1$1> continuation) {
        super(2, continuation);
        this.this$0 = cryptoUpgradeDisclosureDuxo;
        this.$dataState = cryptoUpgradeDisclosureDataState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoUpgradeDisclosureDuxo$onTermsAccepted$1$1(this.this$0, this.$dataState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoUpgradeDisclosureDuxo$onTermsAccepted$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AgreementsStore agreementsStore = this.this$0.agreementsStore;
            UiAgreementWithContent uiAgreementWithContent = ((CryptoUpgradeDisclosureDataState.Loaded) this.$dataState).getUiAgreementWithContent();
            this.label = 1;
            if (AgreementsStore.signAgreement$default(agreementsStore, uiAgreementWithContent, null, null, this, 6, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
