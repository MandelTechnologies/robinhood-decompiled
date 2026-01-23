package com.robinhood.android.accountcenter.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.accountcenter.AccountCenterAdapter;
import com.robinhood.android.accountcenter.C8293R;
import com.robinhood.android.accountcenter.databinding.IncludeAccountCenterBubbleViewBinding;
import com.robinhood.android.accountcenter.views.AssetBreakdownCircleChartState;
import com.robinhood.android.accountcenter.views.ProfileAssetBreakdownItemView;
import com.robinhood.android.accountcenter.views.circlechart.CircleChartView;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.DisclosureUtil;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.RichTexts;
import com.robinhood.android.common.util.extensions.Views;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.models.accountcenter.p183ui.UiTypedAccountCenterItem;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.models.p320db.bonfire.FeatureDiscoveryResponse;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.shared.feature.discovery.p382ui.FeatureDiscoveryWidgetView;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import io.noties.markwon.Markwon;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: AccountCenterBubbleView.kt */
@Metadata(m3635d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 T2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001TB\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\b\u00106\u001a\u000207H\u0014J\u0010\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u0003H\u0016J\u001c\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u00032\f\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;J\u0018\u0010=\u001a\u0002072\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AH\u0002J\u0018\u0010B\u001a\u0002072\u0006\u0010>\u001a\u00020?2\u0006\u0010C\u001a\u00020DH\u0002J\u0010\u0010E\u001a\u0002072\u0006\u0010>\u001a\u00020?H\u0002J\u0010\u0010F\u001a\u0002072\u0006\u0010G\u001a\u00020HH\u0002J\u0010\u0010I\u001a\u0002072\u0006\u0010J\u001a\u00020KH\u0002J\u0010\u0010L\u001a\u0002072\u0006\u0010J\u001a\u00020KH\u0002J\u0010\u0010M\u001a\u0002072\u0006\u0010J\u001a\u00020KH\u0002J\u0010\u0010N\u001a\u0002072\u0006\u0010J\u001a\u00020KH\u0002J\u0010\u0010O\u001a\u0002072\u0006\u0010J\u001a\u00020KH\u0003J \u0010P\u001a\u0002072\b\u0010Q\u001a\u0004\u0018\u00010R2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;H\u0002J\u0010\u0010S\u001a\u0002072\u0006\u0010J\u001a\u00020KH\u0002R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020200X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00103\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020500X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006U"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/AccountCenterBubbleView;", "Landroid/widget/LinearLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/models/accountcenter/ui/UiTypedAccountCenterItem$BubbleItem;", "Lcom/robinhood/android/accountcenter/views/BaseAccountCenterView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/accountcenter/databinding/IncludeAccountCenterBubbleViewBinding;", "getBinding", "()Lcom/robinhood/android/accountcenter/databinding/IncludeAccountCenterBubbleViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "duxo", "Lcom/robinhood/android/accountcenter/views/ProfileViewDuxo;", "getDuxo", "()Lcom/robinhood/android/accountcenter/views/ProfileViewDuxo;", "setDuxo", "(Lcom/robinhood/android/accountcenter/views/ProfileViewDuxo;)V", "callbacks", "Lcom/robinhood/android/accountcenter/AccountCenterAdapter$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/accountcenter/AccountCenterAdapter$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/accountcenter/AccountCenterAdapter$Callbacks;)V", "assetBreakdownAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/accountcenter/views/ProfileAssetBreakdownItemView;", "Lcom/robinhood/android/accountcenter/views/AssetBreakdownItem;", "insightAdapter", "Lcom/robinhood/android/accountcenter/views/ProfileInsightItemView;", "Lcom/robinhood/android/accountcenter/views/InsightItem;", "onAttachedToWindow", "", "bind", "state", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "onEmptyAssetCuratedListClick", "assetId", "", "curatedListId", "Ljava/util/UUID;", "onEmptyAssetDescriptionLinkClick", "uri", "Landroid/net/Uri;", "onAssetTabClick", "onCircleChartItemClick", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/accountcenter/views/circlechart/CircleChartView$Item;", "bindProfileViewState", "viewState", "Lcom/robinhood/android/accountcenter/views/ProfileViewState;", "bindAssetBreakdown", "bindCircleChart", "bindEmptyAssetBreakdown", "bindInsights", "bindFeatureDiscovery", "featureDiscovery", "Lcom/robinhood/models/db/bonfire/FeatureDiscoveryResponse;", "bindDisclosure", "Companion", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AccountCenterBubbleView extends Hammer_AccountCenterBubbleView implements Bindable<UiTypedAccountCenterItem.BubbleItem>, BaseAccountCenterView {
    public AnalyticsLogger analytics;
    private final GenericListAdapter<ProfileAssetBreakdownItemView, AssetBreakdownItem> assetBreakdownAdapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private AccountCenterAdapter.Callbacks callbacks;
    public ProfileViewDuxo duxo;
    private final GenericListAdapter<ProfileInsightItemView, InsightItem> insightAdapter;
    public Markwon markwon;
    public Navigator navigator;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AccountCenterBubbleView.class, "binding", "getBinding()Lcom/robinhood/android/accountcenter/databinding/IncludeAccountCenterBubbleViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(UiTypedAccountCenterItem.BubbleItem state) {
        Intrinsics.checkNotNullParameter(state, "state");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountCenterBubbleView(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, AccountCenterBubbleView3.INSTANCE);
        GenericListAdapter.Companion companion = GenericListAdapter.INSTANCE;
        ProfileAssetBreakdownItemView.Companion companion2 = ProfileAssetBreakdownItemView.INSTANCE;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        this.assetBreakdownAdapter = companion.m2987of(companion2, diffCallbacks.byEquality(new PropertyReference1Impl() { // from class: com.robinhood.android.accountcenter.views.AccountCenterBubbleView$assetBreakdownAdapter$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((AssetBreakdownItem) obj).getId();
            }
        }), new Function2() { // from class: com.robinhood.android.accountcenter.views.AccountCenterBubbleView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AccountCenterBubbleView.assetBreakdownAdapter$lambda$1(this.f$0, context, (ProfileAssetBreakdownItemView) obj, (AssetBreakdownItem) obj2);
            }
        });
        this.insightAdapter = companion.m2987of(ProfileInsightItemView.INSTANCE, diffCallbacks.byEquality(new PropertyReference1Impl() { // from class: com.robinhood.android.accountcenter.views.AccountCenterBubbleView$insightAdapter$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((InsightItem) obj).getId();
            }
        }), new Function2() { // from class: com.robinhood.android.accountcenter.views.AccountCenterBubbleView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AccountCenterBubbleView.insightAdapter$lambda$3(this.f$0, context, (ProfileInsightItemView) obj, (InsightItem) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IncludeAccountCenterBubbleViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IncludeAccountCenterBubbleViewBinding) value;
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

    public final ProfileViewDuxo getDuxo() {
        ProfileViewDuxo profileViewDuxo = this.duxo;
        if (profileViewDuxo != null) {
            return profileViewDuxo;
        }
        Intrinsics.throwUninitializedPropertyAccessException("duxo");
        return null;
    }

    public final void setDuxo(ProfileViewDuxo profileViewDuxo) {
        Intrinsics.checkNotNullParameter(profileViewDuxo, "<set-?>");
        this.duxo = profileViewDuxo;
    }

    @Override // com.robinhood.android.accountcenter.views.BaseAccountCenterView
    public AccountCenterAdapter.Callbacks getCallbacks() {
        return this.callbacks;
    }

    @Override // com.robinhood.android.accountcenter.views.BaseAccountCenterView
    public void setCallbacks(AccountCenterAdapter.Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit assetBreakdownAdapter$lambda$1(final AccountCenterBubbleView accountCenterBubbleView, final Context context, final ProfileAssetBreakdownItemView of, final AssetBreakdownItem state) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(state, "state");
        of.bind(state);
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.accountcenter.views.AccountCenterBubbleView$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountCenterBubbleView.assetBreakdownAdapter$lambda$1$lambda$0(this.f$0, state, context, of);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit assetBreakdownAdapter$lambda$1$lambda$0(AccountCenterBubbleView accountCenterBubbleView, AssetBreakdownItem assetBreakdownItem, Context context, ProfileAssetBreakdownItemView profileAssetBreakdownItemView) {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(accountCenterBubbleView.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_USER_PROFILE, AnalyticsStrings.BUTTON_USER_PROFILE_SECTOR_BREAKDOWN, assetBreakdownItem.getParentId(), null, assetBreakdownItem.getId(), null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, null);
        if (assetBreakdownItem.getDeeplink() != null) {
            Navigator.DefaultImpls.handleDeepLink$default(accountCenterBubbleView.getNavigator(), context, assetBreakdownItem.getDeeplink(), Boolean.FALSE, null, false, null, 56, null);
        } else if (assetBreakdownItem.getIsOther()) {
            RhDialogFragment.Builder message = RhDialogFragment.INSTANCE.create(context).setUseDesignSystemOverlay(true).setUseParentFragmentScarletContext(true).setTitle(C8293R.string.profiles_other_asset_dialog_title, new Object[0]).setMessage(C8293R.string.profiles_other_asset_dialog_message, new Object[0]);
            FragmentManager supportFragmentManager = Views.baseActivity(profileAssetBreakdownItemView).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(message, supportFragmentManager, "otherAssetBreakdown", false, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insightAdapter$lambda$3(final AccountCenterBubbleView accountCenterBubbleView, final Context context, ProfileInsightItemView of, final InsightItem state) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(state, "state");
        of.bind(state);
        of.setOnCardClick(new Function0() { // from class: com.robinhood.android.accountcenter.views.AccountCenterBubbleView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountCenterBubbleView.insightAdapter$lambda$3$lambda$2(this.f$0, state, context);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insightAdapter$lambda$3$lambda$2(AccountCenterBubbleView accountCenterBubbleView, InsightItem insightItem, Context context) {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(accountCenterBubbleView.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_USER_PROFILE, AnalyticsStrings.BUTTON_USER_PROFILE_USER_INSIGHT, insightItem.getId(), null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
        if (insightItem.getDeeplink() != null) {
            Navigator.DefaultImpls.handleDeepLink$default(accountCenterBubbleView.getNavigator(), context, insightItem.getDeeplink(), Boolean.FALSE, null, false, null, 56, null);
        }
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getBinding().assetTabLayout.getRoot().setOnTabSelectedCallback(new C82981(this));
        getBinding().circleChartView.setOnItemClick(new C82992(this));
        getBinding().profileEmptyAssetBreakdownView.setOnCuratedListClick(new C83003(this));
        getBinding().profileEmptyAssetBreakdownView.setOnDescriptionLinkClick(new C83014(this));
        getBinding().profileAssetBreakdownRecyclerView.setAdapter(this.assetBreakdownAdapter);
        getBinding().profileAssetBreakdownRecyclerView.setItemAnimator(null);
        getBinding().profileInsightRecyclerView.setAdapter(this.insightAdapter);
        RecyclerView recyclerView = getBinding().profileInsightRecyclerView;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new ProfileInsightItemDecoration(context));
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.accountcenter.views.AccountCenterBubbleView$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountCenterBubbleView.onAttachedToWindow$lambda$4(this.f$0, (ProfileViewState) obj);
            }
        });
    }

    /* compiled from: AccountCenterBubbleView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.accountcenter.views.AccountCenterBubbleView$onAttachedToWindow$1 */
    /* synthetic */ class C82981 extends FunctionReferenceImpl implements Function1<String, Unit> {
        C82981(Object obj) {
            super(1, obj, AccountCenterBubbleView.class, "onAssetTabClick", "onAssetTabClick(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((AccountCenterBubbleView) this.receiver).onAssetTabClick(p0);
        }
    }

    /* compiled from: AccountCenterBubbleView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.accountcenter.views.AccountCenterBubbleView$onAttachedToWindow$2 */
    /* synthetic */ class C82992 extends FunctionReferenceImpl implements Function1<CircleChartView.Item, Unit> {
        C82992(Object obj) {
            super(1, obj, AccountCenterBubbleView.class, "onCircleChartItemClick", "onCircleChartItemClick(Lcom/robinhood/android/accountcenter/views/circlechart/CircleChartView$Item;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CircleChartView.Item item) {
            invoke2(item);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CircleChartView.Item p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((AccountCenterBubbleView) this.receiver).onCircleChartItemClick(p0);
        }
    }

    /* compiled from: AccountCenterBubbleView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.accountcenter.views.AccountCenterBubbleView$onAttachedToWindow$3 */
    /* synthetic */ class C83003 extends FunctionReferenceImpl implements Function2<String, UUID, Unit> {
        C83003(Object obj) {
            super(2, obj, AccountCenterBubbleView.class, "onEmptyAssetCuratedListClick", "onEmptyAssetCuratedListClick(Ljava/lang/String;Ljava/util/UUID;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, UUID uuid) {
            invoke2(str, uuid);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String p0, UUID p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            ((AccountCenterBubbleView) this.receiver).onEmptyAssetCuratedListClick(p0, p1);
        }
    }

    /* compiled from: AccountCenterBubbleView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.accountcenter.views.AccountCenterBubbleView$onAttachedToWindow$4 */
    /* synthetic */ class C83014 extends FunctionReferenceImpl implements Function2<String, Uri, Unit> {
        C83014(Object obj) {
            super(2, obj, AccountCenterBubbleView.class, "onEmptyAssetDescriptionLinkClick", "onEmptyAssetDescriptionLinkClick(Ljava/lang/String;Landroid/net/Uri;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, Uri uri) {
            invoke2(str, uri);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String p0, Uri p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            ((AccountCenterBubbleView) this.receiver).onEmptyAssetDescriptionLinkClick(p0, p1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$4(AccountCenterBubbleView accountCenterBubbleView, ProfileViewState viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        accountCenterBubbleView.bindProfileViewState(viewState);
        return Unit.INSTANCE;
    }

    public final void bind(UiTypedAccountCenterItem.BubbleItem state, SduiActionHandler<? super GenericAction> actionHandler) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        bind(state);
        bindFeatureDiscovery(state.getFeatureDiscovery(), actionHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onEmptyAssetCuratedListClick(String assetId, UUID curatedListId) {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_USER_PROFILE, AnalyticsStrings.BUTTON_USER_PROFILE_ASSET_BREAKDOWN_EMPTY_STATE_SUGGESTION, assetId, null, curatedListId.toString(), null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onEmptyAssetDescriptionLinkClick(String assetId, Uri uri) {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_USER_PROFILE, AnalyticsStrings.BUTTON_USER_PROFILE_ASSET_BREAKDOWN_EMPTY_STATE_LEARN_MORE, assetId, null, uri.toString(), null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAssetTabClick(String assetId) {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_USER_PROFILE, AnalyticsStrings.BUTTON_USER_PROFILE_ASSET_BREAKDOWN_SEGMENTED_CONTROL, assetId, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
        getDuxo().selectAsset(assetId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCircleChartItemClick(CircleChartView.Item item) {
        getDuxo().selectAsset(item.getId());
    }

    private final void bindProfileViewState(ProfileViewState viewState) {
        bindCircleChart(viewState);
        bindEmptyAssetBreakdown(viewState);
        bindAssetBreakdown(viewState);
        bindInsights(viewState);
        bindDisclosure(viewState);
        ProfileAccountBreakdownState profileAccountBreakdownState = viewState.getProfileAccountBreakdownState();
        if (profileAccountBreakdownState != null) {
            getBinding().profileAccountBreakdownView.bind(profileAccountBreakdownState);
        }
    }

    private final void bindAssetBreakdown(ProfileViewState viewState) {
        AssetBreakdown activeAssetBreakdown;
        SpannableString spannableString$default;
        RichText description;
        RhTextView profileAssetBreakdownDescriptionTxt = getBinding().profileAssetBreakdownDescriptionTxt;
        Intrinsics.checkNotNullExpressionValue(profileAssetBreakdownDescriptionTxt, "profileAssetBreakdownDescriptionTxt");
        profileAssetBreakdownDescriptionTxt.setVisibility(viewState.getShowAssetBreakdownDescription() ? 0 : 8);
        RhTextView profileAssetBreakdownDescriptionTxt2 = getBinding().profileAssetBreakdownDescriptionTxt;
        Intrinsics.checkNotNullExpressionValue(profileAssetBreakdownDescriptionTxt2, "profileAssetBreakdownDescriptionTxt");
        if (profileAssetBreakdownDescriptionTxt2.getVisibility() == 0) {
            RhTextView rhTextView = getBinding().profileAssetBreakdownDescriptionTxt;
            AssetBreakdown activeAssetBreakdown2 = viewState.getActiveAssetBreakdown();
            if (activeAssetBreakdown2 == null || (description = activeAssetBreakdown2.getDescription()) == null) {
                spannableString$default = null;
            } else {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                spannableString$default = RichTexts.toSpannableString$default(description, context, null, false, null, 14, null);
            }
            rhTextView.setText(spannableString$default);
        }
        RecyclerView profileAssetBreakdownRecyclerView = getBinding().profileAssetBreakdownRecyclerView;
        Intrinsics.checkNotNullExpressionValue(profileAssetBreakdownRecyclerView, "profileAssetBreakdownRecyclerView");
        boolean z = profileAssetBreakdownRecyclerView.getVisibility() == 0;
        RecyclerView profileAssetBreakdownRecyclerView2 = getBinding().profileAssetBreakdownRecyclerView;
        Intrinsics.checkNotNullExpressionValue(profileAssetBreakdownRecyclerView2, "profileAssetBreakdownRecyclerView");
        profileAssetBreakdownRecyclerView2.setVisibility(viewState.getShowAssetBreakdownList() ? 0 : 8);
        if (viewState.getShowAssetBreakdownList() && (activeAssetBreakdown = viewState.getActiveAssetBreakdown()) != null) {
            this.assetBreakdownAdapter.submitList(activeAssetBreakdown.getItems());
        }
        if (z) {
            return;
        }
        RecyclerView profileAssetBreakdownRecyclerView3 = getBinding().profileAssetBreakdownRecyclerView;
        Intrinsics.checkNotNullExpressionValue(profileAssetBreakdownRecyclerView3, "profileAssetBreakdownRecyclerView");
        if (profileAssetBreakdownRecyclerView3.getVisibility() == 0) {
            getBinding().profileAssetBreakdownRecyclerView.setMinimumHeight(getBinding().profileEmptyAssetBreakdownView.getMeasuredHeight());
            RecyclerView profileAssetBreakdownRecyclerView4 = getBinding().profileAssetBreakdownRecyclerView;
            Intrinsics.checkNotNullExpressionValue(profileAssetBreakdownRecyclerView4, "profileAssetBreakdownRecyclerView");
            if (!profileAssetBreakdownRecyclerView4.isLaidOut() || profileAssetBreakdownRecyclerView4.isLayoutRequested()) {
                profileAssetBreakdownRecyclerView4.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.robinhood.android.accountcenter.views.AccountCenterBubbleView$bindAssetBreakdown$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        view.removeOnLayoutChangeListener(this);
                        this.this$0.getBinding().profileAssetBreakdownRecyclerView.setMinimumHeight(0);
                    }
                });
            } else {
                getBinding().profileAssetBreakdownRecyclerView.setMinimumHeight(0);
            }
        }
    }

    private final void bindCircleChart(ProfileViewState viewState) {
        ProfileAssetTabLayout root = getBinding().assetTabLayout.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        root.setVisibility(viewState.getShowAssetTabs() ? 0 : 8);
        AssetTabsState assetTabsState = viewState.getAssetTabsState();
        if (assetTabsState != null) {
            getBinding().assetTabLayout.getRoot().bind(assetTabsState);
        }
        RhTextView profileCircleChartHeaderTxt = getBinding().profileCircleChartHeaderTxt;
        Intrinsics.checkNotNullExpressionValue(profileCircleChartHeaderTxt, "profileCircleChartHeaderTxt");
        profileCircleChartHeaderTxt.setVisibility(viewState.getShowCircleChartHeader() ? 0 : 8);
        CircleChartView circleChartView = getBinding().circleChartView;
        Intrinsics.checkNotNullExpressionValue(circleChartView, "circleChartView");
        circleChartView.setVisibility(viewState.getShowCircleChart() ? 0 : 8);
        AssetBreakdownCircleChartState circleChartState = viewState.getCircleChartState();
        if (circleChartState != null) {
            getBinding().profileCircleChartHeaderTxt.setText(circleChartState.getHeaderText());
            CircleChartView circleChartView2 = getBinding().circleChartView;
            List<AssetBreakdownCircleChartState.Item> items = circleChartState.getItems();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
            for (AssetBreakdownCircleChartState.Item item : items) {
                arrayList.add(new CircleChartView.Item(item.getId(), item.getTitle(), item.getPercentage(), item.getDisplayPercentage(), item.getSelected()));
            }
            circleChartView2.setData(arrayList);
        }
    }

    private final void bindEmptyAssetBreakdown(ProfileViewState viewState) {
        EmptyAssetBreakdownState emptyBreakdownState;
        ProfileEmptyAssetBreakdownView profileEmptyAssetBreakdownView = getBinding().profileEmptyAssetBreakdownView;
        Intrinsics.checkNotNullExpressionValue(profileEmptyAssetBreakdownView, "profileEmptyAssetBreakdownView");
        profileEmptyAssetBreakdownView.setVisibility(viewState.getShowEmptyAssetBreakdownView() ? 0 : 8);
        AssetBreakdown activeAssetBreakdown = viewState.getActiveAssetBreakdown();
        if (activeAssetBreakdown == null || (emptyBreakdownState = activeAssetBreakdown.getEmptyBreakdownState()) == null) {
            return;
        }
        getBinding().profileEmptyAssetBreakdownView.bind(emptyBreakdownState);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private final void bindInsights(final ProfileViewState viewState) {
        RhTextView profileInsightListHeaderTxt = getBinding().profileInsightListHeaderTxt;
        Intrinsics.checkNotNullExpressionValue(profileInsightListHeaderTxt, "profileInsightListHeaderTxt");
        profileInsightListHeaderTxt.setVisibility(viewState.getShowInsightListHeader() ? 0 : 8);
        ImageView profileInsightListHeaderInfoImg = getBinding().profileInsightListHeaderInfoImg;
        Intrinsics.checkNotNullExpressionValue(profileInsightListHeaderInfoImg, "profileInsightListHeaderInfoImg");
        profileInsightListHeaderInfoImg.setVisibility(viewState.getShowInsightListHeaderInfoIcon() ? 0 : 8);
        ImageView profileInsightListHeaderInfoImg2 = getBinding().profileInsightListHeaderInfoImg;
        Intrinsics.checkNotNullExpressionValue(profileInsightListHeaderInfoImg2, "profileInsightListHeaderInfoImg");
        if (profileInsightListHeaderInfoImg2.getVisibility() == 0) {
            ImageView profileInsightListHeaderInfoImg3 = getBinding().profileInsightListHeaderInfoImg;
            Intrinsics.checkNotNullExpressionValue(profileInsightListHeaderInfoImg3, "profileInsightListHeaderInfoImg");
            OnClickListeners.onClick(profileInsightListHeaderInfoImg3, new Function0() { // from class: com.robinhood.android.accountcenter.views.AccountCenterBubbleView$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountCenterBubbleView.bindInsights$lambda$12(this.f$0, viewState);
                }
            });
        }
        RecyclerView profileInsightRecyclerView = getBinding().profileInsightRecyclerView;
        Intrinsics.checkNotNullExpressionValue(profileInsightRecyclerView, "profileInsightRecyclerView");
        profileInsightRecyclerView.setVisibility(viewState.getShowInsightList() ? 0 : 8);
        InsightListState insightListState = viewState.getInsightListState();
        if (insightListState != null) {
            getBinding().profileInsightListHeaderTxt.setText(insightListState.getDisplayText());
            this.insightAdapter.submitList(insightListState.getInsightList());
            this.insightAdapter.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindInsights$lambda$12(AccountCenterBubbleView accountCenterBubbleView, ProfileViewState profileViewState) {
        Context context = accountCenterBubbleView.getContext();
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Intrinsics.checkNotNull(context);
        RhDialogFragment.Builder useParentFragmentScarletContext = companion.create(context).setUseDesignSystemOverlay(true).setUseParentFragmentScarletContext(true);
        InsightListState insightListState = profileViewState.getInsightListState();
        Intrinsics.checkNotNull(insightListState);
        RichText infoDisplayTitle = insightListState.getInfoDisplayTitle();
        RhDialogFragment.Builder title = useParentFragmentScarletContext.setTitle(infoDisplayTitle != null ? RichTexts.toSpannableString$default(infoDisplayTitle, context, null, false, null, 14, null) : null);
        InsightListState insightListState2 = profileViewState.getInsightListState();
        Intrinsics.checkNotNull(insightListState2);
        RichText infoDisplayDescription = insightListState2.getInfoDisplayDescription();
        RhDialogFragment.Builder message = title.setMessage(infoDisplayDescription != null ? RichTexts.toSpannableString$default(infoDisplayDescription, context, null, false, null, 14, null) : null);
        FragmentManager supportFragmentManager = Views.baseActivity(accountCenterBubbleView).getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(message, supportFragmentManager, "insightInfo", false, 4, null);
        return Unit.INSTANCE;
    }

    private final void bindFeatureDiscovery(FeatureDiscoveryResponse featureDiscovery, SduiActionHandler<? super GenericAction> actionHandler) {
        if (featureDiscovery != null) {
            getBinding().profileFeatureDiscovery.bind(featureDiscovery, actionHandler);
            FeatureDiscoveryWidgetView profileFeatureDiscovery = getBinding().profileFeatureDiscovery;
            Intrinsics.checkNotNullExpressionValue(profileFeatureDiscovery, "profileFeatureDiscovery");
            profileFeatureDiscovery.setVisibility(0);
        }
    }

    private final void bindDisclosure(ProfileViewState viewState) {
        RhTextView profileDisclosureTxt = getBinding().profileDisclosureTxt;
        Intrinsics.checkNotNullExpressionValue(profileDisclosureTxt, "profileDisclosureTxt");
        profileDisclosureTxt.setVisibility(viewState.getShowDisclosure() ? 0 : 8);
        RhTextView rhTextView = getBinding().profileDisclosureTxt;
        MarkdownContent disclosure = viewState.getDisclosure();
        CharSequence disclosure2 = null;
        if (disclosure != null) {
            SpannableString spannableString = new SpannableString(Markwons.toSpanned$default(getMarkwon(), disclosure, null, 2, null));
            DisclosureUtil disclosureUtil = DisclosureUtil.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            disclosure2 = disclosureUtil.getDisclosure(context, spannableString, viewState.getCanAppendToggleText(), viewState.getExpandDisclosure(), getResources().getString(C8293R.string.profile_disclosure_see_less), getResources().getString(C8293R.string.profile_disclosure_see_more), new Function0() { // from class: com.robinhood.android.accountcenter.views.AccountCenterBubbleView$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountCenterBubbleView.bindDisclosure$lambda$16$lambda$15(this.f$0);
                }
            });
        }
        rhTextView.setText(disclosure2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindDisclosure$lambda$16$lambda$15(AccountCenterBubbleView accountCenterBubbleView) {
        accountCenterBubbleView.getDuxo().toggleDisclosureState();
        return Unit.INSTANCE;
    }

    /* compiled from: AccountCenterBubbleView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/AccountCenterBubbleView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/accountcenter/views/AccountCenterBubbleView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<AccountCenterBubbleView> {
        private final /* synthetic */ Inflater<AccountCenterBubbleView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public AccountCenterBubbleView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (AccountCenterBubbleView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C8293R.layout.include_account_center_bubble_view);
        }
    }
}
