package com.robinhood.utils;

import android.net.Uri;
import android.util.Size;
import com.robinhood.android.idl.common.SupplierMaps2;
import com.robinhood.android.idl.common.json.DtoJsonAdapterFactory;
import com.robinhood.enums.moshi.EnumJsonAdapterFactory;
import com.robinhood.enums.moshi.RhEnumJsonAdapterFactory;
import com.robinhood.enums.moshi.RhIntEnumJsonAdapterFactory;
import com.robinhood.g11n.jsonadapter.CountryCodeJsonAdapter;
import com.robinhood.g11n.jsonadapter.SupportedCountryCodeJsonAdapter;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.jsonadapter.BigDecimalJsonAdapterFactory;
import com.robinhood.utils.moshi.jsonadapter.BigIntegerJsonAdapterFactory;
import com.robinhood.utils.moshi.jsonadapter.CurrencyJsonAdapter;
import com.robinhood.utils.moshi.jsonadapter.HttpUrlJsonAdapter;
import com.robinhood.utils.moshi.jsonadapter.ImmutableListJsonAdapterFactory;
import com.robinhood.utils.moshi.jsonadapter.ImmutableMapJsonAdapterFactory;
import com.robinhood.utils.moshi.jsonadapter.ImmutableSetJsonAdapterFactory;
import com.robinhood.utils.moshi.jsonadapter.JsonPrimitive;
import com.robinhood.utils.moshi.jsonadapter.LocaleJsonAdapter;
import com.robinhood.utils.moshi.jsonadapter.ObjectJsonAdapter;
import com.robinhood.utils.moshi.jsonadapter.SerializeNullsJsonAdapterFactory;
import com.robinhood.utils.moshi.jsonadapter.SizeJsonAdapter;
import com.robinhood.utils.moshi.jsonadapter.UriJsonAdapter;
import com.robinhood.utils.moshi.jsonadapter.UuidJsonAdapter;
import com.robinhood.utils.moshi.jsonadapter.WrappedValue;
import com.robinhood.utils.moshi.jsonadapter.datetime.AmPmJsonAdapter;
import com.robinhood.utils.moshi.jsonadapter.datetime.InstantJsonAdapter;
import com.robinhood.utils.moshi.jsonadapter.datetime.LocalDateJsonAdapter;
import com.robinhood.utils.moshi.jsonadapter.datetime.LocalDateTimeJsonAdapter;
import com.robinhood.utils.moshi.jsonadapter.datetime.OffsetDateTimeJsonAdapter;
import com.robinhood.utils.moshi.jsonadapter.datetime.QuarterJsonAdapter;
import com.robinhood.utils.moshi.jsonadapter.datetime.YearJsonAdapter;
import com.robinhood.utils.moshi.jsonadapter.datetime.ZonedDateTimeJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapter2;
import com.squareup.wire.ProtoAdapter;
import java.util.Currency;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;
import org.threeten.extra.AmPm;
import org.threeten.extra.Quarter;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.LocalDateTime;
import p479j$.time.OffsetDateTime;
import p479j$.time.Year;
import p479j$.time.ZonedDateTime;

