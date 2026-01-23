package com.robinhood.android.accountcenter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.accountcenter.views.AccountCenterAccountTotalView;
import com.robinhood.android.accountcenter.views.AccountCenterAddAccountView;
import com.robinhood.android.accountcenter.views.AccountCenterBannerView;
import com.robinhood.android.accountcenter.views.AccountCenterBubbleView;
import com.robinhood.android.accountcenter.views.AccountCenterCollapsedSectionView;
import com.robinhood.android.accountcenter.views.AccountCenterCreditAppBannerView;
import com.robinhood.android.accountcenter.views.AccountCenterDividerView;
import com.robinhood.android.accountcenter.views.AccountCenterErrorView;
import com.robinhood.android.accountcenter.views.AccountCenterLoadingView;
import com.robinhood.android.accountcenter.views.AccountCenterMarkdownView;
import com.robinhood.android.accountcenter.views.AccountCenterProfileHeaderView;
import com.robinhood.android.accountcenter.views.AccountCenterSectionHeaderView;
import com.robinhood.android.accountcenter.views.AccountCenterSpacerView;
import com.robinhood.android.accountcenter.views.AccountCenterUpsellBannerView;
import com.robinhood.android.accountcenter.views.AccountCenterValueView;
import com.robinhood.android.accountcenter.views.BaseAccountCenterView;
import com.robinhood.android.instant.p160ui.InstantRetirementAgreementComponents;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.models.accountcenter.p183ui.UiTypedAccountCenterItem;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.shared.feature.discovery.p382ui.FeatureDiscoveryWidgetView;
import com.robinhood.test.idler.TrackedListAdapter;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountCenterAdapter.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0002\u001c\u001dB\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rH\u0016J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0016\u0010\u0017\u001a\u00020\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u001e\u0010\u0019\u001a\u00020\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001a\u001a\u00020\u0016H\u0017J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0016H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/AccountCenterAdapter;", "Lcom/robinhood/test/idler/TrackedListAdapter;", "Lcom/robinhood/android/models/accountcenter/ui/UiTypedAccountCenterItem;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", "Landroid/view/View;", "callbacks", "Lcom/robinhood/android/accountcenter/AccountCenterAdapter$Callbacks;", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(Lcom/robinhood/android/accountcenter/AccountCenterAdapter$Callbacks;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;)V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "isFxTooltipVisible", "", "onAttachedToRecyclerView", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onViewRecycled", "holder", "onBindViewHolder", "position", "getItemViewType", "Callbacks", "ViewType", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AccountCenterAdapter extends TrackedListAdapter<UiTypedAccountCenterItem, GenericViewHolder<? extends View>> {
    public static final int $stable = 8;
    private final SduiActionHandler<GenericAction> actionHandler;
    private final Callbacks callbacks;
    private boolean isFxTooltipVisible;
    private RecyclerView recyclerView;

    /* compiled from: AccountCenterAdapter.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/AccountCenterAdapter$Callbacks;", "", "onInfoImageClicked", "", InstantRetirementAgreementComponents.MarkdownTag, "", "onBannerClicked", "action", "Lcom/robinhood/models/serverdriven/db/GenericAction;", "onValueTextClicked", "onProfilePictureClicked", "accountCenterProfileHeaderView", "Lcom/robinhood/android/accountcenter/views/AccountCenterProfileHeaderView;", "onErrorActionClicked", "onUsernameClicked", "onCollapsedSectionClicked", "collapsedSectionItem", "Lcom/robinhood/android/models/accountcenter/ui/UiTypedAccountCenterItem$CollapsedSectionItem;", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onBannerClicked(com.robinhood.models.serverdriven.p347db.GenericAction action);

        void onCollapsedSectionClicked(UiTypedAccountCenterItem.CollapsedSectionItem collapsedSectionItem);

        void onErrorActionClicked();

        void onInfoImageClicked(String markdown);

        void onProfilePictureClicked(AccountCenterProfileHeaderView accountCenterProfileHeaderView);

        void onUsernameClicked();

        void onValueTextClicked(com.robinhood.models.serverdriven.p347db.GenericAction action);
    }

    /* compiled from: AccountCenterAdapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ViewType.values().length];
            try {
                iArr[ViewType.VIEW_TYPE_PROFILE_HEADER_ITEM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ViewType.VIEW_TYPE_REFERRAL_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ViewType.VIEW_TYPE_ACCOUNT_TOTAL_ITEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ViewType.VIEW_TYPE_ADD_ACCOUNT_ITEM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ViewType.VIEW_TYPE_ACCOUNT_DIVIDER_ITEM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ViewType.VIEW_TYPE_COLLAPSED_SECTION_ITEM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ViewType.VIEW_TYPE_SECTION_HEADER_ITEM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ViewType.VIEW_TYPE_VALUE_ITEM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ViewType.VIEW_TYPE_MARKDOWN_ITEM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ViewType.VIEW_TYPE_BANNER_ITEM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ViewType.VIEW_TYPE_BUBBLE_ITEM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ViewType.VIEW_TYPE_FEATURE_DISCOVERY_ITEM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ViewType.VIEW_TYPE_CREDIT_APP_INVITE_ITEM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ViewType.VIEW_TYPE_ACCOUNT_SPACER_ITEM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ViewType.VIEW_TYPE_ERROR_ITEM.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ViewType.VIEW_TYPE_LOADING_ITEM.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AccountCenterAdapter(Callbacks callbacks, SduiActionHandler<? super GenericAction> actionHandler) {
        super(DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterAdapter$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountCenterAdapter._init_$lambda$0((UiTypedAccountCenterItem) obj);
            }
        }));
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.callbacks = callbacks;
        this.actionHandler = actionHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object _init_$lambda$0(UiTypedAccountCenterItem byEquality) {
        Intrinsics.checkNotNullParameter(byEquality, "$this$byEquality");
        return byEquality.getId();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.recyclerView = recyclerView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public GenericViewHolder<View> onCreateViewHolder(ViewGroup parent, int viewType) {
        View viewInflate;
        View accountCenterUpsellBannerView;
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i = 2;
        AttributeSet attributeSet = null;
        Object[] objArr = 0;
        switch (WhenMappings.$EnumSwitchMapping$0[ViewType.getEntries().get(viewType).ordinal()]) {
            case 1:
                viewInflate = AccountCenterProfileHeaderView.INSTANCE.inflate(parent);
                return new GenericViewHolder<>(viewInflate);
            case 2:
                Context context = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                accountCenterUpsellBannerView = new AccountCenterUpsellBannerView(context, attributeSet, i, objArr == true ? 1 : 0);
                viewInflate = accountCenterUpsellBannerView;
                return new GenericViewHolder<>(viewInflate);
            case 3:
                viewInflate = AccountCenterAccountTotalView.INSTANCE.inflate(parent);
                return new GenericViewHolder<>(viewInflate);
            case 4:
                viewInflate = AccountCenterAddAccountView.INSTANCE.inflate(parent);
                return new GenericViewHolder<>(viewInflate);
            case 5:
                viewInflate = AccountCenterDividerView.INSTANCE.inflate(parent);
                return new GenericViewHolder<>(viewInflate);
            case 6:
                Context context2 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                accountCenterUpsellBannerView = new AccountCenterCollapsedSectionView(context2, null, 2, null);
                viewInflate = accountCenterUpsellBannerView;
                return new GenericViewHolder<>(viewInflate);
            case 7:
                viewInflate = AccountCenterSectionHeaderView.INSTANCE.inflate(parent);
                return new GenericViewHolder<>(viewInflate);
            case 8:
                viewInflate = AccountCenterValueView.INSTANCE.inflate(parent);
                return new GenericViewHolder<>(viewInflate);
            case 9:
                viewInflate = AccountCenterMarkdownView.INSTANCE.inflate(parent);
                return new GenericViewHolder<>(viewInflate);
            case 10:
                Context context3 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                accountCenterUpsellBannerView = new AccountCenterBannerView(context3, null, 2, null);
                viewInflate = accountCenterUpsellBannerView;
                return new GenericViewHolder<>(viewInflate);
            case 11:
                viewInflate = AccountCenterBubbleView.INSTANCE.inflate(parent);
                return new GenericViewHolder<>(viewInflate);
            case 12:
                viewInflate = FeatureDiscoveryWidgetView.INSTANCE.inflate(parent);
                return new GenericViewHolder<>(viewInflate);
            case 13:
                Context context4 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                accountCenterUpsellBannerView = new AccountCenterCreditAppBannerView(context4, null, 2, null);
                viewInflate = accountCenterUpsellBannerView;
                return new GenericViewHolder<>(viewInflate);
            case 14:
                viewInflate = AccountCenterSpacerView.INSTANCE.inflate(parent);
                return new GenericViewHolder<>(viewInflate);
            case 15:
                viewInflate = AccountCenterErrorView.INSTANCE.inflate(parent);
                return new GenericViewHolder<>(viewInflate);
            case 16:
                viewInflate = AccountCenterLoadingView.INSTANCE.inflate(parent);
                return new GenericViewHolder<>(viewInflate);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(GenericViewHolder<? extends View> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewRecycled((AccountCenterAdapter) holder);
        if (ViewType.getEntries().get(holder.getItemViewType()) == ViewType.VIEW_TYPE_CREDIT_APP_INVITE_ITEM) {
            View view = holder.getView();
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.accountcenter.views.AccountCenterCreditAppBannerView");
            ((AccountCenterCreditAppBannerView) view).disposeComposition();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @SuppressLint({"SuspiciousIndentation"})
    public void onBindViewHolder(GenericViewHolder<? extends View> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        View view = holder.getView();
        if (view instanceof FeatureDiscoveryWidgetView) {
            UiTypedAccountCenterItem item = getItem(position);
            Intrinsics.checkNotNull(item, "null cannot be cast to non-null type com.robinhood.android.models.accountcenter.ui.UiTypedAccountCenterItem.FeatureDiscovery");
            View view2 = holder.getView();
            Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type com.robinhood.shared.feature.discovery.ui.FeatureDiscoveryWidgetView");
            ((FeatureDiscoveryWidgetView) view2).bind(((UiTypedAccountCenterItem.FeatureDiscovery) item).getContent(), this.actionHandler);
            return;
        }
        if (view instanceof AccountCenterBubbleView) {
            UiTypedAccountCenterItem item2 = getItem(position);
            Intrinsics.checkNotNull(item2, "null cannot be cast to non-null type com.robinhood.android.models.accountcenter.ui.UiTypedAccountCenterItem.BubbleItem");
            View view3 = holder.getView();
            Intrinsics.checkNotNull(view3, "null cannot be cast to non-null type com.robinhood.android.accountcenter.views.AccountCenterBubbleView");
            ((AccountCenterBubbleView) view3).bind((UiTypedAccountCenterItem.BubbleItem) item2, this.actionHandler);
            return;
        }
        if (view instanceof AccountCenterAccountTotalView) {
            UiTypedAccountCenterItem item3 = getItem(position);
            Intrinsics.checkNotNull(item3, "null cannot be cast to non-null type com.robinhood.android.models.accountcenter.ui.UiTypedAccountCenterItem.AccountTotalItem");
            UiTypedAccountCenterItem.AccountTotalItem accountTotalItemCopy$default = UiTypedAccountCenterItem.AccountTotalItem.copy$default((UiTypedAccountCenterItem.AccountTotalItem) item3, null, null, false, this.isFxTooltipVisible, new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterAdapter$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AccountCenterAdapter.onBindViewHolder$lambda$1(this.f$0, ((Boolean) obj).booleanValue());
                }
            }, 7, null);
            View view4 = holder.getView();
            Intrinsics.checkNotNull(view4, "null cannot be cast to non-null type com.robinhood.android.accountcenter.views.AccountCenterAccountTotalView");
            ((AccountCenterAccountTotalView) view4).bind(accountTotalItemCopy$default);
            return;
        }
        if (view instanceof AccountCenterAddAccountView) {
            UiTypedAccountCenterItem item4 = getItem(position);
            Intrinsics.checkNotNull(item4, "null cannot be cast to non-null type com.robinhood.android.models.accountcenter.ui.UiTypedAccountCenterItem.AddAccount");
            View view5 = holder.getView();
            Intrinsics.checkNotNull(view5, "null cannot be cast to non-null type com.robinhood.android.accountcenter.views.AccountCenterAddAccountView");
            ((AccountCenterAddAccountView) view5).bind((UiTypedAccountCenterItem.AddAccount) item4, this.actionHandler);
            return;
        }
        KeyEvent.Callback view6 = holder.getView();
        Intrinsics.checkNotNull(view6, "null cannot be cast to non-null type com.robinhood.utils.ui.view.Bindable<com.robinhood.android.models.accountcenter.ui.UiTypedAccountCenterItem>");
        UiTypedAccountCenterItem item5 = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item5, "getItem(...)");
        ((Bindable) view6).bind(item5);
        KeyEvent.Callback view7 = holder.getView();
        RecyclerView recyclerView = null;
        BaseAccountCenterView baseAccountCenterView = view7 instanceof BaseAccountCenterView ? (BaseAccountCenterView) view7 : null;
        if (baseAccountCenterView != null) {
            baseAccountCenterView.setCallbacks(this.callbacks);
        }
        View view8 = holder.getView();
        AccountCenterErrorView accountCenterErrorView = view8 instanceof AccountCenterErrorView ? (AccountCenterErrorView) view8 : null;
        if (accountCenterErrorView != null) {
            RecyclerView recyclerView2 = this.recyclerView;
            if (recyclerView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            } else {
                recyclerView = recyclerView2;
            }
            accountCenterErrorView.resize(recyclerView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$1(AccountCenterAdapter accountCenterAdapter, boolean z) {
        accountCenterAdapter.isFxTooltipVisible = z;
        return Unit.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        UiTypedAccountCenterItem item = getItem(position);
        if (item instanceof UiTypedAccountCenterItem.ProfileHeaderItem) {
            return ViewType.VIEW_TYPE_PROFILE_HEADER_ITEM.ordinal();
        }
        if (item instanceof UiTypedAccountCenterItem.ReferralBanner) {
            return ViewType.VIEW_TYPE_REFERRAL_CARD.ordinal();
        }
        if (item instanceof UiTypedAccountCenterItem.AccountTotalItem) {
            return ViewType.VIEW_TYPE_ACCOUNT_TOTAL_ITEM.ordinal();
        }
        if (item instanceof UiTypedAccountCenterItem.AddAccount) {
            return ViewType.VIEW_TYPE_ADD_ACCOUNT_ITEM.ordinal();
        }
        if (item instanceof UiTypedAccountCenterItem.DividerItem) {
            return ViewType.VIEW_TYPE_ACCOUNT_DIVIDER_ITEM.ordinal();
        }
        if (item instanceof UiTypedAccountCenterItem.CollapsedSectionItem) {
            return ViewType.VIEW_TYPE_COLLAPSED_SECTION_ITEM.ordinal();
        }
        if (item instanceof UiTypedAccountCenterItem.SectionHeaderItem) {
            return ViewType.VIEW_TYPE_SECTION_HEADER_ITEM.ordinal();
        }
        if (item instanceof UiTypedAccountCenterItem.ValueItem) {
            return ViewType.VIEW_TYPE_VALUE_ITEM.ordinal();
        }
        if (item instanceof UiTypedAccountCenterItem.InfoBannerItem) {
            return ViewType.VIEW_TYPE_BANNER_ITEM.ordinal();
        }
        if (item instanceof UiTypedAccountCenterItem.MarkdownItem) {
            return ViewType.VIEW_TYPE_MARKDOWN_ITEM.ordinal();
        }
        if (item instanceof UiTypedAccountCenterItem.BubbleItem) {
            return ViewType.VIEW_TYPE_BUBBLE_ITEM.ordinal();
        }
        if (item instanceof UiTypedAccountCenterItem.FeatureDiscovery) {
            return ViewType.VIEW_TYPE_FEATURE_DISCOVERY_ITEM.ordinal();
        }
        if (item instanceof UiTypedAccountCenterItem.CreditAppInviteBanner) {
            return ViewType.VIEW_TYPE_CREDIT_APP_INVITE_ITEM.ordinal();
        }
        if (item instanceof UiTypedAccountCenterItem.SpacerItem) {
            return ViewType.VIEW_TYPE_ACCOUNT_SPACER_ITEM.ordinal();
        }
        if (item instanceof UiTypedAccountCenterItem.ErrorItem) {
            return ViewType.VIEW_TYPE_ERROR_ITEM.ordinal();
        }
        if (item instanceof UiTypedAccountCenterItem.LoadingItem) {
            return ViewType.VIEW_TYPE_LOADING_ITEM.ordinal();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AccountCenterAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/AccountCenterAdapter$ViewType;", "", "<init>", "(Ljava/lang/String;I)V", "VIEW_TYPE_PROFILE_HEADER_ITEM", "VIEW_TYPE_REFERRAL_CARD", "VIEW_TYPE_ACCOUNT_TOTAL_ITEM", "VIEW_TYPE_ADD_ACCOUNT_ITEM", "VIEW_TYPE_ACCOUNT_DIVIDER_ITEM", "VIEW_TYPE_COLLAPSED_SECTION_ITEM", "VIEW_TYPE_SECTION_HEADER_ITEM", "VIEW_TYPE_VALUE_ITEM", "VIEW_TYPE_MARKDOWN_ITEM", "VIEW_TYPE_BANNER_ITEM", "VIEW_TYPE_BUBBLE_ITEM", "VIEW_TYPE_ACCOUNT_SPACER_ITEM", "VIEW_TYPE_FEATURE_DISCOVERY_ITEM", "VIEW_TYPE_CREDIT_APP_INVITE_ITEM", "VIEW_TYPE_ERROR_ITEM", "VIEW_TYPE_LOADING_ITEM", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ViewType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;
        public static final ViewType VIEW_TYPE_PROFILE_HEADER_ITEM = new ViewType("VIEW_TYPE_PROFILE_HEADER_ITEM", 0);
        public static final ViewType VIEW_TYPE_REFERRAL_CARD = new ViewType("VIEW_TYPE_REFERRAL_CARD", 1);
        public static final ViewType VIEW_TYPE_ACCOUNT_TOTAL_ITEM = new ViewType("VIEW_TYPE_ACCOUNT_TOTAL_ITEM", 2);
        public static final ViewType VIEW_TYPE_ADD_ACCOUNT_ITEM = new ViewType("VIEW_TYPE_ADD_ACCOUNT_ITEM", 3);
        public static final ViewType VIEW_TYPE_ACCOUNT_DIVIDER_ITEM = new ViewType("VIEW_TYPE_ACCOUNT_DIVIDER_ITEM", 4);
        public static final ViewType VIEW_TYPE_COLLAPSED_SECTION_ITEM = new ViewType("VIEW_TYPE_COLLAPSED_SECTION_ITEM", 5);
        public static final ViewType VIEW_TYPE_SECTION_HEADER_ITEM = new ViewType("VIEW_TYPE_SECTION_HEADER_ITEM", 6);
        public static final ViewType VIEW_TYPE_VALUE_ITEM = new ViewType("VIEW_TYPE_VALUE_ITEM", 7);
        public static final ViewType VIEW_TYPE_MARKDOWN_ITEM = new ViewType("VIEW_TYPE_MARKDOWN_ITEM", 8);
        public static final ViewType VIEW_TYPE_BANNER_ITEM = new ViewType("VIEW_TYPE_BANNER_ITEM", 9);
        public static final ViewType VIEW_TYPE_BUBBLE_ITEM = new ViewType("VIEW_TYPE_BUBBLE_ITEM", 10);
        public static final ViewType VIEW_TYPE_ACCOUNT_SPACER_ITEM = new ViewType("VIEW_TYPE_ACCOUNT_SPACER_ITEM", 11);
        public static final ViewType VIEW_TYPE_FEATURE_DISCOVERY_ITEM = new ViewType("VIEW_TYPE_FEATURE_DISCOVERY_ITEM", 12);
        public static final ViewType VIEW_TYPE_CREDIT_APP_INVITE_ITEM = new ViewType("VIEW_TYPE_CREDIT_APP_INVITE_ITEM", 13);
        public static final ViewType VIEW_TYPE_ERROR_ITEM = new ViewType("VIEW_TYPE_ERROR_ITEM", 14);
        public static final ViewType VIEW_TYPE_LOADING_ITEM = new ViewType("VIEW_TYPE_LOADING_ITEM", 15);

        private static final /* synthetic */ ViewType[] $values() {
            return new ViewType[]{VIEW_TYPE_PROFILE_HEADER_ITEM, VIEW_TYPE_REFERRAL_CARD, VIEW_TYPE_ACCOUNT_TOTAL_ITEM, VIEW_TYPE_ADD_ACCOUNT_ITEM, VIEW_TYPE_ACCOUNT_DIVIDER_ITEM, VIEW_TYPE_COLLAPSED_SECTION_ITEM, VIEW_TYPE_SECTION_HEADER_ITEM, VIEW_TYPE_VALUE_ITEM, VIEW_TYPE_MARKDOWN_ITEM, VIEW_TYPE_BANNER_ITEM, VIEW_TYPE_BUBBLE_ITEM, VIEW_TYPE_ACCOUNT_SPACER_ITEM, VIEW_TYPE_FEATURE_DISCOVERY_ITEM, VIEW_TYPE_CREDIT_APP_INVITE_ITEM, VIEW_TYPE_ERROR_ITEM, VIEW_TYPE_LOADING_ITEM};
        }

        public static EnumEntries<ViewType> getEntries() {
            return $ENTRIES;
        }

        private ViewType(String str, int i) {
        }

        static {
            ViewType[] viewTypeArr$values = $values();
            $VALUES = viewTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(viewTypeArr$values);
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) $VALUES.clone();
        }
    }
}
