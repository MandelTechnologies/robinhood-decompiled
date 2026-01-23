package com.robinhood.android.carousel;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.view.AnimatedRhTextView;
import com.robinhood.android.designsystem.card.RdsCardView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InstrumentCard.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\rB%\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\u000eJ\u0017\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00028\u0000H\u0000¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\u00072\u0006\u0010$\u001a\u00028\u0000H&¢\u0006\u0002\u0010(J\u0015\u0010)\u001a\u00020#2\u0006\u0010$\u001a\u00028\u0000H&¢\u0006\u0002\u0010&J\u0015\u0010*\u001a\u00020#2\u0006\u0010$\u001a\u00028\u0000H&¢\u0006\u0002\u0010&R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00018\u00008\u00000\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u0019X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u0019X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001fX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/carousel/InstrumentCard;", "T", "", "Lcom/robinhood/android/designsystem/card/RdsCardView;", "context", "Landroid/content/Context;", "cardButtonGroupTitle", "", "cardButtonTitle", "layoutRes", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "itemRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "kotlin.jvm.PlatformType", "instrumentNameTxt", "Landroid/widget/TextView;", "getInstrumentNameTxt", "()Landroid/widget/TextView;", "instrumentSymbolTxt", "getInstrumentSymbolTxt", "instrumentChangeTxt", "Lcom/robinhood/android/common/view/AnimatedRhTextView;", "getInstrumentChangeTxt", "()Lcom/robinhood/android/common/view/AnimatedRhTextView;", "bind", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "bind$lib_instrument_carousel_externalDebug", "(Ljava/lang/Object;)V", "getButtonTitle", "(Ljava/lang/Object;)Ljava/lang/String;", "bindItem", "onClicked", "lib-instrument-carousel_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public abstract class InstrumentCard<T> extends RdsCardView {
    public AnalyticsLogger analytics;
    private final String cardButtonGroupTitle;
    private final String cardButtonTitle;
    private final AnimatedRhTextView instrumentChangeTxt;
    private final TextView instrumentNameTxt;
    private final TextView instrumentSymbolTxt;
    private final BehaviorRelay<T> itemRelay;
    private final int layoutRes;

    public abstract void bindItem(T item);

    public abstract String getButtonTitle(T item);

    public abstract void onClicked(T item);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentCard(Context context, String str, String str2, int i) {
        super(new ScarletContextWrapper(context, null, new ThemedResourceReference(ResourceType.STYLE.INSTANCE, C20690R.attr.surfaceTheme), 2, null), null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.cardButtonGroupTitle = str;
        this.cardButtonTitle = str2;
        this.layoutRes = i;
        BehaviorRelay<T> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.itemRelay = behaviorRelayCreate;
        ViewGroups.inflate(this, i, true);
        OnClickListeners.onClick(this, new Function0() { // from class: com.robinhood.android.carousel.InstrumentCard$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InstrumentCard._init_$lambda$1(this.f$0);
            }
        });
        setCardBackgroundColor(ThemeColors.getThemeColor(context, C20690R.attr.colorBackground1));
        setCardElevation(getResources().getDimension(C11048R.dimen.card_view_default_elevation));
        View viewFindViewById = findViewById(C11048R.id.instrument_name_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.instrumentNameTxt = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(C11048R.id.instrument_symbol_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.instrumentSymbolTxt = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C11048R.id.instrument_change_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.instrumentChangeTxt = (AnimatedRhTextView) viewFindViewById3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InstrumentCard(Context context) {
        this(context, null, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InstrumentCard(Context context, String str, String str2) {
        this(context, str, str2, C11048R.layout.include_instrument_card);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(InstrumentCard instrumentCard) {
        T value = instrumentCard.itemRelay.getValue();
        if (value != null) {
            String str = instrumentCard.cardButtonGroupTitle;
            if (str != null) {
                if (instrumentCard.cardButtonTitle == null) {
                    AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(instrumentCard.getAnalytics(), str, instrumentCard.getButtonTitle(value), null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
                } else {
                    AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(instrumentCard.getAnalytics(), str, instrumentCard.cardButtonTitle, instrumentCard.getButtonTitle(value), null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
                }
            }
            instrumentCard.onClicked(value);
        }
        return Unit.INSTANCE;
    }

    protected final TextView getInstrumentNameTxt() {
        return this.instrumentNameTxt;
    }

    protected final TextView getInstrumentSymbolTxt() {
        return this.instrumentSymbolTxt;
    }

    protected final AnimatedRhTextView getInstrumentChangeTxt() {
        return this.instrumentChangeTxt;
    }

    public final void bind$lib_instrument_carousel_externalDebug(T item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.itemRelay.accept(item);
        bindItem(item);
    }
}
