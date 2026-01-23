package com.robinhood.shared.crypto.transfer.send.review;

import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.android.common.C11048R;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.transfer.C37934R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SendNetworkFeeSheetContent.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0010\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\tHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/review/NetworkFeeSheetContentState;", "", "appType", "Lcom/robinhood/shared/app/type/AppType;", "<init>", "(Lcom/robinhood/shared/app/type/AppType;)V", "isRhcApp", "", "url", "", "getUrl", "()I", "disclaimer", "getDisclaimer", AccountOverviewOptionsSettingCard4.CTA, "getCta", "component1", "copy", "equals", "other", "hashCode", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class NetworkFeeSheetContentState {
    public static final int $stable = 0;
    private final AppType appType;
    private final boolean isRhcApp;

    /* renamed from: component1, reason: from getter */
    private final AppType getAppType() {
        return this.appType;
    }

    public static /* synthetic */ NetworkFeeSheetContentState copy$default(NetworkFeeSheetContentState networkFeeSheetContentState, AppType appType, int i, Object obj) {
        if ((i & 1) != 0) {
            appType = networkFeeSheetContentState.appType;
        }
        return networkFeeSheetContentState.copy(appType);
    }

    public final NetworkFeeSheetContentState copy(AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        return new NetworkFeeSheetContentState(appType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NetworkFeeSheetContentState) && this.appType == ((NetworkFeeSheetContentState) other).appType;
    }

    public int hashCode() {
        return this.appType.hashCode();
    }

    public String toString() {
        return "NetworkFeeSheetContentState(appType=" + this.appType + ")";
    }

    public NetworkFeeSheetContentState(AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.appType = appType;
        this.isRhcApp = appType == AppType.RHC;
    }

    public final int getUrl() {
        if (this.isRhcApp) {
            return C37934R.string.crypto_transfer_support_url_rhc;
        }
        return C37934R.string.crypto_transfer_support_url;
    }

    public final int getDisclaimer() {
        if (this.isRhcApp) {
            return C37934R.string.crypto_send_review_network_fee_sheet_description_rhc;
        }
        return C37934R.string.crypto_send_review_network_fee_sheet_description;
    }

    public final int getCta() {
        if (this.isRhcApp) {
            return C37934R.string.crypto_send_review_network_fee_sheet_cta_rhc;
        }
        return C11048R.string.general_label_got_it;
    }
}
