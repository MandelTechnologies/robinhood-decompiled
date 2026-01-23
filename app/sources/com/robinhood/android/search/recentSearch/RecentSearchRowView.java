package com.robinhood.android.search.recentSearch;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.container.RdsRippleContainerView;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.search.databinding.MergeRowRecentSearchViewBinding;
import com.robinhood.android.search.recentSearch.RecentSearchAdapter;
import com.robinhood.models.p320db.recentSearch.RecentSearch;
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

/* compiled from: RecentSearchRowView.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\n\u0010\u0018\u001a\u00060\u0019j\u0002`\u001aJ\u001c\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\n\u0010\u0018\u001a\u00060\u0019j\u0002`\u001aH\u0002R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/search/recentSearch/RecentSearchRowView;", "Lcom/robinhood/android/designsystem/container/RdsRippleContainerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/search/databinding/MergeRowRecentSearchViewBinding;", "getBinding", "()Lcom/robinhood/android/search/databinding/MergeRowRecentSearchViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/search/recentSearch/RecentSearchAdapter$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/search/recentSearch/RecentSearchAdapter$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/search/recentSearch/RecentSearchAdapter$Callbacks;)V", "bind", "", "recentSearch", "Lcom/robinhood/models/db/recentSearch/RecentSearch$RecentSearchResult;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "bindDeleteButton", "Companion", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RecentSearchRowView extends RdsRippleContainerView {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private RecentSearchAdapter.Callbacks callbacks;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecentSearchRowView.class, "binding", "getBinding()Lcom/robinhood/android/search/databinding/MergeRowRecentSearchViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ RecentSearchRowView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentSearchRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C27909R.layout.merge_row_recent_search_view, true);
        ViewsKt.setLoggingConfig(this, new AutoLoggingConfig(false, true));
        this.binding = ViewBinding5.viewBinding(this, RecentSearchRowView2.INSTANCE);
    }

    private final MergeRowRecentSearchViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeRowRecentSearchViewBinding) value;
    }

    public final RecentSearchAdapter.Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(RecentSearchAdapter.Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    public final void bind(final RecentSearch.RecentSearchResult recentSearch, final com.robinhood.rosetta.eventlogging.Context eventContext) {
        Intrinsics.checkNotNullParameter(recentSearch, "recentSearch");
        Intrinsics.checkNotNullParameter(eventContext, "eventContext");
        getBinding().recentSearchDisplayTitle.setText(recentSearch.getDisplayTitle());
        bindDeleteButton(recentSearch, eventContext);
        OnClickListeners.onClick(this, new Function0() { // from class: com.robinhood.android.search.recentSearch.RecentSearchRowView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecentSearchRowView.bind$lambda$0(this.f$0, recentSearch);
            }
        });
        ViewsKt.eventData$default(this, false, new Function0() { // from class: com.robinhood.android.search.recentSearch.RecentSearchRowView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecentSearchRowView.bind$lambda$1(recentSearch, eventContext);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$0(RecentSearchRowView recentSearchRowView, RecentSearch.RecentSearchResult recentSearchResult) {
        RecentSearchAdapter.Callbacks callbacks = recentSearchRowView.callbacks;
        if (callbacks != null) {
            callbacks.onRecentSearchClicked(recentSearchResult);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor bind$lambda$1(RecentSearch.RecentSearchResult recentSearchResult, com.robinhood.rosetta.eventlogging.Context context) {
        return new UserInteractionEventDescriptor(recentSearchResult.getId(), null, UserInteractionEventData.Action.VIEW_RECENT_SEARCH_ITEM, context, new Component(Component.ComponentType.RECENT_SEARCH_ROW, null, null, 6, null), null, 34, null);
    }

    private final void bindDeleteButton(final RecentSearch.RecentSearchResult recentSearch, final com.robinhood.rosetta.eventlogging.Context eventContext) {
        ImageView imageView = getBinding().recentSearchRowDeleteBtn;
        Intrinsics.checkNotNull(imageView);
        OnClickListeners.onClick(imageView, new Function0() { // from class: com.robinhood.android.search.recentSearch.RecentSearchRowView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecentSearchRowView.bindDeleteButton$lambda$4$lambda$2(this.f$0, recentSearch);
            }
        });
        ViewsKt.eventData$default(imageView, false, new Function0() { // from class: com.robinhood.android.search.recentSearch.RecentSearchRowView$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecentSearchRowView.bindDeleteButton$lambda$4$lambda$3(eventContext);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindDeleteButton$lambda$4$lambda$2(RecentSearchRowView recentSearchRowView, RecentSearch.RecentSearchResult recentSearchResult) {
        RecentSearchAdapter.Callbacks callbacks = recentSearchRowView.callbacks;
        if (callbacks != null) {
            callbacks.onRecentSearchDeleted(recentSearchResult);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor bindDeleteButton$lambda$4$lambda$3(com.robinhood.rosetta.eventlogging.Context context) {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.DISMISS, context, new Component(Component.ComponentType.DELETE_BUTTON, null, null, 6, null), null, 35, null);
    }

    /* compiled from: RecentSearchRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/search/recentSearch/RecentSearchRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/search/recentSearch/RecentSearchRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<RecentSearchRowView> {
        private final /* synthetic */ Inflater<RecentSearchRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public RecentSearchRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (RecentSearchRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C27909R.layout.include_row_recent_search_view);
        }
    }
}
