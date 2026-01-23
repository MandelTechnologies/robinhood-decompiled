package com.robinhood.android.acats.plaid.transfer.partial;

import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo3;
import com.robinhood.models.serverdriven.experimental.api.Money;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsPlaidPartialTransferViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \f2\u00020\u0001:\u0003\n\u000b\fR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferViewState;", "", "toolbarTitle", "Lcom/robinhood/utils/resource/StringResource;", "getToolbarTitle", "()Lcom/robinhood/utils/resource/StringResource;", "removeAssetConfirmationState", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType;", "getRemoveAssetConfirmationState", "()Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType;", "Loading", "Ready", "Companion", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferViewState$Loading;", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferViewState$Ready;", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public interface AcatsPlaidPartialTransferViewState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    AcatsPlaidPartialTransferDuxo3 getRemoveAssetConfirmationState();

    StringResource getToolbarTitle();

    /* compiled from: AcatsPlaidPartialTransferViewState.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferViewState$Loading;", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferViewState;", "mock", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferViewState$Ready;", "<init>", "(Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferViewState$Ready;)V", "getMock", "()Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferViewState$Ready;", "toolbarTitle", "Lcom/robinhood/utils/resource/StringResource;", "getToolbarTitle", "()Lcom/robinhood/utils/resource/StringResource;", "removeAssetConfirmationState", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType;", "getRemoveAssetConfirmationState", "()Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements AcatsPlaidPartialTransferViewState {
        public static final int $stable = 8;
        private final Ready mock;
        private final AcatsPlaidPartialTransferDuxo3 removeAssetConfirmationState;
        private final StringResource toolbarTitle;

        /* JADX WARN: Multi-variable type inference failed */
        public Loading() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Loading copy$default(Loading loading, Ready ready, int i, Object obj) {
            if ((i & 1) != 0) {
                ready = loading.mock;
            }
            return loading.copy(ready);
        }

        /* renamed from: component1, reason: from getter */
        public final Ready getMock() {
            return this.mock;
        }

        public final Loading copy(Ready mock) {
            Intrinsics.checkNotNullParameter(mock, "mock");
            return new Loading(mock);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && Intrinsics.areEqual(this.mock, ((Loading) other).mock);
        }

        public int hashCode() {
            return this.mock.hashCode();
        }

        public String toString() {
            return "Loading(mock=" + this.mock + ")";
        }

        public Loading(Ready mock) {
            Intrinsics.checkNotNullParameter(mock, "mock");
            this.mock = mock;
            this.toolbarTitle = StringResource.INSTANCE.invoke(C7686R.string.assets_label, new Object[0]);
        }

        public /* synthetic */ Loading(Ready ready, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? AcatsPlaidPartialTransferViewState.INSTANCE.getLoadingMock$lib_acats_plaid_externalDebug() : ready);
        }

        public final Ready getMock() {
            return this.mock;
        }

        @Override // com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferViewState
        public StringResource getToolbarTitle() {
            return this.toolbarTitle;
        }

        @Override // com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferViewState
        public AcatsPlaidPartialTransferDuxo3 getRemoveAssetConfirmationState() {
            return this.removeAssetConfirmationState;
        }
    }

    /* compiled from: AcatsPlaidPartialTransferViewState.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011HÆ\u0003J\t\u00105\u001a\u00020\u0016HÆ\u0003J\u0081\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u0016HÆ\u0001J\u0013\u00107\u001a\u00020\u00162\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020=HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006>"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferViewState$Ready;", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferViewState;", "toolbarTitle", "Lcom/robinhood/utils/resource/StringResource;", "uiState", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferUiState;", "filterState", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferSortKey;", "editAssetState", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowData;", "cashAsset", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType$CashAssetWithAdjustment;", "marginCashAsset", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType$MarginCashAssetWithAdjustment;", "removeAssetConfirmationState", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType;", "equityAssets", "", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType$EquityAssetWithAdjustment;", "optionAssets", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType$OptionAssetWithAdjustment;", "allowDeletion", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferUiState;Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferSortKey;Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowData;Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType$CashAssetWithAdjustment;Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType$MarginCashAssetWithAdjustment;Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType;Ljava/util/List;Ljava/util/List;Z)V", "getToolbarTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getUiState", "()Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferUiState;", "getFilterState", "()Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferSortKey;", "getEditAssetState", "()Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowData;", "getCashAsset", "()Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType$CashAssetWithAdjustment;", "getMarginCashAsset", "()Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType$MarginCashAssetWithAdjustment;", "getRemoveAssetConfirmationState", "()Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType;", "getEquityAssets", "()Ljava/util/List;", "getOptionAssets", "getAllowDeletion", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Ready implements AcatsPlaidPartialTransferViewState {
        public static final int $stable = 8;
        private final boolean allowDeletion;
        private final AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment cashAsset;
        private final AcatsPlaidPartialTransferAssetRowData editAssetState;
        private final List<AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment> equityAssets;
        private final AcatsPlaidPartialTransferDuxo6 filterState;
        private final AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment marginCashAsset;
        private final List<AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment> optionAssets;
        private final AcatsPlaidPartialTransferDuxo3 removeAssetConfirmationState;
        private final StringResource toolbarTitle;
        private final AcatsPlaidPartialTransferUiState uiState;

        public static /* synthetic */ Ready copy$default(Ready ready, StringResource stringResource, AcatsPlaidPartialTransferUiState acatsPlaidPartialTransferUiState, AcatsPlaidPartialTransferDuxo6 acatsPlaidPartialTransferDuxo6, AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData, AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment cashAssetWithAdjustment, AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment marginCashAssetWithAdjustment, AcatsPlaidPartialTransferDuxo3 acatsPlaidPartialTransferDuxo3, List list, List list2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = ready.toolbarTitle;
            }
            if ((i & 2) != 0) {
                acatsPlaidPartialTransferUiState = ready.uiState;
            }
            if ((i & 4) != 0) {
                acatsPlaidPartialTransferDuxo6 = ready.filterState;
            }
            if ((i & 8) != 0) {
                acatsPlaidPartialTransferAssetRowData = ready.editAssetState;
            }
            if ((i & 16) != 0) {
                cashAssetWithAdjustment = ready.cashAsset;
            }
            if ((i & 32) != 0) {
                marginCashAssetWithAdjustment = ready.marginCashAsset;
            }
            if ((i & 64) != 0) {
                acatsPlaidPartialTransferDuxo3 = ready.removeAssetConfirmationState;
            }
            if ((i & 128) != 0) {
                list = ready.equityAssets;
            }
            if ((i & 256) != 0) {
                list2 = ready.optionAssets;
            }
            if ((i & 512) != 0) {
                z = ready.allowDeletion;
            }
            List list3 = list2;
            boolean z2 = z;
            AcatsPlaidPartialTransferDuxo3 acatsPlaidPartialTransferDuxo32 = acatsPlaidPartialTransferDuxo3;
            List list4 = list;
            AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment cashAssetWithAdjustment2 = cashAssetWithAdjustment;
            AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment marginCashAssetWithAdjustment2 = marginCashAssetWithAdjustment;
            return ready.copy(stringResource, acatsPlaidPartialTransferUiState, acatsPlaidPartialTransferDuxo6, acatsPlaidPartialTransferAssetRowData, cashAssetWithAdjustment2, marginCashAssetWithAdjustment2, acatsPlaidPartialTransferDuxo32, list4, list3, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getToolbarTitle() {
            return this.toolbarTitle;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getAllowDeletion() {
            return this.allowDeletion;
        }

        /* renamed from: component2, reason: from getter */
        public final AcatsPlaidPartialTransferUiState getUiState() {
            return this.uiState;
        }

        /* renamed from: component3, reason: from getter */
        public final AcatsPlaidPartialTransferDuxo6 getFilterState() {
            return this.filterState;
        }

        /* renamed from: component4, reason: from getter */
        public final AcatsPlaidPartialTransferAssetRowData getEditAssetState() {
            return this.editAssetState;
        }

        /* renamed from: component5, reason: from getter */
        public final AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment getCashAsset() {
            return this.cashAsset;
        }

        /* renamed from: component6, reason: from getter */
        public final AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment getMarginCashAsset() {
            return this.marginCashAsset;
        }

        /* renamed from: component7, reason: from getter */
        public final AcatsPlaidPartialTransferDuxo3 getRemoveAssetConfirmationState() {
            return this.removeAssetConfirmationState;
        }

        public final List<AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment> component8() {
            return this.equityAssets;
        }

        public final List<AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment> component9() {
            return this.optionAssets;
        }

        public final Ready copy(StringResource toolbarTitle, AcatsPlaidPartialTransferUiState uiState, AcatsPlaidPartialTransferDuxo6 filterState, AcatsPlaidPartialTransferAssetRowData editAssetState, AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment cashAsset, AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment marginCashAsset, AcatsPlaidPartialTransferDuxo3 removeAssetConfirmationState, List<AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment> equityAssets, List<AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment> optionAssets, boolean allowDeletion) {
            Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
            Intrinsics.checkNotNullParameter(uiState, "uiState");
            Intrinsics.checkNotNullParameter(filterState, "filterState");
            Intrinsics.checkNotNullParameter(equityAssets, "equityAssets");
            Intrinsics.checkNotNullParameter(optionAssets, "optionAssets");
            return new Ready(toolbarTitle, uiState, filterState, editAssetState, cashAsset, marginCashAsset, removeAssetConfirmationState, equityAssets, optionAssets, allowDeletion);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) other;
            return Intrinsics.areEqual(this.toolbarTitle, ready.toolbarTitle) && Intrinsics.areEqual(this.uiState, ready.uiState) && this.filterState == ready.filterState && Intrinsics.areEqual(this.editAssetState, ready.editAssetState) && Intrinsics.areEqual(this.cashAsset, ready.cashAsset) && Intrinsics.areEqual(this.marginCashAsset, ready.marginCashAsset) && Intrinsics.areEqual(this.removeAssetConfirmationState, ready.removeAssetConfirmationState) && Intrinsics.areEqual(this.equityAssets, ready.equityAssets) && Intrinsics.areEqual(this.optionAssets, ready.optionAssets) && this.allowDeletion == ready.allowDeletion;
        }

        public int hashCode() {
            int iHashCode = ((((this.toolbarTitle.hashCode() * 31) + this.uiState.hashCode()) * 31) + this.filterState.hashCode()) * 31;
            AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData = this.editAssetState;
            int iHashCode2 = (iHashCode + (acatsPlaidPartialTransferAssetRowData == null ? 0 : acatsPlaidPartialTransferAssetRowData.hashCode())) * 31;
            AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment cashAssetWithAdjustment = this.cashAsset;
            int iHashCode3 = (iHashCode2 + (cashAssetWithAdjustment == null ? 0 : cashAssetWithAdjustment.hashCode())) * 31;
            AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment marginCashAssetWithAdjustment = this.marginCashAsset;
            int iHashCode4 = (iHashCode3 + (marginCashAssetWithAdjustment == null ? 0 : marginCashAssetWithAdjustment.hashCode())) * 31;
            AcatsPlaidPartialTransferDuxo3 acatsPlaidPartialTransferDuxo3 = this.removeAssetConfirmationState;
            return ((((((iHashCode4 + (acatsPlaidPartialTransferDuxo3 != null ? acatsPlaidPartialTransferDuxo3.hashCode() : 0)) * 31) + this.equityAssets.hashCode()) * 31) + this.optionAssets.hashCode()) * 31) + Boolean.hashCode(this.allowDeletion);
        }

        public String toString() {
            return "Ready(toolbarTitle=" + this.toolbarTitle + ", uiState=" + this.uiState + ", filterState=" + this.filterState + ", editAssetState=" + this.editAssetState + ", cashAsset=" + this.cashAsset + ", marginCashAsset=" + this.marginCashAsset + ", removeAssetConfirmationState=" + this.removeAssetConfirmationState + ", equityAssets=" + this.equityAssets + ", optionAssets=" + this.optionAssets + ", allowDeletion=" + this.allowDeletion + ")";
        }

        public Ready(StringResource toolbarTitle, AcatsPlaidPartialTransferUiState uiState, AcatsPlaidPartialTransferDuxo6 filterState, AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData, AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment cashAssetWithAdjustment, AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment marginCashAssetWithAdjustment, AcatsPlaidPartialTransferDuxo3 acatsPlaidPartialTransferDuxo3, List<AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment> equityAssets, List<AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment> optionAssets, boolean z) {
            Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
            Intrinsics.checkNotNullParameter(uiState, "uiState");
            Intrinsics.checkNotNullParameter(filterState, "filterState");
            Intrinsics.checkNotNullParameter(equityAssets, "equityAssets");
            Intrinsics.checkNotNullParameter(optionAssets, "optionAssets");
            this.toolbarTitle = toolbarTitle;
            this.uiState = uiState;
            this.filterState = filterState;
            this.editAssetState = acatsPlaidPartialTransferAssetRowData;
            this.cashAsset = cashAssetWithAdjustment;
            this.marginCashAsset = marginCashAssetWithAdjustment;
            this.removeAssetConfirmationState = acatsPlaidPartialTransferDuxo3;
            this.equityAssets = equityAssets;
            this.optionAssets = optionAssets;
            this.allowDeletion = z;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Ready(com.robinhood.utils.resource.StringResource r3, com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferUiState r4, com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo6 r5, com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferAssetRowData r6, com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment r7, com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment r8, com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo3 r9, java.util.List r10, java.util.List r11, boolean r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
            /*
                r2 = this;
                r14 = r13 & 1
                r0 = 0
                if (r14 == 0) goto Lf
                com.robinhood.utils.resource.StringResource$Companion r3 = com.robinhood.utils.resource.StringResource.INSTANCE
                int r14 = com.robinhood.android.acats.p057ui.C7686R.string.assets_label
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.robinhood.utils.resource.StringResource r3 = r3.invoke(r14, r1)
            Lf:
                r14 = r13 & 4
                if (r14 == 0) goto L15
                com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferSortKey r5 = com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo6.ALL
            L15:
                r14 = r13 & 8
                r1 = 0
                if (r14 == 0) goto L1b
                r6 = r1
            L1b:
                r14 = r13 & 16
                if (r14 == 0) goto L20
                r7 = r1
            L20:
                r14 = r13 & 32
                if (r14 == 0) goto L25
                r8 = r1
            L25:
                r14 = r13 & 64
                if (r14 == 0) goto L2a
                r9 = r1
            L2a:
                r14 = r13 & 128(0x80, float:1.794E-43)
                if (r14 == 0) goto L32
                java.util.List r10 = kotlin.collections.CollectionsKt.emptyList()
            L32:
                r14 = r13 & 256(0x100, float:3.59E-43)
                if (r14 == 0) goto L3a
                java.util.List r11 = kotlin.collections.CollectionsKt.emptyList()
            L3a:
                r13 = r13 & 512(0x200, float:7.175E-43)
                if (r13 == 0) goto L4a
                r14 = r0
                r12 = r10
                r13 = r11
                r10 = r8
                r11 = r9
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                goto L55
            L4a:
                r14 = r12
                r13 = r11
                r11 = r9
                r12 = r10
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r4 = r2
            L55:
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferViewState.Ready.<init>(com.robinhood.utils.resource.StringResource, com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferUiState, com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferSortKey, com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferAssetRowData, com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferAssetRowDataType$CashAssetWithAdjustment, com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferAssetRowDataType$MarginCashAssetWithAdjustment, com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferAssetRowDataType, java.util.List, java.util.List, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        @Override // com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferViewState
        public StringResource getToolbarTitle() {
            return this.toolbarTitle;
        }

        public final AcatsPlaidPartialTransferUiState getUiState() {
            return this.uiState;
        }

        public final AcatsPlaidPartialTransferDuxo6 getFilterState() {
            return this.filterState;
        }

        public final AcatsPlaidPartialTransferAssetRowData getEditAssetState() {
            return this.editAssetState;
        }

        public final AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment getCashAsset() {
            return this.cashAsset;
        }

        public final AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment getMarginCashAsset() {
            return this.marginCashAsset;
        }

        @Override // com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferViewState
        public AcatsPlaidPartialTransferDuxo3 getRemoveAssetConfirmationState() {
            return this.removeAssetConfirmationState;
        }

        public final List<AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment> getEquityAssets() {
            return this.equityAssets;
        }

        public final List<AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment> getOptionAssets() {
            return this.optionAssets;
        }

        public final boolean getAllowDeletion() {
            return this.allowDeletion;
        }
    }

    /* compiled from: AcatsPlaidPartialTransferViewState.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferViewState$Companion;", "", "<init>", "()V", "mockCash", "Lcom/robinhood/models/serverdriven/experimental/api/Money;", "mockType", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType$CashAssetWithAdjustment;", "loadingMock", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferViewState$Ready;", "getLoadingMock$lib_acats_plaid_externalDebug", "()Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferViewState$Ready;", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Ready loadingMock;
        private static final Money mockCash;
        private static final AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment mockType;

        private Companion() {
        }

        static {
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            Money money = new Money("USD", uuidRandomUUID, ZERO);
            mockCash = money;
            AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment cashAssetWithAdjustment = new AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment(money, money);
            mockType = cashAssetWithAdjustment;
            StringResource.Companion companion = StringResource.INSTANCE;
            loadingMock = new Ready(null, new AcatsPlaidPartialTransferUiState(CollectionsKt.listOf(new AcatsPlaidPartialTransferAssetRowData(cashAssetWithAdjustment, companion.invoke("---- -------"), companion.invoke("----------"), companion.invoke("------ -------"))), CollectionsKt.listOf((Object[]) new AcatsPlaidPartialTransferAssetRowData[]{new AcatsPlaidPartialTransferAssetRowData(cashAssetWithAdjustment, companion.invoke("----"), companion.invoke("- ------"), companion.invoke("--- ------")), new AcatsPlaidPartialTransferAssetRowData(cashAssetWithAdjustment, companion.invoke("---"), companion.invoke("-- ------"), companion.invoke("--- ------"))}), CollectionsKt.emptyList(), CollectionsKt.listOf((Object[]) new AcatsPlaidPartialTransferSortData[]{new AcatsPlaidPartialTransferSortData(AcatsPlaidPartialTransferDuxo6.ALL, companion.invoke("-- ------")), new AcatsPlaidPartialTransferSortData(AcatsPlaidPartialTransferDuxo6.CASH, companion.invoke("----")), new AcatsPlaidPartialTransferSortData(AcatsPlaidPartialTransferDuxo6.STOCKS_ETFS, companion.invoke("------ - ----"))}), 5), null, null, null, null, null, null, null, false, 1021, null);
        }

        public final Ready getLoadingMock$lib_acats_plaid_externalDebug() {
            return loadingMock;
        }
    }
}
