package com.robinhood.android.search.search;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.container.RdsRippleContainerView;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.models.futures.api.bonfire.ApiFuturesContractSearchItem;
import com.robinhood.android.models.futures.api.bonfire.FuturesSearchItem;
import com.robinhood.android.models.futures.p189db.UiFuturesPosition;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.search.databinding.MergeRowSearchViewBinding;
import com.robinhood.android.search.search.SearchAdapter;
import com.robinhood.android.search.search.SearchItem;
import com.robinhood.common.strings.C32428R;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p315ui.UiCryptoHolding;
import com.robinhood.models.p320db.Security;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.shared.lists.quickadd.C39088R;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: SearchRowView.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u0015H\u0002J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/search/search/SearchRowView;", "Lcom/robinhood/android/designsystem/container/RdsRippleContainerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/search/databinding/MergeRowSearchViewBinding;", "getBinding", "()Lcom/robinhood/android/search/databinding/MergeRowSearchViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/search/search/SearchAdapter$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/search/search/SearchAdapter$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/search/search/SearchAdapter$Callbacks;)V", "bind", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/search/search/SearchItem$SecurityRow;", "bindSearchRowSelector", "handleEditWatchList", "bindCheckmark", "bindAddIcon", "Companion", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SearchRowView extends RdsRippleContainerView {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private SearchAdapter.Callbacks callbacks;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SearchRowView.class, "binding", "getBinding()Lcom/robinhood/android/search/databinding/MergeRowSearchViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ SearchRowView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C27909R.layout.merge_row_search_view, true);
        ViewsKt.setLoggingConfig(this, new AutoLoggingConfig(false, false));
        this.binding = ViewBinding5.viewBinding(this, SearchRowView2.INSTANCE);
    }

    private final MergeRowSearchViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeRowSearchViewBinding) value;
    }

    public final SearchAdapter.Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(SearchAdapter.Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    public final void bind(final SearchItem.SecurityRow data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Security security = data.getSecurity();
        MergeRowSearchViewBinding binding = getBinding();
        Companion companion = INSTANCE;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        String displayMetadataString$feature_search_externalRelease = companion.getDisplayMetadataString$feature_search_externalRelease(resources, data);
        if (displayMetadataString$feature_search_externalRelease != null) {
            binding.instrumentSymbolTxt.setText(com.robinhood.utils.extensions.ViewsKt.getString(this, C27909R.string.search_result_symbol_and_metadata, security.getDisplaySymbol(), displayMetadataString$feature_search_externalRelease));
        } else {
            binding.instrumentSymbolTxt.setText(security.getDisplaySymbol());
        }
        binding.instrumentNameTxt.setText(security.getDisplayName());
        bindSearchRowSelector(data);
        OnClickListeners.onClick(this, new Function0() { // from class: com.robinhood.android.search.search.SearchRowView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchRowView.bind$lambda$1(this.f$0, data);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$1(SearchRowView searchRowView, SearchItem.SecurityRow securityRow) {
        SearchAdapter.Callbacks callbacks = searchRowView.callbacks;
        if (callbacks != null) {
            callbacks.onSecurityClicked(securityRow.getSecurity(), securityRow.getIsInUserList());
        }
        return Unit.INSTANCE;
    }

    private final void bindSearchRowSelector(final SearchItem.SecurityRow data) {
        getBinding().searchRowSelector.setVisibility(0);
        if (data.getCanAddToMultipleLists() && data.getIsInAnyUserLists()) {
            bindCheckmark();
        } else if ((!data.getCanAddToMultipleLists() || data.getIsInAnyUserLists()) && data.getIsInUserList()) {
            bindCheckmark();
        } else {
            bindAddIcon(data);
        }
        ImageView searchRowSelector = getBinding().searchRowSelector;
        Intrinsics.checkNotNullExpressionValue(searchRowSelector, "searchRowSelector");
        OnClickListeners.onClick(searchRowSelector, new Function0() { // from class: com.robinhood.android.search.search.SearchRowView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchRowView.bindSearchRowSelector$lambda$2(this.f$0, data);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindSearchRowSelector$lambda$2(SearchRowView searchRowView, SearchItem.SecurityRow securityRow) {
        searchRowView.handleEditWatchList(securityRow);
        return Unit.INSTANCE;
    }

    private final void handleEditWatchList(SearchItem.SecurityRow data) {
        if (data.getCanAddToMultipleLists()) {
            SearchAdapter.Callbacks callbacks = this.callbacks;
            if (callbacks != null) {
                callbacks.onAddToWatchlistClicked(data.getSecurity(), data.getIsInAnyUserLists());
                return;
            }
            return;
        }
        if (data.getIsInUserList()) {
            SearchAdapter.Callbacks callbacks2 = this.callbacks;
            if (callbacks2 != null) {
                callbacks2.onRemoveFromWatchlistClicked(data.getSecurity());
                return;
            }
            return;
        }
        SearchAdapter.Callbacks callbacks3 = this.callbacks;
        if (callbacks3 != null) {
            callbacks3.onAddToWatchlistClicked(data.getSecurity(), false);
        }
    }

    private final void bindCheckmark() {
        getBinding().searchRowSelector.setImageResource(C20690R.drawable.ic_rds_bubble_checked_24dp);
        getBinding().searchRowSelector.setContentDescription(com.robinhood.utils.extensions.ViewsKt.getString(this, C39088R.string.lists_edit));
    }

    private final void bindAddIcon(SearchItem.SecurityRow data) {
        ImageView imageView = getBinding().searchRowSelector;
        Intrinsics.checkNotNull(imageView);
        imageView.setVisibility(!data.getDisallowAddToListButton() ? 0 : 8);
        imageView.setImageResource(C11048R.drawable.svg_ic_action_add_24dp);
        imageView.setContentDescription(com.robinhood.utils.extensions.ViewsKt.getString(imageView, C32428R.string.lists_menu_add_to_list));
    }

    /* compiled from: SearchRowView.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\b\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0096\u0001¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/search/search/SearchRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/search/search/SearchRowView;", "<init>", "()V", "getDisplayMetadataString", "", "resources", "Landroid/content/res/Resources;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/search/search/SearchItem$SecurityRow;", "getDisplayMetadataString$feature_search_externalRelease", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<SearchRowView> {
        private final /* synthetic */ Inflater<SearchRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public SearchRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (SearchRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C27909R.layout.include_row_search_view);
        }

        public final String getDisplayMetadataString$feature_search_externalRelease(Resources resources, SearchItem.SecurityRow data) throws Resources.NotFoundException {
            Currency currency;
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(data, "data");
            if (data instanceof SearchItem.SecurityRow.Instrument) {
                BigDecimal displayQuantity = ((SearchItem.SecurityRow.Instrument) data).getDisplayQuantity();
                if (displayQuantity != null) {
                    return com.robinhood.android.common.util.extensions.Resources.getBigDecimalQuantityString(resources, C11048R.plurals.general_number_of_shares, displayQuantity, Formats.getShareQuantityFormat().format(displayQuantity));
                }
                return null;
            }
            if (data instanceof SearchItem.SecurityRow.Crypto) {
                UiCryptoHolding cryptoHolding = ((SearchItem.SecurityRow.Crypto) data).getCryptoHolding();
                if (cryptoHolding == null || (currency = cryptoHolding.getCurrency()) == null) {
                    return null;
                }
                return CurrencyDefinitions.formatCurrency$default(currency, cryptoHolding.getQuantity(), false, false, null, 0, null, null, false, false, false, false, 2044, null);
            }
            if (data instanceof SearchItem.SecurityRow.Futures) {
                SearchItem.SecurityRow.Futures futures = (SearchItem.SecurityRow.Futures) data;
                UiFuturesPosition position = futures.getPosition();
                if (position != null) {
                    String string2 = resources.getString(C27909R.string.search_detail_futures_position_label, Formats.getIntegerDeltaFormat().format(position.getQuantity()), position.getAveragePrice().toPlainString());
                    if (string2 != null) {
                        return string2;
                    }
                }
                FuturesSearchItem security = futures.getSecurity();
                ApiFuturesContractSearchItem apiFuturesContractSearchItem = security instanceof ApiFuturesContractSearchItem ? (ApiFuturesContractSearchItem) security : null;
                if (apiFuturesContractSearchItem != null) {
                    return apiFuturesContractSearchItem.getExpirationStr();
                }
                return null;
            }
            if ((data instanceof SearchItem.SecurityRow.EventContract) || (data instanceof SearchItem.SecurityRow.MarketIndex)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
