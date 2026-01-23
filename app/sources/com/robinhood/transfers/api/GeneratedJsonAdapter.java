package com.robinhood.transfers.api;

import com.robinhood.android.models.transfer.shared.AchTransferState;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.util.Money;
import com.robinhood.transfers.api.ApiPaymentTransferDetails;
import com.robinhood.transfers.gold.ApiGoldDepositBoostTransferDetail;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;
import p479j$.time.Instant;
import p479j$.time.LocalDate;

/* compiled from: ApiPaymentTransferDetails_ApiAchTransferJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0019R\u001c\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0019R\u001c\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0019R\u001c\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0019R\u001e\u00104\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, m3636d2 = {"Lcom/robinhood/transfers/api/ApiPaymentTransferDetails_ApiAchTransferJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiAchTransfer;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiAchTransfer;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiAchTransfer;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lokhttp3/HttpUrl;", "httpUrlAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/math/BigDecimal;", "bigDecimalAdapter", "nullableStringAdapter", "j$/time/Instant", "instantAdapter", "Lcom/robinhood/models/db/TransferDirection;", "transferDirectionAdapter", "j$/time/LocalDate", "localDateAdapter", "nullableInstantAdapter", "Ljava/util/UUID;", "uUIDAdapter", "nullableUUIDAdapter", "", "booleanAdapter", "Lcom/robinhood/transfers/api/AchTransferRhsState;", "nullableAchTransferRhsStateAdapter", "Lcom/robinhood/android/models/transfer/shared/AchTransferState;", "achTransferStateAdapter", "Lcom/robinhood/models/util/Money;", "nullableMoneyAdapter", "Lcom/robinhood/transfers/api/ApiGracePeriodContent;", "nullableApiGracePeriodContentAdapter", "Lcom/robinhood/transfers/gold/ApiGoldDepositBoostTransferDetail;", "nullableApiGoldDepositBoostTransferDetailAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.transfers.api.ApiPaymentTransferDetails_ApiAchTransferJsonAdapter, reason: from toString */
/* loaded from: classes12.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<ApiPaymentTransferDetails.ApiAchTransfer> {
    private final JsonAdapter<AchTransferState> achTransferStateAdapter;
    private final JsonAdapter<BigDecimal> bigDecimalAdapter;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ApiPaymentTransferDetails.ApiAchTransfer> constructorRef;
    private final JsonAdapter<HttpUrl> httpUrlAdapter;
    private final JsonAdapter<Instant> instantAdapter;
    private final JsonAdapter<LocalDate> localDateAdapter;
    private final JsonAdapter<AchTransferRhsState> nullableAchTransferRhsStateAdapter;
    private final JsonAdapter<ApiGoldDepositBoostTransferDetail> nullableApiGoldDepositBoostTransferDetailAdapter;
    private final JsonAdapter<ApiGracePeriodContent> nullableApiGracePeriodContentAdapter;
    private final JsonAdapter<Instant> nullableInstantAdapter;
    private final JsonAdapter<Money> nullableMoneyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<UUID> nullableUUIDAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<TransferDirection> transferDirectionAdapter;
    private final JsonAdapter<UUID> uUIDAdapter;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsM3152of = JsonReader.Options.m3152of("ach_relationship", "amount", "cancel", "created_at", "direction", "early_access_amount", "expected_landing_date", "expected_landing_datetime", "expected_sweep_at", "fees", "id", "investment_schedule_id", "managed_by_ph", "rhs_state", "state", "status_description", "updated_at", "enoki_amount", "enoki_removal_fee", "clawback_amount", "clawback_amount_explanation", "grace_period_content", "gold_deposit_boost");
        Intrinsics.checkNotNullExpressionValue(optionsM3152of, "of(...)");
        this.options = optionsM3152of;
        JsonAdapter<HttpUrl> jsonAdapterAdapter = moshi.adapter(HttpUrl.class, SetsKt.emptySet(), "ach_relationship");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.httpUrlAdapter = jsonAdapterAdapter;
        JsonAdapter<BigDecimal> jsonAdapterAdapter2 = moshi.adapter(BigDecimal.class, SetsKt.emptySet(), "amount");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.bigDecimalAdapter = jsonAdapterAdapter2;
        JsonAdapter<String> jsonAdapterAdapter3 = moshi.adapter(String.class, SetsKt.emptySet(), "cancel");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.nullableStringAdapter = jsonAdapterAdapter3;
        JsonAdapter<Instant> jsonAdapterAdapter4 = moshi.adapter(Instant.class, SetsKt.emptySet(), "created_at");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "adapter(...)");
        this.instantAdapter = jsonAdapterAdapter4;
        JsonAdapter<TransferDirection> jsonAdapterAdapter5 = moshi.adapter(TransferDirection.class, SetsKt.emptySet(), "direction");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter5, "adapter(...)");
        this.transferDirectionAdapter = jsonAdapterAdapter5;
        JsonAdapter<LocalDate> jsonAdapterAdapter6 = moshi.adapter(LocalDate.class, SetsKt.emptySet(), "expected_landing_date");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter6, "adapter(...)");
        this.localDateAdapter = jsonAdapterAdapter6;
        JsonAdapter<Instant> jsonAdapterAdapter7 = moshi.adapter(Instant.class, SetsKt.emptySet(), "expected_sweep_at");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter7, "adapter(...)");
        this.nullableInstantAdapter = jsonAdapterAdapter7;
        JsonAdapter<UUID> jsonAdapterAdapter8 = moshi.adapter(UUID.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter8, "adapter(...)");
        this.uUIDAdapter = jsonAdapterAdapter8;
        JsonAdapter<UUID> jsonAdapterAdapter9 = moshi.adapter(UUID.class, SetsKt.emptySet(), "investment_schedule_id");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter9, "adapter(...)");
        this.nullableUUIDAdapter = jsonAdapterAdapter9;
        JsonAdapter<Boolean> jsonAdapterAdapter10 = moshi.adapter(Boolean.TYPE, SetsKt.emptySet(), "managed_by_ph");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter10, "adapter(...)");
        this.booleanAdapter = jsonAdapterAdapter10;
        JsonAdapter<AchTransferRhsState> jsonAdapterAdapter11 = moshi.adapter(AchTransferRhsState.class, SetsKt.emptySet(), "rhs_state");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter11, "adapter(...)");
        this.nullableAchTransferRhsStateAdapter = jsonAdapterAdapter11;
        JsonAdapter<AchTransferState> jsonAdapterAdapter12 = moshi.adapter(AchTransferState.class, SetsKt.emptySet(), "state");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter12, "adapter(...)");
        this.achTransferStateAdapter = jsonAdapterAdapter12;
        JsonAdapter<Money> jsonAdapterAdapter13 = moshi.adapter(Money.class, SetsKt.emptySet(), "enoki_amount");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter13, "adapter(...)");
        this.nullableMoneyAdapter = jsonAdapterAdapter13;
        JsonAdapter<ApiGracePeriodContent> jsonAdapterAdapter14 = moshi.adapter(ApiGracePeriodContent.class, SetsKt.emptySet(), "grace_period_content");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter14, "adapter(...)");
        this.nullableApiGracePeriodContentAdapter = jsonAdapterAdapter14;
        JsonAdapter<ApiGoldDepositBoostTransferDetail> jsonAdapterAdapter15 = moshi.adapter(ApiGoldDepositBoostTransferDetail.class, SetsKt.emptySet(), "gold_deposit_boost");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter15, "adapter(...)");
        this.nullableApiGoldDepositBoostTransferDetailAdapter = jsonAdapterAdapter15;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(62);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ApiPaymentTransferDetails.ApiAchTransfer");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public ApiPaymentTransferDetails.ApiAchTransfer fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i;
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i2 = -1;
        Boolean boolFromJson = bool;
        BigDecimal bigDecimalFromJson = null;
        UUID uuidFromJson = null;
        HttpUrl httpUrlFromJson = null;
        BigDecimal bigDecimalFromJson2 = null;
        String strFromJson = null;
        Instant instantFromJson = null;
        TransferDirection transferDirectionFromJson = null;
        BigDecimal bigDecimalFromJson3 = null;
        LocalDate localDateFromJson = null;
        Instant instantFromJson2 = null;
        Instant instantFromJson3 = null;
        UUID uuidFromJson2 = null;
        AchTransferRhsState achTransferRhsStateFromJson = null;
        AchTransferState achTransferStateFromJson = null;
        String strFromJson2 = null;
        Instant instantFromJson4 = null;
        Money moneyFromJson = null;
        Money moneyFromJson2 = null;
        Money moneyFromJson3 = null;
        String strFromJson3 = null;
        ApiGracePeriodContent apiGracePeriodContentFromJson = null;
        ApiGoldDepositBoostTransferDetail apiGoldDepositBoostTransferDetailFromJson = null;
        while (reader.hasNext()) {
            BigDecimal bigDecimal = bigDecimalFromJson;
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    httpUrlFromJson = this.httpUrlAdapter.fromJson(reader);
                    if (httpUrlFromJson == null) {
                        throw Util.unexpectedNull("ach_relationship", "ach_relationship", reader);
                    }
                    break;
                case 1:
                    bigDecimalFromJson2 = this.bigDecimalAdapter.fromJson(reader);
                    if (bigDecimalFromJson2 == null) {
                        throw Util.unexpectedNull("amount", "amount", reader);
                    }
                    break;
                case 2:
                    strFromJson = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    instantFromJson = this.instantAdapter.fromJson(reader);
                    if (instantFromJson == null) {
                        throw Util.unexpectedNull("created_at", "created_at", reader);
                    }
                    break;
                case 4:
                    transferDirectionFromJson = this.transferDirectionAdapter.fromJson(reader);
                    if (transferDirectionFromJson == null) {
                        throw Util.unexpectedNull("direction", "direction", reader);
                    }
                    break;
                case 5:
                    bigDecimalFromJson3 = this.bigDecimalAdapter.fromJson(reader);
                    if (bigDecimalFromJson3 == null) {
                        throw Util.unexpectedNull("early_access_amount", "early_access_amount", reader);
                    }
                    break;
                case 6:
                    localDateFromJson = this.localDateAdapter.fromJson(reader);
                    if (localDateFromJson == null) {
                        throw Util.unexpectedNull("expected_landing_date", "expected_landing_date", reader);
                    }
                    break;
                case 7:
                    instantFromJson2 = this.instantAdapter.fromJson(reader);
                    if (instantFromJson2 == null) {
                        throw Util.unexpectedNull("expected_landing_datetime", "expected_landing_datetime", reader);
                    }
                    break;
                case 8:
                    instantFromJson3 = this.nullableInstantAdapter.fromJson(reader);
                    break;
                case 9:
                    bigDecimalFromJson = this.bigDecimalAdapter.fromJson(reader);
                    if (bigDecimalFromJson == null) {
                        throw Util.unexpectedNull("fees", "fees", reader);
                    }
                    continue;
                case 10:
                    uuidFromJson = this.uUIDAdapter.fromJson(reader);
                    if (uuidFromJson == null) {
                        throw Util.unexpectedNull("id", "id", reader);
                    }
                    break;
                case 11:
                    uuidFromJson2 = this.nullableUUIDAdapter.fromJson(reader);
                    break;
                case 12:
                    boolFromJson = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson == null) {
                        throw Util.unexpectedNull("managed_by_ph", "managed_by_ph", reader);
                    }
                    bigDecimalFromJson = bigDecimal;
                    i2 = -4097;
                    continue;
                case 13:
                    achTransferRhsStateFromJson = this.nullableAchTransferRhsStateAdapter.fromJson(reader);
                    break;
                case 14:
                    achTransferStateFromJson = this.achTransferStateAdapter.fromJson(reader);
                    if (achTransferStateFromJson == null) {
                        throw Util.unexpectedNull("state", "state", reader);
                    }
                    break;
                case 15:
                    strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 16:
                    instantFromJson4 = this.instantAdapter.fromJson(reader);
                    if (instantFromJson4 == null) {
                        throw Util.unexpectedNull("updated_at", "updated_at", reader);
                    }
                    break;
                case 17:
                    moneyFromJson = this.nullableMoneyAdapter.fromJson(reader);
                    break;
                case 18:
                    moneyFromJson2 = this.nullableMoneyAdapter.fromJson(reader);
                    break;
                case 19:
                    moneyFromJson3 = this.nullableMoneyAdapter.fromJson(reader);
                    break;
                case 20:
                    strFromJson3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 21:
                    apiGracePeriodContentFromJson = this.nullableApiGracePeriodContentAdapter.fromJson(reader);
                    break;
                case 22:
                    apiGoldDepositBoostTransferDetailFromJson = this.nullableApiGoldDepositBoostTransferDetailAdapter.fromJson(reader);
                    break;
            }
            bigDecimalFromJson = bigDecimal;
        }
        BigDecimal bigDecimal2 = bigDecimalFromJson;
        reader.endObject();
        if (i2 == -4097) {
            if (httpUrlFromJson == null) {
                throw Util.missingProperty("ach_relationship", "ach_relationship", reader);
            }
            if (bigDecimalFromJson2 == null) {
                throw Util.missingProperty("amount", "amount", reader);
            }
            if (instantFromJson == null) {
                throw Util.missingProperty("created_at", "created_at", reader);
            }
            if (transferDirectionFromJson == null) {
                throw Util.missingProperty("direction", "direction", reader);
            }
            if (bigDecimalFromJson3 == null) {
                throw Util.missingProperty("early_access_amount", "early_access_amount", reader);
            }
            if (localDateFromJson == null) {
                throw Util.missingProperty("expected_landing_date", "expected_landing_date", reader);
            }
            if (instantFromJson2 == null) {
                throw Util.missingProperty("expected_landing_datetime", "expected_landing_datetime", reader);
            }
            if (bigDecimal2 == null) {
                throw Util.missingProperty("fees", "fees", reader);
            }
            if (uuidFromJson == null) {
                throw Util.missingProperty("id", "id", reader);
            }
            boolean zBooleanValue = boolFromJson.booleanValue();
            if (achTransferStateFromJson == null) {
                throw Util.missingProperty("state", "state", reader);
            }
            if (instantFromJson4 != null) {
                return new ApiPaymentTransferDetails.ApiAchTransfer(httpUrlFromJson, bigDecimalFromJson2, strFromJson, instantFromJson, transferDirectionFromJson, bigDecimalFromJson3, localDateFromJson, instantFromJson2, instantFromJson3, bigDecimal2, uuidFromJson, uuidFromJson2, zBooleanValue, achTransferRhsStateFromJson, achTransferStateFromJson, strFromJson2, instantFromJson4, moneyFromJson, moneyFromJson2, moneyFromJson3, strFromJson3, apiGracePeriodContentFromJson, apiGoldDepositBoostTransferDetailFromJson);
            }
            throw Util.missingProperty("updated_at", "updated_at", reader);
        }
        Constructor<ApiPaymentTransferDetails.ApiAchTransfer> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            i = i2;
            declaredConstructor = ApiPaymentTransferDetails.ApiAchTransfer.class.getDeclaredConstructor(HttpUrl.class, BigDecimal.class, String.class, Instant.class, TransferDirection.class, BigDecimal.class, LocalDate.class, Instant.class, Instant.class, BigDecimal.class, UUID.class, UUID.class, Boolean.TYPE, AchTransferRhsState.class, AchTransferState.class, String.class, Instant.class, Money.class, Money.class, Money.class, String.class, ApiGracePeriodContent.class, ApiGoldDepositBoostTransferDetail.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        } else {
            i = i2;
        }
        Constructor<ApiPaymentTransferDetails.ApiAchTransfer> constructor = declaredConstructor;
        if (httpUrlFromJson == null) {
            throw Util.missingProperty("ach_relationship", "ach_relationship", reader);
        }
        if (bigDecimalFromJson2 == null) {
            throw Util.missingProperty("amount", "amount", reader);
        }
        if (instantFromJson == null) {
            throw Util.missingProperty("created_at", "created_at", reader);
        }
        if (transferDirectionFromJson == null) {
            throw Util.missingProperty("direction", "direction", reader);
        }
        if (bigDecimalFromJson3 == null) {
            throw Util.missingProperty("early_access_amount", "early_access_amount", reader);
        }
        if (localDateFromJson == null) {
            throw Util.missingProperty("expected_landing_date", "expected_landing_date", reader);
        }
        if (instantFromJson2 == null) {
            throw Util.missingProperty("expected_landing_datetime", "expected_landing_datetime", reader);
        }
        if (bigDecimal2 == null) {
            throw Util.missingProperty("fees", "fees", reader);
        }
        if (uuidFromJson == null) {
            throw Util.missingProperty("id", "id", reader);
        }
        if (achTransferStateFromJson == null) {
            throw Util.missingProperty("state", "state", reader);
        }
        if (instantFromJson4 == null) {
            throw Util.missingProperty("updated_at", "updated_at", reader);
        }
        ApiPaymentTransferDetails.ApiAchTransfer apiAchTransferNewInstance = constructor.newInstance(httpUrlFromJson, bigDecimalFromJson2, strFromJson, instantFromJson, transferDirectionFromJson, bigDecimalFromJson3, localDateFromJson, instantFromJson2, instantFromJson3, bigDecimal2, uuidFromJson, uuidFromJson2, boolFromJson, achTransferRhsStateFromJson, achTransferStateFromJson, strFromJson2, instantFromJson4, moneyFromJson, moneyFromJson2, moneyFromJson3, strFromJson3, apiGracePeriodContentFromJson, apiGoldDepositBoostTransferDetailFromJson, Integer.valueOf(i), null);
        Intrinsics.checkNotNullExpressionValue(apiAchTransferNewInstance, "newInstance(...)");
        return apiAchTransferNewInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, ApiPaymentTransferDetails.ApiAchTransfer value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("ach_relationship");
        this.httpUrlAdapter.toJson(writer, (JsonWriter) value_.getAch_relationship());
        writer.name("amount");
        this.bigDecimalAdapter.toJson(writer, (JsonWriter) value_.getAmount());
        writer.name("cancel");
        this.nullableStringAdapter.toJson(writer, (JsonWriter) value_.getCancel());
        writer.name("created_at");
        this.instantAdapter.toJson(writer, (JsonWriter) value_.getCreated_at());
        writer.name("direction");
        this.transferDirectionAdapter.toJson(writer, (JsonWriter) value_.getDirection());
        writer.name("early_access_amount");
        this.bigDecimalAdapter.toJson(writer, (JsonWriter) value_.getEarly_access_amount());
        writer.name("expected_landing_date");
        this.localDateAdapter.toJson(writer, (JsonWriter) value_.getExpected_landing_date());
        writer.name("expected_landing_datetime");
        this.instantAdapter.toJson(writer, (JsonWriter) value_.getExpected_landing_datetime());
        writer.name("expected_sweep_at");
        this.nullableInstantAdapter.toJson(writer, (JsonWriter) value_.getExpected_sweep_at());
        writer.name("fees");
        this.bigDecimalAdapter.toJson(writer, (JsonWriter) value_.getFees());
        writer.name("id");
        this.uUIDAdapter.toJson(writer, (JsonWriter) value_.getId());
        writer.name("investment_schedule_id");
        this.nullableUUIDAdapter.toJson(writer, (JsonWriter) value_.getInvestment_schedule_id());
        writer.name("managed_by_ph");
        this.booleanAdapter.toJson(writer, (JsonWriter) Boolean.valueOf(value_.getManaged_by_ph()));
        writer.name("rhs_state");
        this.nullableAchTransferRhsStateAdapter.toJson(writer, (JsonWriter) value_.getRhs_state());
        writer.name("state");
        this.achTransferStateAdapter.toJson(writer, (JsonWriter) value_.getState());
        writer.name("status_description");
        this.nullableStringAdapter.toJson(writer, (JsonWriter) value_.getStatus_description());
        writer.name("updated_at");
        this.instantAdapter.toJson(writer, (JsonWriter) value_.getUpdated_at());
        writer.name("enoki_amount");
        this.nullableMoneyAdapter.toJson(writer, (JsonWriter) value_.getEnoki_amount());
        writer.name("enoki_removal_fee");
        this.nullableMoneyAdapter.toJson(writer, (JsonWriter) value_.getEnoki_removal_fee());
        writer.name("clawback_amount");
        this.nullableMoneyAdapter.toJson(writer, (JsonWriter) value_.getClawback_amount());
        writer.name("clawback_amount_explanation");
        this.nullableStringAdapter.toJson(writer, (JsonWriter) value_.getClawback_amount_explanation());
        writer.name("grace_period_content");
        this.nullableApiGracePeriodContentAdapter.toJson(writer, (JsonWriter) value_.getGrace_period_content());
        writer.name("gold_deposit_boost");
        this.nullableApiGoldDepositBoostTransferDetailAdapter.toJson(writer, (JsonWriter) value_.getGold_deposit_boost());
        writer.endObject();
    }
}
