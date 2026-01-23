package com.robinhood.android.optionschain.strategybuilder;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.ViewGroup2;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.indexes.models.p159db.IndexValue;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoColorMapper;
import com.robinhood.android.optionschain.C24135R;
import com.robinhood.android.optionschain.databinding.MergeOptionStrategyBuilderHeaderViewBinding;
import com.robinhood.android.optionschain.extensions.StrategyBuilderSentiments;
import com.robinhood.android.optionschain.strategybuilder.OptionStrategyBuilderAdapter2;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.OptionStrategyBuilder;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.serverdriven.p347db.ThemedColor;
import com.robinhood.models.util.Money3;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: OptionStrategyBuilderHeaderView.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 32\u00020\u0001:\u00013B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u001e\u001a\u00020\u001fH\u0014J&\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"2\u0016\u0010#\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020\u001f\u0018\u00010$J(\u0010&\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020%H\u0002J(\u0010,\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-2\u0006\u0010/\u001a\u00020(2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000201H\u0002R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u001c0\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/optionschain/strategybuilder/OptionStrategyBuilderHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "getQuoteStore", "()Lcom/robinhood/librobinhood/data/store/QuoteStore;", "setQuoteStore", "(Lcom/robinhood/librobinhood/data/store/QuoteStore;)V", "duxo", "Lcom/robinhood/android/optionschain/strategybuilder/OptionStrategyBuilderHeaderDuxo;", "getDuxo", "()Lcom/robinhood/android/optionschain/strategybuilder/OptionStrategyBuilderHeaderDuxo;", "setDuxo", "(Lcom/robinhood/android/optionschain/strategybuilder/OptionStrategyBuilderHeaderDuxo;)V", "bindings", "Lcom/robinhood/android/optionschain/databinding/MergeOptionStrategyBuilderHeaderViewBinding;", "getBindings", "()Lcom/robinhood/android/optionschain/databinding/MergeOptionStrategyBuilderHeaderViewBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "instrumentRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/models/db/Instrument;", "kotlin.jvm.PlatformType", "onAttachedToWindow", "", "bind", "headerData", "Lcom/robinhood/android/optionschain/strategybuilder/BuilderData$HeaderData;", "onSentimentChanged", "Lkotlin/Function1;", "Lcom/robinhood/models/db/OptionStrategyBuilder$SentimentFilter;", "styleSentiment", "sentimentIcon", "Landroid/view/View;", "sentimentForeground", "sentimentBackground", "sentiment", "getColorRef", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "", "view", "selectedColor", "Lcom/robinhood/models/serverdriven/db/ThemedColor;", "unselectedColor", "Companion", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionStrategyBuilderHeaderView extends Hammer_OptionStrategyBuilderHeaderView {

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;
    public OptionStrategyBuilderHeaderDuxo duxo;
    private final BehaviorRelay<Instrument> instrumentRelay;
    public QuoteStore quoteStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionStrategyBuilderHeaderView.class, "bindings", "getBindings()Lcom/robinhood/android/optionschain/databinding/MergeOptionStrategyBuilderHeaderViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ OptionStrategyBuilderHeaderView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionStrategyBuilderHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.bindings = ViewBinding5.viewBinding(this, OptionStrategyBuilderHeaderView2.INSTANCE);
        BehaviorRelay<Instrument> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.instrumentRelay = behaviorRelayCreate;
        ViewGroups.inflate(this, C24135R.layout.merge_option_strategy_builder_header_view, true);
    }

    public final QuoteStore getQuoteStore() {
        QuoteStore quoteStore = this.quoteStore;
        if (quoteStore != null) {
            return quoteStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("quoteStore");
        return null;
    }

    public final void setQuoteStore(QuoteStore quoteStore) {
        Intrinsics.checkNotNullParameter(quoteStore, "<set-?>");
        this.quoteStore = quoteStore;
    }

    public final OptionStrategyBuilderHeaderDuxo getDuxo() {
        OptionStrategyBuilderHeaderDuxo optionStrategyBuilderHeaderDuxo = this.duxo;
        if (optionStrategyBuilderHeaderDuxo != null) {
            return optionStrategyBuilderHeaderDuxo;
        }
        Intrinsics.throwUninitializedPropertyAccessException("duxo");
        return null;
    }

    public final void setDuxo(OptionStrategyBuilderHeaderDuxo optionStrategyBuilderHeaderDuxo) {
        Intrinsics.checkNotNullParameter(optionStrategyBuilderHeaderDuxo, "<set-?>");
        this.duxo = optionStrategyBuilderHeaderDuxo;
    }

    public final MergeOptionStrategyBuilderHeaderViewBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeOptionStrategyBuilderHeaderViewBinding) value;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Observable observableDistinctUntilChanged = this.instrumentRelay.switchMap(new Function() { // from class: com.robinhood.android.optionschain.strategybuilder.OptionStrategyBuilderHeaderView.onAttachedToWindow.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Tuples2<Instrument, Quote>> apply(final Instrument instrument) {
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                return OptionStrategyBuilderHeaderView.this.getQuoteStore().getStreamQuote().asObservable(instrument.getId()).map(new Function() { // from class: com.robinhood.android.optionschain.strategybuilder.OptionStrategyBuilderHeaderView.onAttachedToWindow.1.1
                    @Override // io.reactivex.functions.Function
                    public final Tuples2<Instrument, Quote> apply(Quote it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Tuples4.m3642to(instrument, it);
                    }
                });
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.strategybuilder.OptionStrategyBuilderHeaderView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderHeaderView.onAttachedToWindow$lambda$0(this.f$0, (Tuples2) obj);
            }
        });
        Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionschain.strategybuilder.OptionStrategyBuilderHeaderView$onAttachedToWindow$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OptionStrategyBuilderHeaderViewState) it).getIndexValue());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C24649x24356771<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableDistinctUntilChanged2 = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.strategybuilder.OptionStrategyBuilderHeaderView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderHeaderView.onAttachedToWindow$lambda$2(this.f$0, (IndexValue) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$0(OptionStrategyBuilderHeaderView optionStrategyBuilderHeaderView, Tuples2 tuples2) {
        Object objComponent1 = tuples2.component1();
        Intrinsics.checkNotNullExpressionValue(objComponent1, "component1(...)");
        Object objComponent2 = tuples2.component2();
        Intrinsics.checkNotNullExpressionValue(objComponent2, "component2(...)");
        optionStrategyBuilderHeaderView.getBindings().currentPriceTxt.setText(ViewsKt.getString(optionStrategyBuilderHeaderView, C24135R.string.option_strategy_equity_header, ((Instrument) objComponent1).getSymbol(), Formats.getPriceFormat().format(Money3.getBigDecimalCompat(((Quote) objComponent2).getLastTradePrice()))));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$2(OptionStrategyBuilderHeaderView optionStrategyBuilderHeaderView, IndexValue indexValue) {
        optionStrategyBuilderHeaderView.getBindings().currentPriceTxt.setText(ViewsKt.getString(optionStrategyBuilderHeaderView, C24135R.string.option_strategy_equity_header, indexValue.getSymbol(), Formats.getValueFormat().format(indexValue.getValue())));
        return Unit.INSTANCE;
    }

    public final void bind(OptionStrategyBuilderAdapter2.HeaderData headerData, final Function1<? super OptionStrategyBuilder.SentimentFilter, Unit> onSentimentChanged) {
        Intrinsics.checkNotNullParameter(headerData, "headerData");
        Instrument instrument = headerData.getInstrument();
        if (instrument != null) {
            this.instrumentRelay.accept(instrument);
        }
        getDuxo().bindUiOptionChains(headerData.getUiOptionChains());
        RhTextView rhTextView = getBindings().titleTxt;
        StringResource headerText = StrategyBuilderSentiments.getHeaderText(headerData.getSelectedSentiment());
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView.setText(headerText.getText(resources));
        getBindings().optionsStrategyBuilderSentimentLayout.removeAllViews();
        for (OptionStrategyBuilder.SentimentFilter sentimentFilter : headerData.getSentiments()) {
            boolean z = false;
            View viewInflate$default = ViewGroups.inflate$default(this, C24135R.layout.include_option_strategy_builder_sentiment_layout, false, 2, null);
            View viewFindViewById = viewInflate$default.findViewById(C24135R.id.options_strategy_builder_sentiment_background);
            View viewFindViewById2 = viewInflate$default.findViewById(C24135R.id.options_strategy_builder_sentiment_foreground);
            ImageView imageView = (ImageView) viewInflate$default.findViewById(C24135R.id.options_strategy_builder_sentiment_icon);
            viewInflate$default.setTag(sentimentFilter);
            if (sentimentFilter.getSentiment() == headerData.getSelectedSentiment()) {
                z = true;
            }
            viewInflate$default.setSelected(z);
            imageView.setImageResource(sentimentFilter.getIcon().getResourceId());
            Intrinsics.checkNotNull(imageView);
            Intrinsics.checkNotNull(viewFindViewById2);
            Intrinsics.checkNotNull(viewFindViewById);
            styleSentiment(imageView, viewFindViewById2, viewFindViewById, sentimentFilter);
            OnClickListeners.onClickView(viewInflate$default, new Function1() { // from class: com.robinhood.android.optionschain.strategybuilder.OptionStrategyBuilderHeaderView$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionStrategyBuilderHeaderView.bind$lambda$3(this.f$0, onSentimentChanged, (View) obj);
                }
            });
            getBindings().optionsStrategyBuilderSentimentLayout.addView(viewInflate$default);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit bind$lambda$3(OptionStrategyBuilderHeaderView optionStrategyBuilderHeaderView, Function1 function1, View view) {
        OptionStrategyBuilder.SentimentFilter sentimentFilter;
        Intrinsics.checkNotNullParameter(view, "view");
        view.performHapticFeedback(1);
        if (!view.isSelected()) {
            Object tag = view.getTag();
            sentimentFilter = tag instanceof OptionStrategyBuilder.SentimentFilter ? (OptionStrategyBuilder.SentimentFilter) tag : null;
        }
        LinearLayout optionsStrategyBuilderSentimentLayout = optionStrategyBuilderHeaderView.getBindings().optionsStrategyBuilderSentimentLayout;
        Intrinsics.checkNotNullExpressionValue(optionsStrategyBuilderSentimentLayout, "optionsStrategyBuilderSentimentLayout");
        for (View view2 : ViewGroup2.getChildren(optionsStrategyBuilderSentimentLayout)) {
            Object tag2 = view2.getTag();
            Intrinsics.checkNotNull(tag2, "null cannot be cast to non-null type com.robinhood.models.db.OptionStrategyBuilder.SentimentFilter");
            OptionStrategyBuilder.SentimentFilter sentimentFilter2 = (OptionStrategyBuilder.SentimentFilter) tag2;
            view2.setSelected(Intrinsics.areEqual(sentimentFilter2, sentimentFilter));
            View viewFindViewById = view2.findViewById(C24135R.id.options_strategy_builder_sentiment_icon);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            View viewFindViewById2 = view2.findViewById(C24135R.id.options_strategy_builder_sentiment_foreground);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            View viewFindViewById3 = view2.findViewById(C24135R.id.options_strategy_builder_sentiment_background);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            optionStrategyBuilderHeaderView.styleSentiment(viewFindViewById, viewFindViewById2, viewFindViewById3, sentimentFilter2);
        }
        RhTextView rhTextView = optionStrategyBuilderHeaderView.getBindings().titleTxt;
        StringResource headerText = StrategyBuilderSentiments.getHeaderText(sentimentFilter != null ? sentimentFilter.getSentiment() : null);
        Resources resources = optionStrategyBuilderHeaderView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView.setText(headerText.getText(resources));
        if (function1 != null) {
            function1.invoke(sentimentFilter);
        }
        return Unit.INSTANCE;
    }

    private final void styleSentiment(View sentimentIcon, View sentimentForeground, View sentimentBackground, OptionStrategyBuilder.SentimentFilter sentiment) {
        ResourceReferences4<Integer> colorRef = getColorRef(sentimentIcon, sentiment.getSelectedIconColor(), sentiment.getUnselectedIconColor());
        if (colorRef != null) {
            ScarletManager2.overrideAttribute(sentimentIcon, R.attr.tint, colorRef);
        }
        ResourceReferences4<Integer> colorRef2 = getColorRef(sentimentForeground, sentiment.getSelectedBorderColor(), sentiment.getUnselectedBorderColor());
        if (colorRef2 != null) {
            ScarletManager2.overrideAttribute(sentimentForeground, R.attr.backgroundTint, colorRef2);
        }
        ResourceReferences4<Integer> colorRef3 = getColorRef(sentimentBackground, sentiment.getSelectedBackgroundColor(), sentiment.getUnselectedBackgroundColor());
        if (colorRef3 != null) {
            ScarletManager2.overrideAttribute(sentimentBackground, R.attr.backgroundTint, colorRef3);
        }
    }

    private final ResourceReferences4<Integer> getColorRef(View view, ThemedColor selectedColor, ThemedColor unselectedColor) {
        if (view.isSelected()) {
            return ServerToBentoColorMapper.INSTANCE.mapDayNightSelectorServerColor(selectedColor.getLight(), selectedColor.getDark());
        }
        return ServerToBentoColorMapper.INSTANCE.mapDayNightSelectorServerColor(unselectedColor.getLight(), unselectedColor.getDark());
    }

    /* compiled from: OptionStrategyBuilderHeaderView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/optionschain/strategybuilder/OptionStrategyBuilderHeaderView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/optionschain/strategybuilder/OptionStrategyBuilderHeaderView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<OptionStrategyBuilderHeaderView> {
        private final /* synthetic */ Inflater<OptionStrategyBuilderHeaderView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public OptionStrategyBuilderHeaderView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (OptionStrategyBuilderHeaderView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C24135R.layout.include_option_strategy_builder_header_view);
        }
    }
}
