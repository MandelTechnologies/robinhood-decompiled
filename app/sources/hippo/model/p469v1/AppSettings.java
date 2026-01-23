package hippo.model.p469v1;

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
import p479j$.time.Instant;

/* compiled from: AppSettings.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b$\u0018\u0000 E2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001EB\u008b\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0016H\u0016¢\u0006\u0004\b%\u0010&J\u0091\u0001\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b'\u0010(R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u00104R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b6\u00107R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\b\u000e\u00109R\"\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010=\u001a\u0004\b>\u0010?R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010\u0017\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010C\u001a\u0004\bD\u0010&¨\u0006F"}, m3636d2 = {"Lhippo/model/v1/AppSettings;", "Lcom/squareup/wire/Message;", "", "Lhippo/model/v1/EquityOrderFormSettings;", "last_equity_order_form_fields", "Lhippo/model/v1/OptionOrderFormSettings;", "last_option_order_form_fields", "Lhippo/model/v1/BackgroundAura;", "background_aura", "Lhippo/model/v1/ReleaseSettings;", "release_settings", "Lhippo/model/v1/CryptoOrderFormSettings;", "last_crypto_order_form_fields", "", "is_auto_send_disclosure_signed", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "last_accessed_at", "Lhippo/model/v1/OrderFormSettings;", "order_form_settings", "Lhippo/model/v1/GeneralSettings;", "general_settings", "", "last_selected_account", "Lokio/ByteString;", "unknownFields", "<init>", "(Lhippo/model/v1/EquityOrderFormSettings;Lhippo/model/v1/OptionOrderFormSettings;Lhippo/model/v1/BackgroundAura;Lhippo/model/v1/ReleaseSettings;Lhippo/model/v1/CryptoOrderFormSettings;ZLj$/time/Instant;Lhippo/model/v1/OrderFormSettings;Lhippo/model/v1/GeneralSettings;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lhippo/model/v1/EquityOrderFormSettings;Lhippo/model/v1/OptionOrderFormSettings;Lhippo/model/v1/BackgroundAura;Lhippo/model/v1/ReleaseSettings;Lhippo/model/v1/CryptoOrderFormSettings;ZLj$/time/Instant;Lhippo/model/v1/OrderFormSettings;Lhippo/model/v1/GeneralSettings;Ljava/lang/String;Lokio/ByteString;)Lhippo/model/v1/AppSettings;", "Lhippo/model/v1/EquityOrderFormSettings;", "getLast_equity_order_form_fields", "()Lhippo/model/v1/EquityOrderFormSettings;", "Lhippo/model/v1/OptionOrderFormSettings;", "getLast_option_order_form_fields", "()Lhippo/model/v1/OptionOrderFormSettings;", "Lhippo/model/v1/BackgroundAura;", "getBackground_aura", "()Lhippo/model/v1/BackgroundAura;", "Lhippo/model/v1/ReleaseSettings;", "getRelease_settings", "()Lhippo/model/v1/ReleaseSettings;", "Lhippo/model/v1/CryptoOrderFormSettings;", "getLast_crypto_order_form_fields", "()Lhippo/model/v1/CryptoOrderFormSettings;", "Z", "()Z", "Lj$/time/Instant;", "getLast_accessed_at", "()Lj$/time/Instant;", "Lhippo/model/v1/OrderFormSettings;", "getOrder_form_settings", "()Lhippo/model/v1/OrderFormSettings;", "Lhippo/model/v1/GeneralSettings;", "getGeneral_settings", "()Lhippo/model/v1/GeneralSettings;", "Ljava/lang/String;", "getLast_selected_account", "Companion", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class AppSettings extends Message {

    @JvmField
    public static final ProtoAdapter<AppSettings> ADAPTER;

    @WireField(adapter = "hippo.model.v1.BackgroundAura#ADAPTER", jsonName = "backgroundAura", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final BackgroundAura background_aura;

    @WireField(adapter = "hippo.model.v1.GeneralSettings#ADAPTER", jsonName = "generalSettings", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final GeneralSettings general_settings;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isAutoSendDisclosureSigned", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final boolean is_auto_send_disclosure_signed;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "lastAccessedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Instant last_accessed_at;

    @WireField(adapter = "hippo.model.v1.CryptoOrderFormSettings#ADAPTER", jsonName = "lastCryptoOrderFormFields", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final CryptoOrderFormSettings last_crypto_order_form_fields;

    @WireField(adapter = "hippo.model.v1.EquityOrderFormSettings#ADAPTER", jsonName = "lastEquityOrderFormFields", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final EquityOrderFormSettings last_equity_order_form_fields;

    @WireField(adapter = "hippo.model.v1.OptionOrderFormSettings#ADAPTER", jsonName = "lastOptionOrderFormFields", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final OptionOrderFormSettings last_option_order_form_fields;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lastSelectedAccount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String last_selected_account;

    @WireField(adapter = "hippo.model.v1.OrderFormSettings#ADAPTER", jsonName = "orderFormSettings", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final OrderFormSettings order_form_settings;

    @WireField(adapter = "hippo.model.v1.ReleaseSettings#ADAPTER", jsonName = "releaseSettings", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final ReleaseSettings release_settings;

    public AppSettings() {
        this(null, null, null, null, null, false, null, null, null, null, null, 2047, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28230newBuilder();
    }

    public final EquityOrderFormSettings getLast_equity_order_form_fields() {
        return this.last_equity_order_form_fields;
    }

    public final OptionOrderFormSettings getLast_option_order_form_fields() {
        return this.last_option_order_form_fields;
    }

    public final BackgroundAura getBackground_aura() {
        return this.background_aura;
    }

    public final ReleaseSettings getRelease_settings() {
        return this.release_settings;
    }

    public final CryptoOrderFormSettings getLast_crypto_order_form_fields() {
        return this.last_crypto_order_form_fields;
    }

    /* renamed from: is_auto_send_disclosure_signed, reason: from getter */
    public final boolean getIs_auto_send_disclosure_signed() {
        return this.is_auto_send_disclosure_signed;
    }

    public final Instant getLast_accessed_at() {
        return this.last_accessed_at;
    }

    public final OrderFormSettings getOrder_form_settings() {
        return this.order_form_settings;
    }

    public final GeneralSettings getGeneral_settings() {
        return this.general_settings;
    }

    public final String getLast_selected_account() {
        return this.last_selected_account;
    }

    public /* synthetic */ AppSettings(EquityOrderFormSettings equityOrderFormSettings, OptionOrderFormSettings optionOrderFormSettings, BackgroundAura backgroundAura, ReleaseSettings releaseSettings, CryptoOrderFormSettings cryptoOrderFormSettings, boolean z, Instant instant, OrderFormSettings orderFormSettings, GeneralSettings generalSettings, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : equityOrderFormSettings, (i & 2) != 0 ? null : optionOrderFormSettings, (i & 4) != 0 ? null : backgroundAura, (i & 8) != 0 ? null : releaseSettings, (i & 16) != 0 ? null : cryptoOrderFormSettings, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : instant, (i & 128) != 0 ? null : orderFormSettings, (i & 256) != 0 ? null : generalSettings, (i & 512) != 0 ? "" : str, (i & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSettings(EquityOrderFormSettings equityOrderFormSettings, OptionOrderFormSettings optionOrderFormSettings, BackgroundAura backgroundAura, ReleaseSettings releaseSettings, CryptoOrderFormSettings cryptoOrderFormSettings, boolean z, Instant instant, OrderFormSettings orderFormSettings, GeneralSettings generalSettings, String last_selected_account, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(last_selected_account, "last_selected_account");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.last_equity_order_form_fields = equityOrderFormSettings;
        this.last_option_order_form_fields = optionOrderFormSettings;
        this.background_aura = backgroundAura;
        this.release_settings = releaseSettings;
        this.last_crypto_order_form_fields = cryptoOrderFormSettings;
        this.is_auto_send_disclosure_signed = z;
        this.last_accessed_at = instant;
        this.order_form_settings = orderFormSettings;
        this.general_settings = generalSettings;
        this.last_selected_account = last_selected_account;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28230newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AppSettings)) {
            return false;
        }
        AppSettings appSettings = (AppSettings) other;
        return Intrinsics.areEqual(unknownFields(), appSettings.unknownFields()) && Intrinsics.areEqual(this.last_equity_order_form_fields, appSettings.last_equity_order_form_fields) && Intrinsics.areEqual(this.last_option_order_form_fields, appSettings.last_option_order_form_fields) && Intrinsics.areEqual(this.background_aura, appSettings.background_aura) && Intrinsics.areEqual(this.release_settings, appSettings.release_settings) && Intrinsics.areEqual(this.last_crypto_order_form_fields, appSettings.last_crypto_order_form_fields) && this.is_auto_send_disclosure_signed == appSettings.is_auto_send_disclosure_signed && Intrinsics.areEqual(this.last_accessed_at, appSettings.last_accessed_at) && Intrinsics.areEqual(this.order_form_settings, appSettings.order_form_settings) && Intrinsics.areEqual(this.general_settings, appSettings.general_settings) && Intrinsics.areEqual(this.last_selected_account, appSettings.last_selected_account);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        EquityOrderFormSettings equityOrderFormSettings = this.last_equity_order_form_fields;
        int iHashCode2 = (iHashCode + (equityOrderFormSettings != null ? equityOrderFormSettings.hashCode() : 0)) * 37;
        OptionOrderFormSettings optionOrderFormSettings = this.last_option_order_form_fields;
        int iHashCode3 = (iHashCode2 + (optionOrderFormSettings != null ? optionOrderFormSettings.hashCode() : 0)) * 37;
        BackgroundAura backgroundAura = this.background_aura;
        int iHashCode4 = (iHashCode3 + (backgroundAura != null ? backgroundAura.hashCode() : 0)) * 37;
        ReleaseSettings releaseSettings = this.release_settings;
        int iHashCode5 = (iHashCode4 + (releaseSettings != null ? releaseSettings.hashCode() : 0)) * 37;
        CryptoOrderFormSettings cryptoOrderFormSettings = this.last_crypto_order_form_fields;
        int iHashCode6 = (((iHashCode5 + (cryptoOrderFormSettings != null ? cryptoOrderFormSettings.hashCode() : 0)) * 37) + Boolean.hashCode(this.is_auto_send_disclosure_signed)) * 37;
        Instant instant = this.last_accessed_at;
        int iHashCode7 = (iHashCode6 + (instant != null ? instant.hashCode() : 0)) * 37;
        OrderFormSettings orderFormSettings = this.order_form_settings;
        int iHashCode8 = (iHashCode7 + (orderFormSettings != null ? orderFormSettings.hashCode() : 0)) * 37;
        GeneralSettings generalSettings = this.general_settings;
        int iHashCode9 = ((iHashCode8 + (generalSettings != null ? generalSettings.hashCode() : 0)) * 37) + this.last_selected_account.hashCode();
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        EquityOrderFormSettings equityOrderFormSettings = this.last_equity_order_form_fields;
        if (equityOrderFormSettings != null) {
            arrayList.add("last_equity_order_form_fields=" + equityOrderFormSettings);
        }
        OptionOrderFormSettings optionOrderFormSettings = this.last_option_order_form_fields;
        if (optionOrderFormSettings != null) {
            arrayList.add("last_option_order_form_fields=" + optionOrderFormSettings);
        }
        BackgroundAura backgroundAura = this.background_aura;
        if (backgroundAura != null) {
            arrayList.add("background_aura=" + backgroundAura);
        }
        ReleaseSettings releaseSettings = this.release_settings;
        if (releaseSettings != null) {
            arrayList.add("release_settings=" + releaseSettings);
        }
        CryptoOrderFormSettings cryptoOrderFormSettings = this.last_crypto_order_form_fields;
        if (cryptoOrderFormSettings != null) {
            arrayList.add("last_crypto_order_form_fields=" + cryptoOrderFormSettings);
        }
        arrayList.add("is_auto_send_disclosure_signed=" + this.is_auto_send_disclosure_signed);
        Instant instant = this.last_accessed_at;
        if (instant != null) {
            arrayList.add("last_accessed_at=" + instant);
        }
        OrderFormSettings orderFormSettings = this.order_form_settings;
        if (orderFormSettings != null) {
            arrayList.add("order_form_settings=" + orderFormSettings);
        }
        GeneralSettings generalSettings = this.general_settings;
        if (generalSettings != null) {
            arrayList.add("general_settings=" + generalSettings);
        }
        arrayList.add("last_selected_account=" + Internal.sanitize(this.last_selected_account));
        return CollectionsKt.joinToString$default(arrayList, ", ", "AppSettings{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AppSettings copy$default(AppSettings appSettings, EquityOrderFormSettings equityOrderFormSettings, OptionOrderFormSettings optionOrderFormSettings, BackgroundAura backgroundAura, ReleaseSettings releaseSettings, CryptoOrderFormSettings cryptoOrderFormSettings, boolean z, Instant instant, OrderFormSettings orderFormSettings, GeneralSettings generalSettings, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            equityOrderFormSettings = appSettings.last_equity_order_form_fields;
        }
        if ((i & 2) != 0) {
            optionOrderFormSettings = appSettings.last_option_order_form_fields;
        }
        if ((i & 4) != 0) {
            backgroundAura = appSettings.background_aura;
        }
        if ((i & 8) != 0) {
            releaseSettings = appSettings.release_settings;
        }
        if ((i & 16) != 0) {
            cryptoOrderFormSettings = appSettings.last_crypto_order_form_fields;
        }
        if ((i & 32) != 0) {
            z = appSettings.is_auto_send_disclosure_signed;
        }
        if ((i & 64) != 0) {
            instant = appSettings.last_accessed_at;
        }
        if ((i & 128) != 0) {
            orderFormSettings = appSettings.order_form_settings;
        }
        if ((i & 256) != 0) {
            generalSettings = appSettings.general_settings;
        }
        if ((i & 512) != 0) {
            str = appSettings.last_selected_account;
        }
        if ((i & 1024) != 0) {
            byteString = appSettings.unknownFields();
        }
        String str2 = str;
        ByteString byteString2 = byteString;
        OrderFormSettings orderFormSettings2 = orderFormSettings;
        GeneralSettings generalSettings2 = generalSettings;
        boolean z2 = z;
        Instant instant2 = instant;
        CryptoOrderFormSettings cryptoOrderFormSettings2 = cryptoOrderFormSettings;
        BackgroundAura backgroundAura2 = backgroundAura;
        return appSettings.copy(equityOrderFormSettings, optionOrderFormSettings, backgroundAura2, releaseSettings, cryptoOrderFormSettings2, z2, instant2, orderFormSettings2, generalSettings2, str2, byteString2);
    }

    public final AppSettings copy(EquityOrderFormSettings last_equity_order_form_fields, OptionOrderFormSettings last_option_order_form_fields, BackgroundAura background_aura, ReleaseSettings release_settings, CryptoOrderFormSettings last_crypto_order_form_fields, boolean is_auto_send_disclosure_signed, Instant last_accessed_at, OrderFormSettings order_form_settings, GeneralSettings general_settings, String last_selected_account, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(last_selected_account, "last_selected_account");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AppSettings(last_equity_order_form_fields, last_option_order_form_fields, background_aura, release_settings, last_crypto_order_form_fields, is_auto_send_disclosure_signed, last_accessed_at, order_form_settings, general_settings, last_selected_account, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AppSettings.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AppSettings>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: hippo.model.v1.AppSettings$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AppSettings value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getLast_equity_order_form_fields() != null) {
                    size += EquityOrderFormSettings.ADAPTER.encodedSizeWithTag(1, value.getLast_equity_order_form_fields());
                }
                if (value.getLast_option_order_form_fields() != null) {
                    size += OptionOrderFormSettings.ADAPTER.encodedSizeWithTag(2, value.getLast_option_order_form_fields());
                }
                if (value.getBackground_aura() != null) {
                    size += BackgroundAura.ADAPTER.encodedSizeWithTag(3, value.getBackground_aura());
                }
                if (value.getRelease_settings() != null) {
                    size += ReleaseSettings.ADAPTER.encodedSizeWithTag(4, value.getRelease_settings());
                }
                if (value.getLast_crypto_order_form_fields() != null) {
                    size += CryptoOrderFormSettings.ADAPTER.encodedSizeWithTag(5, value.getLast_crypto_order_form_fields());
                }
                if (value.getIs_auto_send_disclosure_signed()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.getIs_auto_send_disclosure_signed()));
                }
                if (value.getLast_accessed_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(7, value.getLast_accessed_at());
                }
                if (value.getOrder_form_settings() != null) {
                    size += OrderFormSettings.ADAPTER.encodedSizeWithTag(8, value.getOrder_form_settings());
                }
                if (value.getGeneral_settings() != null) {
                    size += GeneralSettings.ADAPTER.encodedSizeWithTag(9, value.getGeneral_settings());
                }
                return !Intrinsics.areEqual(value.getLast_selected_account(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(10, value.getLast_selected_account()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AppSettings value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getLast_equity_order_form_fields() != null) {
                    EquityOrderFormSettings.ADAPTER.encodeWithTag(writer, 1, (int) value.getLast_equity_order_form_fields());
                }
                if (value.getLast_option_order_form_fields() != null) {
                    OptionOrderFormSettings.ADAPTER.encodeWithTag(writer, 2, (int) value.getLast_option_order_form_fields());
                }
                if (value.getBackground_aura() != null) {
                    BackgroundAura.ADAPTER.encodeWithTag(writer, 3, (int) value.getBackground_aura());
                }
                if (value.getRelease_settings() != null) {
                    ReleaseSettings.ADAPTER.encodeWithTag(writer, 4, (int) value.getRelease_settings());
                }
                if (value.getLast_crypto_order_form_fields() != null) {
                    CryptoOrderFormSettings.ADAPTER.encodeWithTag(writer, 5, (int) value.getLast_crypto_order_form_fields());
                }
                if (value.getIs_auto_send_disclosure_signed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getIs_auto_send_disclosure_signed()));
                }
                if (value.getLast_accessed_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 7, (int) value.getLast_accessed_at());
                }
                if (value.getOrder_form_settings() != null) {
                    OrderFormSettings.ADAPTER.encodeWithTag(writer, 8, (int) value.getOrder_form_settings());
                }
                if (value.getGeneral_settings() != null) {
                    GeneralSettings.ADAPTER.encodeWithTag(writer, 9, (int) value.getGeneral_settings());
                }
                if (!Intrinsics.areEqual(value.getLast_selected_account(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getLast_selected_account());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AppSettings value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getLast_selected_account(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getLast_selected_account());
                }
                if (value.getGeneral_settings() != null) {
                    GeneralSettings.ADAPTER.encodeWithTag(writer, 9, (int) value.getGeneral_settings());
                }
                if (value.getOrder_form_settings() != null) {
                    OrderFormSettings.ADAPTER.encodeWithTag(writer, 8, (int) value.getOrder_form_settings());
                }
                if (value.getLast_accessed_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 7, (int) value.getLast_accessed_at());
                }
                if (value.getIs_auto_send_disclosure_signed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getIs_auto_send_disclosure_signed()));
                }
                if (value.getLast_crypto_order_form_fields() != null) {
                    CryptoOrderFormSettings.ADAPTER.encodeWithTag(writer, 5, (int) value.getLast_crypto_order_form_fields());
                }
                if (value.getRelease_settings() != null) {
                    ReleaseSettings.ADAPTER.encodeWithTag(writer, 4, (int) value.getRelease_settings());
                }
                if (value.getBackground_aura() != null) {
                    BackgroundAura.ADAPTER.encodeWithTag(writer, 3, (int) value.getBackground_aura());
                }
                if (value.getLast_option_order_form_fields() != null) {
                    OptionOrderFormSettings.ADAPTER.encodeWithTag(writer, 2, (int) value.getLast_option_order_form_fields());
                }
                if (value.getLast_equity_order_form_fields() != null) {
                    EquityOrderFormSettings.ADAPTER.encodeWithTag(writer, 1, (int) value.getLast_equity_order_form_fields());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AppSettings redact(AppSettings value) {
                Intrinsics.checkNotNullParameter(value, "value");
                EquityOrderFormSettings last_equity_order_form_fields = value.getLast_equity_order_form_fields();
                EquityOrderFormSettings equityOrderFormSettingsRedact = last_equity_order_form_fields != null ? EquityOrderFormSettings.ADAPTER.redact(last_equity_order_form_fields) : null;
                OptionOrderFormSettings last_option_order_form_fields = value.getLast_option_order_form_fields();
                OptionOrderFormSettings optionOrderFormSettingsRedact = last_option_order_form_fields != null ? OptionOrderFormSettings.ADAPTER.redact(last_option_order_form_fields) : null;
                BackgroundAura background_aura = value.getBackground_aura();
                BackgroundAura backgroundAuraRedact = background_aura != null ? BackgroundAura.ADAPTER.redact(background_aura) : null;
                ReleaseSettings release_settings = value.getRelease_settings();
                ReleaseSettings releaseSettingsRedact = release_settings != null ? ReleaseSettings.ADAPTER.redact(release_settings) : null;
                CryptoOrderFormSettings last_crypto_order_form_fields = value.getLast_crypto_order_form_fields();
                CryptoOrderFormSettings cryptoOrderFormSettingsRedact = last_crypto_order_form_fields != null ? CryptoOrderFormSettings.ADAPTER.redact(last_crypto_order_form_fields) : null;
                Instant last_accessed_at = value.getLast_accessed_at();
                Instant instantRedact = last_accessed_at != null ? ProtoAdapter.INSTANT.redact(last_accessed_at) : null;
                OrderFormSettings order_form_settings = value.getOrder_form_settings();
                OrderFormSettings orderFormSettingsRedact = order_form_settings != null ? OrderFormSettings.ADAPTER.redact(order_form_settings) : null;
                GeneralSettings general_settings = value.getGeneral_settings();
                return AppSettings.copy$default(value, equityOrderFormSettingsRedact, optionOrderFormSettingsRedact, backgroundAuraRedact, releaseSettingsRedact, cryptoOrderFormSettingsRedact, false, instantRedact, orderFormSettingsRedact, general_settings != null ? GeneralSettings.ADAPTER.redact(general_settings) : null, null, ByteString.EMPTY, 544, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AppSettings decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                EquityOrderFormSettings equityOrderFormSettingsDecode = null;
                ReleaseSettings releaseSettingsDecode = null;
                CryptoOrderFormSettings cryptoOrderFormSettingsDecode = null;
                Instant instantDecode = null;
                OrderFormSettings orderFormSettingsDecode = null;
                GeneralSettings generalSettingsDecode = null;
                boolean zBooleanValue = false;
                String strDecode = "";
                OptionOrderFormSettings optionOrderFormSettingsDecode = null;
                BackgroundAura backgroundAuraDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                equityOrderFormSettingsDecode = EquityOrderFormSettings.ADAPTER.decode(reader);
                                break;
                            case 2:
                                optionOrderFormSettingsDecode = OptionOrderFormSettings.ADAPTER.decode(reader);
                                break;
                            case 3:
                                backgroundAuraDecode = BackgroundAura.ADAPTER.decode(reader);
                                break;
                            case 4:
                                releaseSettingsDecode = ReleaseSettings.ADAPTER.decode(reader);
                                break;
                            case 5:
                                cryptoOrderFormSettingsDecode = CryptoOrderFormSettings.ADAPTER.decode(reader);
                                break;
                            case 6:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 7:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 8:
                                orderFormSettingsDecode = OrderFormSettings.ADAPTER.decode(reader);
                                break;
                            case 9:
                                generalSettingsDecode = GeneralSettings.ADAPTER.decode(reader);
                                break;
                            case 10:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new AppSettings(equityOrderFormSettingsDecode, optionOrderFormSettingsDecode, backgroundAuraDecode, releaseSettingsDecode, cryptoOrderFormSettingsDecode, zBooleanValue, instantDecode, orderFormSettingsDecode, generalSettingsDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