/* compiled from: Json.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00012'\b\u0002\u0010\u0002\u001a!\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0002\b\u00070\u0003j\u0002`\b¨\u0006\t"}, m3636d2 = {"addGenericAdapters", "Lcom/squareup/moshi/Moshi$Builder;", "protoAdapterSupplierMap", "", "", "Lkotlin/Function0;", "Lcom/squareup/wire/ProtoAdapter;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/robinhood/idl/ProtoAdapterSupplierMap;", "lib-serialization_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.JsonKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class Json2 {
    public static /* synthetic */ Moshi.Builder addGenericAdapters$default(Moshi.Builder builder, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = MapsKt.emptyMap();
        }
        return addGenericAdapters(builder, map);
    }

    public static final Moshi.Builder addGenericAdapters(Moshi.Builder builder, Map<String, Function0<ProtoAdapter<?>>> protoAdapterSupplierMap) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(protoAdapterSupplierMap, "protoAdapterSupplierMap");
        builder.add((JsonAdapter.Factory) SerializeNullsJsonAdapterFactory.INSTANCE);
        builder.add((JsonAdapter.Factory) RhEnumJsonAdapterFactory.INSTANCE);
        builder.add((JsonAdapter.Factory) RhIntEnumJsonAdapterFactory.INSTANCE);
        builder.add((JsonAdapter.Factory) BigDecimalJsonAdapterFactory.INSTANCE);
        builder.add((JsonAdapter.Factory) BigIntegerJsonAdapterFactory.INSTANCE);
        builder.add((JsonAdapter.Factory) JsonPrimitive.JsonAdapterFactory.INSTANCE);
        builder.add((JsonAdapter.Factory) ImmutableListJsonAdapterFactory.INSTANCE);
        builder.add((JsonAdapter.Factory) ImmutableMapJsonAdapterFactory.INSTANCE);
        builder.add((JsonAdapter.Factory) ImmutableSetJsonAdapterFactory.INSTANCE);
        ObjectJsonAdapter objectJsonAdapter = new ObjectJsonAdapter(Unit.INSTANCE);
        Types types = Types.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(builder.add(new TypeToken<Unit>() { // from class: com.robinhood.utils.JsonKt$addGenericAdapters$$inlined$addAdapter$1
        }.getType(), objectJsonAdapter), "add(...)");
        Intrinsics.checkNotNullExpressionValue(builder.add(new TypeToken<Uri>() { // from class: com.robinhood.utils.JsonKt$addGenericAdapters$$inlined$addAdapter$2
        }.getType(), UriJsonAdapter.INSTANCE), "add(...)");
        Intrinsics.checkNotNullExpressionValue(builder.add(new TypeToken<CountryCode>() { // from class: com.robinhood.utils.JsonKt$addGenericAdapters$$inlined$addAdapter$3
        }.getType(), CountryCodeJsonAdapter.INSTANCE), "add(...)");
        Intrinsics.checkNotNullExpressionValue(builder.add(new TypeToken<CountryCode.Supported>() { // from class: com.robinhood.utils.JsonKt$addGenericAdapters$$inlined$addAdapter$4
        }.getType(), SupportedCountryCodeJsonAdapter.INSTANCE), "add(...)");
        Intrinsics.checkNotNullExpressionValue(builder.add(new TypeToken<Size>() { // from class: com.robinhood.utils.JsonKt$addGenericAdapters$$inlined$addAdapter$5
        }.getType(), SizeJsonAdapter.INSTANCE), "add(...)");
        Intrinsics.checkNotNullExpressionValue(builder.add(new TypeToken<Currency>() { // from class: com.robinhood.utils.JsonKt$addGenericAdapters$$inlined$addAdapter$6
        }.getType(), CurrencyJsonAdapter.INSTANCE), "add(...)");
        Intrinsics.checkNotNullExpressionValue(builder.add(new TypeToken<AmPm>() { // from class: com.robinhood.utils.JsonKt$addGenericAdapters$$inlined$addAdapter$7
        }.getType(), AmPmJsonAdapter.INSTANCE), "add(...)");
        Intrinsics.checkNotNullExpressionValue(builder.add(new TypeToken<Instant>() { // from class: com.robinhood.utils.JsonKt$addGenericAdapters$$inlined$addAdapter$8
        }.getType(), InstantJsonAdapter.INSTANCE), "add(...)");
        Intrinsics.checkNotNullExpressionValue(builder.add(new TypeToken<LocalDateTime>() { // from class: com.robinhood.utils.JsonKt$addGenericAdapters$$inlined$addAdapter$9
        }.getType(), LocalDateTimeJsonAdapter.INSTANCE), "add(...)");
        Intrinsics.checkNotNullExpressionValue(builder.add(new TypeToken<LocalDate>() { // from class: com.robinhood.utils.JsonKt$addGenericAdapters$$inlined$addAdapter$10
        }.getType(), LocalDateJsonAdapter.INSTANCE), "add(...)");
        Intrinsics.checkNotNullExpressionValue(builder.add(new TypeToken<Locale>() { // from class: com.robinhood.utils.JsonKt$addGenericAdapters$$inlined$addAdapter$11
        }.getType(), LocaleJsonAdapter.INSTANCE), "add(...)");
        Intrinsics.checkNotNullExpressionValue(builder.add(new TypeToken<OffsetDateTime>() { // from class: com.robinhood.utils.JsonKt$addGenericAdapters$$inlined$addAdapter$12
        }.getType(), OffsetDateTimeJsonAdapter.INSTANCE), "add(...)");
        Intrinsics.checkNotNullExpressionValue(builder.add(new TypeToken<UUID>() { // from class: com.robinhood.utils.JsonKt$addGenericAdapters$$inlined$addAdapter$13
        }.getType(), UuidJsonAdapter.INSTANCE), "add(...)");
        Intrinsics.checkNotNullExpressionValue(builder.add(new TypeToken<ZonedDateTime>() { // from class: com.robinhood.utils.JsonKt$addGenericAdapters$$inlined$addAdapter$14
        }.getType(), ZonedDateTimeJsonAdapter.INSTANCE), "add(...)");
        Intrinsics.checkNotNullExpressionValue(builder.add(new TypeToken<Year>() { // from class: com.robinhood.utils.JsonKt$addGenericAdapters$$inlined$addAdapter$15
        }.getType(), YearJsonAdapter.INSTANCE), "add(...)");
        Intrinsics.checkNotNullExpressionValue(builder.add(new TypeToken<Quarter>() { // from class: com.robinhood.utils.JsonKt$addGenericAdapters$$inlined$addAdapter$16
        }.getType(), QuarterJsonAdapter.INSTANCE), "add(...)");
        Intrinsics.checkNotNullExpressionValue(builder.add(new TypeToken<HttpUrl>() { // from class: com.robinhood.utils.JsonKt$addGenericAdapters$$inlined$addAdapter$17
        }.getType(), HttpUrlJsonAdapter.INSTANCE), "add(...)");
        builder.addLast(WrappedValue.JsonAdapterFactory.INSTANCE);
        builder.addLast(new DtoJsonAdapterFactory());
        builder.addLast(SupplierMaps2.jsonAdapterFactory$default(protoAdapterSupplierMap, false, 1, null));
        builder.addLast(EnumJsonAdapterFactory.INSTANCE);
        builder.addLast(new KotlinJsonAdapter2());
        return builder;
    }
}
