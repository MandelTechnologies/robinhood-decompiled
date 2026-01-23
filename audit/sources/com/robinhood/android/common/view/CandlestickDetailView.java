package com.robinhood.android.common.view;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.designsystem.style.DirectionOverlay;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.lib.utils.BigDecimals2;
import com.robinhood.android.sdui.chartgroup.SduiChartZoomTransformer;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.android.C41827R;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CandlestickDetailView.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/common/view/CandlestickDetailView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "openValueTxt", "Landroid/widget/TextView;", "closeValueTxt", "highValueTxt", "lowValueTxt", "volumeValueTxt", "percentChangeValueTxt", "notAvailableString", "", "bind", "", "viewModel", "Lcom/robinhood/android/common/view/CandlestickDetailView$ViewModel;", "priceFormatter", "Lcom/robinhood/android/lib/formats/NumberFormatter;", "applyTypeface", "typeface", "Landroid/graphics/Typeface;", "ViewModel", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CandlestickDetailView extends ConstraintLayout {
    public static final int $stable = 8;
    private final TextView closeValueTxt;
    private final TextView highValueTxt;
    private final TextView lowValueTxt;
    private final String notAvailableString;
    private final TextView openValueTxt;
    private final TextView percentChangeValueTxt;
    private final TextView volumeValueTxt;

    private final void applyTypeface(Typeface typeface) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            if (childAt instanceof TextView) {
                ((TextView) childAt).setTypeface(typeface);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CandlestickDetailView(Context context, AttributeSet attributeSet) {
        Typeface font;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, C11048R.layout.merge_candlestick_detail_view, this);
        int[] CandlestickDetailView = C11048R.styleable.CandlestickDetailView;
        Intrinsics.checkNotNullExpressionValue(CandlestickDetailView, "CandlestickDetailView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CandlestickDetailView, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C11048R.styleable.CandlestickDetailView_textFontFamily, 0);
        if (resourceId != 0 && (font = ResourcesCompat.getFont(context, resourceId)) != null) {
            applyTypeface(font);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewFindViewById = findViewById(C11048R.id.open_value_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.openValueTxt = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(C11048R.id.close_value_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.closeValueTxt = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C11048R.id.high_value_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.highValueTxt = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(C11048R.id.low_value_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.lowValueTxt = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(C11048R.id.volume_value_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.volumeValueTxt = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(C11048R.id.percent_change_value_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.percentChangeValueTxt = (TextView) viewFindViewById6;
        this.notAvailableString = ViewsKt.getString(this, C41827R.string.general_label_n_a);
    }

    public final void bind(ViewModel viewModel, NumberFormatter priceFormatter) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(priceFormatter, "priceFormatter");
        this.openValueTxt.setText(priceFormatter.format(viewModel.getOpen()));
        this.closeValueTxt.setText(priceFormatter.format(viewModel.getClose()));
        this.highValueTxt.setText(priceFormatter.formatNullable(viewModel.getHigh(), this.notAvailableString));
        this.lowValueTxt.setText(priceFormatter.formatNullable(viewModel.getLow(), this.notAvailableString));
        TextView textView = this.volumeValueTxt;
        BigDecimal volume = viewModel.getVolume();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setText(BigDecimals2.truncateLargeOrNotAvailable$default(volume, context, Formats.getIntegerFormat(), 0, 4, null));
        BigDecimal bigDecimalSafeDivide = BigDecimals7.safeDivide(viewModel.getClose(), viewModel.getOpen());
        BigDecimal ONE = BigDecimal.ONE;
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        BigDecimal bigDecimalSubtract = bigDecimalSafeDivide.subtract(ONE);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        this.percentChangeValueTxt.setText(Formats.getPercentDeltaFormat().format(bigDecimalSubtract));
        ScarletManager scarletManager = ScarletManager2.getScarletManager(this.percentChangeValueTxt);
        if (BigDecimals7.isZero(bigDecimalSubtract)) {
            ScarletManager.removeOverlay$default(scarletManager, DirectionOverlay.POSITIVE.getPriority(), null, 2, null);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Integer themeAttribute = ContextsUiExtensions.getThemeAttribute(context2, R.attr.textColorPrimary);
            if (themeAttribute != null) {
                this.percentChangeValueTxt.setTextColor(ViewsKt.getColor(this, themeAttribute.intValue()));
                return;
            }
            return;
        }
        if (BigDecimals7.isPositive(bigDecimalSubtract)) {
            ScarletManager.putOverlay$default(scarletManager, DirectionOverlay.POSITIVE, null, 2, null);
        } else {
            ScarletManager.putOverlay$default(scarletManager, DirectionOverlay.NEGATIVE, null, 2, null);
        }
    }

    /* compiled from: CandlestickDetailView.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/common/view/CandlestickDetailView$ViewModel;", "", "open", "Ljava/math/BigDecimal;", "close", "high", "low", SduiChartZoomTransformer.VOLUME_IDENTIFIER, "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getOpen", "()Ljava/math/BigDecimal;", "getClose", "getHigh", "getLow", "getVolume", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ViewModel {
        public static final int $stable = 8;
        private final BigDecimal close;
        private final BigDecimal high;
        private final BigDecimal low;
        private final BigDecimal open;
        private final BigDecimal volume;

        public static /* synthetic */ ViewModel copy$default(ViewModel viewModel, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = viewModel.open;
            }
            if ((i & 2) != 0) {
                bigDecimal2 = viewModel.close;
            }
            if ((i & 4) != 0) {
                bigDecimal3 = viewModel.high;
            }
            if ((i & 8) != 0) {
                bigDecimal4 = viewModel.low;
            }
            if ((i & 16) != 0) {
                bigDecimal5 = viewModel.volume;
            }
            BigDecimal bigDecimal6 = bigDecimal5;
            BigDecimal bigDecimal7 = bigDecimal3;
            return viewModel.copy(bigDecimal, bigDecimal2, bigDecimal7, bigDecimal4, bigDecimal6);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getOpen() {
            return this.open;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getClose() {
            return this.close;
        }

        /* renamed from: component3, reason: from getter */
        public final BigDecimal getHigh() {
            return this.high;
        }

        /* renamed from: component4, reason: from getter */
        public final BigDecimal getLow() {
            return this.low;
        }

        /* renamed from: component5, reason: from getter */
        public final BigDecimal getVolume() {
            return this.volume;
        }

        public final ViewModel copy(BigDecimal open, BigDecimal close, BigDecimal high, BigDecimal low, BigDecimal volume) {
            Intrinsics.checkNotNullParameter(open, "open");
            Intrinsics.checkNotNullParameter(close, "close");
            return new ViewModel(open, close, high, low, volume);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewModel)) {
                return false;
            }
            ViewModel viewModel = (ViewModel) other;
            return Intrinsics.areEqual(this.open, viewModel.open) && Intrinsics.areEqual(this.close, viewModel.close) && Intrinsics.areEqual(this.high, viewModel.high) && Intrinsics.areEqual(this.low, viewModel.low) && Intrinsics.areEqual(this.volume, viewModel.volume);
        }

        public int hashCode() {
            int iHashCode = ((this.open.hashCode() * 31) + this.close.hashCode()) * 31;
            BigDecimal bigDecimal = this.high;
            int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            BigDecimal bigDecimal2 = this.low;
            int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
            BigDecimal bigDecimal3 = this.volume;
            return iHashCode3 + (bigDecimal3 != null ? bigDecimal3.hashCode() : 0);
        }

        public String toString() {
            return "ViewModel(open=" + this.open + ", close=" + this.close + ", high=" + this.high + ", low=" + this.low + ", volume=" + this.volume + ")";
        }

        public ViewModel(BigDecimal open, BigDecimal close, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
            Intrinsics.checkNotNullParameter(open, "open");
            Intrinsics.checkNotNullParameter(close, "close");
            this.open = open;
            this.close = close;
            this.high = bigDecimal;
            this.low = bigDecimal2;
            this.volume = bigDecimal3;
        }

        public final BigDecimal getOpen() {
            return this.open;
        }

        public final BigDecimal getClose() {
            return this.close;
        }

        public final BigDecimal getHigh() {
            return this.high;
        }

        public final BigDecimal getLow() {
            return this.low;
        }

        public final BigDecimal getVolume() {
            return this.volume;
        }
    }
}
