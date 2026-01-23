package com.robinhood.android.equitydetail.p123ui.options;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.contracts.OptionsDetailPageFragmentKey;
import com.robinhood.android.options.contracts.OptionsDetailPageLaunchMode;
import com.robinhood.android.options.optionsstring.common.OptionExtensions2;
import com.robinhood.android.options.optionsstring.common.UiOptionStrategyDisplays;
import com.robinhood.models.Decimals3;
import com.robinhood.models.p320db.AggregateOptionQuote;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p355ui.UiAggregateOptionPosition;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InstrumentDetailOptionStrategyView.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0014\u001a\u00020\u0015H\u0014J0\u0010\u0016\u001a\u00020\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aR\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/options/InstrumentDetailOptionStrategyView;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "accountNumber", "", "aggregateOptionPositionId", "Ljava/util/UUID;", "aggregateOptionPositions", "", "onFinishInflate", "", "bind", "uiAggregateOptionPosition", "Lcom/robinhood/models/ui/UiAggregateOptionPosition;", "optionQuote", "Lcom/robinhood/models/db/AggregateOptionQuote;", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InstrumentDetailOptionStrategyView extends Hammer_InstrumentDetailOptionStrategyView {
    private String accountNumber;
    private UUID aggregateOptionPositionId;
    private List<UUID> aggregateOptionPositions;
    public Navigator navigator;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentDetailOptionStrategyView(Context context, AttributeSet attrs) {
        super(context, attrs, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.aggregateOptionPositions = CollectionsKt.emptyList();
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        OnClickListeners.onClick(this, new Function0() { // from class: com.robinhood.android.equitydetail.ui.options.InstrumentDetailOptionStrategyView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InstrumentDetailOptionStrategyView.onFinishInflate$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFinishInflate$lambda$0(InstrumentDetailOptionStrategyView instrumentDetailOptionStrategyView) {
        Navigator navigator = instrumentDetailOptionStrategyView.getNavigator();
        Context context = instrumentDetailOptionStrategyView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, context, new OptionsDetailPageFragmentKey(new OptionsDetailPageLaunchMode.AggregatePositionId(instrumentDetailOptionStrategyView.aggregateOptionPositionId, instrumentDetailOptionStrategyView.aggregateOptionPositions, instrumentDetailOptionStrategyView.accountNumber, null, 8, null)), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    public final void bind(String accountNumber, UiAggregateOptionPosition uiAggregateOptionPosition, List<UUID> aggregateOptionPositions, AggregateOptionQuote optionQuote) {
        Decimals3 adjustedMarkPrice;
        BigDecimal unsignedValue;
        Intrinsics.checkNotNullParameter(uiAggregateOptionPosition, "uiAggregateOptionPosition");
        Intrinsics.checkNotNullParameter(aggregateOptionPositions, "aggregateOptionPositions");
        this.accountNumber = accountNumber;
        this.aggregateOptionPositionId = uiAggregateOptionPosition.getAggregateOptionPosition().getId();
        this.aggregateOptionPositions = aggregateOptionPositions;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        CharSequence strategyTitle = OptionExtensions2.getStrategyTitle(uiAggregateOptionPosition, resources, false, OptionChain.UnderlyingType.EQUITY);
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        RdsRowView.bind$default(this, strategyTitle, UiOptionStrategyDisplays.getSubtitleString$default(uiAggregateOptionPosition, resources2, uiAggregateOptionPosition.getOptionChain().getSettleOnOpen(), false, 4, null), (optionQuote == null || (adjustedMarkPrice = optionQuote.getAdjustedMarkPrice()) == null || (unsignedValue = adjustedMarkPrice.getUnsignedValue()) == null) ? null : Formats.getPriceFormat().format(unsignedValue), null, null, 24, null);
    }

    /* compiled from: InstrumentDetailOptionStrategyView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/options/InstrumentDetailOptionStrategyView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/equitydetail/ui/options/InstrumentDetailOptionStrategyView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<InstrumentDetailOptionStrategyView> {
        private final /* synthetic */ Inflater<InstrumentDetailOptionStrategyView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public InstrumentDetailOptionStrategyView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (InstrumentDetailOptionStrategyView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C15314R.layout.include_instrument_detail_options_strategy);
        }
    }
}
