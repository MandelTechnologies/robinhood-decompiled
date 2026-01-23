package com.robinhood.android.transfers.international.p266ui.review;

import androidx.compose.p011ui.text.AnnotatedString;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: ReviewTransferViewState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\"#B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u000bHÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0015¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferViewState;", "", "toolbarTitle", "Lcom/robinhood/utils/resource/StringResource;", "toolbarSubtitle", "amountViewState", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferViewState$AmountViewState;", "dataRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferViewState$DataRow;", "isPrimaryButtonLoading", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferViewState$AmountViewState;Lkotlinx/collections/immutable/ImmutableList;Z)V", "getToolbarTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getToolbarSubtitle", "getAmountViewState", "()Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferViewState$AmountViewState;", "getDataRows", "()Lkotlinx/collections/immutable/ImmutableList;", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "AmountViewState", "DataRow", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ReviewTransferViewState {
    public static final int $stable;
    private final AmountViewState amountViewState;
    private final ImmutableList<DataRow> dataRows;
    private final boolean isPrimaryButtonLoading;
    private final StringResource toolbarSubtitle;
    private final StringResource toolbarTitle;

    static {
        int i = BentoIcon4.$stable;
        int i2 = StringResource.$stable;
        $stable = i | i2 | i2 | i2 | i2;
    }

    public static /* synthetic */ ReviewTransferViewState copy$default(ReviewTransferViewState reviewTransferViewState, StringResource stringResource, StringResource stringResource2, AmountViewState amountViewState, ImmutableList immutableList, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = reviewTransferViewState.toolbarTitle;
        }
        if ((i & 2) != 0) {
            stringResource2 = reviewTransferViewState.toolbarSubtitle;
        }
        if ((i & 4) != 0) {
            amountViewState = reviewTransferViewState.amountViewState;
        }
        if ((i & 8) != 0) {
            immutableList = reviewTransferViewState.dataRows;
        }
        if ((i & 16) != 0) {
            z = reviewTransferViewState.isPrimaryButtonLoading;
        }
        boolean z2 = z;
        AmountViewState amountViewState2 = amountViewState;
        return reviewTransferViewState.copy(stringResource, stringResource2, amountViewState2, immutableList, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getToolbarTitle() {
        return this.toolbarTitle;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getToolbarSubtitle() {
        return this.toolbarSubtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final AmountViewState getAmountViewState() {
        return this.amountViewState;
    }

    public final ImmutableList<DataRow> component4() {
        return this.dataRows;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsPrimaryButtonLoading() {
        return this.isPrimaryButtonLoading;
    }

    public final ReviewTransferViewState copy(StringResource toolbarTitle, StringResource toolbarSubtitle, AmountViewState amountViewState, ImmutableList<DataRow> dataRows, boolean isPrimaryButtonLoading) {
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(toolbarSubtitle, "toolbarSubtitle");
        Intrinsics.checkNotNullParameter(amountViewState, "amountViewState");
        Intrinsics.checkNotNullParameter(dataRows, "dataRows");
        return new ReviewTransferViewState(toolbarTitle, toolbarSubtitle, amountViewState, dataRows, isPrimaryButtonLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewTransferViewState)) {
            return false;
        }
        ReviewTransferViewState reviewTransferViewState = (ReviewTransferViewState) other;
        return Intrinsics.areEqual(this.toolbarTitle, reviewTransferViewState.toolbarTitle) && Intrinsics.areEqual(this.toolbarSubtitle, reviewTransferViewState.toolbarSubtitle) && Intrinsics.areEqual(this.amountViewState, reviewTransferViewState.amountViewState) && Intrinsics.areEqual(this.dataRows, reviewTransferViewState.dataRows) && this.isPrimaryButtonLoading == reviewTransferViewState.isPrimaryButtonLoading;
    }

    public int hashCode() {
        return (((((((this.toolbarTitle.hashCode() * 31) + this.toolbarSubtitle.hashCode()) * 31) + this.amountViewState.hashCode()) * 31) + this.dataRows.hashCode()) * 31) + Boolean.hashCode(this.isPrimaryButtonLoading);
    }

    public String toString() {
        return "ReviewTransferViewState(toolbarTitle=" + this.toolbarTitle + ", toolbarSubtitle=" + this.toolbarSubtitle + ", amountViewState=" + this.amountViewState + ", dataRows=" + this.dataRows + ", isPrimaryButtonLoading=" + this.isPrimaryButtonLoading + ")";
    }

    public ReviewTransferViewState(StringResource toolbarTitle, StringResource toolbarSubtitle, AmountViewState amountViewState, ImmutableList<DataRow> dataRows, boolean z) {
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(toolbarSubtitle, "toolbarSubtitle");
        Intrinsics.checkNotNullParameter(amountViewState, "amountViewState");
        Intrinsics.checkNotNullParameter(dataRows, "dataRows");
        this.toolbarTitle = toolbarTitle;
        this.toolbarSubtitle = toolbarSubtitle;
        this.amountViewState = amountViewState;
        this.dataRows = dataRows;
        this.isPrimaryButtonLoading = z;
    }

    public final StringResource getToolbarTitle() {
        return this.toolbarTitle;
    }

    public final StringResource getToolbarSubtitle() {
        return this.toolbarSubtitle;
    }

    public final AmountViewState getAmountViewState() {
        return this.amountViewState;
    }

    public final ImmutableList<DataRow> getDataRows() {
        return this.dataRows;
    }

    public final boolean isPrimaryButtonLoading() {
        return this.isPrimaryButtonLoading;
    }

    /* compiled from: ReviewTransferViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferViewState$AmountViewState;", "", "WithFx", "WithoutFx", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferViewState$AmountViewState$WithFx;", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferViewState$AmountViewState$WithoutFx;", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface AmountViewState {

        /* compiled from: ReviewTransferViewState.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferViewState$AmountViewState$WithFx;", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferViewState$AmountViewState;", "sourceAmount", "", "sinkAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSourceAmount", "()Ljava/lang/String;", "getSinkAmount", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class WithFx implements AmountViewState {
            public static final int $stable = 0;
            private final String sinkAmount;
            private final String sourceAmount;

            public static /* synthetic */ WithFx copy$default(WithFx withFx, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = withFx.sourceAmount;
                }
                if ((i & 2) != 0) {
                    str2 = withFx.sinkAmount;
                }
                return withFx.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getSourceAmount() {
                return this.sourceAmount;
            }

            /* renamed from: component2, reason: from getter */
            public final String getSinkAmount() {
                return this.sinkAmount;
            }

            public final WithFx copy(String sourceAmount, String sinkAmount) {
                Intrinsics.checkNotNullParameter(sourceAmount, "sourceAmount");
                return new WithFx(sourceAmount, sinkAmount);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof WithFx)) {
                    return false;
                }
                WithFx withFx = (WithFx) other;
                return Intrinsics.areEqual(this.sourceAmount, withFx.sourceAmount) && Intrinsics.areEqual(this.sinkAmount, withFx.sinkAmount);
            }

            public int hashCode() {
                int iHashCode = this.sourceAmount.hashCode() * 31;
                String str = this.sinkAmount;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "WithFx(sourceAmount=" + this.sourceAmount + ", sinkAmount=" + this.sinkAmount + ")";
            }

            public WithFx(String sourceAmount, String str) {
                Intrinsics.checkNotNullParameter(sourceAmount, "sourceAmount");
                this.sourceAmount = sourceAmount;
                this.sinkAmount = str;
            }

            public final String getSourceAmount() {
                return this.sourceAmount;
            }

            public final String getSinkAmount() {
                return this.sinkAmount;
            }
        }

        /* compiled from: ReviewTransferViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferViewState$AmountViewState$WithoutFx;", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferViewState$AmountViewState;", "amount", "Landroidx/compose/ui/text/AnnotatedString;", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;)V", "getAmount", "()Landroidx/compose/ui/text/AnnotatedString;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class WithoutFx implements AmountViewState {
            public static final int $stable = 0;
            private final AnnotatedString amount;

            public static /* synthetic */ WithoutFx copy$default(WithoutFx withoutFx, AnnotatedString annotatedString, int i, Object obj) {
                if ((i & 1) != 0) {
                    annotatedString = withoutFx.amount;
                }
                return withoutFx.copy(annotatedString);
            }

            /* renamed from: component1, reason: from getter */
            public final AnnotatedString getAmount() {
                return this.amount;
            }

            public final WithoutFx copy(AnnotatedString amount) {
                Intrinsics.checkNotNullParameter(amount, "amount");
                return new WithoutFx(amount);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof WithoutFx) && Intrinsics.areEqual(this.amount, ((WithoutFx) other).amount);
            }

            public int hashCode() {
                return this.amount.hashCode();
            }

            public String toString() {
                return "WithoutFx(amount=" + ((Object) this.amount) + ")";
            }

            public WithoutFx(AnnotatedString amount) {
                Intrinsics.checkNotNullParameter(amount, "amount");
                this.amount = amount;
            }

            public final AnnotatedString getAmount() {
                return this.amount;
            }
        }
    }

    /* compiled from: ReviewTransferViewState.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferViewState$DataRow;", "", AnnotatedPrivateKey.LABEL, "Lcom/robinhood/utils/resource/StringResource;", "value", "icon", "Lcom/robinhood/compose/bento/component/BentoIcons;", "iconAction", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferViewState$DataRow$IconAction;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/compose/bento/component/BentoIcons;Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferViewState$DataRow$IconAction;)V", "getLabel", "()Lcom/robinhood/utils/resource/StringResource;", "getValue", "getIcon", "()Lcom/robinhood/compose/bento/component/BentoIcons;", "getIconAction", "()Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferViewState$DataRow$IconAction;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "IconAction", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DataRow {
        public static final int $stable;
        private final BentoIcon4 icon;
        private final IconAction iconAction;
        private final StringResource label;
        private final StringResource value;

        static {
            int i = BentoIcon4.$stable;
            int i2 = StringResource.$stable;
            $stable = i | i2 | i2;
        }

        public static /* synthetic */ DataRow copy$default(DataRow dataRow, StringResource stringResource, StringResource stringResource2, BentoIcon4 bentoIcon4, IconAction iconAction, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = dataRow.label;
            }
            if ((i & 2) != 0) {
                stringResource2 = dataRow.value;
            }
            if ((i & 4) != 0) {
                bentoIcon4 = dataRow.icon;
            }
            if ((i & 8) != 0) {
                iconAction = dataRow.iconAction;
            }
            return dataRow.copy(stringResource, stringResource2, bentoIcon4, iconAction);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getLabel() {
            return this.label;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getValue() {
            return this.value;
        }

        /* renamed from: component3, reason: from getter */
        public final BentoIcon4 getIcon() {
            return this.icon;
        }

        /* renamed from: component4, reason: from getter */
        public final IconAction getIconAction() {
            return this.iconAction;
        }

        public final DataRow copy(StringResource label, StringResource value, BentoIcon4 icon, IconAction iconAction) {
            Intrinsics.checkNotNullParameter(label, "label");
            return new DataRow(label, value, icon, iconAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DataRow)) {
                return false;
            }
            DataRow dataRow = (DataRow) other;
            return Intrinsics.areEqual(this.label, dataRow.label) && Intrinsics.areEqual(this.value, dataRow.value) && Intrinsics.areEqual(this.icon, dataRow.icon) && this.iconAction == dataRow.iconAction;
        }

        public int hashCode() {
            int iHashCode = this.label.hashCode() * 31;
            StringResource stringResource = this.value;
            int iHashCode2 = (iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
            BentoIcon4 bentoIcon4 = this.icon;
            int iHashCode3 = (iHashCode2 + (bentoIcon4 == null ? 0 : bentoIcon4.hashCode())) * 31;
            IconAction iconAction = this.iconAction;
            return iHashCode3 + (iconAction != null ? iconAction.hashCode() : 0);
        }

        public String toString() {
            return "DataRow(label=" + this.label + ", value=" + this.value + ", icon=" + this.icon + ", iconAction=" + this.iconAction + ")";
        }

        public DataRow(StringResource label, StringResource stringResource, BentoIcon4 bentoIcon4, IconAction iconAction) {
            Intrinsics.checkNotNullParameter(label, "label");
            this.label = label;
            this.value = stringResource;
            this.icon = bentoIcon4;
            this.iconAction = iconAction;
        }

        public /* synthetic */ DataRow(StringResource stringResource, StringResource stringResource2, BentoIcon4 bentoIcon4, IconAction iconAction, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringResource, stringResource2, (i & 4) != 0 ? null : bentoIcon4, (i & 8) != 0 ? null : iconAction);
        }

        public final StringResource getLabel() {
            return this.label;
        }

        public final StringResource getValue() {
            return this.value;
        }

        public final BentoIcon4 getIcon() {
            return this.icon;
        }

        public final IconAction getIconAction() {
            return this.iconAction;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ReviewTransferViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferViewState$DataRow$IconAction;", "", "<init>", "(Ljava/lang/String;I)V", "SHOW_EXCHANGE_RATE_INFO_SHEET", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class IconAction {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ IconAction[] $VALUES;
            public static final IconAction SHOW_EXCHANGE_RATE_INFO_SHEET = new IconAction("SHOW_EXCHANGE_RATE_INFO_SHEET", 0);

            private static final /* synthetic */ IconAction[] $values() {
                return new IconAction[]{SHOW_EXCHANGE_RATE_INFO_SHEET};
            }

            public static EnumEntries<IconAction> getEntries() {
                return $ENTRIES;
            }

            private IconAction(String str, int i) {
            }

            static {
                IconAction[] iconActionArr$values = $values();
                $VALUES = iconActionArr$values;
                $ENTRIES = EnumEntries2.enumEntries(iconActionArr$values);
            }

            public static IconAction valueOf(String str) {
                return (IconAction) Enum.valueOf(IconAction.class, str);
            }

            public static IconAction[] values() {
                return (IconAction[]) $VALUES.clone();
            }
        }
    }
}
