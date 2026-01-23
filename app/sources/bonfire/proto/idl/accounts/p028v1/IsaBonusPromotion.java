package bonfire.proto.idl.accounts.p028v1;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: IsaBonusPromotion.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\bH\u0016JP\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006%"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/IsaBonusPromotion;", "Lcom/squareup/wire/Message;", "", "match_rate", "", "maximum_reward_amount", "Lcom/robinhood/rosetta/common/Money;", "promo_end_date", "", "onboarding_lottie_cdn_asset_path_light", "onboarding_lottie_cdn_asset_path_dark", "upsell_config", "Lbonfire/proto/idl/accounts/v1/IsaTabBannerConfig;", "unknownFields", "Lokio/ByteString;", "<init>", "(FLcom/robinhood/rosetta/common/Money;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/accounts/v1/IsaTabBannerConfig;Lokio/ByteString;)V", "getMatch_rate", "()F", "getMaximum_reward_amount", "()Lcom/robinhood/rosetta/common/Money;", "getPromo_end_date", "()Ljava/lang/String;", "getOnboarding_lottie_cdn_asset_path_light", "getOnboarding_lottie_cdn_asset_path_dark", "getUpsell_config", "()Lbonfire/proto/idl/accounts/v1/IsaTabBannerConfig;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.rhuk_isa.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class IsaBonusPromotion extends Message {

    @JvmField
    public static final ProtoAdapter<IsaBonusPromotion> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "matchRate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final float match_rate;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "maximumRewardAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Money maximum_reward_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "onboardingLottieCdnAssetPathDark", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String onboarding_lottie_cdn_asset_path_dark;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "onboardingLottieCdnAssetPathLight", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String onboarding_lottie_cdn_asset_path_light;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "promoEndDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String promo_end_date;

    @WireField(adapter = "bonfire.proto.idl.accounts.v1.IsaTabBannerConfig#ADAPTER", jsonName = "upsellConfig", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final IsaTabBannerConfig upsell_config;

    public IsaBonusPromotion() {
        this(0.0f, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ IsaBonusPromotion(float f, Money money, String str, String str2, String str3, IsaTabBannerConfig isaTabBannerConfig, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? null : money, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? null : isaTabBannerConfig, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8730newBuilder();
    }

    public final float getMatch_rate() {
        return this.match_rate;
    }

    public final Money getMaximum_reward_amount() {
        return this.maximum_reward_amount;
    }

    public final String getPromo_end_date() {
        return this.promo_end_date;
    }

    public final String getOnboarding_lottie_cdn_asset_path_light() {
        return this.onboarding_lottie_cdn_asset_path_light;
    }

    public final String getOnboarding_lottie_cdn_asset_path_dark() {
        return this.onboarding_lottie_cdn_asset_path_dark;
    }

    public final IsaTabBannerConfig getUpsell_config() {
        return this.upsell_config;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IsaBonusPromotion(float f, Money money, String promo_end_date, String onboarding_lottie_cdn_asset_path_light, String onboarding_lottie_cdn_asset_path_dark, IsaTabBannerConfig isaTabBannerConfig, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(promo_end_date, "promo_end_date");
        Intrinsics.checkNotNullParameter(onboarding_lottie_cdn_asset_path_light, "onboarding_lottie_cdn_asset_path_light");
        Intrinsics.checkNotNullParameter(onboarding_lottie_cdn_asset_path_dark, "onboarding_lottie_cdn_asset_path_dark");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.match_rate = f;
        this.maximum_reward_amount = money;
        this.promo_end_date = promo_end_date;
        this.onboarding_lottie_cdn_asset_path_light = onboarding_lottie_cdn_asset_path_light;
        this.onboarding_lottie_cdn_asset_path_dark = onboarding_lottie_cdn_asset_path_dark;
        this.upsell_config = isaTabBannerConfig;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8730newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof IsaBonusPromotion)) {
            return false;
        }
        IsaBonusPromotion isaBonusPromotion = (IsaBonusPromotion) other;
        return Intrinsics.areEqual(unknownFields(), isaBonusPromotion.unknownFields()) && this.match_rate == isaBonusPromotion.match_rate && Intrinsics.areEqual(this.maximum_reward_amount, isaBonusPromotion.maximum_reward_amount) && Intrinsics.areEqual(this.promo_end_date, isaBonusPromotion.promo_end_date) && Intrinsics.areEqual(this.onboarding_lottie_cdn_asset_path_light, isaBonusPromotion.onboarding_lottie_cdn_asset_path_light) && Intrinsics.areEqual(this.onboarding_lottie_cdn_asset_path_dark, isaBonusPromotion.onboarding_lottie_cdn_asset_path_dark) && Intrinsics.areEqual(this.upsell_config, isaBonusPromotion.upsell_config);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + Float.hashCode(this.match_rate)) * 37;
        Money money = this.maximum_reward_amount;
        int iHashCode2 = (((((((iHashCode + (money != null ? money.hashCode() : 0)) * 37) + this.promo_end_date.hashCode()) * 37) + this.onboarding_lottie_cdn_asset_path_light.hashCode()) * 37) + this.onboarding_lottie_cdn_asset_path_dark.hashCode()) * 37;
        IsaTabBannerConfig isaTabBannerConfig = this.upsell_config;
        int iHashCode3 = iHashCode2 + (isaTabBannerConfig != null ? isaTabBannerConfig.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("match_rate=" + this.match_rate);
        Money money = this.maximum_reward_amount;
        if (money != null) {
            arrayList.add("maximum_reward_amount=" + money);
        }
        arrayList.add("promo_end_date=" + Internal.sanitize(this.promo_end_date));
        arrayList.add("onboarding_lottie_cdn_asset_path_light=" + Internal.sanitize(this.onboarding_lottie_cdn_asset_path_light));
        arrayList.add("onboarding_lottie_cdn_asset_path_dark=" + Internal.sanitize(this.onboarding_lottie_cdn_asset_path_dark));
        IsaTabBannerConfig isaTabBannerConfig = this.upsell_config;
        if (isaTabBannerConfig != null) {
            arrayList.add("upsell_config=" + isaTabBannerConfig);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "IsaBonusPromotion{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ IsaBonusPromotion copy$default(IsaBonusPromotion isaBonusPromotion, float f, Money money, String str, String str2, String str3, IsaTabBannerConfig isaTabBannerConfig, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            f = isaBonusPromotion.match_rate;
        }
        if ((i & 2) != 0) {
            money = isaBonusPromotion.maximum_reward_amount;
        }
        if ((i & 4) != 0) {
            str = isaBonusPromotion.promo_end_date;
        }
        if ((i & 8) != 0) {
            str2 = isaBonusPromotion.onboarding_lottie_cdn_asset_path_light;
        }
        if ((i & 16) != 0) {
            str3 = isaBonusPromotion.onboarding_lottie_cdn_asset_path_dark;
        }
        if ((i & 32) != 0) {
            isaTabBannerConfig = isaBonusPromotion.upsell_config;
        }
        if ((i & 64) != 0) {
            byteString = isaBonusPromotion.unknownFields();
        }
        IsaTabBannerConfig isaTabBannerConfig2 = isaTabBannerConfig;
        ByteString byteString2 = byteString;
        String str4 = str3;
        String str5 = str;
        return isaBonusPromotion.copy(f, money, str5, str2, str4, isaTabBannerConfig2, byteString2);
    }

    public final IsaBonusPromotion copy(float match_rate, Money maximum_reward_amount, String promo_end_date, String onboarding_lottie_cdn_asset_path_light, String onboarding_lottie_cdn_asset_path_dark, IsaTabBannerConfig upsell_config, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(promo_end_date, "promo_end_date");
        Intrinsics.checkNotNullParameter(onboarding_lottie_cdn_asset_path_light, "onboarding_lottie_cdn_asset_path_light");
        Intrinsics.checkNotNullParameter(onboarding_lottie_cdn_asset_path_dark, "onboarding_lottie_cdn_asset_path_dark");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new IsaBonusPromotion(match_rate, maximum_reward_amount, promo_end_date, onboarding_lottie_cdn_asset_path_light, onboarding_lottie_cdn_asset_path_dark, upsell_config, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IsaBonusPromotion.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<IsaBonusPromotion>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.accounts.v1.IsaBonusPromotion$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(IsaBonusPromotion value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Float.valueOf(value.getMatch_rate()).equals(Float.valueOf(0.0f))) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(1, Float.valueOf(value.getMatch_rate()));
                }
                if (value.getMaximum_reward_amount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(2, value.getMaximum_reward_amount());
                }
                if (!Intrinsics.areEqual(value.getPromo_end_date(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getPromo_end_date());
                }
                if (!Intrinsics.areEqual(value.getOnboarding_lottie_cdn_asset_path_light(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getOnboarding_lottie_cdn_asset_path_light());
                }
                if (!Intrinsics.areEqual(value.getOnboarding_lottie_cdn_asset_path_dark(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getOnboarding_lottie_cdn_asset_path_dark());
                }
                return value.getUpsell_config() != null ? size + IsaTabBannerConfig.ADAPTER.encodedSizeWithTag(6, value.getUpsell_config()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, IsaBonusPromotion value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Float.valueOf(value.getMatch_rate()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 1, (int) Float.valueOf(value.getMatch_rate()));
                }
                if (value.getMaximum_reward_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getMaximum_reward_amount());
                }
                if (!Intrinsics.areEqual(value.getPromo_end_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPromo_end_date());
                }
                if (!Intrinsics.areEqual(value.getOnboarding_lottie_cdn_asset_path_light(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getOnboarding_lottie_cdn_asset_path_light());
                }
                if (!Intrinsics.areEqual(value.getOnboarding_lottie_cdn_asset_path_dark(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getOnboarding_lottie_cdn_asset_path_dark());
                }
                if (value.getUpsell_config() != null) {
                    IsaTabBannerConfig.ADAPTER.encodeWithTag(writer, 6, (int) value.getUpsell_config());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, IsaBonusPromotion value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getUpsell_config() != null) {
                    IsaTabBannerConfig.ADAPTER.encodeWithTag(writer, 6, (int) value.getUpsell_config());
                }
                if (!Intrinsics.areEqual(value.getOnboarding_lottie_cdn_asset_path_dark(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getOnboarding_lottie_cdn_asset_path_dark());
                }
                if (!Intrinsics.areEqual(value.getOnboarding_lottie_cdn_asset_path_light(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getOnboarding_lottie_cdn_asset_path_light());
                }
                if (!Intrinsics.areEqual(value.getPromo_end_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPromo_end_date());
                }
                if (value.getMaximum_reward_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getMaximum_reward_amount());
                }
                if (Float.valueOf(value.getMatch_rate()).equals(Float.valueOf(0.0f))) {
                    return;
                }
                ProtoAdapter.FLOAT.encodeWithTag(writer, 1, (int) Float.valueOf(value.getMatch_rate()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IsaBonusPromotion redact(IsaBonusPromotion value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money maximum_reward_amount = value.getMaximum_reward_amount();
                Money moneyRedact = maximum_reward_amount != null ? Money.ADAPTER.redact(maximum_reward_amount) : null;
                IsaTabBannerConfig upsell_config = value.getUpsell_config();
                return IsaBonusPromotion.copy$default(value, 0.0f, moneyRedact, null, null, null, upsell_config != null ? IsaTabBannerConfig.ADAPTER.redact(upsell_config) : null, ByteString.EMPTY, 29, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public IsaBonusPromotion decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Money moneyDecode = null;
                String strDecode = "";
                float fFloatValue = 0.0f;
                IsaTabBannerConfig isaTabBannerConfigDecode = null;
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                break;
                            case 2:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                isaTabBannerConfigDecode = IsaTabBannerConfig.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new IsaBonusPromotion(fFloatValue, moneyDecode, strDecode, strDecode2, strDecode3, isaTabBannerConfigDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
