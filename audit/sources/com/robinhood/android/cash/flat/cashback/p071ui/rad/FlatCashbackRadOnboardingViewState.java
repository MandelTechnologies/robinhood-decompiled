package com.robinhood.android.cash.flat.cashback.p071ui.rad;

import com.robinhood.android.cash.flat.cashback.p071ui.common.ValueProp;
import com.robinhood.android.transfers.contracts.Transfer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FlatCashbackRadOnboardingViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/rad/FlatCashbackRadOnboardingViewState;", "", "title", "", "subtitle", "bullets", "", "Lcom/robinhood/android/cash/flat/cashback/ui/common/ValueProp;", "transfer", "Lcom/robinhood/android/transfers/contracts/Transfer;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/android/transfers/contracts/Transfer;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getBullets", "()Ljava/util/List;", "getTransfer", "()Lcom/robinhood/android/transfers/contracts/Transfer;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "feature-cash-flat-cashback_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FlatCashbackRadOnboardingViewState {
    private static final FlatCashbackRadOnboardingViewState mock;
    private final List<ValueProp> bullets;
    private final String subtitle;
    private final String title;
    private final Transfer transfer;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FlatCashbackRadOnboardingViewState copy$default(FlatCashbackRadOnboardingViewState flatCashbackRadOnboardingViewState, String str, String str2, List list, Transfer transfer, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flatCashbackRadOnboardingViewState.title;
        }
        if ((i & 2) != 0) {
            str2 = flatCashbackRadOnboardingViewState.subtitle;
        }
        if ((i & 4) != 0) {
            list = flatCashbackRadOnboardingViewState.bullets;
        }
        if ((i & 8) != 0) {
            transfer = flatCashbackRadOnboardingViewState.transfer;
        }
        return flatCashbackRadOnboardingViewState.copy(str, str2, list, transfer);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<ValueProp> component3() {
        return this.bullets;
    }

    /* renamed from: component4, reason: from getter */
    public final Transfer getTransfer() {
        return this.transfer;
    }

    public final FlatCashbackRadOnboardingViewState copy(String title, String subtitle, List<ValueProp> bullets, Transfer transfer) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(bullets, "bullets");
        return new FlatCashbackRadOnboardingViewState(title, subtitle, bullets, transfer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlatCashbackRadOnboardingViewState)) {
            return false;
        }
        FlatCashbackRadOnboardingViewState flatCashbackRadOnboardingViewState = (FlatCashbackRadOnboardingViewState) other;
        return Intrinsics.areEqual(this.title, flatCashbackRadOnboardingViewState.title) && Intrinsics.areEqual(this.subtitle, flatCashbackRadOnboardingViewState.subtitle) && Intrinsics.areEqual(this.bullets, flatCashbackRadOnboardingViewState.bullets) && Intrinsics.areEqual(this.transfer, flatCashbackRadOnboardingViewState.transfer);
    }

    public int hashCode() {
        int iHashCode = ((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.bullets.hashCode()) * 31;
        Transfer transfer = this.transfer;
        return iHashCode + (transfer == null ? 0 : transfer.hashCode());
    }

    public String toString() {
        return "FlatCashbackRadOnboardingViewState(title=" + this.title + ", subtitle=" + this.subtitle + ", bullets=" + this.bullets + ", transfer=" + this.transfer + ")";
    }

    public FlatCashbackRadOnboardingViewState(String title, String subtitle, List<ValueProp> bullets, Transfer transfer) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(bullets, "bullets");
        this.title = title;
        this.subtitle = subtitle;
        this.bullets = bullets;
        this.transfer = transfer;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<ValueProp> getBullets() {
        return this.bullets;
    }

    public final Transfer getTransfer() {
        return this.transfer;
    }

    /* compiled from: FlatCashbackRadOnboardingViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/rad/FlatCashbackRadOnboardingViewState$Companion;", "", "<init>", "()V", "mock", "Lcom/robinhood/android/cash/flat/cashback/ui/rad/FlatCashbackRadOnboardingViewState;", "getMock$feature_cash_flat_cashback_externalDebug", "()Lcom/robinhood/android/cash/flat/cashback/ui/rad/FlatCashbackRadOnboardingViewState;", "feature-cash-flat-cashback_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FlatCashbackRadOnboardingViewState getMock$feature_cash_flat_cashback_externalDebug() {
            return FlatCashbackRadOnboardingViewState.mock;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            arrayList.add(new ValueProp(null, "- --- -------- ---- --------- ----- ------ --", 1, null));
        }
        mock = new FlatCashbackRadOnboardingViewState("--- -- - --------- ------- -------", "------ ---- -- ---- ----- ---- ---- ----- ----- ------ ---- ----- -----", arrayList, null);
    }
}
