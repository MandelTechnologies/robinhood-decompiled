package com.robinhood.android.search.newsfeed.marketupdates;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.newsfeed.model.Element;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.search.contracts.SnacksWebViewFragmentKey;
import com.robinhood.android.search.databinding.MergeNewsFeedMarketUpdatesViewBinding;
import com.robinhood.android.search.newsfeed.view.util.CopyableLinkMovementMethod;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import me.saket.bettermovementmethod.BetterLinkMovementMethod;

/* compiled from: NewsFeedMarketUpdatesView.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 -2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001-B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0003H\u0016J\b\u0010,\u001a\u00020*H\u0002R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR$\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020#@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/marketupdates/NewsFeedMarketUpdatesView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/newsfeed/model/Element$MarketUpdates;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "binding", "Lcom/robinhood/android/search/databinding/MergeNewsFeedMarketUpdatesViewBinding;", "getBinding", "()Lcom/robinhood/android/search/databinding/MergeNewsFeedMarketUpdatesViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "value", "", "showTopDivider", "getShowTopDivider", "()Z", "setShowTopDivider", "(Z)V", "bind", "", "state", "updatePadding", "Companion", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class NewsFeedMarketUpdatesView extends Hammer_NewsFeedMarketUpdatesView implements Bindable<Element.MarketUpdates> {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public ExperimentsStore experimentsStore;
    public Markwon markwon;
    public Navigator navigator;
    private boolean showTopDivider;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(NewsFeedMarketUpdatesView.class, "binding", "getBinding()Lcom/robinhood/android/search/databinding/MergeNewsFeedMarketUpdatesViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsFeedMarketUpdatesView(Context context, AttributeSet attrs) {
        super(context, attrs, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        ViewGroups.inflate(this, C27909R.layout.merge_news_feed_market_updates_view, true);
        this.binding = ViewBinding5.viewBinding(this, NewsFeedMarketUpdatesView3.INSTANCE);
        this.showTopDivider = true;
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
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

    public final ExperimentsStore getExperimentsStore() {
        ExperimentsStore experimentsStore = this.experimentsStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsStore");
        return null;
    }

    public final void setExperimentsStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentsStore = experimentsStore;
    }

    private final MergeNewsFeedMarketUpdatesViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeNewsFeedMarketUpdatesViewBinding) value;
    }

    public final boolean getShowTopDivider() {
        return this.showTopDivider;
    }

    public final void setShowTopDivider(boolean z) {
        View newsFeedMarketUpdatesTopDivider = getBinding().newsFeedMarketUpdatesTopDivider;
        Intrinsics.checkNotNullExpressionValue(newsFeedMarketUpdatesTopDivider, "newsFeedMarketUpdatesTopDivider");
        newsFeedMarketUpdatesTopDivider.setVisibility(z ? 0 : 8);
        this.showTopDivider = z;
        updatePadding();
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(Element.MarketUpdates state) {
        Intrinsics.checkNotNullParameter(state, "state");
        getBinding().newsFeedMarketUpdatesSourceTxt.setText(state.getTitle());
        getBinding().newsFeedMarketUpdatesBodyTxt.setText(Markwons.toSpanned$default(getMarkwon(), state.getBody(), null, 2, null));
        RhTextView rhTextView = getBinding().newsFeedMarketUpdatesBodyTxt;
        CopyableLinkMovementMethod copyableLinkMovementMethod = new CopyableLinkMovementMethod();
        copyableLinkMovementMethod.setOnLinkClickListener(new BetterLinkMovementMethod.OnLinkClickListener() { // from class: com.robinhood.android.search.newsfeed.marketupdates.NewsFeedMarketUpdatesView$bind$1$1
            @Override // me.saket.bettermovementmethod.BetterLinkMovementMethod.OnLinkClickListener
            public final boolean onClick(TextView textView, String str) {
                Uri uri = Uri.parse(str);
                Navigator navigator = this.this$0.getNavigator();
                Intrinsics.checkNotNull(uri);
                if (navigator.isDeepLinkSupported(uri)) {
                    Navigator navigator2 = this.this$0.getNavigator();
                    Context context = this.this$0.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    Navigator.DefaultImpls.handleDeepLink$default(navigator2, context, uri, null, null, false, null, 60, null);
                    return true;
                }
                Intrinsics.checkNotNull(str);
                if (!StringsKt.isSnacksUrl(str)) {
                    return false;
                }
                Navigator navigator3 = this.this$0.getNavigator();
                Context context2 = this.this$0.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator3, context2, new SnacksWebViewFragmentKey(str), false, false, false, false, null, false, null, null, 1020, null);
                return true;
            }
        });
        rhTextView.setMovementMethod(copyableLinkMovementMethod);
        getBinding().newsFeedMarketUpdatesTimeTxt.setText(InstantFormatter.SHORT_TIME_IN_SYSTEM_ZONE.format((InstantFormatter) state.getPublishedAt()));
    }

    private final void updatePadding() {
        ViewsKt.setMarginTop(this, this.showTopDivider ? ViewsKt.getDimensionPixelSize(this, C13997R.dimen.rds_spacing_small) : 0);
    }

    /* compiled from: NewsFeedMarketUpdatesView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/marketupdates/NewsFeedMarketUpdatesView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/search/newsfeed/marketupdates/NewsFeedMarketUpdatesView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<NewsFeedMarketUpdatesView> {
        private final /* synthetic */ Inflater<NewsFeedMarketUpdatesView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public NewsFeedMarketUpdatesView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (NewsFeedMarketUpdatesView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C27909R.layout.include_news_feed_market_updates_view);
        }
    }
}
