package bff_money_movement.service.p019v1;

import com.robinhood.rosetta.common.Money;
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
import rh_server_driven_ui.p531v1.Image;

/* compiled from: BillingAccount.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 32\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00013B\u0099\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010,\u001a\u00020\u0002H\u0017J\u0013\u0010-\u001a\u00020\u00122\b\u0010.\u001a\u0004\u0018\u00010/H\u0096\u0002J\b\u00100\u001a\u00020\u000bH\u0016J\b\u00101\u001a\u00020\u0004H\u0016J\u0098\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u0017R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010(R\u0016\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0016\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0016\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001b¨\u00064"}, m3636d2 = {"Lbff_money_movement/service/v1/BillingAccount;", "Lcom/squareup/wire/Message;", "", "id", "", "type", "Lbff_money_movement/service/v1/BillingAccountType;", "instant_available_amount", "Lcom/robinhood/rosetta/common/Money;", "instant_daily_amount", "remaining_count_limit", "", "daily_count_limit", "primary_label", "secondary_label", "icon", "Lrh_server_driven_ui/v1/Image;", "is_3ds_required", "", "nickname", "type_name", "trailing_digits", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lbff_money_movement/service/v1/BillingAccountType;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;IILjava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/Image;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getType", "()Lbff_money_movement/service/v1/BillingAccountType;", "getInstant_available_amount", "()Lcom/robinhood/rosetta/common/Money;", "getInstant_daily_amount", "getRemaining_count_limit", "()I", "getDaily_count_limit", "getPrimary_label", "getSecondary_label", "getIcon", "()Lrh_server_driven_ui/v1/Image;", "()Z", "getNickname", "getType_name", "getTrailing_digits", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class BillingAccount extends Message {

    @JvmField
    public static final ProtoAdapter<BillingAccount> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "dailyCountLimit", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final int daily_count_limit;

    @WireField(adapter = "rh_server_driven_ui.v1.Image#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final Image icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "instantAvailableAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Money instant_available_amount;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "instantDailyAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Money instant_daily_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "is3dsRequired", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final boolean is_3ds_required;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String nickname;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "primaryLabel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String primary_label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "remainingCountLimit", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final int remaining_count_limit;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "secondaryLabel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String secondary_label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "trailingDigits", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final String trailing_digits;

    @WireField(adapter = "bff_money_movement.service.v1.BillingAccountType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final BillingAccountType type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "typeName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final String type_name;

    public BillingAccount() {
        this(null, null, null, null, 0, 0, null, null, null, false, null, null, null, null, 16383, null);
    }

    public /* synthetic */ BillingAccount(String str, BillingAccountType billingAccountType, Money money, Money money2, int i, int i2, String str2, String str3, Image image, boolean z, String str4, String str5, String str6, ByteString byteString, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? BillingAccountType.BILLING_ACCOUNT_TYPE_UNSPECIFIED : billingAccountType, (i3 & 4) != 0 ? null : money, (i3 & 8) != 0 ? null : money2, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? "" : str2, (i3 & 128) != 0 ? "" : str3, (i3 & 256) == 0 ? image : null, (i3 & 512) == 0 ? z : false, (i3 & 1024) != 0 ? "" : str4, (i3 & 2048) != 0 ? "" : str5, (i3 & 4096) == 0 ? str6 : "", (i3 & 8192) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8394newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final BillingAccountType getType() {
        return this.type;
    }

    public final Money getInstant_available_amount() {
        return this.instant_available_amount;
    }

    public final Money getInstant_daily_amount() {
        return this.instant_daily_amount;
    }

    public final int getRemaining_count_limit() {
        return this.remaining_count_limit;
    }

    public final int getDaily_count_limit() {
        return this.daily_count_limit;
    }

    public final String getPrimary_label() {
        return this.primary_label;
    }

    public final String getSecondary_label() {
        return this.secondary_label;
    }

    public final Image getIcon() {
        return this.icon;
    }

    /* renamed from: is_3ds_required, reason: from getter */
    public final boolean getIs_3ds_required() {
        return this.is_3ds_required;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getType_name() {
        return this.type_name;
    }

    public final String getTrailing_digits() {
        return this.trailing_digits;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingAccount(String id, BillingAccountType type2, Money money, Money money2, int i, int i2, String primary_label, String secondary_label, Image image, boolean z, String nickname, String type_name, String trailing_digits, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(primary_label, "primary_label");
        Intrinsics.checkNotNullParameter(secondary_label, "secondary_label");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(type_name, "type_name");
        Intrinsics.checkNotNullParameter(trailing_digits, "trailing_digits");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.type = type2;
        this.instant_available_amount = money;
        this.instant_daily_amount = money2;
        this.remaining_count_limit = i;
        this.daily_count_limit = i2;
        this.primary_label = primary_label;
        this.secondary_label = secondary_label;
        this.icon = image;
        this.is_3ds_required = z;
        this.nickname = nickname;
        this.type_name = type_name;
        this.trailing_digits = trailing_digits;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8394newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BillingAccount)) {
            return false;
        }
        BillingAccount billingAccount = (BillingAccount) other;
        return Intrinsics.areEqual(unknownFields(), billingAccount.unknownFields()) && Intrinsics.areEqual(this.id, billingAccount.id) && this.type == billingAccount.type && Intrinsics.areEqual(this.instant_available_amount, billingAccount.instant_available_amount) && Intrinsics.areEqual(this.instant_daily_amount, billingAccount.instant_daily_amount) && this.remaining_count_limit == billingAccount.remaining_count_limit && this.daily_count_limit == billingAccount.daily_count_limit && Intrinsics.areEqual(this.primary_label, billingAccount.primary_label) && Intrinsics.areEqual(this.secondary_label, billingAccount.secondary_label) && Intrinsics.areEqual(this.icon, billingAccount.icon) && this.is_3ds_required == billingAccount.is_3ds_required && Intrinsics.areEqual(this.nickname, billingAccount.nickname) && Intrinsics.areEqual(this.type_name, billingAccount.type_name) && Intrinsics.areEqual(this.trailing_digits, billingAccount.trailing_digits);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.type.hashCode()) * 37;
        Money money = this.instant_available_amount;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.instant_daily_amount;
        int iHashCode3 = (((((((((iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37) + Integer.hashCode(this.remaining_count_limit)) * 37) + Integer.hashCode(this.daily_count_limit)) * 37) + this.primary_label.hashCode()) * 37) + this.secondary_label.hashCode()) * 37;
        Image image = this.icon;
        int iHashCode4 = ((((((((iHashCode3 + (image != null ? image.hashCode() : 0)) * 37) + Boolean.hashCode(this.is_3ds_required)) * 37) + this.nickname.hashCode()) * 37) + this.type_name.hashCode()) * 37) + this.trailing_digits.hashCode();
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("type=" + this.type);
        Money money = this.instant_available_amount;
        if (money != null) {
            arrayList.add("instant_available_amount=" + money);
        }
        Money money2 = this.instant_daily_amount;
        if (money2 != null) {
            arrayList.add("instant_daily_amount=" + money2);
        }
        arrayList.add("remaining_count_limit=" + this.remaining_count_limit);
        arrayList.add("daily_count_limit=" + this.daily_count_limit);
        arrayList.add("primary_label=" + Internal.sanitize(this.primary_label));
        arrayList.add("secondary_label=" + Internal.sanitize(this.secondary_label));
        Image image = this.icon;
        if (image != null) {
            arrayList.add("icon=" + image);
        }
        arrayList.add("is_3ds_required=" + this.is_3ds_required);
        arrayList.add("nickname=" + Internal.sanitize(this.nickname));
        arrayList.add("type_name=" + Internal.sanitize(this.type_name));
        arrayList.add("trailing_digits=" + Internal.sanitize(this.trailing_digits));
        return CollectionsKt.joinToString$default(arrayList, ", ", "BillingAccount{", "}", 0, null, null, 56, null);
    }

    public final BillingAccount copy(String id, BillingAccountType type2, Money instant_available_amount, Money instant_daily_amount, int remaining_count_limit, int daily_count_limit, String primary_label, String secondary_label, Image icon, boolean is_3ds_required, String nickname, String type_name, String trailing_digits, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(primary_label, "primary_label");
        Intrinsics.checkNotNullParameter(secondary_label, "secondary_label");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(type_name, "type_name");
        Intrinsics.checkNotNullParameter(trailing_digits, "trailing_digits");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BillingAccount(id, type2, instant_available_amount, instant_daily_amount, remaining_count_limit, daily_count_limit, primary_label, secondary_label, icon, is_3ds_required, nickname, type_name, trailing_digits, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BillingAccount.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BillingAccount>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.BillingAccount$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BillingAccount value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (value.getType() != BillingAccountType.BILLING_ACCOUNT_TYPE_UNSPECIFIED) {
                    size += BillingAccountType.ADAPTER.encodedSizeWithTag(2, value.getType());
                }
                if (value.getInstant_available_amount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(3, value.getInstant_available_amount());
                }
                if (value.getInstant_daily_amount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(4, value.getInstant_daily_amount());
                }
                if (value.getRemaining_count_limit() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(5, Integer.valueOf(value.getRemaining_count_limit()));
                }
                if (value.getDaily_count_limit() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(6, Integer.valueOf(value.getDaily_count_limit()));
                }
                if (!Intrinsics.areEqual(value.getPrimary_label(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getPrimary_label());
                }
                if (!Intrinsics.areEqual(value.getSecondary_label(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getSecondary_label());
                }
                if (value.getIcon() != null) {
                    size += Image.ADAPTER.encodedSizeWithTag(9, value.getIcon());
                }
                if (value.getIs_3ds_required()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(10, Boolean.valueOf(value.getIs_3ds_required()));
                }
                if (!Intrinsics.areEqual(value.getNickname(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getNickname());
                }
                if (!Intrinsics.areEqual(value.getType_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(12, value.getType_name());
                }
                return !Intrinsics.areEqual(value.getTrailing_digits(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(13, value.getTrailing_digits()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BillingAccount value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getType() != BillingAccountType.BILLING_ACCOUNT_TYPE_UNSPECIFIED) {
                    BillingAccountType.ADAPTER.encodeWithTag(writer, 2, (int) value.getType());
                }
                if (value.getInstant_available_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getInstant_available_amount());
                }
                if (value.getInstant_daily_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getInstant_daily_amount());
                }
                if (value.getRemaining_count_limit() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getRemaining_count_limit()));
                }
                if (value.getDaily_count_limit() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getDaily_count_limit()));
                }
                if (!Intrinsics.areEqual(value.getPrimary_label(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getPrimary_label());
                }
                if (!Intrinsics.areEqual(value.getSecondary_label(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getSecondary_label());
                }
                if (value.getIcon() != null) {
                    Image.ADAPTER.encodeWithTag(writer, 9, (int) value.getIcon());
                }
                if (value.getIs_3ds_required()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 10, (int) Boolean.valueOf(value.getIs_3ds_required()));
                }
                if (!Intrinsics.areEqual(value.getNickname(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getNickname());
                }
                if (!Intrinsics.areEqual(value.getType_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getType_name());
                }
                if (!Intrinsics.areEqual(value.getTrailing_digits(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getTrailing_digits());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BillingAccount value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getTrailing_digits(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getTrailing_digits());
                }
                if (!Intrinsics.areEqual(value.getType_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getType_name());
                }
                if (!Intrinsics.areEqual(value.getNickname(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getNickname());
                }
                if (value.getIs_3ds_required()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 10, (int) Boolean.valueOf(value.getIs_3ds_required()));
                }
                if (value.getIcon() != null) {
                    Image.ADAPTER.encodeWithTag(writer, 9, (int) value.getIcon());
                }
                if (!Intrinsics.areEqual(value.getSecondary_label(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getSecondary_label());
                }
                if (!Intrinsics.areEqual(value.getPrimary_label(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getPrimary_label());
                }
                if (value.getDaily_count_limit() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getDaily_count_limit()));
                }
                if (value.getRemaining_count_limit() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getRemaining_count_limit()));
                }
                if (value.getInstant_daily_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getInstant_daily_amount());
                }
                if (value.getInstant_available_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getInstant_available_amount());
                }
                if (value.getType() != BillingAccountType.BILLING_ACCOUNT_TYPE_UNSPECIFIED) {
                    BillingAccountType.ADAPTER.encodeWithTag(writer, 2, (int) value.getType());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BillingAccount decode(ProtoReader reader) throws IOException {
                BillingAccountType billingAccountType;
                String str;
                Intrinsics.checkNotNullParameter(reader, "reader");
                BillingAccountType billingAccountType2 = BillingAccountType.BILLING_ACCOUNT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                Image imageDecode = null;
                int iIntValue = 0;
                int iIntValue2 = 0;
                boolean zBooleanValue = false;
                BillingAccountType billingAccountTypeDecode = billingAccountType2;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 2:
                                try {
                                    billingAccountTypeDecode = BillingAccountType.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    billingAccountType = billingAccountTypeDecode;
                                    str = strDecode5;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 3:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                continue;
                            case 4:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                continue;
                            case 5:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                continue;
                            case 6:
                                iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                                continue;
                            case 7:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 8:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 9:
                                imageDecode = Image.ADAPTER.decode(reader);
                                continue;
                            case 10:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                continue;
                            case 11:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 12:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 13:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                billingAccountType = billingAccountTypeDecode;
                                str = strDecode5;
                                break;
                        }
                        strDecode5 = str;
                        billingAccountTypeDecode = billingAccountType;
                    } else {
                        return new BillingAccount(strDecode5, billingAccountTypeDecode, moneyDecode, moneyDecode2, iIntValue, iIntValue2, strDecode6, strDecode, imageDecode, zBooleanValue, strDecode2, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BillingAccount redact(BillingAccount value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money instant_available_amount = value.getInstant_available_amount();
                Money moneyRedact = instant_available_amount != null ? Money.ADAPTER.redact(instant_available_amount) : null;
                Money instant_daily_amount = value.getInstant_daily_amount();
                Money moneyRedact2 = instant_daily_amount != null ? Money.ADAPTER.redact(instant_daily_amount) : null;
                Image icon = value.getIcon();
                return value.copy((7923 & 1) != 0 ? value.id : null, (7923 & 2) != 0 ? value.type : null, (7923 & 4) != 0 ? value.instant_available_amount : moneyRedact, (7923 & 8) != 0 ? value.instant_daily_amount : moneyRedact2, (7923 & 16) != 0 ? value.remaining_count_limit : 0, (7923 & 32) != 0 ? value.daily_count_limit : 0, (7923 & 64) != 0 ? value.primary_label : null, (7923 & 128) != 0 ? value.secondary_label : null, (7923 & 256) != 0 ? value.icon : icon != null ? Image.ADAPTER.redact(icon) : null, (7923 & 512) != 0 ? value.is_3ds_required : false, (7923 & 1024) != 0 ? value.nickname : null, (7923 & 2048) != 0 ? value.type_name : null, (7923 & 4096) != 0 ? value.trailing_digits : null, (7923 & 8192) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
