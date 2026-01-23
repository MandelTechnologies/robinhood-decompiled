package com.robinhood.android.search.newsfeed.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.view.AnimatedRhTextView;
import com.robinhood.android.designsystem.style.DirectionOverlay;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.newsfeed.extensions.Contents;
import com.robinhood.android.newsfeed.extensions.Quotes;
import com.robinhood.android.newsfeed.model.Content;
import com.robinhood.android.newsfeed.p200ui.QuoteFetcher;
import com.robinhood.android.search.C27909R;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.models.p320db.Quote;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NewsFeedInstrumentView.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001dB\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0016\u001a\u00020\u0017H\u0014J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0003H\u0016J\u0012\u0010\u001a\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/view/NewsFeedInstrumentView;", "Landroidx/cardview/widget/CardView;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/newsfeed/model/Content$Instrument;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "quoteFetcher", "Lcom/robinhood/android/newsfeed/ui/QuoteFetcher;", "getQuoteFetcher", "()Lcom/robinhood/android/newsfeed/ui/QuoteFetcher;", "setQuoteFetcher", "(Lcom/robinhood/android/newsfeed/ui/QuoteFetcher;)V", "nameTxt", "Landroid/widget/TextView;", "symbolTxt", "percentChangeTxt", "Lcom/robinhood/android/common/view/AnimatedRhTextView;", "instrument", "onAttachedToWindow", "", "bind", "state", "bindQuote", "quote", "Lcom/robinhood/models/db/Quote;", "Companion", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class NewsFeedInstrumentView extends Hammer_NewsFeedInstrumentView implements Bindable<Content.Instrument> {
    private Content.Instrument instrument;
    private final TextView nameTxt;
    private final AnimatedRhTextView percentChangeTxt;
    public QuoteFetcher quoteFetcher;
    private final TextView symbolTxt;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ NewsFeedInstrumentView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsFeedInstrumentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C27909R.layout.merge_news_feed_instrument, true);
        ViewsKt.eventData$default(this, false, new Function0() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedInstrumentView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewsFeedInstrumentView._init_$lambda$0(this.f$0);
            }
        }, 1, null);
        View viewFindViewById = findViewById(C27909R.id.news_feed_instrument_name_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.nameTxt = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(C27909R.id.news_feed_instrument_symbol_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.symbolTxt = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C27909R.id.news_feed_instrument_percent_change_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.percentChangeTxt = (AnimatedRhTextView) viewFindViewById3;
    }

    public final QuoteFetcher getQuoteFetcher() {
        QuoteFetcher quoteFetcher = this.quoteFetcher;
        if (quoteFetcher != null) {
            return quoteFetcher;
        }
        Intrinsics.throwUninitializedPropertyAccessException("quoteFetcher");
        return null;
    }

    public final void setQuoteFetcher(QuoteFetcher quoteFetcher) {
        Intrinsics.checkNotNullParameter(quoteFetcher, "<set-?>");
        this.quoteFetcher = quoteFetcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor _init_$lambda$0(NewsFeedInstrumentView newsFeedInstrumentView) {
        Content.Instrument instrument = newsFeedInstrumentView.instrument;
        if (instrument != null) {
            return Contents.toEventData(instrument, UserInteractionEventData.Action.VIEW_STOCK_DETAIL_PAGE);
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(getQuoteFetcher().streamQuote()), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedInstrumentView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedInstrumentView.onAttachedToWindow$lambda$1(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$1(NewsFeedInstrumentView newsFeedInstrumentView, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        newsFeedInstrumentView.bindQuote((Quote) optional.component1());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(Content.Instrument state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.instrument = state;
        this.nameTxt.setText(state.getName());
        this.symbolTxt.setText(state.getSymbol());
        getQuoteFetcher().setInstrumentId(state.getInstrumentId());
    }

    private final void bindQuote(Quote quote) {
        BigDecimal todaysPercentChange = quote != null ? quote.getTodaysPercentChange() : null;
        if (todaysPercentChange != null) {
            this.percentChangeTxt.setVisibility(0);
            this.percentChangeTxt.setText(Formats.getPercentDeltaFormat().format(todaysPercentChange));
        } else {
            this.percentChangeTxt.setVisibility(4);
        }
        DirectionOverlay direction = Quotes.getDirection(quote);
        ScarletManager scarletManager = ScarletManager2.getScarletManager(this.symbolTxt);
        Boolean bool = Boolean.FALSE;
        scarletManager.putOverlay(direction, bool);
        ScarletManager2.getScarletManager(this.percentChangeTxt).putOverlay(direction, bool);
    }

    /* compiled from: NewsFeedInstrumentView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/view/NewsFeedInstrumentView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/search/newsfeed/view/NewsFeedInstrumentView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<NewsFeedInstrumentView> {
        private final /* synthetic */ Inflater<NewsFeedInstrumentView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public NewsFeedInstrumentView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (NewsFeedInstrumentView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C27909R.layout.include_news_feed_instrument);
        }
    }
}
