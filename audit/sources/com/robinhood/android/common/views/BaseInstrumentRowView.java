package com.robinhood.android.common.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.common.data.prefs.ViewModePref;
import com.robinhood.android.common.instrumentrow.C11218R;
import com.robinhood.android.common.view.AnimatedRhTextView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equitydetail.p123ui.statistics.StatisticsSection2;
import com.robinhood.android.graph.spark.GraphView;
import com.robinhood.prefs.StringPreference;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.ScarletOverlay;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BaseInstrumentRowView.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001:\u0001EB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u00101\u001a\u000202J\u000e\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u000fJ\u0016\u00105\u001a\u0002022\u000e\u00106\u001a\n\u0012\u0004\u0012\u000202\u0018\u000107J\u0018\u00108\u001a\u0002022\b\u00109\u001a\u0004\u0018\u00010:2\u0006\u0010;\u001a\u00020\u000fJ\u000e\u0010<\u001a\u0002022\u0006\u0010=\u001a\u00020\u000fJ\u000e\u0010>\u001a\u0002022\u0006\u0010?\u001a\u00020@J\u0018\u0010A\u001a\u0002022\u0006\u0010B\u001a\u00020C2\b\b\u0002\u0010D\u001a\u00020\u000fR\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000fX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000fX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000fX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0013\u0010$\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020)¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010/\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\b0\u0010'¨\u0006F"}, m3636d2 = {"Lcom/robinhood/android/common/views/BaseInstrumentRowView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "viewModePreference", "Lcom/robinhood/prefs/StringPreference;", "getViewModePreference", "()Lcom/robinhood/prefs/StringPreference;", "setViewModePreference", "(Lcom/robinhood/prefs/StringPreference;)V", "showGraphView", "", "getShowGraphView", "()Z", "showCheckMark", "getShowCheckMark", "invertNameAndSymbol", "getInvertNameAndSymbol", "showPendingStatus", "getShowPendingStatus", "nameTxt", "Lcom/robinhood/android/designsystem/text/RhTextView;", "getNameTxt", "()Lcom/robinhood/android/designsystem/text/RhTextView;", "detailTxt", "getDetailTxt", "filledPriceTxt", "Lcom/robinhood/android/common/view/AnimatedRhTextView;", "getFilledPriceTxt", "()Lcom/robinhood/android/common/view/AnimatedRhTextView;", "outlinedPriceTxt", "getOutlinedPriceTxt", "investingBadgeView", "Landroidx/compose/ui/platform/ComposeView;", "getInvestingBadgeView", "()Landroidx/compose/ui/platform/ComposeView;", "graphView", "Lcom/robinhood/android/graph/spark/GraphView;", "getGraphView", "()Lcom/robinhood/android/graph/spark/GraphView;", StatisticsSection2.DIVIDER, "Landroid/view/View;", "shouldHidePriceText", "composeView", "getComposeView", "hidePriceText", "", "showDivider", "show", "setOnPriceClick", "onClick", "Lkotlin/Function0;", "setPriceText", "text", "", "animate", "setPriceStale", "isStale", "putPriceOverlay", "overlay", "Lcom/robinhood/scarlet/ScarletOverlay;", "setTickerStyle", ResourceTypes.STYLE, "Lcom/robinhood/android/common/views/BaseInstrumentRowView$TickerStyle;", "areTickersHidden", "TickerStyle", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class BaseInstrumentRowView extends ConstraintLayout {
    public static final int $stable = 8;
    private final ComposeView composeView;
    private final RhTextView detailTxt;
    private final View divider;
    private final AnimatedRhTextView filledPriceTxt;
    private final GraphView graphView;
    private final boolean invertNameAndSymbol;
    private final ComposeView investingBadgeView;
    private final RhTextView nameTxt;
    private final AnimatedRhTextView outlinedPriceTxt;
    private boolean shouldHidePriceText;
    private final boolean showCheckMark;
    private final boolean showGraphView;
    private final boolean showPendingStatus;

    @ViewModePref
    public StringPreference viewModePreference;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseInstrumentRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C11218R.styleable.BaseInstrumentRowView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        boolean z = typedArrayObtainStyledAttributes.getBoolean(C11218R.styleable.BaseInstrumentRowView_showGraphView, true);
        this.showGraphView = z;
        this.showCheckMark = typedArrayObtainStyledAttributes.getBoolean(C11218R.styleable.BaseInstrumentRowView_showCheckMark, false);
        this.invertNameAndSymbol = typedArrayObtainStyledAttributes.getBoolean(C11218R.styleable.BaseInstrumentRowView_invertNameAndSymbol, false);
        this.showPendingStatus = typedArrayObtainStyledAttributes.getBoolean(C11218R.styleable.BaseInstrumentRowView_showPendingStatus, true);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(C11218R.styleable.BaseInstrumentRowView_useComposeViewForGraph, false);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(C11218R.styleable.BaseInstrumentRowView_condensedRowStyle, false);
        if (z2) {
            ViewGroups.inflate(this, C11218R.layout.merge_row_watchlist_with_compose_view, true);
        } else if (z3) {
            ViewGroups.inflate(this, C11218R.layout.merge_row_watchlist_condensed, true);
        } else {
            ViewGroups.inflate(this, C11218R.layout.merge_row_watchlist, true);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewFindViewById = findViewById(C11218R.id.name_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.nameTxt = (RhTextView) viewFindViewById;
        View viewFindViewById2 = findViewById(C11218R.id.detail_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.detailTxt = (RhTextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C11218R.id.filled_price_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.filledPriceTxt = (AnimatedRhTextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(C11218R.id.outlined_price_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.outlinedPriceTxt = (AnimatedRhTextView) viewFindViewById4;
        this.investingBadgeView = (ComposeView) findViewById(C11218R.id.investing_badge);
        View viewFindViewById5 = findViewById(C11218R.id.graph_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        GraphView graphView = (GraphView) viewFindViewById5;
        this.graphView = graphView;
        View viewFindViewById6 = findViewById(C11218R.id.row_watchlist_divider);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.divider = viewFindViewById6;
        this.composeView = (ComposeView) findViewById(C11218R.id.compose_view);
        graphView.setVisibility(z ? 0 : 8);
    }

    public final StringPreference getViewModePreference() {
        StringPreference stringPreference = this.viewModePreference;
        if (stringPreference != null) {
            return stringPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModePreference");
        return null;
    }

    public final void setViewModePreference(StringPreference stringPreference) {
        Intrinsics.checkNotNullParameter(stringPreference, "<set-?>");
        this.viewModePreference = stringPreference;
    }

    protected final boolean getShowGraphView() {
        return this.showGraphView;
    }

    protected final boolean getShowCheckMark() {
        return this.showCheckMark;
    }

    protected final boolean getInvertNameAndSymbol() {
        return this.invertNameAndSymbol;
    }

    protected final boolean getShowPendingStatus() {
        return this.showPendingStatus;
    }

    public final RhTextView getNameTxt() {
        return this.nameTxt;
    }

    public final RhTextView getDetailTxt() {
        return this.detailTxt;
    }

    public final AnimatedRhTextView getFilledPriceTxt() {
        return this.filledPriceTxt;
    }

    public final AnimatedRhTextView getOutlinedPriceTxt() {
        return this.outlinedPriceTxt;
    }

    public final ComposeView getInvestingBadgeView() {
        return this.investingBadgeView;
    }

    public final GraphView getGraphView() {
        return this.graphView;
    }

    public final ComposeView getComposeView() {
        return this.composeView;
    }

    public final void hidePriceText() {
        this.shouldHidePriceText = true;
        this.filledPriceTxt.setVisibility(8);
        this.outlinedPriceTxt.setVisibility(8);
    }

    public final void showDivider(boolean show) {
        this.divider.setVisibility(show ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setOnPriceClick$lambda$0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public final void setOnPriceClick(final Function0<Unit> onClick) {
        if (onClick != null) {
            OnClickListeners.onClick(this.filledPriceTxt, new Function0() { // from class: com.robinhood.android.common.views.BaseInstrumentRowView$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseInstrumentRowView.setOnPriceClick$lambda$0(onClick);
                }
            });
            OnClickListeners.onClick(this.outlinedPriceTxt, new Function0() { // from class: com.robinhood.android.common.views.BaseInstrumentRowView$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseInstrumentRowView.setOnPriceClick$lambda$1(onClick);
                }
            });
        } else {
            this.filledPriceTxt.setOnClickListener(null);
            this.outlinedPriceTxt.setOnClickListener(null);
            this.filledPriceTxt.setClickable(false);
            this.outlinedPriceTxt.setClickable(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setOnPriceClick$lambda$1(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public final void setPriceText(String text, boolean animate) {
        this.filledPriceTxt.setText(text, animate);
        this.outlinedPriceTxt.setText(text, animate);
    }

    public final void setPriceStale(boolean isStale) {
        this.filledPriceTxt.setStale(isStale);
        this.outlinedPriceTxt.setStale(isStale);
    }

    public final void putPriceOverlay(ScarletOverlay overlay) {
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this.filledPriceTxt), overlay, null, 2, null);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this.outlinedPriceTxt), overlay, null, 2, null);
    }

    public static /* synthetic */ void setTickerStyle$default(BaseInstrumentRowView baseInstrumentRowView, TickerStyle tickerStyle, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTickerStyle");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        baseInstrumentRowView.setTickerStyle(tickerStyle, z);
    }

    public final void setTickerStyle(TickerStyle style, boolean areTickersHidden) {
        Intrinsics.checkNotNullParameter(style, "style");
        if (areTickersHidden || this.shouldHidePriceText) {
            return;
        }
        this.filledPriceTxt.setVisibility(style == TickerStyle.FILLED ? 0 : 8);
        this.outlinedPriceTxt.setVisibility(style == TickerStyle.OUTLINED ? 0 : 8);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BaseInstrumentRowView.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/views/BaseInstrumentRowView$TickerStyle;", "", "<init>", "(Ljava/lang/String;I)V", "FILLED", "OUTLINED", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TickerStyle {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TickerStyle[] $VALUES;
        public static final TickerStyle FILLED = new TickerStyle("FILLED", 0);
        public static final TickerStyle OUTLINED = new TickerStyle("OUTLINED", 1);

        private static final /* synthetic */ TickerStyle[] $values() {
            return new TickerStyle[]{FILLED, OUTLINED};
        }

        public static EnumEntries<TickerStyle> getEntries() {
            return $ENTRIES;
        }

        private TickerStyle(String str, int i) {
        }

        static {
            TickerStyle[] tickerStyleArr$values = $values();
            $VALUES = tickerStyleArr$values;
            $ENTRIES = EnumEntries2.enumEntries(tickerStyleArr$values);
        }

        public static TickerStyle valueOf(String str) {
            return (TickerStyle) Enum.valueOf(TickerStyle.class, str);
        }

        public static TickerStyle[] values() {
            return (TickerStyle[]) $VALUES.clone();
        }
    }
}
