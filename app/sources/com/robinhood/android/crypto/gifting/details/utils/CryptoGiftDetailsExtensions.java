package com.robinhood.android.crypto.gifting.details.utils;

import com.robinhood.android.crypto.gifting.details.CryptoGiftDetailsViewState;
import com.robinhood.android.crypto.gifting.details.models.CryptoGiftEditorViewData;
import com.robinhood.android.crypto.gifting.details.models.MessageViewData;
import com.robinhood.models.p355ui.bonfire.cryptogifting.CryptoGiftDetails;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoGiftDetailsExtensions.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m3636d2 = {"toViewState", "Lcom/robinhood/android/crypto/gifting/details/CryptoGiftDetailsViewState;", "Lcom/robinhood/models/ui/bonfire/cryptogifting/CryptoGiftDetails;", "feature-crypto-gifting_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.gifting.details.utils.CryptoGiftDetailsExtensionsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoGiftDetailsExtensions {
    public static final CryptoGiftDetailsViewState toViewState(CryptoGiftDetails cryptoGiftDetails) {
        Intrinsics.checkNotNullParameter(cryptoGiftDetails, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CryptoGiftEditorViewData.GiftCardViewData(cryptoGiftDetails.getCardDesign(), cryptoGiftDetails.getCurrency().getSymbol(), cryptoGiftDetails.getGiftAmount()));
        String giftMessage = cryptoGiftDetails.getGiftMessage();
        if (giftMessage != null) {
            arrayList.add(new MessageViewData(giftMessage));
        }
        arrayList.addAll(cryptoGiftDetails.getSummaryItems());
        return new CryptoGiftDetailsViewState(cryptoGiftDetails.getScreenHeader(), arrayList, cryptoGiftDetails.getFooterDisclaimer(), cryptoGiftDetails.getPrimaryCta(), cryptoGiftDetails.getDismissCtaText());
    }
}
