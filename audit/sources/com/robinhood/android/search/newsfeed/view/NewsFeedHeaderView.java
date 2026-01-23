package com.robinhood.android.search.newsfeed.view;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.Space;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsIconButton;
import com.robinhood.android.education.contracts.NewsfeedDisclosureKey;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.search.databinding.MergeNewsFeedHeaderViewBinding;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: NewsFeedHeaderView.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000  2\u00020\u0001:\u0002\u001f B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u001c\u001a\u00020\u001dH\u0014J\u000e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u001bR\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/view/NewsFeedHeaderView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/search/databinding/MergeNewsFeedHeaderViewBinding;", "getBinding", "()Lcom/robinhood/android/search/databinding/MergeNewsFeedHeaderViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "viewData", "Lcom/robinhood/android/search/newsfeed/view/NewsFeedHeaderView$Data;", "onAttachedToWindow", "", "bind", "Data", "Companion", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class NewsFeedHeaderView extends Hammer_NewsFeedHeaderView {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public ExperimentsStore experimentsStore;
    public Navigator navigator;
    private Data viewData;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(NewsFeedHeaderView.class, "binding", "getBinding()Lcom/robinhood/android/search/databinding/MergeNewsFeedHeaderViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsFeedHeaderView(Context context, AttributeSet attrs) {
        super(context, attrs, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        ViewGroups.inflate(this, C27909R.layout.merge_news_feed_header_view, true);
        this.binding = ViewBinding5.viewBinding(this, NewsFeedHeaderView2.INSTANCE);
    }

    private final MergeNewsFeedHeaderViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeNewsFeedHeaderViewBinding) value;
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

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        final RdsIconButton rdsIconButton = getBinding().newsFeedHeaderInfoBtn;
        Intrinsics.checkNotNull(rdsIconButton);
        ViewsKt.setLoggingConfig(rdsIconButton, new AutoLoggingConfig(false, false, 2, null));
        ViewsKt.eventData$default(rdsIconButton, false, new Function0() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedHeaderView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewsFeedHeaderView.onAttachedToWindow$lambda$2$lambda$0();
            }
        }, 1, null);
        OnClickListeners.onClick(rdsIconButton, new Function0() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedHeaderView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewsFeedHeaderView.onAttachedToWindow$lambda$2$lambda$1(this.f$0, rdsIconButton);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onAttachedToWindow$lambda$2$lambda$0() {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.VIEW_NEWSFEED_DISCLOSURE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$2$lambda$1(NewsFeedHeaderView newsFeedHeaderView, RdsIconButton rdsIconButton) {
        Navigator navigator = newsFeedHeaderView.getNavigator();
        Context context = rdsIconButton.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Data data = newsFeedHeaderView.viewData;
        if (data == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewData");
            data = null;
        }
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, data.getDisclosureKey(), false, false, false, false, null, false, null, null, 1020, null);
        return Unit.INSTANCE;
    }

    public final void bind(Data viewData) {
        Intrinsics.checkNotNullParameter(viewData, "viewData");
        this.viewData = viewData;
        boolean hidePadding = viewData.getHidePadding();
        if (!hidePadding) {
            TypedValue typedValue = new TypedValue();
            setPadding(0, getContext().getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true) ? TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics()) : 0, 0, 0);
        } else {
            com.robinhood.utils.extensions.ViewsKt.setPadding(this, 0);
        }
        Space newsFeedHeaderSpace = getBinding().newsFeedHeaderSpace;
        Intrinsics.checkNotNullExpressionValue(newsFeedHeaderSpace, "newsFeedHeaderSpace");
        newsFeedHeaderSpace.setVisibility(hidePadding ? 8 : 0);
        getBinding().newsFeedHeaderTxt.setText(viewData.getTitle());
    }

    /* compiled from: NewsFeedHeaderView.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/view/NewsFeedHeaderView$Data;", "", "hidePadding", "", "title", "", "disclosureKey", "Lcom/robinhood/android/education/contracts/NewsfeedDisclosureKey;", "<init>", "(ZILcom/robinhood/android/education/contracts/NewsfeedDisclosureKey;)V", "getHidePadding", "()Z", "getTitle", "()I", "getDisclosureKey", "()Lcom/robinhood/android/education/contracts/NewsfeedDisclosureKey;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Data {
        public static final int $stable = 8;
        private final NewsfeedDisclosureKey disclosureKey;
        private final boolean hidePadding;
        private final int title;

        public Data() {
            this(false, 0, null, 7, null);
        }

        public static /* synthetic */ Data copy$default(Data data, boolean z, int i, NewsfeedDisclosureKey newsfeedDisclosureKey, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = data.hidePadding;
            }
            if ((i2 & 2) != 0) {
                i = data.title;
            }
            if ((i2 & 4) != 0) {
                newsfeedDisclosureKey = data.disclosureKey;
            }
            return data.copy(z, i, newsfeedDisclosureKey);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getHidePadding() {
            return this.hidePadding;
        }

        /* renamed from: component2, reason: from getter */
        public final int getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final NewsfeedDisclosureKey getDisclosureKey() {
            return this.disclosureKey;
        }

        public final Data copy(boolean hidePadding, int title, NewsfeedDisclosureKey disclosureKey) {
            Intrinsics.checkNotNullParameter(disclosureKey, "disclosureKey");
            return new Data(hidePadding, title, disclosureKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return this.hidePadding == data.hidePadding && this.title == data.title && Intrinsics.areEqual(this.disclosureKey, data.disclosureKey);
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.hidePadding) * 31) + Integer.hashCode(this.title)) * 31) + this.disclosureKey.hashCode();
        }

        public String toString() {
            return "Data(hidePadding=" + this.hidePadding + ", title=" + this.title + ", disclosureKey=" + this.disclosureKey + ")";
        }

        public Data(boolean z, int i, NewsfeedDisclosureKey disclosureKey) {
            Intrinsics.checkNotNullParameter(disclosureKey, "disclosureKey");
            this.hidePadding = z;
            this.title = i;
            this.disclosureKey = disclosureKey;
        }

        public final boolean getHidePadding() {
            return this.hidePadding;
        }

        public /* synthetic */ Data(boolean z, int i, NewsfeedDisclosureKey newsfeedDisclosureKey, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? C27909R.string.news_feed_header_title_us : i, (i2 & 4) != 0 ? NewsfeedDisclosureKey.INSTANCE.defaultForUs() : newsfeedDisclosureKey);
        }

        public final int getTitle() {
            return this.title;
        }

        public final NewsfeedDisclosureKey getDisclosureKey() {
            return this.disclosureKey;
        }
    }

    /* compiled from: NewsFeedHeaderView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/view/NewsFeedHeaderView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/search/newsfeed/view/NewsFeedHeaderView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<NewsFeedHeaderView> {
        private final /* synthetic */ Inflater<NewsFeedHeaderView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public NewsFeedHeaderView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (NewsFeedHeaderView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C27909R.layout.include_news_feed_header_view);
        }
    }
}
