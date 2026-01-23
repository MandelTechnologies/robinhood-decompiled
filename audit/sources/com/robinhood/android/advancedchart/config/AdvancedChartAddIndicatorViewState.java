package com.robinhood.android.advancedchart.config;

import com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicator;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedChartAddIndicatorViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/config/AdvancedChartAddIndicatorViewState;", "", "Loading", "Loaded", "Error", "SelectedType", "Lcom/robinhood/android/advancedchart/config/AdvancedChartAddIndicatorViewState$Error;", "Lcom/robinhood/android/advancedchart/config/AdvancedChartAddIndicatorViewState$Loaded;", "Lcom/robinhood/android/advancedchart/config/AdvancedChartAddIndicatorViewState$Loading;", "Lcom/robinhood/android/advancedchart/config/AdvancedChartAddIndicatorViewState$SelectedType;", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public interface AdvancedChartAddIndicatorViewState {

    /* compiled from: AdvancedChartAddIndicatorViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/config/AdvancedChartAddIndicatorViewState$Loading;", "Lcom/robinhood/android/advancedchart/config/AdvancedChartAddIndicatorViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements AdvancedChartAddIndicatorViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 947036374;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: AdvancedChartAddIndicatorViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/config/AdvancedChartAddIndicatorViewState$Loaded;", "Lcom/robinhood/android/advancedchart/config/AdvancedChartAddIndicatorViewState;", "indicatorsList", "", "Lcom/robinhood/android/advancedchart/config/IndicatorTypeListItem;", "<init>", "(Ljava/util/List;)V", "getIndicatorsList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements AdvancedChartAddIndicatorViewState {
        public static final int $stable = 8;
        private final List<IndicatorTypeListItem> indicatorsList;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = loaded.indicatorsList;
            }
            return loaded.copy(list);
        }

        public final List<IndicatorTypeListItem> component1() {
            return this.indicatorsList;
        }

        public final Loaded copy(List<IndicatorTypeListItem> indicatorsList) {
            Intrinsics.checkNotNullParameter(indicatorsList, "indicatorsList");
            return new Loaded(indicatorsList);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.indicatorsList, ((Loaded) other).indicatorsList);
        }

        public int hashCode() {
            return this.indicatorsList.hashCode();
        }

        public String toString() {
            return "Loaded(indicatorsList=" + this.indicatorsList + ")";
        }

        public Loaded(List<IndicatorTypeListItem> indicatorsList) {
            Intrinsics.checkNotNullParameter(indicatorsList, "indicatorsList");
            this.indicatorsList = indicatorsList;
        }

        public final List<IndicatorTypeListItem> getIndicatorsList() {
            return this.indicatorsList;
        }
    }

    /* compiled from: AdvancedChartAddIndicatorViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/config/AdvancedChartAddIndicatorViewState$Error;", "Lcom/robinhood/android/advancedchart/config/AdvancedChartAddIndicatorViewState;", "title", "Lcom/robinhood/utils/resource/StringResource;", "message", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getMessage", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements AdvancedChartAddIndicatorViewState {
        public static final int $stable = StringResource.$stable;
        private final StringResource message;
        private final StringResource title;

        public static /* synthetic */ Error copy$default(Error error, StringResource stringResource, StringResource stringResource2, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = error.title;
            }
            if ((i & 2) != 0) {
                stringResource2 = error.message;
            }
            return error.copy(stringResource, stringResource2);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getMessage() {
            return this.message;
        }

        public final Error copy(StringResource title, StringResource message) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            return new Error(title, message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.areEqual(this.title, error.title) && Intrinsics.areEqual(this.message, error.message);
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.message.hashCode();
        }

        public String toString() {
            return "Error(title=" + this.title + ", message=" + this.message + ")";
        }

        public Error(StringResource title, StringResource message) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            this.title = title;
            this.message = message;
        }

        public final StringResource getTitle() {
            return this.title;
        }

        public final StringResource getMessage() {
            return this.message;
        }
    }

    /* compiled from: AdvancedChartAddIndicatorViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/config/AdvancedChartAddIndicatorViewState$SelectedType;", "Lcom/robinhood/android/advancedchart/config/AdvancedChartAddIndicatorViewState;", "type", "Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator$Type;", "<init>", "(Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator$Type;)V", "getType", "()Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator$Type;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SelectedType implements AdvancedChartAddIndicatorViewState {
        public static final int $stable = 0;
        private final ApiTechnicalIndicator.Type type;

        public static /* synthetic */ SelectedType copy$default(SelectedType selectedType, ApiTechnicalIndicator.Type type2, int i, Object obj) {
            if ((i & 1) != 0) {
                type2 = selectedType.type;
            }
            return selectedType.copy(type2);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiTechnicalIndicator.Type getType() {
            return this.type;
        }

        public final SelectedType copy(ApiTechnicalIndicator.Type type2) {
            Intrinsics.checkNotNullParameter(type2, "type");
            return new SelectedType(type2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SelectedType) && this.type == ((SelectedType) other).type;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        public String toString() {
            return "SelectedType(type=" + this.type + ")";
        }

        public SelectedType(ApiTechnicalIndicator.Type type2) {
            Intrinsics.checkNotNullParameter(type2, "type");
            this.type = type2;
        }

        public final ApiTechnicalIndicator.Type getType() {
            return this.type;
        }
    }
}
