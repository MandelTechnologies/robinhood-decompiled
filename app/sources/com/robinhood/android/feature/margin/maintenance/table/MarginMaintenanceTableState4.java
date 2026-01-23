package com.robinhood.android.feature.margin.maintenance.table;

import com.robinhood.android.generic.table.GenericTableData;
import com.robinhood.android.lib.screener.ScreenTableCells;
import com.robinhood.rosetta.eventlogging.MarginHealthStateDto;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: MarginMaintenanceTableState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/maintenance/table/MarginMaintenanceTableViewState;", "", "Loading", "Failure", "Success", "Lcom/robinhood/android/feature/margin/maintenance/table/MarginMaintenanceTableViewState$Failure;", "Lcom/robinhood/android/feature/margin/maintenance/table/MarginMaintenanceTableViewState$Loading;", "Lcom/robinhood/android/feature/margin/maintenance/table/MarginMaintenanceTableViewState$Success;", "feature-margin-maintenance-table_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableViewState, reason: use source file name */
/* loaded from: classes3.dex */
public interface MarginMaintenanceTableState4 {

    /* compiled from: MarginMaintenanceTableState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/maintenance/table/MarginMaintenanceTableViewState$Loading;", "Lcom/robinhood/android/feature/margin/maintenance/table/MarginMaintenanceTableViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-maintenance-table_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableViewState$Loading */
    public static final /* data */ class Loading implements MarginMaintenanceTableState4 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -175688446;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: MarginMaintenanceTableState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\t\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0017\u0010\n\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/maintenance/table/MarginMaintenanceTableViewState$Failure;", "Lcom/robinhood/android/feature/margin/maintenance/table/MarginMaintenanceTableViewState;", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/Exception;)V", "getError", "()Ljava/lang/Exception;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-maintenance-table_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableViewState$Failure, reason: from toString */
    public static final /* data */ class Failure implements MarginMaintenanceTableState4 {
        public static final int $stable = 8;
        private final Exception error;

        public static /* synthetic */ Failure copy$default(Failure failure, Exception exc, int i, Object obj) {
            if ((i & 1) != 0) {
                exc = failure.error;
            }
            return failure.copy(exc);
        }

        /* renamed from: component1, reason: from getter */
        public final Exception getError() {
            return this.error;
        }

        public final Failure copy(Exception error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Failure(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failure) && Intrinsics.areEqual(this.error, ((Failure) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Failure(error=" + this.error + ")";
        }

        public Failure(Exception error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final Exception getError() {
            return this.error;
        }
    }

    /* compiled from: MarginMaintenanceTableState.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/maintenance/table/MarginMaintenanceTableViewState$Success;", "Lcom/robinhood/android/feature/margin/maintenance/table/MarginMaintenanceTableViewState;", "header", "", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "table", "Lcom/robinhood/android/generic/table/GenericTableData;", "Lcom/robinhood/android/lib/screener/ScreenerTableCells;", "marginHealthState", "Lcom/robinhood/rosetta/eventlogging/MarginHealthStateDto;", "<init>", "(Ljava/util/List;Lcom/robinhood/android/generic/table/GenericTableData;Lcom/robinhood/rosetta/eventlogging/MarginHealthStateDto;)V", "getHeader", "()Ljava/util/List;", "getTable", "()Lcom/robinhood/android/generic/table/GenericTableData;", "getMarginHealthState", "()Lcom/robinhood/rosetta/eventlogging/MarginHealthStateDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-maintenance-table_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableViewState$Success, reason: from toString */
    public static final /* data */ class Success implements MarginMaintenanceTableState4 {
        public static final int $stable = 8;
        private final List<UIComponentDto.ConcreteDto> header;
        private final MarginHealthStateDto marginHealthState;
        private final GenericTableData<ScreenTableCells> table;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, List list, GenericTableData genericTableData, MarginHealthStateDto marginHealthStateDto, int i, Object obj) {
            if ((i & 1) != 0) {
                list = success.header;
            }
            if ((i & 2) != 0) {
                genericTableData = success.table;
            }
            if ((i & 4) != 0) {
                marginHealthStateDto = success.marginHealthState;
            }
            return success.copy(list, genericTableData, marginHealthStateDto);
        }

        public final List<UIComponentDto.ConcreteDto> component1() {
            return this.header;
        }

        public final GenericTableData<ScreenTableCells> component2() {
            return this.table;
        }

        /* renamed from: component3, reason: from getter */
        public final MarginHealthStateDto getMarginHealthState() {
            return this.marginHealthState;
        }

        public final Success copy(List<? extends UIComponentDto.ConcreteDto> header, GenericTableData<ScreenTableCells> table, MarginHealthStateDto marginHealthState) {
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(table, "table");
            return new Success(header, table, marginHealthState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.areEqual(this.header, success.header) && Intrinsics.areEqual(this.table, success.table) && this.marginHealthState == success.marginHealthState;
        }

        public int hashCode() {
            int iHashCode = ((this.header.hashCode() * 31) + this.table.hashCode()) * 31;
            MarginHealthStateDto marginHealthStateDto = this.marginHealthState;
            return iHashCode + (marginHealthStateDto == null ? 0 : marginHealthStateDto.hashCode());
        }

        public String toString() {
            return "Success(header=" + this.header + ", table=" + this.table + ", marginHealthState=" + this.marginHealthState + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Success(List<? extends UIComponentDto.ConcreteDto> header, GenericTableData<ScreenTableCells> table, MarginHealthStateDto marginHealthStateDto) {
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(table, "table");
            this.header = header;
            this.table = table;
            this.marginHealthState = marginHealthStateDto;
        }

        public /* synthetic */ Success(List list, GenericTableData genericTableData, MarginHealthStateDto marginHealthStateDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, genericTableData, (i & 4) != 0 ? null : marginHealthStateDto);
        }

        public final List<UIComponentDto.ConcreteDto> getHeader() {
            return this.header;
        }

        public final GenericTableData<ScreenTableCells> getTable() {
            return this.table;
        }

        public final MarginHealthStateDto getMarginHealthState() {
            return this.marginHealthState;
        }
    }
}
