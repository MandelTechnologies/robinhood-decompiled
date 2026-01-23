package com.robinhood.android.trade.options.education;

import android.content.res.Resources;
import com.robinhood.android.trade.options.C29757R;
import com.robinhood.common.strings.C32428R;
import com.robinhood.models.p320db.OptionOrderEducationType;
import com.robinhood.models.p320db.OrderSide;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOrderEducationViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0019\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/trade/options/education/OptionOrderEducationViewState;", "", "type", "Lcom/robinhood/models/db/OptionOrderEducationType;", "<init>", "(Lcom/robinhood/models/db/OptionOrderEducationType;)V", "getType", "()Lcom/robinhood/models/db/OptionOrderEducationType;", "getTitle", "", "resources", "Landroid/content/res/Resources;", "getSubtitle", "side", "Lcom/robinhood/models/db/OrderSide;", "getLottie", "", "isDay", "", "getBannerText", "component1", "copy", "equals", "other", "hashCode", "toString", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class OptionOrderEducationViewState {
    public static final int $stable = 0;
    private final OptionOrderEducationType type;

    /* compiled from: OptionOrderEducationViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OptionOrderEducationType.values().length];
            try {
                iArr[OptionOrderEducationType.STOP_MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionOrderEducationType.MARKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OrderSide.values().length];
            try {
                iArr2[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static /* synthetic */ OptionOrderEducationViewState copy$default(OptionOrderEducationViewState optionOrderEducationViewState, OptionOrderEducationType optionOrderEducationType, int i, Object obj) {
        if ((i & 1) != 0) {
            optionOrderEducationType = optionOrderEducationViewState.type;
        }
        return optionOrderEducationViewState.copy(optionOrderEducationType);
    }

    /* renamed from: component1, reason: from getter */
    public final OptionOrderEducationType getType() {
        return this.type;
    }

    public final OptionOrderEducationViewState copy(OptionOrderEducationType type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        return new OptionOrderEducationViewState(type2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OptionOrderEducationViewState) && this.type == ((OptionOrderEducationViewState) other).type;
    }

    public int hashCode() {
        return this.type.hashCode();
    }

    public String toString() {
        return "OptionOrderEducationViewState(type=" + this.type + ")";
    }

    public OptionOrderEducationViewState(OptionOrderEducationType type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        this.type = type2;
    }

    public final OptionOrderEducationType getType() {
        return this.type;
    }

    public final String getTitle(Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        int i = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i == 1) {
            String string2 = resources.getString(C29757R.string.option_order_education_stop_market_title);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String string3 = resources.getString(C29757R.string.option_order_education_market_title);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    public final String getSubtitle(Resources resources, OrderSide side) throws Resources.NotFoundException {
        String string2;
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(side, "side");
        int i = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i == 1) {
            String string3 = resources.getString(C29757R.string.option_order_education_stop_market_subtitle);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i2 = C29757R.string.option_order_education_market_subtitle;
        int i3 = WhenMappings.$EnumSwitchMapping$1[side.ordinal()];
        if (i3 == 1) {
            string2 = resources.getString(C32428R.string.general_label_buy);
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            string2 = resources.getString(C32428R.string.general_label_sell);
        }
        String string4 = resources.getString(i2, string2);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        return string4;
    }

    public final int getLottie(boolean isDay) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i == 1) {
            if (isDay) {
                return C29757R.raw.option_order_education_stop_market_lottie_day;
            }
            return C29757R.raw.option_order_education_stop_market_lottie_night;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (isDay) {
            return C29757R.raw.option_order_education_market_lottie_day;
        }
        return C29757R.raw.option_order_education_market_lottie_night;
    }

    public final String getBannerText(Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        int i = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i == 1) {
            String string2 = resources.getString(C29757R.string.option_order_education_stop_market_banner);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String string3 = resources.getString(C29757R.string.option_order_education_market_banner);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }
}
