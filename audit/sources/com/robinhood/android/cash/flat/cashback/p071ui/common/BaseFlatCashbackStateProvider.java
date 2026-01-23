package com.robinhood.android.cash.flat.cashback.p071ui.common;

import com.robinhood.android.cash.flat.cashback.p071ui.common.BaseFlatCashbackViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketingContent;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseFlatCashbackStateProvider.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00060\u0004J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016J\u001d\u0010\t\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0000H&¢\u0006\u0002\u0010\rJ\r\u0010\u000e\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackStateProvider;", "T", "", "VS", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackDataState;", "Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackViewState;", "reduce", "dataState", "reduceLoadedData", "content", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;", WebsocketGatewayConstants.DATA_KEY, "(Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;Ljava/lang/Object;)Ljava/lang/Object;", "mockViewState", "()Ljava/lang/Object;", "feature-cash-flat-cashback_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface BaseFlatCashbackStateProvider<T, VS> extends StateProvider<BaseFlatCashbackDataState<T>, BaseFlatCashbackViewState<VS>> {
    VS mockViewState();

    BaseFlatCashbackViewState<VS> reduce(BaseFlatCashbackDataState<T> dataState);

    VS reduceLoadedData(ProductMarketingContent content, T data);

    /* compiled from: BaseFlatCashbackStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static <T, VS> BaseFlatCashbackViewState<VS> reduce(BaseFlatCashbackStateProvider<T, VS> baseFlatCashbackStateProvider, BaseFlatCashbackDataState<T> dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            if (dataState.getContent() == null || dataState.getData() == null) {
                return dataState.getError() != null ? new BaseFlatCashbackViewState.Error(dataState.getError()) : new BaseFlatCashbackViewState.Loading(baseFlatCashbackStateProvider.mockViewState());
            }
            return new BaseFlatCashbackViewState.Loaded(baseFlatCashbackStateProvider.reduceLoadedData(dataState.getContent(), dataState.getData()));
        }
    }
}
