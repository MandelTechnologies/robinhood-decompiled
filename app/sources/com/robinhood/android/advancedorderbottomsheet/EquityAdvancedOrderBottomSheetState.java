package com.robinhood.android.advancedorderbottomsheet;

import android.os.Parcelable;
import androidx.compose.p011ui.Alignment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState2;
import com.robinhood.android.tradinghourvisual.lib.p263ui.SetTradingHourVisualizerArgs;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.utils.resource.StringResource;
import equity_trading_tax_lots.proto.p460v1.AvailableSelectionStrategyOption;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: EquityAdvancedOrderBottomSheetState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState;", "", "headerTitle", "Lcom/robinhood/utils/resource/StringResource;", "bottomSheetRowStates", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState$BottomSheetRowState$BaseRow;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lkotlinx/collections/immutable/ImmutableList;)V", "getHeaderTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getBottomSheetRowStates", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "BottomSheetRowState", "lib-advanced-order-bottom-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class EquityAdvancedOrderBottomSheetState {
    public static final int $stable = StringResource.$stable;
    private final ImmutableList<BottomSheetRowState.BaseRow> bottomSheetRowStates;
    private final StringResource headerTitle;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EquityAdvancedOrderBottomSheetState copy$default(EquityAdvancedOrderBottomSheetState equityAdvancedOrderBottomSheetState, StringResource stringResource, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = equityAdvancedOrderBottomSheetState.headerTitle;
        }
        if ((i & 2) != 0) {
            immutableList = equityAdvancedOrderBottomSheetState.bottomSheetRowStates;
        }
        return equityAdvancedOrderBottomSheetState.copy(stringResource, immutableList);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getHeaderTitle() {
        return this.headerTitle;
    }

    public final ImmutableList<BottomSheetRowState.BaseRow> component2() {
        return this.bottomSheetRowStates;
    }

    public final EquityAdvancedOrderBottomSheetState copy(StringResource headerTitle, ImmutableList<? extends BottomSheetRowState.BaseRow> bottomSheetRowStates) {
        Intrinsics.checkNotNullParameter(headerTitle, "headerTitle");
        Intrinsics.checkNotNullParameter(bottomSheetRowStates, "bottomSheetRowStates");
        return new EquityAdvancedOrderBottomSheetState(headerTitle, bottomSheetRowStates);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EquityAdvancedOrderBottomSheetState)) {
            return false;
        }
        EquityAdvancedOrderBottomSheetState equityAdvancedOrderBottomSheetState = (EquityAdvancedOrderBottomSheetState) other;
        return Intrinsics.areEqual(this.headerTitle, equityAdvancedOrderBottomSheetState.headerTitle) && Intrinsics.areEqual(this.bottomSheetRowStates, equityAdvancedOrderBottomSheetState.bottomSheetRowStates);
    }

    public int hashCode() {
        return (this.headerTitle.hashCode() * 31) + this.bottomSheetRowStates.hashCode();
    }

    public String toString() {
        return "EquityAdvancedOrderBottomSheetState(headerTitle=" + this.headerTitle + ", bottomSheetRowStates=" + this.bottomSheetRowStates + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EquityAdvancedOrderBottomSheetState(StringResource headerTitle, ImmutableList<? extends BottomSheetRowState.BaseRow> bottomSheetRowStates) {
        Intrinsics.checkNotNullParameter(headerTitle, "headerTitle");
        Intrinsics.checkNotNullParameter(bottomSheetRowStates, "bottomSheetRowStates");
        this.headerTitle = headerTitle;
        this.bottomSheetRowStates = bottomSheetRowStates;
    }

    public final StringResource getHeaderTitle() {
        return this.headerTitle;
    }

    public final ImmutableList<BottomSheetRowState.BaseRow> getBottomSheetRowStates() {
        return this.bottomSheetRowStates;
    }

    /* compiled from: EquityAdvancedOrderBottomSheetState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState$BottomSheetRowState;", "Landroid/os/Parcelable;", "BaseRow", "BaseDataRow", "TradingSessionRow", EquityOrderFormRowState2.TimeInForceRowTestTag, EquityOrderFormRowState2.StrategyRowTestTag, "SubtitleRow", "VisualizerRow", "DisclaimerMarkdownRow", "DisclaimerTextRow", "DoneButtonRow", "lib-advanced-order-bottom-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface BottomSheetRowState extends Parcelable {

        /* compiled from: EquityAdvancedOrderBottomSheetState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000fR\u0012\u0010\u0018\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState$BottomSheetRowState$BaseDataRow;", "", "testTag", "", "getTestTag", "()Ljava/lang/String;", "rowPrimaryText", "Lcom/robinhood/utils/resource/StringResource;", "getRowPrimaryText", "()Lcom/robinhood/utils/resource/StringResource;", "rowSecondaryText", "getRowSecondaryText", "selected", "", "getSelected", "()Z", "showDivider", "getShowDivider", "rowType", "Lcom/robinhood/android/advancedorderbottomsheet/EditingField;", "getRowType", "()Lcom/robinhood/android/advancedorderbottomsheet/EditingField;", "hideOnSelect", "getHideOnSelect", "enabled", "getEnabled", "lib-advanced-order-bottom-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public interface BaseDataRow {
            boolean getEnabled();

            boolean getHideOnSelect();

            StringResource getRowPrimaryText();

            StringResource getRowSecondaryText();

            EditingField getRowType();

            boolean getSelected();

            boolean getShowDivider();

            String getTestTag();
        }

        /* compiled from: EquityAdvancedOrderBottomSheetState.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState$BottomSheetRowState$BaseRow;", "", "testTag", "", "getTestTag", "()Ljava/lang/String;", "lib-advanced-order-bottom-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public interface BaseRow {
            String getTestTag();
        }

        /* compiled from: EquityAdvancedOrderBottomSheetState.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BO\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010!\u001a\u00020\u0004HÆ\u0003J\t\u0010\"\u001a\u00020\u0004HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003J[\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010*\u001a\u00020\u00072\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u001eHÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0014\u0010\f\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState$BottomSheetRowState$TradingSessionRow;", "Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState$BottomSheetRowState$BaseDataRow;", "Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState$BottomSheetRowState$BaseRow;", "rowPrimaryText", "Lcom/robinhood/utils/resource/StringResource;", "rowSecondaryText", "selected", "", "showDivider", "rowType", "Lcom/robinhood/android/advancedorderbottomsheet/EditingField;", "hideOnSelect", "enabled", "tradingSession", "Lcom/robinhood/models/db/OrderMarketHours;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;ZZLcom/robinhood/android/advancedorderbottomsheet/EditingField;ZZLcom/robinhood/models/db/OrderMarketHours;)V", "getRowPrimaryText", "()Lcom/robinhood/utils/resource/StringResource;", "getRowSecondaryText", "getSelected", "()Z", "getShowDivider", "getRowType", "()Lcom/robinhood/android/advancedorderbottomsheet/EditingField;", "getHideOnSelect", "getEnabled", "getTradingSession", "()Lcom/robinhood/models/db/OrderMarketHours;", "testTag", "", "getTestTag", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "lib-advanced-order-bottom-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TradingSessionRow implements BaseDataRow, BaseRow {
            public static final int $stable = StringResource.$stable;
            private final boolean enabled;
            private final boolean hideOnSelect;
            private final StringResource rowPrimaryText;
            private final StringResource rowSecondaryText;
            private final EditingField rowType;
            private final boolean selected;
            private final boolean showDivider;
            private final OrderMarketHours tradingSession;

            public static /* synthetic */ TradingSessionRow copy$default(TradingSessionRow tradingSessionRow, StringResource stringResource, StringResource stringResource2, boolean z, boolean z2, EditingField editingField, boolean z3, boolean z4, OrderMarketHours orderMarketHours, int i, Object obj) {
                if ((i & 1) != 0) {
                    stringResource = tradingSessionRow.rowPrimaryText;
                }
                if ((i & 2) != 0) {
                    stringResource2 = tradingSessionRow.rowSecondaryText;
                }
                if ((i & 4) != 0) {
                    z = tradingSessionRow.selected;
                }
                if ((i & 8) != 0) {
                    z2 = tradingSessionRow.showDivider;
                }
                if ((i & 16) != 0) {
                    editingField = tradingSessionRow.rowType;
                }
                if ((i & 32) != 0) {
                    z3 = tradingSessionRow.hideOnSelect;
                }
                if ((i & 64) != 0) {
                    z4 = tradingSessionRow.enabled;
                }
                if ((i & 128) != 0) {
                    orderMarketHours = tradingSessionRow.tradingSession;
                }
                boolean z5 = z4;
                OrderMarketHours orderMarketHours2 = orderMarketHours;
                EditingField editingField2 = editingField;
                boolean z6 = z3;
                return tradingSessionRow.copy(stringResource, stringResource2, z, z2, editingField2, z6, z5, orderMarketHours2);
            }

            /* renamed from: component1, reason: from getter */
            public final StringResource getRowPrimaryText() {
                return this.rowPrimaryText;
            }

            /* renamed from: component2, reason: from getter */
            public final StringResource getRowSecondaryText() {
                return this.rowSecondaryText;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getSelected() {
                return this.selected;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getShowDivider() {
                return this.showDivider;
            }

            /* renamed from: component5, reason: from getter */
            public final EditingField getRowType() {
                return this.rowType;
            }

            /* renamed from: component6, reason: from getter */
            public final boolean getHideOnSelect() {
                return this.hideOnSelect;
            }

            /* renamed from: component7, reason: from getter */
            public final boolean getEnabled() {
                return this.enabled;
            }

            /* renamed from: component8, reason: from getter */
            public final OrderMarketHours getTradingSession() {
                return this.tradingSession;
            }

            public final TradingSessionRow copy(StringResource rowPrimaryText, StringResource rowSecondaryText, boolean selected, boolean showDivider, EditingField rowType, boolean hideOnSelect, boolean enabled, OrderMarketHours tradingSession) {
                Intrinsics.checkNotNullParameter(rowPrimaryText, "rowPrimaryText");
                Intrinsics.checkNotNullParameter(rowSecondaryText, "rowSecondaryText");
                Intrinsics.checkNotNullParameter(tradingSession, "tradingSession");
                return new TradingSessionRow(rowPrimaryText, rowSecondaryText, selected, showDivider, rowType, hideOnSelect, enabled, tradingSession);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TradingSessionRow)) {
                    return false;
                }
                TradingSessionRow tradingSessionRow = (TradingSessionRow) other;
                return Intrinsics.areEqual(this.rowPrimaryText, tradingSessionRow.rowPrimaryText) && Intrinsics.areEqual(this.rowSecondaryText, tradingSessionRow.rowSecondaryText) && this.selected == tradingSessionRow.selected && this.showDivider == tradingSessionRow.showDivider && this.rowType == tradingSessionRow.rowType && this.hideOnSelect == tradingSessionRow.hideOnSelect && this.enabled == tradingSessionRow.enabled && this.tradingSession == tradingSessionRow.tradingSession;
            }

            public int hashCode() {
                int iHashCode = ((((((this.rowPrimaryText.hashCode() * 31) + this.rowSecondaryText.hashCode()) * 31) + Boolean.hashCode(this.selected)) * 31) + Boolean.hashCode(this.showDivider)) * 31;
                EditingField editingField = this.rowType;
                return ((((((iHashCode + (editingField == null ? 0 : editingField.hashCode())) * 31) + Boolean.hashCode(this.hideOnSelect)) * 31) + Boolean.hashCode(this.enabled)) * 31) + this.tradingSession.hashCode();
            }

            public String toString() {
                return "TradingSessionRow(rowPrimaryText=" + this.rowPrimaryText + ", rowSecondaryText=" + this.rowSecondaryText + ", selected=" + this.selected + ", showDivider=" + this.showDivider + ", rowType=" + this.rowType + ", hideOnSelect=" + this.hideOnSelect + ", enabled=" + this.enabled + ", tradingSession=" + this.tradingSession + ")";
            }

            public TradingSessionRow(StringResource rowPrimaryText, StringResource rowSecondaryText, boolean z, boolean z2, EditingField editingField, boolean z3, boolean z4, OrderMarketHours tradingSession) {
                Intrinsics.checkNotNullParameter(rowPrimaryText, "rowPrimaryText");
                Intrinsics.checkNotNullParameter(rowSecondaryText, "rowSecondaryText");
                Intrinsics.checkNotNullParameter(tradingSession, "tradingSession");
                this.rowPrimaryText = rowPrimaryText;
                this.rowSecondaryText = rowSecondaryText;
                this.selected = z;
                this.showDivider = z2;
                this.rowType = editingField;
                this.hideOnSelect = z3;
                this.enabled = z4;
                this.tradingSession = tradingSession;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ TradingSessionRow(StringResource stringResource, StringResource stringResource2, boolean z, boolean z2, EditingField editingField, boolean z3, boolean z4, OrderMarketHours orderMarketHours, int i, DefaultConstructorMarker defaultConstructorMarker) {
                OrderMarketHours orderMarketHours2;
                boolean z5;
                z2 = (i & 8) != 0 ? true : z2;
                z3 = (i & 32) != 0 ? false : z3;
                if ((i & 64) != 0) {
                    orderMarketHours2 = orderMarketHours;
                    z5 = true;
                } else {
                    orderMarketHours2 = orderMarketHours;
                    z5 = z4;
                }
                this(stringResource, stringResource2, z, z2, editingField, z3, z5, orderMarketHours2);
            }

            @Override // com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseDataRow
            public StringResource getRowPrimaryText() {
                return this.rowPrimaryText;
            }

            @Override // com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseDataRow
            public StringResource getRowSecondaryText() {
                return this.rowSecondaryText;
            }

            @Override // com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseDataRow
            public boolean getSelected() {
                return this.selected;
            }

            @Override // com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseDataRow
            public boolean getShowDivider() {
                return this.showDivider;
            }

            @Override // com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseDataRow
            public EditingField getRowType() {
                return this.rowType;
            }

            @Override // com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseDataRow
            public boolean getHideOnSelect() {
                return this.hideOnSelect;
            }

            @Override // com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseDataRow
            public boolean getEnabled() {
                return this.enabled;
            }

            public final OrderMarketHours getTradingSession() {
                return this.tradingSession;
            }

            @Override // com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseDataRow, com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseRow
            public String getTestTag() {
                return "BottomSheetRowTestTag-" + getRowType() + "-" + this.tradingSession;
            }
        }

        /* compiled from: EquityAdvancedOrderBottomSheetState.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BO\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010!\u001a\u00020\u0004HÆ\u0003J\t\u0010\"\u001a\u00020\u0004HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003J[\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010*\u001a\u00020\u00072\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u001eHÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0014\u0010\f\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState$BottomSheetRowState$TimeInForceRow;", "Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState$BottomSheetRowState$BaseDataRow;", "Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState$BottomSheetRowState$BaseRow;", "rowPrimaryText", "Lcom/robinhood/utils/resource/StringResource;", "rowSecondaryText", "selected", "", "showDivider", "rowType", "Lcom/robinhood/android/advancedorderbottomsheet/EditingField;", "enabled", "hideOnSelect", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;ZZLcom/robinhood/android/advancedorderbottomsheet/EditingField;ZZLcom/robinhood/models/db/OrderTimeInForce;)V", "getRowPrimaryText", "()Lcom/robinhood/utils/resource/StringResource;", "getRowSecondaryText", "getSelected", "()Z", "getShowDivider", "getRowType", "()Lcom/robinhood/android/advancedorderbottomsheet/EditingField;", "getEnabled", "getHideOnSelect", "getTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "testTag", "", "getTestTag", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "lib-advanced-order-bottom-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TimeInForceRow implements BaseDataRow, BaseRow {
            public static final int $stable = StringResource.$stable;
            private final boolean enabled;
            private final boolean hideOnSelect;
            private final StringResource rowPrimaryText;
            private final StringResource rowSecondaryText;
            private final EditingField rowType;
            private final boolean selected;
            private final boolean showDivider;
            private final OrderTimeInForce timeInForce;

            public static /* synthetic */ TimeInForceRow copy$default(TimeInForceRow timeInForceRow, StringResource stringResource, StringResource stringResource2, boolean z, boolean z2, EditingField editingField, boolean z3, boolean z4, OrderTimeInForce orderTimeInForce, int i, Object obj) {
                if ((i & 1) != 0) {
                    stringResource = timeInForceRow.rowPrimaryText;
                }
                if ((i & 2) != 0) {
                    stringResource2 = timeInForceRow.rowSecondaryText;
                }
                if ((i & 4) != 0) {
                    z = timeInForceRow.selected;
                }
                if ((i & 8) != 0) {
                    z2 = timeInForceRow.showDivider;
                }
                if ((i & 16) != 0) {
                    editingField = timeInForceRow.rowType;
                }
                if ((i & 32) != 0) {
                    z3 = timeInForceRow.enabled;
                }
                if ((i & 64) != 0) {
                    z4 = timeInForceRow.hideOnSelect;
                }
                if ((i & 128) != 0) {
                    orderTimeInForce = timeInForceRow.timeInForce;
                }
                boolean z5 = z4;
                OrderTimeInForce orderTimeInForce2 = orderTimeInForce;
                EditingField editingField2 = editingField;
                boolean z6 = z3;
                return timeInForceRow.copy(stringResource, stringResource2, z, z2, editingField2, z6, z5, orderTimeInForce2);
            }

            /* renamed from: component1, reason: from getter */
            public final StringResource getRowPrimaryText() {
                return this.rowPrimaryText;
            }

            /* renamed from: component2, reason: from getter */
            public final StringResource getRowSecondaryText() {
                return this.rowSecondaryText;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getSelected() {
                return this.selected;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getShowDivider() {
                return this.showDivider;
            }

            /* renamed from: component5, reason: from getter */
            public final EditingField getRowType() {
                return this.rowType;
            }

            /* renamed from: component6, reason: from getter */
            public final boolean getEnabled() {
                return this.enabled;
            }

            /* renamed from: component7, reason: from getter */
            public final boolean getHideOnSelect() {
                return this.hideOnSelect;
            }

            /* renamed from: component8, reason: from getter */
            public final OrderTimeInForce getTimeInForce() {
                return this.timeInForce;
            }

            public final TimeInForceRow copy(StringResource rowPrimaryText, StringResource rowSecondaryText, boolean selected, boolean showDivider, EditingField rowType, boolean enabled, boolean hideOnSelect, OrderTimeInForce timeInForce) {
                Intrinsics.checkNotNullParameter(rowPrimaryText, "rowPrimaryText");
                Intrinsics.checkNotNullParameter(rowSecondaryText, "rowSecondaryText");
                Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
                return new TimeInForceRow(rowPrimaryText, rowSecondaryText, selected, showDivider, rowType, enabled, hideOnSelect, timeInForce);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TimeInForceRow)) {
                    return false;
                }
                TimeInForceRow timeInForceRow = (TimeInForceRow) other;
                return Intrinsics.areEqual(this.rowPrimaryText, timeInForceRow.rowPrimaryText) && Intrinsics.areEqual(this.rowSecondaryText, timeInForceRow.rowSecondaryText) && this.selected == timeInForceRow.selected && this.showDivider == timeInForceRow.showDivider && this.rowType == timeInForceRow.rowType && this.enabled == timeInForceRow.enabled && this.hideOnSelect == timeInForceRow.hideOnSelect && this.timeInForce == timeInForceRow.timeInForce;
            }

            public int hashCode() {
                int iHashCode = ((((((this.rowPrimaryText.hashCode() * 31) + this.rowSecondaryText.hashCode()) * 31) + Boolean.hashCode(this.selected)) * 31) + Boolean.hashCode(this.showDivider)) * 31;
                EditingField editingField = this.rowType;
                return ((((((iHashCode + (editingField == null ? 0 : editingField.hashCode())) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.hideOnSelect)) * 31) + this.timeInForce.hashCode();
            }

            public String toString() {
                return "TimeInForceRow(rowPrimaryText=" + this.rowPrimaryText + ", rowSecondaryText=" + this.rowSecondaryText + ", selected=" + this.selected + ", showDivider=" + this.showDivider + ", rowType=" + this.rowType + ", enabled=" + this.enabled + ", hideOnSelect=" + this.hideOnSelect + ", timeInForce=" + this.timeInForce + ")";
            }

            public TimeInForceRow(StringResource rowPrimaryText, StringResource rowSecondaryText, boolean z, boolean z2, EditingField editingField, boolean z3, boolean z4, OrderTimeInForce timeInForce) {
                Intrinsics.checkNotNullParameter(rowPrimaryText, "rowPrimaryText");
                Intrinsics.checkNotNullParameter(rowSecondaryText, "rowSecondaryText");
                Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
                this.rowPrimaryText = rowPrimaryText;
                this.rowSecondaryText = rowSecondaryText;
                this.selected = z;
                this.showDivider = z2;
                this.rowType = editingField;
                this.enabled = z3;
                this.hideOnSelect = z4;
                this.timeInForce = timeInForce;
            }

            public /* synthetic */ TimeInForceRow(StringResource stringResource, StringResource stringResource2, boolean z, boolean z2, EditingField editingField, boolean z3, boolean z4, OrderTimeInForce orderTimeInForce, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(stringResource, stringResource2, z, (i & 8) != 0 ? true : z2, editingField, (i & 32) != 0 ? true : z3, (i & 64) != 0 ? false : z4, orderTimeInForce);
            }

            @Override // com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseDataRow
            public StringResource getRowPrimaryText() {
                return this.rowPrimaryText;
            }

            @Override // com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseDataRow
            public StringResource getRowSecondaryText() {
                return this.rowSecondaryText;
            }

            @Override // com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseDataRow
            public boolean getSelected() {
                return this.selected;
            }

            @Override // com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseDataRow
            public boolean getShowDivider() {
                return this.showDivider;
            }

            @Override // com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseDataRow
            public EditingField getRowType() {
                return this.rowType;
            }

            @Override // com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseDataRow
            public boolean getEnabled() {
                return this.enabled;
            }

            @Override // com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseDataRow
            public boolean getHideOnSelect() {
                return this.hideOnSelect;
            }

            public final OrderTimeInForce getTimeInForce() {
                return this.timeInForce;
            }

            @Override // com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseDataRow, com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseRow
            public String getTestTag() {
                return "BottomSheetRowTestTag-" + getRowType() + "-" + this.timeInForce;
            }
        }

        /* compiled from: EquityAdvancedOrderBottomSheetState.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BM\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010!\u001a\u00020\u0004HÆ\u0003J\t\u0010\"\u001a\u00020\u0004HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003J[\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010*\u001a\u00020\u00072\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u001eHÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0014\u0010\f\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState$BottomSheetRowState$StrategyRow;", "Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState$BottomSheetRowState$BaseDataRow;", "Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState$BottomSheetRowState$BaseRow;", "rowPrimaryText", "Lcom/robinhood/utils/resource/StringResource;", "rowSecondaryText", "selected", "", "showDivider", "rowType", "Lcom/robinhood/android/advancedorderbottomsheet/EditingField;", "hideOnSelect", "enabled", "availableSelectionStrategyOption", "Lequity_trading_tax_lots/proto/v1/AvailableSelectionStrategyOption;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;ZZLcom/robinhood/android/advancedorderbottomsheet/EditingField;ZZLequity_trading_tax_lots/proto/v1/AvailableSelectionStrategyOption;)V", "getRowPrimaryText", "()Lcom/robinhood/utils/resource/StringResource;", "getRowSecondaryText", "getSelected", "()Z", "getShowDivider", "getRowType", "()Lcom/robinhood/android/advancedorderbottomsheet/EditingField;", "getHideOnSelect", "getEnabled", "getAvailableSelectionStrategyOption", "()Lequity_trading_tax_lots/proto/v1/AvailableSelectionStrategyOption;", "testTag", "", "getTestTag", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "lib-advanced-order-bottom-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class StrategyRow implements BaseDataRow, BaseRow {
            public static final int $stable = 8;
            private final AvailableSelectionStrategyOption availableSelectionStrategyOption;
            private final boolean enabled;
            private final boolean hideOnSelect;
            private final StringResource rowPrimaryText;
            private final StringResource rowSecondaryText;
            private final EditingField rowType;
            private final boolean selected;
            private final boolean showDivider;

            public static /* synthetic */ StrategyRow copy$default(StrategyRow strategyRow, StringResource stringResource, StringResource stringResource2, boolean z, boolean z2, EditingField editingField, boolean z3, boolean z4, AvailableSelectionStrategyOption availableSelectionStrategyOption, int i, Object obj) {
                if ((i & 1) != 0) {
                    stringResource = strategyRow.rowPrimaryText;
                }
                if ((i & 2) != 0) {
                    stringResource2 = strategyRow.rowSecondaryText;
                }
                if ((i & 4) != 0) {
                    z = strategyRow.selected;
                }
                if ((i & 8) != 0) {
                    z2 = strategyRow.showDivider;
                }
                if ((i & 16) != 0) {
                    editingField = strategyRow.rowType;
                }
                if ((i & 32) != 0) {
                    z3 = strategyRow.hideOnSelect;
                }
                if ((i & 64) != 0) {
                    z4 = strategyRow.enabled;
                }
                if ((i & 128) != 0) {
                    availableSelectionStrategyOption = strategyRow.availableSelectionStrategyOption;
                }
                boolean z5 = z4;
                AvailableSelectionStrategyOption availableSelectionStrategyOption2 = availableSelectionStrategyOption;
                EditingField editingField2 = editingField;
                boolean z6 = z3;
                return strategyRow.copy(stringResource, stringResource2, z, z2, editingField2, z6, z5, availableSelectionStrategyOption2);
            }

            /* renamed from: component1, reason: from getter */
            public final StringResource getRowPrimaryText() {
                return this.rowPrimaryText;
            }

            /* renamed from: component2, reason: from getter */
            public final StringResource getRowSecondaryText() {
                return this.rowSecondaryText;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getSelected() {
                return this.selected;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getShowDivider() {
                return this.showDivider;
            }

            /* renamed from: component5, reason: from getter */
            public final EditingField getRowType() {
                return this.rowType;
            }

            /* renamed from: component6, reason: from getter */
            public final boolean getHideOnSelect() {
                return this.hideOnSelect;
            }

            /* renamed from: component7, reason: from getter */
            public final boolean getEnabled() {
                return this.enabled;
            }

            /* renamed from: component8, reason: from getter */
            public final AvailableSelectionStrategyOption getAvailableSelectionStrategyOption() {
                return this.availableSelectionStrategyOption;
            }

            public final StrategyRow copy(StringResource rowPrimaryText, StringResource rowSecondaryText, boolean selected, boolean showDivider, EditingField rowType, boolean hideOnSelect, boolean enabled, AvailableSelectionStrategyOption availableSelectionStrategyOption) {
                Intrinsics.checkNotNullParameter(rowPrimaryText, "rowPrimaryText");
                Intrinsics.checkNotNullParameter(rowSecondaryText, "rowSecondaryText");
                Intrinsics.checkNotNullParameter(availableSelectionStrategyOption, "availableSelectionStrategyOption");
                return new StrategyRow(rowPrimaryText, rowSecondaryText, selected, showDivider, rowType, hideOnSelect, enabled, availableSelectionStrategyOption);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StrategyRow)) {
                    return false;
                }
                StrategyRow strategyRow = (StrategyRow) other;
                return Intrinsics.areEqual(this.rowPrimaryText, strategyRow.rowPrimaryText) && Intrinsics.areEqual(this.rowSecondaryText, strategyRow.rowSecondaryText) && this.selected == strategyRow.selected && this.showDivider == strategyRow.showDivider && this.rowType == strategyRow.rowType && this.hideOnSelect == strategyRow.hideOnSelect && this.enabled == strategyRow.enabled && Intrinsics.areEqual(this.availableSelectionStrategyOption, strategyRow.availableSelectionStrategyOption);
            }

            public int hashCode() {
                int iHashCode = ((((((this.rowPrimaryText.hashCode() * 31) + this.rowSecondaryText.hashCode()) * 31) + Boolean.hashCode(this.selected)) * 31) + Boolean.hashCode(this.showDivider)) * 31;
                EditingField editingField = this.rowType;
                return ((((((iHashCode + (editingField == null ? 0 : editingField.hashCode())) * 31) + Boolean.hashCode(this.hideOnSelect)) * 31) + Boolean.hashCode(this.enabled)) * 31) + this.availableSelectionStrategyOption.hashCode();
            }

            public String toString() {
                return "StrategyRow(rowPrimaryText=" + this.rowPrimaryText + ", rowSecondaryText=" + this.rowSecondaryText + ", selected=" + this.selected + ", showDivider=" + this.showDivider + ", rowType=" + this.rowType + ", hideOnSelect=" + this.hideOnSelect + ", enabled=" + this.enabled + ", availableSelectionStrategyOption=" + this.availableSelectionStrategyOption + ")";
            }

            public StrategyRow(StringResource rowPrimaryText, StringResource rowSecondaryText, boolean z, boolean z2, EditingField editingField, boolean z3, boolean z4, AvailableSelectionStrategyOption availableSelectionStrategyOption) {
                Intrinsics.checkNotNullParameter(rowPrimaryText, "rowPrimaryText");
                Intrinsics.checkNotNullParameter(rowSecondaryText, "rowSecondaryText");
                Intrinsics.checkNotNullParameter(availableSelectionStrategyOption, "availableSelectionStrategyOption");
                this.rowPrimaryText = rowPrimaryText;
                this.rowSecondaryText = rowSecondaryText;
                this.selected = z;
                this.showDivider = z2;
                this.rowType = editingField;
                this.hideOnSelect = z3;
                this.enabled = z4;
                this.availableSelectionStrategyOption = availableSelectionStrategyOption;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ StrategyRow(StringResource stringResource, StringResource stringResource2, boolean z, boolean z2, EditingField editingField, boolean z3, boolean z4, AvailableSelectionStrategyOption availableSelectionStrategyOption, int i, DefaultConstructorMarker defaultConstructorMarker) {
                AvailableSelectionStrategyOption availableSelectionStrategyOption2;
                boolean z5;
                z3 = (i & 32) != 0 ? true : z3;
                if ((i & 64) != 0) {
                    availableSelectionStrategyOption2 = availableSelectionStrategyOption;
                    z5 = true;
                } else {
                    availableSelectionStrategyOption2 = availableSelectionStrategyOption;
                    z5 = z4;
                }
                this(stringResource, stringResource2, z, z2, editingField, z3, z5, availableSelectionStrategyOption2);
            }

            @Override // com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseDataRow
            public StringResource getRowPrimaryText() {
                return this.rowPrimaryText;
            }

            @Override // com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseDataRow
            public StringResource getRowSecondaryText() {
                return this.rowSecondaryText;
            }

            @Override // com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseDataRow
            public boolean getSelected() {
                return this.selected;
            }

            @Override // com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseDataRow
            public boolean getShowDivider() {
                return this.showDivider;
            }

            @Override // com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseDataRow
            public EditingField getRowType() {
                return this.rowType;
            }

            @Override // com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseDataRow
            public boolean getHideOnSelect() {
                return this.hideOnSelect;
            }

            @Override // com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseDataRow
            public boolean getEnabled() {
                return this.enabled;
            }

            public final AvailableSelectionStrategyOption getAvailableSelectionStrategyOption() {
                return this.availableSelectionStrategyOption;
            }

            @Override // com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseDataRow, com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseRow
            public String getTestTag() {
                return "BottomSheetRowTestTag-" + getRowType() + "-" + this.availableSelectionStrategyOption.getSelection_strategy();
            }
        }

        /* compiled from: EquityAdvancedOrderBottomSheetState.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState$BottomSheetRowState$SubtitleRow;", "Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState$BottomSheetRowState$BaseRow;", "testTag", "", "rowPrimaryText", "Lcom/robinhood/utils/resource/StringResource;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "<init>", "(Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Landroidx/compose/ui/Alignment$Horizontal;)V", "getTestTag", "()Ljava/lang/String;", "getRowPrimaryText", "()Lcom/robinhood/utils/resource/StringResource;", "getHorizontalAlignment", "()Landroidx/compose/ui/Alignment$Horizontal;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-advanced-order-bottom-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SubtitleRow implements BaseRow {
            public static final int $stable = StringResource.$stable;
            private final Alignment.Horizontal horizontalAlignment;
            private final StringResource rowPrimaryText;
            private final String testTag;

            public static /* synthetic */ SubtitleRow copy$default(SubtitleRow subtitleRow, String str, StringResource stringResource, Alignment.Horizontal horizontal, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = subtitleRow.testTag;
                }
                if ((i & 2) != 0) {
                    stringResource = subtitleRow.rowPrimaryText;
                }
                if ((i & 4) != 0) {
                    horizontal = subtitleRow.horizontalAlignment;
                }
                return subtitleRow.copy(str, stringResource, horizontal);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTestTag() {
                return this.testTag;
            }

            /* renamed from: component2, reason: from getter */
            public final StringResource getRowPrimaryText() {
                return this.rowPrimaryText;
            }

            /* renamed from: component3, reason: from getter */
            public final Alignment.Horizontal getHorizontalAlignment() {
                return this.horizontalAlignment;
            }

            public final SubtitleRow copy(String testTag, StringResource rowPrimaryText, Alignment.Horizontal horizontalAlignment) {
                Intrinsics.checkNotNullParameter(testTag, "testTag");
                Intrinsics.checkNotNullParameter(rowPrimaryText, "rowPrimaryText");
                return new SubtitleRow(testTag, rowPrimaryText, horizontalAlignment);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SubtitleRow)) {
                    return false;
                }
                SubtitleRow subtitleRow = (SubtitleRow) other;
                return Intrinsics.areEqual(this.testTag, subtitleRow.testTag) && Intrinsics.areEqual(this.rowPrimaryText, subtitleRow.rowPrimaryText) && Intrinsics.areEqual(this.horizontalAlignment, subtitleRow.horizontalAlignment);
            }

            public int hashCode() {
                int iHashCode = ((this.testTag.hashCode() * 31) + this.rowPrimaryText.hashCode()) * 31;
                Alignment.Horizontal horizontal = this.horizontalAlignment;
                return iHashCode + (horizontal == null ? 0 : horizontal.hashCode());
            }

            public String toString() {
                return "SubtitleRow(testTag=" + this.testTag + ", rowPrimaryText=" + this.rowPrimaryText + ", horizontalAlignment=" + this.horizontalAlignment + ")";
            }

            public SubtitleRow(String testTag, StringResource rowPrimaryText, Alignment.Horizontal horizontal) {
                Intrinsics.checkNotNullParameter(testTag, "testTag");
                Intrinsics.checkNotNullParameter(rowPrimaryText, "rowPrimaryText");
                this.testTag = testTag;
                this.rowPrimaryText = rowPrimaryText;
                this.horizontalAlignment = horizontal;
            }

            @Override // com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseRow
            public String getTestTag() {
                return this.testTag;
            }

            public final StringResource getRowPrimaryText() {
                return this.rowPrimaryText;
            }

            public final Alignment.Horizontal getHorizontalAlignment() {
                return this.horizontalAlignment;
            }
        }

        /* compiled from: EquityAdvancedOrderBottomSheetState.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState$BottomSheetRowState$VisualizerRow;", "Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState$BottomSheetRowState$BaseRow;", "visualizerArgs", "Lcom/robinhood/android/tradinghourvisual/lib/ui/SetTradingHourVisualizerArgs;", "<init>", "(Lcom/robinhood/android/tradinghourvisual/lib/ui/SetTradingHourVisualizerArgs;)V", "getVisualizerArgs", "()Lcom/robinhood/android/tradinghourvisual/lib/ui/SetTradingHourVisualizerArgs;", "testTag", "", "getTestTag", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-advanced-order-bottom-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class VisualizerRow implements BaseRow {
            public static final int $stable = SetTradingHourVisualizerArgs.$stable;
            private final SetTradingHourVisualizerArgs visualizerArgs;

            public static /* synthetic */ VisualizerRow copy$default(VisualizerRow visualizerRow, SetTradingHourVisualizerArgs setTradingHourVisualizerArgs, int i, Object obj) {
                if ((i & 1) != 0) {
                    setTradingHourVisualizerArgs = visualizerRow.visualizerArgs;
                }
                return visualizerRow.copy(setTradingHourVisualizerArgs);
            }

            /* renamed from: component1, reason: from getter */
            public final SetTradingHourVisualizerArgs getVisualizerArgs() {
                return this.visualizerArgs;
            }

            public final VisualizerRow copy(SetTradingHourVisualizerArgs visualizerArgs) {
                Intrinsics.checkNotNullParameter(visualizerArgs, "visualizerArgs");
                return new VisualizerRow(visualizerArgs);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof VisualizerRow) && Intrinsics.areEqual(this.visualizerArgs, ((VisualizerRow) other).visualizerArgs);
            }

            public int hashCode() {
                return this.visualizerArgs.hashCode();
            }

            public String toString() {
                return "VisualizerRow(visualizerArgs=" + this.visualizerArgs + ")";
            }

            public VisualizerRow(SetTradingHourVisualizerArgs visualizerArgs) {
                Intrinsics.checkNotNullParameter(visualizerArgs, "visualizerArgs");
                this.visualizerArgs = visualizerArgs;
            }

            public final SetTradingHourVisualizerArgs getVisualizerArgs() {
                return this.visualizerArgs;
            }

            @Override // com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseRow
            public String getTestTag() {
                return "BottomSheetRowTestTag-VisualizerRow";
            }
        }

        /* compiled from: EquityAdvancedOrderBottomSheetState.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState$BottomSheetRowState$DisclaimerMarkdownRow;", "Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState$BottomSheetRowState$BaseRow;", "disclaimerMarkdown", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getDisclaimerMarkdown", "()Lcom/robinhood/utils/resource/StringResource;", "testTag", "", "getTestTag", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-advanced-order-bottom-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class DisclaimerMarkdownRow implements BaseRow {
            public static final int $stable = StringResource.$stable;
            private final StringResource disclaimerMarkdown;

            public static /* synthetic */ DisclaimerMarkdownRow copy$default(DisclaimerMarkdownRow disclaimerMarkdownRow, StringResource stringResource, int i, Object obj) {
                if ((i & 1) != 0) {
                    stringResource = disclaimerMarkdownRow.disclaimerMarkdown;
                }
                return disclaimerMarkdownRow.copy(stringResource);
            }

            /* renamed from: component1, reason: from getter */
            public final StringResource getDisclaimerMarkdown() {
                return this.disclaimerMarkdown;
            }

            public final DisclaimerMarkdownRow copy(StringResource disclaimerMarkdown) {
                Intrinsics.checkNotNullParameter(disclaimerMarkdown, "disclaimerMarkdown");
                return new DisclaimerMarkdownRow(disclaimerMarkdown);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DisclaimerMarkdownRow) && Intrinsics.areEqual(this.disclaimerMarkdown, ((DisclaimerMarkdownRow) other).disclaimerMarkdown);
            }

            public int hashCode() {
                return this.disclaimerMarkdown.hashCode();
            }

            public String toString() {
                return "DisclaimerMarkdownRow(disclaimerMarkdown=" + this.disclaimerMarkdown + ")";
            }

            public DisclaimerMarkdownRow(StringResource disclaimerMarkdown) {
                Intrinsics.checkNotNullParameter(disclaimerMarkdown, "disclaimerMarkdown");
                this.disclaimerMarkdown = disclaimerMarkdown;
            }

            public final StringResource getDisclaimerMarkdown() {
                return this.disclaimerMarkdown;
            }

            @Override // com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseRow
            public String getTestTag() {
                return "BottomSheetRowTestTag-DisclaimerMarkdownRow";
            }
        }

        /* compiled from: EquityAdvancedOrderBottomSheetState.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState$BottomSheetRowState$DisclaimerTextRow;", "Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState$BottomSheetRowState$BaseRow;", "disclaimerText", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getDisclaimerText", "()Lcom/robinhood/utils/resource/StringResource;", "testTag", "", "getTestTag", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-advanced-order-bottom-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class DisclaimerTextRow implements BaseRow {
            public static final int $stable = StringResource.$stable;
            private final StringResource disclaimerText;

            public static /* synthetic */ DisclaimerTextRow copy$default(DisclaimerTextRow disclaimerTextRow, StringResource stringResource, int i, Object obj) {
                if ((i & 1) != 0) {
                    stringResource = disclaimerTextRow.disclaimerText;
                }
                return disclaimerTextRow.copy(stringResource);
            }

            /* renamed from: component1, reason: from getter */
            public final StringResource getDisclaimerText() {
                return this.disclaimerText;
            }

            public final DisclaimerTextRow copy(StringResource disclaimerText) {
                Intrinsics.checkNotNullParameter(disclaimerText, "disclaimerText");
                return new DisclaimerTextRow(disclaimerText);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DisclaimerTextRow) && Intrinsics.areEqual(this.disclaimerText, ((DisclaimerTextRow) other).disclaimerText);
            }

            public int hashCode() {
                return this.disclaimerText.hashCode();
            }

            public String toString() {
                return "DisclaimerTextRow(disclaimerText=" + this.disclaimerText + ")";
            }

            public DisclaimerTextRow(StringResource disclaimerText) {
                Intrinsics.checkNotNullParameter(disclaimerText, "disclaimerText");
                this.disclaimerText = disclaimerText;
            }

            public final StringResource getDisclaimerText() {
                return this.disclaimerText;
            }

            @Override // com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseRow
            public String getTestTag() {
                return "BottomSheetRowTestTag-DisclaimerRow";
            }
        }

        /* compiled from: EquityAdvancedOrderBottomSheetState.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState$BottomSheetRowState$DoneButtonRow;", "Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState$BottomSheetRowState$BaseRow;", "buttonText", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getButtonText", "()Lcom/robinhood/utils/resource/StringResource;", "testTag", "", "getTestTag", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-advanced-order-bottom-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class DoneButtonRow implements BaseRow {
            public static final int $stable = StringResource.$stable;
            private final StringResource buttonText;

            /* JADX WARN: Multi-variable type inference failed */
            public DoneButtonRow() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ DoneButtonRow copy$default(DoneButtonRow doneButtonRow, StringResource stringResource, int i, Object obj) {
                if ((i & 1) != 0) {
                    stringResource = doneButtonRow.buttonText;
                }
                return doneButtonRow.copy(stringResource);
            }

            /* renamed from: component1, reason: from getter */
            public final StringResource getButtonText() {
                return this.buttonText;
            }

            public final DoneButtonRow copy(StringResource buttonText) {
                Intrinsics.checkNotNullParameter(buttonText, "buttonText");
                return new DoneButtonRow(buttonText);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DoneButtonRow) && Intrinsics.areEqual(this.buttonText, ((DoneButtonRow) other).buttonText);
            }

            public int hashCode() {
                return this.buttonText.hashCode();
            }

            public String toString() {
                return "DoneButtonRow(buttonText=" + this.buttonText + ")";
            }

            public DoneButtonRow(StringResource buttonText) {
                Intrinsics.checkNotNullParameter(buttonText, "buttonText");
                this.buttonText = buttonText;
            }

            public /* synthetic */ DoneButtonRow(StringResource stringResource, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? StringResource.INSTANCE.invoke(C11048R.string.general_label_done, new Object[0]) : stringResource);
            }

            public final StringResource getButtonText() {
                return this.buttonText;
            }

            @Override // com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseRow
            public String getTestTag() {
                return "BottomSheetRowTestTag-DoneRow";
            }
        }
    }
}
