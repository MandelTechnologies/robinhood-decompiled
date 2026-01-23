package com.robinhood.android.tradingtrends.p264ui.details.table;

import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.unit.C2002Dp;
import com.robinhood.android.generic.table.GenericCell;
import com.robinhood.android.generic.table.SduiHelpers;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TradingTrendsGenericCell.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsGenericCell;", "Lcom/robinhood/android/generic/table/GenericCell;", "Sdui", "Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsGenericCell$Sdui;", "lib-trading-trends_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface TradingTrendsGenericCell extends GenericCell {

    /* compiled from: TradingTrendsGenericCell.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\r\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\b\u001eJ<\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\b\u0002\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\b J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\r¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsGenericCell$Sdui;", "Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsGenericCell;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "component", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "alignment", "Landroidx/compose/ui/Alignment;", "maxWidth", "Landroidx/compose/ui/unit/Dp;", "<init>", "(ILcom/robinhood/models/serverdriven/experimental/api/UIComponent;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/unit/Dp;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getIndex", "()I", "getComponent", "()Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "getAlignment", "()Landroidx/compose/ui/Alignment;", "getMaxWidth-lTKBWiU", "()Landroidx/compose/ui/unit/Dp;", "key", "", "getKey", "()Ljava/lang/String;", "relativeWidth", "getRelativeWidth", "component1", "component2", "component3", "component4", "component4-lTKBWiU", "copy", "copy-FafqE4s", "equals", "", "other", "", "hashCode", "toString", "lib-trading-trends_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Sdui implements TradingTrendsGenericCell {
        public static final int $stable = 8;
        private final Alignment alignment;
        private final UIComponent<?> component;
        private final int index;
        private final String key;
        private final C2002Dp maxWidth;
        private final int relativeWidth;

        public /* synthetic */ Sdui(int i, UIComponent uIComponent, Alignment alignment, C2002Dp c2002Dp, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, uIComponent, alignment, c2002Dp);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: copy-FafqE4s$default, reason: not valid java name */
        public static /* synthetic */ Sdui m19517copyFafqE4s$default(Sdui sdui, int i, UIComponent uIComponent, Alignment alignment, C2002Dp c2002Dp, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = sdui.index;
            }
            if ((i2 & 2) != 0) {
                uIComponent = sdui.component;
            }
            if ((i2 & 4) != 0) {
                alignment = sdui.alignment;
            }
            if ((i2 & 8) != 0) {
                c2002Dp = sdui.maxWidth;
            }
            return sdui.m19519copyFafqE4s(i, uIComponent, alignment, c2002Dp);
        }

        /* renamed from: component1, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public final UIComponent<?> component2() {
            return this.component;
        }

        /* renamed from: component3, reason: from getter */
        public final Alignment getAlignment() {
            return this.alignment;
        }

        /* renamed from: component4-lTKBWiU, reason: not valid java name and from getter */
        public final C2002Dp getMaxWidth() {
            return this.maxWidth;
        }

        /* renamed from: copy-FafqE4s, reason: not valid java name */
        public final Sdui m19519copyFafqE4s(int index, UIComponent<?> component, Alignment alignment, C2002Dp maxWidth) {
            Intrinsics.checkNotNullParameter(component, "component");
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            return new Sdui(index, component, alignment, maxWidth, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Sdui)) {
                return false;
            }
            Sdui sdui = (Sdui) other;
            return this.index == sdui.index && Intrinsics.areEqual(this.component, sdui.component) && Intrinsics.areEqual(this.alignment, sdui.alignment) && Intrinsics.areEqual(this.maxWidth, sdui.maxWidth);
        }

        public int hashCode() {
            int iHashCode = ((((Integer.hashCode(this.index) * 31) + this.component.hashCode()) * 31) + this.alignment.hashCode()) * 31;
            C2002Dp c2002Dp = this.maxWidth;
            return iHashCode + (c2002Dp == null ? 0 : C2002Dp.m7998hashCodeimpl(c2002Dp.getValue()));
        }

        public String toString() {
            return "Sdui(index=" + this.index + ", component=" + this.component + ", alignment=" + this.alignment + ", maxWidth=" + this.maxWidth + ")";
        }

        private Sdui(int i, UIComponent<?> component, Alignment alignment, C2002Dp c2002Dp) {
            Intrinsics.checkNotNullParameter(component, "component");
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            this.index = i;
            this.component = component;
            this.alignment = alignment;
            this.maxWidth = c2002Dp;
            this.key = i + "-" + component.hashCode();
            this.relativeWidth = SduiHelpers.getSduiComponentWidth(component);
        }

        public final int getIndex() {
            return this.index;
        }

        public final UIComponent<?> getComponent() {
            return this.component;
        }

        public final Alignment getAlignment() {
            return this.alignment;
        }

        /* renamed from: getMaxWidth-lTKBWiU, reason: not valid java name */
        public final C2002Dp m19520getMaxWidthlTKBWiU() {
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
}
