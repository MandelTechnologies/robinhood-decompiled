package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
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

/* compiled from: AdjustDataDto.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b0\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 F2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004EFGHB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bå\u0001\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t\u0012\b\b\u0002\u0010\u001b\u001a\u00020\t\u0012\b\b\u0002\u0010\u001c\u001a\u00020\t\u0012\b\b\u0002\u0010\u001d\u001a\u00020\t\u0012\b\b\u0002\u0010\u001e\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u001fJâ\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\tJ\b\u00107\u001a\u00020\u0002H\u0016J\b\u00108\u001a\u00020\tH\u0016J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0096\u0002J\b\u0010=\u001a\u00020>H\u0016J\u0018\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020>H\u0016J\b\u0010D\u001a\u00020>H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\"\u0010!R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b$\u0010!R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b%\u0010!R\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b&\u0010!R\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b'\u0010!R\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b(\u0010!R\u0011\u0010\u0011\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b)\u0010!R\u0011\u0010\u0012\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b*\u0010!R\u0011\u0010\u0013\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010!R\u0011\u0010\u0014\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b+\u0010!R\u0011\u0010\u0015\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b,\u0010!R\u0011\u0010\u0016\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b-\u0010!R\u0011\u0010\u0017\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b.\u0010!R\u0011\u0010\u0018\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b/\u0010!R\u0011\u0010\u0019\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b0\u0010!R\u0011\u0010\u001a\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b1\u0010!R\u0011\u0010\u001b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b2\u0010!R\u0011\u0010\u001c\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b3\u0010!R\u0011\u0010\u001d\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b4\u0010!R\u0011\u0010\u001e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b5\u0010!¨\u0006I"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AdjustDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/AdjustData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/AdjustDataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/AdjustDataDto$Surrogate;)V", "activity_kind", "", "network_name", "adid", "tracker", Constants.REFTAG, "nonce", "campaign_name", "adgroup_name", "creative_name", "click_referer", "is_organic", "reattribution_attribution_window", "impression_attribution_window", PlaceTypes.STORE, "match_type", "platform_adid", "search_term", "event_name", "installed_at", "engagement_time", "deeplink", "source_user", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActivity_kind", "()Ljava/lang/String;", "getNetwork_name", "getAdid", "getTracker", "getReftag", "getNonce", "getCampaign_name", "getAdgroup_name", "getCreative_name", "getClick_referer", "getReattribution_attribution_window", "getImpression_attribution_window", "getStore", "getMatch_type", "getPlatform_adid", "getSearch_term", "getEvent_name", "getInstalled_at", "getEngagement_time", "getDeeplink", "getSource_user", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class AdjustDataDto implements Dto3<AdjustData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AdjustDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AdjustDataDto, AdjustData>> binaryBase64Serializer$delegate;
    private static final AdjustDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AdjustDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AdjustDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getActivity_kind() {
        return this.surrogate.getActivity_kind();
    }

    public final String getNetwork_name() {
        return this.surrogate.getNetwork_name();
    }

    public final String getAdid() {
        return this.surrogate.getAdid();
    }

    public final String getTracker() {
        return this.surrogate.getTracker();
    }

    public final String getReftag() {
        return this.surrogate.getReftag();
    }

    public final String getNonce() {
        return this.surrogate.getNonce();
    }

    public final String getCampaign_name() {
        return this.surrogate.getCampaign_name();
    }

    public final String getAdgroup_name() {
        return this.surrogate.getAdgroup_name();
    }

    public final String getCreative_name() {
        return this.surrogate.getCreative_name();
    }

    public final String getClick_referer() {
        return this.surrogate.getClick_referer();
    }

    public final String is_organic() {
        return this.surrogate.is_organic();
    }

    public final String getReattribution_attribution_window() {
        return this.surrogate.getReattribution_attribution_window();
    }

    public final String getImpression_attribution_window() {
        return this.surrogate.getImpression_attribution_window();
    }

    public final String getStore() {
        return this.surrogate.getStore();
    }

    public final String getMatch_type() {
        return this.surrogate.getMatch_type();
    }

    public final String getPlatform_adid() {
        return this.surrogate.getPlatform_adid();
    }

    public final String getSearch_term() {
        return this.surrogate.getSearch_term();
    }

    public final String getEvent_name() {
        return this.surrogate.getEvent_name();
    }

    public final String getInstalled_at() {
        return this.surrogate.getInstalled_at();
    }

    public final String getEngagement_time() {
        return this.surrogate.getEngagement_time();
    }

    public final String getDeeplink() {
        return this.surrogate.getDeeplink();
    }

    public final String getSource_user() {
        return this.surrogate.getSource_user();
    }

    public /* synthetic */ AdjustDataDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19, (i & 524288) != 0 ? "" : str20, (i & 1048576) != 0 ? "" : str21, (i & 2097152) != 0 ? "" : str22);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdjustDataDto(String activity_kind, String network_name, String adid, String tracker, String reftag, String nonce, String campaign_name, String adgroup_name, String creative_name, String click_referer, String is_organic, String reattribution_attribution_window, String impression_attribution_window, String store, String match_type, String platform_adid, String search_term, String event_name, String installed_at, String engagement_time, String deeplink, String source_user) {
        this(new Surrogate(activity_kind, network_name, adid, tracker, reftag, nonce, campaign_name, adgroup_name, creative_name, click_referer, is_organic, reattribution_attribution_window, impression_attribution_window, store, match_type, platform_adid, search_term, event_name, installed_at, engagement_time, deeplink, source_user));
        Intrinsics.checkNotNullParameter(activity_kind, "activity_kind");
        Intrinsics.checkNotNullParameter(network_name, "network_name");
        Intrinsics.checkNotNullParameter(adid, "adid");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(reftag, "reftag");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(campaign_name, "campaign_name");
        Intrinsics.checkNotNullParameter(adgroup_name, "adgroup_name");
        Intrinsics.checkNotNullParameter(creative_name, "creative_name");
        Intrinsics.checkNotNullParameter(click_referer, "click_referer");
        Intrinsics.checkNotNullParameter(is_organic, "is_organic");
        Intrinsics.checkNotNullParameter(reattribution_attribution_window, "reattribution_attribution_window");
        Intrinsics.checkNotNullParameter(impression_attribution_window, "impression_attribution_window");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(match_type, "match_type");
        Intrinsics.checkNotNullParameter(platform_adid, "platform_adid");
        Intrinsics.checkNotNullParameter(search_term, "search_term");
        Intrinsics.checkNotNullParameter(event_name, "event_name");
        Intrinsics.checkNotNullParameter(installed_at, "installed_at");
        Intrinsics.checkNotNullParameter(engagement_time, "engagement_time");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(source_user, "source_user");
    }

    public static /* synthetic */ AdjustDataDto copy$default(AdjustDataDto adjustDataDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, int i, Object obj) {
        String source_user;
        String str23;
        String activity_kind = (i & 1) != 0 ? adjustDataDto.surrogate.getActivity_kind() : str;
        String network_name = (i & 2) != 0 ? adjustDataDto.surrogate.getNetwork_name() : str2;
        String adid = (i & 4) != 0 ? adjustDataDto.surrogate.getAdid() : str3;
        String tracker = (i & 8) != 0 ? adjustDataDto.surrogate.getTracker() : str4;
        String reftag = (i & 16) != 0 ? adjustDataDto.surrogate.getReftag() : str5;
        String nonce = (i & 32) != 0 ? adjustDataDto.surrogate.getNonce() : str6;
        String campaign_name = (i & 64) != 0 ? adjustDataDto.surrogate.getCampaign_name() : str7;
        String adgroup_name = (i & 128) != 0 ? adjustDataDto.surrogate.getAdgroup_name() : str8;
        String creative_name = (i & 256) != 0 ? adjustDataDto.surrogate.getCreative_name() : str9;
        String click_referer = (i & 512) != 0 ? adjustDataDto.surrogate.getClick_referer() : str10;
        String strIs_organic = (i & 1024) != 0 ? adjustDataDto.surrogate.is_organic() : str11;
        String reattribution_attribution_window = (i & 2048) != 0 ? adjustDataDto.surrogate.getReattribution_attribution_window() : str12;
        String impression_attribution_window = (i & 4096) != 0 ? adjustDataDto.surrogate.getImpression_attribution_window() : str13;
        String store = (i & 8192) != 0 ? adjustDataDto.surrogate.getStore() : str14;
        String str24 = activity_kind;
        String match_type = (i & 16384) != 0 ? adjustDataDto.surrogate.getMatch_type() : str15;
        String platform_adid = (i & 32768) != 0 ? adjustDataDto.surrogate.getPlatform_adid() : str16;
        String search_term = (i & 65536) != 0 ? adjustDataDto.surrogate.getSearch_term() : str17;
        String event_name = (i & 131072) != 0 ? adjustDataDto.surrogate.getEvent_name() : str18;
        String installed_at = (i & 262144) != 0 ? adjustDataDto.surrogate.getInstalled_at() : str19;
        String engagement_time = (i & 524288) != 0 ? adjustDataDto.surrogate.getEngagement_time() : str20;
        String deeplink = (i & 1048576) != 0 ? adjustDataDto.surrogate.getDeeplink() : str21;
        if ((i & 2097152) != 0) {
            str23 = deeplink;
            source_user = adjustDataDto.surrogate.getSource_user();
        } else {
            source_user = str22;
            str23 = deeplink;
        }
        return adjustDataDto.copy(str24, network_name, adid, tracker, reftag, nonce, campaign_name, adgroup_name, creative_name, click_referer, strIs_organic, reattribution_attribution_window, impression_attribution_window, store, match_type, platform_adid, search_term, event_name, installed_at, engagement_time, str23, source_user);
    }

    public final AdjustDataDto copy(String activity_kind, String network_name, String adid, String tracker, String reftag, String nonce, String campaign_name, String adgroup_name, String creative_name, String click_referer, String is_organic, String reattribution_attribution_window, String impression_attribution_window, String store, String match_type, String platform_adid, String search_term, String event_name, String installed_at, String engagement_time, String deeplink, String source_user) {
        Intrinsics.checkNotNullParameter(activity_kind, "activity_kind");
        Intrinsics.checkNotNullParameter(network_name, "network_name");
        Intrinsics.checkNotNullParameter(adid, "adid");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(reftag, "reftag");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(campaign_name, "campaign_name");
        Intrinsics.checkNotNullParameter(adgroup_name, "adgroup_name");
        Intrinsics.checkNotNullParameter(creative_name, "creative_name");
        Intrinsics.checkNotNullParameter(click_referer, "click_referer");
        Intrinsics.checkNotNullParameter(is_organic, "is_organic");
        Intrinsics.checkNotNullParameter(reattribution_attribution_window, "reattribution_attribution_window");
        Intrinsics.checkNotNullParameter(impression_attribution_window, "impression_attribution_window");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(match_type, "match_type");
        Intrinsics.checkNotNullParameter(platform_adid, "platform_adid");
        Intrinsics.checkNotNullParameter(search_term, "search_term");
        Intrinsics.checkNotNullParameter(event_name, "event_name");
        Intrinsics.checkNotNullParameter(installed_at, "installed_at");
        Intrinsics.checkNotNullParameter(engagement_time, "engagement_time");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(source_user, "source_user");
        return new AdjustDataDto(new Surrogate(activity_kind, network_name, adid, tracker, reftag, nonce, campaign_name, adgroup_name, creative_name, click_referer, is_organic, reattribution_attribution_window, impression_attribution_window, store, match_type, platform_adid, search_term, event_name, installed_at, engagement_time, deeplink, source_user));
    }

    @Override // com.robinhood.idl.Dto
    public AdjustData toProto() {
        return new AdjustData(this.surrogate.getActivity_kind(), this.surrogate.getNetwork_name(), this.surrogate.getAdid(), this.surrogate.getTracker(), this.surrogate.getReftag(), this.surrogate.getNonce(), this.surrogate.getCampaign_name(), this.surrogate.getAdgroup_name(), this.surrogate.getCreative_name(), this.surrogate.getClick_referer(), this.surrogate.is_organic(), this.surrogate.getReattribution_attribution_window(), this.surrogate.getImpression_attribution_window(), this.surrogate.getStore(), this.surrogate.getMatch_type(), this.surrogate.getPlatform_adid(), this.surrogate.getSearch_term(), this.surrogate.getEvent_name(), this.surrogate.getInstalled_at(), this.surrogate.getEngagement_time(), this.surrogate.getDeeplink(), this.surrogate.getSource_user(), null, 4194304, null);
    }

    public String toString() {
        return "[AdjustDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AdjustDataDto) && Intrinsics.areEqual(((AdjustDataDto) other).surrogate, this.surrogate);
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
    /* compiled from: AdjustDataDto.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\bF\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 r2\u00020\u0001:\u0002qrBã\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u001aB÷\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u0019\u0010\u001fJ\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\t\u0010b\u001a\u00020\u0003HÆ\u0003Jå\u0001\u0010c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0003HÆ\u0001J\u0013\u0010d\u001a\u00020e2\b\u0010f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010g\u001a\u00020\u001cHÖ\u0001J\t\u0010h\u001a\u00020\u0003HÖ\u0001J%\u0010i\u001a\u00020j2\u0006\u0010k\u001a\u00020\u00002\u0006\u0010l\u001a\u00020m2\u0006\u0010n\u001a\u00020oH\u0001¢\u0006\u0002\bpR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010!\u001a\u0004\b)\u0010#R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010!\u001a\u0004\b+\u0010#R\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010!\u001a\u0004\b-\u0010#R\u001c\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010!\u001a\u0004\b/\u0010#R\u001c\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010!\u001a\u0004\b1\u0010#R\u001c\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010!\u001a\u0004\b3\u0010#R\u001c\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010!\u001a\u0004\b5\u0010#R\u001c\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010!\u001a\u0004\b\r\u0010#R\u001c\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b7\u0010!\u001a\u0004\b8\u0010#R\u001c\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b9\u0010!\u001a\u0004\b:\u0010#R\u001c\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b;\u0010!\u001a\u0004\b<\u0010#R\u001c\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b=\u0010!\u001a\u0004\b>\u0010#R\u001c\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b?\u0010!\u001a\u0004\b@\u0010#R\u001c\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bA\u0010!\u001a\u0004\bB\u0010#R\u001c\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bC\u0010!\u001a\u0004\bD\u0010#R\u001c\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bE\u0010!\u001a\u0004\bF\u0010#R\u001c\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bG\u0010!\u001a\u0004\bH\u0010#R\u001c\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bI\u0010!\u001a\u0004\bJ\u0010#R\u001c\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bK\u0010!\u001a\u0004\bL\u0010#¨\u0006s"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AdjustDataDto$Surrogate;", "", "activity_kind", "", "network_name", "adid", "tracker", Constants.REFTAG, "nonce", "campaign_name", "adgroup_name", "creative_name", "click_referer", "is_organic", "reattribution_attribution_window", "impression_attribution_window", PlaceTypes.STORE, "match_type", "platform_adid", "search_term", "event_name", "installed_at", "engagement_time", "deeplink", "source_user", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getActivity_kind$annotations", "()V", "getActivity_kind", "()Ljava/lang/String;", "getNetwork_name$annotations", "getNetwork_name", "getAdid$annotations", "getAdid", "getTracker$annotations", "getTracker", "getReftag$annotations", "getReftag", "getNonce$annotations", "getNonce", "getCampaign_name$annotations", "getCampaign_name", "getAdgroup_name$annotations", "getAdgroup_name", "getCreative_name$annotations", "getCreative_name", "getClick_referer$annotations", "getClick_referer", "is_organic$annotations", "getReattribution_attribution_window$annotations", "getReattribution_attribution_window", "getImpression_attribution_window$annotations", "getImpression_attribution_window", "getStore$annotations", "getStore", "getMatch_type$annotations", "getMatch_type", "getPlatform_adid$annotations", "getPlatform_adid", "getSearch_term$annotations", "getSearch_term", "getEvent_name$annotations", "getEvent_name", "getInstalled_at$annotations", "getInstalled_at", "getEngagement_time$annotations", "getEngagement_time", "getDeeplink$annotations", "getDeeplink", "getSource_user$annotations", "getSource_user", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String activity_kind;
        private final String adgroup_name;
        private final String adid;
        private final String campaign_name;
        private final String click_referer;
        private final String creative_name;
        private final String deeplink;
        private final String engagement_time;
        private final String event_name;
        private final String impression_attribution_window;
        private final String installed_at;
        private final String is_organic;
        private final String match_type;
        private final String network_name;
        private final String nonce;
        private final String platform_adid;
        private final String reattribution_attribution_window;
        private final String reftag;
        private final String search_term;
        private final String source_user;
        private final String store;
        private final String tracker;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4194303, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, int i, Object obj) {
            String str23;
            String str24;
            String str25 = (i & 1) != 0 ? surrogate.activity_kind : str;
            String str26 = (i & 2) != 0 ? surrogate.network_name : str2;
            String str27 = (i & 4) != 0 ? surrogate.adid : str3;
            String str28 = (i & 8) != 0 ? surrogate.tracker : str4;
            String str29 = (i & 16) != 0 ? surrogate.reftag : str5;
            String str30 = (i & 32) != 0 ? surrogate.nonce : str6;
            String str31 = (i & 64) != 0 ? surrogate.campaign_name : str7;
            String str32 = (i & 128) != 0 ? surrogate.adgroup_name : str8;
            String str33 = (i & 256) != 0 ? surrogate.creative_name : str9;
            String str34 = (i & 512) != 0 ? surrogate.click_referer : str10;
            String str35 = (i & 1024) != 0 ? surrogate.is_organic : str11;
            String str36 = (i & 2048) != 0 ? surrogate.reattribution_attribution_window : str12;
            String str37 = (i & 4096) != 0 ? surrogate.impression_attribution_window : str13;
            String str38 = (i & 8192) != 0 ? surrogate.store : str14;
            String str39 = str25;
            String str40 = (i & 16384) != 0 ? surrogate.match_type : str15;
            String str41 = (i & 32768) != 0 ? surrogate.platform_adid : str16;
            String str42 = (i & 65536) != 0 ? surrogate.search_term : str17;
            String str43 = (i & 131072) != 0 ? surrogate.event_name : str18;
            String str44 = (i & 262144) != 0 ? surrogate.installed_at : str19;
            String str45 = (i & 524288) != 0 ? surrogate.engagement_time : str20;
            String str46 = (i & 1048576) != 0 ? surrogate.deeplink : str21;
            if ((i & 2097152) != 0) {
                str24 = str46;
                str23 = surrogate.source_user;
            } else {
                str23 = str22;
                str24 = str46;
            }
            return surrogate.copy(str39, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str40, str41, str42, str43, str44, str45, str24, str23);
        }

        @SerialName("activityKind")
        @JsonAnnotations2(names = {"activity_kind"})
        public static /* synthetic */ void getActivity_kind$annotations() {
        }

        @SerialName("adgroupName")
        @JsonAnnotations2(names = {"adgroup_name"})
        public static /* synthetic */ void getAdgroup_name$annotations() {
        }

        @SerialName("adid")
        @JsonAnnotations2(names = {"adid"})
        public static /* synthetic */ void getAdid$annotations() {
        }

        @SerialName("campaignName")
        @JsonAnnotations2(names = {"campaign_name"})
        public static /* synthetic */ void getCampaign_name$annotations() {
        }

        @SerialName("clickReferer")
        @JsonAnnotations2(names = {"click_referer"})
        public static /* synthetic */ void getClick_referer$annotations() {
        }

        @SerialName("creativeName")
        @JsonAnnotations2(names = {"creative_name"})
        public static /* synthetic */ void getCreative_name$annotations() {
        }

        @SerialName("deeplink")
        @JsonAnnotations2(names = {"deeplink"})
        public static /* synthetic */ void getDeeplink$annotations() {
        }

        @SerialName("engagementTime")
        @JsonAnnotations2(names = {"engagement_time"})
        public static /* synthetic */ void getEngagement_time$annotations() {
        }

        @SerialName("eventName")
        @JsonAnnotations2(names = {"event_name"})
        public static /* synthetic */ void getEvent_name$annotations() {
        }

        @SerialName("impressionAttributionWindow")
        @JsonAnnotations2(names = {"impression_attribution_window"})
        public static /* synthetic */ void getImpression_attribution_window$annotations() {
        }

        @SerialName("installedAt")
        @JsonAnnotations2(names = {"installed_at"})
        public static /* synthetic */ void getInstalled_at$annotations() {
        }

        @SerialName("matchType")
        @JsonAnnotations2(names = {"match_type"})
        public static /* synthetic */ void getMatch_type$annotations() {
        }

        @SerialName("networkName")
        @JsonAnnotations2(names = {"network_name"})
        public static /* synthetic */ void getNetwork_name$annotations() {
        }

        @SerialName("nonce")
        @JsonAnnotations2(names = {"nonce"})
        public static /* synthetic */ void getNonce$annotations() {
        }

        @SerialName("platformAdid")
        @JsonAnnotations2(names = {"platform_adid"})
        public static /* synthetic */ void getPlatform_adid$annotations() {
        }

        @SerialName("reattributionAttributionWindow")
        @JsonAnnotations2(names = {"reattribution_attribution_window"})
        public static /* synthetic */ void getReattribution_attribution_window$annotations() {
        }

        @SerialName(Constants.REFTAG)
        @JsonAnnotations2(names = {Constants.REFTAG})
        public static /* synthetic */ void getReftag$annotations() {
        }

        @SerialName("searchTerm")
        @JsonAnnotations2(names = {"search_term"})
        public static /* synthetic */ void getSearch_term$annotations() {
        }

        @SerialName("sourceUser")
        @JsonAnnotations2(names = {"source_user"})
        public static /* synthetic */ void getSource_user$annotations() {
        }

        @SerialName(PlaceTypes.STORE)
        @JsonAnnotations2(names = {PlaceTypes.STORE})
        public static /* synthetic */ void getStore$annotations() {
        }

        @SerialName("tracker")
        @JsonAnnotations2(names = {"tracker"})
        public static /* synthetic */ void getTracker$annotations() {
        }

        @SerialName("isOrganic")
        @JsonAnnotations2(names = {"is_organic"})
        public static /* synthetic */ void is_organic$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getActivity_kind() {
            return this.activity_kind;
        }

        /* renamed from: component10, reason: from getter */
        public final String getClick_referer() {
            return this.click_referer;
        }

        /* renamed from: component11, reason: from getter */
        public final String getIs_organic() {
            return this.is_organic;
        }

        /* renamed from: component12, reason: from getter */
        public final String getReattribution_attribution_window() {
            return this.reattribution_attribution_window;
        }

        /* renamed from: component13, reason: from getter */
        public final String getImpression_attribution_window() {
            return this.impression_attribution_window;
        }

        /* renamed from: component14, reason: from getter */
        public final String getStore() {
            return this.store;
        }

        /* renamed from: component15, reason: from getter */
        public final String getMatch_type() {
            return this.match_type;
        }

        /* renamed from: component16, reason: from getter */
        public final String getPlatform_adid() {
            return this.platform_adid;
        }

        /* renamed from: component17, reason: from getter */
        public final String getSearch_term() {
            return this.search_term;
        }

        /* renamed from: component18, reason: from getter */
        public final String getEvent_name() {
            return this.event_name;
        }

        /* renamed from: component19, reason: from getter */
        public final String getInstalled_at() {
            return this.installed_at;
        }

        /* renamed from: component2, reason: from getter */
        public final String getNetwork_name() {
            return this.network_name;
        }

        /* renamed from: component20, reason: from getter */
        public final String getEngagement_time() {
            return this.engagement_time;
        }

        /* renamed from: component21, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* renamed from: component22, reason: from getter */
        public final String getSource_user() {
            return this.source_user;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAdid() {
            return this.adid;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTracker() {
            return this.tracker;
        }

        /* renamed from: component5, reason: from getter */
        public final String getReftag() {
            return this.reftag;
        }

        /* renamed from: component6, reason: from getter */
        public final String getNonce() {
            return this.nonce;
        }

        /* renamed from: component7, reason: from getter */
        public final String getCampaign_name() {
            return this.campaign_name;
        }

        /* renamed from: component8, reason: from getter */
        public final String getAdgroup_name() {
            return this.adgroup_name;
        }

        /* renamed from: component9, reason: from getter */
        public final String getCreative_name() {
            return this.creative_name;
        }

        public final Surrogate copy(String activity_kind, String network_name, String adid, String tracker, String reftag, String nonce, String campaign_name, String adgroup_name, String creative_name, String click_referer, String is_organic, String reattribution_attribution_window, String impression_attribution_window, String store, String match_type, String platform_adid, String search_term, String event_name, String installed_at, String engagement_time, String deeplink, String source_user) {
            Intrinsics.checkNotNullParameter(activity_kind, "activity_kind");
            Intrinsics.checkNotNullParameter(network_name, "network_name");
            Intrinsics.checkNotNullParameter(adid, "adid");
            Intrinsics.checkNotNullParameter(tracker, "tracker");
            Intrinsics.checkNotNullParameter(reftag, "reftag");
            Intrinsics.checkNotNullParameter(nonce, "nonce");
            Intrinsics.checkNotNullParameter(campaign_name, "campaign_name");
            Intrinsics.checkNotNullParameter(adgroup_name, "adgroup_name");
            Intrinsics.checkNotNullParameter(creative_name, "creative_name");
            Intrinsics.checkNotNullParameter(click_referer, "click_referer");
            Intrinsics.checkNotNullParameter(is_organic, "is_organic");
            Intrinsics.checkNotNullParameter(reattribution_attribution_window, "reattribution_attribution_window");
            Intrinsics.checkNotNullParameter(impression_attribution_window, "impression_attribution_window");
            Intrinsics.checkNotNullParameter(store, "store");
            Intrinsics.checkNotNullParameter(match_type, "match_type");
            Intrinsics.checkNotNullParameter(platform_adid, "platform_adid");
            Intrinsics.checkNotNullParameter(search_term, "search_term");
            Intrinsics.checkNotNullParameter(event_name, "event_name");
            Intrinsics.checkNotNullParameter(installed_at, "installed_at");
            Intrinsics.checkNotNullParameter(engagement_time, "engagement_time");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(source_user, "source_user");
            return new Surrogate(activity_kind, network_name, adid, tracker, reftag, nonce, campaign_name, adgroup_name, creative_name, click_referer, is_organic, reattribution_attribution_window, impression_attribution_window, store, match_type, platform_adid, search_term, event_name, installed_at, engagement_time, deeplink, source_user);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.activity_kind, surrogate.activity_kind) && Intrinsics.areEqual(this.network_name, surrogate.network_name) && Intrinsics.areEqual(this.adid, surrogate.adid) && Intrinsics.areEqual(this.tracker, surrogate.tracker) && Intrinsics.areEqual(this.reftag, surrogate.reftag) && Intrinsics.areEqual(this.nonce, surrogate.nonce) && Intrinsics.areEqual(this.campaign_name, surrogate.campaign_name) && Intrinsics.areEqual(this.adgroup_name, surrogate.adgroup_name) && Intrinsics.areEqual(this.creative_name, surrogate.creative_name) && Intrinsics.areEqual(this.click_referer, surrogate.click_referer) && Intrinsics.areEqual(this.is_organic, surrogate.is_organic) && Intrinsics.areEqual(this.reattribution_attribution_window, surrogate.reattribution_attribution_window) && Intrinsics.areEqual(this.impression_attribution_window, surrogate.impression_attribution_window) && Intrinsics.areEqual(this.store, surrogate.store) && Intrinsics.areEqual(this.match_type, surrogate.match_type) && Intrinsics.areEqual(this.platform_adid, surrogate.platform_adid) && Intrinsics.areEqual(this.search_term, surrogate.search_term) && Intrinsics.areEqual(this.event_name, surrogate.event_name) && Intrinsics.areEqual(this.installed_at, surrogate.installed_at) && Intrinsics.areEqual(this.engagement_time, surrogate.engagement_time) && Intrinsics.areEqual(this.deeplink, surrogate.deeplink) && Intrinsics.areEqual(this.source_user, surrogate.source_user);
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((((((((this.activity_kind.hashCode() * 31) + this.network_name.hashCode()) * 31) + this.adid.hashCode()) * 31) + this.tracker.hashCode()) * 31) + this.reftag.hashCode()) * 31) + this.nonce.hashCode()) * 31) + this.campaign_name.hashCode()) * 31) + this.adgroup_name.hashCode()) * 31) + this.creative_name.hashCode()) * 31) + this.click_referer.hashCode()) * 31) + this.is_organic.hashCode()) * 31) + this.reattribution_attribution_window.hashCode()) * 31) + this.impression_attribution_window.hashCode()) * 31) + this.store.hashCode()) * 31) + this.match_type.hashCode()) * 31) + this.platform_adid.hashCode()) * 31) + this.search_term.hashCode()) * 31) + this.event_name.hashCode()) * 31) + this.installed_at.hashCode()) * 31) + this.engagement_time.hashCode()) * 31) + this.deeplink.hashCode()) * 31) + this.source_user.hashCode();
        }

        public String toString() {
            return "Surrogate(activity_kind=" + this.activity_kind + ", network_name=" + this.network_name + ", adid=" + this.adid + ", tracker=" + this.tracker + ", reftag=" + this.reftag + ", nonce=" + this.nonce + ", campaign_name=" + this.campaign_name + ", adgroup_name=" + this.adgroup_name + ", creative_name=" + this.creative_name + ", click_referer=" + this.click_referer + ", is_organic=" + this.is_organic + ", reattribution_attribution_window=" + this.reattribution_attribution_window + ", impression_attribution_window=" + this.impression_attribution_window + ", store=" + this.store + ", match_type=" + this.match_type + ", platform_adid=" + this.platform_adid + ", search_term=" + this.search_term + ", event_name=" + this.event_name + ", installed_at=" + this.installed_at + ", engagement_time=" + this.engagement_time + ", deeplink=" + this.deeplink + ", source_user=" + this.source_user + ")";
        }

        /* compiled from: AdjustDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AdjustDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/AdjustDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AdjustDataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.activity_kind = "";
            } else {
                this.activity_kind = str;
            }
            if ((i & 2) == 0) {
                this.network_name = "";
            } else {
                this.network_name = str2;
            }
            if ((i & 4) == 0) {
                this.adid = "";
            } else {
                this.adid = str3;
            }
            if ((i & 8) == 0) {
                this.tracker = "";
            } else {
                this.tracker = str4;
            }
            if ((i & 16) == 0) {
                this.reftag = "";
            } else {
                this.reftag = str5;
            }
            if ((i & 32) == 0) {
                this.nonce = "";
            } else {
                this.nonce = str6;
            }
            if ((i & 64) == 0) {
                this.campaign_name = "";
            } else {
                this.campaign_name = str7;
            }
            if ((i & 128) == 0) {
                this.adgroup_name = "";
            } else {
                this.adgroup_name = str8;
            }
            if ((i & 256) == 0) {
                this.creative_name = "";
            } else {
                this.creative_name = str9;
            }
            if ((i & 512) == 0) {
                this.click_referer = "";
            } else {
                this.click_referer = str10;
            }
            if ((i & 1024) == 0) {
                this.is_organic = "";
            } else {
                this.is_organic = str11;
            }
            if ((i & 2048) == 0) {
                this.reattribution_attribution_window = "";
            } else {
                this.reattribution_attribution_window = str12;
            }
            if ((i & 4096) == 0) {
                this.impression_attribution_window = "";
            } else {
                this.impression_attribution_window = str13;
            }
            if ((i & 8192) == 0) {
                this.store = "";
            } else {
                this.store = str14;
            }
            if ((i & 16384) == 0) {
                this.match_type = "";
            } else {
                this.match_type = str15;
            }
            if ((32768 & i) == 0) {
                this.platform_adid = "";
            } else {
                this.platform_adid = str16;
            }
            if ((65536 & i) == 0) {
                this.search_term = "";
            } else {
                this.search_term = str17;
            }
            if ((131072 & i) == 0) {
                this.event_name = "";
            } else {
                this.event_name = str18;
            }
            if ((262144 & i) == 0) {
                this.installed_at = "";
            } else {
                this.installed_at = str19;
            }
            if ((524288 & i) == 0) {
                this.engagement_time = "";
            } else {
                this.engagement_time = str20;
            }
            if ((1048576 & i) == 0) {
                this.deeplink = "";
            } else {
                this.deeplink = str21;
            }
            if ((i & 2097152) == 0) {
                this.source_user = "";
            } else {
                this.source_user = str22;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.activity_kind, "")) {
                output.encodeStringElement(serialDesc, 0, self.activity_kind);
            }
            if (!Intrinsics.areEqual(self.network_name, "")) {
                output.encodeStringElement(serialDesc, 1, self.network_name);
            }
            if (!Intrinsics.areEqual(self.adid, "")) {
                output.encodeStringElement(serialDesc, 2, self.adid);
            }
            if (!Intrinsics.areEqual(self.tracker, "")) {
                output.encodeStringElement(serialDesc, 3, self.tracker);
            }
            if (!Intrinsics.areEqual(self.reftag, "")) {
                output.encodeStringElement(serialDesc, 4, self.reftag);
            }
            if (!Intrinsics.areEqual(self.nonce, "")) {
                output.encodeStringElement(serialDesc, 5, self.nonce);
            }
            if (!Intrinsics.areEqual(self.campaign_name, "")) {
                output.encodeStringElement(serialDesc, 6, self.campaign_name);
            }
            if (!Intrinsics.areEqual(self.adgroup_name, "")) {
                output.encodeStringElement(serialDesc, 7, self.adgroup_name);
            }
            if (!Intrinsics.areEqual(self.creative_name, "")) {
                output.encodeStringElement(serialDesc, 8, self.creative_name);
            }
            if (!Intrinsics.areEqual(self.click_referer, "")) {
                output.encodeStringElement(serialDesc, 9, self.click_referer);
            }
            if (!Intrinsics.areEqual(self.is_organic, "")) {
                output.encodeStringElement(serialDesc, 10, self.is_organic);
            }
            if (!Intrinsics.areEqual(self.reattribution_attribution_window, "")) {
                output.encodeStringElement(serialDesc, 11, self.reattribution_attribution_window);
            }
            if (!Intrinsics.areEqual(self.impression_attribution_window, "")) {
                output.encodeStringElement(serialDesc, 12, self.impression_attribution_window);
            }
            if (!Intrinsics.areEqual(self.store, "")) {
                output.encodeStringElement(serialDesc, 13, self.store);
            }
            if (!Intrinsics.areEqual(self.match_type, "")) {
                output.encodeStringElement(serialDesc, 14, self.match_type);
            }
            if (!Intrinsics.areEqual(self.platform_adid, "")) {
                output.encodeStringElement(serialDesc, 15, self.platform_adid);
            }
            if (!Intrinsics.areEqual(self.search_term, "")) {
                output.encodeStringElement(serialDesc, 16, self.search_term);
            }
            if (!Intrinsics.areEqual(self.event_name, "")) {
                output.encodeStringElement(serialDesc, 17, self.event_name);
            }
            if (!Intrinsics.areEqual(self.installed_at, "")) {
                output.encodeStringElement(serialDesc, 18, self.installed_at);
            }
            if (!Intrinsics.areEqual(self.engagement_time, "")) {
                output.encodeStringElement(serialDesc, 19, self.engagement_time);
            }
            if (!Intrinsics.areEqual(self.deeplink, "")) {
                output.encodeStringElement(serialDesc, 20, self.deeplink);
            }
            if (Intrinsics.areEqual(self.source_user, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 21, self.source_user);
        }

        public Surrogate(String activity_kind, String network_name, String adid, String tracker, String reftag, String nonce, String campaign_name, String adgroup_name, String creative_name, String click_referer, String is_organic, String reattribution_attribution_window, String impression_attribution_window, String store, String match_type, String platform_adid, String search_term, String event_name, String installed_at, String engagement_time, String deeplink, String source_user) {
            Intrinsics.checkNotNullParameter(activity_kind, "activity_kind");
            Intrinsics.checkNotNullParameter(network_name, "network_name");
            Intrinsics.checkNotNullParameter(adid, "adid");
            Intrinsics.checkNotNullParameter(tracker, "tracker");
            Intrinsics.checkNotNullParameter(reftag, "reftag");
            Intrinsics.checkNotNullParameter(nonce, "nonce");
            Intrinsics.checkNotNullParameter(campaign_name, "campaign_name");
            Intrinsics.checkNotNullParameter(adgroup_name, "adgroup_name");
            Intrinsics.checkNotNullParameter(creative_name, "creative_name");
            Intrinsics.checkNotNullParameter(click_referer, "click_referer");
            Intrinsics.checkNotNullParameter(is_organic, "is_organic");
            Intrinsics.checkNotNullParameter(reattribution_attribution_window, "reattribution_attribution_window");
            Intrinsics.checkNotNullParameter(impression_attribution_window, "impression_attribution_window");
            Intrinsics.checkNotNullParameter(store, "store");
            Intrinsics.checkNotNullParameter(match_type, "match_type");
            Intrinsics.checkNotNullParameter(platform_adid, "platform_adid");
            Intrinsics.checkNotNullParameter(search_term, "search_term");
            Intrinsics.checkNotNullParameter(event_name, "event_name");
            Intrinsics.checkNotNullParameter(installed_at, "installed_at");
            Intrinsics.checkNotNullParameter(engagement_time, "engagement_time");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(source_user, "source_user");
            this.activity_kind = activity_kind;
            this.network_name = network_name;
            this.adid = adid;
            this.tracker = tracker;
            this.reftag = reftag;
            this.nonce = nonce;
            this.campaign_name = campaign_name;
            this.adgroup_name = adgroup_name;
            this.creative_name = creative_name;
            this.click_referer = click_referer;
            this.is_organic = is_organic;
            this.reattribution_attribution_window = reattribution_attribution_window;
            this.impression_attribution_window = impression_attribution_window;
            this.store = store;
            this.match_type = match_type;
            this.platform_adid = platform_adid;
            this.search_term = search_term;
            this.event_name = event_name;
            this.installed_at = installed_at;
            this.engagement_time = engagement_time;
            this.deeplink = deeplink;
            this.source_user = source_user;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19, (i & 524288) != 0 ? "" : str20, (i & 1048576) != 0 ? "" : str21, (i & 2097152) != 0 ? "" : str22);
        }

        public final String getActivity_kind() {
            return this.activity_kind;
        }

        public final String getNetwork_name() {
            return this.network_name;
        }

        public final String getAdid() {
            return this.adid;
        }

        public final String getTracker() {
            return this.tracker;
        }

        public final String getReftag() {
            return this.reftag;
        }

        public final String getNonce() {
            return this.nonce;
        }

        public final String getCampaign_name() {
            return this.campaign_name;
        }

        public final String getAdgroup_name() {
            return this.adgroup_name;
        }

        public final String getCreative_name() {
            return this.creative_name;
        }

        public final String getClick_referer() {
            return this.click_referer;
        }

        public final String is_organic() {
            return this.is_organic;
        }

        public final String getReattribution_attribution_window() {
            return this.reattribution_attribution_window;
        }

        public final String getImpression_attribution_window() {
            return this.impression_attribution_window;
        }

        public final String getStore() {
            return this.store;
        }

        public final String getMatch_type() {
            return this.match_type;
        }

        public final String getPlatform_adid() {
            return this.platform_adid;
        }

        public final String getSearch_term() {
            return this.search_term;
        }

        public final String getEvent_name() {
            return this.event_name;
        }

        public final String getInstalled_at() {
            return this.installed_at;
        }

        public final String getEngagement_time() {
            return this.engagement_time;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final String getSource_user() {
            return this.source_user;
        }
    }

    /* compiled from: AdjustDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AdjustDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/AdjustDataDto;", "Lcom/robinhood/rosetta/eventlogging/AdjustData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/AdjustDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<AdjustDataDto, AdjustData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AdjustDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AdjustDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AdjustDataDto> getBinaryBase64Serializer() {
            return (KSerializer) AdjustDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AdjustData> getProtoAdapter() {
            return AdjustData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AdjustDataDto getZeroValue() {
            return AdjustDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AdjustDataDto fromProto(AdjustData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new AdjustDataDto(new Surrogate(proto.getActivity_kind(), proto.getNetwork_name(), proto.getAdid(), proto.getTracker(), proto.getReftag(), proto.getNonce(), proto.getCampaign_name(), proto.getAdgroup_name(), proto.getCreative_name(), proto.getClick_referer(), proto.getIs_organic(), proto.getReattribution_attribution_window(), proto.getImpression_attribution_window(), proto.getStore(), proto.getMatch_type(), proto.getPlatform_adid(), proto.getSearch_term(), proto.getEvent_name(), proto.getInstalled_at(), proto.getEngagement_time(), proto.getDeeplink(), proto.getSource_user()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.AdjustDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdjustDataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new AdjustDataDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AdjustDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AdjustDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/AdjustDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/AdjustDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<AdjustDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.AdjustData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AdjustDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AdjustDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AdjustDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AdjustDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AdjustDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.AdjustDataDto";
        }
    }
}
