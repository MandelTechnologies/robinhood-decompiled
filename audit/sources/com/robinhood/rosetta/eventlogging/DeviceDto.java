package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.rosetta.eventlogging.Device;
import com.robinhood.rosetta.eventlogging.DeviceDto;
import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: DeviceDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b>\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 o2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005nopqrB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0099\u0003\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\t\u0012\b\b\u0002\u0010\u001e\u001a\u00020\t\u0012\b\b\u0002\u0010\u001f\u001a\u00020\t\u0012\b\b\u0002\u0010 \u001a\u00020\t\u0012\b\b\u0002\u0010!\u001a\u00020\u0019\u0012\b\b\u0002\u0010\"\u001a\u00020\t\u0012\b\b\u0002\u0010#\u001a\u00020\t\u0012\b\b\u0002\u0010$\u001a\u00020\t\u0012\b\b\u0002\u0010%\u001a\u00020\t\u0012\b\b\u0002\u0010&\u001a\u00020'\u0012\b\b\u0002\u0010(\u001a\u00020\t\u0012\b\b\u0002\u0010)\u001a\u00020\t\u0012\b\b\u0002\u0010*\u001a\u00020\t\u0012\b\b\u0002\u0010+\u001a\u00020\t\u0012\b\b\u0002\u0010,\u001a\u00020\t\u0012\b\b\u0002\u0010-\u001a\u00020\t\u0012\b\b\u0002\u0010.\u001a\u00020\t\u0012\b\b\u0002\u0010/\u001a\u00020\t\u0012\b\b\u0002\u00100\u001a\u00020\t\u0012\b\b\u0002\u00101\u001a\u00020\t\u0012\b\b\u0002\u00102\u001a\u00020\t\u0012\b\b\u0002\u00103\u001a\u00020\t¢\u0006\u0004\b\u0006\u00104J\u0096\u0003\u0010a\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020\u00192\b\b\u0002\u0010\"\u001a\u00020\t2\b\b\u0002\u0010#\u001a\u00020\t2\b\b\u0002\u0010$\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020\t2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020\t2\b\b\u0002\u0010)\u001a\u00020\t2\b\b\u0002\u0010*\u001a\u00020\t2\b\b\u0002\u0010+\u001a\u00020\t2\b\b\u0002\u0010,\u001a\u00020\t2\b\b\u0002\u0010-\u001a\u00020\t2\b\b\u0002\u0010.\u001a\u00020\t2\b\b\u0002\u0010/\u001a\u00020\t2\b\b\u0002\u00100\u001a\u00020\t2\b\b\u0002\u00101\u001a\u00020\t2\b\b\u0002\u00102\u001a\u00020\t2\b\b\u0002\u00103\u001a\u00020\tJ\b\u0010b\u001a\u00020\u0002H\u0016J\b\u0010c\u001a\u00020\tH\u0016J\u0013\u0010d\u001a\u00020\u00192\b\u0010e\u001a\u0004\u0018\u00010fH\u0096\u0002J\b\u0010g\u001a\u00020\u001cH\u0016J\u0018\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020\u001cH\u0016J\b\u0010m\u001a\u00020\u001cH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b7\u00106R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b8\u00106R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b9\u00106R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b:\u00106R\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b;\u00106R\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b<\u00106R\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b=\u00106R\u0011\u0010\u0011\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b>\u00106R\u0011\u0010\u0012\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b?\u00106R\u0011\u0010\u0013\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b@\u00106R\u0011\u0010\u0014\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bA\u00106R\u0011\u0010\u0015\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bB\u00106R\u0011\u0010\u0016\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bC\u00106R\u0011\u0010\u0017\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bD\u00106R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0011\u0010\u001a\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bG\u0010FR\u0011\u0010\u001b\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0011\u0010\u001d\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bJ\u00106R\u0011\u0010\u001e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bK\u00106R\u0011\u0010\u001f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bL\u00106R\u0011\u0010 \u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bM\u00106R\u0011\u0010!\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bN\u0010FR\u0011\u0010\"\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bO\u00106R\u0011\u0010#\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bP\u00106R\u0011\u0010$\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bQ\u00106R\u0011\u0010%\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bR\u00106R\u0011\u0010&\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0011\u0010(\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bU\u00106R\u0011\u0010)\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bV\u00106R\u0011\u0010*\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bW\u00106R\u0011\u0010+\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bX\u00106R\u0011\u0010,\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bY\u00106R\u0011\u0010-\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bZ\u00106R\u0011\u0010.\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b[\u00106R\u0011\u0010/\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\\\u00106R\u0011\u00100\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b]\u00106R\u0011\u00101\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b^\u00106R\u0011\u00102\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b_\u00106R\u0011\u00103\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b`\u00106¨\u0006s"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/Device;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/DeviceDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DeviceDto$Surrogate;)V", "platform", "", "device_id", "web_device_id", "os_version", "manufacturer", "device_version", "screen_resolution", "adid", "font_size", "sharer_id", "sharer_url", "source", "campaign", "campaign_version", "click_id", "reduced_motion", "", "voice_over", "engagement_time", "", "referral_code", "model", "version", "density_independent_resolution", "webview", "web_device_hash", "token_hash", "adjust_device_id", "firebase_app_instance_id", "theme_style", "Lcom/robinhood/rosetta/eventlogging/DeviceDto$ThemeStyleDto;", "singular_device_id", "masked_device_id", "masked_web_device_id", "masked_adid", "masked_sharer_id", "masked_os_version", "masked_referral_code", "masked_web_device_hash", "masked_token_hash", "masked_adjust_device_id", "masked_firebase_app_instance_id", "masked_singular_device_id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/DeviceDto$ThemeStyleDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPlatform", "()Ljava/lang/String;", "getDevice_id", "getWeb_device_id", "getOs_version", "getManufacturer", "getDevice_version", "getScreen_resolution", "getAdid", "getFont_size", "getSharer_id", "getSharer_url", "getSource", "getCampaign", "getCampaign_version", "getClick_id", "getReduced_motion", "()Z", "getVoice_over", "getEngagement_time", "()I", "getReferral_code", "getModel", "getVersion", "getDensity_independent_resolution", "getWebview", "getWeb_device_hash", "getToken_hash", "getAdjust_device_id", "getFirebase_app_instance_id", "getTheme_style", "()Lcom/robinhood/rosetta/eventlogging/DeviceDto$ThemeStyleDto;", "getSingular_device_id", "getMasked_device_id", "getMasked_web_device_id", "getMasked_adid", "getMasked_sharer_id", "getMasked_os_version", "getMasked_referral_code", "getMasked_web_device_hash", "getMasked_token_hash", "getMasked_adjust_device_id", "getMasked_firebase_app_instance_id", "getMasked_singular_device_id", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "ThemeStyleDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class DeviceDto implements Dto3<Device>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<DeviceDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<DeviceDto, Device>> binaryBase64Serializer$delegate;
    private static final DeviceDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ DeviceDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private DeviceDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getPlatform() {
        return this.surrogate.getPlatform();
    }

    public final String getDevice_id() {
        return this.surrogate.getDevice_id();
    }

    public final String getWeb_device_id() {
        return this.surrogate.getWeb_device_id();
    }

    public final String getOs_version() {
        return this.surrogate.getOs_version();
    }

    public final String getManufacturer() {
        return this.surrogate.getManufacturer();
    }

    public final String getDevice_version() {
        return this.surrogate.getDevice_version();
    }

    public final String getScreen_resolution() {
        return this.surrogate.getScreen_resolution();
    }

    public final String getAdid() {
        return this.surrogate.getAdid();
    }

    public final String getFont_size() {
        return this.surrogate.getFont_size();
    }

    public final String getSharer_id() {
        return this.surrogate.getSharer_id();
    }

    public final String getSharer_url() {
        return this.surrogate.getSharer_url();
    }

    public final String getSource() {
        return this.surrogate.getSource();
    }

    public final String getCampaign() {
        return this.surrogate.getCampaign();
    }

    public final String getCampaign_version() {
        return this.surrogate.getCampaign_version();
    }

    public final String getClick_id() {
        return this.surrogate.getClick_id();
    }

    public final boolean getReduced_motion() {
        return this.surrogate.getReduced_motion();
    }

    public final boolean getVoice_over() {
        return this.surrogate.getVoice_over();
    }

    public final int getEngagement_time() {
        return this.surrogate.getEngagement_time();
    }

    public final String getReferral_code() {
        return this.surrogate.getReferral_code();
    }

    public final String getModel() {
        return this.surrogate.getModel();
    }

    public final String getVersion() {
        return this.surrogate.getVersion();
    }

    public final String getDensity_independent_resolution() {
        return this.surrogate.getDensity_independent_resolution();
    }

    public final boolean getWebview() {
        return this.surrogate.getWebview();
    }

    public final String getWeb_device_hash() {
        return this.surrogate.getWeb_device_hash();
    }

    public final String getToken_hash() {
        return this.surrogate.getToken_hash();
    }

    public final String getAdjust_device_id() {
        return this.surrogate.getAdjust_device_id();
    }

    public final String getFirebase_app_instance_id() {
        return this.surrogate.getFirebase_app_instance_id();
    }

    public final ThemeStyleDto getTheme_style() {
        return this.surrogate.getTheme_style();
    }

    public final String getSingular_device_id() {
        return this.surrogate.getSingular_device_id();
    }

    public final String getMasked_device_id() {
        return this.surrogate.getMasked_device_id();
    }

    public final String getMasked_web_device_id() {
        return this.surrogate.getMasked_web_device_id();
    }

    public final String getMasked_adid() {
        return this.surrogate.getMasked_adid();
    }

    public final String getMasked_sharer_id() {
        return this.surrogate.getMasked_sharer_id();
    }

    public final String getMasked_os_version() {
        return this.surrogate.getMasked_os_version();
    }

    public final String getMasked_referral_code() {
        return this.surrogate.getMasked_referral_code();
    }

    public final String getMasked_web_device_hash() {
        return this.surrogate.getMasked_web_device_hash();
    }

    public final String getMasked_token_hash() {
        return this.surrogate.getMasked_token_hash();
    }

    public final String getMasked_adjust_device_id() {
        return this.surrogate.getMasked_adjust_device_id();
    }

    public final String getMasked_firebase_app_instance_id() {
        return this.surrogate.getMasked_firebase_app_instance_id();
    }

    public final String getMasked_singular_device_id() {
        return this.surrogate.getMasked_singular_device_id();
    }

    public /* synthetic */ DeviceDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, boolean z, boolean z2, int i, String str16, String str17, String str18, String str19, boolean z3, String str20, String str21, String str22, String str23, ThemeStyleDto themeStyleDto, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? "" : str8, (i2 & 256) != 0 ? "" : str9, (i2 & 512) != 0 ? "" : str10, (i2 & 1024) != 0 ? "" : str11, (i2 & 2048) != 0 ? "" : str12, (i2 & 4096) != 0 ? "" : str13, (i2 & 8192) != 0 ? "" : str14, (i2 & 16384) != 0 ? "" : str15, (i2 & 32768) != 0 ? false : z, (i2 & 65536) != 0 ? false : z2, (i2 & 131072) != 0 ? 0 : i, (i2 & 262144) != 0 ? "" : str16, (i2 & 524288) != 0 ? "" : str17, (i2 & 1048576) != 0 ? "" : str18, (i2 & 2097152) != 0 ? "" : str19, (i2 & 4194304) == 0 ? z3 : false, (i2 & 8388608) != 0 ? "" : str20, (i2 & 16777216) != 0 ? "" : str21, (i2 & 33554432) != 0 ? "" : str22, (i2 & 67108864) != 0 ? "" : str23, (i2 & 134217728) != 0 ? ThemeStyleDto.INSTANCE.getZeroValue() : themeStyleDto, (i2 & 268435456) != 0 ? "" : str24, (i2 & 536870912) != 0 ? "" : str25, (i2 & 1073741824) != 0 ? "" : str26, (i2 & Integer.MIN_VALUE) != 0 ? "" : str27, (i3 & 1) != 0 ? "" : str28, (i3 & 2) != 0 ? "" : str29, (i3 & 4) != 0 ? "" : str30, (i3 & 8) != 0 ? "" : str31, (i3 & 16) != 0 ? "" : str32, (i3 & 32) != 0 ? "" : str33, (i3 & 64) != 0 ? "" : str34, (i3 & 128) != 0 ? "" : str35);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeviceDto(String platform, String device_id, String web_device_id, String os_version, String manufacturer, String device_version, String screen_resolution, String adid, String font_size, String sharer_id, String sharer_url, String source, String campaign, String campaign_version, String click_id, boolean z, boolean z2, int i, String referral_code, String model, String version, String density_independent_resolution, boolean z3, String web_device_hash, String token_hash, String adjust_device_id, String firebase_app_instance_id, ThemeStyleDto theme_style, String singular_device_id, String masked_device_id, String masked_web_device_id, String masked_adid, String masked_sharer_id, String masked_os_version, String masked_referral_code, String masked_web_device_hash, String masked_token_hash, String masked_adjust_device_id, String masked_firebase_app_instance_id, String masked_singular_device_id) {
        this(new Surrogate(platform, device_id, web_device_id, os_version, manufacturer, device_version, screen_resolution, adid, font_size, sharer_id, sharer_url, source, campaign, campaign_version, click_id, z, z2, i, referral_code, model, version, density_independent_resolution, z3, web_device_hash, token_hash, adjust_device_id, firebase_app_instance_id, theme_style, singular_device_id, masked_device_id, masked_web_device_id, masked_adid, masked_sharer_id, masked_os_version, masked_referral_code, masked_web_device_hash, masked_token_hash, masked_adjust_device_id, masked_firebase_app_instance_id, masked_singular_device_id));
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
    }

    public final DeviceDto copy(String platform, String device_id, String web_device_id, String os_version, String manufacturer, String device_version, String screen_resolution, String adid, String font_size, String sharer_id, String sharer_url, String source, String campaign, String campaign_version, String click_id, boolean reduced_motion, boolean voice_over, int engagement_time, String referral_code, String model, String version, String density_independent_resolution, boolean webview, String web_device_hash, String token_hash, String adjust_device_id, String firebase_app_instance_id, ThemeStyleDto theme_style, String singular_device_id, String masked_device_id, String masked_web_device_id, String masked_adid, String masked_sharer_id, String masked_os_version, String masked_referral_code, String masked_web_device_hash, String masked_token_hash, String masked_adjust_device_id, String masked_firebase_app_instance_id, String masked_singular_device_id) {
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
        return new DeviceDto(new Surrogate(platform, device_id, web_device_id, os_version, manufacturer, device_version, screen_resolution, adid, font_size, sharer_id, sharer_url, source, campaign, campaign_version, click_id, reduced_motion, voice_over, engagement_time, referral_code, model, version, density_independent_resolution, webview, web_device_hash, token_hash, adjust_device_id, firebase_app_instance_id, theme_style, singular_device_id, masked_device_id, masked_web_device_id, masked_adid, masked_sharer_id, masked_os_version, masked_referral_code, masked_web_device_hash, masked_token_hash, masked_adjust_device_id, masked_firebase_app_instance_id, masked_singular_device_id));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public Device toProto() {
        return new Device(this.surrogate.getPlatform(), this.surrogate.getDevice_id(), this.surrogate.getWeb_device_id(), this.surrogate.getOs_version(), this.surrogate.getManufacturer(), this.surrogate.getDevice_version(), this.surrogate.getScreen_resolution(), this.surrogate.getAdid(), this.surrogate.getFont_size(), this.surrogate.getSharer_id(), this.surrogate.getSharer_url(), this.surrogate.getSource(), this.surrogate.getCampaign(), this.surrogate.getCampaign_version(), this.surrogate.getClick_id(), this.surrogate.getReduced_motion(), this.surrogate.getVoice_over(), this.surrogate.getEngagement_time(), this.surrogate.getReferral_code(), this.surrogate.getModel(), this.surrogate.getVersion(), this.surrogate.getDensity_independent_resolution(), this.surrogate.getWebview(), this.surrogate.getWeb_device_hash(), this.surrogate.getToken_hash(), this.surrogate.getAdjust_device_id(), this.surrogate.getFirebase_app_instance_id(), (Device.ThemeStyle) this.surrogate.getTheme_style().toProto(), this.surrogate.getSingular_device_id(), this.surrogate.getMasked_device_id(), this.surrogate.getMasked_web_device_id(), this.surrogate.getMasked_adid(), this.surrogate.getMasked_sharer_id(), this.surrogate.getMasked_os_version(), this.surrogate.getMasked_referral_code(), this.surrogate.getMasked_web_device_hash(), this.surrogate.getMasked_token_hash(), this.surrogate.getMasked_adjust_device_id(), this.surrogate.getMasked_firebase_app_instance_id(), this.surrogate.getMasked_singular_device_id(), null, 0, 256, null);
    }

    public String toString() {
        return "[DeviceDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof DeviceDto) && Intrinsics.areEqual(((DeviceDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DeviceDto.kt */
    @Metadata(m3635d1 = {"\u0000S\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0003\b\u0084\u0001\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 Ã\u00012\u00020\u0001:\u0004Â\u0001Ã\u0001B¦\u0003\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0017\b\u0002\u0010\u0015\u001a\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\t0\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003\u0012\b\b\u0002\u0010 \u001a\u00020\u0003\u0012\b\b\u0002\u0010!\u001a\u00020\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020\u0003\u0012\b\b\u0002\u0010#\u001a\u00020$\u0012\b\b\u0002\u0010%\u001a\u00020\u0003\u0012\b\b\u0002\u0010&\u001a\u00020\u0003\u0012\b\b\u0002\u0010'\u001a\u00020\u0003\u0012\b\b\u0002\u0010(\u001a\u00020\u0003\u0012\b\b\u0002\u0010)\u001a\u00020\u0003\u0012\b\b\u0002\u0010*\u001a\u00020\u0003\u0012\b\b\u0002\u0010+\u001a\u00020\u0003\u0012\b\b\u0002\u0010,\u001a\u00020\u0003\u0012\b\b\u0002\u0010-\u001a\u00020\u0003\u0012\b\b\u0002\u0010.\u001a\u00020\u0003\u0012\b\b\u0002\u0010/\u001a\u00020\u0003\u0012\b\b\u0002\u00100\u001a\u00020\u0003¢\u0006\u0004\b1\u00102B«\u0003\b\u0010\u0012\u0006\u00103\u001a\u00020\u0016\u0012\u0006\u00104\u001a\u00020\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0013\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010$\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\b\u00100\u001a\u0004\u0018\u00010\u0003\u0012\b\u00105\u001a\u0004\u0018\u000106¢\u0006\u0004\b1\u00107J\n\u0010\u008d\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0096\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0099\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009a\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009c\u0001\u001a\u00020\u0013HÆ\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0013HÆ\u0003J\u0019\u0010\u009e\u0001\u001a\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\t0\u0019HÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010 \u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¡\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¢\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010£\u0001\u001a\u00020\u0013HÆ\u0003J\n\u0010¤\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¥\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¦\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010§\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¨\u0001\u001a\u00020$HÆ\u0003J\n\u0010©\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ª\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010«\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¬\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u00ad\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010®\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¯\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010°\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010±\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010²\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010³\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010´\u0001\u001a\u00020\u0003HÆ\u0003J©\u0003\u0010µ\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0017\b\u0002\u0010\u0015\u001a\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\t0\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00132\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\u00032\b\b\u0002\u0010,\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\u00032\b\b\u0002\u0010/\u001a\u00020\u00032\b\b\u0002\u00100\u001a\u00020\u0003HÆ\u0001J\u0015\u0010¶\u0001\u001a\u00020\u00132\t\u0010·\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010¸\u0001\u001a\u00020\u0016HÖ\u0001J\n\u0010¹\u0001\u001a\u00020\u0003HÖ\u0001J-\u0010º\u0001\u001a\u00030»\u00012\u0007\u0010¼\u0001\u001a\u00020\u00002\b\u0010½\u0001\u001a\u00030¾\u00012\b\u0010¿\u0001\u001a\u00030À\u0001H\u0001¢\u0006\u0003\bÁ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b<\u00109\u001a\u0004\b=\u0010;R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b>\u00109\u001a\u0004\b?\u0010;R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b@\u00109\u001a\u0004\bA\u0010;R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bB\u00109\u001a\u0004\bC\u0010;R\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bD\u00109\u001a\u0004\bE\u0010;R\u001c\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bF\u00109\u001a\u0004\bG\u0010;R\u001c\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bH\u00109\u001a\u0004\bI\u0010;R\u001c\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bJ\u00109\u001a\u0004\bK\u0010;R\u001c\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bL\u00109\u001a\u0004\bM\u0010;R\u001c\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bN\u00109\u001a\u0004\bO\u0010;R\u001c\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bP\u00109\u001a\u0004\bQ\u0010;R\u001c\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bR\u00109\u001a\u0004\bS\u0010;R\u001c\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bT\u00109\u001a\u0004\bU\u0010;R\u001c\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bV\u00109\u001a\u0004\bW\u0010;R\u001c\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bX\u00109\u001a\u0004\bY\u0010ZR\u001c\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b[\u00109\u001a\u0004\b\\\u0010ZR+\u0010\u0015\u001a\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\t0\u00198\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b]\u00109\u001a\u0004\b^\u0010_R\u001c\u0010\u001a\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b`\u00109\u001a\u0004\ba\u0010;R\u001c\u0010\u001b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bb\u00109\u001a\u0004\bc\u0010;R\u001c\u0010\u001c\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bd\u00109\u001a\u0004\be\u0010;R\u001c\u0010\u001d\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bf\u00109\u001a\u0004\bg\u0010;R\u001c\u0010\u001e\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bh\u00109\u001a\u0004\bi\u0010ZR\u001c\u0010\u001f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bj\u00109\u001a\u0004\bk\u0010;R\u001c\u0010 \u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bl\u00109\u001a\u0004\bm\u0010;R\u001c\u0010!\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bn\u00109\u001a\u0004\bo\u0010;R\u001c\u0010\"\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bp\u00109\u001a\u0004\bq\u0010;R\u001c\u0010#\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\br\u00109\u001a\u0004\bs\u0010tR\u001c\u0010%\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bu\u00109\u001a\u0004\bv\u0010;R\u001c\u0010&\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bw\u00109\u001a\u0004\bx\u0010;R\u001c\u0010'\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\by\u00109\u001a\u0004\bz\u0010;R\u001c\u0010(\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b{\u00109\u001a\u0004\b|\u0010;R\u001c\u0010)\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b}\u00109\u001a\u0004\b~\u0010;R\u001d\u0010*\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000f\n\u0000\u0012\u0004\b\u007f\u00109\u001a\u0005\b\u0080\u0001\u0010;R\u001e\u0010+\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0081\u0001\u00109\u001a\u0005\b\u0082\u0001\u0010;R\u001e\u0010,\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0083\u0001\u00109\u001a\u0005\b\u0084\u0001\u0010;R\u001e\u0010-\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0085\u0001\u00109\u001a\u0005\b\u0086\u0001\u0010;R\u001e\u0010.\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0087\u0001\u00109\u001a\u0005\b\u0088\u0001\u0010;R\u001e\u0010/\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0089\u0001\u00109\u001a\u0005\b\u008a\u0001\u0010;R\u001e\u00100\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u008b\u0001\u00109\u001a\u0005\b\u008c\u0001\u0010;¨\u0006Ä\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceDto$Surrogate;", "", "platform", "", "device_id", "web_device_id", "os_version", "manufacturer", "device_version", "screen_resolution", "adid", "font_size", "sharer_id", "sharer_url", "source", "campaign", "campaign_version", "click_id", "reduced_motion", "", "voice_over", "engagement_time", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "referral_code", "model", "version", "density_independent_resolution", "webview", "web_device_hash", "token_hash", "adjust_device_id", "firebase_app_instance_id", "theme_style", "Lcom/robinhood/rosetta/eventlogging/DeviceDto$ThemeStyleDto;", "singular_device_id", "masked_device_id", "masked_web_device_id", "masked_adid", "masked_sharer_id", "masked_os_version", "masked_referral_code", "masked_web_device_hash", "masked_token_hash", "masked_adjust_device_id", "masked_firebase_app_instance_id", "masked_singular_device_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/DeviceDto$ThemeStyleDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "seen1", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/DeviceDto$ThemeStyleDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getPlatform$annotations", "()V", "getPlatform", "()Ljava/lang/String;", "getDevice_id$annotations", "getDevice_id", "getWeb_device_id$annotations", "getWeb_device_id", "getOs_version$annotations", "getOs_version", "getManufacturer$annotations", "getManufacturer", "getDevice_version$annotations", "getDevice_version", "getScreen_resolution$annotations", "getScreen_resolution", "getAdid$annotations", "getAdid", "getFont_size$annotations", "getFont_size", "getSharer_id$annotations", "getSharer_id", "getSharer_url$annotations", "getSharer_url", "getSource$annotations", "getSource", "getCampaign$annotations", "getCampaign", "getCampaign_version$annotations", "getCampaign_version", "getClick_id$annotations", "getClick_id", "getReduced_motion$annotations", "getReduced_motion", "()Z", "getVoice_over$annotations", "getVoice_over", "getEngagement_time$annotations", "getEngagement_time", "()I", "getReferral_code$annotations", "getReferral_code", "getModel$annotations", "getModel", "getVersion$annotations", "getVersion", "getDensity_independent_resolution$annotations", "getDensity_independent_resolution", "getWebview$annotations", "getWebview", "getWeb_device_hash$annotations", "getWeb_device_hash", "getToken_hash$annotations", "getToken_hash", "getAdjust_device_id$annotations", "getAdjust_device_id", "getFirebase_app_instance_id$annotations", "getFirebase_app_instance_id", "getTheme_style$annotations", "getTheme_style", "()Lcom/robinhood/rosetta/eventlogging/DeviceDto$ThemeStyleDto;", "getSingular_device_id$annotations", "getSingular_device_id", "getMasked_device_id$annotations", "getMasked_device_id", "getMasked_web_device_id$annotations", "getMasked_web_device_id", "getMasked_adid$annotations", "getMasked_adid", "getMasked_sharer_id$annotations", "getMasked_sharer_id", "getMasked_os_version$annotations", "getMasked_os_version", "getMasked_referral_code$annotations", "getMasked_referral_code", "getMasked_web_device_hash$annotations", "getMasked_web_device_hash", "getMasked_token_hash$annotations", "getMasked_token_hash", "getMasked_adjust_device_id$annotations", "getMasked_adjust_device_id", "getMasked_firebase_app_instance_id$annotations", "getMasked_firebase_app_instance_id", "getMasked_singular_device_id$annotations", "getMasked_singular_device_id", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String adid;
        private final String adjust_device_id;
        private final String campaign;
        private final String campaign_version;
        private final String click_id;
        private final String density_independent_resolution;
        private final String device_id;
        private final String device_version;
        private final int engagement_time;
        private final String firebase_app_instance_id;
        private final String font_size;
        private final String manufacturer;
        private final String masked_adid;
        private final String masked_adjust_device_id;
        private final String masked_device_id;
        private final String masked_firebase_app_instance_id;
        private final String masked_os_version;
        private final String masked_referral_code;
        private final String masked_sharer_id;
        private final String masked_singular_device_id;
        private final String masked_token_hash;
        private final String masked_web_device_hash;
        private final String masked_web_device_id;
        private final String model;
        private final String os_version;
        private final String platform;
        private final boolean reduced_motion;
        private final String referral_code;
        private final String screen_resolution;
        private final String sharer_id;
        private final String sharer_url;
        private final String singular_device_id;
        private final String source;
        private final ThemeStyleDto theme_style;
        private final String token_hash;
        private final String version;
        private final boolean voice_over;
        private final String web_device_hash;
        private final String web_device_id;
        private final boolean webview;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, 0, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (ThemeStyleDto) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, 255, (DefaultConstructorMarker) null);
        }

        @SerialName("adid")
        @JsonAnnotations2(names = {"adid"})
        public static /* synthetic */ void getAdid$annotations() {
        }

        @SerialName("adjustDeviceId")
        @JsonAnnotations2(names = {"adjust_device_id"})
        public static /* synthetic */ void getAdjust_device_id$annotations() {
        }

        @SerialName("campaign")
        @JsonAnnotations2(names = {"campaign"})
        public static /* synthetic */ void getCampaign$annotations() {
        }

        @SerialName("campaignVersion")
        @JsonAnnotations2(names = {"campaign_version"})
        public static /* synthetic */ void getCampaign_version$annotations() {
        }

        @SerialName("clickId")
        @JsonAnnotations2(names = {"click_id"})
        public static /* synthetic */ void getClick_id$annotations() {
        }

        @SerialName("densityIndependentResolution")
        @JsonAnnotations2(names = {"density_independent_resolution"})
        public static /* synthetic */ void getDensity_independent_resolution$annotations() {
        }

        @SerialName(CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID)
        @JsonAnnotations2(names = {"device_id"})
        public static /* synthetic */ void getDevice_id$annotations() {
        }

        @SerialName("deviceVersion")
        @JsonAnnotations2(names = {"device_version"})
        public static /* synthetic */ void getDevice_version$annotations() {
        }

        @SerialName("engagementTime")
        @JsonAnnotations2(names = {"engagement_time"})
        public static /* synthetic */ void getEngagement_time$annotations() {
        }

        @SerialName("firebaseAppInstanceId")
        @JsonAnnotations2(names = {"firebase_app_instance_id"})
        public static /* synthetic */ void getFirebase_app_instance_id$annotations() {
        }

        @SerialName("fontSize")
        @JsonAnnotations2(names = {"font_size"})
        public static /* synthetic */ void getFont_size$annotations() {
        }

        @SerialName("manufacturer")
        @JsonAnnotations2(names = {"manufacturer"})
        public static /* synthetic */ void getManufacturer$annotations() {
        }

        @SerialName("maskedAdid")
        @JsonAnnotations2(names = {"masked_adid"})
        public static /* synthetic */ void getMasked_adid$annotations() {
        }

        @SerialName("maskedAdjustDeviceId")
        @JsonAnnotations2(names = {"masked_adjust_device_id"})
        public static /* synthetic */ void getMasked_adjust_device_id$annotations() {
        }

        @SerialName("maskedDeviceId")
        @JsonAnnotations2(names = {"masked_device_id"})
        public static /* synthetic */ void getMasked_device_id$annotations() {
        }

        @SerialName("maskedFirebaseAppInstanceId")
        @JsonAnnotations2(names = {"masked_firebase_app_instance_id"})
        public static /* synthetic */ void getMasked_firebase_app_instance_id$annotations() {
        }

        @SerialName("maskedOsVersion")
        @JsonAnnotations2(names = {"masked_os_version"})
        public static /* synthetic */ void getMasked_os_version$annotations() {
        }

        @SerialName("maskedReferralCode")
        @JsonAnnotations2(names = {"masked_referral_code"})
        public static /* synthetic */ void getMasked_referral_code$annotations() {
        }

        @SerialName("maskedSharerId")
        @JsonAnnotations2(names = {"masked_sharer_id"})
        public static /* synthetic */ void getMasked_sharer_id$annotations() {
        }

        @SerialName("maskedSingularDeviceId")
        @JsonAnnotations2(names = {"masked_singular_device_id"})
        public static /* synthetic */ void getMasked_singular_device_id$annotations() {
        }

        @SerialName("maskedTokenHash")
        @JsonAnnotations2(names = {"masked_token_hash"})
        public static /* synthetic */ void getMasked_token_hash$annotations() {
        }

        @SerialName("maskedWebDeviceHash")
        @JsonAnnotations2(names = {"masked_web_device_hash"})
        public static /* synthetic */ void getMasked_web_device_hash$annotations() {
        }

        @SerialName("maskedWebDeviceId")
        @JsonAnnotations2(names = {"masked_web_device_id"})
        public static /* synthetic */ void getMasked_web_device_id$annotations() {
        }

        @SerialName("model")
        @JsonAnnotations2(names = {"model"})
        public static /* synthetic */ void getModel$annotations() {
        }

        @SerialName("osVersion")
        @JsonAnnotations2(names = {"os_version"})
        public static /* synthetic */ void getOs_version$annotations() {
        }

        @SerialName("platform")
        @JsonAnnotations2(names = {"platform"})
        public static /* synthetic */ void getPlatform$annotations() {
        }

        @SerialName("reducedMotion")
        @JsonAnnotations2(names = {"reduced_motion"})
        public static /* synthetic */ void getReduced_motion$annotations() {
        }

        @SerialName("referralCode")
        @JsonAnnotations2(names = {"referral_code"})
        public static /* synthetic */ void getReferral_code$annotations() {
        }

        @SerialName("screenResolution")
        @JsonAnnotations2(names = {"screen_resolution"})
        public static /* synthetic */ void getScreen_resolution$annotations() {
        }

        @SerialName("sharerId")
        @JsonAnnotations2(names = {"sharer_id"})
        public static /* synthetic */ void getSharer_id$annotations() {
        }

        @SerialName("sharerUrl")
        @JsonAnnotations2(names = {"sharer_url"})
        public static /* synthetic */ void getSharer_url$annotations() {
        }

        @SerialName("singularDeviceId")
        @JsonAnnotations2(names = {"singular_device_id"})
        public static /* synthetic */ void getSingular_device_id$annotations() {
        }

        @SerialName("source")
        @JsonAnnotations2(names = {"source"})
        public static /* synthetic */ void getSource$annotations() {
        }

        @SerialName("themeStyle")
        @JsonAnnotations2(names = {"theme_style"})
        public static /* synthetic */ void getTheme_style$annotations() {
        }

        @SerialName("tokenHash")
        @JsonAnnotations2(names = {"token_hash"})
        public static /* synthetic */ void getToken_hash$annotations() {
        }

        @SerialName("version")
        @JsonAnnotations2(names = {"version"})
        public static /* synthetic */ void getVersion$annotations() {
        }

        @SerialName("voiceOver")
        @JsonAnnotations2(names = {"voice_over"})
        public static /* synthetic */ void getVoice_over$annotations() {
        }

        @SerialName("webDeviceHash")
        @JsonAnnotations2(names = {"web_device_hash"})
        public static /* synthetic */ void getWeb_device_hash$annotations() {
        }

        @SerialName("webDeviceId")
        @JsonAnnotations2(names = {"web_device_id"})
        public static /* synthetic */ void getWeb_device_id$annotations() {
        }

        @SerialName("webview")
        @JsonAnnotations2(names = {"webview"})
        public static /* synthetic */ void getWebview$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getPlatform() {
            return this.platform;
        }

        /* renamed from: component10, reason: from getter */
        public final String getSharer_id() {
            return this.sharer_id;
        }

        /* renamed from: component11, reason: from getter */
        public final String getSharer_url() {
            return this.sharer_url;
        }

        /* renamed from: component12, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component13, reason: from getter */
        public final String getCampaign() {
            return this.campaign;
        }

        /* renamed from: component14, reason: from getter */
        public final String getCampaign_version() {
            return this.campaign_version;
        }

        /* renamed from: component15, reason: from getter */
        public final String getClick_id() {
            return this.click_id;
        }

        /* renamed from: component16, reason: from getter */
        public final boolean getReduced_motion() {
            return this.reduced_motion;
        }

        /* renamed from: component17, reason: from getter */
        public final boolean getVoice_over() {
            return this.voice_over;
        }

        /* renamed from: component18, reason: from getter */
        public final int getEngagement_time() {
            return this.engagement_time;
        }

        /* renamed from: component19, reason: from getter */
        public final String getReferral_code() {
            return this.referral_code;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDevice_id() {
            return this.device_id;
        }

        /* renamed from: component20, reason: from getter */
        public final String getModel() {
            return this.model;
        }

        /* renamed from: component21, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        /* renamed from: component22, reason: from getter */
        public final String getDensity_independent_resolution() {
            return this.density_independent_resolution;
        }

        /* renamed from: component23, reason: from getter */
        public final boolean getWebview() {
            return this.webview;
        }

        /* renamed from: component24, reason: from getter */
        public final String getWeb_device_hash() {
            return this.web_device_hash;
        }

        /* renamed from: component25, reason: from getter */
        public final String getToken_hash() {
            return this.token_hash;
        }

        /* renamed from: component26, reason: from getter */
        public final String getAdjust_device_id() {
            return this.adjust_device_id;
        }

        /* renamed from: component27, reason: from getter */
        public final String getFirebase_app_instance_id() {
            return this.firebase_app_instance_id;
        }

        /* renamed from: component28, reason: from getter */
        public final ThemeStyleDto getTheme_style() {
            return this.theme_style;
        }

        /* renamed from: component29, reason: from getter */
        public final String getSingular_device_id() {
            return this.singular_device_id;
        }

        /* renamed from: component3, reason: from getter */
        public final String getWeb_device_id() {
            return this.web_device_id;
        }

        /* renamed from: component30, reason: from getter */
        public final String getMasked_device_id() {
            return this.masked_device_id;
        }

        /* renamed from: component31, reason: from getter */
        public final String getMasked_web_device_id() {
            return this.masked_web_device_id;
        }

        /* renamed from: component32, reason: from getter */
        public final String getMasked_adid() {
            return this.masked_adid;
        }

        /* renamed from: component33, reason: from getter */
        public final String getMasked_sharer_id() {
            return this.masked_sharer_id;
        }

        /* renamed from: component34, reason: from getter */
        public final String getMasked_os_version() {
            return this.masked_os_version;
        }

        /* renamed from: component35, reason: from getter */
        public final String getMasked_referral_code() {
            return this.masked_referral_code;
        }

        /* renamed from: component36, reason: from getter */
        public final String getMasked_web_device_hash() {
            return this.masked_web_device_hash;
        }

        /* renamed from: component37, reason: from getter */
        public final String getMasked_token_hash() {
            return this.masked_token_hash;
        }

        /* renamed from: component38, reason: from getter */
        public final String getMasked_adjust_device_id() {
            return this.masked_adjust_device_id;
        }

        /* renamed from: component39, reason: from getter */
        public final String getMasked_firebase_app_instance_id() {
            return this.masked_firebase_app_instance_id;
        }

        /* renamed from: component4, reason: from getter */
        public final String getOs_version() {
            return this.os_version;
        }

        /* renamed from: component40, reason: from getter */
        public final String getMasked_singular_device_id() {
            return this.masked_singular_device_id;
        }

        /* renamed from: component5, reason: from getter */
        public final String getManufacturer() {
            return this.manufacturer;
        }

        /* renamed from: component6, reason: from getter */
        public final String getDevice_version() {
            return this.device_version;
        }

        /* renamed from: component7, reason: from getter */
        public final String getScreen_resolution() {
            return this.screen_resolution;
        }

        /* renamed from: component8, reason: from getter */
        public final String getAdid() {
            return this.adid;
        }

        /* renamed from: component9, reason: from getter */
        public final String getFont_size() {
            return this.font_size;
        }

        public final Surrogate copy(String platform, String device_id, String web_device_id, String os_version, String manufacturer, String device_version, String screen_resolution, String adid, String font_size, String sharer_id, String sharer_url, String source, String campaign, String campaign_version, String click_id, boolean reduced_motion, boolean voice_over, int engagement_time, String referral_code, String model, String version, String density_independent_resolution, boolean webview, String web_device_hash, String token_hash, String adjust_device_id, String firebase_app_instance_id, ThemeStyleDto theme_style, String singular_device_id, String masked_device_id, String masked_web_device_id, String masked_adid, String masked_sharer_id, String masked_os_version, String masked_referral_code, String masked_web_device_hash, String masked_token_hash, String masked_adjust_device_id, String masked_firebase_app_instance_id, String masked_singular_device_id) {
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
            return new Surrogate(platform, device_id, web_device_id, os_version, manufacturer, device_version, screen_resolution, adid, font_size, sharer_id, sharer_url, source, campaign, campaign_version, click_id, reduced_motion, voice_over, engagement_time, referral_code, model, version, density_independent_resolution, webview, web_device_hash, token_hash, adjust_device_id, firebase_app_instance_id, theme_style, singular_device_id, masked_device_id, masked_web_device_id, masked_adid, masked_sharer_id, masked_os_version, masked_referral_code, masked_web_device_hash, masked_token_hash, masked_adjust_device_id, masked_firebase_app_instance_id, masked_singular_device_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.platform, surrogate.platform) && Intrinsics.areEqual(this.device_id, surrogate.device_id) && Intrinsics.areEqual(this.web_device_id, surrogate.web_device_id) && Intrinsics.areEqual(this.os_version, surrogate.os_version) && Intrinsics.areEqual(this.manufacturer, surrogate.manufacturer) && Intrinsics.areEqual(this.device_version, surrogate.device_version) && Intrinsics.areEqual(this.screen_resolution, surrogate.screen_resolution) && Intrinsics.areEqual(this.adid, surrogate.adid) && Intrinsics.areEqual(this.font_size, surrogate.font_size) && Intrinsics.areEqual(this.sharer_id, surrogate.sharer_id) && Intrinsics.areEqual(this.sharer_url, surrogate.sharer_url) && Intrinsics.areEqual(this.source, surrogate.source) && Intrinsics.areEqual(this.campaign, surrogate.campaign) && Intrinsics.areEqual(this.campaign_version, surrogate.campaign_version) && Intrinsics.areEqual(this.click_id, surrogate.click_id) && this.reduced_motion == surrogate.reduced_motion && this.voice_over == surrogate.voice_over && this.engagement_time == surrogate.engagement_time && Intrinsics.areEqual(this.referral_code, surrogate.referral_code) && Intrinsics.areEqual(this.model, surrogate.model) && Intrinsics.areEqual(this.version, surrogate.version) && Intrinsics.areEqual(this.density_independent_resolution, surrogate.density_independent_resolution) && this.webview == surrogate.webview && Intrinsics.areEqual(this.web_device_hash, surrogate.web_device_hash) && Intrinsics.areEqual(this.token_hash, surrogate.token_hash) && Intrinsics.areEqual(this.adjust_device_id, surrogate.adjust_device_id) && Intrinsics.areEqual(this.firebase_app_instance_id, surrogate.firebase_app_instance_id) && this.theme_style == surrogate.theme_style && Intrinsics.areEqual(this.singular_device_id, surrogate.singular_device_id) && Intrinsics.areEqual(this.masked_device_id, surrogate.masked_device_id) && Intrinsics.areEqual(this.masked_web_device_id, surrogate.masked_web_device_id) && Intrinsics.areEqual(this.masked_adid, surrogate.masked_adid) && Intrinsics.areEqual(this.masked_sharer_id, surrogate.masked_sharer_id) && Intrinsics.areEqual(this.masked_os_version, surrogate.masked_os_version) && Intrinsics.areEqual(this.masked_referral_code, surrogate.masked_referral_code) && Intrinsics.areEqual(this.masked_web_device_hash, surrogate.masked_web_device_hash) && Intrinsics.areEqual(this.masked_token_hash, surrogate.masked_token_hash) && Intrinsics.areEqual(this.masked_adjust_device_id, surrogate.masked_adjust_device_id) && Intrinsics.areEqual(this.masked_firebase_app_instance_id, surrogate.masked_firebase_app_instance_id) && Intrinsics.areEqual(this.masked_singular_device_id, surrogate.masked_singular_device_id);
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.platform.hashCode() * 31) + this.device_id.hashCode()) * 31) + this.web_device_id.hashCode()) * 31) + this.os_version.hashCode()) * 31) + this.manufacturer.hashCode()) * 31) + this.device_version.hashCode()) * 31) + this.screen_resolution.hashCode()) * 31) + this.adid.hashCode()) * 31) + this.font_size.hashCode()) * 31) + this.sharer_id.hashCode()) * 31) + this.sharer_url.hashCode()) * 31) + this.source.hashCode()) * 31) + this.campaign.hashCode()) * 31) + this.campaign_version.hashCode()) * 31) + this.click_id.hashCode()) * 31) + java.lang.Boolean.hashCode(this.reduced_motion)) * 31) + java.lang.Boolean.hashCode(this.voice_over)) * 31) + Integer.hashCode(this.engagement_time)) * 31) + this.referral_code.hashCode()) * 31) + this.model.hashCode()) * 31) + this.version.hashCode()) * 31) + this.density_independent_resolution.hashCode()) * 31) + java.lang.Boolean.hashCode(this.webview)) * 31) + this.web_device_hash.hashCode()) * 31) + this.token_hash.hashCode()) * 31) + this.adjust_device_id.hashCode()) * 31) + this.firebase_app_instance_id.hashCode()) * 31) + this.theme_style.hashCode()) * 31) + this.singular_device_id.hashCode()) * 31) + this.masked_device_id.hashCode()) * 31) + this.masked_web_device_id.hashCode()) * 31) + this.masked_adid.hashCode()) * 31) + this.masked_sharer_id.hashCode()) * 31) + this.masked_os_version.hashCode()) * 31) + this.masked_referral_code.hashCode()) * 31) + this.masked_web_device_hash.hashCode()) * 31) + this.masked_token_hash.hashCode()) * 31) + this.masked_adjust_device_id.hashCode()) * 31) + this.masked_firebase_app_instance_id.hashCode()) * 31) + this.masked_singular_device_id.hashCode();
        }

        public String toString() {
            return "Surrogate(platform=" + this.platform + ", device_id=" + this.device_id + ", web_device_id=" + this.web_device_id + ", os_version=" + this.os_version + ", manufacturer=" + this.manufacturer + ", device_version=" + this.device_version + ", screen_resolution=" + this.screen_resolution + ", adid=" + this.adid + ", font_size=" + this.font_size + ", sharer_id=" + this.sharer_id + ", sharer_url=" + this.sharer_url + ", source=" + this.source + ", campaign=" + this.campaign + ", campaign_version=" + this.campaign_version + ", click_id=" + this.click_id + ", reduced_motion=" + this.reduced_motion + ", voice_over=" + this.voice_over + ", engagement_time=" + this.engagement_time + ", referral_code=" + this.referral_code + ", model=" + this.model + ", version=" + this.version + ", density_independent_resolution=" + this.density_independent_resolution + ", webview=" + this.webview + ", web_device_hash=" + this.web_device_hash + ", token_hash=" + this.token_hash + ", adjust_device_id=" + this.adjust_device_id + ", firebase_app_instance_id=" + this.firebase_app_instance_id + ", theme_style=" + this.theme_style + ", singular_device_id=" + this.singular_device_id + ", masked_device_id=" + this.masked_device_id + ", masked_web_device_id=" + this.masked_web_device_id + ", masked_adid=" + this.masked_adid + ", masked_sharer_id=" + this.masked_sharer_id + ", masked_os_version=" + this.masked_os_version + ", masked_referral_code=" + this.masked_referral_code + ", masked_web_device_hash=" + this.masked_web_device_hash + ", masked_token_hash=" + this.masked_token_hash + ", masked_adjust_device_id=" + this.masked_adjust_device_id + ", masked_firebase_app_instance_id=" + this.masked_firebase_app_instance_id + ", masked_singular_device_id=" + this.masked_singular_device_id + ")";
        }

        /* compiled from: DeviceDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return DeviceDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, boolean z, boolean z2, int i3, String str16, String str17, String str18, String str19, boolean z3, String str20, String str21, String str22, String str23, ThemeStyleDto themeStyleDto, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.platform = "";
            } else {
                this.platform = str;
            }
            if ((i & 2) == 0) {
                this.device_id = "";
            } else {
                this.device_id = str2;
            }
            if ((i & 4) == 0) {
                this.web_device_id = "";
            } else {
                this.web_device_id = str3;
            }
            if ((i & 8) == 0) {
                this.os_version = "";
            } else {
                this.os_version = str4;
            }
            if ((i & 16) == 0) {
                this.manufacturer = "";
            } else {
                this.manufacturer = str5;
            }
            if ((i & 32) == 0) {
                this.device_version = "";
            } else {
                this.device_version = str6;
            }
            if ((i & 64) == 0) {
                this.screen_resolution = "";
            } else {
                this.screen_resolution = str7;
            }
            if ((i & 128) == 0) {
                this.adid = "";
            } else {
                this.adid = str8;
            }
            if ((i & 256) == 0) {
                this.font_size = "";
            } else {
                this.font_size = str9;
            }
            if ((i & 512) == 0) {
                this.sharer_id = "";
            } else {
                this.sharer_id = str10;
            }
            if ((i & 1024) == 0) {
                this.sharer_url = "";
            } else {
                this.sharer_url = str11;
            }
            if ((i & 2048) == 0) {
                this.source = "";
            } else {
                this.source = str12;
            }
            if ((i & 4096) == 0) {
                this.campaign = "";
            } else {
                this.campaign = str13;
            }
            if ((i & 8192) == 0) {
                this.campaign_version = "";
            } else {
                this.campaign_version = str14;
            }
            if ((i & 16384) == 0) {
                this.click_id = "";
            } else {
                this.click_id = str15;
            }
            if ((32768 & i) == 0) {
                this.reduced_motion = false;
            } else {
                this.reduced_motion = z;
            }
            if ((65536 & i) == 0) {
                this.voice_over = false;
            } else {
                this.voice_over = z2;
            }
            if ((131072 & i) == 0) {
                this.engagement_time = 0;
            } else {
                this.engagement_time = i3;
            }
            if ((262144 & i) == 0) {
                this.referral_code = "";
            } else {
                this.referral_code = str16;
            }
            if ((524288 & i) == 0) {
                this.model = "";
            } else {
                this.model = str17;
            }
            if ((1048576 & i) == 0) {
                this.version = "";
            } else {
                this.version = str18;
            }
            if ((2097152 & i) == 0) {
                this.density_independent_resolution = "";
            } else {
                this.density_independent_resolution = str19;
            }
            if ((4194304 & i) == 0) {
                this.webview = false;
            } else {
                this.webview = z3;
            }
            if ((8388608 & i) == 0) {
                this.web_device_hash = "";
            } else {
                this.web_device_hash = str20;
            }
            if ((16777216 & i) == 0) {
                this.token_hash = "";
            } else {
                this.token_hash = str21;
            }
            if ((33554432 & i) == 0) {
                this.adjust_device_id = "";
            } else {
                this.adjust_device_id = str22;
            }
            if ((67108864 & i) == 0) {
                this.firebase_app_instance_id = "";
            } else {
                this.firebase_app_instance_id = str23;
            }
            this.theme_style = (134217728 & i) == 0 ? ThemeStyleDto.INSTANCE.getZeroValue() : themeStyleDto;
            if ((268435456 & i) == 0) {
                this.singular_device_id = "";
            } else {
                this.singular_device_id = str24;
            }
            if ((536870912 & i) == 0) {
                this.masked_device_id = "";
            } else {
                this.masked_device_id = str25;
            }
            if ((1073741824 & i) == 0) {
                this.masked_web_device_id = "";
            } else {
                this.masked_web_device_id = str26;
            }
            if ((i & Integer.MIN_VALUE) == 0) {
                this.masked_adid = "";
            } else {
                this.masked_adid = str27;
            }
            if ((i2 & 1) == 0) {
                this.masked_sharer_id = "";
            } else {
                this.masked_sharer_id = str28;
            }
            if ((i2 & 2) == 0) {
                this.masked_os_version = "";
            } else {
                this.masked_os_version = str29;
            }
            if ((i2 & 4) == 0) {
                this.masked_referral_code = "";
            } else {
                this.masked_referral_code = str30;
            }
            if ((i2 & 8) == 0) {
                this.masked_web_device_hash = "";
            } else {
                this.masked_web_device_hash = str31;
            }
            if ((i2 & 16) == 0) {
                this.masked_token_hash = "";
            } else {
                this.masked_token_hash = str32;
            }
            if ((i2 & 32) == 0) {
                this.masked_adjust_device_id = "";
            } else {
                this.masked_adjust_device_id = str33;
            }
            if ((i2 & 64) == 0) {
                this.masked_firebase_app_instance_id = "";
            } else {
                this.masked_firebase_app_instance_id = str34;
            }
            if ((i2 & 128) == 0) {
                this.masked_singular_device_id = "";
            } else {
                this.masked_singular_device_id = str35;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.platform, "")) {
                output.encodeStringElement(serialDesc, 0, self.platform);
            }
            if (!Intrinsics.areEqual(self.device_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.device_id);
            }
            if (!Intrinsics.areEqual(self.web_device_id, "")) {
                output.encodeStringElement(serialDesc, 2, self.web_device_id);
            }
            if (!Intrinsics.areEqual(self.os_version, "")) {
                output.encodeStringElement(serialDesc, 3, self.os_version);
            }
            if (!Intrinsics.areEqual(self.manufacturer, "")) {
                output.encodeStringElement(serialDesc, 4, self.manufacturer);
            }
            if (!Intrinsics.areEqual(self.device_version, "")) {
                output.encodeStringElement(serialDesc, 5, self.device_version);
            }
            if (!Intrinsics.areEqual(self.screen_resolution, "")) {
                output.encodeStringElement(serialDesc, 6, self.screen_resolution);
            }
            if (!Intrinsics.areEqual(self.adid, "")) {
                output.encodeStringElement(serialDesc, 7, self.adid);
            }
            if (!Intrinsics.areEqual(self.font_size, "")) {
                output.encodeStringElement(serialDesc, 8, self.font_size);
            }
            if (!Intrinsics.areEqual(self.sharer_id, "")) {
                output.encodeStringElement(serialDesc, 9, self.sharer_id);
            }
            if (!Intrinsics.areEqual(self.sharer_url, "")) {
                output.encodeStringElement(serialDesc, 10, self.sharer_url);
            }
            if (!Intrinsics.areEqual(self.source, "")) {
                output.encodeStringElement(serialDesc, 11, self.source);
            }
            if (!Intrinsics.areEqual(self.campaign, "")) {
                output.encodeStringElement(serialDesc, 12, self.campaign);
            }
            if (!Intrinsics.areEqual(self.campaign_version, "")) {
                output.encodeStringElement(serialDesc, 13, self.campaign_version);
            }
            if (!Intrinsics.areEqual(self.click_id, "")) {
                output.encodeStringElement(serialDesc, 14, self.click_id);
            }
            boolean z = self.reduced_motion;
            if (z) {
                output.encodeBooleanElement(serialDesc, 15, z);
            }
            boolean z2 = self.voice_over;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 16, z2);
            }
            int i = self.engagement_time;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 17, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (!Intrinsics.areEqual(self.referral_code, "")) {
                output.encodeStringElement(serialDesc, 18, self.referral_code);
            }
            if (!Intrinsics.areEqual(self.model, "")) {
                output.encodeStringElement(serialDesc, 19, self.model);
            }
            if (!Intrinsics.areEqual(self.version, "")) {
                output.encodeStringElement(serialDesc, 20, self.version);
            }
            if (!Intrinsics.areEqual(self.density_independent_resolution, "")) {
                output.encodeStringElement(serialDesc, 21, self.density_independent_resolution);
            }
            boolean z3 = self.webview;
            if (z3) {
                output.encodeBooleanElement(serialDesc, 22, z3);
            }
            if (!Intrinsics.areEqual(self.web_device_hash, "")) {
                output.encodeStringElement(serialDesc, 23, self.web_device_hash);
            }
            if (!Intrinsics.areEqual(self.token_hash, "")) {
                output.encodeStringElement(serialDesc, 24, self.token_hash);
            }
            if (!Intrinsics.areEqual(self.adjust_device_id, "")) {
                output.encodeStringElement(serialDesc, 25, self.adjust_device_id);
            }
            if (!Intrinsics.areEqual(self.firebase_app_instance_id, "")) {
                output.encodeStringElement(serialDesc, 26, self.firebase_app_instance_id);
            }
            if (self.theme_style != ThemeStyleDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 27, ThemeStyleDto.Serializer.INSTANCE, self.theme_style);
            }
            if (!Intrinsics.areEqual(self.singular_device_id, "")) {
                output.encodeStringElement(serialDesc, 28, self.singular_device_id);
            }
            if (!Intrinsics.areEqual(self.masked_device_id, "")) {
                output.encodeStringElement(serialDesc, 29, self.masked_device_id);
            }
            if (!Intrinsics.areEqual(self.masked_web_device_id, "")) {
                output.encodeStringElement(serialDesc, 30, self.masked_web_device_id);
            }
            if (!Intrinsics.areEqual(self.masked_adid, "")) {
                output.encodeStringElement(serialDesc, 31, self.masked_adid);
            }
            if (!Intrinsics.areEqual(self.masked_sharer_id, "")) {
                output.encodeStringElement(serialDesc, 32, self.masked_sharer_id);
            }
            if (!Intrinsics.areEqual(self.masked_os_version, "")) {
                output.encodeStringElement(serialDesc, 33, self.masked_os_version);
            }
            if (!Intrinsics.areEqual(self.masked_referral_code, "")) {
                output.encodeStringElement(serialDesc, 34, self.masked_referral_code);
            }
            if (!Intrinsics.areEqual(self.masked_web_device_hash, "")) {
                output.encodeStringElement(serialDesc, 35, self.masked_web_device_hash);
            }
            if (!Intrinsics.areEqual(self.masked_token_hash, "")) {
                output.encodeStringElement(serialDesc, 36, self.masked_token_hash);
            }
            if (!Intrinsics.areEqual(self.masked_adjust_device_id, "")) {
                output.encodeStringElement(serialDesc, 37, self.masked_adjust_device_id);
            }
            if (!Intrinsics.areEqual(self.masked_firebase_app_instance_id, "")) {
                output.encodeStringElement(serialDesc, 38, self.masked_firebase_app_instance_id);
            }
            if (Intrinsics.areEqual(self.masked_singular_device_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 39, self.masked_singular_device_id);
        }

        public Surrogate(String platform, String device_id, String web_device_id, String os_version, String manufacturer, String device_version, String screen_resolution, String adid, String font_size, String sharer_id, String sharer_url, String source, String campaign, String campaign_version, String click_id, boolean z, boolean z2, int i, String referral_code, String model, String version, String density_independent_resolution, boolean z3, String web_device_hash, String token_hash, String adjust_device_id, String firebase_app_instance_id, ThemeStyleDto theme_style, String singular_device_id, String masked_device_id, String masked_web_device_id, String masked_adid, String masked_sharer_id, String masked_os_version, String masked_referral_code, String masked_web_device_hash, String masked_token_hash, String masked_adjust_device_id, String masked_firebase_app_instance_id, String masked_singular_device_id) {
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

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, boolean z, boolean z2, int i, String str16, String str17, String str18, String str19, boolean z3, String str20, String str21, String str22, String str23, ThemeStyleDto themeStyleDto, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? "" : str8, (i2 & 256) != 0 ? "" : str9, (i2 & 512) != 0 ? "" : str10, (i2 & 1024) != 0 ? "" : str11, (i2 & 2048) != 0 ? "" : str12, (i2 & 4096) != 0 ? "" : str13, (i2 & 8192) != 0 ? "" : str14, (i2 & 16384) != 0 ? "" : str15, (i2 & 32768) != 0 ? false : z, (i2 & 65536) != 0 ? false : z2, (i2 & 131072) != 0 ? 0 : i, (i2 & 262144) != 0 ? "" : str16, (i2 & 524288) != 0 ? "" : str17, (i2 & 1048576) != 0 ? "" : str18, (i2 & 2097152) != 0 ? "" : str19, (i2 & 4194304) == 0 ? z3 : false, (i2 & 8388608) != 0 ? "" : str20, (i2 & 16777216) != 0 ? "" : str21, (i2 & 33554432) != 0 ? "" : str22, (i2 & 67108864) != 0 ? "" : str23, (i2 & 134217728) != 0 ? ThemeStyleDto.INSTANCE.getZeroValue() : themeStyleDto, (i2 & 268435456) != 0 ? "" : str24, (i2 & 536870912) != 0 ? "" : str25, (i2 & 1073741824) != 0 ? "" : str26, (i2 & Integer.MIN_VALUE) != 0 ? "" : str27, (i3 & 1) != 0 ? "" : str28, (i3 & 2) != 0 ? "" : str29, (i3 & 4) != 0 ? "" : str30, (i3 & 8) != 0 ? "" : str31, (i3 & 16) != 0 ? "" : str32, (i3 & 32) != 0 ? "" : str33, (i3 & 64) != 0 ? "" : str34, (i3 & 128) != 0 ? "" : str35);
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

        public final ThemeStyleDto getTheme_style() {
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
    }

    /* compiled from: DeviceDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DeviceDto;", "Lcom/robinhood/rosetta/eventlogging/Device;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DeviceDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<DeviceDto, Device> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DeviceDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DeviceDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DeviceDto> getBinaryBase64Serializer() {
            return (KSerializer) DeviceDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Device> getProtoAdapter() {
            return Device.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DeviceDto getZeroValue() {
            return DeviceDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DeviceDto fromProto(Device proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new DeviceDto(new Surrogate(proto.getPlatform(), proto.getDevice_id(), proto.getWeb_device_id(), proto.getOs_version(), proto.getManufacturer(), proto.getDevice_version(), proto.getScreen_resolution(), proto.getAdid(), proto.getFont_size(), proto.getSharer_id(), proto.getSharer_url(), proto.getSource(), proto.getCampaign(), proto.getCampaign_version(), proto.getClick_id(), proto.getReduced_motion(), proto.getVoice_over(), proto.getEngagement_time(), proto.getReferral_code(), proto.getModel(), proto.getVersion(), proto.getDensity_independent_resolution(), proto.getWebview(), proto.getWeb_device_hash(), proto.getToken_hash(), proto.getAdjust_device_id(), proto.getFirebase_app_instance_id(), ThemeStyleDto.INSTANCE.fromProto(proto.getTheme_style()), proto.getSingular_device_id(), proto.getMasked_device_id(), proto.getMasked_web_device_id(), proto.getMasked_adid(), proto.getMasked_sharer_id(), proto.getMasked_os_version(), proto.getMasked_referral_code(), proto.getMasked_web_device_hash(), proto.getMasked_token_hash(), proto.getMasked_adjust_device_id(), proto.getMasked_firebase_app_instance_id(), proto.getMasked_singular_device_id()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DeviceDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new DeviceDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DeviceDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceDto$ThemeStyleDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/Device$ThemeStyle;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "THEME_STYLE_UNSPECIFIED", "LIGHT", "DARK", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    /* loaded from: classes26.dex */
    public static final class ThemeStyleDto implements Dto2<Device.ThemeStyle>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ThemeStyleDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ThemeStyleDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ThemeStyleDto, Device.ThemeStyle>> binaryBase64Serializer$delegate;
        public static final ThemeStyleDto THEME_STYLE_UNSPECIFIED = new THEME_STYLE_UNSPECIFIED("THEME_STYLE_UNSPECIFIED", 0);
        public static final ThemeStyleDto LIGHT = new LIGHT("LIGHT", 1);
        public static final ThemeStyleDto DARK = new DARK("DARK", 2);

        private static final /* synthetic */ ThemeStyleDto[] $values() {
            return new ThemeStyleDto[]{THEME_STYLE_UNSPECIFIED, LIGHT, DARK};
        }

        public /* synthetic */ ThemeStyleDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<ThemeStyleDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: DeviceDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DeviceDto.ThemeStyleDto.THEME_STYLE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/DeviceDto$ThemeStyleDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Device$ThemeStyle;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class THEME_STYLE_UNSPECIFIED extends ThemeStyleDto {
            THEME_STYLE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Device.ThemeStyle toProto() {
                return Device.ThemeStyle.THEME_STYLE_UNSPECIFIED;
            }
        }

        private ThemeStyleDto(String str, int i) {
        }

        static {
            ThemeStyleDto[] themeStyleDtoArr$values = $values();
            $VALUES = themeStyleDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(themeStyleDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DeviceDto$ThemeStyleDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeviceDto.ThemeStyleDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: DeviceDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DeviceDto.ThemeStyleDto.LIGHT", "Lcom/robinhood/rosetta/eventlogging/DeviceDto$ThemeStyleDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Device$ThemeStyle;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LIGHT extends ThemeStyleDto {
            LIGHT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Device.ThemeStyle toProto() {
                return Device.ThemeStyle.LIGHT;
            }
        }

        /* compiled from: DeviceDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DeviceDto.ThemeStyleDto.DARK", "Lcom/robinhood/rosetta/eventlogging/DeviceDto$ThemeStyleDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Device$ThemeStyle;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DARK extends ThemeStyleDto {
            DARK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Device.ThemeStyle toProto() {
                return Device.ThemeStyle.DARK;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: DeviceDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceDto$ThemeStyleDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DeviceDto$ThemeStyleDto;", "Lcom/robinhood/rosetta/eventlogging/Device$ThemeStyle;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DeviceDto$ThemeStyleDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ThemeStyleDto, Device.ThemeStyle> {

            /* compiled from: DeviceDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Device.ThemeStyle.values().length];
                    try {
                        iArr[Device.ThemeStyle.THEME_STYLE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Device.ThemeStyle.LIGHT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Device.ThemeStyle.DARK.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ThemeStyleDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ThemeStyleDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ThemeStyleDto> getBinaryBase64Serializer() {
                return (KSerializer) ThemeStyleDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<Device.ThemeStyle> getProtoAdapter() {
                return Device.ThemeStyle.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ThemeStyleDto getZeroValue() {
                return ThemeStyleDto.THEME_STYLE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ThemeStyleDto fromProto(Device.ThemeStyle proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return ThemeStyleDto.THEME_STYLE_UNSPECIFIED;
                }
                if (i == 2) {
                    return ThemeStyleDto.LIGHT;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return ThemeStyleDto.DARK;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: DeviceDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceDto$ThemeStyleDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceDto$ThemeStyleDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<ThemeStyleDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ThemeStyleDto, Device.ThemeStyle> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.Device.ThemeStyle", ThemeStyleDto.getEntries(), ThemeStyleDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ThemeStyleDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ThemeStyleDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ThemeStyleDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ThemeStyleDto valueOf(String str) {
            return (ThemeStyleDto) Enum.valueOf(ThemeStyleDto.class, str);
        }

        public static ThemeStyleDto[] values() {
            return (ThemeStyleDto[]) $VALUES.clone();
        }
    }

    /* compiled from: DeviceDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/DeviceDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<DeviceDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.Device", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, DeviceDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public DeviceDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new DeviceDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: DeviceDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.DeviceDto";
        }
    }
}
