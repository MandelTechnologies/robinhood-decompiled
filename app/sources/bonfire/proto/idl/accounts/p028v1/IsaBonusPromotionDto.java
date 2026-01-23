package bonfire.proto.idl.accounts.p028v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.accounts.p028v1.IsaTabBannerConfigDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.FloatAsNumberSerializer;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: IsaBonusPromotionDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004,+-.B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BI\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0006\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006/"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/IsaBonusPromotionDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/accounts/v1/IsaBonusPromotion;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/accounts/v1/IsaBonusPromotionDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/accounts/v1/IsaBonusPromotionDto$Surrogate;)V", "", "match_rate", "Lcom/robinhood/rosetta/common/MoneyDto;", "maximum_reward_amount", "", "promo_end_date", "onboarding_lottie_cdn_asset_path_light", "onboarding_lottie_cdn_asset_path_dark", "Lbonfire/proto/idl/accounts/v1/IsaTabBannerConfigDto;", "upsell_config", "(FLcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/accounts/v1/IsaTabBannerConfigDto;)V", "toProto", "()Lbonfire/proto/idl/accounts/v1/IsaBonusPromotion;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/accounts/v1/IsaBonusPromotionDto$Surrogate;", "getMatch_rate", "()F", "getUpsell_config", "()Lbonfire/proto/idl/accounts/v1/IsaTabBannerConfigDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.rhuk_isa.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class IsaBonusPromotionDto implements Dto3<IsaBonusPromotion>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<IsaBonusPromotionDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<IsaBonusPromotionDto, IsaBonusPromotion>> binaryBase64Serializer$delegate;
    private static final IsaBonusPromotionDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ IsaBonusPromotionDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private IsaBonusPromotionDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final float getMatch_rate() {
        return this.surrogate.getMatch_rate();
    }

    public final IsaTabBannerConfigDto getUpsell_config() {
        return this.surrogate.getUpsell_config();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ IsaBonusPromotionDto(float r3, com.robinhood.rosetta.common.MoneyDto r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, bonfire.proto.idl.accounts.p028v1.IsaTabBannerConfigDto r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r2 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L5
            r3 = 0
        L5:
            r10 = r9 & 2
            r0 = 0
            if (r10 == 0) goto Lb
            r4 = r0
        Lb:
            r10 = r9 & 4
            java.lang.String r1 = ""
            if (r10 == 0) goto L12
            r5 = r1
        L12:
            r10 = r9 & 8
            if (r10 == 0) goto L17
            r6 = r1
        L17:
            r10 = r9 & 16
            if (r10 == 0) goto L1c
            r7 = r1
        L1c:
            r9 = r9 & 32
            if (r9 == 0) goto L28
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            goto L2f
        L28:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r4 = r2
        L2f:
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bonfire.proto.idl.accounts.p028v1.IsaBonusPromotionDto.<init>(float, com.robinhood.rosetta.common.MoneyDto, java.lang.String, java.lang.String, java.lang.String, bonfire.proto.idl.accounts.v1.IsaTabBannerConfigDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IsaBonusPromotionDto(float f, MoneyDto moneyDto, String promo_end_date, String onboarding_lottie_cdn_asset_path_light, String onboarding_lottie_cdn_asset_path_dark, IsaTabBannerConfigDto isaTabBannerConfigDto) {
        this(new Surrogate(f, moneyDto, promo_end_date, onboarding_lottie_cdn_asset_path_light, onboarding_lottie_cdn_asset_path_dark, isaTabBannerConfigDto));
        Intrinsics.checkNotNullParameter(promo_end_date, "promo_end_date");
        Intrinsics.checkNotNullParameter(onboarding_lottie_cdn_asset_path_light, "onboarding_lottie_cdn_asset_path_light");
        Intrinsics.checkNotNullParameter(onboarding_lottie_cdn_asset_path_dark, "onboarding_lottie_cdn_asset_path_dark");
    }

    @Override // com.robinhood.idl.Dto
    public IsaBonusPromotion toProto() {
        float match_rate = this.surrogate.getMatch_rate();
        MoneyDto maximum_reward_amount = this.surrogate.getMaximum_reward_amount();
        Money proto = maximum_reward_amount != null ? maximum_reward_amount.toProto() : null;
        String promo_end_date = this.surrogate.getPromo_end_date();
        String onboarding_lottie_cdn_asset_path_light = this.surrogate.getOnboarding_lottie_cdn_asset_path_light();
        String onboarding_lottie_cdn_asset_path_dark = this.surrogate.getOnboarding_lottie_cdn_asset_path_dark();
        IsaTabBannerConfigDto upsell_config = this.surrogate.getUpsell_config();
        return new IsaBonusPromotion(match_rate, proto, promo_end_date, onboarding_lottie_cdn_asset_path_light, onboarding_lottie_cdn_asset_path_dark, upsell_config != null ? upsell_config.toProto() : null, null, 64, null);
    }

    public String toString() {
        return "[IsaBonusPromotionDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof IsaBonusPromotionDto) && Intrinsics.areEqual(((IsaBonusPromotionDto) other).surrogate, this.surrogate);
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
    /* compiled from: IsaBonusPromotionDto.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0083\b\u0018\u0000 ;2\u00020\u0001:\u0002<;BV\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010BU\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010,\u0012\u0004\b/\u0010+\u001a\u0004\b-\u0010.R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00100\u0012\u0004\b2\u0010+\u001a\u0004\b1\u0010 R \u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00100\u0012\u0004\b4\u0010+\u001a\u0004\b3\u0010 R \u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00100\u0012\u0004\b6\u0010+\u001a\u0004\b5\u0010 R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00107\u0012\u0004\b:\u0010+\u001a\u0004\b8\u00109¨\u0006="}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/IsaBonusPromotionDto$Surrogate;", "", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/FloatSerializer;", "match_rate", "Lcom/robinhood/rosetta/common/MoneyDto;", "maximum_reward_amount", "", "promo_end_date", "onboarding_lottie_cdn_asset_path_light", "onboarding_lottie_cdn_asset_path_dark", "Lbonfire/proto/idl/accounts/v1/IsaTabBannerConfigDto;", "upsell_config", "<init>", "(FLcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/accounts/v1/IsaTabBannerConfigDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IFLcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/accounts/v1/IsaTabBannerConfigDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_rhuk_isa_v1_externalRelease", "(Lbonfire/proto/idl/accounts/v1/IsaBonusPromotionDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getMatch_rate", "()F", "getMatch_rate$annotations", "()V", "Lcom/robinhood/rosetta/common/MoneyDto;", "getMaximum_reward_amount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getMaximum_reward_amount$annotations", "Ljava/lang/String;", "getPromo_end_date", "getPromo_end_date$annotations", "getOnboarding_lottie_cdn_asset_path_light", "getOnboarding_lottie_cdn_asset_path_light$annotations", "getOnboarding_lottie_cdn_asset_path_dark", "getOnboarding_lottie_cdn_asset_path_dark$annotations", "Lbonfire/proto/idl/accounts/v1/IsaTabBannerConfigDto;", "getUpsell_config", "()Lbonfire/proto/idl/accounts/v1/IsaTabBannerConfigDto;", "getUpsell_config$annotations", "Companion", "$serializer", "bonfire.proto.idl.rhuk_isa.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final float match_rate;
        private final MoneyDto maximum_reward_amount;
        private final String onboarding_lottie_cdn_asset_path_dark;
        private final String onboarding_lottie_cdn_asset_path_light;
        private final String promo_end_date;
        private final IsaTabBannerConfigDto upsell_config;

        public Surrogate() {
            this(0.0f, (MoneyDto) null, (String) null, (String) null, (String) null, (IsaTabBannerConfigDto) null, 63, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Float.compare(this.match_rate, surrogate.match_rate) == 0 && Intrinsics.areEqual(this.maximum_reward_amount, surrogate.maximum_reward_amount) && Intrinsics.areEqual(this.promo_end_date, surrogate.promo_end_date) && Intrinsics.areEqual(this.onboarding_lottie_cdn_asset_path_light, surrogate.onboarding_lottie_cdn_asset_path_light) && Intrinsics.areEqual(this.onboarding_lottie_cdn_asset_path_dark, surrogate.onboarding_lottie_cdn_asset_path_dark) && Intrinsics.areEqual(this.upsell_config, surrogate.upsell_config);
        }

        public int hashCode() {
            int iHashCode = Float.hashCode(this.match_rate) * 31;
            MoneyDto moneyDto = this.maximum_reward_amount;
            int iHashCode2 = (((((((iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31) + this.promo_end_date.hashCode()) * 31) + this.onboarding_lottie_cdn_asset_path_light.hashCode()) * 31) + this.onboarding_lottie_cdn_asset_path_dark.hashCode()) * 31;
            IsaTabBannerConfigDto isaTabBannerConfigDto = this.upsell_config;
            return iHashCode2 + (isaTabBannerConfigDto != null ? isaTabBannerConfigDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(match_rate=" + this.match_rate + ", maximum_reward_amount=" + this.maximum_reward_amount + ", promo_end_date=" + this.promo_end_date + ", onboarding_lottie_cdn_asset_path_light=" + this.onboarding_lottie_cdn_asset_path_light + ", onboarding_lottie_cdn_asset_path_dark=" + this.onboarding_lottie_cdn_asset_path_dark + ", upsell_config=" + this.upsell_config + ")";
        }

        /* compiled from: IsaBonusPromotionDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/IsaBonusPromotionDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/accounts/v1/IsaBonusPromotionDto$Surrogate;", "bonfire.proto.idl.rhuk_isa.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return IsaBonusPromotionDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, float f, MoneyDto moneyDto, String str, String str2, String str3, IsaTabBannerConfigDto isaTabBannerConfigDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.match_rate = (i & 1) == 0 ? 0.0f : f;
            if ((i & 2) == 0) {
                this.maximum_reward_amount = null;
            } else {
                this.maximum_reward_amount = moneyDto;
            }
            if ((i & 4) == 0) {
                this.promo_end_date = "";
            } else {
                this.promo_end_date = str;
            }
            if ((i & 8) == 0) {
                this.onboarding_lottie_cdn_asset_path_light = "";
            } else {
                this.onboarding_lottie_cdn_asset_path_light = str2;
            }
            if ((i & 16) == 0) {
                this.onboarding_lottie_cdn_asset_path_dark = "";
            } else {
                this.onboarding_lottie_cdn_asset_path_dark = str3;
            }
            if ((i & 32) == 0) {
                this.upsell_config = null;
            } else {
                this.upsell_config = isaTabBannerConfigDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_proto_idl_rhuk_isa_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (Float.compare(self.match_rate, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 0, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.match_rate));
            }
            MoneyDto moneyDto = self.maximum_reward_amount;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            if (!Intrinsics.areEqual(self.promo_end_date, "")) {
                output.encodeStringElement(serialDesc, 2, self.promo_end_date);
            }
            if (!Intrinsics.areEqual(self.onboarding_lottie_cdn_asset_path_light, "")) {
                output.encodeStringElement(serialDesc, 3, self.onboarding_lottie_cdn_asset_path_light);
            }
            if (!Intrinsics.areEqual(self.onboarding_lottie_cdn_asset_path_dark, "")) {
                output.encodeStringElement(serialDesc, 4, self.onboarding_lottie_cdn_asset_path_dark);
            }
            IsaTabBannerConfigDto isaTabBannerConfigDto = self.upsell_config;
            if (isaTabBannerConfigDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, IsaTabBannerConfigDto.Serializer.INSTANCE, isaTabBannerConfigDto);
            }
        }

        public Surrogate(float f, MoneyDto moneyDto, String promo_end_date, String onboarding_lottie_cdn_asset_path_light, String onboarding_lottie_cdn_asset_path_dark, IsaTabBannerConfigDto isaTabBannerConfigDto) {
            Intrinsics.checkNotNullParameter(promo_end_date, "promo_end_date");
            Intrinsics.checkNotNullParameter(onboarding_lottie_cdn_asset_path_light, "onboarding_lottie_cdn_asset_path_light");
            Intrinsics.checkNotNullParameter(onboarding_lottie_cdn_asset_path_dark, "onboarding_lottie_cdn_asset_path_dark");
            this.match_rate = f;
            this.maximum_reward_amount = moneyDto;
            this.promo_end_date = promo_end_date;
            this.onboarding_lottie_cdn_asset_path_light = onboarding_lottie_cdn_asset_path_light;
            this.onboarding_lottie_cdn_asset_path_dark = onboarding_lottie_cdn_asset_path_dark;
            this.upsell_config = isaTabBannerConfigDto;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(float r3, com.robinhood.rosetta.common.MoneyDto r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, bonfire.proto.idl.accounts.p028v1.IsaTabBannerConfigDto r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r2 = this;
                r10 = r9 & 1
                if (r10 == 0) goto L5
                r3 = 0
            L5:
                r10 = r9 & 2
                r0 = 0
                if (r10 == 0) goto Lb
                r4 = r0
            Lb:
                r10 = r9 & 4
                java.lang.String r1 = ""
                if (r10 == 0) goto L12
                r5 = r1
            L12:
                r10 = r9 & 8
                if (r10 == 0) goto L17
                r6 = r1
            L17:
                r10 = r9 & 16
                if (r10 == 0) goto L1c
                r7 = r1
            L1c:
                r9 = r9 & 32
                if (r9 == 0) goto L28
                r10 = r0
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                goto L2f
            L28:
                r10 = r8
                r9 = r7
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r4 = r2
            L2f:
                r4.<init>(r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bonfire.proto.idl.accounts.p028v1.IsaBonusPromotionDto.Surrogate.<init>(float, com.robinhood.rosetta.common.MoneyDto, java.lang.String, java.lang.String, java.lang.String, bonfire.proto.idl.accounts.v1.IsaTabBannerConfigDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final float getMatch_rate() {
            return this.match_rate;
        }

        public final MoneyDto getMaximum_reward_amount() {
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

        public final IsaTabBannerConfigDto getUpsell_config() {
            return this.upsell_config;
        }
    }

    /* compiled from: IsaBonusPromotionDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/IsaBonusPromotionDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/accounts/v1/IsaBonusPromotionDto;", "Lbonfire/proto/idl/accounts/v1/IsaBonusPromotion;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/accounts/v1/IsaBonusPromotionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.rhuk_isa.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<IsaBonusPromotionDto, IsaBonusPromotion> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<IsaBonusPromotionDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IsaBonusPromotionDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IsaBonusPromotionDto> getBinaryBase64Serializer() {
            return (KSerializer) IsaBonusPromotionDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<IsaBonusPromotion> getProtoAdapter() {
            return IsaBonusPromotion.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IsaBonusPromotionDto getZeroValue() {
            return IsaBonusPromotionDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IsaBonusPromotionDto fromProto(IsaBonusPromotion proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            float match_rate = proto.getMatch_rate();
            Money maximum_reward_amount = proto.getMaximum_reward_amount();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = maximum_reward_amount != null ? MoneyDto.INSTANCE.fromProto(maximum_reward_amount) : null;
            String promo_end_date = proto.getPromo_end_date();
            String onboarding_lottie_cdn_asset_path_light = proto.getOnboarding_lottie_cdn_asset_path_light();
            String onboarding_lottie_cdn_asset_path_dark = proto.getOnboarding_lottie_cdn_asset_path_dark();
            IsaTabBannerConfig upsell_config = proto.getUpsell_config();
            return new IsaBonusPromotionDto(new Surrogate(match_rate, moneyDtoFromProto, promo_end_date, onboarding_lottie_cdn_asset_path_light, onboarding_lottie_cdn_asset_path_dark, upsell_config != null ? IsaTabBannerConfigDto.INSTANCE.fromProto(upsell_config) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.accounts.v1.IsaBonusPromotionDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IsaBonusPromotionDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new IsaBonusPromotionDto(0.0f, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: IsaBonusPromotionDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/IsaBonusPromotionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/accounts/v1/IsaBonusPromotionDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/accounts/v1/IsaBonusPromotionDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.rhuk_isa.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<IsaBonusPromotionDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.accounts.v1.IsaBonusPromotion", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, IsaBonusPromotionDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public IsaBonusPromotionDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new IsaBonusPromotionDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: IsaBonusPromotionDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/IsaBonusPromotionDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.rhuk_isa.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.accounts.v1.IsaBonusPromotionDto";
        }
    }
}
