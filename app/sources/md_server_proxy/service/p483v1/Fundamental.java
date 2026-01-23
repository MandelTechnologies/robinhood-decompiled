package md_server_proxy.service.p483v1;

import com.robinhood.android.sdui.chartgroup.SduiChartZoomTransformer;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: Fundamental.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 ]2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001]B\u0097\u0003\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010%\u001a\u00020\u0004\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010)\u001a\u00020*¢\u0006\u0004\b+\u0010,J\b\u0010T\u001a\u00020\u0002H\u0017J\u0013\u0010U\u001a\u00020V2\b\u0010W\u001a\u0004\u0018\u00010XH\u0096\u0002J\b\u0010Y\u001a\u00020\u001fH\u0016J\b\u0010Z\u001a\u00020\u0004H\u0016J\u009b\u0003\u0010[\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00042\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010%\u001a\u00020\u00042\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010)\u001a\u00020*¢\u0006\u0002\u0010\\R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010.R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010.R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010.R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010.R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010.R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010.R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010.R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010.R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010.R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010.R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010.R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010.R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010.R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010.R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010.R\u0016\u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010.R\u0016\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010.R\u0016\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010.R\u0016\u0010\u001a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010.R\u0016\u0010\u001b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010.R\u0016\u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010.R\u0016\u0010\u001d\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010.R\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010J\u001a\u0004\bH\u0010IR\u001a\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010J\u001a\u0004\bK\u0010IR\u0018\u0010!\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010.R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010.R\u0018\u0010#\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010.R\u0018\u0010$\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010.R\u0016\u0010%\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010.R\u0018\u0010&\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0018\u0010(\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010.¨\u0006^"}, m3636d2 = {"Lmd_server_proxy/service/v1/Fundamental;", "Lcom/squareup/wire/Message;", "", "open", "", "high", "low", SduiChartZoomTransformer.VOLUME_IDENTIFIER, "bounds", "Lmd_server_proxy/service/v1/Bounds;", "average_volume_2_weeks", "average_volume_52_weeks", "average_volume_30_days", "high_52_weeks", "high_52_weeks_date", "dividend_yield", "float", "low_52_weeks", "low_52_weeks_date", "market_cap", "pb_ratio", "pe_ratio", "shares_outstanding", "description", "instrument", "ceo", "headquarters_city", "headquarters_state", "sector", "industry", "num_employees", "", "year_founded", "payable_date", "ex_dividend_date", "financial_status_indicator", "financial_status_description", "instrument_id", "key_info_document", "Lmd_server_proxy/service/v1/KeyInfoDocument;", "overnight_volume", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmd_server_proxy/service/v1/Bounds;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmd_server_proxy/service/v1/KeyInfoDocument;Ljava/lang/String;Lokio/ByteString;)V", "getOpen", "()Ljava/lang/String;", "getHigh", "getLow", "getVolume", "getBounds", "()Lmd_server_proxy/service/v1/Bounds;", "getAverage_volume_2_weeks", "getAverage_volume_52_weeks", "getAverage_volume_30_days", "getHigh_52_weeks", "getHigh_52_weeks_date", "getDividend_yield", "getFloat", "getLow_52_weeks", "getLow_52_weeks_date", "getMarket_cap", "getPb_ratio", "getPe_ratio", "getShares_outstanding", "getDescription", "getInstrument", "getCeo", "getHeadquarters_city", "getHeadquarters_state", "getSector", "getIndustry", "getNum_employees", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getYear_founded", "getPayable_date", "getEx_dividend_date", "getFinancial_status_indicator", "getFinancial_status_description", "getInstrument_id", "getKey_info_document", "()Lmd_server_proxy/service/v1/KeyInfoDocument;", "getOvernight_volume", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmd_server_proxy/service/v1/Bounds;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmd_server_proxy/service/v1/KeyInfoDocument;Ljava/lang/String;Lokio/ByteString;)Lmd_server_proxy/service/v1/Fundamental;", "Companion", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class Fundamental extends Message {

    @JvmField
    public static final ProtoAdapter<Fundamental> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "averageVolume2Weeks", schemaIndex = 5, tag = 6)
    private final String average_volume_2_weeks;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "averageVolume30Days", schemaIndex = 7, tag = 8)
    private final String average_volume_30_days;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "averageVolume52Weeks", schemaIndex = 6, tag = 7)
    private final String average_volume_52_weeks;

    @WireField(adapter = "md_server_proxy.service.v1.Bounds#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Bounds bounds;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 21)
    private final String ceo;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 19)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "dividendYield", schemaIndex = 10, tag = 11)
    private final String dividend_yield;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "exDividendDate", schemaIndex = 28, tag = 29)
    private final String ex_dividend_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "financialStatusDescription", schemaIndex = 30, tag = 31)
    private final String financial_status_description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "financialStatusIndicator", schemaIndex = 29, tag = 30)
    private final String financial_status_indicator;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 11, tag = 12)
    private final String float;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "headquartersCity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 21, tag = 22)
    private final String headquarters_city;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "headquartersState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 22, tag = 23)
    private final String headquarters_state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String high;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "high52Weeks", schemaIndex = 8, tag = 9)
    private final String high_52_weeks;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "high52WeeksDate", schemaIndex = 9, tag = 10)
    private final String high_52_weeks_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 24, tag = 25)
    private final String industry;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 20)
    private final String instrument;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 31, tag = 32)
    private final String instrument_id;

    @WireField(adapter = "md_server_proxy.service.v1.KeyInfoDocument#ADAPTER", jsonName = "keyInfoDocument", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 32, tag = 33)
    private final KeyInfoDocument key_info_document;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final String low;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "low52Weeks", schemaIndex = 12, tag = 13)
    private final String low_52_weeks;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "low52WeeksDate", schemaIndex = 13, tag = 14)
    private final String low_52_weeks_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "marketCap", schemaIndex = 14, tag = 15)
    private final String market_cap;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "numEmployees", schemaIndex = 25, tag = 26)
    private final Integer num_employees;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final String open;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "overnightVolume", schemaIndex = 33, tag = 34)
    private final String overnight_volume;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "payableDate", schemaIndex = 27, tag = 28)
    private final String payable_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "pbRatio", schemaIndex = 15, tag = 16)
    private final String pb_ratio;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "peRatio", schemaIndex = 16, tag = 17)
    private final String pe_ratio;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 23, tag = 24)
    private final String sector;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sharesOutstanding", schemaIndex = 17, tag = 18)
    private final String shares_outstanding;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    private final String volume;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "yearFounded", schemaIndex = 26, tag = 27)
    private final Integer year_founded;

    public Fundamental() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28913newBuilder();
    }

    public final String getOpen() {
        return this.open;
    }

    public final String getHigh() {
        return this.high;
    }

    public final String getLow() {
        return this.low;
    }

    public final String getVolume() {
        return this.volume;
    }

    public final Bounds getBounds() {
        return this.bounds;
    }

    public /* synthetic */ Fundamental(String str, String str2, String str3, String str4, Bounds bounds, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, Integer num, Integer num2, String str25, String str26, String str27, String str28, String str29, KeyInfoDocument keyInfoDocument, String str30, ByteString byteString, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? Bounds.BOUNDS_UNSPECIFIED : bounds, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : str13, (i & 16384) != 0 ? null : str14, (i & 32768) != 0 ? null : str15, (i & 65536) != 0 ? null : str16, (i & 131072) != 0 ? null : str17, (i & 262144) != 0 ? "" : str18, (i & 524288) != 0 ? "" : str19, (i & 1048576) != 0 ? "" : str20, (i & 2097152) != 0 ? "" : str21, (i & 4194304) != 0 ? "" : str22, (i & 8388608) != 0 ? "" : str23, (i & 16777216) != 0 ? "" : str24, (i & 33554432) != 0 ? null : num, (i & 67108864) != 0 ? null : num2, (i & 134217728) != 0 ? null : str25, (i & 268435456) != 0 ? null : str26, (i & 536870912) != 0 ? null : str27, (i & 1073741824) != 0 ? null : str28, (i & Integer.MIN_VALUE) == 0 ? str29 : "", (i2 & 1) != 0 ? null : keyInfoDocument, (i2 & 2) != 0 ? null : str30, (i2 & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getAverage_volume_2_weeks() {
        return this.average_volume_2_weeks;
    }

    public final String getAverage_volume_52_weeks() {
        return this.average_volume_52_weeks;
    }

    public final String getAverage_volume_30_days() {
        return this.average_volume_30_days;
    }

    public final String getHigh_52_weeks() {
        return this.high_52_weeks;
    }

    public final String getHigh_52_weeks_date() {
        return this.high_52_weeks_date;
    }

    public final String getDividend_yield() {
        return this.dividend_yield;
    }

    public final String getFloat() {
        return this.float;
    }

    public final String getLow_52_weeks() {
        return this.low_52_weeks;
    }

    public final String getLow_52_weeks_date() {
        return this.low_52_weeks_date;
    }

    public final String getMarket_cap() {
        return this.market_cap;
    }

    public final String getPb_ratio() {
        return this.pb_ratio;
    }

    public final String getPe_ratio() {
        return this.pe_ratio;
    }

    public final String getShares_outstanding() {
        return this.shares_outstanding;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getInstrument() {
        return this.instrument;
    }

    public final String getCeo() {
        return this.ceo;
    }

    public final String getHeadquarters_city() {
        return this.headquarters_city;
    }

    public final String getHeadquarters_state() {
        return this.headquarters_state;
    }

    public final String getSector() {
        return this.sector;
    }

    public final String getIndustry() {
        return this.industry;
    }

    public final Integer getNum_employees() {
        return this.num_employees;
    }

    public final Integer getYear_founded() {
        return this.year_founded;
    }

    public final String getPayable_date() {
        return this.payable_date;
    }

    public final String getEx_dividend_date() {
        return this.ex_dividend_date;
    }

    public final String getFinancial_status_indicator() {
        return this.financial_status_indicator;
    }

    public final String getFinancial_status_description() {
        return this.financial_status_description;
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final KeyInfoDocument getKey_info_document() {
        return this.key_info_document;
    }

    public final String getOvernight_volume() {
        return this.overnight_volume;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fundamental(String str, String str2, String str3, String str4, Bounds bounds, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String description, String instrument, String ceo, String headquarters_city, String headquarters_state, String sector, String industry, Integer num, Integer num2, String str18, String str19, String str20, String str21, String instrument_id, KeyInfoDocument keyInfoDocument, String str22, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(ceo, "ceo");
        Intrinsics.checkNotNullParameter(headquarters_city, "headquarters_city");
        Intrinsics.checkNotNullParameter(headquarters_state, "headquarters_state");
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(industry, "industry");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.open = str;
        this.high = str2;
        this.low = str3;
        this.volume = str4;
        this.bounds = bounds;
        this.average_volume_2_weeks = str5;
        this.average_volume_52_weeks = str6;
        this.average_volume_30_days = str7;
        this.high_52_weeks = str8;
        this.high_52_weeks_date = str9;
        this.dividend_yield = str10;
        this.float = str11;
        this.low_52_weeks = str12;
        this.low_52_weeks_date = str13;
        this.market_cap = str14;
        this.pb_ratio = str15;
        this.pe_ratio = str16;
        this.shares_outstanding = str17;
        this.description = description;
        this.instrument = instrument;
        this.ceo = ceo;
        this.headquarters_city = headquarters_city;
        this.headquarters_state = headquarters_state;
        this.sector = sector;
        this.industry = industry;
        this.num_employees = num;
        this.year_founded = num2;
        this.payable_date = str18;
        this.ex_dividend_date = str19;
        this.financial_status_indicator = str20;
        this.financial_status_description = str21;
        this.instrument_id = instrument_id;
        this.key_info_document = keyInfoDocument;
        this.overnight_volume = str22;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28913newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Fundamental)) {
            return false;
        }
        Fundamental fundamental = (Fundamental) other;
        return Intrinsics.areEqual(unknownFields(), fundamental.unknownFields()) && Intrinsics.areEqual(this.open, fundamental.open) && Intrinsics.areEqual(this.high, fundamental.high) && Intrinsics.areEqual(this.low, fundamental.low) && Intrinsics.areEqual(this.volume, fundamental.volume) && this.bounds == fundamental.bounds && Intrinsics.areEqual(this.average_volume_2_weeks, fundamental.average_volume_2_weeks) && Intrinsics.areEqual(this.average_volume_52_weeks, fundamental.average_volume_52_weeks) && Intrinsics.areEqual(this.average_volume_30_days, fundamental.average_volume_30_days) && Intrinsics.areEqual(this.high_52_weeks, fundamental.high_52_weeks) && Intrinsics.areEqual(this.high_52_weeks_date, fundamental.high_52_weeks_date) && Intrinsics.areEqual(this.dividend_yield, fundamental.dividend_yield) && Intrinsics.areEqual(this.float, fundamental.float) && Intrinsics.areEqual(this.low_52_weeks, fundamental.low_52_weeks) && Intrinsics.areEqual(this.low_52_weeks_date, fundamental.low_52_weeks_date) && Intrinsics.areEqual(this.market_cap, fundamental.market_cap) && Intrinsics.areEqual(this.pb_ratio, fundamental.pb_ratio) && Intrinsics.areEqual(this.pe_ratio, fundamental.pe_ratio) && Intrinsics.areEqual(this.shares_outstanding, fundamental.shares_outstanding) && Intrinsics.areEqual(this.description, fundamental.description) && Intrinsics.areEqual(this.instrument, fundamental.instrument) && Intrinsics.areEqual(this.ceo, fundamental.ceo) && Intrinsics.areEqual(this.headquarters_city, fundamental.headquarters_city) && Intrinsics.areEqual(this.headquarters_state, fundamental.headquarters_state) && Intrinsics.areEqual(this.sector, fundamental.sector) && Intrinsics.areEqual(this.industry, fundamental.industry) && Intrinsics.areEqual(this.num_employees, fundamental.num_employees) && Intrinsics.areEqual(this.year_founded, fundamental.year_founded) && Intrinsics.areEqual(this.payable_date, fundamental.payable_date) && Intrinsics.areEqual(this.ex_dividend_date, fundamental.ex_dividend_date) && Intrinsics.areEqual(this.financial_status_indicator, fundamental.financial_status_indicator) && Intrinsics.areEqual(this.financial_status_description, fundamental.financial_status_description) && Intrinsics.areEqual(this.instrument_id, fundamental.instrument_id) && Intrinsics.areEqual(this.key_info_document, fundamental.key_info_document) && Intrinsics.areEqual(this.overnight_volume, fundamental.overnight_volume);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.open;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.high;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.low;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.volume;
        int iHashCode5 = (((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37) + this.bounds.hashCode()) * 37;
        String str5 = this.average_volume_2_weeks;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.average_volume_52_weeks;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.average_volume_30_days;
        int iHashCode8 = (iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.high_52_weeks;
        int iHashCode9 = (iHashCode8 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.high_52_weeks_date;
        int iHashCode10 = (iHashCode9 + (str9 != null ? str9.hashCode() : 0)) * 37;
        String str10 = this.dividend_yield;
        int iHashCode11 = (iHashCode10 + (str10 != null ? str10.hashCode() : 0)) * 37;
        String str11 = this.float;
        int iHashCode12 = (iHashCode11 + (str11 != null ? str11.hashCode() : 0)) * 37;
        String str12 = this.low_52_weeks;
        int iHashCode13 = (iHashCode12 + (str12 != null ? str12.hashCode() : 0)) * 37;
        String str13 = this.low_52_weeks_date;
        int iHashCode14 = (iHashCode13 + (str13 != null ? str13.hashCode() : 0)) * 37;
        String str14 = this.market_cap;
        int iHashCode15 = (iHashCode14 + (str14 != null ? str14.hashCode() : 0)) * 37;
        String str15 = this.pb_ratio;
        int iHashCode16 = (iHashCode15 + (str15 != null ? str15.hashCode() : 0)) * 37;
        String str16 = this.pe_ratio;
        int iHashCode17 = (iHashCode16 + (str16 != null ? str16.hashCode() : 0)) * 37;
        String str17 = this.shares_outstanding;
        int iHashCode18 = (((((((((((((((iHashCode17 + (str17 != null ? str17.hashCode() : 0)) * 37) + this.description.hashCode()) * 37) + this.instrument.hashCode()) * 37) + this.ceo.hashCode()) * 37) + this.headquarters_city.hashCode()) * 37) + this.headquarters_state.hashCode()) * 37) + this.sector.hashCode()) * 37) + this.industry.hashCode()) * 37;
        Integer num = this.num_employees;
        int iHashCode19 = (iHashCode18 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.year_founded;
        int iHashCode20 = (iHashCode19 + (num2 != null ? num2.hashCode() : 0)) * 37;
        String str18 = this.payable_date;
        int iHashCode21 = (iHashCode20 + (str18 != null ? str18.hashCode() : 0)) * 37;
        String str19 = this.ex_dividend_date;
        int iHashCode22 = (iHashCode21 + (str19 != null ? str19.hashCode() : 0)) * 37;
        String str20 = this.financial_status_indicator;
        int iHashCode23 = (iHashCode22 + (str20 != null ? str20.hashCode() : 0)) * 37;
        String str21 = this.financial_status_description;
        int iHashCode24 = (((iHashCode23 + (str21 != null ? str21.hashCode() : 0)) * 37) + this.instrument_id.hashCode()) * 37;
        KeyInfoDocument keyInfoDocument = this.key_info_document;
        int iHashCode25 = (iHashCode24 + (keyInfoDocument != null ? keyInfoDocument.hashCode() : 0)) * 37;
        String str22 = this.overnight_volume;
        int iHashCode26 = iHashCode25 + (str22 != null ? str22.hashCode() : 0);
        this.hashCode = iHashCode26;
        return iHashCode26;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.open;
        if (str != null) {
            arrayList.add("open=" + Internal.sanitize(str));
        }
        String str2 = this.high;
        if (str2 != null) {
            arrayList.add("high=" + Internal.sanitize(str2));
        }
        String str3 = this.low;
        if (str3 != null) {
            arrayList.add("low=" + Internal.sanitize(str3));
        }
        String str4 = this.volume;
        if (str4 != null) {
            arrayList.add("volume=" + Internal.sanitize(str4));
        }
        arrayList.add("bounds=" + this.bounds);
        String str5 = this.average_volume_2_weeks;
        if (str5 != null) {
            arrayList.add("average_volume_2_weeks=" + Internal.sanitize(str5));
        }
        String str6 = this.average_volume_52_weeks;
        if (str6 != null) {
            arrayList.add("average_volume_52_weeks=" + Internal.sanitize(str6));
        }
        String str7 = this.average_volume_30_days;
        if (str7 != null) {
            arrayList.add("average_volume_30_days=" + Internal.sanitize(str7));
        }
        String str8 = this.high_52_weeks;
        if (str8 != null) {
            arrayList.add("high_52_weeks=" + Internal.sanitize(str8));
        }
        String str9 = this.high_52_weeks_date;
        if (str9 != null) {
            arrayList.add("high_52_weeks_date=" + Internal.sanitize(str9));
        }
        String str10 = this.dividend_yield;
        if (str10 != null) {
            arrayList.add("dividend_yield=" + Internal.sanitize(str10));
        }
        String str11 = this.float;
        if (str11 != null) {
            arrayList.add("float=" + Internal.sanitize(str11));
        }
        String str12 = this.low_52_weeks;
        if (str12 != null) {
            arrayList.add("low_52_weeks=" + Internal.sanitize(str12));
        }
        String str13 = this.low_52_weeks_date;
        if (str13 != null) {
            arrayList.add("low_52_weeks_date=" + Internal.sanitize(str13));
        }
        String str14 = this.market_cap;
        if (str14 != null) {
            arrayList.add("market_cap=" + Internal.sanitize(str14));
        }
        String str15 = this.pb_ratio;
        if (str15 != null) {
            arrayList.add("pb_ratio=" + Internal.sanitize(str15));
        }
        String str16 = this.pe_ratio;
        if (str16 != null) {
            arrayList.add("pe_ratio=" + Internal.sanitize(str16));
        }
        String str17 = this.shares_outstanding;
        if (str17 != null) {
            arrayList.add("shares_outstanding=" + Internal.sanitize(str17));
        }
        arrayList.add("description=" + Internal.sanitize(this.description));
        arrayList.add("instrument=" + Internal.sanitize(this.instrument));
        arrayList.add("ceo=" + Internal.sanitize(this.ceo));
        arrayList.add("headquarters_city=" + Internal.sanitize(this.headquarters_city));
        arrayList.add("headquarters_state=" + Internal.sanitize(this.headquarters_state));
        arrayList.add("sector=" + Internal.sanitize(this.sector));
        arrayList.add("industry=" + Internal.sanitize(this.industry));
        Integer num = this.num_employees;
        if (num != null) {
            arrayList.add("num_employees=" + num);
        }
        Integer num2 = this.year_founded;
        if (num2 != null) {
            arrayList.add("year_founded=" + num2);
        }
        String str18 = this.payable_date;
        if (str18 != null) {
            arrayList.add("payable_date=" + Internal.sanitize(str18));
        }
        String str19 = this.ex_dividend_date;
        if (str19 != null) {
            arrayList.add("ex_dividend_date=" + Internal.sanitize(str19));
        }
        String str20 = this.financial_status_indicator;
        if (str20 != null) {
            arrayList.add("financial_status_indicator=" + Internal.sanitize(str20));
        }
        String str21 = this.financial_status_description;
        if (str21 != null) {
            arrayList.add("financial_status_description=" + Internal.sanitize(str21));
        }
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        KeyInfoDocument keyInfoDocument = this.key_info_document;
        if (keyInfoDocument != null) {
            arrayList.add("key_info_document=" + keyInfoDocument);
        }
        String str22 = this.overnight_volume;
        if (str22 != null) {
            arrayList.add("overnight_volume=" + Internal.sanitize(str22));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Fundamental{", "}", 0, null, null, 56, null);
    }

    public final Fundamental copy(String open, String high, String low, String volume, Bounds bounds, String average_volume_2_weeks, String average_volume_52_weeks, String average_volume_30_days, String high_52_weeks, String high_52_weeks_date, String dividend_yield, String str, String low_52_weeks, String low_52_weeks_date, String market_cap, String pb_ratio, String pe_ratio, String shares_outstanding, String description, String instrument, String ceo, String headquarters_city, String headquarters_state, String sector, String industry, Integer num_employees, Integer year_founded, String payable_date, String ex_dividend_date, String financial_status_indicator, String financial_status_description, String instrument_id, KeyInfoDocument key_info_document, String overnight_volume, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(ceo, "ceo");
        Intrinsics.checkNotNullParameter(headquarters_city, "headquarters_city");
        Intrinsics.checkNotNullParameter(headquarters_state, "headquarters_state");
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(industry, "industry");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Fundamental(open, high, low, volume, bounds, average_volume_2_weeks, average_volume_52_weeks, average_volume_30_days, high_52_weeks, high_52_weeks_date, dividend_yield, str, low_52_weeks, low_52_weeks_date, market_cap, pb_ratio, pe_ratio, shares_outstanding, description, instrument, ceo, headquarters_city, headquarters_state, sector, industry, num_employees, year_founded, payable_date, ex_dividend_date, financial_status_indicator, financial_status_description, instrument_id, key_info_document, overnight_volume, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Fundamental.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Fundamental>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: md_server_proxy.service.v1.Fundamental$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Fundamental value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(1, value.getOpen()) + protoAdapter.encodedSizeWithTag(2, value.getHigh()) + protoAdapter.encodedSizeWithTag(3, value.getLow()) + protoAdapter.encodedSizeWithTag(4, value.getVolume());
                if (value.getBounds() != Bounds.BOUNDS_UNSPECIFIED) {
                    iEncodedSizeWithTag += Bounds.ADAPTER.encodedSizeWithTag(5, value.getBounds());
                }
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(6, value.getAverage_volume_2_weeks()) + protoAdapter.encodedSizeWithTag(7, value.getAverage_volume_52_weeks()) + protoAdapter.encodedSizeWithTag(8, value.getAverage_volume_30_days()) + protoAdapter.encodedSizeWithTag(9, value.getHigh_52_weeks()) + protoAdapter.encodedSizeWithTag(10, value.getHigh_52_weeks_date()) + protoAdapter.encodedSizeWithTag(11, value.getDividend_yield()) + protoAdapter.encodedSizeWithTag(12, value.getFloat()) + protoAdapter.encodedSizeWithTag(13, value.getLow_52_weeks()) + protoAdapter.encodedSizeWithTag(14, value.getLow_52_weeks_date()) + protoAdapter.encodedSizeWithTag(15, value.getMarket_cap()) + protoAdapter.encodedSizeWithTag(16, value.getPb_ratio()) + protoAdapter.encodedSizeWithTag(17, value.getPe_ratio()) + protoAdapter.encodedSizeWithTag(18, value.getShares_outstanding());
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    iEncodedSizeWithTag2 += protoAdapter.encodedSizeWithTag(19, value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getInstrument(), "")) {
                    iEncodedSizeWithTag2 += protoAdapter.encodedSizeWithTag(20, value.getInstrument());
                }
                if (!Intrinsics.areEqual(value.getCeo(), "")) {
                    iEncodedSizeWithTag2 += protoAdapter.encodedSizeWithTag(21, value.getCeo());
                }
                if (!Intrinsics.areEqual(value.getHeadquarters_city(), "")) {
                    iEncodedSizeWithTag2 += protoAdapter.encodedSizeWithTag(22, value.getHeadquarters_city());
                }
                if (!Intrinsics.areEqual(value.getHeadquarters_state(), "")) {
                    iEncodedSizeWithTag2 += protoAdapter.encodedSizeWithTag(23, value.getHeadquarters_state());
                }
                if (!Intrinsics.areEqual(value.getSector(), "")) {
                    iEncodedSizeWithTag2 += protoAdapter.encodedSizeWithTag(24, value.getSector());
                }
                if (!Intrinsics.areEqual(value.getIndustry(), "")) {
                    iEncodedSizeWithTag2 += protoAdapter.encodedSizeWithTag(25, value.getIndustry());
                }
                ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
                int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(26, value.getNum_employees()) + protoAdapter2.encodedSizeWithTag(27, value.getYear_founded()) + protoAdapter.encodedSizeWithTag(28, value.getPayable_date()) + protoAdapter.encodedSizeWithTag(29, value.getEx_dividend_date()) + protoAdapter.encodedSizeWithTag(30, value.getFinancial_status_indicator()) + protoAdapter.encodedSizeWithTag(31, value.getFinancial_status_description());
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    iEncodedSizeWithTag3 += protoAdapter.encodedSizeWithTag(32, value.getInstrument_id());
                }
                if (value.getKey_info_document() != null) {
                    iEncodedSizeWithTag3 += KeyInfoDocument.ADAPTER.encodedSizeWithTag(33, value.getKey_info_document());
                }
                return iEncodedSizeWithTag3 + protoAdapter.encodedSizeWithTag(34, value.getOvernight_volume());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Fundamental value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getOpen());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getHigh());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getLow());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getVolume());
                if (value.getBounds() != Bounds.BOUNDS_UNSPECIFIED) {
                    Bounds.ADAPTER.encodeWithTag(writer, 5, (int) value.getBounds());
                }
                protoAdapter.encodeWithTag(writer, 6, (int) value.getAverage_volume_2_weeks());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getAverage_volume_52_weeks());
                protoAdapter.encodeWithTag(writer, 8, (int) value.getAverage_volume_30_days());
                protoAdapter.encodeWithTag(writer, 9, (int) value.getHigh_52_weeks());
                protoAdapter.encodeWithTag(writer, 10, (int) value.getHigh_52_weeks_date());
                protoAdapter.encodeWithTag(writer, 11, (int) value.getDividend_yield());
                protoAdapter.encodeWithTag(writer, 12, (int) value.getFloat());
                protoAdapter.encodeWithTag(writer, 13, (int) value.getLow_52_weeks());
                protoAdapter.encodeWithTag(writer, 14, (int) value.getLow_52_weeks_date());
                protoAdapter.encodeWithTag(writer, 15, (int) value.getMarket_cap());
                protoAdapter.encodeWithTag(writer, 16, (int) value.getPb_ratio());
                protoAdapter.encodeWithTag(writer, 17, (int) value.getPe_ratio());
                protoAdapter.encodeWithTag(writer, 18, (int) value.getShares_outstanding());
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    protoAdapter.encodeWithTag(writer, 19, (int) value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getInstrument(), "")) {
                    protoAdapter.encodeWithTag(writer, 20, (int) value.getInstrument());
                }
                if (!Intrinsics.areEqual(value.getCeo(), "")) {
                    protoAdapter.encodeWithTag(writer, 21, (int) value.getCeo());
                }
                if (!Intrinsics.areEqual(value.getHeadquarters_city(), "")) {
                    protoAdapter.encodeWithTag(writer, 22, (int) value.getHeadquarters_city());
                }
                if (!Intrinsics.areEqual(value.getHeadquarters_state(), "")) {
                    protoAdapter.encodeWithTag(writer, 23, (int) value.getHeadquarters_state());
                }
                if (!Intrinsics.areEqual(value.getSector(), "")) {
                    protoAdapter.encodeWithTag(writer, 24, (int) value.getSector());
                }
                if (!Intrinsics.areEqual(value.getIndustry(), "")) {
                    protoAdapter.encodeWithTag(writer, 25, (int) value.getIndustry());
                }
                ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
                protoAdapter2.encodeWithTag(writer, 26, (int) value.getNum_employees());
                protoAdapter2.encodeWithTag(writer, 27, (int) value.getYear_founded());
                protoAdapter.encodeWithTag(writer, 28, (int) value.getPayable_date());
                protoAdapter.encodeWithTag(writer, 29, (int) value.getEx_dividend_date());
                protoAdapter.encodeWithTag(writer, 30, (int) value.getFinancial_status_indicator());
                protoAdapter.encodeWithTag(writer, 31, (int) value.getFinancial_status_description());
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 32, (int) value.getInstrument_id());
                }
                if (value.getKey_info_document() != null) {
                    KeyInfoDocument.ADAPTER.encodeWithTag(writer, 33, (int) value.getKey_info_document());
                }
                protoAdapter.encodeWithTag(writer, 34, (int) value.getOvernight_volume());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Fundamental value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 34, (int) value.getOvernight_volume());
                if (value.getKey_info_document() != null) {
                    KeyInfoDocument.ADAPTER.encodeWithTag(writer, 33, (int) value.getKey_info_document());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 32, (int) value.getInstrument_id());
                }
                protoAdapter.encodeWithTag(writer, 31, (int) value.getFinancial_status_description());
                protoAdapter.encodeWithTag(writer, 30, (int) value.getFinancial_status_indicator());
                protoAdapter.encodeWithTag(writer, 29, (int) value.getEx_dividend_date());
                protoAdapter.encodeWithTag(writer, 28, (int) value.getPayable_date());
                ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
                protoAdapter2.encodeWithTag(writer, 27, (int) value.getYear_founded());
                protoAdapter2.encodeWithTag(writer, 26, (int) value.getNum_employees());
                if (!Intrinsics.areEqual(value.getIndustry(), "")) {
                    protoAdapter.encodeWithTag(writer, 25, (int) value.getIndustry());
                }
                if (!Intrinsics.areEqual(value.getSector(), "")) {
                    protoAdapter.encodeWithTag(writer, 24, (int) value.getSector());
                }
                if (!Intrinsics.areEqual(value.getHeadquarters_state(), "")) {
                    protoAdapter.encodeWithTag(writer, 23, (int) value.getHeadquarters_state());
                }
                if (!Intrinsics.areEqual(value.getHeadquarters_city(), "")) {
                    protoAdapter.encodeWithTag(writer, 22, (int) value.getHeadquarters_city());
                }
                if (!Intrinsics.areEqual(value.getCeo(), "")) {
                    protoAdapter.encodeWithTag(writer, 21, (int) value.getCeo());
                }
                if (!Intrinsics.areEqual(value.getInstrument(), "")) {
                    protoAdapter.encodeWithTag(writer, 20, (int) value.getInstrument());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    protoAdapter.encodeWithTag(writer, 19, (int) value.getDescription());
                }
                protoAdapter.encodeWithTag(writer, 18, (int) value.getShares_outstanding());
                protoAdapter.encodeWithTag(writer, 17, (int) value.getPe_ratio());
                protoAdapter.encodeWithTag(writer, 16, (int) value.getPb_ratio());
                protoAdapter.encodeWithTag(writer, 15, (int) value.getMarket_cap());
                protoAdapter.encodeWithTag(writer, 14, (int) value.getLow_52_weeks_date());
                protoAdapter.encodeWithTag(writer, 13, (int) value.getLow_52_weeks());
                protoAdapter.encodeWithTag(writer, 12, (int) value.getFloat());
                protoAdapter.encodeWithTag(writer, 11, (int) value.getDividend_yield());
                protoAdapter.encodeWithTag(writer, 10, (int) value.getHigh_52_weeks_date());
                protoAdapter.encodeWithTag(writer, 9, (int) value.getHigh_52_weeks());
                protoAdapter.encodeWithTag(writer, 8, (int) value.getAverage_volume_30_days());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getAverage_volume_52_weeks());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getAverage_volume_2_weeks());
                if (value.getBounds() != Bounds.BOUNDS_UNSPECIFIED) {
                    Bounds.ADAPTER.encodeWithTag(writer, 5, (int) value.getBounds());
                }
                protoAdapter.encodeWithTag(writer, 4, (int) value.getVolume());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getLow());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getHigh());
                protoAdapter.encodeWithTag(writer, 1, (int) value.getOpen());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Fundamental decode(ProtoReader reader) throws IOException {
                String str;
                String str2;
                String str3;
                Intrinsics.checkNotNullParameter(reader, "reader");
                Bounds bounds = Bounds.BOUNDS_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Bounds boundsDecode = bounds;
                String strDecode = null;
                String strDecode2 = null;
                String strDecode3 = null;
                String strDecode4 = null;
                String strDecode5 = null;
                String strDecode6 = null;
                String strDecode7 = null;
                String strDecode8 = null;
                String strDecode9 = null;
                String strDecode10 = null;
                String strDecode11 = null;
                String strDecode12 = null;
                String strDecode13 = null;
                String strDecode14 = null;
                String strDecode15 = null;
                String strDecode16 = null;
                Integer numDecode = null;
                Integer numDecode2 = null;
                String strDecode17 = null;
                String strDecode18 = null;
                String strDecode19 = null;
                String strDecode20 = null;
                KeyInfoDocument keyInfoDocumentDecode = null;
                String strDecode21 = null;
                String strDecode22 = "";
                String strDecode23 = strDecode22;
                String strDecode24 = strDecode23;
                String strDecode25 = strDecode24;
                String strDecode26 = strDecode25;
                String strDecode27 = strDecode26;
                String strDecode28 = strDecode27;
                String strDecode29 = strDecode28;
                String strDecode30 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode30 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 5:
                                try {
                                    boundsDecode = Bounds.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    str = strDecode30;
                                    str2 = strDecode;
                                    str3 = strDecode2;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 6:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 7:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 8:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 9:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 10:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 11:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 12:
                                strDecode10 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 13:
                                strDecode11 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 14:
                                strDecode12 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 15:
                                strDecode13 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 16:
                                strDecode14 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 17:
                                strDecode15 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 18:
                                strDecode16 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 19:
                                strDecode22 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 20:
                                strDecode23 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 21:
                                strDecode24 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 22:
                                strDecode25 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 23:
                                strDecode26 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 24:
                                strDecode27 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 25:
                                strDecode28 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 26:
                                numDecode = ProtoAdapter.INT32.decode(reader);
                                continue;
                            case 27:
                                numDecode2 = ProtoAdapter.INT32.decode(reader);
                                continue;
                            case 28:
                                strDecode17 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 29:
                                strDecode18 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 30:
                                strDecode19 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 31:
                                strDecode20 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 32:
                                strDecode29 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 33:
                                keyInfoDocumentDecode = KeyInfoDocument.ADAPTER.decode(reader);
                                continue;
                            case 34:
                                strDecode21 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                str = strDecode30;
                                str2 = strDecode;
                                str3 = strDecode2;
                                break;
                        }
                        strDecode30 = str;
                        strDecode = str2;
                        strDecode2 = str3;
                    } else {
                        return new Fundamental(strDecode30, strDecode, strDecode2, strDecode3, boundsDecode, strDecode4, strDecode5, strDecode6, strDecode7, strDecode8, strDecode9, strDecode10, strDecode11, strDecode12, strDecode13, strDecode14, strDecode15, strDecode16, strDecode22, strDecode23, strDecode24, strDecode25, strDecode26, strDecode27, strDecode28, numDecode, numDecode2, strDecode17, strDecode18, strDecode19, strDecode20, strDecode29, keyInfoDocumentDecode, strDecode21, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Fundamental redact(Fundamental value) {
                Intrinsics.checkNotNullParameter(value, "value");
                KeyInfoDocument key_info_document = value.getKey_info_document();
                return value.copy(((-1) & 1) != 0 ? value.open : null, ((-1) & 2) != 0 ? value.high : null, ((-1) & 4) != 0 ? value.low : null, ((-1) & 8) != 0 ? value.volume : null, ((-1) & 16) != 0 ? value.bounds : null, ((-1) & 32) != 0 ? value.average_volume_2_weeks : null, ((-1) & 64) != 0 ? value.average_volume_52_weeks : null, ((-1) & 128) != 0 ? value.average_volume_30_days : null, ((-1) & 256) != 0 ? value.high_52_weeks : null, ((-1) & 512) != 0 ? value.high_52_weeks_date : null, ((-1) & 1024) != 0 ? value.dividend_yield : null, ((-1) & 2048) != 0 ? value.float : null, ((-1) & 4096) != 0 ? value.low_52_weeks : null, ((-1) & 8192) != 0 ? value.low_52_weeks_date : null, ((-1) & 16384) != 0 ? value.market_cap : null, ((-1) & 32768) != 0 ? value.pb_ratio : null, ((-1) & 65536) != 0 ? value.pe_ratio : null, ((-1) & 131072) != 0 ? value.shares_outstanding : null, ((-1) & 262144) != 0 ? value.description : null, ((-1) & 524288) != 0 ? value.instrument : null, ((-1) & 1048576) != 0 ? value.ceo : null, ((-1) & 2097152) != 0 ? value.headquarters_city : null, ((-1) & 4194304) != 0 ? value.headquarters_state : null, ((-1) & 8388608) != 0 ? value.sector : null, ((-1) & 16777216) != 0 ? value.industry : null, ((-1) & 33554432) != 0 ? value.num_employees : null, ((-1) & 67108864) != 0 ? value.year_founded : null, ((-1) & 134217728) != 0 ? value.payable_date : null, ((-1) & 268435456) != 0 ? value.ex_dividend_date : null, ((-1) & 536870912) != 0 ? value.financial_status_indicator : null, ((-1) & 1073741824) != 0 ? value.financial_status_description : null, ((-1) & Integer.MIN_VALUE) != 0 ? value.instrument_id : null, (2 & 1) != 0 ? value.key_info_document : key_info_document != null ? KeyInfoDocument.ADAPTER.redact(key_info_document) : null, (2 & 2) != 0 ? value.overnight_volume : null, (2 & 4) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
