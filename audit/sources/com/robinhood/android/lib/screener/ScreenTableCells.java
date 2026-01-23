package com.robinhood.android.lib.screener;

import androidx.compose.p011ui.unit.C2002Dp;
import com.robinhood.android.generic.table.GenericCell;
import com.robinhood.android.generic.table.SduiDtoHelpers;
import com.robinhood.android.generic.table.SduiHelpers;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.equityscreener.models.api.ColumnAlignment;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import rh_server_driven_ui.p531v1.TableColumnAlignmentDto;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: ScreenTableCells.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/lib/screener/ScreenerTableCells;", "Lcom/robinhood/android/generic/table/GenericCell;", "Icon", "Index", "Sdui", "SduiDto", "Empty", "RowStart", "Lcom/robinhood/android/lib/screener/ScreenerTableCells$Empty;", "Lcom/robinhood/android/lib/screener/ScreenerTableCells$Icon;", "Lcom/robinhood/android/lib/screener/ScreenerTableCells$Index;", "Lcom/robinhood/android/lib/screener/ScreenerTableCells$RowStart;", "Lcom/robinhood/android/lib/screener/ScreenerTableCells$Sdui;", "Lcom/robinhood/android/lib/screener/ScreenerTableCells$SduiDto;", "feature-lib-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.screener.ScreenerTableCells, reason: use source file name */
/* loaded from: classes8.dex */
public interface ScreenTableCells extends GenericCell {

    /* compiled from: ScreenTableCells.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0007HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\rR\u0014\u0010\u0017\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/lib/screener/ScreenerTableCells$Icon;", "Lcom/robinhood/android/lib/screener/ScreenerTableCells;", "instrumentId", "", "icon", "Lcom/robinhood/compose/bento/component/BentoIcons;", "contentDescription", "", "useFg2", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/compose/bento/component/BentoIcons;Ljava/lang/Integer;Z)V", "getInstrumentId", "()Ljava/lang/String;", "getIcon", "()Lcom/robinhood/compose/bento/component/BentoIcons;", "getContentDescription", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUseFg2", "()Z", "key", "getKey", "relativeWidth", "getRelativeWidth", "()I", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Lcom/robinhood/compose/bento/component/BentoIcons;Ljava/lang/Integer;Z)Lcom/robinhood/android/lib/screener/ScreenerTableCells$Icon;", "equals", "other", "", "hashCode", "toString", "feature-lib-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.screener.ScreenerTableCells$Icon, reason: from toString */
    public static final /* data */ class Icon implements ScreenTableCells {
        public static final int $stable = BentoIcon4.$stable;
        private final Integer contentDescription;
        private final BentoIcon4 icon;
        private final String instrumentId;
        private final String key;
        private final int relativeWidth;
        private final boolean useFg2;

        public static /* synthetic */ Icon copy$default(Icon icon, String str, BentoIcon4 bentoIcon4, Integer num, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = icon.instrumentId;
            }
            if ((i & 2) != 0) {
                bentoIcon4 = icon.icon;
            }
            if ((i & 4) != 0) {
                num = icon.contentDescription;
            }
            if ((i & 8) != 0) {
                z = icon.useFg2;
            }
            return icon.copy(str, bentoIcon4, num, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final BentoIcon4 getIcon() {
            return this.icon;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getContentDescription() {
            return this.contentDescription;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getUseFg2() {
            return this.useFg2;
        }

        public final Icon copy(String instrumentId, BentoIcon4 icon, Integer contentDescription, boolean useFg2) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new Icon(instrumentId, icon, contentDescription, useFg2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Icon)) {
                return false;
            }
            Icon icon = (Icon) other;
            return Intrinsics.areEqual(this.instrumentId, icon.instrumentId) && Intrinsics.areEqual(this.icon, icon.icon) && Intrinsics.areEqual(this.contentDescription, icon.contentDescription) && this.useFg2 == icon.useFg2;
        }

        public int hashCode() {
            int iHashCode = ((this.instrumentId.hashCode() * 31) + this.icon.hashCode()) * 31;
            Integer num = this.contentDescription;
            return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.useFg2);
        }

        public String toString() {
            return "Icon(instrumentId=" + this.instrumentId + ", icon=" + this.icon + ", contentDescription=" + this.contentDescription + ", useFg2=" + this.useFg2 + ")";
        }

        public Icon(String instrumentId, BentoIcon4 icon, Integer num, boolean z) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.instrumentId = instrumentId;
            this.icon = icon;
            this.contentDescription = num;
            this.useFg2 = z;
            this.key = "Icon: " + instrumentId;
            this.relativeWidth = 1;
        }

