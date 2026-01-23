package com.robinhood.android.search.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.search.databinding.MergeSearchHeaderWithActionViewBinding;
import com.robinhood.android.search.search.SearchAdapter;
import com.robinhood.android.search.search.SearchItem;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
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

/* compiled from: SearchHeaderWithActionView.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0019B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003H\u0016R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/search/search/SearchHeaderWithActionView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/search/search/SearchItem$HeaderWithAction;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/search/databinding/MergeSearchHeaderWithActionViewBinding;", "getBinding", "()Lcom/robinhood/android/search/databinding/MergeSearchHeaderWithActionViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/search/search/SearchAdapter$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/search/search/SearchAdapter$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/search/search/SearchAdapter$Callbacks;)V", "bind", "", "state", "Companion", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SearchHeaderWithActionView extends ConstraintLayout implements Bindable<SearchItem.HeaderWithAction> {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private SearchAdapter.Callbacks callbacks;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SearchHeaderWithActionView.class, "binding", "getBinding()Lcom/robinhood/android/search/databinding/MergeSearchHeaderWithActionViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ SearchHeaderWithActionView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchHeaderWithActionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C27909R.layout.merge_search_header_with_action_view, true);
        this.binding = ViewBinding5.viewBinding(this, SearchHeaderWithActionView2.INSTANCE);
        RdsTextButton searchHeaderActionBtn = getBinding().searchHeaderActionBtn;
        Intrinsics.checkNotNullExpressionValue(searchHeaderActionBtn, "searchHeaderActionBtn");
        ViewsKt.setLoggingConfig(searchHeaderActionBtn, new AutoLoggingConfig(false, false));
    }

    private final MergeSearchHeaderWithActionViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeSearchHeaderWithActionViewBinding) value;
    }

    public final SearchAdapter.Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(SearchAdapter.Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(final SearchItem.HeaderWithAction state) {
        Intrinsics.checkNotNullParameter(state, "state");
        MergeSearchHeaderWithActionViewBinding binding = getBinding();
        RhTextView rhTextView = binding.searchHeaderTitleTxt;
        String displayTitle = state.getDisplayTitle();
        if (displayTitle == null) {
            displayTitle = com.robinhood.utils.extensions.ViewsKt.getString(this, state.getDefaultDisplayTitleRes());
        }
        rhTextView.setText(displayTitle);
        binding.searchHeaderActionBtn.setText(com.robinhood.utils.extensions.ViewsKt.getString(this, state.getActionTitleRes()));
        RdsTextButton searchHeaderActionBtn = binding.searchHeaderActionBtn;
        Intrinsics.checkNotNullExpressionValue(searchHeaderActionBtn, "searchHeaderActionBtn");
        OnClickListeners.onClick(searchHeaderActionBtn, new Function0() { // from class: com.robinhood.android.search.search.SearchHeaderWithActionView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchHeaderWithActionView.bind$lambda$2$lambda$0(this.f$0, state);
            }
        });
        RdsTextButton searchHeaderActionBtn2 = binding.searchHeaderActionBtn;
        Intrinsics.checkNotNullExpressionValue(searchHeaderActionBtn2, "searchHeaderActionBtn");
        ViewsKt.eventData$default(searchHeaderActionBtn2, false, new Function0() { // from class: com.robinhood.android.search.search.SearchHeaderWithActionView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchHeaderWithActionView.bind$lambda$2$lambda$1(state);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$2$lambda$0(SearchHeaderWithActionView searchHeaderWithActionView, SearchItem.HeaderWithAction headerWithAction) {
        SearchAdapter.Callbacks callbacks = searchHeaderWithActionView.callbacks;
        if (callbacks != null) {
            callbacks.onHeaderWithActionClicked(headerWithAction.getActionUri());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor bind$lambda$2$lambda$1(SearchItem.HeaderWithAction headerWithAction) {
        UserInteractionEventData.Action eventAction = headerWithAction.getEventAction();
        Component component = new Component(Component.ComponentType.BUTTON, null, null, 6, null);
        String query = headerWithAction.getEventData().getQuery();
        return new UserInteractionEventDescriptor(null, null, eventAction, new com.robinhood.rosetta.eventlogging.Context(0, headerWithAction.getEventData().getItemCount(), 0, null, null, query, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -35, -1, -1, -1, -1, -1, 16383, null), component, null, 35, null);
    }

    /* compiled from: SearchHeaderWithActionView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/search/search/SearchHeaderWithActionView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/search/search/SearchHeaderWithActionView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<SearchHeaderWithActionView> {
        private final /* synthetic */ Inflater<SearchHeaderWithActionView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public SearchHeaderWithActionView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (SearchHeaderWithActionView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C27909R.layout.include_search_header_with_action_view);
        }
    }
}
