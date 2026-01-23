package com.robinhood.curatedproductdiscovery.p291ui;

import androidx.compose.p011ui.graphics.Color;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.curatedproductdiscovery.C33034R;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NewProductsLandingDataState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002'(BO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003JQ\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010!\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0011R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006)"}, m3636d2 = {"Lcom/robinhood/curatedproductdiscovery/ui/NewProductsLandingDataState;", "", "status", "Lcom/robinhood/curatedproductdiscovery/ui/NewProductsLandingDataState$Status;", "hasAccountNumber", "", "isCashSweepEnrolled", "sweepInterestRate", "Ljava/math/BigDecimal;", "isSlipAvailable", "isSlipEnrolled", "isCashRoundupEnrolled", "<init>", "(Lcom/robinhood/curatedproductdiscovery/ui/NewProductsLandingDataState$Status;ZZLjava/math/BigDecimal;ZZZ)V", "getStatus", "()Lcom/robinhood/curatedproductdiscovery/ui/NewProductsLandingDataState$Status;", "getHasAccountNumber", "()Z", "getSweepInterestRate", "()Ljava/math/BigDecimal;", "newProductCards", "", "Lcom/robinhood/curatedproductdiscovery/ui/NewProductCardData;", "getNewProductCards", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "Status", "feature-curated-product-discovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final /* data */ class NewProductsLandingDataState {
    private static final String APPLINK_SCHEME = "https://applink.robinhood.com/";
    private final boolean hasAccountNumber;
    private final boolean isCashRoundupEnrolled;
    private final boolean isCashSweepEnrolled;
    private final boolean isSlipAvailable;
    private final boolean isSlipEnrolled;
    private final List<NewProductCardData> newProductCards;
    private final Status status;
    private final BigDecimal sweepInterestRate;
    public static final int $stable = 8;

    public NewProductsLandingDataState() {
        this(null, false, false, null, false, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public static /* synthetic */ NewProductsLandingDataState copy$default(NewProductsLandingDataState newProductsLandingDataState, Status status, boolean z, boolean z2, BigDecimal bigDecimal, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            status = newProductsLandingDataState.status;
        }
        if ((i & 2) != 0) {
            z = newProductsLandingDataState.hasAccountNumber;
        }
        if ((i & 4) != 0) {
            z2 = newProductsLandingDataState.isCashSweepEnrolled;
        }
        if ((i & 8) != 0) {
            bigDecimal = newProductsLandingDataState.sweepInterestRate;
        }
        if ((i & 16) != 0) {
            z3 = newProductsLandingDataState.isSlipAvailable;
        }
        if ((i & 32) != 0) {
            z4 = newProductsLandingDataState.isSlipEnrolled;
        }
        if ((i & 64) != 0) {
            z5 = newProductsLandingDataState.isCashRoundupEnrolled;
        }
        boolean z6 = z4;
        boolean z7 = z5;
        boolean z8 = z3;
        boolean z9 = z2;
        return newProductsLandingDataState.copy(status, z, z9, bigDecimal, z8, z6, z7);
    }

    /* renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHasAccountNumber() {
        return this.hasAccountNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsCashSweepEnrolled() {
        return this.isCashSweepEnrolled;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getSweepInterestRate() {
        return this.sweepInterestRate;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsSlipAvailable() {
        return this.isSlipAvailable;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsSlipEnrolled() {
        return this.isSlipEnrolled;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsCashRoundupEnrolled() {
        return this.isCashRoundupEnrolled;
    }

    public final NewProductsLandingDataState copy(Status status, boolean hasAccountNumber, boolean isCashSweepEnrolled, BigDecimal sweepInterestRate, boolean isSlipAvailable, boolean isSlipEnrolled, boolean isCashRoundupEnrolled) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new NewProductsLandingDataState(status, hasAccountNumber, isCashSweepEnrolled, sweepInterestRate, isSlipAvailable, isSlipEnrolled, isCashRoundupEnrolled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewProductsLandingDataState)) {
            return false;
        }
        NewProductsLandingDataState newProductsLandingDataState = (NewProductsLandingDataState) other;
        return this.status == newProductsLandingDataState.status && this.hasAccountNumber == newProductsLandingDataState.hasAccountNumber && this.isCashSweepEnrolled == newProductsLandingDataState.isCashSweepEnrolled && Intrinsics.areEqual(this.sweepInterestRate, newProductsLandingDataState.sweepInterestRate) && this.isSlipAvailable == newProductsLandingDataState.isSlipAvailable && this.isSlipEnrolled == newProductsLandingDataState.isSlipEnrolled && this.isCashRoundupEnrolled == newProductsLandingDataState.isCashRoundupEnrolled;
    }

    public int hashCode() {
        int iHashCode = ((((this.status.hashCode() * 31) + Boolean.hashCode(this.hasAccountNumber)) * 31) + Boolean.hashCode(this.isCashSweepEnrolled)) * 31;
        BigDecimal bigDecimal = this.sweepInterestRate;
        return ((((((iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + Boolean.hashCode(this.isSlipAvailable)) * 31) + Boolean.hashCode(this.isSlipEnrolled)) * 31) + Boolean.hashCode(this.isCashRoundupEnrolled);
    }

    public String toString() {
        return "NewProductsLandingDataState(status=" + this.status + ", hasAccountNumber=" + this.hasAccountNumber + ", isCashSweepEnrolled=" + this.isCashSweepEnrolled + ", sweepInterestRate=" + this.sweepInterestRate + ", isSlipAvailable=" + this.isSlipAvailable + ", isSlipEnrolled=" + this.isSlipEnrolled + ", isCashRoundupEnrolled=" + this.isCashRoundupEnrolled + ")";
    }

    public NewProductsLandingDataState(Status status, boolean z, boolean z2, BigDecimal bigDecimal, boolean z3, boolean z4, boolean z5) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.hasAccountNumber = z;
        this.isCashSweepEnrolled = z2;
        this.sweepInterestRate = bigDecimal;
        this.isSlipAvailable = z3;
        this.isSlipEnrolled = z4;
        this.isCashRoundupEnrolled = z5;
        int i = C33034R.string.new_product_cash_sweep_title;
        int i2 = C33034R.string.new_product_cash_sweep_description;
        String str3 = bigDecimal != null ? Formats.getInterestRateFormatShort().format(bigDecimal) : null;
        BentoColor bentoColor = BentoColor.INSTANCE;
        long jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(bentoColor.m21212getDayHydro0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
        long jM21205getDayExos0d7_KjU = bentoColor.m21205getDayExos0d7_KjU();
        int i3 = C33034R.drawable.curated_product_discovery_sweep_pig;
        if (status == Status.SUCCESS && z) {
            if (z2) {
                str2 = "https://applink.robinhood.com/sweep_settings";
            } else {
                str2 = APPLINK_SCHEME + DeepLinkPath.SWEEP_ONBOARDING.getPath() + "?source=newproductslanding";
            }
            str = str2;
        } else {
            str = null;
        }
        NewProductCardData newProductCardData = new NewProductCardData("cash-sweep", i, i2, str3, jM6705copywmQWz5c$default, jM21205getDayExos0d7_KjU, i3, str, z2, null);
        NewProductCardData newProductCardData2 = z3 ? new NewProductCardData("stock-lending", C33034R.string.new_product_stock_lending_title, C33034R.string.new_product_stock_lending_description, null, bentoColor.m21354getNightXrayLight0d7_KjU(), bentoColor.m21262getNightBiome0d7_KjU(), C33034R.drawable.curated_product_discovery_stock_lending, "https://applink.robinhood.com/stock_loan_income_program?source=newproductslanding", z4, 8, null) : null;
        this.newProductCards = CollectionsKt.listOfNotNull((Object[]) new NewProductCardData[]{newProductCardData, newProductCardData2, new NewProductCardData("cash-card", C33034R.string.new_product_cash_card_title, C33034R.string.new_product_cash_card_description, null, Color.m6705copywmQWz5c$default(bentoColor.m21236getDayPrime0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), bentoColor.m21170getDayBiomeDark0d7_KjU(), C33034R.drawable.curated_product_discovery_cash_card, APPLINK_SCHEME + DeepLinkPath.ROUNDUP_DISCOVER.getPath(), z5, 8, null)});
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ NewProductsLandingDataState(com.robinhood.curatedproductdiscovery.ui.NewProductsLandingDataState.Status r2, boolean r3, boolean r4, java.math.BigDecimal r5, boolean r6, boolean r7, boolean r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L6
            com.robinhood.curatedproductdiscovery.ui.NewProductsLandingDataState$Status r2 = com.robinhood.curatedproductdiscovery.ui.NewProductsLandingDataState.Status.LOADING
        L6:
            r10 = r9 & 2
            r0 = 0
            if (r10 == 0) goto Lc
            r3 = r0
        Lc:
            r10 = r9 & 4
            if (r10 == 0) goto L11
            r4 = r0
        L11:
            r10 = r9 & 8
            if (r10 == 0) goto L16
            r5 = 0
        L16:
            r10 = r9 & 16
            if (r10 == 0) goto L1b
            r6 = r0
        L1b:
            r10 = r9 & 32
            if (r10 == 0) goto L20
            r7 = r0
        L20:
            r9 = r9 & 64
            if (r9 == 0) goto L2d
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L35
        L2d:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L35:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.curatedproductdiscovery.p291ui.NewProductsLandingDataState.<init>(com.robinhood.curatedproductdiscovery.ui.NewProductsLandingDataState$Status, boolean, boolean, java.math.BigDecimal, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final Status getStatus() {
        return this.status;
    }

    public final boolean getHasAccountNumber() {
        return this.hasAccountNumber;
    }

    public final boolean isCashSweepEnrolled() {
        return this.isCashSweepEnrolled;
    }

    public final BigDecimal getSweepInterestRate() {
        return this.sweepInterestRate;
    }

    public final boolean isSlipAvailable() {
        return this.isSlipAvailable;
    }

    public final boolean isSlipEnrolled() {
        return this.isSlipEnrolled;
    }

    public final boolean isCashRoundupEnrolled() {
        return this.isCashRoundupEnrolled;
    }

    public final List<NewProductCardData> getNewProductCards() {
        return this.newProductCards;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NewProductsLandingDataState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/curatedproductdiscovery/ui/NewProductsLandingDataState$Status;", "", "<init>", "(Ljava/lang/String;I)V", "LOADING", "SUCCESS", "FAILURE", "feature-curated-product-discovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Status {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status LOADING = new Status("LOADING", 0);
        public static final Status SUCCESS = new Status("SUCCESS", 1);
        public static final Status FAILURE = new Status("FAILURE", 2);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{LOADING, SUCCESS, FAILURE};
        }

        public static EnumEntries<Status> getEntries() {
            return $ENTRIES;
        }

        private Status(String str, int i) {
        }

        static {
            Status[] statusArr$values = $values();
            $VALUES = statusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(statusArr$values);
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }
}
