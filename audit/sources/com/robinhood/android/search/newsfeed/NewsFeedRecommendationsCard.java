package com.robinhood.android.search.newsfeed;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.extensions.CharSequences;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.recommendations.contracts.RecommendationsIntentKeys;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.search.databinding.MergeNewsFeedRecommendationCardBinding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: NewsFeedRecommendationsCard.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001bB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0003H\u0014J\b\u0010\u001a\u001a\u00020\u0003H\u0002R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/NewsFeedRecommendationsCard;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "binding", "Lcom/robinhood/android/search/databinding/MergeNewsFeedRecommendationCardBinding;", "getBinding", "()Lcom/robinhood/android/search/databinding/MergeNewsFeedRecommendationCardBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "state", "(Lkotlin/Unit;)V", "onAttachedToWindow", "startRecommendationsFlow", "Companion", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class NewsFeedRecommendationsCard extends Hammer_NewsFeedRecommendationsCard implements Bindable<Unit> {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public Navigator navigator;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(NewsFeedRecommendationsCard.class, "binding", "getBinding()Lcom/robinhood/android/search/databinding/MergeNewsFeedRecommendationCardBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(Unit state) {
        Intrinsics.checkNotNullParameter(state, "state");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsFeedRecommendationsCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, NewsFeedRecommendationsCard2.INSTANCE);
        ViewGroups.inflate(this, C27909R.layout.merge_news_feed_recommendation_card, true);
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

    private final MergeNewsFeedRecommendationCardBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeNewsFeedRecommendationCardBinding) value;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() throws Resources.NotFoundException {
        super.onAttachedToWindow();
        ViewsKt.eventData$default(this, false, new Function0() { // from class: com.robinhood.android.search.newsfeed.NewsFeedRecommendationsCard$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewsFeedRecommendationsCard.onAttachedToWindow$lambda$0();
            }
        }, 1, null);
        OnClickListeners.onClick(this, new C280452(this));
        RhTextView rhTextView = getBinding().cta;
        String string2 = getResources().getString(C11048R.string.general_label_get_started);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        rhTextView.setText(CharSequences.addUnderlineToText(string2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onAttachedToWindow$lambda$0() {
        return new UserInteractionEventDescriptor(null, new Screen(Screen.Name.BROWSE_NEWSFEED, null, null, null, 14, null), null, null, new Component(Component.ComponentType.RECOMMENDATIONS_BROWSE_CARD, "browse_recs_entry_card", null, 4, null), null, 45, null);
    }

    /* compiled from: NewsFeedRecommendationsCard.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.search.newsfeed.NewsFeedRecommendationsCard$onAttachedToWindow$2 */
    /* synthetic */ class C280452 extends FunctionReferenceImpl implements Function0<Unit> {
        C280452(Object obj) {
            super(0, obj, NewsFeedRecommendationsCard.class, "startRecommendationsFlow", "startRecommendationsFlow()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((NewsFeedRecommendationsCard) this.receiver).startRecommendationsFlow();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startRecommendationsFlow() {
        Navigator navigator = getNavigator();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, context, new RecommendationsIntentKeys("browse", null, 2, null), null, false, null, null, 60, null);
    }

    /* compiled from: NewsFeedRecommendationsCard.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/NewsFeedRecommendationsCard$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/search/newsfeed/NewsFeedRecommendationsCard;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<NewsFeedRecommendationsCard> {
        private final /* synthetic */ Inflater<NewsFeedRecommendationsCard> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public NewsFeedRecommendationsCard inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (NewsFeedRecommendationsCard) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C27909R.layout.include_news_feed_recommendation_card);
        }
    }
}
