package com.robinhood.android.charts.cursor;

import androidx.compose.p011ui.Modifier;
import com.robinhood.android.designsystem.tooltip.RdsTooltipView;
import com.robinhood.android.educationtour.EducationTourElementIds;
import com.robinhood.android.educationtour.compose.ModifiersKt;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.tooltips.TooltipData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CursorRowModifiers.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\f\r\u000eR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/charts/cursor/CursorRowModifiers;", "", "primaryRowModifier", "Landroidx/compose/ui/Modifier;", "getPrimaryRowModifier", "()Landroidx/compose/ui/Modifier;", "secondaryRowModifier", "getSecondaryRowModifier", "tertiaryRowModifier", "getTertiaryRowModifier", "quaternaryRowModifier", "getQuaternaryRowModifier", "Default", "ChartEducationTour", "TertiaryValueTooltip", "Lcom/robinhood/android/charts/cursor/CursorRowModifiers$ChartEducationTour;", "Lcom/robinhood/android/charts/cursor/CursorRowModifiers$Default;", "Lcom/robinhood/android/charts/cursor/CursorRowModifiers$TertiaryValueTooltip;", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface CursorRowModifiers {
    Modifier getPrimaryRowModifier();

    Modifier getQuaternaryRowModifier();

    Modifier getSecondaryRowModifier();

    Modifier getTertiaryRowModifier();

    /* compiled from: CursorRowModifiers.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/charts/cursor/CursorRowModifiers$Default;", "Lcom/robinhood/android/charts/cursor/CursorRowModifiers;", "<init>", "()V", "primaryRowModifier", "Landroidx/compose/ui/Modifier$Companion;", "getPrimaryRowModifier", "()Landroidx/compose/ui/Modifier$Companion;", "secondaryRowModifier", "getSecondaryRowModifier", "tertiaryRowModifier", "getTertiaryRowModifier", "quaternaryRowModifier", "getQuaternaryRowModifier", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Default implements CursorRowModifiers {
        public static final int $stable = 0;
        public static final Default INSTANCE = new Default();
        private static final Modifier.Companion primaryRowModifier;
        private static final Modifier.Companion quaternaryRowModifier;
        private static final Modifier.Companion secondaryRowModifier;
        private static final Modifier.Companion tertiaryRowModifier;

        public boolean equals(Object other) {
            return this == other || (other instanceof Default);
        }

        public int hashCode() {
            return 628917022;
        }

        public String toString() {
            return "Default";
        }

        private Default() {
        }

        static {
            Modifier.Companion companion = Modifier.INSTANCE;
            primaryRowModifier = companion;
            secondaryRowModifier = companion;
            tertiaryRowModifier = companion;
            quaternaryRowModifier = companion;
        }

        @Override // com.robinhood.android.charts.cursor.CursorRowModifiers
        public Modifier.Companion getPrimaryRowModifier() {
            return primaryRowModifier;
        }

        @Override // com.robinhood.android.charts.cursor.CursorRowModifiers
        public Modifier.Companion getSecondaryRowModifier() {
            return secondaryRowModifier;
        }

        @Override // com.robinhood.android.charts.cursor.CursorRowModifiers
        public Modifier.Companion getTertiaryRowModifier() {
            return tertiaryRowModifier;
        }

        @Override // com.robinhood.android.charts.cursor.CursorRowModifiers
        public Modifier.Companion getQuaternaryRowModifier() {
            return quaternaryRowModifier;
        }
    }

    /* compiled from: CursorRowModifiers.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J7\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/charts/cursor/CursorRowModifiers$ChartEducationTour;", "Lcom/robinhood/android/charts/cursor/CursorRowModifiers;", "onEducationTour", "Lkotlin/Function0;", "", "primaryRowElementId", "", "secondaryRowElementId", "tertiaryRowElementId", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOnEducationTour", "()Lkotlin/jvm/functions/Function0;", "getPrimaryRowElementId", "()Ljava/lang/String;", "getSecondaryRowElementId", "getTertiaryRowElementId", "primaryRowModifier", "Landroidx/compose/ui/Modifier;", "getPrimaryRowModifier", "()Landroidx/compose/ui/Modifier;", "secondaryRowModifier", "getSecondaryRowModifier", "tertiaryRowModifier", "getTertiaryRowModifier", "quaternaryRowModifier", "Landroidx/compose/ui/Modifier$Companion;", "getQuaternaryRowModifier", "()Landroidx/compose/ui/Modifier$Companion;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ChartEducationTour implements CursorRowModifiers {
        public static final int $stable = 0;
        private final Function0<Unit> onEducationTour;
        private final String primaryRowElementId;
        private final Modifier primaryRowModifier;
        private final Modifier.Companion quaternaryRowModifier;
        private final String secondaryRowElementId;
        private final Modifier secondaryRowModifier;
        private final String tertiaryRowElementId;
        private final Modifier tertiaryRowModifier;

        public ChartEducationTour() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ChartEducationTour copy$default(ChartEducationTour chartEducationTour, Function0 function0, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                function0 = chartEducationTour.onEducationTour;
            }
            if ((i & 2) != 0) {
                str = chartEducationTour.primaryRowElementId;
            }
            if ((i & 4) != 0) {
                str2 = chartEducationTour.secondaryRowElementId;
            }
            if ((i & 8) != 0) {
                str3 = chartEducationTour.tertiaryRowElementId;
            }
            return chartEducationTour.copy(function0, str, str2, str3);
        }

        public final Function0<Unit> component1() {
            return this.onEducationTour;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPrimaryRowElementId() {
            return this.primaryRowElementId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSecondaryRowElementId() {
            return this.secondaryRowElementId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTertiaryRowElementId() {
            return this.tertiaryRowElementId;
        }

        public final ChartEducationTour copy(Function0<Unit> onEducationTour, String primaryRowElementId, String secondaryRowElementId, String tertiaryRowElementId) {
            Intrinsics.checkNotNullParameter(onEducationTour, "onEducationTour");
            Intrinsics.checkNotNullParameter(primaryRowElementId, "primaryRowElementId");
            Intrinsics.checkNotNullParameter(secondaryRowElementId, "secondaryRowElementId");
            Intrinsics.checkNotNullParameter(tertiaryRowElementId, "tertiaryRowElementId");
            return new ChartEducationTour(onEducationTour, primaryRowElementId, secondaryRowElementId, tertiaryRowElementId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChartEducationTour)) {
                return false;
            }
            ChartEducationTour chartEducationTour = (ChartEducationTour) other;
            return Intrinsics.areEqual(this.onEducationTour, chartEducationTour.onEducationTour) && Intrinsics.areEqual(this.primaryRowElementId, chartEducationTour.primaryRowElementId) && Intrinsics.areEqual(this.secondaryRowElementId, chartEducationTour.secondaryRowElementId) && Intrinsics.areEqual(this.tertiaryRowElementId, chartEducationTour.tertiaryRowElementId);
        }

        public int hashCode() {
            return (((((this.onEducationTour.hashCode() * 31) + this.primaryRowElementId.hashCode()) * 31) + this.secondaryRowElementId.hashCode()) * 31) + this.tertiaryRowElementId.hashCode();
        }

        public String toString() {
            return "ChartEducationTour(onEducationTour=" + this.onEducationTour + ", primaryRowElementId=" + this.primaryRowElementId + ", secondaryRowElementId=" + this.secondaryRowElementId + ", tertiaryRowElementId=" + this.tertiaryRowElementId + ")";
        }

        public ChartEducationTour(Function0<Unit> onEducationTour, String primaryRowElementId, String secondaryRowElementId, String tertiaryRowElementId) {
            Intrinsics.checkNotNullParameter(onEducationTour, "onEducationTour");
            Intrinsics.checkNotNullParameter(primaryRowElementId, "primaryRowElementId");
            Intrinsics.checkNotNullParameter(secondaryRowElementId, "secondaryRowElementId");
            Intrinsics.checkNotNullParameter(tertiaryRowElementId, "tertiaryRowElementId");
            this.onEducationTour = onEducationTour;
            this.primaryRowElementId = primaryRowElementId;
            this.secondaryRowElementId = secondaryRowElementId;
            this.tertiaryRowElementId = tertiaryRowElementId;
            Modifier.Companion companion = Modifier.INSTANCE;
            this.primaryRowModifier = ModifiersKt.educationTourId$default(companion, primaryRowElementId, null, onEducationTour, false, false, 26, null);
            this.secondaryRowModifier = ModifiersKt.educationTourId$default(companion, secondaryRowElementId, null, onEducationTour, false, false, 26, null);
            this.tertiaryRowModifier = ModifiersKt.educationTourId$default(companion, tertiaryRowElementId, null, onEducationTour, false, false, 26, null);
            this.quaternaryRowModifier = companion;
        }

        public /* synthetic */ ChartEducationTour(Function0 function0, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new Function0() { // from class: com.robinhood.android.charts.cursor.CursorRowModifiers$ChartEducationTour$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            } : function0, (i & 2) != 0 ? EducationTourElementIds.MARKET_PRICE_ELEMENT_ID : str, (i & 4) != 0 ? EducationTourElementIds.PRICE_CHART_PRICE_CHANGE_ELEMENT_ID : str2, (i & 8) != 0 ? EducationTourElementIds.PRICE_CHART_PRICE_CHANGE_ELEMENT_ID : str3);
        }

        public final Function0<Unit> getOnEducationTour() {
            return this.onEducationTour;
        }

        public final String getPrimaryRowElementId() {
            return this.primaryRowElementId;
        }

        public final String getSecondaryRowElementId() {
            return this.secondaryRowElementId;
        }

        public final String getTertiaryRowElementId() {
            return this.tertiaryRowElementId;
        }

        @Override // com.robinhood.android.charts.cursor.CursorRowModifiers
        public Modifier getPrimaryRowModifier() {
            return this.primaryRowModifier;
        }

        @Override // com.robinhood.android.charts.cursor.CursorRowModifiers
        public Modifier getSecondaryRowModifier() {
            return this.secondaryRowModifier;
        }

        @Override // com.robinhood.android.charts.cursor.CursorRowModifiers
        public Modifier getTertiaryRowModifier() {
            return this.tertiaryRowModifier;
        }

        @Override // com.robinhood.android.charts.cursor.CursorRowModifiers
        public Modifier.Companion getQuaternaryRowModifier() {
            return this.quaternaryRowModifier;
        }
    }

    /* compiled from: CursorRowModifiers.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/charts/cursor/CursorRowModifiers$TertiaryValueTooltip;", "Lcom/robinhood/android/charts/cursor/CursorRowModifiers;", "id", "", "text", "shownPref", "Lcom/robinhood/prefs/BooleanPreference;", "canvasTag", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prefs/BooleanPreference;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getText", "getShownPref", "()Lcom/robinhood/prefs/BooleanPreference;", "getCanvasTag", "primaryRowModifier", "Landroidx/compose/ui/Modifier$Companion;", "getPrimaryRowModifier", "()Landroidx/compose/ui/Modifier$Companion;", "secondaryRowModifier", "getSecondaryRowModifier", "tertiaryRowModifier", "Landroidx/compose/ui/Modifier;", "getTertiaryRowModifier", "()Landroidx/compose/ui/Modifier;", "quaternaryRowModifier", "getQuaternaryRowModifier", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TertiaryValueTooltip implements CursorRowModifiers {
        public static final int $stable = 8;
        private final String canvasTag;
        private final String id;
        private final Modifier.Companion primaryRowModifier;
        private final Modifier.Companion quaternaryRowModifier;
        private final Modifier.Companion secondaryRowModifier;
        private final BooleanPreference shownPref;
        private final Modifier tertiaryRowModifier;
        private final String text;

        public static /* synthetic */ TertiaryValueTooltip copy$default(TertiaryValueTooltip tertiaryValueTooltip, String str, String str2, BooleanPreference booleanPreference, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tertiaryValueTooltip.id;
            }
            if ((i & 2) != 0) {
                str2 = tertiaryValueTooltip.text;
            }
            if ((i & 4) != 0) {
                booleanPreference = tertiaryValueTooltip.shownPref;
            }
            if ((i & 8) != 0) {
                str3 = tertiaryValueTooltip.canvasTag;
            }
            return tertiaryValueTooltip.copy(str, str2, booleanPreference, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component3, reason: from getter */
        public final BooleanPreference getShownPref() {
            return this.shownPref;
        }

        /* renamed from: component4, reason: from getter */
        public final String getCanvasTag() {
            return this.canvasTag;
        }

        public final TertiaryValueTooltip copy(String id, String text, BooleanPreference shownPref, String canvasTag) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new TertiaryValueTooltip(id, text, shownPref, canvasTag);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TertiaryValueTooltip)) {
                return false;
            }
            TertiaryValueTooltip tertiaryValueTooltip = (TertiaryValueTooltip) other;
            return Intrinsics.areEqual(this.id, tertiaryValueTooltip.id) && Intrinsics.areEqual(this.text, tertiaryValueTooltip.text) && Intrinsics.areEqual(this.shownPref, tertiaryValueTooltip.shownPref) && Intrinsics.areEqual(this.canvasTag, tertiaryValueTooltip.canvasTag);
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.text.hashCode()) * 31;
            BooleanPreference booleanPreference = this.shownPref;
            int iHashCode2 = (iHashCode + (booleanPreference == null ? 0 : booleanPreference.hashCode())) * 31;
            String str2 = this.canvasTag;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "TertiaryValueTooltip(id=" + this.id + ", text=" + this.text + ", shownPref=" + this.shownPref + ", canvasTag=" + this.canvasTag + ")";
        }

        public TertiaryValueTooltip(String str, String text, BooleanPreference booleanPreference, String str2) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.id = str;
            this.text = text;
            this.shownPref = booleanPreference;
            this.canvasTag = str2;
            Modifier.Companion companion = Modifier.INSTANCE;
            this.primaryRowModifier = companion;
            this.secondaryRowModifier = companion;
            this.tertiaryRowModifier = com.robinhood.tooltips.ModifiersKt.tooltip(companion, text, new TooltipData.Layout(RdsTooltipView.NibDirection.f4107UP, 0.0f, null, str2, 6, null), new TooltipData.Behavior(null, null, booleanPreference, null, null, null, null, 123, null), str, true);
            this.quaternaryRowModifier = companion;
        }

        public /* synthetic */ TertiaryValueTooltip(String str, String str2, BooleanPreference booleanPreference, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, str2, (i & 4) != 0 ? null : booleanPreference, (i & 8) != 0 ? null : str3);
        }

        public final String getId() {
            return this.id;
        }

        public final String getText() {
            return this.text;
        }

        public final BooleanPreference getShownPref() {
            return this.shownPref;
        }

        public final String getCanvasTag() {
            return this.canvasTag;
        }

        @Override // com.robinhood.android.charts.cursor.CursorRowModifiers
        public Modifier.Companion getPrimaryRowModifier() {
            return this.primaryRowModifier;
        }

        @Override // com.robinhood.android.charts.cursor.CursorRowModifiers
        public Modifier.Companion getSecondaryRowModifier() {
            return this.secondaryRowModifier;
        }

        @Override // com.robinhood.android.charts.cursor.CursorRowModifiers
        public Modifier getTertiaryRowModifier() {
            return this.tertiaryRowModifier;
        }

        @Override // com.robinhood.android.charts.cursor.CursorRowModifiers
        public Modifier.Companion getQuaternaryRowModifier() {
            return this.quaternaryRowModifier;
        }
    }
}
