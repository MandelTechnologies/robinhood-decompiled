package com.robinhood.shared.crypto.p375ui.trade.confirmation;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoConfirmationScreenComposable.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/confirmation/ReceiptCardPreviewData;", "", "tertiaryBtnText", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getTertiaryBtnText", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ReceiptCardPreviewData {
    public static final int $stable = StringResource.$stable;
    private final StringResource tertiaryBtnText;

    public static /* synthetic */ ReceiptCardPreviewData copy$default(ReceiptCardPreviewData receiptCardPreviewData, StringResource stringResource, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = receiptCardPreviewData.tertiaryBtnText;
        }
        return receiptCardPreviewData.copy(stringResource);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getTertiaryBtnText() {
        return this.tertiaryBtnText;
    }

    public final ReceiptCardPreviewData copy(StringResource tertiaryBtnText) {
        return new ReceiptCardPreviewData(tertiaryBtnText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ReceiptCardPreviewData) && Intrinsics.areEqual(this.tertiaryBtnText, ((ReceiptCardPreviewData) other).tertiaryBtnText);
    }

    public int hashCode() {
        StringResource stringResource = this.tertiaryBtnText;
        if (stringResource == null) {
            return 0;
        }
        return stringResource.hashCode();
    }

    public String toString() {
        return "ReceiptCardPreviewData(tertiaryBtnText=" + this.tertiaryBtnText + ")";
    }

    public ReceiptCardPreviewData(StringResource stringResource) {
        this.tertiaryBtnText = stringResource;
    }

    public final StringResource getTertiaryBtnText() {
        return this.tertiaryBtnText;
    }
}
