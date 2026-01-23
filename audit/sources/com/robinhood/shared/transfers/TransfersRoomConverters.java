package com.robinhood.shared.transfers;

import com.robinhood.database.InjectedTypeConverter;
import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentDetailsV2;
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
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: TransfersRoomConverters.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0007J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0007R!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000f\u0010\n¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/transfers/TransfersRoomConverters;", "Lcom/robinhood/database/InjectedTypeConverter;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Lcom/robinhood/utils/moshi/LazyMoshi;)V", "paymentInstrumentDetailsV2JsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/models/paymentinstrument/db/PaymentInstrumentDetailsV2;", "getPaymentInstrumentDetailsV2JsonAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "paymentInstrumentDetailsV2JsonAdapter$delegate", "Lkotlin/Lazy;", "paymentInstrumentDetailsCroissantDetailsV2JsonAdapter", "Lcom/robinhood/models/paymentinstrument/db/PaymentInstrumentDetailsV2$CroissantBankAccount$AdditionalDetails;", "getPaymentInstrumentDetailsCroissantDetailsV2JsonAdapter", "paymentInstrumentDetailsCroissantDetailsV2JsonAdapter$delegate", "stringToPaymentInstrumentDetailsV2", "json", "", "paymentInstrumentDetailsV2ToString", ErrorBundle.DETAIL_ENTRY, "stringToPaymentInstrumentDetailsV2CroissantAdditionalDetails", "paymentInstrumentDetailsV2CroissantAdditionalDetailsToString", "lib-db_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class TransfersRoomConverters implements InjectedTypeConverter {

    /* renamed from: paymentInstrumentDetailsCroissantDetailsV2JsonAdapter$delegate, reason: from kotlin metadata */
    private final Lazy paymentInstrumentDetailsCroissantDetailsV2JsonAdapter;

    /* renamed from: paymentInstrumentDetailsV2JsonAdapter$delegate, reason: from kotlin metadata */
    private final Lazy paymentInstrumentDetailsV2JsonAdapter;

    public TransfersRoomConverters(final LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.paymentInstrumentDetailsV2JsonAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.transfers.TransfersRoomConverters$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransfersRoomConverters.paymentInstrumentDetailsV2JsonAdapter_delegate$lambda$0(moshi);
            }
        });
        this.paymentInstrumentDetailsCroissantDetailsV2JsonAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.transfers.TransfersRoomConverters$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransfersRoomConverters.m2959x7e9532a6(moshi);
            }
        });
    }

    private final JsonAdapter<PaymentInstrumentDetailsV2> getPaymentInstrumentDetailsV2JsonAdapter() {
        return (JsonAdapter) this.paymentInstrumentDetailsV2JsonAdapter.getValue();
    }

    private final JsonAdapter<PaymentInstrumentDetailsV2.CroissantBankAccount.AdditionalDetails> getPaymentInstrumentDetailsCroissantDetailsV2JsonAdapter() {
        return (JsonAdapter) this.paymentInstrumentDetailsCroissantDetailsV2JsonAdapter.getValue();
    }

    public final PaymentInstrumentDetailsV2 stringToPaymentInstrumentDetailsV2(String json) {
        if (json != null) {
            return getPaymentInstrumentDetailsV2JsonAdapter().fromJson(json);
        }
        return null;
    }

    public final String paymentInstrumentDetailsV2ToString(PaymentInstrumentDetailsV2 details) {
        if (details != null) {
            return getPaymentInstrumentDetailsV2JsonAdapter().toJson(details);
        }
        return null;
    }

    public final PaymentInstrumentDetailsV2.CroissantBankAccount.AdditionalDetails stringToPaymentInstrumentDetailsV2CroissantAdditionalDetails(String json) {
        if (json != null) {
            return getPaymentInstrumentDetailsCroissantDetailsV2JsonAdapter().fromJson(json);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: paymentInstrumentDetailsCroissantDetailsV2JsonAdapter_delegate$lambda$1 */
    public static final JsonAdapter m2959x7e9532a6(LazyMoshi lazyMoshi) {
        Types types = Types.INSTANCE;
        return lazyMoshi.adapter(new TypeToken<PaymentInstrumentDetailsV2.CroissantBankAccount.AdditionalDetails>() { // from class: com.robinhood.shared.transfers.TransfersRoomConverters$paymentInstrumentDetailsCroissantDetailsV2JsonAdapter_delegate$lambda$1$$inlined$getAdapter$1
        }.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAdapter paymentInstrumentDetailsV2JsonAdapter_delegate$lambda$0(LazyMoshi lazyMoshi) {
        Types types = Types.INSTANCE;
        return lazyMoshi.adapter(new TypeToken<PaymentInstrumentDetailsV2>() { // from class: com.robinhood.shared.transfers.TransfersRoomConverters$paymentInstrumentDetailsV2JsonAdapter_delegate$lambda$0$$inlined$getAdapter$1
        }.getType());
    }

    public final String paymentInstrumentDetailsV2CroissantAdditionalDetailsToString(PaymentInstrumentDetailsV2.CroissantBankAccount.AdditionalDetails details) {
        if (details != null) {
            return getPaymentInstrumentDetailsCroissantDetailsV2JsonAdapter().toJson(details);
        }
        return null;
    }
}
