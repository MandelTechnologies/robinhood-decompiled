package com.robinhood.android.debitcard.linking.p098ui;

import com.robinhood.models.api.bonfire.paymentinstruments.VerificationMethod;
import kotlin.Metadata;

/* compiled from: DebitCardLinkingLoadingFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/UnexpectedVerificationMethodException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "verificationMethod", "Lcom/robinhood/models/api/bonfire/paymentinstruments/VerificationMethod;", "<init>", "(Lcom/robinhood/models/api/bonfire/paymentinstruments/VerificationMethod;)V", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.debitcard.linking.ui.UnexpectedVerificationMethodException, reason: use source file name */
/* loaded from: classes2.dex */
final class DebitCardLinkingLoadingFragment3 extends IllegalStateException {
    public DebitCardLinkingLoadingFragment3(VerificationMethod verificationMethod) {
        super("Unexpected debit card linking verification method: " + verificationMethod);
    }
}
