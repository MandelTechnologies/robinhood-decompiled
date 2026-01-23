package com.robinhood.rosetta.eventlogging;

import com.adjust.sdk.Constants;
import com.google.android.libraries.places.api.model.PlaceTypes;
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

/* compiled from: AdjustData.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 =2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001=Bí\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u00104\u001a\u00020\u0002H\u0017J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u0096\u0002J\b\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u00020\u0004H\u0016Jì\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u001bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001fR\u0016\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0016\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0016\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0016\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0016\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0016\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0016\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0016\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001fR\u0016\u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u0016\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001fR\u0016\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001f¨\u0006>"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AdjustData;", "Lcom/squareup/wire/Message;", "", "activity_kind", "", "network_name", "adid", "tracker", Constants.REFTAG, "nonce", "campaign_name", "adgroup_name", "creative_name", "click_referer", "is_organic", "reattribution_attribution_window", "impression_attribution_window", PlaceTypes.STORE, "match_type", "platform_adid", "search_term", "event_name", "installed_at", "engagement_time", "deeplink", "source_user", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getActivity_kind", "()Ljava/lang/String;", "getNetwork_name", "getAdid", "getTracker", "getReftag", "getNonce", "getCampaign_name", "getAdgroup_name", "getCreative_name", "getClick_referer", "getReattribution_attribution_window", "getImpression_attribution_window", "getStore", "getMatch_type", "getPlatform_adid", "getSearch_term", "getEvent_name", "getInstalled_at", "getEngagement_time", "getDeeplink", "getSource_user", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class AdjustData extends Message {

    @JvmField
    public static final ProtoAdapter<AdjustData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "activityKind", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String activity_kind;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "adgroupName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String adgroup_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String adid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "campaignName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String campaign_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "clickReferer", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String click_referer;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "creativeName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String creative_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 21)
    private final String deeplink;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "engagementTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 20)
    private final String engagement_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "eventName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 18)
    private final String event_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "impressionAttributionWindow", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final String impression_attribution_window;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "installedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 19)
    private final String installed_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "isOrganic", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String is_organic;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "matchType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final String match_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "networkName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String network_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String nonce;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "platformAdid", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final String platform_adid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "reattributionAttributionWindow", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final String reattribution_attribution_window;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String reftag;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "searchTerm", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final String search_term;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sourceUser", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 21, tag = 22)
    private final String source_user;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final String store;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String tracker;

    public AdjustData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388607, null);
    }

    public /* synthetic */ AdjustData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19, (i & 524288) != 0 ? "" : str20, (i & 1048576) != 0 ? "" : str21, (i & 2097152) == 0 ? str22 : "", (i & 4194304) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23996newBuilder();
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

    /* renamed from: is_organic, reason: from getter */
    public final String getIs_organic() {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdjustData(String activity_kind, String network_name, String adid, String tracker, String reftag, String nonce, String campaign_name, String adgroup_name, String creative_name, String click_referer, String is_organic, String reattribution_attribution_window, String impression_attribution_window, String store, String match_type, String platform_adid, String search_term, String event_name, String installed_at, String engagement_time, String deeplink, String source_user, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
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
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
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

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23996newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AdjustData)) {
            return false;
        }
        AdjustData adjustData = (AdjustData) other;
        return Intrinsics.areEqual(unknownFields(), adjustData.unknownFields()) && Intrinsics.areEqual(this.activity_kind, adjustData.activity_kind) && Intrinsics.areEqual(this.network_name, adjustData.network_name) && Intrinsics.areEqual(this.adid, adjustData.adid) && Intrinsics.areEqual(this.tracker, adjustData.tracker) && Intrinsics.areEqual(this.reftag, adjustData.reftag) && Intrinsics.areEqual(this.nonce, adjustData.nonce) && Intrinsics.areEqual(this.campaign_name, adjustData.campaign_name) && Intrinsics.areEqual(this.adgroup_name, adjustData.adgroup_name) && Intrinsics.areEqual(this.creative_name, adjustData.creative_name) && Intrinsics.areEqual(this.click_referer, adjustData.click_referer) && Intrinsics.areEqual(this.is_organic, adjustData.is_organic) && Intrinsics.areEqual(this.reattribution_attribution_window, adjustData.reattribution_attribution_window) && Intrinsics.areEqual(this.impression_attribution_window, adjustData.impression_attribution_window) && Intrinsics.areEqual(this.store, adjustData.store) && Intrinsics.areEqual(this.match_type, adjustData.match_type) && Intrinsics.areEqual(this.platform_adid, adjustData.platform_adid) && Intrinsics.areEqual(this.search_term, adjustData.search_term) && Intrinsics.areEqual(this.event_name, adjustData.event_name) && Intrinsics.areEqual(this.installed_at, adjustData.installed_at) && Intrinsics.areEqual(this.engagement_time, adjustData.engagement_time) && Intrinsics.areEqual(this.deeplink, adjustData.deeplink) && Intrinsics.areEqual(this.source_user, adjustData.source_user);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((((((((((((((((((((((((((((unknownFields().hashCode() * 37) + this.activity_kind.hashCode()) * 37) + this.network_name.hashCode()) * 37) + this.adid.hashCode()) * 37) + this.tracker.hashCode()) * 37) + this.reftag.hashCode()) * 37) + this.nonce.hashCode()) * 37) + this.campaign_name.hashCode()) * 37) + this.adgroup_name.hashCode()) * 37) + this.creative_name.hashCode()) * 37) + this.click_referer.hashCode()) * 37) + this.is_organic.hashCode()) * 37) + this.reattribution_attribution_window.hashCode()) * 37) + this.impression_attribution_window.hashCode()) * 37) + this.store.hashCode()) * 37) + this.match_type.hashCode()) * 37) + this.platform_adid.hashCode()) * 37) + this.search_term.hashCode()) * 37) + this.event_name.hashCode()) * 37) + this.installed_at.hashCode()) * 37) + this.engagement_time.hashCode()) * 37) + this.deeplink.hashCode()) * 37) + this.source_user.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("activity_kind=" + Internal.sanitize(this.activity_kind));
        arrayList.add("network_name=" + Internal.sanitize(this.network_name));
        arrayList.add("adid=" + Internal.sanitize(this.adid));
        arrayList.add("tracker=" + Internal.sanitize(this.tracker));
        arrayList.add("reftag=" + Internal.sanitize(this.reftag));
        arrayList.add("nonce=" + Internal.sanitize(this.nonce));
        arrayList.add("campaign_name=" + Internal.sanitize(this.campaign_name));
        arrayList.add("adgroup_name=" + Internal.sanitize(this.adgroup_name));
        arrayList.add("creative_name=" + Internal.sanitize(this.creative_name));
        arrayList.add("click_referer=" + Internal.sanitize(this.click_referer));
        arrayList.add("is_organic=" + Internal.sanitize(this.is_organic));
        arrayList.add("reattribution_attribution_window=" + Internal.sanitize(this.reattribution_attribution_window));
        arrayList.add("impression_attribution_window=" + Internal.sanitize(this.impression_attribution_window));
        arrayList.add("store=" + Internal.sanitize(this.store));
        arrayList.add("match_type=" + Internal.sanitize(this.match_type));
        arrayList.add("platform_adid=" + Internal.sanitize(this.platform_adid));
        arrayList.add("search_term=" + Internal.sanitize(this.search_term));
        arrayList.add("event_name=" + Internal.sanitize(this.event_name));
        arrayList.add("installed_at=" + Internal.sanitize(this.installed_at));
        arrayList.add("engagement_time=" + Internal.sanitize(this.engagement_time));
        arrayList.add("deeplink=" + Internal.sanitize(this.deeplink));
        arrayList.add("source_user=" + Internal.sanitize(this.source_user));
        return CollectionsKt.joinToString$default(arrayList, ", ", "AdjustData{", "}", 0, null, null, 56, null);
    }

    public final AdjustData copy(String activity_kind, String network_name, String adid, String tracker, String reftag, String nonce, String campaign_name, String adgroup_name, String creative_name, String click_referer, String is_organic, String reattribution_attribution_window, String impression_attribution_window, String store, String match_type, String platform_adid, String search_term, String event_name, String installed_at, String engagement_time, String deeplink, String source_user, ByteString unknownFields) {
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
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AdjustData(activity_kind, network_name, adid, tracker, reftag, nonce, campaign_name, adgroup_name, creative_name, click_referer, is_organic, reattribution_attribution_window, impression_attribution_window, store, match_type, platform_adid, search_term, event_name, installed_at, engagement_time, deeplink, source_user, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AdjustData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AdjustData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.AdjustData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AdjustData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getActivity_kind(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getActivity_kind());
                }
                if (!Intrinsics.areEqual(value.getNetwork_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getNetwork_name());
                }
                if (!Intrinsics.areEqual(value.getAdid(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getAdid());
                }
                if (!Intrinsics.areEqual(value.getTracker(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getTracker());
                }
                if (!Intrinsics.areEqual(value.getReftag(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getReftag());
                }
                if (!Intrinsics.areEqual(value.getNonce(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getNonce());
                }
                if (!Intrinsics.areEqual(value.getCampaign_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getCampaign_name());
                }
                if (!Intrinsics.areEqual(value.getAdgroup_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getAdgroup_name());
                }
                if (!Intrinsics.areEqual(value.getCreative_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getCreative_name());
                }
                if (!Intrinsics.areEqual(value.getClick_referer(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getClick_referer());
                }
                if (!Intrinsics.areEqual(value.getIs_organic(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getIs_organic());
                }
                if (!Intrinsics.areEqual(value.getReattribution_attribution_window(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(12, value.getReattribution_attribution_window());
                }
                if (!Intrinsics.areEqual(value.getImpression_attribution_window(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(13, value.getImpression_attribution_window());
                }
                if (!Intrinsics.areEqual(value.getStore(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(14, value.getStore());
                }
                if (!Intrinsics.areEqual(value.getMatch_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(15, value.getMatch_type());
                }
                if (!Intrinsics.areEqual(value.getPlatform_adid(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(16, value.getPlatform_adid());
                }
                if (!Intrinsics.areEqual(value.getSearch_term(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(17, value.getSearch_term());
                }
                if (!Intrinsics.areEqual(value.getEvent_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(18, value.getEvent_name());
                }
                if (!Intrinsics.areEqual(value.getInstalled_at(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(19, value.getInstalled_at());
                }
                if (!Intrinsics.areEqual(value.getEngagement_time(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(20, value.getEngagement_time());
                }
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(21, value.getDeeplink());
                }
                return !Intrinsics.areEqual(value.getSource_user(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(22, value.getSource_user()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AdjustData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getActivity_kind(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getActivity_kind());
                }
                if (!Intrinsics.areEqual(value.getNetwork_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getNetwork_name());
                }
                if (!Intrinsics.areEqual(value.getAdid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAdid());
                }
                if (!Intrinsics.areEqual(value.getTracker(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getTracker());
                }
                if (!Intrinsics.areEqual(value.getReftag(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getReftag());
                }
                if (!Intrinsics.areEqual(value.getNonce(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getNonce());
                }
                if (!Intrinsics.areEqual(value.getCampaign_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getCampaign_name());
                }
                if (!Intrinsics.areEqual(value.getAdgroup_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getAdgroup_name());
                }
                if (!Intrinsics.areEqual(value.getCreative_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getCreative_name());
                }
                if (!Intrinsics.areEqual(value.getClick_referer(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getClick_referer());
                }
                if (!Intrinsics.areEqual(value.getIs_organic(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getIs_organic());
                }
                if (!Intrinsics.areEqual(value.getReattribution_attribution_window(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getReattribution_attribution_window());
                }
                if (!Intrinsics.areEqual(value.getImpression_attribution_window(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getImpression_attribution_window());
                }
                if (!Intrinsics.areEqual(value.getStore(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getStore());
                }
                if (!Intrinsics.areEqual(value.getMatch_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getMatch_type());
                }
                if (!Intrinsics.areEqual(value.getPlatform_adid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 16, (int) value.getPlatform_adid());
                }
                if (!Intrinsics.areEqual(value.getSearch_term(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 17, (int) value.getSearch_term());
                }
                if (!Intrinsics.areEqual(value.getEvent_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 18, (int) value.getEvent_name());
                }
                if (!Intrinsics.areEqual(value.getInstalled_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 19, (int) value.getInstalled_at());
                }
                if (!Intrinsics.areEqual(value.getEngagement_time(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 20, (int) value.getEngagement_time());
                }
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 21, (int) value.getDeeplink());
                }
                if (!Intrinsics.areEqual(value.getSource_user(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 22, (int) value.getSource_user());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AdjustData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getSource_user(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 22, (int) value.getSource_user());
                }
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 21, (int) value.getDeeplink());
                }
                if (!Intrinsics.areEqual(value.getEngagement_time(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 20, (int) value.getEngagement_time());
                }
                if (!Intrinsics.areEqual(value.getInstalled_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 19, (int) value.getInstalled_at());
                }
                if (!Intrinsics.areEqual(value.getEvent_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 18, (int) value.getEvent_name());
                }
                if (!Intrinsics.areEqual(value.getSearch_term(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 17, (int) value.getSearch_term());
                }
                if (!Intrinsics.areEqual(value.getPlatform_adid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 16, (int) value.getPlatform_adid());
                }
                if (!Intrinsics.areEqual(value.getMatch_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getMatch_type());
                }
                if (!Intrinsics.areEqual(value.getStore(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getStore());
                }
                if (!Intrinsics.areEqual(value.getImpression_attribution_window(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getImpression_attribution_window());
                }
                if (!Intrinsics.areEqual(value.getReattribution_attribution_window(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getReattribution_attribution_window());
                }
                if (!Intrinsics.areEqual(value.getIs_organic(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getIs_organic());
                }
                if (!Intrinsics.areEqual(value.getClick_referer(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getClick_referer());
                }
                if (!Intrinsics.areEqual(value.getCreative_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getCreative_name());
                }
                if (!Intrinsics.areEqual(value.getAdgroup_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getAdgroup_name());
                }
                if (!Intrinsics.areEqual(value.getCampaign_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getCampaign_name());
                }
                if (!Intrinsics.areEqual(value.getNonce(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getNonce());
                }
                if (!Intrinsics.areEqual(value.getReftag(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getReftag());
                }
                if (!Intrinsics.areEqual(value.getTracker(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getTracker());
                }
                if (!Intrinsics.areEqual(value.getAdid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAdid());
                }
                if (!Intrinsics.areEqual(value.getNetwork_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getNetwork_name());
                }
                if (Intrinsics.areEqual(value.getActivity_kind(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getActivity_kind());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AdjustData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
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
                while (true) {
                    int iNextTag = reader.nextTag();
                    String str = strDecode;
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode22 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 11:
                                strDecode10 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 12:
                                strDecode11 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 13:
                                strDecode12 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 14:
                                strDecode13 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 15:
                                strDecode14 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 16:
                                strDecode15 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 17:
                                strDecode16 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 18:
                                strDecode17 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 19:
                                strDecode18 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 20:
                                strDecode19 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 21:
                                strDecode20 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 22:
                                strDecode21 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                        strDecode = str;
                    } else {
                        return new AdjustData(strDecode22, str, strDecode2, strDecode3, strDecode4, strDecode5, strDecode6, strDecode7, strDecode8, strDecode9, strDecode10, strDecode11, strDecode12, strDecode13, strDecode14, strDecode15, strDecode16, strDecode17, strDecode18, strDecode19, strDecode20, strDecode21, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AdjustData redact(AdjustData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.copy((4194303 & 1) != 0 ? value.activity_kind : null, (4194303 & 2) != 0 ? value.network_name : null, (4194303 & 4) != 0 ? value.adid : null, (4194303 & 8) != 0 ? value.tracker : null, (4194303 & 16) != 0 ? value.reftag : null, (4194303 & 32) != 0 ? value.nonce : null, (4194303 & 64) != 0 ? value.campaign_name : null, (4194303 & 128) != 0 ? value.adgroup_name : null, (4194303 & 256) != 0 ? value.creative_name : null, (4194303 & 512) != 0 ? value.click_referer : null, (4194303 & 1024) != 0 ? value.is_organic : null, (4194303 & 2048) != 0 ? value.reattribution_attribution_window : null, (4194303 & 4096) != 0 ? value.impression_attribution_window : null, (4194303 & 8192) != 0 ? value.store : null, (4194303 & 16384) != 0 ? value.match_type : null, (4194303 & 32768) != 0 ? value.platform_adid : null, (4194303 & 65536) != 0 ? value.search_term : null, (4194303 & 131072) != 0 ? value.event_name : null, (4194303 & 262144) != 0 ? value.installed_at : null, (4194303 & 524288) != 0 ? value.engagement_time : null, (4194303 & 1048576) != 0 ? value.deeplink : null, (4194303 & 2097152) != 0 ? value.source_user : null, (4194303 & 4194304) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
