package com.robinhood.android.transfers.p271ui.max.createtransfer;

import android.content.Context;
import com.robinhood.android.transfers.p271ui.max.accounts.TransferAccountsViewState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaDisplayInfo.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/createtransfer/MatchaDisplayInfo;", "", "feeText", "", "grayText", "", "screenType", "Lcom/robinhood/android/transfers/ui/max/createtransfer/TransferScreen;", "<init>", "(ILjava/lang/String;Lcom/robinhood/android/transfers/ui/max/createtransfer/TransferScreen;)V", "getFeeText", "()I", "getGrayText", "()Ljava/lang/String;", "getScreenType", "()Lcom/robinhood/android/transfers/ui/max/createtransfer/TransferScreen;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class MatchaDisplayInfo {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int feeText;
    private final String grayText;
    private final ValueTextState2 screenType;

    public static /* synthetic */ MatchaDisplayInfo copy$default(MatchaDisplayInfo matchaDisplayInfo, int i, String str, ValueTextState2 valueTextState2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = matchaDisplayInfo.feeText;
        }
        if ((i2 & 2) != 0) {
            str = matchaDisplayInfo.grayText;
        }
        if ((i2 & 4) != 0) {
            valueTextState2 = matchaDisplayInfo.screenType;
        }
        return matchaDisplayInfo.copy(i, str, valueTextState2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getFeeText() {
        return this.feeText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getGrayText() {
        return this.grayText;
    }

    /* renamed from: component3, reason: from getter */
    public final ValueTextState2 getScreenType() {
        return this.screenType;
    }

    public final MatchaDisplayInfo copy(int feeText, String grayText, ValueTextState2 screenType) {
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        return new MatchaDisplayInfo(feeText, grayText, screenType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchaDisplayInfo)) {
            return false;
        }
        MatchaDisplayInfo matchaDisplayInfo = (MatchaDisplayInfo) other;
        return this.feeText == matchaDisplayInfo.feeText && Intrinsics.areEqual(this.grayText, matchaDisplayInfo.grayText) && this.screenType == matchaDisplayInfo.screenType;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.feeText) * 31;
        String str = this.grayText;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.screenType.hashCode();
    }

    public String toString() {
        return "MatchaDisplayInfo(feeText=" + this.feeText + ", grayText=" + this.grayText + ", screenType=" + this.screenType + ")";
    }

    public MatchaDisplayInfo(int i, String str, ValueTextState2 screenType) {
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        this.feeText = i;
        this.grayText = str;
        this.screenType = screenType;
    }

    public final int getFeeText() {
        return this.feeText;
    }

    public final String getGrayText() {
        return this.grayText;
    }

    public final ValueTextState2 getScreenType() {
        return this.screenType;
    }

    /* compiled from: MatchaDisplayInfo.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/createtransfer/MatchaDisplayInfo$Companion;", "", "<init>", "()V", "fromServiceFeeDisplayText", "Lcom/robinhood/android/transfers/ui/max/createtransfer/MatchaDisplayInfo;", "context", "Landroid/content/Context;", "displayInfo", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsViewState$ServiceFeeDisplayText;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MatchaDisplayInfo fromServiceFeeDisplayText(Context context, TransferAccountsViewState.ServiceFeeDisplayText displayInfo) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (displayInfo != null) {
                return new MatchaDisplayInfo(displayInfo.getMatchaPrimaryText(), displayInfo.getMatchaGrayResource() != null ? context.getString(displayInfo.getMatchaGrayResource().intValue(), displayInfo.getGrayFeeText()) : null, ValueTextState2.SELECT_ACCOUNT_SCREEN);
            }
            return null;
        }
    }
}
