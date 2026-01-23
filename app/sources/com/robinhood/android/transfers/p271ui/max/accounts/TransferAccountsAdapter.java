package com.robinhood.android.transfers.p271ui.max.accounts;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.SimpleViewHolder;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.text.ThemableColorSpans3;
import com.robinhood.android.history.p153ui.MerchantRewardDetailComposable;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.models.retirement.p194db.MatchRateBreakdown;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.contracts.TransferAccountDirection;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.android.transfers.p271ui.max.accounts.TransferAccountsAdapter;
import com.robinhood.android.transfers.p271ui.max.accounts.TransferAccountsViewState;
import com.robinhood.android.transfers.p271ui.max.createtransfer.MatchaDisplayInfo;
import com.robinhood.android.transfers.util.LoggingUtils8;
import com.robinhood.android.transfers.util.Selections2;
import com.robinhood.common.strings.C32428R;
import com.robinhood.models.api.ApiIacInfoBanner;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.IraContributionType;
import com.robinhood.models.api.bonfire.transfer.banner.ApiTransferBanner;
import com.robinhood.models.api.bonfire.transfer.banner.ApiTransferBannerMetadata;
import com.robinhood.models.api.bonfire.transfer.banner.TransferBannerType;
import com.robinhood.models.api.bonfire.wires.RecipientType;
import com.robinhood.models.p320db.IacInfoBanner;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.rosetta.converters.cash.Transfers;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.MAXTransferAccountSelectionContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.iac.extensions.IacInfoBanners;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TransferAccountsAdapter.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004!\"#$B7\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u000e\u0010\f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001bH\u0016J\u0010\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsAdapter$RowItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "callbacks", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsAdapter$Callbacks;", "showAccountIcons", "", "direction", "Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "<init>", "(Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsAdapter$Callbacks;ZLcom/robinhood/android/transfers/contracts/TransferAccountDirection;Lcom/robinhood/rosetta/eventlogging/Context;)V", "selectedItemId", "", "getSelectedItemId", "()Ljava/lang/String;", "setSelectedItemId", "(Ljava/lang/String;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "getItemViewType", "Callbacks", "RowItem", "AccountViewHolder", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class TransferAccountsAdapter extends ListAdapter<RowItem, RecyclerView.ViewHolder> {
    private static final int VIEW_TYPE_ACCOUNT = 0;
    private static final int VIEW_TYPE_ADD_ACCOUNT = 3;
    private static final int VIEW_TYPE_BANNER = 2;
    private static final int VIEW_TYPE_HEADER = 1;
    private static final int VIEW_TYPE_UK_ADD_ACCOUNT = 4;
    private final Callbacks callbacks;
    private final TransferAccountDirection direction;
    private final Context eventContext;
    private final EventLogger eventLogger;
    private String selectedItemId;
    private final boolean showAccountIcons;
    public static final int $stable = 8;

    /* compiled from: TransferAccountsAdapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsAdapter$Callbacks;", "", "onSelectionChanged", "", "account", "Lcom/robinhood/models/db/bonfire/TransferAccount;", CreateTransferDuxo.SAVED_STATE_OUTGOING_WIRE_RECIPIENT_TYPE, "Lcom/robinhood/models/api/bonfire/wires/RecipientType;", "onAddAccountClicked", "onDeleteAccount", "onBannerClicked", "genericAction", "Lcom/robinhood/models/serverdriven/db/GenericAction;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAddAccountClicked(RecipientType outgoingWireRecipientType);

        void onBannerClicked(GenericAction genericAction);

        void onDeleteAccount(TransferAccount account);

        void onSelectionChanged(TransferAccount account, RecipientType outgoingWireRecipientType);
    }

    /* compiled from: TransferAccountsAdapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferBannerType.values().length];
            try {
                iArr[TransferBannerType.DCF_DYNAMIC_CODE_VERIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferBannerType.DCF_KYC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransferBannerType.DCF_UPSELL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TransferBannerType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferAccountsAdapter(EventLogger eventLogger, Callbacks callbacks, boolean z, TransferAccountDirection direction, Context context) {
        super(DiffCallbacks.Equality.INSTANCE);
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(direction, "direction");
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        this.eventLogger = eventLogger;
        this.callbacks = callbacks;
        this.showAccountIcons = z;
        this.direction = direction;
        this.eventContext = context;
    }

    public final String getSelectedItemId() {
        return this.selectedItemId;
    }

    public final void setSelectedItemId(String str) {
        this.selectedItemId = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            return new AccountViewHolder(RdsRowView.INSTANCE.inflate(parent), this.eventLogger, this.showAccountIcons, this.direction);
        }
        if (viewType == 1) {
            return new SimpleViewHolder(ViewGroups.inflate$default(parent, C30065R.layout.row_transfer_account_section_header, false, 2, null));
        }
        if (viewType == 2) {
            return new SimpleViewHolder(ViewGroups.inflate$default(parent, C30065R.layout.include_transfer_account_banner, false, 2, null));
        }
        if (viewType == 3) {
            return new SimpleViewHolder(ViewGroups.inflate$default(parent, C30065R.layout.row_transfer_add_account, false, 2, null));
        }
        if (viewType == 4) {
            return new SimpleViewHolder(ViewGroups.inflate$default(parent, C30065R.layout.row_transfer_uk_add_account, false, 2, null));
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(viewType));
        throw new ExceptionsH();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Component.ComponentType componentType;
        Intrinsics.checkNotNullParameter(holder, "holder");
        final RowItem item = getItem(position);
        if (item instanceof RowItem.Account) {
            AccountViewHolder accountViewHolder = (AccountViewHolder) holder;
            RowItem.Account account = (RowItem.Account) item;
            accountViewHolder.bind(account.getAccountDisplayData(), account.getTransactingAccount(), account.isEditing(), Intrinsics.areEqual(account.getAccountDisplayData().getAccount().getId(), this.selectedItemId), account.getIraContributionType(), account.isInInterEntityMatchExperiment(), account.isOutgoingWire(), account.getMatchRateOverrideValues(), this.eventContext, new Function1() { // from class: com.robinhood.android.transfers.ui.max.accounts.TransferAccountsAdapter$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TransferAccountsAdapter.onBindViewHolder$lambda$1(this.f$0, item, (TransferAccount) obj);
                }
            }, new C307172(this.callbacks));
            return;
        }
        if (item instanceof RowItem.Header) {
            View view = ((SimpleViewHolder) holder).itemView;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.designsystem.text.RhTextView");
            ((RhTextView) view).setText(((RowItem.Header) item).getTextRes());
            return;
        }
        if (item instanceof RowItem.Banner) {
            View view2 = ((SimpleViewHolder) holder).itemView;
            Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type android.view.ViewGroup");
            View childAt = ((ViewGroup) view2).getChildAt(0);
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type com.robinhood.android.designsystem.banner.RdsInfoBannerView");
            RdsInfoBannerView rdsInfoBannerView = (RdsInfoBannerView) childAt;
            final ApiTransferBanner banner = ((RowItem.Banner) item).getBanner();
            final IacInfoBanner dbModel$default = ApiIacInfoBanner.toDbModel$default(banner.getBanner(), null, null, null, 4, null);
            IacInfoBanners.bindIacInfoBanner$default(rdsInfoBannerView, dbModel$default, null, 2, null);
            EventLogger eventLogger = this.eventLogger;
            int i = WhenMappings.$EnumSwitchMapping$0[banner.getBanner_type().ordinal()];
            if (i == 1) {
                componentType = Component.ComponentType.VERIFY_DEBIT_CARD_BANNER;
            } else if (i == 2) {
                componentType = Component.ComponentType.DEBIT_CARD_KYC_BANNER;
            } else if (i == 3) {
                componentType = Component.ComponentType.LINK_DEBIT_CARD_BANNER;
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                componentType = Component.ComponentType.COMPONENT_TYPE_UNSPECIFIED;
            }
            Component component = new Component(componentType, null, null, 6, null);
            Screen screen = new Screen(Screen.Name.TRANSFER_ACCOUNT_SELECTION, null, null, null, 14, null);
            ApiTransferBannerMetadata metadata = banner.getMetadata();
            EventLogger.DefaultImpls.logAppear$default(eventLogger, null, screen, component, null, metadata != null ? LoggingUtils8.toLoggingContext(metadata) : null, 9, null);
            OnClickListeners.onClick(rdsInfoBannerView, new Function0() { // from class: com.robinhood.android.transfers.ui.max.accounts.TransferAccountsAdapter$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransferAccountsAdapter.onBindViewHolder$lambda$3$lambda$2(dbModel$default, this, banner);
                }
            });
            return;
        }
        if (item instanceof RowItem.AddExternalAccount) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            OnClickListeners.onClick(itemView, new Function0() { // from class: com.robinhood.android.transfers.ui.max.accounts.TransferAccountsAdapter$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransferAccountsAdapter.onBindViewHolder$lambda$4(this.f$0, item);
                }
            });
        } else {
            if (!(item instanceof RowItem.AddUkAccount)) {
                throw new NoWhenBranchMatchedException();
            }
            View itemView2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            OnClickListeners.onClick(itemView2, new Function0() { // from class: com.robinhood.android.transfers.ui.max.accounts.TransferAccountsAdapter$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransferAccountsAdapter.onBindViewHolder$lambda$6(this.f$0);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$1(TransferAccountsAdapter transferAccountsAdapter, RowItem rowItem, TransferAccount account) {
        TransferAccountsViewState.AccountTransferDisplayData accountDisplayData;
        TransferAccount account2;
        Intrinsics.checkNotNullParameter(account, "account");
        String str = transferAccountsAdapter.selectedItemId;
        transferAccountsAdapter.selectedItemId = account.getId();
        if (str != null) {
            List<RowItem> currentList = transferAccountsAdapter.getCurrentList();
            Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
            Iterator<RowItem> it = currentList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                RowItem next = it.next();
                String id = null;
                RowItem.Account account3 = next instanceof RowItem.Account ? (RowItem.Account) next : null;
                if (account3 != null && (accountDisplayData = account3.getAccountDisplayData()) != null && (account2 = accountDisplayData.getAccount()) != null) {
                    id = account2.getId();
                }
                if (Intrinsics.areEqual(id, str)) {
                    break;
                }
                i++;
            }
            transferAccountsAdapter.notifyItemChanged(i);
        }
        transferAccountsAdapter.callbacks.onSelectionChanged(account, ((RowItem.Account) rowItem).getOutgoingWireRecipientType());
        return Unit.INSTANCE;
    }

    /* compiled from: TransferAccountsAdapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.max.accounts.TransferAccountsAdapter$onBindViewHolder$2 */
    /* synthetic */ class C307172 extends FunctionReferenceImpl implements Function1<TransferAccount, Unit> {
        C307172(Object obj) {
            super(1, obj, Callbacks.class, "onDeleteAccount", "onDeleteAccount(Lcom/robinhood/models/db/bonfire/TransferAccount;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TransferAccount transferAccount) {
            invoke2(transferAccount);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(TransferAccount p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((Callbacks) this.receiver).onDeleteAccount(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$3$lambda$2(IacInfoBanner iacInfoBanner, TransferAccountsAdapter transferAccountsAdapter, ApiTransferBanner apiTransferBanner) {
        Component.ComponentType componentType;
        if (iacInfoBanner.getCtaAction() == null) {
            return Unit.INSTANCE;
        }
        EventLogger eventLogger = transferAccountsAdapter.eventLogger;
        int i = WhenMappings.$EnumSwitchMapping$0[apiTransferBanner.getBanner_type().ordinal()];
        if (i == 1) {
            componentType = Component.ComponentType.VERIFY_DEBIT_CARD_BANNER;
        } else if (i == 2) {
            componentType = Component.ComponentType.DEBIT_CARD_KYC_BANNER;
        } else if (i == 3) {
            componentType = Component.ComponentType.LINK_DEBIT_CARD_BANNER;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            componentType = Component.ComponentType.COMPONENT_TYPE_UNSPECIFIED;
        }
        Component component = new Component(componentType, null, null, 6, null);
        Screen screen = new Screen(Screen.Name.TRANSFER_ACCOUNT_SELECTION, null, null, null, 14, null);
        ApiTransferBannerMetadata metadata = apiTransferBanner.getMetadata();
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, component, null, metadata != null ? LoggingUtils8.toLoggingContext(metadata) : null, false, 41, null);
        GenericAction ctaAction = iacInfoBanner.getCtaAction();
        if (ctaAction != null) {
            transferAccountsAdapter.callbacks.onBannerClicked(ctaAction);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$4(TransferAccountsAdapter transferAccountsAdapter, RowItem rowItem) {
        transferAccountsAdapter.callbacks.onAddAccountClicked(((RowItem.AddExternalAccount) rowItem).getOutgoingWireRecipientType());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$6(TransferAccountsAdapter transferAccountsAdapter) {
        Context context = transferAccountsAdapter.eventContext;
        if (context != null) {
            UkTransferAccountSelectionLogger.logAddNewUkBankAccountSelected(transferAccountsAdapter.eventLogger, context);
        }
        transferAccountsAdapter.callbacks.onAddAccountClicked(null);
        return Unit.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return getItem(position).getViewType();
    }

    /* compiled from: TransferAccountsAdapter.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\b\t\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsAdapter$RowItem;", "", "viewType", "", "<init>", "(I)V", "getViewType", "()I", "Account", "Header", "Banner", "AddExternalAccount", "AddUkAccount", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsAdapter$RowItem$Account;", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsAdapter$RowItem$AddExternalAccount;", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsAdapter$RowItem$AddUkAccount;", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsAdapter$RowItem$Banner;", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsAdapter$RowItem$Header;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class RowItem {
        public static final int $stable = 0;
        private final int viewType;

        public /* synthetic */ RowItem(int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(i);
        }

        private RowItem(int i) {
            this.viewType = i;
        }

        public final int getViewType() {
            return this.viewType;
        }

        /* compiled from: TransferAccountsAdapter.kt */
        @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jm\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010+\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u000201HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsAdapter$RowItem$Account;", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsAdapter$RowItem;", "isEditing", "", "accountDisplayData", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsViewState$AccountTransferDisplayData;", "transactingAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "iraContributionType", "Lcom/robinhood/models/api/bonfire/IraContributionType;", "isInInterEntityMatchExperiment", "isOutgoingWire", CreateTransferDuxo.SAVED_STATE_OUTGOING_WIRE_RECIPIENT_TYPE, "Lcom/robinhood/models/api/bonfire/wires/RecipientType;", "matchaDisplayInfo", "Lcom/robinhood/android/transfers/ui/max/createtransfer/MatchaDisplayInfo;", "matchRateOverrideValues", "Lcom/robinhood/android/models/retirement/db/MatchRateBreakdown;", "<init>", "(ZLcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsViewState$AccountTransferDisplayData;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/api/bonfire/IraContributionType;ZZLcom/robinhood/models/api/bonfire/wires/RecipientType;Lcom/robinhood/android/transfers/ui/max/createtransfer/MatchaDisplayInfo;Lcom/robinhood/android/models/retirement/db/MatchRateBreakdown;)V", "()Z", "getAccountDisplayData", "()Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsViewState$AccountTransferDisplayData;", "getTransactingAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "getIraContributionType", "()Lcom/robinhood/models/api/bonfire/IraContributionType;", "getOutgoingWireRecipientType", "()Lcom/robinhood/models/api/bonfire/wires/RecipientType;", "getMatchaDisplayInfo", "()Lcom/robinhood/android/transfers/ui/max/createtransfer/MatchaDisplayInfo;", "getMatchRateOverrideValues", "()Lcom/robinhood/android/models/retirement/db/MatchRateBreakdown;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Account extends RowItem {
            public static final int $stable = 8;
            private final TransferAccountsViewState.AccountTransferDisplayData accountDisplayData;
            private final IraContributionType iraContributionType;
            private final boolean isEditing;
            private final boolean isInInterEntityMatchExperiment;
            private final boolean isOutgoingWire;
            private final MatchRateBreakdown matchRateOverrideValues;
            private final MatchaDisplayInfo matchaDisplayInfo;
            private final RecipientType outgoingWireRecipientType;
            private final TransferAccount transactingAccount;

            public static /* synthetic */ Account copy$default(Account account, boolean z, TransferAccountsViewState.AccountTransferDisplayData accountTransferDisplayData, TransferAccount transferAccount, IraContributionType iraContributionType, boolean z2, boolean z3, RecipientType recipientType, MatchaDisplayInfo matchaDisplayInfo, MatchRateBreakdown matchRateBreakdown, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = account.isEditing;
                }
                if ((i & 2) != 0) {
                    accountTransferDisplayData = account.accountDisplayData;
                }
                if ((i & 4) != 0) {
                    transferAccount = account.transactingAccount;
                }
                if ((i & 8) != 0) {
                    iraContributionType = account.iraContributionType;
                }
                if ((i & 16) != 0) {
                    z2 = account.isInInterEntityMatchExperiment;
                }
                if ((i & 32) != 0) {
                    z3 = account.isOutgoingWire;
                }
                if ((i & 64) != 0) {
                    recipientType = account.outgoingWireRecipientType;
                }
                if ((i & 128) != 0) {
                    matchaDisplayInfo = account.matchaDisplayInfo;
                }
                if ((i & 256) != 0) {
                    matchRateBreakdown = account.matchRateOverrideValues;
                }
                MatchaDisplayInfo matchaDisplayInfo2 = matchaDisplayInfo;
                MatchRateBreakdown matchRateBreakdown2 = matchRateBreakdown;
                boolean z4 = z3;
                RecipientType recipientType2 = recipientType;
                boolean z5 = z2;
                TransferAccount transferAccount2 = transferAccount;
                return account.copy(z, accountTransferDisplayData, transferAccount2, iraContributionType, z5, z4, recipientType2, matchaDisplayInfo2, matchRateBreakdown2);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsEditing() {
                return this.isEditing;
            }

            /* renamed from: component2, reason: from getter */
            public final TransferAccountsViewState.AccountTransferDisplayData getAccountDisplayData() {
                return this.accountDisplayData;
            }

            /* renamed from: component3, reason: from getter */
            public final TransferAccount getTransactingAccount() {
                return this.transactingAccount;
            }

            /* renamed from: component4, reason: from getter */
            public final IraContributionType getIraContributionType() {
                return this.iraContributionType;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getIsInInterEntityMatchExperiment() {
                return this.isInInterEntityMatchExperiment;
            }

            /* renamed from: component6, reason: from getter */
            public final boolean getIsOutgoingWire() {
                return this.isOutgoingWire;
            }

            /* renamed from: component7, reason: from getter */
            public final RecipientType getOutgoingWireRecipientType() {
                return this.outgoingWireRecipientType;
            }

            /* renamed from: component8, reason: from getter */
            public final MatchaDisplayInfo getMatchaDisplayInfo() {
                return this.matchaDisplayInfo;
            }

            /* renamed from: component9, reason: from getter */
            public final MatchRateBreakdown getMatchRateOverrideValues() {
                return this.matchRateOverrideValues;
            }

            public final Account copy(boolean isEditing, TransferAccountsViewState.AccountTransferDisplayData accountDisplayData, TransferAccount transactingAccount, IraContributionType iraContributionType, boolean isInInterEntityMatchExperiment, boolean isOutgoingWire, RecipientType outgoingWireRecipientType, MatchaDisplayInfo matchaDisplayInfo, MatchRateBreakdown matchRateOverrideValues) {
                Intrinsics.checkNotNullParameter(accountDisplayData, "accountDisplayData");
                return new Account(isEditing, accountDisplayData, transactingAccount, iraContributionType, isInInterEntityMatchExperiment, isOutgoingWire, outgoingWireRecipientType, matchaDisplayInfo, matchRateOverrideValues);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Account)) {
                    return false;
                }
                Account account = (Account) other;
                return this.isEditing == account.isEditing && Intrinsics.areEqual(this.accountDisplayData, account.accountDisplayData) && Intrinsics.areEqual(this.transactingAccount, account.transactingAccount) && this.iraContributionType == account.iraContributionType && this.isInInterEntityMatchExperiment == account.isInInterEntityMatchExperiment && this.isOutgoingWire == account.isOutgoingWire && this.outgoingWireRecipientType == account.outgoingWireRecipientType && Intrinsics.areEqual(this.matchaDisplayInfo, account.matchaDisplayInfo) && Intrinsics.areEqual(this.matchRateOverrideValues, account.matchRateOverrideValues);
            }

            public int hashCode() {
                int iHashCode = ((Boolean.hashCode(this.isEditing) * 31) + this.accountDisplayData.hashCode()) * 31;
                TransferAccount transferAccount = this.transactingAccount;
                int iHashCode2 = (iHashCode + (transferAccount == null ? 0 : transferAccount.hashCode())) * 31;
                IraContributionType iraContributionType = this.iraContributionType;
                int iHashCode3 = (((((iHashCode2 + (iraContributionType == null ? 0 : iraContributionType.hashCode())) * 31) + Boolean.hashCode(this.isInInterEntityMatchExperiment)) * 31) + Boolean.hashCode(this.isOutgoingWire)) * 31;
                RecipientType recipientType = this.outgoingWireRecipientType;
                int iHashCode4 = (iHashCode3 + (recipientType == null ? 0 : recipientType.hashCode())) * 31;
                MatchaDisplayInfo matchaDisplayInfo = this.matchaDisplayInfo;
                int iHashCode5 = (iHashCode4 + (matchaDisplayInfo == null ? 0 : matchaDisplayInfo.hashCode())) * 31;
                MatchRateBreakdown matchRateBreakdown = this.matchRateOverrideValues;
                return iHashCode5 + (matchRateBreakdown != null ? matchRateBreakdown.hashCode() : 0);
            }

            public String toString() {
                return "Account(isEditing=" + this.isEditing + ", accountDisplayData=" + this.accountDisplayData + ", transactingAccount=" + this.transactingAccount + ", iraContributionType=" + this.iraContributionType + ", isInInterEntityMatchExperiment=" + this.isInInterEntityMatchExperiment + ", isOutgoingWire=" + this.isOutgoingWire + ", outgoingWireRecipientType=" + this.outgoingWireRecipientType + ", matchaDisplayInfo=" + this.matchaDisplayInfo + ", matchRateOverrideValues=" + this.matchRateOverrideValues + ")";
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            public /* synthetic */ Account(boolean r13, com.robinhood.android.transfers.p271ui.max.accounts.TransferAccountsViewState.AccountTransferDisplayData r14, com.robinhood.models.p320db.bonfire.TransferAccount r15, com.robinhood.models.api.bonfire.IraContributionType r16, boolean r17, boolean r18, com.robinhood.models.api.bonfire.wires.RecipientType r19, com.robinhood.android.transfers.p271ui.max.createtransfer.MatchaDisplayInfo r20, com.robinhood.android.models.retirement.p194db.MatchRateBreakdown r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
                /*
                    r12 = this;
                    r0 = r22
                    r1 = r0 & 32
                    if (r1 == 0) goto L9
                    r1 = 0
                    r8 = r1
                    goto Lb
                L9:
                    r8 = r18
                Lb:
                    r1 = r0 & 64
                    r2 = 0
                    if (r1 == 0) goto L12
                    r9 = r2
                    goto L14
                L12:
                    r9 = r19
                L14:
                    r1 = r0 & 128(0x80, float:1.794E-43)
                    if (r1 == 0) goto L1a
                    r10 = r2
                    goto L1c
                L1a:
                    r10 = r20
                L1c:
                    r0 = r0 & 256(0x100, float:3.59E-43)
                    if (r0 == 0) goto L2a
                    r11 = r2
                    r3 = r13
                    r4 = r14
                    r5 = r15
                    r6 = r16
                    r7 = r17
                    r2 = r12
                    goto L34
                L2a:
                    r11 = r21
                    r2 = r12
                    r3 = r13
                    r4 = r14
                    r5 = r15
                    r6 = r16
                    r7 = r17
                L34:
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.transfers.ui.max.accounts.TransferAccountsAdapter.RowItem.Account.<init>(boolean, com.robinhood.android.transfers.ui.max.accounts.TransferAccountsViewState$AccountTransferDisplayData, com.robinhood.models.db.bonfire.TransferAccount, com.robinhood.models.api.bonfire.IraContributionType, boolean, boolean, com.robinhood.models.api.bonfire.wires.RecipientType, com.robinhood.android.transfers.ui.max.createtransfer.MatchaDisplayInfo, com.robinhood.android.models.retirement.db.MatchRateBreakdown, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            public final boolean isEditing() {
                return this.isEditing;
            }

            public final TransferAccountsViewState.AccountTransferDisplayData getAccountDisplayData() {
                return this.accountDisplayData;
            }

            public final TransferAccount getTransactingAccount() {
                return this.transactingAccount;
            }

            public final IraContributionType getIraContributionType() {
                return this.iraContributionType;
            }

            public final boolean isInInterEntityMatchExperiment() {
                return this.isInInterEntityMatchExperiment;
            }

            public final boolean isOutgoingWire() {
                return this.isOutgoingWire;
            }

            public final RecipientType getOutgoingWireRecipientType() {
                return this.outgoingWireRecipientType;
            }

            public final MatchaDisplayInfo getMatchaDisplayInfo() {
                return this.matchaDisplayInfo;
            }

            public final MatchRateBreakdown getMatchRateOverrideValues() {
                return this.matchRateOverrideValues;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Account(boolean z, TransferAccountsViewState.AccountTransferDisplayData accountDisplayData, TransferAccount transferAccount, IraContributionType iraContributionType, boolean z2, boolean z3, RecipientType recipientType, MatchaDisplayInfo matchaDisplayInfo, MatchRateBreakdown matchRateBreakdown) {
                super(0, null);
                Intrinsics.checkNotNullParameter(accountDisplayData, "accountDisplayData");
                this.isEditing = z;
                this.accountDisplayData = accountDisplayData;
                this.transactingAccount = transferAccount;
                this.iraContributionType = iraContributionType;
                this.isInInterEntityMatchExperiment = z2;
                this.isOutgoingWire = z3;
                this.outgoingWireRecipientType = recipientType;
                this.matchaDisplayInfo = matchaDisplayInfo;
                this.matchRateOverrideValues = matchRateBreakdown;
            }
        }

        /* compiled from: TransferAccountsAdapter.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsAdapter$RowItem$Header;", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsAdapter$RowItem;", "textRes", "", "<init>", "(I)V", "getTextRes", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Header extends RowItem {
            public static final int $stable = 0;
            private final int textRes;

            public static /* synthetic */ Header copy$default(Header header, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = header.textRes;
                }
                return header.copy(i);
            }

            /* renamed from: component1, reason: from getter */
            public final int getTextRes() {
                return this.textRes;
            }

            public final Header copy(int textRes) {
                return new Header(textRes);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Header) && this.textRes == ((Header) other).textRes;
            }

            public int hashCode() {
                return Integer.hashCode(this.textRes);
            }

            public String toString() {
                return "Header(textRes=" + this.textRes + ")";
            }

            public Header(int i) {
                super(1, null);
                this.textRes = i;
            }

            public final int getTextRes() {
                return this.textRes;
            }
        }

        /* compiled from: TransferAccountsAdapter.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsAdapter$RowItem$Banner;", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsAdapter$RowItem;", MerchantRewardDetailComposable.BANNER_TEST_TAG, "Lcom/robinhood/models/api/bonfire/transfer/banner/ApiTransferBanner;", "<init>", "(Lcom/robinhood/models/api/bonfire/transfer/banner/ApiTransferBanner;)V", "getBanner", "()Lcom/robinhood/models/api/bonfire/transfer/banner/ApiTransferBanner;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Banner extends RowItem {
            public static final int $stable = 8;
            private final ApiTransferBanner banner;

            public static /* synthetic */ Banner copy$default(Banner banner, ApiTransferBanner apiTransferBanner, int i, Object obj) {
                if ((i & 1) != 0) {
                    apiTransferBanner = banner.banner;
                }
                return banner.copy(apiTransferBanner);
            }

            /* renamed from: component1, reason: from getter */
            public final ApiTransferBanner getBanner() {
                return this.banner;
            }

            public final Banner copy(ApiTransferBanner banner) {
                Intrinsics.checkNotNullParameter(banner, "banner");
                return new Banner(banner);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Banner) && Intrinsics.areEqual(this.banner, ((Banner) other).banner);
            }

            public int hashCode() {
                return this.banner.hashCode();
            }

            public String toString() {
                return "Banner(banner=" + this.banner + ")";
            }

            public final ApiTransferBanner getBanner() {
                return this.banner;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Banner(ApiTransferBanner banner) {
                super(2, null);
                Intrinsics.checkNotNullParameter(banner, "banner");
                this.banner = banner;
            }
        }

        /* compiled from: TransferAccountsAdapter.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsAdapter$RowItem$AddExternalAccount;", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsAdapter$RowItem;", CreateTransferDuxo.SAVED_STATE_OUTGOING_WIRE_RECIPIENT_TYPE, "Lcom/robinhood/models/api/bonfire/wires/RecipientType;", "<init>", "(Lcom/robinhood/models/api/bonfire/wires/RecipientType;)V", "getOutgoingWireRecipientType", "()Lcom/robinhood/models/api/bonfire/wires/RecipientType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AddExternalAccount extends RowItem {
            public static final int $stable = 0;
            private final RecipientType outgoingWireRecipientType;

            public static /* synthetic */ AddExternalAccount copy$default(AddExternalAccount addExternalAccount, RecipientType recipientType, int i, Object obj) {
                if ((i & 1) != 0) {
                    recipientType = addExternalAccount.outgoingWireRecipientType;
                }
                return addExternalAccount.copy(recipientType);
            }

            /* renamed from: component1, reason: from getter */
            public final RecipientType getOutgoingWireRecipientType() {
                return this.outgoingWireRecipientType;
            }

            public final AddExternalAccount copy(RecipientType outgoingWireRecipientType) {
                return new AddExternalAccount(outgoingWireRecipientType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AddExternalAccount) && this.outgoingWireRecipientType == ((AddExternalAccount) other).outgoingWireRecipientType;
            }

            public int hashCode() {
                RecipientType recipientType = this.outgoingWireRecipientType;
                if (recipientType == null) {
                    return 0;
                }
                return recipientType.hashCode();
            }

            public String toString() {
                return "AddExternalAccount(outgoingWireRecipientType=" + this.outgoingWireRecipientType + ")";
            }

            public final RecipientType getOutgoingWireRecipientType() {
                return this.outgoingWireRecipientType;
            }

            public AddExternalAccount(RecipientType recipientType) {
                super(3, null);
                this.outgoingWireRecipientType = recipientType;
            }
        }

        /* compiled from: TransferAccountsAdapter.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsAdapter$RowItem$AddUkAccount;", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsAdapter$RowItem;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class AddUkAccount extends RowItem {
            public static final int $stable = 0;
            public static final AddUkAccount INSTANCE = new AddUkAccount();

            private AddUkAccount() {
                super(4, null);
            }
        }
    }

    /* compiled from: TransferAccountsAdapter.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0084\u0001\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u000e\u0010\u001a\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsAdapter$AccountViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "showAccountIcon", "", "direction", "Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;", "<init>", "(Lcom/robinhood/android/designsystem/row/RdsRowView;Lcom/robinhood/analytics/EventLogger;ZLcom/robinhood/android/transfers/contracts/TransferAccountDirection;)V", "bind", "", "accountDisplayData", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsViewState$AccountTransferDisplayData;", "transactingAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "isEditing", "isSelected", "iraContributionType", "Lcom/robinhood/models/api/bonfire/IraContributionType;", "isInInterEntityMatchExperiment", "isOutgoingWire", "matchRateOverrideValues", "Lcom/robinhood/android/models/retirement/db/MatchRateBreakdown;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "onClick", "Lkotlin/Function1;", "onDelete", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class AccountViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;
        private final TransferAccountDirection direction;
        private final EventLogger eventLogger;
        private final boolean showAccountIcon;

        /* compiled from: TransferAccountsAdapter.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TransferAccountDirection.values().length];
                try {
                    iArr[TransferAccountDirection.SOURCE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TransferAccountDirection.SINK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AccountViewHolder(RdsRowView view, EventLogger eventLogger, boolean z, TransferAccountDirection direction) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(direction, "direction");
            this.eventLogger = eventLogger;
            this.showAccountIcon = z;
            this.direction = direction;
        }

        public final void bind(TransferAccountsViewState.AccountTransferDisplayData accountDisplayData, TransferAccount transactingAccount, final boolean isEditing, boolean isSelected, IraContributionType iraContributionType, boolean isInInterEntityMatchExperiment, boolean isOutgoingWire, MatchRateBreakdown matchRateOverrideValues, final Context eventContext, final Function1<? super TransferAccount, Unit> onClick, final Function1<? super TransferAccount, Unit> onDelete) {
            String accountName;
            boolean zIsDepositsEnabled;
            Drawable drawable;
            Intrinsics.checkNotNullParameter(accountDisplayData, "accountDisplayData");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            Intrinsics.checkNotNullParameter(onDelete, "onDelete");
            View view = this.itemView;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.designsystem.row.RdsRowView");
            final RdsRowView rdsRowView = (RdsRowView) view;
            final TransferAccount account = accountDisplayData.getAccount();
            SpannedString spannedString = null;
            if (this.showAccountIcon) {
                if (!account.isManaged()) {
                    Integer iconRes = TransferAccountsAdapter2.getIconRes(account.getType());
                    drawable = iconRes != null ? ViewsKt.getDrawable(rdsRowView, iconRes.intValue()) : null;
                } else {
                    drawable = ViewsKt.getDrawable(rdsRowView, C20690R.drawable.ic_rds_managed_accounts_24dp);
                }
                rdsRowView.setLeadingIconDrawable(drawable);
            }
            if (account.isExternal()) {
                accountName = account.getDisplayTitle();
            } else {
                accountName = account.getAccountName();
            }
            rdsRowView.setPrimaryText(accountName);
            android.content.Context context = rdsRowView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            rdsRowView.setSecondaryText(TransferAccountsAdapter2.getSecondaryText(accountDisplayData, context, transactingAccount, this.direction, iraContributionType, isInInterEntityMatchExperiment, isOutgoingWire, matchRateOverrideValues));
            if (!isEditing && isSelected) {
                rdsRowView.setTrailingIconResource(C20690R.drawable.ic_rds_checkmark_24dp);
            } else {
                rdsRowView.setTrailingIconDrawable(null);
            }
            if (isEditing) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Object[] objArr = {new StyleSpan(1), ThemableColorSpans3.INSTANCE.invoke(ThemeAttributes.INSTANCE.getCOLOR_NEGATIVE()), new UnderlineSpan()};
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) ViewsKt.getString(rdsRowView, C32428R.string.general_label_delete));
                for (int i = 0; i < 3; i++) {
                    spannableStringBuilder.setSpan(objArr[i], length, spannableStringBuilder.length(), 17);
                }
                spannedString = new SpannedString(spannableStringBuilder);
            }
            rdsRowView.setMetadataPrimaryText(spannedString);
            int i2 = WhenMappings.$EnumSwitchMapping$0[this.direction.ordinal()];
            if (i2 == 1) {
                zIsDepositsEnabled = account.isDepositsEnabled();
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                zIsDepositsEnabled = account.isWithdrawalsEnabled();
            }
            rdsRowView.setEnabled(zIsDepositsEnabled);
            OnClickListeners.onClick(rdsRowView, new Function0() { // from class: com.robinhood.android.transfers.ui.max.accounts.TransferAccountsAdapter$AccountViewHolder$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransferAccountsAdapter.AccountViewHolder.bind$lambda$4$lambda$3(account, eventContext, this, isEditing, onDelete, rdsRowView, onClick);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bind$lambda$4$lambda$3(TransferAccount transferAccount, Context context, AccountViewHolder accountViewHolder, boolean z, Function1 function1, RdsRowView rdsRowView, Function1 function12) {
            if (transferAccount.getType() != ApiTransferAccount.TransferAccountType.UK_BANK_ACCOUNT) {
                EventLogger eventLogger = accountViewHolder.eventLogger;
                Screen screen = new Screen(Screen.Name.TRANSFER_ACCOUNT_SELECTION, null, null, null, 14, null);
                Component.ComponentType componentType = Component.ComponentType.ROW;
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                String str = null;
                String str2 = null;
                EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, new Component(componentType, null, null, 6, null), null, new Context(i, i2, i3, str, str2, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MAXTransferAccountSelectionContext(Selections2.toProtobuf(accountViewHolder.direction), Transfers.toProtobuf(transferAccount), null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -262145, -1, -1, -1, -1, 16383, null), false, 41, null);
            } else if (context != null) {
                UkTransferAccountSelectionLogger.logUkBankAccountSelected(accountViewHolder.eventLogger, accountViewHolder.direction, transferAccount, context);
            }
            if (z) {
                function1.invoke(transferAccount);
            } else {
                rdsRowView.setTrailingIconResource(C20690R.drawable.ic_rds_checkmark_24dp);
                function12.invoke(transferAccount);
            }
            return Unit.INSTANCE;
        }
    }
}
