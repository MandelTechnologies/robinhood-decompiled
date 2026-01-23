package com.truelayer.payments.analytics.events;

import com.adjust.sdk.Constants;
import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import com.salesforce.android.smi.network.data.domain.auth.Auth;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement6;
import kotlinx.serialization.json.JsonElementSerializers6;

/* compiled from: NetworkEvent.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bW\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u0088\u00012\u00020\u0001:\u0006\u0087\u0001\u0088\u0001\u0089\u0001BË\u0002\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001d\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010!\u0012\b\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\u0002\u0010$Bå\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!¢\u0006\u0002\u0010%J\t\u0010_\u001a\u00020\u0005HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010a\u001a\u00020\u0005HÆ\u0003J\t\u0010b\u001a\u00020\u0005HÆ\u0003J\t\u0010c\u001a\u00020\u0013HÆ\u0003J\t\u0010d\u001a\u00020\u0005HÆ\u0003J\t\u0010e\u001a\u00020\u0005HÆ\u0003J\t\u0010f\u001a\u00020\u0005HÆ\u0003J\t\u0010g\u001a\u00020\u0005HÆ\u0003J\t\u0010h\u001a\u00020\u0005HÆ\u0003J\t\u0010i\u001a\u00020\u0005HÆ\u0003J\t\u0010j\u001a\u00020\u0005HÆ\u0003J\t\u0010k\u001a\u00020\u0005HÆ\u0003J\t\u0010l\u001a\u00020\u0005HÆ\u0003J\u000f\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00050\u001dHÆ\u0003J\t\u0010n\u001a\u00020\u0005HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010!HÆ\u0003J\t\u0010q\u001a\u00020\u0005HÆ\u0003J\t\u0010r\u001a\u00020\u0005HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010u\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010v\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010w\u001a\u00020\u0005HÆ\u0003J\u009c\u0002\u0010x\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!HÆ\u0001¢\u0006\u0002\u0010yJ\u0013\u0010z\u001a\u00020{2\b\u0010|\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010}\u001a\u00020\u0003HÖ\u0001J\t\u0010~\u001a\u00020\u0005HÖ\u0001J-\u0010\u007f\u001a\u00030\u0080\u00012\u0007\u0010\u0081\u0001\u001a\u00020\u00002\b\u0010\u0082\u0001\u001a\u00030\u0083\u00012\b\u0010\u0084\u0001\u001a\u00030\u0085\u0001HÁ\u0001¢\u0006\u0003\b\u0086\u0001R \u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010*\u0012\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010'\u001a\u0004\b,\u0010-R\u001c\u0010\u0015\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010'\u001a\u0004\b/\u0010-R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010'\u001a\u0004\b1\u0010-R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010'\u001a\u0004\b3\u0010-R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010'\u001a\u0004\b5\u0010-R\u001c\u0010\u0018\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010'\u001a\u0004\b7\u0010-R\u001c\u0010\u001b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b8\u0010'\u001a\u0004\b9\u0010-R\u001c\u0010\u001a\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010'\u001a\u0004\b;\u0010-R\u001c\u0010\u0019\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b<\u0010'\u001a\u0004\b=\u0010-R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b>\u0010'\u001a\u0004\b?\u0010-R\u001c\u0010\u001e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b@\u0010'\u001a\u0004\bA\u0010-R\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bB\u0010'\u001a\u0004\bC\u0010-R\u001e\u0010 \u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bD\u0010'\u001a\u0004\bE\u0010FR\u001c\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bG\u0010'\u001a\u0004\bH\u0010-R\u001c\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bI\u0010'\u001a\u0004\bJ\u0010-R\"\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u001d8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bK\u0010'\u001a\u0004\bL\u0010MR\u001e\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bN\u0010'\u001a\u0004\bO\u0010-R\u001c\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bP\u0010'\u001a\u0004\bQ\u0010-R\u001c\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bR\u0010'\u001a\u0004\bS\u0010-R\u001c\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bT\u0010'\u001a\u0004\bU\u0010VR\u001c\u0010\u0017\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bW\u0010'\u001a\u0004\bX\u0010-R\u001c\u0010\u0016\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bY\u0010'\u001a\u0004\bZ\u0010-R\u001c\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b[\u0010'\u001a\u0004\b\\\u0010-R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b]\u0010'\u001a\u0004\b^\u0010-¨\u0006\u008a\u0001"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/NetworkEvent;", "", "seen1", "", "type", "", "id", "resourceToken", "resourceType", Auth.DEVELOPER_NAME, "providerId", "amountInMinor", "", "currency", "timestamp", "countryCode", "osName", "osVersion", "screenResolution", "Lcom/truelayer/payments/analytics/events/NetworkEvent$ScreenResolution;", "applicationName", "applicationVersion", "sdkVersion", "sdkPlatform", CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, "deviceType", "deviceRegion", "deviceLanguage", "preferredLanguages", "", "integrationType", "integrationVersion", Constants.REFERRER_API_META, "Lkotlinx/serialization/json/JsonObject;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/analytics/events/NetworkEvent$ScreenResolution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/analytics/events/NetworkEvent$ScreenResolution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)V", "getAmountInMinor$annotations", "()V", "getAmountInMinor", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getApplicationName$annotations", "getApplicationName", "()Ljava/lang/String;", "getApplicationVersion$annotations", "getApplicationVersion", "getClientId$annotations", "getClientId", "getCountryCode$annotations", "getCountryCode", "getCurrency$annotations", "getCurrency", "getDeviceId$annotations", "getDeviceId", "getDeviceLanguage$annotations", "getDeviceLanguage", "getDeviceRegion$annotations", "getDeviceRegion", "getDeviceType$annotations", "getDeviceType", "getId$annotations", "getId", "getIntegrationType$annotations", "getIntegrationType", "getIntegrationVersion$annotations", "getIntegrationVersion", "getMeta$annotations", "getMeta", "()Lkotlinx/serialization/json/JsonObject;", "getOsName$annotations", "getOsName", "getOsVersion$annotations", "getOsVersion", "getPreferredLanguages$annotations", "getPreferredLanguages", "()Ljava/util/List;", "getProviderId$annotations", "getProviderId", "getResourceToken$annotations", "getResourceToken", "getResourceType$annotations", "getResourceType", "getScreenResolution$annotations", "getScreenResolution", "()Lcom/truelayer/payments/analytics/events/NetworkEvent$ScreenResolution;", "getSdkPlatform$annotations", "getSdkPlatform", "getSdkVersion$annotations", "getSdkVersion", "getTimestamp$annotations", "getTimestamp", "getType$annotations", "getType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/analytics/events/NetworkEvent$ScreenResolution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)Lcom/truelayer/payments/analytics/events/NetworkEvent;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_analytics_release", "$serializer", "Companion", "ScreenResolution", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final /* data */ class NetworkEvent {
    private final Long amountInMinor;
    private final String applicationName;
    private final String applicationVersion;
    private final String clientId;
    private final String countryCode;
    private final String currency;
    private final String deviceId;
    private final String deviceLanguage;
    private final String deviceRegion;
    private final String deviceType;
    private final String id;
    private final String integrationType;
    private final String integrationVersion;
    private final JsonElement6 meta;
    private final String osName;
    private final String osVersion;
    private final List<String> preferredLanguages;
    private final String providerId;
    private final String resourceToken;
    private final String resourceType;
    private final ScreenResolution screenResolution;
    private final String sdkPlatform;
    private final String sdkVersion;
    private final String timestamp;
    private final String type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null};

    public static /* synthetic */ NetworkEvent copy$default(NetworkEvent networkEvent, String str, String str2, String str3, String str4, String str5, String str6, Long l, String str7, String str8, String str9, String str10, String str11, ScreenResolution screenResolution, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, List list, String str20, String str21, JsonElement6 jsonElement6, int i, Object obj) {
        JsonElement6 jsonElement62;
        String str22;
        String str23 = (i & 1) != 0 ? networkEvent.type : str;
        String str24 = (i & 2) != 0 ? networkEvent.id : str2;
        String str25 = (i & 4) != 0 ? networkEvent.resourceToken : str3;
        String str26 = (i & 8) != 0 ? networkEvent.resourceType : str4;
        String str27 = (i & 16) != 0 ? networkEvent.clientId : str5;
        String str28 = (i & 32) != 0 ? networkEvent.providerId : str6;
        Long l2 = (i & 64) != 0 ? networkEvent.amountInMinor : l;
        String str29 = (i & 128) != 0 ? networkEvent.currency : str7;
        String str30 = (i & 256) != 0 ? networkEvent.timestamp : str8;
        String str31 = (i & 512) != 0 ? networkEvent.countryCode : str9;
        String str32 = (i & 1024) != 0 ? networkEvent.osName : str10;
        String str33 = (i & 2048) != 0 ? networkEvent.osVersion : str11;
        ScreenResolution screenResolution2 = (i & 4096) != 0 ? networkEvent.screenResolution : screenResolution;
        String str34 = (i & 8192) != 0 ? networkEvent.applicationName : str12;
        String str35 = str23;
        String str36 = (i & 16384) != 0 ? networkEvent.applicationVersion : str13;
        String str37 = (i & 32768) != 0 ? networkEvent.sdkVersion : str14;
        String str38 = (i & 65536) != 0 ? networkEvent.sdkPlatform : str15;
        String str39 = (i & 131072) != 0 ? networkEvent.deviceId : str16;
        String str40 = (i & 262144) != 0 ? networkEvent.deviceType : str17;
        String str41 = (i & 524288) != 0 ? networkEvent.deviceRegion : str18;
        String str42 = (i & 1048576) != 0 ? networkEvent.deviceLanguage : str19;
        List list2 = (i & 2097152) != 0 ? networkEvent.preferredLanguages : list;
        String str43 = (i & 4194304) != 0 ? networkEvent.integrationType : str20;
        String str44 = (i & 8388608) != 0 ? networkEvent.integrationVersion : str21;
        if ((i & 16777216) != 0) {
            str22 = str44;
            jsonElement62 = networkEvent.meta;
        } else {
            jsonElement62 = jsonElement6;
            str22 = str44;
        }
        return networkEvent.copy(str35, str24, str25, str26, str27, str28, l2, str29, str30, str31, str32, str33, screenResolution2, str34, str36, str37, str38, str39, str40, str41, str42, list2, str43, str22, jsonElement62);
    }

    @SerialName("amount_in_minor")
    public static /* synthetic */ void getAmountInMinor$annotations() {
    }

    @SerialName("app_name")
    public static /* synthetic */ void getApplicationName$annotations() {
    }

    @SerialName("app_version")
    public static /* synthetic */ void getApplicationVersion$annotations() {
    }

    @SerialName("client_id")
    public static /* synthetic */ void getClientId$annotations() {
    }

    @SerialName("country_code")
    public static /* synthetic */ void getCountryCode$annotations() {
    }

    @SerialName("currency")
    public static /* synthetic */ void getCurrency$annotations() {
    }

    @SerialName("device_id")
    public static /* synthetic */ void getDeviceId$annotations() {
    }

    @SerialName("device_language")
    public static /* synthetic */ void getDeviceLanguage$annotations() {
    }

    @SerialName("device_region")
    public static /* synthetic */ void getDeviceRegion$annotations() {
    }

    @SerialName("device_type")
    public static /* synthetic */ void getDeviceType$annotations() {
    }

    @SerialName("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @SerialName("integration_type")
    public static /* synthetic */ void getIntegrationType$annotations() {
    }

    @SerialName("integration_version")
    public static /* synthetic */ void getIntegrationVersion$annotations() {
    }

    @SerialName(Constants.REFERRER_API_META)
    public static /* synthetic */ void getMeta$annotations() {
    }

    @SerialName("os_name")
    public static /* synthetic */ void getOsName$annotations() {
    }

    @SerialName("os_version")
    public static /* synthetic */ void getOsVersion$annotations() {
    }

    @SerialName("preferred_languages")
    public static /* synthetic */ void getPreferredLanguages$annotations() {
    }

    @SerialName("provider_id")
    public static /* synthetic */ void getProviderId$annotations() {
    }

    @SerialName("resource_token")
    public static /* synthetic */ void getResourceToken$annotations() {
    }

    @SerialName("resource_type")
    public static /* synthetic */ void getResourceType$annotations() {
    }

    @SerialName("screen_resolution")
    public static /* synthetic */ void getScreenResolution$annotations() {
    }

    @SerialName("sdk_platform")
    public static /* synthetic */ void getSdkPlatform$annotations() {
    }

    @SerialName("sdk_version")
    public static /* synthetic */ void getSdkVersion$annotations() {
    }

    @SerialName("timestamp")
    public static /* synthetic */ void getTimestamp$annotations() {
    }

    @SerialName("type")
    public static /* synthetic */ void getType$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component10, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component11, reason: from getter */
    public final String getOsName() {
        return this.osName;
    }

    /* renamed from: component12, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    /* renamed from: component13, reason: from getter */
    public final ScreenResolution getScreenResolution() {
        return this.screenResolution;
    }

    /* renamed from: component14, reason: from getter */
    public final String getApplicationName() {
        return this.applicationName;
    }

    /* renamed from: component15, reason: from getter */
    public final String getApplicationVersion() {
        return this.applicationVersion;
    }

    /* renamed from: component16, reason: from getter */
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    /* renamed from: component17, reason: from getter */
    public final String getSdkPlatform() {
        return this.sdkPlatform;
    }

    /* renamed from: component18, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component19, reason: from getter */
    public final String getDeviceType() {
        return this.deviceType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component20, reason: from getter */
    public final String getDeviceRegion() {
        return this.deviceRegion;
    }

    /* renamed from: component21, reason: from getter */
    public final String getDeviceLanguage() {
        return this.deviceLanguage;
    }

    public final List<String> component22() {
        return this.preferredLanguages;
    }

    /* renamed from: component23, reason: from getter */
    public final String getIntegrationType() {
        return this.integrationType;
    }

    /* renamed from: component24, reason: from getter */
    public final String getIntegrationVersion() {
        return this.integrationVersion;
    }

    /* renamed from: component25, reason: from getter */
    public final JsonElement6 getMeta() {
        return this.meta;
    }

    /* renamed from: component3, reason: from getter */
    public final String getResourceToken() {
        return this.resourceToken;
    }

    /* renamed from: component4, reason: from getter */
    public final String getResourceType() {
        return this.resourceType;
    }

    /* renamed from: component5, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getProviderId() {
        return this.providerId;
    }

    /* renamed from: component7, reason: from getter */
    public final Long getAmountInMinor() {
        return this.amountInMinor;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component9, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    public final NetworkEvent copy(String type2, String id, String resourceToken, String resourceType, String clientId, String providerId, Long amountInMinor, String currency, String timestamp, String countryCode, String osName, String osVersion, ScreenResolution screenResolution, String applicationName, String applicationVersion, String sdkVersion, String sdkPlatform, String deviceId, String deviceType, String deviceRegion, String deviceLanguage, List<String> preferredLanguages, String integrationType, String integrationVersion, JsonElement6 meta) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(resourceToken, "resourceToken");
        Intrinsics.checkNotNullParameter(resourceType, "resourceType");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(osName, "osName");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(screenResolution, "screenResolution");
        Intrinsics.checkNotNullParameter(applicationName, "applicationName");
        Intrinsics.checkNotNullParameter(applicationVersion, "applicationVersion");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(sdkPlatform, "sdkPlatform");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(deviceRegion, "deviceRegion");
        Intrinsics.checkNotNullParameter(deviceLanguage, "deviceLanguage");
        Intrinsics.checkNotNullParameter(preferredLanguages, "preferredLanguages");
        Intrinsics.checkNotNullParameter(integrationType, "integrationType");
        return new NetworkEvent(type2, id, resourceToken, resourceType, clientId, providerId, amountInMinor, currency, timestamp, countryCode, osName, osVersion, screenResolution, applicationName, applicationVersion, sdkVersion, sdkPlatform, deviceId, deviceType, deviceRegion, deviceLanguage, preferredLanguages, integrationType, integrationVersion, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkEvent)) {
            return false;
        }
        NetworkEvent networkEvent = (NetworkEvent) other;
        return Intrinsics.areEqual(this.type, networkEvent.type) && Intrinsics.areEqual(this.id, networkEvent.id) && Intrinsics.areEqual(this.resourceToken, networkEvent.resourceToken) && Intrinsics.areEqual(this.resourceType, networkEvent.resourceType) && Intrinsics.areEqual(this.clientId, networkEvent.clientId) && Intrinsics.areEqual(this.providerId, networkEvent.providerId) && Intrinsics.areEqual(this.amountInMinor, networkEvent.amountInMinor) && Intrinsics.areEqual(this.currency, networkEvent.currency) && Intrinsics.areEqual(this.timestamp, networkEvent.timestamp) && Intrinsics.areEqual(this.countryCode, networkEvent.countryCode) && Intrinsics.areEqual(this.osName, networkEvent.osName) && Intrinsics.areEqual(this.osVersion, networkEvent.osVersion) && Intrinsics.areEqual(this.screenResolution, networkEvent.screenResolution) && Intrinsics.areEqual(this.applicationName, networkEvent.applicationName) && Intrinsics.areEqual(this.applicationVersion, networkEvent.applicationVersion) && Intrinsics.areEqual(this.sdkVersion, networkEvent.sdkVersion) && Intrinsics.areEqual(this.sdkPlatform, networkEvent.sdkPlatform) && Intrinsics.areEqual(this.deviceId, networkEvent.deviceId) && Intrinsics.areEqual(this.deviceType, networkEvent.deviceType) && Intrinsics.areEqual(this.deviceRegion, networkEvent.deviceRegion) && Intrinsics.areEqual(this.deviceLanguage, networkEvent.deviceLanguage) && Intrinsics.areEqual(this.preferredLanguages, networkEvent.preferredLanguages) && Intrinsics.areEqual(this.integrationType, networkEvent.integrationType) && Intrinsics.areEqual(this.integrationVersion, networkEvent.integrationVersion) && Intrinsics.areEqual(this.meta, networkEvent.meta);
    }

    public int hashCode() {
        int iHashCode = ((((((this.type.hashCode() * 31) + this.id.hashCode()) * 31) + this.resourceToken.hashCode()) * 31) + this.resourceType.hashCode()) * 31;
        String str = this.clientId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.providerId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.amountInMinor;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode5 = (((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.timestamp.hashCode()) * 31;
        String str4 = this.countryCode;
        int iHashCode6 = (((((((((((((((((((((((((((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.osName.hashCode()) * 31) + this.osVersion.hashCode()) * 31) + this.screenResolution.hashCode()) * 31) + this.applicationName.hashCode()) * 31) + this.applicationVersion.hashCode()) * 31) + this.sdkVersion.hashCode()) * 31) + this.sdkPlatform.hashCode()) * 31) + this.deviceId.hashCode()) * 31) + this.deviceType.hashCode()) * 31) + this.deviceRegion.hashCode()) * 31) + this.deviceLanguage.hashCode()) * 31) + this.preferredLanguages.hashCode()) * 31) + this.integrationType.hashCode()) * 31;
        String str5 = this.integrationVersion;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        JsonElement6 jsonElement6 = this.meta;
        return iHashCode7 + (jsonElement6 != null ? jsonElement6.hashCode() : 0);
    }

    public String toString() {
        return "NetworkEvent(type=" + this.type + ", id=" + this.id + ", resourceToken=" + this.resourceToken + ", resourceType=" + this.resourceType + ", clientId=" + this.clientId + ", providerId=" + this.providerId + ", amountInMinor=" + this.amountInMinor + ", currency=" + this.currency + ", timestamp=" + this.timestamp + ", countryCode=" + this.countryCode + ", osName=" + this.osName + ", osVersion=" + this.osVersion + ", screenResolution=" + this.screenResolution + ", applicationName=" + this.applicationName + ", applicationVersion=" + this.applicationVersion + ", sdkVersion=" + this.sdkVersion + ", sdkPlatform=" + this.sdkPlatform + ", deviceId=" + this.deviceId + ", deviceType=" + this.deviceType + ", deviceRegion=" + this.deviceRegion + ", deviceLanguage=" + this.deviceLanguage + ", preferredLanguages=" + this.preferredLanguages + ", integrationType=" + this.integrationType + ", integrationVersion=" + this.integrationVersion + ", meta=" + this.meta + ")";
    }

    /* compiled from: NetworkEvent.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/NetworkEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/analytics/events/NetworkEvent;", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<NetworkEvent> serializer() {
            return NetworkEvent2.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ NetworkEvent(int i, @SerialName("type") String str, @SerialName("id") String str2, @SerialName("resource_token") String str3, @SerialName("resource_type") String str4, @SerialName("client_id") String str5, @SerialName("provider_id") String str6, @SerialName("amount_in_minor") Long l, @SerialName("currency") String str7, @SerialName("timestamp") String str8, @SerialName("country_code") String str9, @SerialName("os_name") String str10, @SerialName("os_version") String str11, @SerialName("screen_resolution") ScreenResolution screenResolution, @SerialName("app_name") String str12, @SerialName("app_version") String str13, @SerialName("sdk_version") String str14, @SerialName("sdk_platform") String str15, @SerialName("device_id") String str16, @SerialName("device_type") String str17, @SerialName("device_region") String str18, @SerialName("device_language") String str19, @SerialName("preferred_languages") List list, @SerialName("integration_type") String str20, @SerialName("integration_version") String str21, @SerialName(Constants.REFERRER_API_META) JsonElement6 jsonElement6, SerializationConstructorMarker serializationConstructorMarker) {
        if (8388607 != (i & 8388607)) {
            PluginExceptions.throwMissingFieldException(i, 8388607, NetworkEvent2.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.id = str2;
        this.resourceToken = str3;
        this.resourceType = str4;
        this.clientId = str5;
        this.providerId = str6;
        this.amountInMinor = l;
        this.currency = str7;
        this.timestamp = str8;
        this.countryCode = str9;
        this.osName = str10;
        this.osVersion = str11;
        this.screenResolution = screenResolution;
        this.applicationName = str12;
        this.applicationVersion = str13;
        this.sdkVersion = str14;
        this.sdkPlatform = str15;
        this.deviceId = str16;
        this.deviceType = str17;
        this.deviceRegion = str18;
        this.deviceLanguage = str19;
        this.preferredLanguages = list;
        this.integrationType = str20;
        if ((8388608 & i) == 0) {
            this.integrationVersion = null;
        } else {
            this.integrationVersion = str21;
        }
        if ((i & 16777216) == 0) {
            this.meta = null;
        } else {
            this.meta = jsonElement6;
        }
    }

    public NetworkEvent(String type2, String id, String resourceToken, String resourceType, String str, String str2, Long l, String str3, String timestamp, String str4, String osName, String osVersion, ScreenResolution screenResolution, String applicationName, String applicationVersion, String sdkVersion, String sdkPlatform, String deviceId, String deviceType, String deviceRegion, String deviceLanguage, List<String> preferredLanguages, String integrationType, String str5, JsonElement6 jsonElement6) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(resourceToken, "resourceToken");
        Intrinsics.checkNotNullParameter(resourceType, "resourceType");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(osName, "osName");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(screenResolution, "screenResolution");
        Intrinsics.checkNotNullParameter(applicationName, "applicationName");
        Intrinsics.checkNotNullParameter(applicationVersion, "applicationVersion");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(sdkPlatform, "sdkPlatform");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(deviceRegion, "deviceRegion");
        Intrinsics.checkNotNullParameter(deviceLanguage, "deviceLanguage");
        Intrinsics.checkNotNullParameter(preferredLanguages, "preferredLanguages");
        Intrinsics.checkNotNullParameter(integrationType, "integrationType");
        this.type = type2;
        this.id = id;
        this.resourceToken = resourceToken;
        this.resourceType = resourceType;
        this.clientId = str;
        this.providerId = str2;
        this.amountInMinor = l;
        this.currency = str3;
        this.timestamp = timestamp;
        this.countryCode = str4;
        this.osName = osName;
        this.osVersion = osVersion;
        this.screenResolution = screenResolution;
        this.applicationName = applicationName;
        this.applicationVersion = applicationVersion;
        this.sdkVersion = sdkVersion;
        this.sdkPlatform = sdkPlatform;
        this.deviceId = deviceId;
        this.deviceType = deviceType;
        this.deviceRegion = deviceRegion;
        this.deviceLanguage = deviceLanguage;
        this.preferredLanguages = preferredLanguages;
        this.integrationType = integrationType;
        this.integrationVersion = str5;
        this.meta = jsonElement6;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_analytics_release(NetworkEvent self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.type);
        output.encodeStringElement(serialDesc, 1, self.id);
        output.encodeStringElement(serialDesc, 2, self.resourceToken);
        output.encodeStringElement(serialDesc, 3, self.resourceType);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.clientId);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.providerId);
        output.encodeNullableSerializableElement(serialDesc, 6, LongSerializer.INSTANCE, self.amountInMinor);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.currency);
        output.encodeStringElement(serialDesc, 8, self.timestamp);
        output.encodeNullableSerializableElement(serialDesc, 9, stringSerializer, self.countryCode);
        output.encodeStringElement(serialDesc, 10, self.osName);
        output.encodeStringElement(serialDesc, 11, self.osVersion);
        output.encodeSerializableElement(serialDesc, 12, NetworkEvent3.INSTANCE, self.screenResolution);
        output.encodeStringElement(serialDesc, 13, self.applicationName);
        output.encodeStringElement(serialDesc, 14, self.applicationVersion);
        output.encodeStringElement(serialDesc, 15, self.sdkVersion);
        output.encodeStringElement(serialDesc, 16, self.sdkPlatform);
        output.encodeStringElement(serialDesc, 17, self.deviceId);
        output.encodeStringElement(serialDesc, 18, self.deviceType);
        output.encodeStringElement(serialDesc, 19, self.deviceRegion);
        output.encodeStringElement(serialDesc, 20, self.deviceLanguage);
        output.encodeSerializableElement(serialDesc, 21, kSerializerArr[21], self.preferredLanguages);
        output.encodeStringElement(serialDesc, 22, self.integrationType);
        if (output.shouldEncodeElementDefault(serialDesc, 23) || self.integrationVersion != null) {
            output.encodeNullableSerializableElement(serialDesc, 23, stringSerializer, self.integrationVersion);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 24) && self.meta == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 24, JsonElementSerializers6.INSTANCE, self.meta);
    }

    public /* synthetic */ NetworkEvent(String str, String str2, String str3, String str4, String str5, String str6, Long l, String str7, String str8, String str9, String str10, String str11, ScreenResolution screenResolution, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, List list, String str20, String str21, JsonElement6 jsonElement6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, l, str7, str8, str9, str10, str11, screenResolution, str12, str13, str14, str15, str16, str17, str18, str19, list, str20, (i & 8388608) != 0 ? null : str21, (i & 16777216) != 0 ? null : jsonElement6);
    }

    public final String getType() {
        return this.type;
    }

    public final String getId() {
        return this.id;
    }

    public final String getResourceToken() {
        return this.resourceToken;
    }

    public final String getResourceType() {
        return this.resourceType;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final String getProviderId() {
        return this.providerId;
    }

    public final Long getAmountInMinor() {
        return this.amountInMinor;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getOsName() {
        return this.osName;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final ScreenResolution getScreenResolution() {
        return this.screenResolution;
    }

    public final String getApplicationName() {
        return this.applicationName;
    }

    public final String getApplicationVersion() {
        return this.applicationVersion;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final String getSdkPlatform() {
        return this.sdkPlatform;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getDeviceType() {
        return this.deviceType;
    }

    public final String getDeviceRegion() {
        return this.deviceRegion;
    }

    public final String getDeviceLanguage() {
        return this.deviceLanguage;
    }

    public final List<String> getPreferredLanguages() {
        return this.preferredLanguages;
    }

    public final String getIntegrationType() {
        return this.integrationType;
    }

    public final String getIntegrationVersion() {
        return this.integrationVersion;
    }

    /* compiled from: NetworkEvent.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B-\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J&\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fHÁ\u0001¢\u0006\u0002\b R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006#"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/NetworkEvent$ScreenResolution;", "", "seen1", "", "width", "height", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(II)V", "getHeight$annotations", "()V", "getHeight", "()I", "getWidth$annotations", "getWidth", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_analytics_release", "$serializer", "Companion", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class ScreenResolution {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final int height;
        private final int width;

        public static /* synthetic */ ScreenResolution copy$default(ScreenResolution screenResolution, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = screenResolution.width;
            }
            if ((i3 & 2) != 0) {
                i2 = screenResolution.height;
            }
            return screenResolution.copy(i, i2);
        }

        @SerialName("height")
        public static /* synthetic */ void getHeight$annotations() {
        }

        @SerialName("width")
        public static /* synthetic */ void getWidth$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* renamed from: component2, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        public final ScreenResolution copy(int width, int height) {
            return new ScreenResolution(width, height);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScreenResolution)) {
                return false;
            }
            ScreenResolution screenResolution = (ScreenResolution) other;
            return this.width == screenResolution.width && this.height == screenResolution.height;
        }

        public int hashCode() {
            return (Integer.hashCode(this.width) * 31) + Integer.hashCode(this.height);
        }

        public String toString() {
            return "ScreenResolution(width=" + this.width + ", height=" + this.height + ")";
        }

        /* compiled from: NetworkEvent.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/NetworkEvent$ScreenResolution$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/analytics/events/NetworkEvent$ScreenResolution;", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ScreenResolution> serializer() {
                return NetworkEvent3.INSTANCE;
            }
        }

        public ScreenResolution(int i, int i2) {
            this.width = i;
            this.height = i2;
        }

        @Deprecated
        public /* synthetic */ ScreenResolution(int i, @SerialName("width") int i2, @SerialName("height") int i3, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                PluginExceptions.throwMissingFieldException(i, 3, NetworkEvent3.INSTANCE.getDescriptor());
            }
            this.width = i2;
            this.height = i3;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_analytics_release(ScreenResolution self, Encoding3 output, SerialDescriptor serialDesc) {
            output.encodeIntElement(serialDesc, 0, self.width);
            output.encodeIntElement(serialDesc, 1, self.height);
        }

        public final int getWidth() {
            return this.width;
        }

        public final int getHeight() {
            return this.height;
        }
    }

    public final JsonElement6 getMeta() {
        return this.meta;
    }
}
