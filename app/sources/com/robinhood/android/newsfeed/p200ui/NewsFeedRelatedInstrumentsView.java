package com.robinhood.android.newsfeed.p200ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.designsystem.style.DirectionOverlay;
import com.robinhood.android.educationtour.extensions.ViewsKt;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.newsfeed.C20334R;
import com.robinhood.android.newsfeed.extensions.Quotes;
import com.robinhood.android.newsfeed.model.RelatedAsset;
import com.robinhood.android.newsfeed.model.RelatedInstrument;
import com.robinhood.android.newsfeed.p200ui.MultiAssetQuoteFetcher;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.models.p320db.Quote;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NewsFeedRelatedInstrumentsView.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u00102\u001a\u00020#H\u0014J&\u00103\u001a\u00020#2\b\u00104\u001a\u0004\u0018\u00010\"2\b\u00105\u001a\u0004\u0018\u00010\"2\n\b\u0002\u00106\u001a\u0004\u0018\u000107J\u0018\u00108\u001a\u00020#2\u0006\u00109\u001a\u00020\t2\u0006\u0010:\u001a\u00020-H\u0002J\u0016\u0010;\u001a\u00020#*\u00020-2\b\u0010<\u001a\u0004\u0018\u00010\"H\u0002J&\u00103\u001a\u00020#2\b\u0010=\u001a\u0004\u0018\u00010)2\b\u0010>\u001a\u0004\u0018\u00010)2\n\b\u0002\u00106\u001a\u0004\u0018\u000107J\u0016\u0010?\u001a\u00020#*\u00020-2\b\u0010@\u001a\u0004\u0018\u00010)H\u0002J\u0018\u0010A\u001a\u00020#2\u0006\u00109\u001a\u00020\u00122\u0006\u0010:\u001a\u00020-H\u0002J\u0014\u0010B\u001a\u000207*\u00020C2\u0006\u0010D\u001a\u00020EH\u0002J\u0014\u0010B\u001a\u000207*\u00020F2\u0006\u0010D\u001a\u00020EH\u0002R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R(\u0010(\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020#\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020100X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010G\u001a\u00020H*\u00020F8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006K"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/ui/NewsFeedRelatedInstrumentsView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "firstQuoteFetcher", "Lcom/robinhood/android/newsfeed/ui/QuoteFetcher;", "getFirstQuoteFetcher", "()Lcom/robinhood/android/newsfeed/ui/QuoteFetcher;", "setFirstQuoteFetcher", "(Lcom/robinhood/android/newsfeed/ui/QuoteFetcher;)V", "secondQuoteFetcher", "getSecondQuoteFetcher", "setSecondQuoteFetcher", "firstMultiAssetQuoteFetcher", "Lcom/robinhood/android/newsfeed/ui/MultiAssetQuoteFetcher;", "getFirstMultiAssetQuoteFetcher", "()Lcom/robinhood/android/newsfeed/ui/MultiAssetQuoteFetcher;", "setFirstMultiAssetQuoteFetcher", "(Lcom/robinhood/android/newsfeed/ui/MultiAssetQuoteFetcher;)V", "secondMultiAssetQuoteFetcher", "getSecondMultiAssetQuoteFetcher", "setSecondMultiAssetQuoteFetcher", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "getIndexStore", "()Lcom/robinhood/android/indexes/store/IndexStore;", "setIndexStore", "(Lcom/robinhood/android/indexes/store/IndexStore;)V", "onRelatedInstrumentClick", "Lkotlin/Function1;", "Lcom/robinhood/android/newsfeed/model/RelatedInstrument;", "", "getOnRelatedInstrumentClick", "()Lkotlin/jvm/functions/Function1;", "setOnRelatedInstrumentClick", "(Lkotlin/jvm/functions/Function1;)V", "onRelatedAssetClick", "Lcom/robinhood/android/newsfeed/model/RelatedAsset;", "getOnRelatedAssetClick", "setOnRelatedAssetClick", "firstInstrumentTxt", "Landroid/widget/TextView;", "secondInstrumentTxt", "useRelatedAsset", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "onAttachedToWindow", "bind", "firstInstrument", "secondInstrument", "educationTourId", "", "bindQuote", "quoteFetcher", "view", "bindInstrument", "instrument", "firstAsset", "secondAsset", "bindAsset", "asset", "bindMultiAssetQuote", "getDisplayText", "Lcom/robinhood/models/db/Quote;", "resources", "Landroid/content/res/Resources;", "Lcom/robinhood/android/newsfeed/ui/MultiAssetQuoteFetcher$Result$Index;", "direction", "Lcom/robinhood/android/designsystem/style/DirectionOverlay;", "getDirection", "(Lcom/robinhood/android/newsfeed/ui/MultiAssetQuoteFetcher$Result$Index;)Lcom/robinhood/android/designsystem/style/DirectionOverlay;", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class NewsFeedRelatedInstrumentsView extends Hammer_NewsFeedRelatedInstrumentsView {
    public static final int $stable = 8;
    private final TextView firstInstrumentTxt;
    public MultiAssetQuoteFetcher firstMultiAssetQuoteFetcher;
    public QuoteFetcher firstQuoteFetcher;
    public IndexStore indexStore;
    private Function1<? super RelatedAsset, Unit> onRelatedAssetClick;
    private Function1<? super RelatedInstrument, Unit> onRelatedInstrumentClick;
    private final TextView secondInstrumentTxt;
    public MultiAssetQuoteFetcher secondMultiAssetQuoteFetcher;
    public QuoteFetcher secondQuoteFetcher;
    private final BehaviorRelay<Boolean> useRelatedAsset;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsFeedRelatedInstrumentsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(0);
        ViewGroups.inflate(this, C20334R.layout.merge_news_feed_related_instruments_view, true);
        View viewFindViewById = findViewById(C20334R.id.news_feed_related_instrument_first_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.firstInstrumentTxt = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(C20334R.id.news_feed_related_instrument_second_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.secondInstrumentTxt = (TextView) viewFindViewById2;
        BehaviorRelay<Boolean> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.useRelatedAsset = behaviorRelayCreate;
    }

    public final QuoteFetcher getFirstQuoteFetcher() {
        QuoteFetcher quoteFetcher = this.firstQuoteFetcher;
        if (quoteFetcher != null) {
            return quoteFetcher;
        }
        Intrinsics.throwUninitializedPropertyAccessException("firstQuoteFetcher");
        return null;
    }

    public final void setFirstQuoteFetcher(QuoteFetcher quoteFetcher) {
        Intrinsics.checkNotNullParameter(quoteFetcher, "<set-?>");
        this.firstQuoteFetcher = quoteFetcher;
    }

    public final QuoteFetcher getSecondQuoteFetcher() {
        QuoteFetcher quoteFetcher = this.secondQuoteFetcher;
        if (quoteFetcher != null) {
            return quoteFetcher;
        }
        Intrinsics.throwUninitializedPropertyAccessException("secondQuoteFetcher");
        return null;
    }

    public final void setSecondQuoteFetcher(QuoteFetcher quoteFetcher) {
        Intrinsics.checkNotNullParameter(quoteFetcher, "<set-?>");
        this.secondQuoteFetcher = quoteFetcher;
    }

    public final MultiAssetQuoteFetcher getFirstMultiAssetQuoteFetcher() {
        MultiAssetQuoteFetcher multiAssetQuoteFetcher = this.firstMultiAssetQuoteFetcher;
        if (multiAssetQuoteFetcher != null) {
            return multiAssetQuoteFetcher;
        }
        Intrinsics.throwUninitializedPropertyAccessException("firstMultiAssetQuoteFetcher");
        return null;
    }

    public final void setFirstMultiAssetQuoteFetcher(MultiAssetQuoteFetcher multiAssetQuoteFetcher) {
        Intrinsics.checkNotNullParameter(multiAssetQuoteFetcher, "<set-?>");
        this.firstMultiAssetQuoteFetcher = multiAssetQuoteFetcher;
    }

    public final MultiAssetQuoteFetcher getSecondMultiAssetQuoteFetcher() {
        MultiAssetQuoteFetcher multiAssetQuoteFetcher = this.secondMultiAssetQuoteFetcher;
        if (multiAssetQuoteFetcher != null) {
            return multiAssetQuoteFetcher;
        }
        Intrinsics.throwUninitializedPropertyAccessException("secondMultiAssetQuoteFetcher");
        return null;
    }

    public final void setSecondMultiAssetQuoteFetcher(MultiAssetQuoteFetcher multiAssetQuoteFetcher) {
        Intrinsics.checkNotNullParameter(multiAssetQuoteFetcher, "<set-?>");
        this.secondMultiAssetQuoteFetcher = multiAssetQuoteFetcher;
    }

    public final IndexStore getIndexStore() {
        IndexStore indexStore = this.indexStore;
        if (indexStore != null) {
            return indexStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("indexStore");
        return null;
    }

    public final void setIndexStore(IndexStore indexStore) {
        Intrinsics.checkNotNullParameter(indexStore, "<set-?>");
        this.indexStore = indexStore;
    }

    public final Function1<RelatedInstrument, Unit> getOnRelatedInstrumentClick() {
        return this.onRelatedInstrumentClick;
    }

    public final void setOnRelatedInstrumentClick(Function1<? super RelatedInstrument, Unit> function1) {
        this.onRelatedInstrumentClick = function1;
    }

    public final Function1<RelatedAsset, Unit> getOnRelatedAssetClick() {
        return this.onRelatedAssetClick;
    }

    public final void setOnRelatedAssetClick(Function1<? super RelatedAsset, Unit> function1) {
        this.onRelatedAssetClick = function1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        bindMultiAssetQuote(getFirstMultiAssetQuoteFetcher(), this.firstInstrumentTxt);
        bindMultiAssetQuote(getSecondMultiAssetQuoteFetcher(), this.secondInstrumentTxt);
        bindQuote(getFirstQuoteFetcher(), this.firstInstrumentTxt);
        bindQuote(getSecondQuoteFetcher(), this.secondInstrumentTxt);
    }

    public static /* synthetic */ void bind$default(NewsFeedRelatedInstrumentsView newsFeedRelatedInstrumentsView, RelatedInstrument relatedInstrument, RelatedInstrument relatedInstrument2, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        newsFeedRelatedInstrumentsView.bind(relatedInstrument, relatedInstrument2, str);
    }

    public final void bind(RelatedInstrument firstInstrument, RelatedInstrument secondInstrument, String educationTourId) {
        this.useRelatedAsset.accept(Boolean.FALSE);
        getFirstQuoteFetcher().setInstrumentId(firstInstrument != null ? firstInstrument.getId() : null);
        getSecondQuoteFetcher().setInstrumentId(secondInstrument != null ? secondInstrument.getId() : null);
        bindInstrument(this.firstInstrumentTxt, firstInstrument);
        ViewsKt.setEducationTourId(this.firstInstrumentTxt, educationTourId);
        bindInstrument(this.secondInstrumentTxt, secondInstrument);
    }

    private final void bindQuote(QuoteFetcher quoteFetcher, final TextView view) {
        Observable<Optional<Quote>> observableStreamQuote = quoteFetcher.streamQuote();
        Observable<R> map = this.useRelatedAsset.map(new Function() { // from class: com.robinhood.android.newsfeed.ui.NewsFeedRelatedInstrumentsView.bindQuote.1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!it.booleanValue());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(ObservablesKt.connectWhen$default(observableStreamQuote, map, null, 2, null)), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.newsfeed.ui.NewsFeedRelatedInstrumentsView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedRelatedInstrumentsView.bindQuote$lambda$0(view, this, (Optional) obj);
            }
        });
    }

    private final void bindInstrument(TextView textView, final RelatedInstrument relatedInstrument) {
        OnClickListeners.onClick(textView, new Function0() { // from class: com.robinhood.android.newsfeed.ui.NewsFeedRelatedInstrumentsView$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewsFeedRelatedInstrumentsView.bindInstrument$lambda$1(relatedInstrument, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindInstrument$lambda$1(RelatedInstrument relatedInstrument, NewsFeedRelatedInstrumentsView newsFeedRelatedInstrumentsView) {
        Function1<? super RelatedInstrument, Unit> function1;
        if (relatedInstrument != null && (function1 = newsFeedRelatedInstrumentsView.onRelatedInstrumentClick) != null) {
            function1.invoke(relatedInstrument);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void bind$default(NewsFeedRelatedInstrumentsView newsFeedRelatedInstrumentsView, RelatedAsset relatedAsset, RelatedAsset relatedAsset2, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        newsFeedRelatedInstrumentsView.bind(relatedAsset, relatedAsset2, str);
    }

    public final void bind(RelatedAsset firstAsset, RelatedAsset secondAsset, String educationTourId) {
        this.useRelatedAsset.accept(Boolean.TRUE);
        getFirstMultiAssetQuoteFetcher().setAssetId(firstAsset != null ? firstAsset.getId() : null, firstAsset != null ? firstAsset.getAssetType() : null);
        getSecondMultiAssetQuoteFetcher().setAssetId(secondAsset != null ? secondAsset.getId() : null, secondAsset != null ? secondAsset.getAssetType() : null);
        bindAsset(this.firstInstrumentTxt, firstAsset);
        ViewsKt.setEducationTourId(this.firstInstrumentTxt, educationTourId);
        bindAsset(this.secondInstrumentTxt, secondAsset);
    }

    private final void bindAsset(TextView textView, final RelatedAsset relatedAsset) {
        OnClickListeners.onClick(textView, new Function0() { // from class: com.robinhood.android.newsfeed.ui.NewsFeedRelatedInstrumentsView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewsFeedRelatedInstrumentsView.bindAsset$lambda$2(relatedAsset, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindAsset$lambda$2(RelatedAsset relatedAsset, NewsFeedRelatedInstrumentsView newsFeedRelatedInstrumentsView) {
        Function1<? super RelatedAsset, Unit> function1;
        if (relatedAsset != null && (function1 = newsFeedRelatedInstrumentsView.onRelatedAssetClick) != null) {
            function1.invoke(relatedAsset);
        }
        return Unit.INSTANCE;
    }

    private final void bindMultiAssetQuote(MultiAssetQuoteFetcher quoteFetcher, final TextView view) {
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(ObservablesKt.connectWhen$default(quoteFetcher.streamQuote(), this.useRelatedAsset, null, 2, null)), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.newsfeed.ui.NewsFeedRelatedInstrumentsView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedRelatedInstrumentsView.bindMultiAssetQuote$lambda$3(view, this, (Optional) obj);
            }
        });
    }

    private final String getDisplayText(Quote quote, Resources resources) throws Resources.NotFoundException {
        String string2 = resources.getString(C20334R.string.news_feed_related_instrument_display_text, quote.getSymbol(), Formats.getPercentDeltaFormat().format(quote.getTodaysPercentChange()));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    private final String getDisplayText(MultiAssetQuoteFetcher.Result.Index index, Resources resources) throws Resources.NotFoundException {
        BigDecimal bigDecimalSubtract = index.getIndexValue().getValue().subtract(index.getIndexCloseValue().getCloseValue());
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        String string2 = resources.getString(C20334R.string.news_feed_related_instrument_display_text, index.getIndexCloseValue().getSymbol(), Formats.getPercentDeltaFormat().format(BigDecimals7.safeDivide(bigDecimalSubtract, index.getIndexCloseValue().getCloseValue())));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    private final DirectionOverlay getDirection(MultiAssetQuoteFetcher.Result.Index index) {
        return index.getIndexValue().getValue().compareTo(index.getIndexCloseValue().getCloseValue()) >= 0 ? DirectionOverlay.POSITIVE : DirectionOverlay.NEGATIVE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindMultiAssetQuote$lambda$3(TextView textView, NewsFeedRelatedInstrumentsView newsFeedRelatedInstrumentsView, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        MultiAssetQuoteFetcher.Result result = (MultiAssetQuoteFetcher.Result) optional.component1();
        if (result == null) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            if (result instanceof MultiAssetQuoteFetcher.Result.Equity) {
                MultiAssetQuoteFetcher.Result.Equity equity = (MultiAssetQuoteFetcher.Result.Equity) result;
                Quote quote = equity.getQuote();
                Resources resources = newsFeedRelatedInstrumentsView.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                textView.setText(newsFeedRelatedInstrumentsView.getDisplayText(quote, resources));
                ScarletManager2.getScarletManager(textView).putOverlay(Quotes.getDirection(equity.getQuote()), Boolean.FALSE);
            } else {
                if (!(result instanceof MultiAssetQuoteFetcher.Result.Index)) {
                    throw new NoWhenBranchMatchedException();
                }
                MultiAssetQuoteFetcher.Result.Index index = (MultiAssetQuoteFetcher.Result.Index) result;
                Resources resources2 = newsFeedRelatedInstrumentsView.getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                textView.setText(newsFeedRelatedInstrumentsView.getDisplayText(index, resources2));
                ScarletManager2.getScarletManager(textView).putOverlay(newsFeedRelatedInstrumentsView.getDirection(index), Boolean.FALSE);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindQuote$lambda$0(TextView textView, NewsFeedRelatedInstrumentsView newsFeedRelatedInstrumentsView, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        Quote quote = (Quote) optional.component1();
        if (quote == null) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            Resources resources = newsFeedRelatedInstrumentsView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            textView.setText(newsFeedRelatedInstrumentsView.getDisplayText(quote, resources));
            ScarletManager2.getScarletManager(textView).putOverlay(Quotes.getDirection(quote), Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }
}