        public /* synthetic */ Icon(String str, BentoIcon4 bentoIcon4, Integer num, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, bentoIcon4, (i & 4) != 0 ? null : num, (i & 8) != 0 ? false : z);
        }

        public final String getInstrumentId() {
            return this.instrumentId;
        }

        public final BentoIcon4 getIcon() {
            return this.icon;
        }

        public final Integer getContentDescription() {
            return this.contentDescription;
        }

        public final boolean getUseFg2() {
            return this.useFg2;
        }

        @Override // com.robinhood.android.generic.table.GenericCell
        public String getKey() {
            return this.key;
        }

        @Override // com.robinhood.android.generic.table.GenericCell
        public int getRelativeWidth() {
            return this.relativeWidth;
        }
    }

    /* compiled from: ScreenTableCells.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/lib/screener/ScreenerTableCells$Index;", "Lcom/robinhood/android/lib/screener/ScreenerTableCells;", "instrumentId", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "<init>", "(Ljava/lang/String;I)V", "getInstrumentId", "()Ljava/lang/String;", "getIndex", "()I", "key", "getKey", "relativeWidth", "getRelativeWidth", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "feature-lib-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.screener.ScreenerTableCells$Index, reason: from toString */
    public static final /* data */ class Index implements ScreenTableCells {
        public static final int $stable = 0;
        private final int index;
        private final String instrumentId;
        private final String key;
        private final int relativeWidth;

        public static /* synthetic */ Index copy$default(Index index, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = index.instrumentId;
            }
            if ((i2 & 2) != 0) {
                i = index.index;
            }
            return index.copy(str, i);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public final Index copy(String instrumentId, int index) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            return new Index(instrumentId, index);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Index)) {
                return false;
            }
            Index index = (Index) other;
            return Intrinsics.areEqual(this.instrumentId, index.instrumentId) && this.index == index.index;
        }

        public int hashCode() {
            return (this.instrumentId.hashCode() * 31) + Integer.hashCode(this.index);
        }

        public String toString() {
            return "Index(instrumentId=" + this.instrumentId + ", index=" + this.index + ")";
        }

        public Index(String instrumentId, int i) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            this.instrumentId = instrumentId;
            this.index = i;
            this.key = "Index: " + instrumentId + "-" + i;
            this.relativeWidth = i;
        }

        public final int getIndex() {
            return this.index;
        }

        public final String getInstrumentId() {
            return this.instrumentId;
        }

        @Override // com.robinhood.android.generic.table.GenericCell
        public String getKey() {
            return this.key;
        }

        @Override // com.robinhood.android.generic.table.GenericCell
        public int getRelativeWidth() {
            return this.relativeWidth;
        }
    }

    /* compiled from: ScreenTableCells.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\b\u001bJ2\u0010\u001c\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\b\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0015HÖ\u0001J\t\u0010#\u001a\u00020\u0011HÖ\u0001R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/lib/screener/ScreenerTableCells$Sdui;", "Lcom/robinhood/android/lib/screener/ScreenerTableCells;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "alignment", "Lcom/robinhood/equityscreener/models/api/ColumnAlignment;", "maxWidth", "Landroidx/compose/ui/unit/Dp;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;Lcom/robinhood/equityscreener/models/api/ColumnAlignment;Landroidx/compose/ui/unit/Dp;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getComponent", "()Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "getAlignment", "()Lcom/robinhood/equityscreener/models/api/ColumnAlignment;", "getMaxWidth-lTKBWiU", "()Landroidx/compose/ui/unit/Dp;", "key", "", "getKey", "()Ljava/lang/String;", "relativeWidth", "", "getRelativeWidth", "()I", "component1", "component2", "component3", "component3-lTKBWiU", "copy", "copy-lKiXBtU", "equals", "", "other", "", "hashCode", "toString", "feature-lib-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.screener.ScreenerTableCells$Sdui, reason: from toString */
    public static final /* data */ class Sdui implements ScreenTableCells {
        public static final int $stable = 8;
        private final ColumnAlignment alignment;
        private final UIComponent<?> component;
        private final String key;
        private final C2002Dp maxWidth;
        private final int relativeWidth;

        public /* synthetic */ Sdui(UIComponent uIComponent, ColumnAlignment columnAlignment, C2002Dp c2002Dp, DefaultConstructorMarker defaultConstructorMarker) {
            this(uIComponent, columnAlignment, c2002Dp);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: copy-lKiXBtU$default, reason: not valid java name */
        public static /* synthetic */ Sdui m15887copylKiXBtU$default(Sdui sdui, UIComponent uIComponent, ColumnAlignment columnAlignment, C2002Dp c2002Dp, int i, Object obj) {
            if ((i & 1) != 0) {
                uIComponent = sdui.component;
            }
            if ((i & 2) != 0) {
                columnAlignment = sdui.alignment;
            }
            if ((i & 4) != 0) {
                c2002Dp = sdui.maxWidth;
            }
            return sdui.m15889copylKiXBtU(uIComponent, columnAlignment, c2002Dp);
        }

        public final UIComponent<?> component1() {
            return this.component;
        }

        /* renamed from: component2, reason: from getter */
        public final ColumnAlignment getAlignment() {
            return this.alignment;
        }

        /* renamed from: component3-lTKBWiU, reason: not valid java name and from getter */
        public final C2002Dp getMaxWidth() {
            return this.maxWidth;
        }

        /* renamed from: copy-lKiXBtU, reason: not valid java name */
        public final Sdui m15889copylKiXBtU(UIComponent<?> component, ColumnAlignment alignment, C2002Dp maxWidth) {
            Intrinsics.checkNotNullParameter(component, "component");
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            return new Sdui(component, alignment, maxWidth, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Sdui)) {
                return false;
            }
            Sdui sdui = (Sdui) other;
            return Intrinsics.areEqual(this.component, sdui.component) && this.alignment == sdui.alignment && Intrinsics.areEqual(this.maxWidth, sdui.maxWidth);
        }

        public int hashCode() {
            int iHashCode = ((this.component.hashCode() * 31) + this.alignment.hashCode()) * 31;
            C2002Dp c2002Dp = this.maxWidth;
            return iHashCode + (c2002Dp == null ? 0 : C2002Dp.m7998hashCodeimpl(c2002Dp.getValue()));
        }

        public String toString() {
            return "Sdui(component=" + this.component + ", alignment=" + this.alignment + ", maxWidth=" + this.maxWidth + ")";
        }

        private Sdui(UIComponent<?> component, ColumnAlignment alignment, C2002Dp c2002Dp) {
            Intrinsics.checkNotNullParameter(component, "component");
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            this.component = component;
            this.alignment = alignment;
            this.maxWidth = c2002Dp;
            this.key = String.valueOf(component.hashCode());
            this.relativeWidth = SduiHelpers.getSduiComponentWidth(component);
        }

        public final UIComponent<?> getComponent() {
            return this.component;
        }

        public final ColumnAlignment getAlignment() {
            return this.alignment;
        }

        /* renamed from: getMaxWidth-lTKBWiU, reason: not valid java name */
        public final C2002Dp m15890getMaxWidthlTKBWiU() {
            return this.maxWidth;
        }

        @Override // com.robinhood.android.generic.table.GenericCell
        public String getKey() {
            return this.key;
        }

        @Override // com.robinhood.android.generic.table.GenericCell
        public int getRelativeWidth() {
            return this.relativeWidth;
        }
    }

    /* compiled from: ScreenTableCells.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\b\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\b\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0015HÖ\u0001J\t\u0010#\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/lib/screener/ScreenerTableCells$SduiDto;", "Lcom/robinhood/android/lib/screener/ScreenerTableCells;", "component", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "alignment", "Lrh_server_driven_ui/v1/TableColumnAlignmentDto;", "maxWidth", "Landroidx/compose/ui/unit/Dp;", "<init>", "(Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;Lrh_server_driven_ui/v1/TableColumnAlignmentDto;Landroidx/compose/ui/unit/Dp;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getComponent", "()Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "getAlignment", "()Lrh_server_driven_ui/v1/TableColumnAlignmentDto;", "getMaxWidth-lTKBWiU", "()Landroidx/compose/ui/unit/Dp;", "key", "", "getKey", "()Ljava/lang/String;", "relativeWidth", "", "getRelativeWidth", "()I", "component1", "component2", "component3", "component3-lTKBWiU", "copy", "copy-lKiXBtU", "equals", "", "other", "", "hashCode", "toString", "feature-lib-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.screener.ScreenerTableCells$SduiDto, reason: from toString */
    public static final /* data */ class SduiDto implements ScreenTableCells {
        public static final int $stable = 8;
        private final TableColumnAlignmentDto alignment;
        private final UIComponentDto.ConcreteDto component;
        private final String key;
        private final C2002Dp maxWidth;
        private final int relativeWidth;

        public /* synthetic */ SduiDto(UIComponentDto.ConcreteDto concreteDto, TableColumnAlignmentDto tableColumnAlignmentDto, C2002Dp c2002Dp, DefaultConstructorMarker defaultConstructorMarker) {
            this(concreteDto, tableColumnAlignmentDto, c2002Dp);
        }

        /* renamed from: copy-lKiXBtU$default, reason: not valid java name */
        public static /* synthetic */ SduiDto m15891copylKiXBtU$default(SduiDto sduiDto, UIComponentDto.ConcreteDto concreteDto, TableColumnAlignmentDto tableColumnAlignmentDto, C2002Dp c2002Dp, int i, Object obj) {
            if ((i & 1) != 0) {
                concreteDto = sduiDto.component;
            }
            if ((i & 2) != 0) {
                tableColumnAlignmentDto = sduiDto.alignment;
            }
            if ((i & 4) != 0) {
                c2002Dp = sduiDto.maxWidth;
            }
            return sduiDto.m15893copylKiXBtU(concreteDto, tableColumnAlignmentDto, c2002Dp);
        }

        /* renamed from: component1, reason: from getter */
        public final UIComponentDto.ConcreteDto getComponent() {
            return this.component;
        }

        /* renamed from: component2, reason: from getter */
        public final TableColumnAlignmentDto getAlignment() {
            return this.alignment;
        }

        /* renamed from: component3-lTKBWiU, reason: not valid java name and from getter */
        public final C2002Dp getMaxWidth() {
            return this.maxWidth;
        }

        /* renamed from: copy-lKiXBtU, reason: not valid java name */
        public final SduiDto m15893copylKiXBtU(UIComponentDto.ConcreteDto component, TableColumnAlignmentDto alignment, C2002Dp maxWidth) {
            Intrinsics.checkNotNullParameter(component, "component");
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            return new SduiDto(component, alignment, maxWidth, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SduiDto)) {
                return false;
            }
            SduiDto sduiDto = (SduiDto) other;
            return Intrinsics.areEqual(this.component, sduiDto.component) && this.alignment == sduiDto.alignment && Intrinsics.areEqual(this.maxWidth, sduiDto.maxWidth);
        }

        public int hashCode() {
            int iHashCode = ((this.component.hashCode() * 31) + this.alignment.hashCode()) * 31;
            C2002Dp c2002Dp = this.maxWidth;
            return iHashCode + (c2002Dp == null ? 0 : C2002Dp.m7998hashCodeimpl(c2002Dp.getValue()));
        }

        public String toString() {
            return "SduiDto(component=" + this.component + ", alignment=" + this.alignment + ", maxWidth=" + this.maxWidth + ")";
        }

        private SduiDto(UIComponentDto.ConcreteDto component, TableColumnAlignmentDto alignment, C2002Dp c2002Dp) {
            Intrinsics.checkNotNullParameter(component, "component");
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            this.component = component;
            this.alignment = alignment;
            this.maxWidth = c2002Dp;
            this.key = String.valueOf(component.hashCode());
            this.relativeWidth = SduiDtoHelpers.getSduiComponentWidth(component);
        }

        public final UIComponentDto.ConcreteDto getComponent() {
            return this.component;
        }

        public final TableColumnAlignmentDto getAlignment() {
            return this.alignment;
        }

        /* renamed from: getMaxWidth-lTKBWiU, reason: not valid java name */
        public final C2002Dp m15894getMaxWidthlTKBWiU() {
            return this.maxWidth;
        }

        @Override // com.robinhood.android.generic.table.GenericCell
        public String getKey() {
            return this.key;
        }

        @Override // com.robinhood.android.generic.table.GenericCell
        public int getRelativeWidth() {
            return this.relativeWidth;
        }
    }

    /* compiled from: ScreenTableCells.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/lib/screener/ScreenerTableCells$Empty;", "Lcom/robinhood/android/lib/screener/ScreenerTableCells;", "instrumentId", "", "rowIndex", "", "columnIndex", "isHeader", "", "<init>", "(Ljava/lang/String;IIZ)V", "getInstrumentId", "()Ljava/lang/String;", "getRowIndex", "()I", "getColumnIndex", "()Z", "key", "getKey", "relativeWidth", "getRelativeWidth", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "feature-lib-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.screener.ScreenerTableCells$Empty, reason: from toString */
    public static final /* data */ class Empty implements ScreenTableCells {
        public static final int $stable = 0;
        private final int columnIndex;
        private final String instrumentId;
        private final boolean isHeader;
        private final String key;
        private final int relativeWidth;
        private final int rowIndex;

        public static /* synthetic */ Empty copy$default(Empty empty, String str, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = empty.instrumentId;
            }
            if ((i3 & 2) != 0) {
                i = empty.rowIndex;
            }
            if ((i3 & 4) != 0) {
                i2 = empty.columnIndex;
            }
            if ((i3 & 8) != 0) {
                z = empty.isHeader;
            }
            return empty.copy(str, i, i2, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final int getRowIndex() {
            return this.rowIndex;
        }

        /* renamed from: component3, reason: from getter */
        public final int getColumnIndex() {
            return this.columnIndex;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsHeader() {
            return this.isHeader;
        }

        public final Empty copy(String instrumentId, int rowIndex, int columnIndex, boolean isHeader) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            return new Empty(instrumentId, rowIndex, columnIndex, isHeader);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Empty)) {
                return false;
            }
            Empty empty = (Empty) other;
            return Intrinsics.areEqual(this.instrumentId, empty.instrumentId) && this.rowIndex == empty.rowIndex && this.columnIndex == empty.columnIndex && this.isHeader == empty.isHeader;
        }

        public int hashCode() {
            return (((((this.instrumentId.hashCode() * 31) + Integer.hashCode(this.rowIndex)) * 31) + Integer.hashCode(this.columnIndex)) * 31) + Boolean.hashCode(this.isHeader);
        }

        public String toString() {
            return "Empty(instrumentId=" + this.instrumentId + ", rowIndex=" + this.rowIndex + ", columnIndex=" + this.columnIndex + ", isHeader=" + this.isHeader + ")";
        }

        public Empty(String instrumentId, int i, int i2, boolean z) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            this.instrumentId = instrumentId;
            this.rowIndex = i;
            this.columnIndex = i2;
            this.isHeader = z;
            this.key = "Empty: " + instrumentId + "-" + i + "-" + i2;
        }

        public /* synthetic */ Empty(String str, int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, i2, (i3 & 8) != 0 ? false : z);
        }

        public final String getInstrumentId() {
            return this.instrumentId;
        }

        public final int getRowIndex() {
            return this.rowIndex;
        }

        public final int getColumnIndex() {
            return this.columnIndex;
        }

        public final boolean isHeader() {
            return this.isHeader;
        }

        @Override // com.robinhood.android.generic.table.GenericCell
        public String getKey() {
            return this.key;
        }

        @Override // com.robinhood.android.generic.table.GenericCell
        public int getRelativeWidth() {
            return this.relativeWidth;
        }
    }

    /* compiled from: ScreenTableCells.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003JB\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/lib/screener/ScreenerTableCells$RowStart;", "Lcom/robinhood/android/lib/screener/ScreenerTableCells;", "instrumentId", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "isExpanded", "", "isSpacerLarge", "isHeader", "<init>", "(Ljava/lang/String;ILjava/lang/Boolean;ZZ)V", "getInstrumentId", "()Ljava/lang/String;", "getIndex", "()I", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "()Z", "key", "getKey", "relativeWidth", "getRelativeWidth", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;ILjava/lang/Boolean;ZZ)Lcom/robinhood/android/lib/screener/ScreenerTableCells$RowStart;", "equals", "other", "", "hashCode", "toString", "feature-lib-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.screener.ScreenerTableCells$RowStart, reason: from toString */
    public static final /* data */ class RowStart implements ScreenTableCells {
        public static final int $stable = 0;
        private final int index;
        private final String instrumentId;
        private final Boolean isExpanded;
        private final boolean isHeader;
        private final boolean isSpacerLarge;
        private final String key;
        private final int relativeWidth;

        public static /* synthetic */ RowStart copy$default(RowStart rowStart, String str, int i, Boolean bool, boolean z, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = rowStart.instrumentId;
            }
            if ((i2 & 2) != 0) {
                i = rowStart.index;
            }
            if ((i2 & 4) != 0) {
                bool = rowStart.isExpanded;
            }
            if ((i2 & 8) != 0) {
                z = rowStart.isSpacerLarge;
            }
            if ((i2 & 16) != 0) {
                z2 = rowStart.isHeader;
            }
            boolean z3 = z2;
            Boolean bool2 = bool;
            return rowStart.copy(str, i, bool2, z, z3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* renamed from: component3, reason: from getter */
        public final Boolean getIsExpanded() {
            return this.isExpanded;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsSpacerLarge() {
            return this.isSpacerLarge;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsHeader() {
            return this.isHeader;
        }

        public final RowStart copy(String instrumentId, int index, Boolean isExpanded, boolean isSpacerLarge, boolean isHeader) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            return new RowStart(instrumentId, index, isExpanded, isSpacerLarge, isHeader);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RowStart)) {
                return false;
            }
            RowStart rowStart = (RowStart) other;
            return Intrinsics.areEqual(this.instrumentId, rowStart.instrumentId) && this.index == rowStart.index && Intrinsics.areEqual(this.isExpanded, rowStart.isExpanded) && this.isSpacerLarge == rowStart.isSpacerLarge && this.isHeader == rowStart.isHeader;
        }

        public int hashCode() {
            int iHashCode = ((this.instrumentId.hashCode() * 31) + Integer.hashCode(this.index)) * 31;
            Boolean bool = this.isExpanded;
            return ((((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.isSpacerLarge)) * 31) + Boolean.hashCode(this.isHeader);
        }

        public String toString() {
            return "RowStart(instrumentId=" + this.instrumentId + ", index=" + this.index + ", isExpanded=" + this.isExpanded + ", isSpacerLarge=" + this.isSpacerLarge + ", isHeader=" + this.isHeader + ")";
        }

        public RowStart(String instrumentId, int i, Boolean bool, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            this.instrumentId = instrumentId;
            this.index = i;
            this.isExpanded = bool;
            this.isSpacerLarge = z;
            this.isHeader = z2;
            this.key = "ExpandedIndicator: " + instrumentId + "-" + i;
            this.relativeWidth = bool != null ? 1 : 0;
        }

        public /* synthetic */ RowStart(String str, int i, Boolean bool, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, (i2 & 4) != 0 ? null : bool, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2);
        }

        public final String getInstrumentId() {
            return this.instrumentId;
        }

        public final int getIndex() {
            return this.index;
        }

        public final Boolean isExpanded() {
            return this.isExpanded;
        }

        public final boolean isSpacerLarge() {
            return this.isSpacerLarge;
        }

        public final boolean isHeader() {
            return this.isHeader;
        }

        @Override // com.robinhood.android.generic.table.GenericCell
        public String getKey() {
            return this.key;
        }

        @Override // com.robinhood.android.generic.table.GenericCell
        public int getRelativeWidth() {
            return this.relativeWidth;
        }
    }
}
