package com.robinhood.android.advanced.chart;

import android.content.res.Resources;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.models.serverdriven.experimental.api.Color;
import com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicator;
import com.robinhood.utils.extensions.ResourceTypes;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndicatorState.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020\u0000J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J1\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010,\u001a\u00020\u00192\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020 HÖ\u0001J\t\u0010/\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0013\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/advanced/chart/IndicatorState;", "", ResourceTypes.COLOR, "Lcom/robinhood/models/serverdriven/experimental/api/Color;", "indicatorIconType", "Lcom/robinhood/android/advanced/chart/IndicatorIconType;", "apiTechnicalIndicator", "Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator;", "fullTitle", "", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/Color;Lcom/robinhood/android/advanced/chart/IndicatorIconType;Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator;Ljava/lang/String;)V", "getColor", "()Lcom/robinhood/models/serverdriven/experimental/api/Color;", "getIndicatorIconType", "()Lcom/robinhood/android/advanced/chart/IndicatorIconType;", "getApiTechnicalIndicator", "()Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator;", "getFullTitle", "()Ljava/lang/String;", "id", "getId", "setId", "(Ljava/lang/String;)V", "selected", "", "getSelected", "()Ljava/lang/Boolean;", "setSelected", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "colorRes", "", "getColorRes", "()I", "getShortenedTitle", "resources", "Landroid/content/res/Resources;", AnalyticsStrings.BUTTON_FRIDAY_TRADING_SETTING_TOGGLE, "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "feature-lib-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class IndicatorState {
    private final ApiTechnicalIndicator apiTechnicalIndicator;
    private final Color color;
    private final int colorRes;
    private final String fullTitle;
    private String id;
    private final IndicatorState3 indicatorIconType;
    private Boolean selected;

    /* compiled from: IndicatorState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Color.values().length];
            try {
                iArr[Color.f5844C1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Color.f5845C2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Color.f5846C3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Color.f5847C4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Color.f5848C5.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Color.f5849C6.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Color.f5850C7.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Color.f5851C8.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Color.f5852C9.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[Color.C10.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[Color.C11.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[Color.C12.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[Color.C13.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[Color.C14.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[Color.C15.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[Color.C16.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[Color.C17.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[Color.C18.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[Color.C19.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[Color.C20.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiTechnicalIndicator.Type.values().length];
            try {
                iArr2[ApiTechnicalIndicator.Type.SMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[ApiTechnicalIndicator.Type.EMA.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[ApiTechnicalIndicator.Type.RSI.ordinal()] = 3;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[ApiTechnicalIndicator.Type.VWAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[ApiTechnicalIndicator.Type.MACD.ordinal()] = 5;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[ApiTechnicalIndicator.Type.BOLL.ordinal()] = 6;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[ApiTechnicalIndicator.Type.DEPTH.ordinal()] = 7;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[ApiTechnicalIndicator.Type.ORDER.ordinal()] = 8;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[ApiTechnicalIndicator.Type.UNKNOWN.ordinal()] = 9;
            } catch (NoSuchFieldError unused29) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static /* synthetic */ IndicatorState copy$default(IndicatorState indicatorState, Color color, IndicatorState3 indicatorState3, ApiTechnicalIndicator apiTechnicalIndicator, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            color = indicatorState.color;
        }
        if ((i & 2) != 0) {
            indicatorState3 = indicatorState.indicatorIconType;
        }
        if ((i & 4) != 0) {
            apiTechnicalIndicator = indicatorState.apiTechnicalIndicator;
        }
        if ((i & 8) != 0) {
            str = indicatorState.fullTitle;
        }
        return indicatorState.copy(color, indicatorState3, apiTechnicalIndicator, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Color getColor() {
        return this.color;
    }

    /* renamed from: component2, reason: from getter */
    public final IndicatorState3 getIndicatorIconType() {
        return this.indicatorIconType;
    }

    /* renamed from: component3, reason: from getter */
    public final ApiTechnicalIndicator getApiTechnicalIndicator() {
        return this.apiTechnicalIndicator;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFullTitle() {
        return this.fullTitle;
    }

    public final IndicatorState copy(Color color, IndicatorState3 indicatorIconType, ApiTechnicalIndicator apiTechnicalIndicator, String fullTitle) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(indicatorIconType, "indicatorIconType");
        Intrinsics.checkNotNullParameter(apiTechnicalIndicator, "apiTechnicalIndicator");
        Intrinsics.checkNotNullParameter(fullTitle, "fullTitle");
        return new IndicatorState(color, indicatorIconType, apiTechnicalIndicator, fullTitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndicatorState)) {
            return false;
        }
        IndicatorState indicatorState = (IndicatorState) other;
        return this.color == indicatorState.color && this.indicatorIconType == indicatorState.indicatorIconType && Intrinsics.areEqual(this.apiTechnicalIndicator, indicatorState.apiTechnicalIndicator) && Intrinsics.areEqual(this.fullTitle, indicatorState.fullTitle);
    }

    public int hashCode() {
        return (((((this.color.hashCode() * 31) + this.indicatorIconType.hashCode()) * 31) + this.apiTechnicalIndicator.hashCode()) * 31) + this.fullTitle.hashCode();
    }

    public String toString() {
        return "IndicatorState(color=" + this.color + ", indicatorIconType=" + this.indicatorIconType + ", apiTechnicalIndicator=" + this.apiTechnicalIndicator + ", fullTitle=" + this.fullTitle + ")";
    }

    public IndicatorState(Color color, IndicatorState3 indicatorIconType, ApiTechnicalIndicator apiTechnicalIndicator, String fullTitle) {
        int i;
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(indicatorIconType, "indicatorIconType");
        Intrinsics.checkNotNullParameter(apiTechnicalIndicator, "apiTechnicalIndicator");
        Intrinsics.checkNotNullParameter(fullTitle, "fullTitle");
        this.color = color;
        this.indicatorIconType = indicatorIconType;
        this.apiTechnicalIndicator = apiTechnicalIndicator;
        this.fullTitle = fullTitle;
        this.id = apiTechnicalIndicator.getId();
        this.selected = apiTechnicalIndicator.getSelected();
        switch (WhenMappings.$EnumSwitchMapping$0[color.ordinal()]) {
            case 1:
                i = C13997R.attr.paletteColorC1;
                break;
            case 2:
                i = C13997R.attr.paletteColorC2;
                break;
            case 3:
                i = C13997R.attr.paletteColorC3;
                break;
            case 4:
                i = C13997R.attr.paletteColorC4;
                break;
            case 5:
                i = C13997R.attr.paletteColorC5;
                break;
            case 6:
                i = C13997R.attr.paletteColorC6;
                break;
            case 7:
                i = C13997R.attr.paletteColorC7;
                break;
            case 8:
                i = C13997R.attr.paletteColorC8;
                break;
            case 9:
                i = C13997R.attr.paletteColorC9;
                break;
            case 10:
                i = C13997R.attr.paletteColorC10;
                break;
            case 11:
                i = C13997R.attr.paletteColorC11;
                break;
            case 12:
                i = C13997R.attr.paletteColorC12;
                break;
            case 13:
                i = C13997R.attr.paletteColorC13;
                break;
            case 14:
                i = C13997R.attr.paletteColorC14;
                break;
            case 15:
                i = C13997R.attr.paletteColorC15;
                break;
            case 16:
                i = C13997R.attr.paletteColorC16;
                break;
            case 17:
                i = C13997R.attr.paletteColorC17;
                break;
            case 18:
                i = C13997R.attr.paletteColorC18;
                break;
            case 19:
                i = C13997R.attr.paletteColorC19;
                break;
            case 20:
                i = C13997R.attr.paletteColorC20;
                break;
            default:
                i = C13997R.attr.paletteColorC1;
                break;
        }
        this.colorRes = i;
    }

    public final Color getColor() {
        return this.color;
    }

    public final IndicatorState3 getIndicatorIconType() {
        return this.indicatorIconType;
    }

    public final ApiTechnicalIndicator getApiTechnicalIndicator() {
        return this.apiTechnicalIndicator;
    }

    public final String getFullTitle() {
        return this.fullTitle;
    }

    public final String getId() {
        return this.id;
    }

    public final void setId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final Boolean getSelected() {
        return this.selected;
    }

    public final void setSelected(Boolean bool) {
        this.selected = bool;
    }

    public final int getColorRes() {
        return this.colorRes;
    }

    public final String getShortenedTitle(Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        switch (WhenMappings.$EnumSwitchMapping$1[this.apiTechnicalIndicator.getType().ordinal()]) {
            case 1:
                return this.fullTitle;
            case 2:
                return this.fullTitle;
            case 3:
                String string2 = resources.getString(C8457R.string.advanced_chart_indicator_type_rsi);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            case 4:
                String string3 = resources.getString(C8457R.string.advanced_chart_indicator_type_vwap);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            case 5:
                String string4 = resources.getString(C8457R.string.advanced_chart_indicator_type_macd);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                return string4;
            case 6:
                String string5 = resources.getString(C8457R.string.advanced_chart_indicator_type_boll);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                return string5;
            case 7:
            case 8:
            case 9:
                String string6 = resources.getString(C8457R.string.advanced_chart_empty_string);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                return string6;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final IndicatorState toggle() {
        return copy$default(this, null, null, this.apiTechnicalIndicator.toggle(), null, 11, null);
    }
}
