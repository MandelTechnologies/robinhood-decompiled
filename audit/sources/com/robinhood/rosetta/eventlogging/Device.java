package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.Device;
import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: Device.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002fgB¡\u0003\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0004\u0012\b\b\u0002\u0010 \u001a\u00020\u0004\u0012\b\b\u0002\u0010!\u001a\u00020\"\u0012\b\b\u0002\u0010#\u001a\u00020\u0004\u0012\b\b\u0002\u0010$\u001a\u00020\u0004\u0012\b\b\u0002\u0010%\u001a\u00020\u0004\u0012\b\b\u0002\u0010&\u001a\u00020\u0004\u0012\b\b\u0002\u0010'\u001a\u00020\u0004\u0012\b\b\u0002\u0010(\u001a\u00020\u0004\u0012\b\b\u0002\u0010)\u001a\u00020\u0004\u0012\b\b\u0002\u0010*\u001a\u00020\u0004\u0012\b\b\u0002\u0010+\u001a\u00020\u0004\u0012\b\b\u0002\u0010,\u001a\u00020\u0004\u0012\b\b\u0002\u0010-\u001a\u00020\u0004\u0012\b\b\u0002\u0010.\u001a\u00020\u0004\u0012\b\b\u0002\u0010/\u001a\u000200¢\u0006\u0004\b1\u00102J\b\u0010_\u001a\u00020\u0002H\u0017J\u0013\u0010`\u001a\u00020\u00142\b\u0010a\u001a\u0004\u0018\u00010bH\u0096\u0002J\b\u0010c\u001a\u00020\u0017H\u0016J\b\u0010d\u001a\u00020\u0004H\u0016J \u0003\u0010e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u00142\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u00042\b\b\u0002\u0010&\u001a\u00020\u00042\b\b\u0002\u0010'\u001a\u00020\u00042\b\b\u0002\u0010(\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u00042\b\b\u0002\u0010-\u001a\u00020\u00042\b\b\u0002\u0010.\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u000200R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00104R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00104R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00104R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00104R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u00104R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u00104R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u00104R\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u00104R\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u00104R\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u00104R\u0016\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u00104R\u0016\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u00104R\u0016\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u00104R\u0016\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u00104R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0016\u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010DR\u0016\u0010\u0016\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0016\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u00104R\u0016\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u00104R\u0016\u0010\u001a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u00104R\u0016\u0010\u001b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u00104R\u0016\u0010\u001c\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010DR\u0016\u0010\u001d\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u00104R\u0016\u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u00104R\u0016\u0010\u001f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u00104R\u0016\u0010 \u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u00104R\u0016\u0010!\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0016\u0010#\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u00104R\u0016\u0010$\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u00104R\u0016\u0010%\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u00104R\u0016\u0010&\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u00104R\u0016\u0010'\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u00104R\u0016\u0010(\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u00104R\u0016\u0010)\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u00104R\u0016\u0010*\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u00104R\u0016\u0010+\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u00104R\u0016\u0010,\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u00104R\u0016\u0010-\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u00104R\u0016\u0010.\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u00104¨\u0006h"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/Device;", "Lcom/squareup/wire/Message;", "", "platform", "", "device_id", "web_device_id", "os_version", "manufacturer", "device_version", "screen_resolution", "adid", "font_size", "sharer_id", "sharer_url", "source", "campaign", "campaign_version", "click_id", "reduced_motion", "", "voice_over", "engagement_time", "", "referral_code", "model", "version", "density_independent_resolution", "webview", "web_device_hash", "token_hash", "adjust_device_id", "firebase_app_instance_id", "theme_style", "Lcom/robinhood/rosetta/eventlogging/Device$ThemeStyle;", "singular_device_id", "masked_device_id", "masked_web_device_id", "masked_adid", "masked_sharer_id", "masked_os_version", "masked_referral_code", "masked_web_device_hash", "masked_token_hash", "masked_adjust_device_id", "masked_firebase_app_instance_id", "masked_singular_device_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Device$ThemeStyle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getPlatform", "()Ljava/lang/String;", "getDevice_id", "getWeb_device_id", "getOs_version", "getManufacturer", "getDevice_version", "getScreen_resolution", "getAdid", "getFont_size", "getSharer_id", "getSharer_url", "getSource", "getCampaign", "getCampaign_version", "getClick_id", "getReduced_motion", "()Z", "getVoice_over", "getEngagement_time", "()I", "getReferral_code", "getModel", "getVersion", "getDensity_independent_resolution", "getWebview", "getWeb_device_hash", "getToken_hash", "getAdjust_device_id", "getFirebase_app_instance_id", "getTheme_style", "()Lcom/robinhood/rosetta/eventlogging/Device$ThemeStyle;", "getSingular_device_id", "getMasked_device_id", "getMasked_web_device_id", "getMasked_adid", "getMasked_sharer_id", "getMasked_os_version", "getMasked_referral_code", "getMasked_web_device_hash", "getMasked_token_hash", "getMasked_adjust_device_id", "getMasked_firebase_app_instance_id", "getMasked_singular_device_id", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "Companion", "ThemeStyle", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class Device extends Message {

    @JvmField
    public static final ProtoAdapter<Device> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String adid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "adjustDeviceId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 25, tag = 26)
    private final String adjust_device_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final String campaign;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "campaignVersion", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final String campaign_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "clickId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final String click_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "densityIndependentResolution", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 21, tag = 22)
    private final String density_independent_resolution;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String device_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "deviceVersion", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String device_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "engagementTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 18)
    private final int engagement_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "firebaseAppInstanceId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 26, tag = 27)
    private final String firebase_app_instance_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "fontSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String font_size;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String manufacturer;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maskedAdid", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 31, tag = 1008)
    private final String masked_adid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maskedAdjustDeviceId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 37, tag = 1026)
    private final String masked_adjust_device_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maskedDeviceId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 29, tag = 1002)
    private final String masked_device_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maskedFirebaseAppInstanceId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 38, tag = 1027)
    private final String masked_firebase_app_instance_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maskedOsVersion", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 33, tag = 1014)
    private final String masked_os_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maskedReferralCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 34, tag = 1019)
    private final String masked_referral_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maskedSharerId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 32, tag = 1010)
    private final String masked_sharer_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maskedSingularDeviceId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 39, tag = 1028)
    private final String masked_singular_device_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maskedTokenHash", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 36, tag = 1025)
    private final String masked_token_hash;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maskedWebDeviceHash", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 35, tag = 1024)
    private final String masked_web_device_hash;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maskedWebDeviceId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 30, tag = 1003)
    private final String masked_web_device_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 20)
    private final String model;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "osVersion", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String os_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String platform;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "reducedMotion", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final boolean reduced_motion;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "referralCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 19)
    private final String referral_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "screenResolution", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String screen_resolution;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sharerId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String sharer_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sharerUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String sharer_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "singularDeviceId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 28, tag = 29)
    private final String singular_device_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final String source;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Device$ThemeStyle#ADAPTER", jsonName = "themeStyle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 27, tag = 28)
    private final ThemeStyle theme_style;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "tokenHash", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 24, tag = 25)
    private final String token_hash;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 21)
    private final String version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "voiceOver", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final boolean voice_over;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "webDeviceHash", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 23, tag = 24)
    private final String web_device_hash;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "webDeviceId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String web_device_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 22, tag = 23)
    private final boolean webview;

    public Device() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 511, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Device(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, boolean z, boolean z2, int i, String str16, String str17, String str18, String str19, boolean z3, String str20, String str21, String str22, String str23, ThemeStyle themeStyle, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, ByteString byteString, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        String str36 = (i2 & 1) != 0 ? "" : str;
        this(str36, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? "" : str8, (i2 & 256) != 0 ? "" : str9, (i2 & 512) != 0 ? "" : str10, (i2 & 1024) != 0 ? "" : str11, (i2 & 2048) != 0 ? "" : str12, (i2 & 4096) != 0 ? "" : str13, (i2 & 8192) != 0 ? "" : str14, (i2 & 16384) != 0 ? "" : str15, (i2 & 32768) != 0 ? false : z, (i2 & 65536) != 0 ? false : z2, (i2 & 131072) != 0 ? 0 : i, (i2 & 262144) != 0 ? "" : str16, (i2 & 524288) != 0 ? "" : str17, (i2 & 1048576) != 0 ? "" : str18, (i2 & 2097152) != 0 ? "" : str19, (i2 & 4194304) == 0 ? z3 : false, (i2 & 8388608) != 0 ? "" : str20, (i2 & 16777216) != 0 ? "" : str21, (i2 & 33554432) != 0 ? "" : str22, (i2 & 67108864) != 0 ? "" : str23, (i2 & 134217728) != 0 ? ThemeStyle.THEME_STYLE_UNSPECIFIED : themeStyle, (i2 & 268435456) != 0 ? "" : str24, (i2 & 536870912) != 0 ? "" : str25, (i2 & 1073741824) != 0 ? "" : str26, (i2 & Integer.MIN_VALUE) != 0 ? "" : str27, (i3 & 1) != 0 ? "" : str28, (i3 & 2) != 0 ? "" : str29, (i3 & 4) != 0 ? "" : str30, (i3 & 8) != 0 ? "" : str31, (i3 & 16) != 0 ? "" : str32, (i3 & 32) != 0 ? "" : str33, (i3 & 64) != 0 ? "" : str34, (i3 & 128) == 0 ? str35 : "", (i3 & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24194newBuilder();
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getDevice_id() {
        return this.device_id;
    }

    public final String getWeb_device_id() {
        return this.web_device_id;
    }

    public final String getOs_version() {
        return this.os_version;
    }

    public final String getManufacturer() {
        return this.manufacturer;
    }

    public final String getDevice_version() {
        return this.device_version;
    }

    public final String getScreen_resolution() {
        return this.screen_resolution;
    }

    public final String getAdid() {
        return this.adid;
    }

    public final String getFont_size() {
        return this.font_size;
    }

    public final String getSharer_id() {
        return this.sharer_id;
    }

    public final String getSharer_url() {
        return this.sharer_url;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getCampaign() {
        return this.campaign;
    }

    public final String getCampaign_version() {
        return this.campaign_version;
    }

    public final String getClick_id() {
        return this.click_id;
    }

    public final boolean getReduced_motion() {
        return this.reduced_motion;
    }

    public final boolean getVoice_over() {
        return this.voice_over;
    }

    public final int getEngagement_time() {
        return this.engagement_time;
    }

    public final String getReferral_code() {
        return this.referral_code;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getVersion() {
        return this.version;
    }

    public final String getDensity_independent_resolution() {
        return this.density_independent_resolution;
    }

    public final boolean getWebview() {
        return this.webview;
    }

    public final String getWeb_device_hash() {
        return this.web_device_hash;
    }

    public final String getToken_hash() {
        return this.token_hash;
    }

    public final String getAdjust_device_id() {
        return this.adjust_device_id;
    }

    public final String getFirebase_app_instance_id() {
        return this.firebase_app_instance_id;
    }

    public final ThemeStyle getTheme_style() {
        return this.theme_style;
    }

    public final String getSingular_device_id() {
        return this.singular_device_id;
    }

    public final String getMasked_device_id() {
        return this.masked_device_id;
    }

    public final String getMasked_web_device_id() {
        return this.masked_web_device_id;
    }

    public final String getMasked_adid() {
        return this.masked_adid;
    }

    public final String getMasked_sharer_id() {
        return this.masked_sharer_id;
    }

    public final String getMasked_os_version() {
        return this.masked_os_version;
    }

    public final String getMasked_referral_code() {
        return this.masked_referral_code;
    }

    public final String getMasked_web_device_hash() {
        return this.masked_web_device_hash;
    }

    public final String getMasked_token_hash() {
        return this.masked_token_hash;
    }

    public final String getMasked_adjust_device_id() {
        return this.masked_adjust_device_id;
    }

    public final String getMasked_firebase_app_instance_id() {
        return this.masked_firebase_app_instance_id;
    }

    public final String getMasked_singular_device_id() {
        return this.masked_singular_device_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Device(String platform, String device_id, String web_device_id, String os_version, String manufacturer, String device_version, String screen_resolution, String adid, String font_size, String sharer_id, String sharer_url, String source, String campaign, String campaign_version, String click_id, boolean z, boolean z2, int i, String referral_code, String model, String version, String density_independent_resolution, boolean z3, String web_device_hash, String token_hash, String adjust_device_id, String firebase_app_instance_id, ThemeStyle theme_style, String singular_device_id, String masked_device_id, String masked_web_device_id, String masked_adid, String masked_sharer_id, String masked_os_version, String masked_referral_code, String masked_web_device_hash, String masked_token_hash, String masked_adjust_device_id, String masked_firebase_app_instance_id, String masked_singular_device_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(device_id, "device_id");
        Intrinsics.checkNotNullParameter(web_device_id, "web_device_id");
        Intrinsics.checkNotNullParameter(os_version, "os_version");
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        Intrinsics.checkNotNullParameter(device_version, "device_version");
        Intrinsics.checkNotNullParameter(screen_resolution, "screen_resolution");
        Intrinsics.checkNotNullParameter(adid, "adid");
        Intrinsics.checkNotNullParameter(font_size, "font_size");
        Intrinsics.checkNotNullParameter(sharer_id, "sharer_id");
        Intrinsics.checkNotNullParameter(sharer_url, "sharer_url");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(campaign, "campaign");
        Intrinsics.checkNotNullParameter(campaign_version, "campaign_version");
        Intrinsics.checkNotNullParameter(click_id, "click_id");
        Intrinsics.checkNotNullParameter(referral_code, "referral_code");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(density_independent_resolution, "density_independent_resolution");
        Intrinsics.checkNotNullParameter(web_device_hash, "web_device_hash");
        Intrinsics.checkNotNullParameter(token_hash, "token_hash");
        Intrinsics.checkNotNullParameter(adjust_device_id, "adjust_device_id");
        Intrinsics.checkNotNullParameter(firebase_app_instance_id, "firebase_app_instance_id");
        Intrinsics.checkNotNullParameter(theme_style, "theme_style");
        Intrinsics.checkNotNullParameter(singular_device_id, "singular_device_id");
        Intrinsics.checkNotNullParameter(masked_device_id, "masked_device_id");
        Intrinsics.checkNotNullParameter(masked_web_device_id, "masked_web_device_id");
        Intrinsics.checkNotNullParameter(masked_adid, "masked_adid");
        Intrinsics.checkNotNullParameter(masked_sharer_id, "masked_sharer_id");
        Intrinsics.checkNotNullParameter(masked_os_version, "masked_os_version");
        Intrinsics.checkNotNullParameter(masked_referral_code, "masked_referral_code");
        Intrinsics.checkNotNullParameter(masked_web_device_hash, "masked_web_device_hash");
        Intrinsics.checkNotNullParameter(masked_token_hash, "masked_token_hash");
        Intrinsics.checkNotNullParameter(masked_adjust_device_id, "masked_adjust_device_id");
        Intrinsics.checkNotNullParameter(masked_firebase_app_instance_id, "masked_firebase_app_instance_id");
        Intrinsics.checkNotNullParameter(masked_singular_device_id, "masked_singular_device_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.platform = platform;
        this.device_id = device_id;
        this.web_device_id = web_device_id;
        this.os_version = os_version;
        this.manufacturer = manufacturer;
        this.device_version = device_version;
        this.screen_resolution = screen_resolution;
        this.adid = adid;
        this.font_size = font_size;
        this.sharer_id = sharer_id;
        this.sharer_url = sharer_url;
        this.source = source;
        this.campaign = campaign;
        this.campaign_version = campaign_version;
        this.click_id = click_id;
        this.reduced_motion = z;
        this.voice_over = z2;
        this.engagement_time = i;
        this.referral_code = referral_code;
        this.model = model;
        this.version = version;
        this.density_independent_resolution = density_independent_resolution;
        this.webview = z3;
        this.web_device_hash = web_device_hash;
        this.token_hash = token_hash;
        this.adjust_device_id = adjust_device_id;
        this.firebase_app_instance_id = firebase_app_instance_id;
        this.theme_style = theme_style;
        this.singular_device_id = singular_device_id;
        this.masked_device_id = masked_device_id;
        this.masked_web_device_id = masked_web_device_id;
        this.masked_adid = masked_adid;
        this.masked_sharer_id = masked_sharer_id;
        this.masked_os_version = masked_os_version;
        this.masked_referral_code = masked_referral_code;
        this.masked_web_device_hash = masked_web_device_hash;
        this.masked_token_hash = masked_token_hash;
        this.masked_adjust_device_id = masked_adjust_device_id;
        this.masked_firebase_app_instance_id = masked_firebase_app_instance_id;
        this.masked_singular_device_id = masked_singular_device_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24194newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Device)) {
            return false;
        }
        Device device = (Device) other;
        return Intrinsics.areEqual(unknownFields(), device.unknownFields()) && Intrinsics.areEqual(this.platform, device.platform) && Intrinsics.areEqual(this.device_id, device.device_id) && Intrinsics.areEqual(this.web_device_id, device.web_device_id) && Intrinsics.areEqual(this.os_version, device.os_version) && Intrinsics.areEqual(this.manufacturer, device.manufacturer) && Intrinsics.areEqual(this.device_version, device.device_version) && Intrinsics.areEqual(this.screen_resolution, device.screen_resolution) && Intrinsics.areEqual(this.adid, device.adid) && Intrinsics.areEqual(this.font_size, device.font_size) && Intrinsics.areEqual(this.sharer_id, device.sharer_id) && Intrinsics.areEqual(this.sharer_url, device.sharer_url) && Intrinsics.areEqual(this.source, device.source) && Intrinsics.areEqual(this.campaign, device.campaign) && Intrinsics.areEqual(this.campaign_version, device.campaign_version) && Intrinsics.areEqual(this.click_id, device.click_id) && this.reduced_motion == device.reduced_motion && this.voice_over == device.voice_over && this.engagement_time == device.engagement_time && Intrinsics.areEqual(this.referral_code, device.referral_code) && Intrinsics.areEqual(this.model, device.model) && Intrinsics.areEqual(this.version, device.version) && Intrinsics.areEqual(this.density_independent_resolution, device.density_independent_resolution) && this.webview == device.webview && Intrinsics.areEqual(this.web_device_hash, device.web_device_hash) && Intrinsics.areEqual(this.token_hash, device.token_hash) && Intrinsics.areEqual(this.adjust_device_id, device.adjust_device_id) && Intrinsics.areEqual(this.firebase_app_instance_id, device.firebase_app_instance_id) && this.theme_style == device.theme_style && Intrinsics.areEqual(this.singular_device_id, device.singular_device_id) && Intrinsics.areEqual(this.masked_device_id, device.masked_device_id) && Intrinsics.areEqual(this.masked_web_device_id, device.masked_web_device_id) && Intrinsics.areEqual(this.masked_adid, device.masked_adid) && Intrinsics.areEqual(this.masked_sharer_id, device.masked_sharer_id) && Intrinsics.areEqual(this.masked_os_version, device.masked_os_version) && Intrinsics.areEqual(this.masked_referral_code, device.masked_referral_code) && Intrinsics.areEqual(this.masked_web_device_hash, device.masked_web_device_hash) && Intrinsics.areEqual(this.masked_token_hash, device.masked_token_hash) && Intrinsics.areEqual(this.masked_adjust_device_id, device.masked_adjust_device_id) && Intrinsics.areEqual(this.masked_firebase_app_instance_id, device.masked_firebase_app_instance_id) && Intrinsics.areEqual(this.masked_singular_device_id, device.masked_singular_device_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((unknownFields().hashCode() * 37) + this.platform.hashCode()) * 37) + this.device_id.hashCode()) * 37) + this.web_device_id.hashCode()) * 37) + this.os_version.hashCode()) * 37) + this.manufacturer.hashCode()) * 37) + this.device_version.hashCode()) * 37) + this.screen_resolution.hashCode()) * 37) + this.adid.hashCode()) * 37) + this.font_size.hashCode()) * 37) + this.sharer_id.hashCode()) * 37) + this.sharer_url.hashCode()) * 37) + this.source.hashCode()) * 37) + this.campaign.hashCode()) * 37) + this.campaign_version.hashCode()) * 37) + this.click_id.hashCode()) * 37) + java.lang.Boolean.hashCode(this.reduced_motion)) * 37) + java.lang.Boolean.hashCode(this.voice_over)) * 37) + Integer.hashCode(this.engagement_time)) * 37) + this.referral_code.hashCode()) * 37) + this.model.hashCode()) * 37) + this.version.hashCode()) * 37) + this.density_independent_resolution.hashCode()) * 37) + java.lang.Boolean.hashCode(this.webview)) * 37) + this.web_device_hash.hashCode()) * 37) + this.token_hash.hashCode()) * 37) + this.adjust_device_id.hashCode()) * 37) + this.firebase_app_instance_id.hashCode()) * 37) + this.theme_style.hashCode()) * 37) + this.singular_device_id.hashCode()) * 37) + this.masked_device_id.hashCode()) * 37) + this.masked_web_device_id.hashCode()) * 37) + this.masked_adid.hashCode()) * 37) + this.masked_sharer_id.hashCode()) * 37) + this.masked_os_version.hashCode()) * 37) + this.masked_referral_code.hashCode()) * 37) + this.masked_web_device_hash.hashCode()) * 37) + this.masked_token_hash.hashCode()) * 37) + this.masked_adjust_device_id.hashCode()) * 37) + this.masked_firebase_app_instance_id.hashCode()) * 37) + this.masked_singular_device_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("platform=" + Internal.sanitize(this.platform));
        arrayList.add("device_id=" + Internal.sanitize(this.device_id));
        arrayList.add("web_device_id=" + Internal.sanitize(this.web_device_id));
        arrayList.add("os_version=" + Internal.sanitize(this.os_version));
        arrayList.add("manufacturer=" + Internal.sanitize(this.manufacturer));
        arrayList.add("device_version=" + Internal.sanitize(this.device_version));
        arrayList.add("screen_resolution=" + Internal.sanitize(this.screen_resolution));
        arrayList.add("adid=" + Internal.sanitize(this.adid));
        arrayList.add("font_size=" + Internal.sanitize(this.font_size));
        arrayList.add("sharer_id=" + Internal.sanitize(this.sharer_id));
        arrayList.add("sharer_url=" + Internal.sanitize(this.sharer_url));
        arrayList.add("source=" + Internal.sanitize(this.source));
        arrayList.add("campaign=" + Internal.sanitize(this.campaign));
        arrayList.add("campaign_version=" + Internal.sanitize(this.campaign_version));
        arrayList.add("click_id=" + Internal.sanitize(this.click_id));
        arrayList.add("reduced_motion=" + this.reduced_motion);
        arrayList.add("voice_over=" + this.voice_over);
        arrayList.add("engagement_time=" + this.engagement_time);
        arrayList.add("referral_code=" + Internal.sanitize(this.referral_code));
        arrayList.add("model=" + Internal.sanitize(this.model));
        arrayList.add("version=" + Internal.sanitize(this.version));
        arrayList.add("density_independent_resolution=" + Internal.sanitize(this.density_independent_resolution));
        arrayList.add("webview=" + this.webview);
        arrayList.add("web_device_hash=" + Internal.sanitize(this.web_device_hash));
        arrayList.add("token_hash=" + Internal.sanitize(this.token_hash));
        arrayList.add("adjust_device_id=" + Internal.sanitize(this.adjust_device_id));
        arrayList.add("firebase_app_instance_id=" + Internal.sanitize(this.firebase_app_instance_id));
        arrayList.add("theme_style=" + this.theme_style);
        arrayList.add("singular_device_id=" + Internal.sanitize(this.singular_device_id));
        arrayList.add("masked_device_id=" + Internal.sanitize(this.masked_device_id));
        arrayList.add("masked_web_device_id=" + Internal.sanitize(this.masked_web_device_id));
        arrayList.add("masked_adid=" + Internal.sanitize(this.masked_adid));
        arrayList.add("masked_sharer_id=" + Internal.sanitize(this.masked_sharer_id));
        arrayList.add("masked_os_version=" + Internal.sanitize(this.masked_os_version));
        arrayList.add("masked_referral_code=" + Internal.sanitize(this.masked_referral_code));
        arrayList.add("masked_web_device_hash=" + Internal.sanitize(this.masked_web_device_hash));
        arrayList.add("masked_token_hash=" + Internal.sanitize(this.masked_token_hash));
        arrayList.add("masked_adjust_device_id=" + Internal.sanitize(this.masked_adjust_device_id));
        arrayList.add("masked_firebase_app_instance_id=" + Internal.sanitize(this.masked_firebase_app_instance_id));
        arrayList.add("masked_singular_device_id=" + Internal.sanitize(this.masked_singular_device_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "Device{", "}", 0, null, null, 56, null);
    }

    public final Device copy(String platform, String device_id, String web_device_id, String os_version, String manufacturer, String device_version, String screen_resolution, String adid, String font_size, String sharer_id, String sharer_url, String source, String campaign, String campaign_version, String click_id, boolean reduced_motion, boolean voice_over, int engagement_time, String referral_code, String model, String version, String density_independent_resolution, boolean webview, String web_device_hash, String token_hash, String adjust_device_id, String firebase_app_instance_id, ThemeStyle theme_style, String singular_device_id, String masked_device_id, String masked_web_device_id, String masked_adid, String masked_sharer_id, String masked_os_version, String masked_referral_code, String masked_web_device_hash, String masked_token_hash, String masked_adjust_device_id, String masked_firebase_app_instance_id, String masked_singular_device_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(device_id, "device_id");
        Intrinsics.checkNotNullParameter(web_device_id, "web_device_id");
        Intrinsics.checkNotNullParameter(os_version, "os_version");
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        Intrinsics.checkNotNullParameter(device_version, "device_version");
        Intrinsics.checkNotNullParameter(screen_resolution, "screen_resolution");
        Intrinsics.checkNotNullParameter(adid, "adid");
        Intrinsics.checkNotNullParameter(font_size, "font_size");
        Intrinsics.checkNotNullParameter(sharer_id, "sharer_id");
        Intrinsics.checkNotNullParameter(sharer_url, "sharer_url");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(campaign, "campaign");
        Intrinsics.checkNotNullParameter(campaign_version, "campaign_version");
        Intrinsics.checkNotNullParameter(click_id, "click_id");
        Intrinsics.checkNotNullParameter(referral_code, "referral_code");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(density_independent_resolution, "density_independent_resolution");
        Intrinsics.checkNotNullParameter(web_device_hash, "web_device_hash");
        Intrinsics.checkNotNullParameter(token_hash, "token_hash");
        Intrinsics.checkNotNullParameter(adjust_device_id, "adjust_device_id");
        Intrinsics.checkNotNullParameter(firebase_app_instance_id, "firebase_app_instance_id");
        Intrinsics.checkNotNullParameter(theme_style, "theme_style");
        Intrinsics.checkNotNullParameter(singular_device_id, "singular_device_id");
        Intrinsics.checkNotNullParameter(masked_device_id, "masked_device_id");
        Intrinsics.checkNotNullParameter(masked_web_device_id, "masked_web_device_id");
        Intrinsics.checkNotNullParameter(masked_adid, "masked_adid");
        Intrinsics.checkNotNullParameter(masked_sharer_id, "masked_sharer_id");
        Intrinsics.checkNotNullParameter(masked_os_version, "masked_os_version");
        Intrinsics.checkNotNullParameter(masked_referral_code, "masked_referral_code");
        Intrinsics.checkNotNullParameter(masked_web_device_hash, "masked_web_device_hash");
        Intrinsics.checkNotNullParameter(masked_token_hash, "masked_token_hash");
        Intrinsics.checkNotNullParameter(masked_adjust_device_id, "masked_adjust_device_id");
        Intrinsics.checkNotNullParameter(masked_firebase_app_instance_id, "masked_firebase_app_instance_id");
        Intrinsics.checkNotNullParameter(masked_singular_device_id, "masked_singular_device_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Device(platform, device_id, web_device_id, os_version, manufacturer, device_version, screen_resolution, adid, font_size, sharer_id, sharer_url, source, campaign, campaign_version, click_id, reduced_motion, voice_over, engagement_time, referral_code, model, version, density_independent_resolution, webview, web_device_hash, token_hash, adjust_device_id, firebase_app_instance_id, theme_style, singular_device_id, masked_device_id, masked_web_device_id, masked_adid, masked_sharer_id, masked_os_version, masked_referral_code, masked_web_device_hash, masked_token_hash, masked_adjust_device_id, masked_firebase_app_instance_id, masked_singular_device_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Device.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Device>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.Device$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Device value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getPlatform(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getPlatform());
                }
                if (!Intrinsics.areEqual(value.getDevice_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getDevice_id());
                }
                if (!Intrinsics.areEqual(value.getWeb_device_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getWeb_device_id());
                }
                if (!Intrinsics.areEqual(value.getOs_version(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getOs_version());
                }
                if (!Intrinsics.areEqual(value.getManufacturer(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getManufacturer());
                }
                if (!Intrinsics.areEqual(value.getDevice_version(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getDevice_version());
                }
                if (!Intrinsics.areEqual(value.getScreen_resolution(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getScreen_resolution());
                }
                if (!Intrinsics.areEqual(value.getAdid(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getAdid());
                }
                if (!Intrinsics.areEqual(value.getFont_size(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getFont_size());
                }
                if (!Intrinsics.areEqual(value.getSharer_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getSharer_id());
                }
                if (!Intrinsics.areEqual(value.getSharer_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getSharer_url());
                }
                if (!Intrinsics.areEqual(value.getSource(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(12, value.getSource());
                }
                if (!Intrinsics.areEqual(value.getCampaign(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(13, value.getCampaign());
                }
                if (!Intrinsics.areEqual(value.getCampaign_version(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(14, value.getCampaign_version());
                }
                if (!Intrinsics.areEqual(value.getClick_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(15, value.getClick_id());
                }
                if (value.getReduced_motion()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(16, java.lang.Boolean.valueOf(value.getReduced_motion()));
                }
                if (value.getVoice_over()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(17, java.lang.Boolean.valueOf(value.getVoice_over()));
                }
                if (value.getEngagement_time() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(18, Integer.valueOf(value.getEngagement_time()));
                }
                if (!Intrinsics.areEqual(value.getReferral_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(19, value.getReferral_code());
                }
                if (!Intrinsics.areEqual(value.getModel(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(20, value.getModel());
                }
                if (!Intrinsics.areEqual(value.getVersion(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(21, value.getVersion());
                }
                if (!Intrinsics.areEqual(value.getDensity_independent_resolution(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(22, value.getDensity_independent_resolution());
                }
                if (value.getWebview()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(23, java.lang.Boolean.valueOf(value.getWebview()));
                }
                if (!Intrinsics.areEqual(value.getWeb_device_hash(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(24, value.getWeb_device_hash());
                }
                if (!Intrinsics.areEqual(value.getToken_hash(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(25, value.getToken_hash());
                }
                if (!Intrinsics.areEqual(value.getAdjust_device_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(26, value.getAdjust_device_id());
                }
                if (!Intrinsics.areEqual(value.getFirebase_app_instance_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(27, value.getFirebase_app_instance_id());
                }
                if (value.getTheme_style() != Device.ThemeStyle.THEME_STYLE_UNSPECIFIED) {
                    size += Device.ThemeStyle.ADAPTER.encodedSizeWithTag(28, value.getTheme_style());
                }
                if (!Intrinsics.areEqual(value.getSingular_device_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(29, value.getSingular_device_id());
                }
                if (!Intrinsics.areEqual(value.getMasked_device_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1002, value.getMasked_device_id());
                }
                if (!Intrinsics.areEqual(value.getMasked_web_device_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1003, value.getMasked_web_device_id());
                }
                if (!Intrinsics.areEqual(value.getMasked_adid(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1008, value.getMasked_adid());
                }
                if (!Intrinsics.areEqual(value.getMasked_sharer_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1010, value.getMasked_sharer_id());
                }
                if (!Intrinsics.areEqual(value.getMasked_os_version(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1014, value.getMasked_os_version());
                }
                if (!Intrinsics.areEqual(value.getMasked_referral_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1019, value.getMasked_referral_code());
                }
                if (!Intrinsics.areEqual(value.getMasked_web_device_hash(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1024, value.getMasked_web_device_hash());
                }
                if (!Intrinsics.areEqual(value.getMasked_token_hash(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1025, value.getMasked_token_hash());
                }
                if (!Intrinsics.areEqual(value.getMasked_adjust_device_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1026, value.getMasked_adjust_device_id());
                }
                if (!Intrinsics.areEqual(value.getMasked_firebase_app_instance_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1027, value.getMasked_firebase_app_instance_id());
                }
                return !Intrinsics.areEqual(value.getMasked_singular_device_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1028, value.getMasked_singular_device_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Device value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getPlatform(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPlatform());
                }
                if (!Intrinsics.areEqual(value.getDevice_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDevice_id());
                }
                if (!Intrinsics.areEqual(value.getWeb_device_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getWeb_device_id());
                }
                if (!Intrinsics.areEqual(value.getOs_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getOs_version());
                }
                if (!Intrinsics.areEqual(value.getManufacturer(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getManufacturer());
                }
                if (!Intrinsics.areEqual(value.getDevice_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getDevice_version());
                }
                if (!Intrinsics.areEqual(value.getScreen_resolution(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getScreen_resolution());
                }
                if (!Intrinsics.areEqual(value.getAdid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getAdid());
                }
                if (!Intrinsics.areEqual(value.getFont_size(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getFont_size());
                }
                if (!Intrinsics.areEqual(value.getSharer_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getSharer_id());
                }
                if (!Intrinsics.areEqual(value.getSharer_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getSharer_url());
                }
                if (!Intrinsics.areEqual(value.getSource(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getSource());
                }
                if (!Intrinsics.areEqual(value.getCampaign(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getCampaign());
                }
                if (!Intrinsics.areEqual(value.getCampaign_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getCampaign_version());
                }
                if (!Intrinsics.areEqual(value.getClick_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getClick_id());
                }
                if (value.getReduced_motion()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 16, (int) java.lang.Boolean.valueOf(value.getReduced_motion()));
                }
                if (value.getVoice_over()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 17, (int) java.lang.Boolean.valueOf(value.getVoice_over()));
                }
                if (value.getEngagement_time() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 18, (int) Integer.valueOf(value.getEngagement_time()));
                }
                if (!Intrinsics.areEqual(value.getReferral_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 19, (int) value.getReferral_code());
                }
                if (!Intrinsics.areEqual(value.getModel(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 20, (int) value.getModel());
                }
                if (!Intrinsics.areEqual(value.getVersion(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 21, (int) value.getVersion());
                }
                if (!Intrinsics.areEqual(value.getDensity_independent_resolution(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 22, (int) value.getDensity_independent_resolution());
                }
                if (value.getWebview()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 23, (int) java.lang.Boolean.valueOf(value.getWebview()));
                }
                if (!Intrinsics.areEqual(value.getWeb_device_hash(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 24, (int) value.getWeb_device_hash());
                }
                if (!Intrinsics.areEqual(value.getToken_hash(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 25, (int) value.getToken_hash());
                }
                if (!Intrinsics.areEqual(value.getAdjust_device_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 26, (int) value.getAdjust_device_id());
                }
                if (!Intrinsics.areEqual(value.getFirebase_app_instance_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 27, (int) value.getFirebase_app_instance_id());
                }
                if (value.getTheme_style() != Device.ThemeStyle.THEME_STYLE_UNSPECIFIED) {
                    Device.ThemeStyle.ADAPTER.encodeWithTag(writer, 28, (int) value.getTheme_style());
                }
                if (!Intrinsics.areEqual(value.getSingular_device_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 29, (int) value.getSingular_device_id());
                }
                if (!Intrinsics.areEqual(value.getMasked_device_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1002, (int) value.getMasked_device_id());
                }
                if (!Intrinsics.areEqual(value.getMasked_web_device_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1003, (int) value.getMasked_web_device_id());
                }
                if (!Intrinsics.areEqual(value.getMasked_adid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1008, (int) value.getMasked_adid());
                }
                if (!Intrinsics.areEqual(value.getMasked_sharer_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1010, (int) value.getMasked_sharer_id());
                }
                if (!Intrinsics.areEqual(value.getMasked_os_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1014, (int) value.getMasked_os_version());
                }
                if (!Intrinsics.areEqual(value.getMasked_referral_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1019, (int) value.getMasked_referral_code());
                }
                if (!Intrinsics.areEqual(value.getMasked_web_device_hash(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1024, (int) value.getMasked_web_device_hash());
                }
                if (!Intrinsics.areEqual(value.getMasked_token_hash(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1025, (int) value.getMasked_token_hash());
                }
                if (!Intrinsics.areEqual(value.getMasked_adjust_device_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1026, (int) value.getMasked_adjust_device_id());
                }
                if (!Intrinsics.areEqual(value.getMasked_firebase_app_instance_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1027, (int) value.getMasked_firebase_app_instance_id());
                }
                if (!Intrinsics.areEqual(value.getMasked_singular_device_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1028, (int) value.getMasked_singular_device_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Device value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getMasked_singular_device_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1028, (int) value.getMasked_singular_device_id());
                }
                if (!Intrinsics.areEqual(value.getMasked_firebase_app_instance_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1027, (int) value.getMasked_firebase_app_instance_id());
                }
                if (!Intrinsics.areEqual(value.getMasked_adjust_device_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1026, (int) value.getMasked_adjust_device_id());
                }
                if (!Intrinsics.areEqual(value.getMasked_token_hash(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1025, (int) value.getMasked_token_hash());
                }
                if (!Intrinsics.areEqual(value.getMasked_web_device_hash(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1024, (int) value.getMasked_web_device_hash());
                }
                if (!Intrinsics.areEqual(value.getMasked_referral_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1019, (int) value.getMasked_referral_code());
                }
                if (!Intrinsics.areEqual(value.getMasked_os_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1014, (int) value.getMasked_os_version());
                }
                if (!Intrinsics.areEqual(value.getMasked_sharer_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1010, (int) value.getMasked_sharer_id());
                }
                if (!Intrinsics.areEqual(value.getMasked_adid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1008, (int) value.getMasked_adid());
                }
                if (!Intrinsics.areEqual(value.getMasked_web_device_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1003, (int) value.getMasked_web_device_id());
                }
                if (!Intrinsics.areEqual(value.getMasked_device_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1002, (int) value.getMasked_device_id());
                }
                if (!Intrinsics.areEqual(value.getSingular_device_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 29, (int) value.getSingular_device_id());
                }
                if (value.getTheme_style() != Device.ThemeStyle.THEME_STYLE_UNSPECIFIED) {
                    Device.ThemeStyle.ADAPTER.encodeWithTag(writer, 28, (int) value.getTheme_style());
                }
                if (!Intrinsics.areEqual(value.getFirebase_app_instance_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 27, (int) value.getFirebase_app_instance_id());
                }
                if (!Intrinsics.areEqual(value.getAdjust_device_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 26, (int) value.getAdjust_device_id());
                }
                if (!Intrinsics.areEqual(value.getToken_hash(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 25, (int) value.getToken_hash());
                }
                if (!Intrinsics.areEqual(value.getWeb_device_hash(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 24, (int) value.getWeb_device_hash());
                }
                if (value.getWebview()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 23, (int) java.lang.Boolean.valueOf(value.getWebview()));
                }
                if (!Intrinsics.areEqual(value.getDensity_independent_resolution(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 22, (int) value.getDensity_independent_resolution());
                }
                if (!Intrinsics.areEqual(value.getVersion(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 21, (int) value.getVersion());
                }
                if (!Intrinsics.areEqual(value.getModel(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 20, (int) value.getModel());
                }
                if (!Intrinsics.areEqual(value.getReferral_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 19, (int) value.getReferral_code());
                }
                if (value.getEngagement_time() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 18, (int) Integer.valueOf(value.getEngagement_time()));
                }
                if (value.getVoice_over()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 17, (int) java.lang.Boolean.valueOf(value.getVoice_over()));
                }
                if (value.getReduced_motion()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 16, (int) java.lang.Boolean.valueOf(value.getReduced_motion()));
                }
                if (!Intrinsics.areEqual(value.getClick_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getClick_id());
                }
                if (!Intrinsics.areEqual(value.getCampaign_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getCampaign_version());
                }
                if (!Intrinsics.areEqual(value.getCampaign(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getCampaign());
                }
                if (!Intrinsics.areEqual(value.getSource(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getSource());
                }
                if (!Intrinsics.areEqual(value.getSharer_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getSharer_url());
                }
                if (!Intrinsics.areEqual(value.getSharer_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getSharer_id());
                }
                if (!Intrinsics.areEqual(value.getFont_size(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getFont_size());
                }
                if (!Intrinsics.areEqual(value.getAdid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getAdid());
                }
                if (!Intrinsics.areEqual(value.getScreen_resolution(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getScreen_resolution());
                }
                if (!Intrinsics.areEqual(value.getDevice_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getDevice_version());
                }
                if (!Intrinsics.areEqual(value.getManufacturer(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getManufacturer());
                }
                if (!Intrinsics.areEqual(value.getOs_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getOs_version());
                }
                if (!Intrinsics.areEqual(value.getWeb_device_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getWeb_device_id());
                }
                if (!Intrinsics.areEqual(value.getDevice_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDevice_id());
                }
                if (Intrinsics.areEqual(value.getPlatform(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPlatform());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Device decode(ProtoReader reader) throws IOException {
                String str;
                String str2;
                String str3;
                Intrinsics.checkNotNullParameter(reader, "reader");
                Device.ThemeStyle themeStyle = Device.ThemeStyle.THEME_STYLE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Device.ThemeStyle themeStyleDecode = themeStyle;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                String strDecode8 = strDecode7;
                String strDecode9 = strDecode8;
                String strDecode10 = strDecode9;
                String strDecode11 = strDecode10;
                String strDecode12 = strDecode11;
                String strDecode13 = strDecode12;
                String strDecode14 = strDecode13;
                String strDecode15 = strDecode14;
                String strDecode16 = strDecode15;
                String strDecode17 = strDecode16;
                String strDecode18 = strDecode17;
                String strDecode19 = strDecode18;
                String strDecode20 = strDecode19;
                String strDecode21 = strDecode20;
                String strDecode22 = strDecode21;
                String strDecode23 = strDecode22;
                String strDecode24 = strDecode23;
                String strDecode25 = strDecode24;
                String strDecode26 = strDecode25;
                String strDecode27 = strDecode26;
                String strDecode28 = strDecode27;
                String strDecode29 = strDecode28;
                String strDecode30 = strDecode29;
                String strDecode31 = strDecode30;
                String strDecode32 = strDecode31;
                String strDecode33 = strDecode32;
                String strDecode34 = strDecode33;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                int iIntValue = 0;
                boolean zBooleanValue3 = false;
                String strDecode35 = strDecode34;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Device(strDecode35, strDecode, strDecode2, strDecode3, strDecode4, strDecode5, strDecode6, strDecode7, strDecode8, strDecode9, strDecode10, strDecode11, strDecode12, strDecode13, strDecode14, zBooleanValue, zBooleanValue2, iIntValue, strDecode15, strDecode16, strDecode17, strDecode18, zBooleanValue3, strDecode19, strDecode20, strDecode21, strDecode22, themeStyleDecode, strDecode23, strDecode24, strDecode25, strDecode26, strDecode27, strDecode28, strDecode29, strDecode30, strDecode31, strDecode32, strDecode33, strDecode34, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1002) {
                        strDecode24 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 1003) {
                        strDecode25 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 1008) {
                        strDecode26 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 1010) {
                        strDecode27 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 1014) {
                        strDecode28 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag != 1019) {
                        switch (iNextTag) {
                            case 1:
                                strDecode35 = ProtoAdapter.STRING.decode(reader);
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
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 6:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 7:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 8:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 9:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 10:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 11:
                                strDecode10 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 12:
                                strDecode11 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 13:
                                strDecode12 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 14:
                                strDecode13 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 15:
                                strDecode14 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 16:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                continue;
                            case 17:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                continue;
                            case 18:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                continue;
                            case 19:
                                strDecode15 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 20:
                                strDecode16 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 21:
                                strDecode17 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 22:
                                strDecode18 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 23:
                                zBooleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                continue;
                            case 24:
                                strDecode19 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 25:
                                strDecode20 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 26:
                                strDecode21 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 27:
                                strDecode22 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 28:
                                try {
                                    themeStyleDecode = Device.ThemeStyle.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    str = strDecode35;
                                    str2 = strDecode;
                                    str3 = strDecode2;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 29:
                                strDecode23 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            default:
                                switch (iNextTag) {
                                    case 1024:
                                        strDecode30 = ProtoAdapter.STRING.decode(reader);
                                        continue;
                                    case 1025:
                                        strDecode31 = ProtoAdapter.STRING.decode(reader);
                                        continue;
                                    case 1026:
                                        strDecode32 = ProtoAdapter.STRING.decode(reader);
                                        continue;
                                    case 1027:
                                        strDecode33 = ProtoAdapter.STRING.decode(reader);
                                        continue;
                                    case 1028:
                                        strDecode34 = ProtoAdapter.STRING.decode(reader);
                                        continue;
                                    default:
                                        reader.readUnknownField(iNextTag);
                                        str = strDecode35;
                                        str2 = strDecode;
                                        str3 = strDecode2;
                                        break;
                                }
                        }
                        strDecode35 = str;
                        strDecode = str2;
                        strDecode2 = str3;
                    } else {
                        strDecode29 = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Device redact(Device value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.copy(((-129) & 1) != 0 ? value.platform : null, ((-129) & 2) != 0 ? value.device_id : null, ((-129) & 4) != 0 ? value.web_device_id : null, ((-129) & 8) != 0 ? value.os_version : null, ((-129) & 16) != 0 ? value.manufacturer : null, ((-129) & 32) != 0 ? value.device_version : null, ((-129) & 64) != 0 ? value.screen_resolution : null, ((-129) & 128) != 0 ? value.adid : null, ((-129) & 256) != 0 ? value.font_size : null, ((-129) & 512) != 0 ? value.sharer_id : null, ((-129) & 1024) != 0 ? value.sharer_url : null, ((-129) & 2048) != 0 ? value.source : null, ((-129) & 4096) != 0 ? value.campaign : null, ((-129) & 8192) != 0 ? value.campaign_version : null, ((-129) & 16384) != 0 ? value.click_id : null, ((-129) & 32768) != 0 ? value.reduced_motion : false, ((-129) & 65536) != 0 ? value.voice_over : false, ((-129) & 131072) != 0 ? value.engagement_time : 0, ((-129) & 262144) != 0 ? value.referral_code : null, ((-129) & 524288) != 0 ? value.model : null, ((-129) & 1048576) != 0 ? value.version : null, ((-129) & 2097152) != 0 ? value.density_independent_resolution : null, ((-129) & 4194304) != 0 ? value.webview : false, ((-129) & 8388608) != 0 ? value.web_device_hash : null, ((-129) & 16777216) != 0 ? value.token_hash : null, ((-129) & 33554432) != 0 ? value.adjust_device_id : null, ((-129) & 67108864) != 0 ? value.firebase_app_instance_id : null, ((-129) & 134217728) != 0 ? value.theme_style : null, ((-129) & 268435456) != 0 ? value.singular_device_id : null, ((-129) & 536870912) != 0 ? value.masked_device_id : null, ((-129) & 1073741824) != 0 ? value.masked_web_device_id : null, ((-129) & Integer.MIN_VALUE) != 0 ? value.masked_adid : null, (511 & 1) != 0 ? value.masked_sharer_id : null, (511 & 2) != 0 ? value.masked_os_version : null, (511 & 4) != 0 ? value.masked_referral_code : null, (511 & 8) != 0 ? value.masked_web_device_hash : null, (511 & 16) != 0 ? value.masked_token_hash : null, (511 & 32) != 0 ? value.masked_adjust_device_id : null, (511 & 64) != 0 ? value.masked_firebase_app_instance_id : null, (511 & 128) != 0 ? value.masked_singular_device_id : null, (511 & 256) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Device.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/Device$ThemeStyle;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "THEME_STYLE_UNSPECIFIED", "LIGHT", "DARK", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class ThemeStyle implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ThemeStyle[] $VALUES;

        @JvmField
        public static final ProtoAdapter<ThemeStyle> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ThemeStyle DARK;
        public static final ThemeStyle LIGHT;
        public static final ThemeStyle THEME_STYLE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ ThemeStyle[] $values() {
            return new ThemeStyle[]{THEME_STYLE_UNSPECIFIED, LIGHT, DARK};
        }

        @JvmStatic
        public static final ThemeStyle fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<ThemeStyle> getEntries() {
            return $ENTRIES;
        }

        private ThemeStyle(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final ThemeStyle themeStyle = new ThemeStyle("THEME_STYLE_UNSPECIFIED", 0, 0);
            THEME_STYLE_UNSPECIFIED = themeStyle;
            LIGHT = new ThemeStyle("LIGHT", 1, 1);
            DARK = new ThemeStyle("DARK", 2, 2);
            ThemeStyle[] themeStyleArr$values = $values();
            $VALUES = themeStyleArr$values;
            $ENTRIES = EnumEntries2.enumEntries(themeStyleArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ThemeStyle.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ThemeStyle>(orCreateKotlinClass, syntax, themeStyle) { // from class: com.robinhood.rosetta.eventlogging.Device$ThemeStyle$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public Device.ThemeStyle fromValue(int value) {
                    return Device.ThemeStyle.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: Device.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/Device$ThemeStyle$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/Device$ThemeStyle;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final ThemeStyle fromValue(int value) {
                if (value == 0) {
                    return ThemeStyle.THEME_STYLE_UNSPECIFIED;
                }
                if (value == 1) {
                    return ThemeStyle.LIGHT;
                }
                if (value != 2) {
                    return null;
                }
                return ThemeStyle.DARK;
            }
        }

        public static ThemeStyle valueOf(String str) {
            return (ThemeStyle) Enum.valueOf(ThemeStyle.class, str);
        }

        public static ThemeStyle[] values() {
            return (ThemeStyle[]) $VALUES.clone();
        }
    }
}
