package com.robinhood.transfers.gold;

import com.robinhood.database.InjectedTypeConverter;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GoldDepositBoostTransferDetailConverter.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0007J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/transfers/gold/GoldDepositBoostTransferDetailConverter;", "Lcom/robinhood/database/InjectedTypeConverter;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Lcom/robinhood/utils/moshi/LazyMoshi;)V", "goldDepositBoostTransferDetailAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/transfers/gold/GoldDepositBoostTransferDetail;", "getGoldDepositBoostTransferDetailAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "goldDepositBoostTransferDetailAdapter$delegate", "Lkotlin/Lazy;", "goldDepositBoostTransferDetailToString", "", "goldDepositBoostTransferDetail", "stringToGoldDepositBoostTransferDetail", "json", "lib-models-transfer-gold_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class GoldDepositBoostTransferDetailConverter implements InjectedTypeConverter {

    /* renamed from: goldDepositBoostTransferDetailAdapter$delegate, reason: from kotlin metadata */
    private final Lazy goldDepositBoostTransferDetailAdapter;
    private final LazyMoshi moshi;

    public GoldDepositBoostTransferDetailConverter(LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.moshi = moshi;
        this.goldDepositBoostTransferDetailAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.transfers.gold.GoldDepositBoostTransferDetailConverter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GoldDepositBoostTransferDetailConverter.goldDepositBoostTransferDetailAdapter_delegate$lambda$0(this.f$0);
            }
        });
    }

    private final JsonAdapter<GoldDepositBoostTransferDetail> getGoldDepositBoostTransferDetailAdapter() {
        return (JsonAdapter) this.goldDepositBoostTransferDetailAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAdapter goldDepositBoostTransferDetailAdapter_delegate$lambda$0(GoldDepositBoostTransferDetailConverter goldDepositBoostTransferDetailConverter) {
        LazyMoshi lazyMoshi = goldDepositBoostTransferDetailConverter.moshi;
        Types types = Types.INSTANCE;
        return lazyMoshi.adapter(new TypeToken<GoldDepositBoostTransferDetail>() { // from class: com.robinhood.transfers.gold.GoldDepositBoostTransferDetailConverter$goldDepositBoostTransferDetailAdapter_delegate$lambda$0$$inlined$getAdapter$1
        }.getType());
    }

    public final String goldDepositBoostTransferDetailToString(GoldDepositBoostTransferDetail goldDepositBoostTransferDetail) {
        if (goldDepositBoostTransferDetail != null) {
            return getGoldDepositBoostTransferDetailAdapter().toJson(goldDepositBoostTransferDetail);
        }
        return null;
    }

    public final GoldDepositBoostTransferDetail stringToGoldDepositBoostTransferDetail(String json) {
        if (json != null) {
            return getGoldDepositBoostTransferDetailAdapter().fromJson(json);
        }
        return null;
    }
}
