package com.robinhood.android.cash.flat.cashback.p071ui.rad;

import com.robinhood.android.cash.flat.cashback.p071ui.common.BaseFlatCashbackDataState;
import com.robinhood.android.cash.flat.cashback.p071ui.common.BaseFlatCashbackStateProvider;
import com.robinhood.android.cash.flat.cashback.p071ui.common.BaseFlatCashbackViewState;
import com.robinhood.android.cash.flat.cashback.p071ui.common.ValueProp;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.contracts.TransferFundsDeepLinkAccountType;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.contentful.ApiRecurringDepositParameter;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketingContent;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.squareup.moshi.JsonAdapter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: FlatCashbackRadOnboardingStateProvider.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0003H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0002R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/rad/FlatCashbackRadOnboardingStateProvider;", "Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackStateProvider;", "", "Lcom/robinhood/android/cash/flat/cashback/ui/rad/FlatCashbackRadOnboardingViewState;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Lcom/robinhood/utils/moshi/LazyMoshi;)V", "recurringDepositConfigAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/models/api/contentful/ApiRecurringDepositParameter;", "reduceLoadedData", "content", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;", WebsocketGatewayConstants.DATA_KEY, "(Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;Lkotlin/Unit;)Lcom/robinhood/android/cash/flat/cashback/ui/rad/FlatCashbackRadOnboardingViewState;", "mockViewState", "getTransfer", "Lcom/robinhood/android/transfers/contracts/Transfer;", "parameter", "Companion", "feature-cash-flat-cashback_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class FlatCashbackRadOnboardingStateProvider implements BaseFlatCashbackStateProvider<Unit, FlatCashbackRadOnboardingViewState> {
    public static final String RECURRING_CONFIG_BULLET_PREFIX = "recurring-config-item-";
    public static final String RECURRING_CONFIG_HEADER = "recurring-config-intro";
    public static final String RECURRING_CONFIG_PARAMETER = "recurring-config-parameter";
    private final JsonAdapter<ApiRecurringDepositParameter> recurringDepositConfigAdapter;
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.StateProvider
    public BaseFlatCashbackViewState<FlatCashbackRadOnboardingViewState> reduce(BaseFlatCashbackDataState<Unit> baseFlatCashbackDataState) {
        return BaseFlatCashbackStateProvider.DefaultImpls.reduce(this, baseFlatCashbackDataState);
    }

    public FlatCashbackRadOnboardingStateProvider(LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Types types = Types.INSTANCE;
        this.recurringDepositConfigAdapter = moshi.adapter(new TypeToken<ApiRecurringDepositParameter>() { // from class: com.robinhood.android.cash.flat.cashback.ui.rad.FlatCashbackRadOnboardingStateProvider$special$$inlined$getAdapter$1
        }.getType());
    }

    @Override // com.robinhood.android.cash.flat.cashback.p071ui.common.BaseFlatCashbackStateProvider
    public FlatCashbackRadOnboardingViewState reduceLoadedData(ProductMarketingContent content, Unit data) throws IOException {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(data, "data");
        for (ProductMarketingContent.Feature feature : content.getFeatures()) {
            if (Intrinsics.areEqual(feature.getIdentifier(), RECURRING_CONFIG_HEADER)) {
                List<ProductMarketingContent.Feature> features = content.getFeatures();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = features.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (StringsKt.startsWith$default(((ProductMarketingContent.Feature) next).getIdentifier(), RECURRING_CONFIG_BULLET_PREFIX, false, 2, (Object) null)) {
                        arrayList.add(next);
                    }
                }
                for (ProductMarketingContent.Feature feature2 : content.getFeatures()) {
                    if (Intrinsics.areEqual(feature2.getIdentifier(), RECURRING_CONFIG_PARAMETER)) {
                        ApiRecurringDepositParameter apiRecurringDepositParameterFromJson = this.recurringDepositConfigAdapter.fromJson(feature2.getDescription().toString());
                        String title = feature.getTitle();
                        String string2 = feature.getDescription().toString();
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(new ValueProp(null, ((ProductMarketingContent.Feature) it2.next()).getDescription().toString(), 1, null));
                        }
                        return new FlatCashbackRadOnboardingViewState(title, string2, arrayList2, apiRecurringDepositParameterFromJson != null ? getTransfer(apiRecurringDepositParameterFromJson) : null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.robinhood.android.cash.flat.cashback.p071ui.common.BaseFlatCashbackStateProvider
    public FlatCashbackRadOnboardingViewState mockViewState() {
        return FlatCashbackRadOnboardingViewState.INSTANCE.getMock$feature_cash_flat_cashback_externalDebug();
    }

    private final Transfer getTransfer(ApiRecurringDepositParameter parameter) {
        ApiTransferAccount.TransferAccountType transferAccountType;
        ApiTransferAccount.TransferAccountType transferAccountType2;
        TransferFundsDeepLinkAccountType from_account_type = parameter.getFrom_account_type();
        TransferConfiguration.TransferAccountSelection transferAccountSelection = (from_account_type == null || (transferAccountType2 = from_account_type.toTransferAccountType()) == null) ? null : new TransferConfiguration.TransferAccountSelection(null, false, transferAccountType2, 3, null);
        TransferFundsDeepLinkAccountType to_account_type = parameter.getTo_account_type();
        return new Transfer(new TransferConfiguration.Standard(parameter.getAmount(), parameter.getFrequency(), true, transferAccountSelection, (to_account_type == null || (transferAccountType = to_account_type.toTransferAccountType()) == null) ? null : new TransferConfiguration.TransferAccountSelection(null, false, transferAccountType, 3, null), null, Intrinsics.areEqual(parameter.getEntry_point(), "spending_incentive") ? MAXTransferContext.EntryPoint.SPENDING_INCENTIVE : MAXTransferContext.EntryPoint.ENTRY_POINT_UNSPECIFIED, parameter.getEntry_point(), false, true, null, null, false, 7456, null));
    }
}
