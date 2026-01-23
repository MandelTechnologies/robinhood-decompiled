package rh_server_driven_ui.p531v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FlagDto.kt */
@Metadata(m3635d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0003\bý\u0001\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u0088\u00022\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0004\u0088\u0002\u0089\u0002B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u0081\u0002\u001a\u00030\u0082\u00022\b\u0010\u0083\u0002\u001a\u00030\u0084\u00022\b\u0010\u0085\u0002\u001a\u00030\u0086\u0002H\u0016J\n\u0010\u0087\u0002\u001a\u00030\u0086\u0002H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001j\u0003\b\u0098\u0001j\u0003\b\u0099\u0001j\u0003\b\u009a\u0001j\u0003\b\u009b\u0001j\u0003\b\u009c\u0001j\u0003\b\u009d\u0001j\u0003\b\u009e\u0001j\u0003\b\u009f\u0001j\u0003\b \u0001j\u0003\b¡\u0001j\u0003\b¢\u0001j\u0003\b£\u0001j\u0003\b¤\u0001j\u0003\b¥\u0001j\u0003\b¦\u0001j\u0003\b§\u0001j\u0003\b¨\u0001j\u0003\b©\u0001j\u0003\bª\u0001j\u0003\b«\u0001j\u0003\b¬\u0001j\u0003\b\u00ad\u0001j\u0003\b®\u0001j\u0003\b¯\u0001j\u0003\b°\u0001j\u0003\b±\u0001j\u0003\b²\u0001j\u0003\b³\u0001j\u0003\b´\u0001j\u0003\bµ\u0001j\u0003\b¶\u0001j\u0003\b·\u0001j\u0003\b¸\u0001j\u0003\b¹\u0001j\u0003\bº\u0001j\u0003\b»\u0001j\u0003\b¼\u0001j\u0003\b½\u0001j\u0003\b¾\u0001j\u0003\b¿\u0001j\u0003\bÀ\u0001j\u0003\bÁ\u0001j\u0003\bÂ\u0001j\u0003\bÃ\u0001j\u0003\bÄ\u0001j\u0003\bÅ\u0001j\u0003\bÆ\u0001j\u0003\bÇ\u0001j\u0003\bÈ\u0001j\u0003\bÉ\u0001j\u0003\bÊ\u0001j\u0003\bË\u0001j\u0003\bÌ\u0001j\u0003\bÍ\u0001j\u0003\bÎ\u0001j\u0003\bÏ\u0001j\u0003\bÐ\u0001j\u0003\bÑ\u0001j\u0003\bÒ\u0001j\u0003\bÓ\u0001j\u0003\bÔ\u0001j\u0003\bÕ\u0001j\u0003\bÖ\u0001j\u0003\b×\u0001j\u0003\bØ\u0001j\u0003\bÙ\u0001j\u0003\bÚ\u0001j\u0003\bÛ\u0001j\u0003\bÜ\u0001j\u0003\bÝ\u0001j\u0003\bÞ\u0001j\u0003\bß\u0001j\u0003\bà\u0001j\u0003\bá\u0001j\u0003\bâ\u0001j\u0003\bã\u0001j\u0003\bä\u0001j\u0003\bå\u0001j\u0003\bæ\u0001j\u0003\bç\u0001j\u0003\bè\u0001j\u0003\bé\u0001j\u0003\bê\u0001j\u0003\bë\u0001j\u0003\bì\u0001j\u0003\bí\u0001j\u0003\bî\u0001j\u0003\bï\u0001j\u0003\bð\u0001j\u0003\bñ\u0001j\u0003\bò\u0001j\u0003\bó\u0001j\u0003\bô\u0001j\u0003\bõ\u0001j\u0003\bö\u0001j\u0003\b÷\u0001j\u0003\bø\u0001j\u0003\bù\u0001j\u0003\bú\u0001j\u0003\bû\u0001j\u0003\bü\u0001j\u0003\bý\u0001j\u0003\bþ\u0001j\u0003\bÿ\u0001j\u0003\b\u0080\u0002¨\u0006\u008a\u0002"}, m3636d2 = {"Lrh_server_driven_ui/v1/FlagDto;", "Lcom/robinhood/idl/EnumDto;", "Lrh_server_driven_ui/v1/Flag;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "FLAG_UNSPECIFIED", "FLAG_AD", "FLAG_AE", "FLAG_AF", "FLAG_AG", "FLAG_AI", "FLAG_AL", "FLAG_AM", "FLAG_AO", "FLAG_AQ", "FLAG_AR", "FLAG_AS", "FLAG_AT", "FLAG_AU", "FLAG_AW", "FLAG_AX", "FLAG_AZ", "FLAG_BA", "FLAG_BB", "FLAG_BD", "FLAG_BE", "FLAG_BF", "FLAG_BG", "FLAG_BH", "FLAG_BI", "FLAG_BJ", "FLAG_BL", "FLAG_BM", "FLAG_BN", "FLAG_BO", "FLAG_BR", "FLAG_BS", "FLAG_BT", "FLAG_BV", "FLAG_BW", "FLAG_BY", "FLAG_BZ", "FLAG_CA", "FLAG_CC", "FLAG_CD", "FLAG_CF", "FLAG_CG", "FLAG_CH", "FLAG_CI", "FLAG_CK", "FLAG_CL", "FLAG_CM", "FLAG_CN", "FLAG_CO", "FLAG_CR", "FLAG_CU", "FLAG_CV", "FLAG_CW", "FLAG_CX", "FLAG_CY", "FLAG_CZ", "FLAG_DE", "FLAG_DJ", "FLAG_DK", "FLAG_DM", "FLAG_DO", "FLAG_DZ", "FLAG_EC", "FLAG_EE", "FLAG_EG", "FLAG_EH", "FLAG_ER", "FLAG_ES", "FLAG_ET", "FLAG_EU", "FLAG_FI", "FLAG_FJ", "FLAG_FK", "FLAG_FM", "FLAG_FO", "FLAG_FR", "FLAG_GA", "FLAG_GB", "FLAG_GD", "FLAG_GE", "FLAG_GENERIC", "FLAG_GF", "FLAG_GG", "FLAG_GH", "FLAG_GI", "FLAG_GL", "FLAG_GM", "FLAG_GN", "FLAG_GP", "FLAG_GQ", "FLAG_GR", "FLAG_GS", "FLAG_GT", "FLAG_GU", "FLAG_GW", "FLAG_GY", "FLAG_HK", "FLAG_HM", "FLAG_HN", "FLAG_HR", "FLAG_HT", "FLAG_HU", "FLAG_ID", "FLAG_IE", "FLAG_IL", "FLAG_IM", "FLAG_IN", "FLAG_IO", "FLAG_IQ", "FLAG_IR", "FLAG_IS", "FLAG_IT", "FLAG_JE", "FLAG_JM", "FLAG_JO", "FLAG_JP", "FLAG_KE", "FLAG_KG", "FLAG_KH", "FLAG_KI", "FLAG_KM", "FLAG_KN", "FLAG_KP", "FLAG_KR", "FLAG_KW", "FLAG_KY", "FLAG_KZ", "FLAG_LA", "FLAG_LB", "FLAG_LC", "FLAG_LI", "FLAG_LK", "FLAG_LR", "FLAG_LS", "FLAG_LT", "FLAG_LU", "FLAG_LV", "FLAG_LY", "FLAG_MA", "FLAG_MC", "FLAG_MD", "FLAG_ME", "FLAG_MF", "FLAG_MG", "FLAG_MH", "FLAG_MK", "FLAG_ML", "FLAG_MM", "FLAG_MN", "FLAG_MO", "FLAG_MP", "FLAG_MQ", "FLAG_MR", "FLAG_MS", "FLAG_MT", "FLAG_MU", "FLAG_MV", "FLAG_MW", "FLAG_MX", "FLAG_MY", "FLAG_MZ", "FLAG_NA", "FLAG_NC", "FLAG_NE", "FLAG_NF", "FLAG_NG", "FLAG_NI", "FLAG_NL", "FLAG_NO", "FLAG_NP", "FLAG_NR", "FLAG_NU", "FLAG_NZ", "FLAG_OM", "FLAG_PA", "FLAG_PE", "FLAG_PF", "FLAG_PG", "FLAG_PH", "FLAG_PK", "FLAG_PL", "FLAG_PM", "FLAG_PN", "FLAG_PR", "FLAG_PS", "FLAG_PT", "FLAG_PW", "FLAG_PY", "FLAG_QA", "FLAG_RE", "FLAG_RO", "FLAG_RS", "FLAG_RU", "FLAG_RW", "FLAG_SA", "FLAG_SB", "FLAG_SC", "FLAG_SD", "FLAG_SE", "FLAG_SG", "FLAG_SH", "FLAG_SI", "FLAG_SJ", "FLAG_SK", "FLAG_SL", "FLAG_SM", "FLAG_SN", "FLAG_SO", "FLAG_SR", "FLAG_ST", "FLAG_SV", "FLAG_SX", "FLAG_SY", "FLAG_SZ", "FLAG_TC", "FLAG_TD", "FLAG_TF", "FLAG_TG", "FLAG_TH", "FLAG_TJ", "FLAG_TK", "FLAG_TL", "FLAG_TM", "FLAG_TN", "FLAG_TO", "FLAG_TR", "FLAG_TT", "FLAG_TV", "FLAG_TW", "FLAG_TZ", "FLAG_UA", "FLAG_UG", "FLAG_UM", "FLAG_US", "FLAG_UY", "FLAG_UZ", "FLAG_VA", "FLAG_VC", "FLAG_VE", "FLAG_VG", "FLAG_VI", "FLAG_VN", "FLAG_VU", "FLAG_WF", "FLAG_WS", "FLAG_YE", "FLAG_YT", "FLAG_ZA", "FLAG_ZM", "FLAG_ZW", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public abstract class FlagDto implements Dto2<Flag>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FlagDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<FlagDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FlagDto, Flag>> binaryBase64Serializer$delegate;
    public static final FlagDto FLAG_UNSPECIFIED = new FlagDto("FLAG_UNSPECIFIED", 0) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_UNSPECIFIED;
        }
    };
    public static final FlagDto FLAG_AD = new FlagDto("FLAG_AD", 1) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_AD
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_AD;
        }
    };
    public static final FlagDto FLAG_AE = new FlagDto("FLAG_AE", 2) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_AE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_AE;
        }
    };
    public static final FlagDto FLAG_AF = new FlagDto("FLAG_AF", 3) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_AF
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_AF;
        }
    };
    public static final FlagDto FLAG_AG = new FlagDto("FLAG_AG", 4) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_AG
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_AG;
        }
    };
    public static final FlagDto FLAG_AI = new FlagDto("FLAG_AI", 5) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_AI
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_AI;
        }
    };
    public static final FlagDto FLAG_AL = new FlagDto("FLAG_AL", 6) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_AL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_AL;
        }
    };
    public static final FlagDto FLAG_AM = new FlagDto("FLAG_AM", 7) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_AM
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_AM;
        }
    };
    public static final FlagDto FLAG_AO = new FlagDto("FLAG_AO", 8) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_AO
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_AO;
        }
    };
    public static final FlagDto FLAG_AQ = new FlagDto("FLAG_AQ", 9) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_AQ
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_AQ;
        }
    };
    public static final FlagDto FLAG_AR = new FlagDto("FLAG_AR", 10) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_AR
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_AR;
        }
    };
    public static final FlagDto FLAG_AS = new FlagDto("FLAG_AS", 11) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_AS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_AS;
        }
    };
    public static final FlagDto FLAG_AT = new FlagDto("FLAG_AT", 12) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_AT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_AT;
        }
    };
    public static final FlagDto FLAG_AU = new FlagDto("FLAG_AU", 13) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_AU
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_AU;
        }
    };
    public static final FlagDto FLAG_AW = new FlagDto("FLAG_AW", 14) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_AW
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_AW;
        }
    };
    public static final FlagDto FLAG_AX = new FlagDto("FLAG_AX", 15) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_AX
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_AX;
        }
    };
    public static final FlagDto FLAG_AZ = new FlagDto("FLAG_AZ", 16) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_AZ
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_AZ;
        }
    };
    public static final FlagDto FLAG_BA = new FlagDto("FLAG_BA", 17) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_BA
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_BA;
        }
    };
    public static final FlagDto FLAG_BB = new FlagDto("FLAG_BB", 18) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_BB
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_BB;
        }
    };
    public static final FlagDto FLAG_BD = new FlagDto("FLAG_BD", 19) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_BD
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_BD;
        }
    };
    public static final FlagDto FLAG_BE = new FlagDto("FLAG_BE", 20) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_BE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_BE;
        }
    };
    public static final FlagDto FLAG_BF = new FlagDto("FLAG_BF", 21) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_BF
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_BF;
        }
    };
    public static final FlagDto FLAG_BG = new FlagDto("FLAG_BG", 22) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_BG
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_BG;
        }
    };
    public static final FlagDto FLAG_BH = new FlagDto("FLAG_BH", 23) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_BH
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_BH;
        }
    };
    public static final FlagDto FLAG_BI = new FlagDto("FLAG_BI", 24) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_BI
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_BI;
        }
    };
    public static final FlagDto FLAG_BJ = new FlagDto("FLAG_BJ", 25) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_BJ
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_BJ;
        }
    };
    public static final FlagDto FLAG_BL = new FlagDto("FLAG_BL", 26) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_BL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_BL;
        }
    };
    public static final FlagDto FLAG_BM = new FlagDto("FLAG_BM", 27) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_BM
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_BM;
        }
    };
    public static final FlagDto FLAG_BN = new FlagDto("FLAG_BN", 28) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_BN
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_BN;
        }
    };
    public static final FlagDto FLAG_BO = new FlagDto("FLAG_BO", 29) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_BO
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_BO;
        }
    };
    public static final FlagDto FLAG_BR = new FlagDto("FLAG_BR", 30) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_BR
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_BR;
        }
    };
    public static final FlagDto FLAG_BS = new FlagDto("FLAG_BS", 31) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_BS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_BS;
        }
    };
    public static final FlagDto FLAG_BT = new FlagDto("FLAG_BT", 32) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_BT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_BT;
        }
    };
    public static final FlagDto FLAG_BV = new FlagDto("FLAG_BV", 33) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_BV
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_BV;
        }
    };
    public static final FlagDto FLAG_BW = new FlagDto("FLAG_BW", 34) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_BW
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_BW;
        }
    };
    public static final FlagDto FLAG_BY = new FlagDto("FLAG_BY", 35) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_BY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_BY;
        }
    };
    public static final FlagDto FLAG_BZ = new FlagDto("FLAG_BZ", 36) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_BZ
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_BZ;
        }
    };
    public static final FlagDto FLAG_CA = new FlagDto("FLAG_CA", 37) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_CA
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_CA;
        }
    };
    public static final FlagDto FLAG_CC = new FlagDto("FLAG_CC", 38) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_CC
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_CC;
        }
    };
    public static final FlagDto FLAG_CD = new FlagDto("FLAG_CD", 39) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_CD
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_CD;
        }
    };
    public static final FlagDto FLAG_CF = new FlagDto("FLAG_CF", 40) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_CF
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_CF;
        }
    };
    public static final FlagDto FLAG_CG = new FlagDto("FLAG_CG", 41) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_CG
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_CG;
        }
    };
    public static final FlagDto FLAG_CH = new FlagDto("FLAG_CH", 42) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_CH
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_CH;
        }
    };
    public static final FlagDto FLAG_CI = new FlagDto("FLAG_CI", 43) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_CI
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_CI;
        }
    };
    public static final FlagDto FLAG_CK = new FlagDto("FLAG_CK", 44) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_CK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_CK;
        }
    };
    public static final FlagDto FLAG_CL = new FlagDto("FLAG_CL", 45) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_CL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_CL;
        }
    };
    public static final FlagDto FLAG_CM = new FlagDto("FLAG_CM", 46) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_CM
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_CM;
        }
    };
    public static final FlagDto FLAG_CN = new FlagDto("FLAG_CN", 47) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_CN
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_CN;
        }
    };
    public static final FlagDto FLAG_CO = new FlagDto("FLAG_CO", 48) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_CO
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_CO;
        }
    };
    public static final FlagDto FLAG_CR = new FlagDto("FLAG_CR", 49) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_CR
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_CR;
        }
    };
    public static final FlagDto FLAG_CU = new FlagDto("FLAG_CU", 50) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_CU
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_CU;
        }
    };
    public static final FlagDto FLAG_CV = new FlagDto("FLAG_CV", 51) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_CV
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_CV;
        }
    };
    public static final FlagDto FLAG_CW = new FlagDto("FLAG_CW", 52) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_CW
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_CW;
        }
    };
    public static final FlagDto FLAG_CX = new FlagDto("FLAG_CX", 53) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_CX
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_CX;
        }
    };
    public static final FlagDto FLAG_CY = new FlagDto("FLAG_CY", 54) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_CY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_CY;
        }
    };
    public static final FlagDto FLAG_CZ = new FlagDto("FLAG_CZ", 55) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_CZ
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_CZ;
        }
    };
    public static final FlagDto FLAG_DE = new FlagDto("FLAG_DE", 56) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_DE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_DE;
        }
    };
    public static final FlagDto FLAG_DJ = new FlagDto("FLAG_DJ", 57) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_DJ
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_DJ;
        }
    };
    public static final FlagDto FLAG_DK = new FlagDto("FLAG_DK", 58) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_DK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_DK;
        }
    };
    public static final FlagDto FLAG_DM = new FlagDto("FLAG_DM", 59) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_DM
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_DM;
        }
    };
    public static final FlagDto FLAG_DO = new FlagDto("FLAG_DO", 60) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_DO
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_DO;
        }
    };
    public static final FlagDto FLAG_DZ = new FlagDto("FLAG_DZ", 61) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_DZ
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_DZ;
        }
    };
    public static final FlagDto FLAG_EC = new FlagDto("FLAG_EC", 62) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_EC
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_EC;
        }
    };
    public static final FlagDto FLAG_EE = new FlagDto("FLAG_EE", 63) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_EE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_EE;
        }
    };
    public static final FlagDto FLAG_EG = new FlagDto("FLAG_EG", 64) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_EG
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_EG;
        }
    };
    public static final FlagDto FLAG_EH = new FlagDto("FLAG_EH", 65) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_EH
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_EH;
        }
    };
    public static final FlagDto FLAG_ER = new FlagDto("FLAG_ER", 66) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_ER
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_ER;
        }
    };
    public static final FlagDto FLAG_ES = new FlagDto("FLAG_ES", 67) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_ES
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_ES;
        }
    };
    public static final FlagDto FLAG_ET = new FlagDto("FLAG_ET", 68) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_ET
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_ET;
        }
    };
    public static final FlagDto FLAG_EU = new FlagDto("FLAG_EU", 69) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_EU
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_EU;
        }
    };
    public static final FlagDto FLAG_FI = new FlagDto("FLAG_FI", 70) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_FI
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_FI;
        }
    };
    public static final FlagDto FLAG_FJ = new FlagDto("FLAG_FJ", 71) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_FJ
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_FJ;
        }
    };
    public static final FlagDto FLAG_FK = new FlagDto("FLAG_FK", 72) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_FK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_FK;
        }
    };
    public static final FlagDto FLAG_FM = new FlagDto("FLAG_FM", 73) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_FM
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_FM;
        }
    };
    public static final FlagDto FLAG_FO = new FlagDto("FLAG_FO", 74) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_FO
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_FO;
        }
    };
    public static final FlagDto FLAG_FR = new FlagDto("FLAG_FR", 75) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_FR
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_FR;
        }
    };
    public static final FlagDto FLAG_GA = new FlagDto("FLAG_GA", 76) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_GA
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_GA;
        }
    };
    public static final FlagDto FLAG_GB = new FlagDto("FLAG_GB", 77) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_GB
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_GB;
        }
    };
    public static final FlagDto FLAG_GD = new FlagDto("FLAG_GD", 78) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_GD
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_GD;
        }
    };
    public static final FlagDto FLAG_GE = new FlagDto("FLAG_GE", 79) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_GE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_GE;
        }
    };
    public static final FlagDto FLAG_GENERIC = new FlagDto("FLAG_GENERIC", 80) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_GENERIC
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_GENERIC;
        }
    };
    public static final FlagDto FLAG_GF = new FlagDto("FLAG_GF", 81) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_GF
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_GF;
        }
    };
    public static final FlagDto FLAG_GG = new FlagDto("FLAG_GG", 82) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_GG
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_GG;
        }
    };
    public static final FlagDto FLAG_GH = new FlagDto("FLAG_GH", 83) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_GH
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_GH;
        }
    };
    public static final FlagDto FLAG_GI = new FlagDto("FLAG_GI", 84) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_GI
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_GI;
        }
    };
    public static final FlagDto FLAG_GL = new FlagDto("FLAG_GL", 85) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_GL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_GL;
        }
    };
    public static final FlagDto FLAG_GM = new FlagDto("FLAG_GM", 86) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_GM
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_GM;
        }
    };
    public static final FlagDto FLAG_GN = new FlagDto("FLAG_GN", 87) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_GN
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_GN;
        }
    };
    public static final FlagDto FLAG_GP = new FlagDto("FLAG_GP", 88) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_GP
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_GP;
        }
    };
    public static final FlagDto FLAG_GQ = new FlagDto("FLAG_GQ", 89) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_GQ
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_GQ;
        }
    };
    public static final FlagDto FLAG_GR = new FlagDto("FLAG_GR", 90) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_GR
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_GR;
        }
    };
    public static final FlagDto FLAG_GS = new FlagDto("FLAG_GS", 91) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_GS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_GS;
        }
    };
    public static final FlagDto FLAG_GT = new FlagDto("FLAG_GT", 92) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_GT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_GT;
        }
    };
    public static final FlagDto FLAG_GU = new FlagDto("FLAG_GU", 93) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_GU
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_GU;
        }
    };
    public static final FlagDto FLAG_GW = new FlagDto("FLAG_GW", 94) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_GW
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_GW;
        }
    };
    public static final FlagDto FLAG_GY = new FlagDto("FLAG_GY", 95) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_GY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_GY;
        }
    };
    public static final FlagDto FLAG_HK = new FlagDto("FLAG_HK", 96) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_HK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_HK;
        }
    };
    public static final FlagDto FLAG_HM = new FlagDto("FLAG_HM", 97) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_HM
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_HM;
        }
    };
    public static final FlagDto FLAG_HN = new FlagDto("FLAG_HN", 98) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_HN
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_HN;
        }
    };
    public static final FlagDto FLAG_HR = new FlagDto("FLAG_HR", 99) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_HR
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_HR;
        }
    };
    public static final FlagDto FLAG_HT = new FlagDto("FLAG_HT", 100) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_HT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_HT;
        }
    };
    public static final FlagDto FLAG_HU = new FlagDto("FLAG_HU", 101) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_HU
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_HU;
        }
    };
    public static final FlagDto FLAG_ID = new FlagDto("FLAG_ID", 102) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_ID
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_ID;
        }
    };
    public static final FlagDto FLAG_IE = new FlagDto("FLAG_IE", 103) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_IE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_IE;
        }
    };
    public static final FlagDto FLAG_IL = new FlagDto("FLAG_IL", 104) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_IL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_IL;
        }
    };
    public static final FlagDto FLAG_IM = new FlagDto("FLAG_IM", 105) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_IM
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_IM;
        }
    };
    public static final FlagDto FLAG_IN = new FlagDto("FLAG_IN", 106) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_IN
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_IN;
        }
    };
    public static final FlagDto FLAG_IO = new FlagDto("FLAG_IO", 107) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_IO
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_IO;
        }
    };
    public static final FlagDto FLAG_IQ = new FlagDto("FLAG_IQ", 108) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_IQ
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_IQ;
        }
    };
    public static final FlagDto FLAG_IR = new FlagDto("FLAG_IR", 109) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_IR
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_IR;
        }
    };
    public static final FlagDto FLAG_IS = new FlagDto("FLAG_IS", 110) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_IS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_IS;
        }
    };
    public static final FlagDto FLAG_IT = new FlagDto("FLAG_IT", 111) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_IT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_IT;
        }
    };
    public static final FlagDto FLAG_JE = new FlagDto("FLAG_JE", 112) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_JE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_JE;
        }
    };
    public static final FlagDto FLAG_JM = new FlagDto("FLAG_JM", 113) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_JM
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_JM;
        }
    };
    public static final FlagDto FLAG_JO = new FlagDto("FLAG_JO", 114) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_JO
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_JO;
        }
    };
    public static final FlagDto FLAG_JP = new FlagDto("FLAG_JP", 115) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_JP
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_JP;
        }
    };
    public static final FlagDto FLAG_KE = new FlagDto("FLAG_KE", 116) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_KE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_KE;
        }
    };
    public static final FlagDto FLAG_KG = new FlagDto("FLAG_KG", 117) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_KG
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_KG;
        }
    };
    public static final FlagDto FLAG_KH = new FlagDto("FLAG_KH", 118) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_KH
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_KH;
        }
    };
    public static final FlagDto FLAG_KI = new FlagDto("FLAG_KI", 119) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_KI
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_KI;
        }
    };
    public static final FlagDto FLAG_KM = new FlagDto("FLAG_KM", 120) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_KM
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_KM;
        }
    };
    public static final FlagDto FLAG_KN = new FlagDto("FLAG_KN", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_KN
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_KN;
        }
    };
    public static final FlagDto FLAG_KP = new FlagDto("FLAG_KP", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_KP
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_KP;
        }
    };
    public static final FlagDto FLAG_KR = new FlagDto("FLAG_KR", 123) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_KR
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_KR;
        }
    };
    public static final FlagDto FLAG_KW = new FlagDto("FLAG_KW", EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_KW
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_KW;
        }
    };
    public static final FlagDto FLAG_KY = new FlagDto("FLAG_KY", 125) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_KY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_KY;
        }
    };
    public static final FlagDto FLAG_KZ = new FlagDto("FLAG_KZ", EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_KZ
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_KZ;
        }
    };
    public static final FlagDto FLAG_LA = new FlagDto("FLAG_LA", EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_LA
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_LA;
        }
    };
    public static final FlagDto FLAG_LB = new FlagDto("FLAG_LB", 128) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_LB
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_LB;
        }
    };
    public static final FlagDto FLAG_LC = new FlagDto("FLAG_LC", EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_LC
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_LC;
        }
    };
    public static final FlagDto FLAG_LI = new FlagDto("FLAG_LI", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_LI
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_LI;
        }
    };
    public static final FlagDto FLAG_LK = new FlagDto("FLAG_LK", 131) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_LK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_LK;
        }
    };
    public static final FlagDto FLAG_LR = new FlagDto("FLAG_LR", EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_LR
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_LR;
        }
    };
    public static final FlagDto FLAG_LS = new FlagDto("FLAG_LS", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_LS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_LS;
        }
    };
    public static final FlagDto FLAG_LT = new FlagDto("FLAG_LT", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_LT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_LT;
        }
    };
    public static final FlagDto FLAG_LU = new FlagDto("FLAG_LU", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_LU
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_LU;
        }
    };
    public static final FlagDto FLAG_LV = new FlagDto("FLAG_LV", 136) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_LV
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_LV;
        }
    };
    public static final FlagDto FLAG_LY = new FlagDto("FLAG_LY", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_LY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_LY;
        }
    };
    public static final FlagDto FLAG_MA = new FlagDto("FLAG_MA", EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_MA
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_MA;
        }
    };
    public static final FlagDto FLAG_MC = new FlagDto("FLAG_MC", EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_MC
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_MC;
        }
    };
    public static final FlagDto FLAG_MD = new FlagDto("FLAG_MD", EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_MD
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_MD;
        }
    };
    public static final FlagDto FLAG_ME = new FlagDto("FLAG_ME", EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_ME
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_ME;
        }
    };
    public static final FlagDto FLAG_MF = new FlagDto("FLAG_MF", EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_MF
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_MF;
        }
    };
    public static final FlagDto FLAG_MG = new FlagDto("FLAG_MG", EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_MG
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_MG;
        }
    };
    public static final FlagDto FLAG_MH = new FlagDto("FLAG_MH", 144) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_MH
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_MH;
        }
    };
    public static final FlagDto FLAG_MK = new FlagDto("FLAG_MK", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_MK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_MK;
        }
    };
    public static final FlagDto FLAG_ML = new FlagDto("FLAG_ML", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_ML
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_ML;
        }
    };
    public static final FlagDto FLAG_MM = new FlagDto("FLAG_MM", 147) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_MM
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_MM;
        }
    };
    public static final FlagDto FLAG_MN = new FlagDto("FLAG_MN", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_MN
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_MN;
        }
    };
    public static final FlagDto FLAG_MO = new FlagDto("FLAG_MO", EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_MO
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_MO;
        }
    };
    public static final FlagDto FLAG_MP = new FlagDto("FLAG_MP", 150) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_MP
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_MP;
        }
    };
    public static final FlagDto FLAG_MQ = new FlagDto("FLAG_MQ", 151) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_MQ
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_MQ;
        }
    };
    public static final FlagDto FLAG_MR = new FlagDto("FLAG_MR", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_MR
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_MR;
        }
    };
    public static final FlagDto FLAG_MS = new FlagDto("FLAG_MS", EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_MS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_MS;
        }
    };
    public static final FlagDto FLAG_MT = new FlagDto("FLAG_MT", EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_MT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_MT;
        }
    };
    public static final FlagDto FLAG_MU = new FlagDto("FLAG_MU", 155) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_MU
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_MU;
        }
    };
    public static final FlagDto FLAG_MV = new FlagDto("FLAG_MV", 156) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_MV
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_MV;
        }
    };
    public static final FlagDto FLAG_MW = new FlagDto("FLAG_MW", EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_MW
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_MW;
        }
    };
    public static final FlagDto FLAG_MX = new FlagDto("FLAG_MX", EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_MX
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_MX;
        }
    };
    public static final FlagDto FLAG_MY = new FlagDto("FLAG_MY", EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_MY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_MY;
        }
    };
    public static final FlagDto FLAG_MZ = new FlagDto("FLAG_MZ", EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_MZ
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_MZ;
        }
    };
    public static final FlagDto FLAG_NA = new FlagDto("FLAG_NA", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_NA
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_NA;
        }
    };
    public static final FlagDto FLAG_NC = new FlagDto("FLAG_NC", EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_NC
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_NC;
        }
    };
    public static final FlagDto FLAG_NE = new FlagDto("FLAG_NE", EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_NE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_NE;
        }
    };
    public static final FlagDto FLAG_NF = new FlagDto("FLAG_NF", EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_NF
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_NF;
        }
    };
    public static final FlagDto FLAG_NG = new FlagDto("FLAG_NG", 165) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_NG
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_NG;
        }
    };
    public static final FlagDto FLAG_NI = new FlagDto("FLAG_NI", EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_NI
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_NI;
        }
    };
    public static final FlagDto FLAG_NL = new FlagDto("FLAG_NL", 167) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_NL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_NL;
        }
    };
    public static final FlagDto FLAG_NO = new FlagDto("FLAG_NO", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_NO
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_NO;
        }
    };
    public static final FlagDto FLAG_NP = new FlagDto("FLAG_NP", EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_NP
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_NP;
        }
    };
    public static final FlagDto FLAG_NR = new FlagDto("FLAG_NR", EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_NR
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_NR;
        }
    };
    public static final FlagDto FLAG_NU = new FlagDto("FLAG_NU", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_NU
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_NU;
        }
    };
    public static final FlagDto FLAG_NZ = new FlagDto("FLAG_NZ", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_NZ
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_NZ;
        }
    };
    public static final FlagDto FLAG_OM = new FlagDto("FLAG_OM", EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_OM
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_OM;
        }
    };
    public static final FlagDto FLAG_PA = new FlagDto("FLAG_PA", EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_PA
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_PA;
        }
    };
    public static final FlagDto FLAG_PE = new FlagDto("FLAG_PE", EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_PE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_PE;
        }
    };
    public static final FlagDto FLAG_PF = new FlagDto("FLAG_PF", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_PF
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_PF;
        }
    };
    public static final FlagDto FLAG_PG = new FlagDto("FLAG_PG", EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_PG
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_PG;
        }
    };
    public static final FlagDto FLAG_PH = new FlagDto("FLAG_PH", EnumC7081g.f2773x8d9721ad) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_PH
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_PH;
        }
    };
    public static final FlagDto FLAG_PK = new FlagDto("FLAG_PK", EnumC7081g.f2780x600b66fe) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_PK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_PK;
        }
    };
    public static final FlagDto FLAG_PL = new FlagDto("FLAG_PL", EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_PL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_PL;
        }
    };
    public static final FlagDto FLAG_PM = new FlagDto("FLAG_PM", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_PM
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_PM;
        }
    };
    public static final FlagDto FLAG_PN = new FlagDto("FLAG_PN", 182) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_PN
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_PN;
        }
    };
    public static final FlagDto FLAG_PR = new FlagDto("FLAG_PR", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_PR
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_PR;
        }
    };
    public static final FlagDto FLAG_PS = new FlagDto("FLAG_PS", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_PS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_PS;
        }
    };
    public static final FlagDto FLAG_PT = new FlagDto("FLAG_PT", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_PT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_PT;
        }
    };
    public static final FlagDto FLAG_PW = new FlagDto("FLAG_PW", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_PW
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_PW;
        }
    };
    public static final FlagDto FLAG_PY = new FlagDto("FLAG_PY", EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_PY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_PY;
        }
    };
    public static final FlagDto FLAG_QA = new FlagDto("FLAG_QA", 188) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_QA
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_QA;
        }
    };
    public static final FlagDto FLAG_RE = new FlagDto("FLAG_RE", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_RE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_RE;
        }
    };
    public static final FlagDto FLAG_RO = new FlagDto("FLAG_RO", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_RO
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_RO;
        }
    };
    public static final FlagDto FLAG_RS = new FlagDto("FLAG_RS", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_RS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_RS;
        }
    };
    public static final FlagDto FLAG_RU = new FlagDto("FLAG_RU", 192) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_RU
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_RU;
        }
    };
    public static final FlagDto FLAG_RW = new FlagDto("FLAG_RW", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_RW
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_RW;
        }
    };
    public static final FlagDto FLAG_SA = new FlagDto("FLAG_SA", EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_SA
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_SA;
        }
    };
    public static final FlagDto FLAG_SB = new FlagDto("FLAG_SB", EnumC7081g.SDK_ASSET_ICON_ALERT_WARNING_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_SB
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_SB;
        }
    };
    public static final FlagDto FLAG_SC = new FlagDto("FLAG_SC", EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_SC
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_SC;
        }
    };
    public static final FlagDto FLAG_SD = new FlagDto("FLAG_SD", EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_SD
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_SD;
        }
    };
    public static final FlagDto FLAG_SE = new FlagDto("FLAG_SE", EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_SE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_SE;
        }
    };
    public static final FlagDto FLAG_SG = new FlagDto("FLAG_SG", EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_SG
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_SG;
        }
    };
    public static final FlagDto FLAG_SH = new FlagDto("FLAG_SH", 200) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_SH
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_SH;
        }
    };
    public static final FlagDto FLAG_SI = new FlagDto("FLAG_SI", 201) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_SI
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_SI;
        }
    };
    public static final FlagDto FLAG_SJ = new FlagDto("FLAG_SJ", 202) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_SJ
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_SJ;
        }
    };
    public static final FlagDto FLAG_SK = new FlagDto("FLAG_SK", EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_SK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_SK;
        }
    };
    public static final FlagDto FLAG_SL = new FlagDto("FLAG_SL", 204) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_SL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_SL;
        }
    };
    public static final FlagDto FLAG_SM = new FlagDto("FLAG_SM", EnumC7081g.SDK_ASSET_ICON_CLIPBOARD_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_SM
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_SM;
        }
    };
    public static final FlagDto FLAG_SN = new FlagDto("FLAG_SN", EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_SN
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_SN;
        }
    };
    public static final FlagDto FLAG_SO = new FlagDto("FLAG_SO", EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_SO
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_SO;
        }
    };
    public static final FlagDto FLAG_SR = new FlagDto("FLAG_SR", EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_SR
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_SR;
        }
    };
    public static final FlagDto FLAG_ST = new FlagDto("FLAG_ST", EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_ST
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_ST;
        }
    };
    public static final FlagDto FLAG_SV = new FlagDto("FLAG_SV", EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_SV
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_SV;
        }
    };
    public static final FlagDto FLAG_SX = new FlagDto("FLAG_SX", 211) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_SX
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_SX;
        }
    };
    public static final FlagDto FLAG_SY = new FlagDto("FLAG_SY", EnumC7081g.SDK_ASSET_ICON_OVERRIDE_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_SY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_SY;
        }
    };
    public static final FlagDto FLAG_SZ = new FlagDto("FLAG_SZ", EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_SZ
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_SZ;
        }
    };
    public static final FlagDto FLAG_TC = new FlagDto("FLAG_TC", EnumC7081g.SDK_ASSET_ICON_PIN_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_TC
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_TC;
        }
    };
    public static final FlagDto FLAG_TD = new FlagDto("FLAG_TD", EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_TD
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_TD;
        }
    };
    public static final FlagDto FLAG_TF = new FlagDto("FLAG_TF", EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_TF
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_TF;
        }
    };
    public static final FlagDto FLAG_TG = new FlagDto("FLAG_TG", EnumC7081g.SDK_ASSET_ICON_PROGRESS_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_TG
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_TG;
        }
    };
    public static final FlagDto FLAG_TH = new FlagDto("FLAG_TH", EnumC7081g.SDK_ASSET_ICON_QUESTION_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_TH
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_TH;
        }
    };
    public static final FlagDto FLAG_TJ = new FlagDto("FLAG_TJ", EnumC7081g.SDK_ASSET_ICON_REJECTED_REC_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_TJ
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_TJ;
        }
    };
    public static final FlagDto FLAG_TK = new FlagDto("FLAG_TK", EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_TK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_TK;
        }
    };
    public static final FlagDto FLAG_TL = new FlagDto("FLAG_TL", EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_TL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_TL;
        }
    };
    public static final FlagDto FLAG_TM = new FlagDto("FLAG_TM", EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_TM
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_TM;
        }
    };
    public static final FlagDto FLAG_TN = new FlagDto("FLAG_TN", EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_TN
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_TN;
        }
    };
    public static final FlagDto FLAG_TO = new FlagDto("FLAG_TO", 224) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_TO
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_TO;
        }
    };
    public static final FlagDto FLAG_TR = new FlagDto("FLAG_TR", 225) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_TR
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_TR;
        }
    };
    public static final FlagDto FLAG_TT = new FlagDto("FLAG_TT", EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_TT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_TT;
        }
    };
    public static final FlagDto FLAG_TV = new FlagDto("FLAG_TV", EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_TV
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_TV;
        }
    };
    public static final FlagDto FLAG_TW = new FlagDto("FLAG_TW", EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_TW
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_TW;
        }
    };
    public static final FlagDto FLAG_TZ = new FlagDto("FLAG_TZ", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_TZ
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_TZ;
        }
    };
    public static final FlagDto FLAG_UA = new FlagDto("FLAG_UA", EnumC7081g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_UA
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_UA;
        }
    };
    public static final FlagDto FLAG_UG = new FlagDto("FLAG_UG", EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_UG
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_UG;
        }
    };
    public static final FlagDto FLAG_UM = new FlagDto("FLAG_UM", EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_UM
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_UM;
        }
    };
    public static final FlagDto FLAG_US = new FlagDto("FLAG_US", EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_US
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_US;
        }
    };
    public static final FlagDto FLAG_UY = new FlagDto("FLAG_UY", EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_UY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_UY;
        }
    };
    public static final FlagDto FLAG_UZ = new FlagDto("FLAG_UZ", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_UZ
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_UZ;
        }
    };
    public static final FlagDto FLAG_VA = new FlagDto("FLAG_VA", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_VA
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_VA;
        }
    };
    public static final FlagDto FLAG_VC = new FlagDto("FLAG_VC", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_VC
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_VC;
        }
    };
    public static final FlagDto FLAG_VE = new FlagDto("FLAG_VE", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_VE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_VE;
        }
    };
    public static final FlagDto FLAG_VG = new FlagDto("FLAG_VG", 239) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_VG
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_VG;
        }
    };
    public static final FlagDto FLAG_VI = new FlagDto("FLAG_VI", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_VI
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_VI;
        }
    };
    public static final FlagDto FLAG_VN = new FlagDto("FLAG_VN", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_VN
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_VN;
        }
    };
    public static final FlagDto FLAG_VU = new FlagDto("FLAG_VU", EnumC7081g.f2778x3356acf6) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_VU
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_VU;
        }
    };
    public static final FlagDto FLAG_WF = new FlagDto("FLAG_WF", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_WF
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_WF;
        }
    };
    public static final FlagDto FLAG_WS = new FlagDto("FLAG_WS", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_WS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_WS;
        }
    };
    public static final FlagDto FLAG_YE = new FlagDto("FLAG_YE", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_YE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_YE;
        }
    };
    public static final FlagDto FLAG_YT = new FlagDto("FLAG_YT", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_YT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_YT;
        }
    };
    public static final FlagDto FLAG_ZA = new FlagDto("FLAG_ZA", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_ZA
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_ZA;
        }
    };
    public static final FlagDto FLAG_ZM = new FlagDto("FLAG_ZM", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_ZM
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_ZM;
        }
    };
    public static final FlagDto FLAG_ZW = new FlagDto("FLAG_ZW", EnumC7081g.f2779x59907a3d) { // from class: rh_server_driven_ui.v1.FlagDto.FLAG_ZW
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Flag toProto() {
            return Flag.FLAG_ZW;
        }
    };

    private static final /* synthetic */ FlagDto[] $values() {
        return new FlagDto[]{FLAG_UNSPECIFIED, FLAG_AD, FLAG_AE, FLAG_AF, FLAG_AG, FLAG_AI, FLAG_AL, FLAG_AM, FLAG_AO, FLAG_AQ, FLAG_AR, FLAG_AS, FLAG_AT, FLAG_AU, FLAG_AW, FLAG_AX, FLAG_AZ, FLAG_BA, FLAG_BB, FLAG_BD, FLAG_BE, FLAG_BF, FLAG_BG, FLAG_BH, FLAG_BI, FLAG_BJ, FLAG_BL, FLAG_BM, FLAG_BN, FLAG_BO, FLAG_BR, FLAG_BS, FLAG_BT, FLAG_BV, FLAG_BW, FLAG_BY, FLAG_BZ, FLAG_CA, FLAG_CC, FLAG_CD, FLAG_CF, FLAG_CG, FLAG_CH, FLAG_CI, FLAG_CK, FLAG_CL, FLAG_CM, FLAG_CN, FLAG_CO, FLAG_CR, FLAG_CU, FLAG_CV, FLAG_CW, FLAG_CX, FLAG_CY, FLAG_CZ, FLAG_DE, FLAG_DJ, FLAG_DK, FLAG_DM, FLAG_DO, FLAG_DZ, FLAG_EC, FLAG_EE, FLAG_EG, FLAG_EH, FLAG_ER, FLAG_ES, FLAG_ET, FLAG_EU, FLAG_FI, FLAG_FJ, FLAG_FK, FLAG_FM, FLAG_FO, FLAG_FR, FLAG_GA, FLAG_GB, FLAG_GD, FLAG_GE, FLAG_GENERIC, FLAG_GF, FLAG_GG, FLAG_GH, FLAG_GI, FLAG_GL, FLAG_GM, FLAG_GN, FLAG_GP, FLAG_GQ, FLAG_GR, FLAG_GS, FLAG_GT, FLAG_GU, FLAG_GW, FLAG_GY, FLAG_HK, FLAG_HM, FLAG_HN, FLAG_HR, FLAG_HT, FLAG_HU, FLAG_ID, FLAG_IE, FLAG_IL, FLAG_IM, FLAG_IN, FLAG_IO, FLAG_IQ, FLAG_IR, FLAG_IS, FLAG_IT, FLAG_JE, FLAG_JM, FLAG_JO, FLAG_JP, FLAG_KE, FLAG_KG, FLAG_KH, FLAG_KI, FLAG_KM, FLAG_KN, FLAG_KP, FLAG_KR, FLAG_KW, FLAG_KY, FLAG_KZ, FLAG_LA, FLAG_LB, FLAG_LC, FLAG_LI, FLAG_LK, FLAG_LR, FLAG_LS, FLAG_LT, FLAG_LU, FLAG_LV, FLAG_LY, FLAG_MA, FLAG_MC, FLAG_MD, FLAG_ME, FLAG_MF, FLAG_MG, FLAG_MH, FLAG_MK, FLAG_ML, FLAG_MM, FLAG_MN, FLAG_MO, FLAG_MP, FLAG_MQ, FLAG_MR, FLAG_MS, FLAG_MT, FLAG_MU, FLAG_MV, FLAG_MW, FLAG_MX, FLAG_MY, FLAG_MZ, FLAG_NA, FLAG_NC, FLAG_NE, FLAG_NF, FLAG_NG, FLAG_NI, FLAG_NL, FLAG_NO, FLAG_NP, FLAG_NR, FLAG_NU, FLAG_NZ, FLAG_OM, FLAG_PA, FLAG_PE, FLAG_PF, FLAG_PG, FLAG_PH, FLAG_PK, FLAG_PL, FLAG_PM, FLAG_PN, FLAG_PR, FLAG_PS, FLAG_PT, FLAG_PW, FLAG_PY, FLAG_QA, FLAG_RE, FLAG_RO, FLAG_RS, FLAG_RU, FLAG_RW, FLAG_SA, FLAG_SB, FLAG_SC, FLAG_SD, FLAG_SE, FLAG_SG, FLAG_SH, FLAG_SI, FLAG_SJ, FLAG_SK, FLAG_SL, FLAG_SM, FLAG_SN, FLAG_SO, FLAG_SR, FLAG_ST, FLAG_SV, FLAG_SX, FLAG_SY, FLAG_SZ, FLAG_TC, FLAG_TD, FLAG_TF, FLAG_TG, FLAG_TH, FLAG_TJ, FLAG_TK, FLAG_TL, FLAG_TM, FLAG_TN, FLAG_TO, FLAG_TR, FLAG_TT, FLAG_TV, FLAG_TW, FLAG_TZ, FLAG_UA, FLAG_UG, FLAG_UM, FLAG_US, FLAG_UY, FLAG_UZ, FLAG_VA, FLAG_VC, FLAG_VE, FLAG_VG, FLAG_VI, FLAG_VN, FLAG_VU, FLAG_WF, FLAG_WS, FLAG_YE, FLAG_YT, FLAG_ZA, FLAG_ZM, FLAG_ZW};
    }

    public /* synthetic */ FlagDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<FlagDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FlagDto(String str, int i) {
    }

    static {
        FlagDto[] flagDtoArr$values = $values();
        $VALUES = flagDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(flagDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.FlagDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FlagDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: FlagDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/FlagDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrh_server_driven_ui/v1/FlagDto;", "Lrh_server_driven_ui/v1/Flag;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/FlagDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<FlagDto, Flag> {

        /* compiled from: FlagDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Flag.values().length];
                try {
                    iArr[Flag.FLAG_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Flag.FLAG_AD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Flag.FLAG_AE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Flag.FLAG_AF.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Flag.FLAG_AG.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Flag.FLAG_AI.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Flag.FLAG_AL.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[Flag.FLAG_AM.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[Flag.FLAG_AO.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[Flag.FLAG_AQ.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[Flag.FLAG_AR.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[Flag.FLAG_AS.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[Flag.FLAG_AT.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[Flag.FLAG_AU.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[Flag.FLAG_AW.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[Flag.FLAG_AX.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[Flag.FLAG_AZ.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[Flag.FLAG_BA.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[Flag.FLAG_BB.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[Flag.FLAG_BD.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[Flag.FLAG_BE.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[Flag.FLAG_BF.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[Flag.FLAG_BG.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[Flag.FLAG_BH.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[Flag.FLAG_BI.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[Flag.FLAG_BJ.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[Flag.FLAG_BL.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[Flag.FLAG_BM.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[Flag.FLAG_BN.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[Flag.FLAG_BO.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[Flag.FLAG_BR.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[Flag.FLAG_BS.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[Flag.FLAG_BT.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[Flag.FLAG_BV.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[Flag.FLAG_BW.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[Flag.FLAG_BY.ordinal()] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[Flag.FLAG_BZ.ordinal()] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr[Flag.FLAG_CA.ordinal()] = 38;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr[Flag.FLAG_CC.ordinal()] = 39;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr[Flag.FLAG_CD.ordinal()] = 40;
                } catch (NoSuchFieldError unused40) {
                }
                try {
                    iArr[Flag.FLAG_CF.ordinal()] = 41;
                } catch (NoSuchFieldError unused41) {
                }
                try {
                    iArr[Flag.FLAG_CG.ordinal()] = 42;
                } catch (NoSuchFieldError unused42) {
                }
                try {
                    iArr[Flag.FLAG_CH.ordinal()] = 43;
                } catch (NoSuchFieldError unused43) {
                }
                try {
                    iArr[Flag.FLAG_CI.ordinal()] = 44;
                } catch (NoSuchFieldError unused44) {
                }
                try {
                    iArr[Flag.FLAG_CK.ordinal()] = 45;
                } catch (NoSuchFieldError unused45) {
                }
                try {
                    iArr[Flag.FLAG_CL.ordinal()] = 46;
                } catch (NoSuchFieldError unused46) {
                }
                try {
                    iArr[Flag.FLAG_CM.ordinal()] = 47;
                } catch (NoSuchFieldError unused47) {
                }
                try {
                    iArr[Flag.FLAG_CN.ordinal()] = 48;
                } catch (NoSuchFieldError unused48) {
                }
                try {
                    iArr[Flag.FLAG_CO.ordinal()] = 49;
                } catch (NoSuchFieldError unused49) {
                }
                try {
                    iArr[Flag.FLAG_CR.ordinal()] = 50;
                } catch (NoSuchFieldError unused50) {
                }
                try {
                    iArr[Flag.FLAG_CU.ordinal()] = 51;
                } catch (NoSuchFieldError unused51) {
                }
                try {
                    iArr[Flag.FLAG_CV.ordinal()] = 52;
                } catch (NoSuchFieldError unused52) {
                }
                try {
                    iArr[Flag.FLAG_CW.ordinal()] = 53;
                } catch (NoSuchFieldError unused53) {
                }
                try {
                    iArr[Flag.FLAG_CX.ordinal()] = 54;
                } catch (NoSuchFieldError unused54) {
                }
                try {
                    iArr[Flag.FLAG_CY.ordinal()] = 55;
                } catch (NoSuchFieldError unused55) {
                }
                try {
                    iArr[Flag.FLAG_CZ.ordinal()] = 56;
                } catch (NoSuchFieldError unused56) {
                }
                try {
                    iArr[Flag.FLAG_DE.ordinal()] = 57;
                } catch (NoSuchFieldError unused57) {
                }
                try {
                    iArr[Flag.FLAG_DJ.ordinal()] = 58;
                } catch (NoSuchFieldError unused58) {
                }
                try {
                    iArr[Flag.FLAG_DK.ordinal()] = 59;
                } catch (NoSuchFieldError unused59) {
                }
                try {
                    iArr[Flag.FLAG_DM.ordinal()] = 60;
                } catch (NoSuchFieldError unused60) {
                }
                try {
                    iArr[Flag.FLAG_DO.ordinal()] = 61;
                } catch (NoSuchFieldError unused61) {
                }
                try {
                    iArr[Flag.FLAG_DZ.ordinal()] = 62;
                } catch (NoSuchFieldError unused62) {
                }
                try {
                    iArr[Flag.FLAG_EC.ordinal()] = 63;
                } catch (NoSuchFieldError unused63) {
                }
                try {
                    iArr[Flag.FLAG_EE.ordinal()] = 64;
                } catch (NoSuchFieldError unused64) {
                }
                try {
                    iArr[Flag.FLAG_EG.ordinal()] = 65;
                } catch (NoSuchFieldError unused65) {
                }
                try {
                    iArr[Flag.FLAG_EH.ordinal()] = 66;
                } catch (NoSuchFieldError unused66) {
                }
                try {
                    iArr[Flag.FLAG_ER.ordinal()] = 67;
                } catch (NoSuchFieldError unused67) {
                }
                try {
                    iArr[Flag.FLAG_ES.ordinal()] = 68;
                } catch (NoSuchFieldError unused68) {
                }
                try {
                    iArr[Flag.FLAG_ET.ordinal()] = 69;
                } catch (NoSuchFieldError unused69) {
                }
                try {
                    iArr[Flag.FLAG_EU.ordinal()] = 70;
                } catch (NoSuchFieldError unused70) {
                }
                try {
                    iArr[Flag.FLAG_FI.ordinal()] = 71;
                } catch (NoSuchFieldError unused71) {
                }
                try {
                    iArr[Flag.FLAG_FJ.ordinal()] = 72;
                } catch (NoSuchFieldError unused72) {
                }
                try {
                    iArr[Flag.FLAG_FK.ordinal()] = 73;
                } catch (NoSuchFieldError unused73) {
                }
                try {
                    iArr[Flag.FLAG_FM.ordinal()] = 74;
                } catch (NoSuchFieldError unused74) {
                }
                try {
                    iArr[Flag.FLAG_FO.ordinal()] = 75;
                } catch (NoSuchFieldError unused75) {
                }
                try {
                    iArr[Flag.FLAG_FR.ordinal()] = 76;
                } catch (NoSuchFieldError unused76) {
                }
                try {
                    iArr[Flag.FLAG_GA.ordinal()] = 77;
                } catch (NoSuchFieldError unused77) {
                }
                try {
                    iArr[Flag.FLAG_GB.ordinal()] = 78;
                } catch (NoSuchFieldError unused78) {
                }
                try {
                    iArr[Flag.FLAG_GD.ordinal()] = 79;
                } catch (NoSuchFieldError unused79) {
                }
                try {
                    iArr[Flag.FLAG_GE.ordinal()] = 80;
                } catch (NoSuchFieldError unused80) {
                }
                try {
                    iArr[Flag.FLAG_GENERIC.ordinal()] = 81;
                } catch (NoSuchFieldError unused81) {
                }
                try {
                    iArr[Flag.FLAG_GF.ordinal()] = 82;
                } catch (NoSuchFieldError unused82) {
                }
                try {
                    iArr[Flag.FLAG_GG.ordinal()] = 83;
                } catch (NoSuchFieldError unused83) {
                }
                try {
                    iArr[Flag.FLAG_GH.ordinal()] = 84;
                } catch (NoSuchFieldError unused84) {
                }
                try {
                    iArr[Flag.FLAG_GI.ordinal()] = 85;
                } catch (NoSuchFieldError unused85) {
                }
                try {
                    iArr[Flag.FLAG_GL.ordinal()] = 86;
                } catch (NoSuchFieldError unused86) {
                }
                try {
                    iArr[Flag.FLAG_GM.ordinal()] = 87;
                } catch (NoSuchFieldError unused87) {
                }
                try {
                    iArr[Flag.FLAG_GN.ordinal()] = 88;
                } catch (NoSuchFieldError unused88) {
                }
                try {
                    iArr[Flag.FLAG_GP.ordinal()] = 89;
                } catch (NoSuchFieldError unused89) {
                }
                try {
                    iArr[Flag.FLAG_GQ.ordinal()] = 90;
                } catch (NoSuchFieldError unused90) {
                }
                try {
                    iArr[Flag.FLAG_GR.ordinal()] = 91;
                } catch (NoSuchFieldError unused91) {
                }
                try {
                    iArr[Flag.FLAG_GS.ordinal()] = 92;
                } catch (NoSuchFieldError unused92) {
                }
                try {
                    iArr[Flag.FLAG_GT.ordinal()] = 93;
                } catch (NoSuchFieldError unused93) {
                }
                try {
                    iArr[Flag.FLAG_GU.ordinal()] = 94;
                } catch (NoSuchFieldError unused94) {
                }
                try {
                    iArr[Flag.FLAG_GW.ordinal()] = 95;
                } catch (NoSuchFieldError unused95) {
                }
                try {
                    iArr[Flag.FLAG_GY.ordinal()] = 96;
                } catch (NoSuchFieldError unused96) {
                }
                try {
                    iArr[Flag.FLAG_HK.ordinal()] = 97;
                } catch (NoSuchFieldError unused97) {
                }
                try {
                    iArr[Flag.FLAG_HM.ordinal()] = 98;
                } catch (NoSuchFieldError unused98) {
                }
                try {
                    iArr[Flag.FLAG_HN.ordinal()] = 99;
                } catch (NoSuchFieldError unused99) {
                }
                try {
                    iArr[Flag.FLAG_HR.ordinal()] = 100;
                } catch (NoSuchFieldError unused100) {
                }
                try {
                    iArr[Flag.FLAG_HT.ordinal()] = 101;
                } catch (NoSuchFieldError unused101) {
                }
                try {
                    iArr[Flag.FLAG_HU.ordinal()] = 102;
                } catch (NoSuchFieldError unused102) {
                }
                try {
                    iArr[Flag.FLAG_ID.ordinal()] = 103;
                } catch (NoSuchFieldError unused103) {
                }
                try {
                    iArr[Flag.FLAG_IE.ordinal()] = 104;
                } catch (NoSuchFieldError unused104) {
                }
                try {
                    iArr[Flag.FLAG_IL.ordinal()] = 105;
                } catch (NoSuchFieldError unused105) {
                }
                try {
                    iArr[Flag.FLAG_IM.ordinal()] = 106;
                } catch (NoSuchFieldError unused106) {
                }
                try {
                    iArr[Flag.FLAG_IN.ordinal()] = 107;
                } catch (NoSuchFieldError unused107) {
                }
                try {
                    iArr[Flag.FLAG_IO.ordinal()] = 108;
                } catch (NoSuchFieldError unused108) {
                }
                try {
                    iArr[Flag.FLAG_IQ.ordinal()] = 109;
                } catch (NoSuchFieldError unused109) {
                }
                try {
                    iArr[Flag.FLAG_IR.ordinal()] = 110;
                } catch (NoSuchFieldError unused110) {
                }
                try {
                    iArr[Flag.FLAG_IS.ordinal()] = 111;
                } catch (NoSuchFieldError unused111) {
                }
                try {
                    iArr[Flag.FLAG_IT.ordinal()] = 112;
                } catch (NoSuchFieldError unused112) {
                }
                try {
                    iArr[Flag.FLAG_JE.ordinal()] = 113;
                } catch (NoSuchFieldError unused113) {
                }
                try {
                    iArr[Flag.FLAG_JM.ordinal()] = 114;
                } catch (NoSuchFieldError unused114) {
                }
                try {
                    iArr[Flag.FLAG_JO.ordinal()] = 115;
                } catch (NoSuchFieldError unused115) {
                }
                try {
                    iArr[Flag.FLAG_JP.ordinal()] = 116;
                } catch (NoSuchFieldError unused116) {
                }
                try {
                    iArr[Flag.FLAG_KE.ordinal()] = 117;
                } catch (NoSuchFieldError unused117) {
                }
                try {
                    iArr[Flag.FLAG_KG.ordinal()] = 118;
                } catch (NoSuchFieldError unused118) {
                }
                try {
                    iArr[Flag.FLAG_KH.ordinal()] = 119;
                } catch (NoSuchFieldError unused119) {
                }
                try {
                    iArr[Flag.FLAG_KI.ordinal()] = 120;
                } catch (NoSuchFieldError unused120) {
                }
                try {
                    iArr[Flag.FLAG_KM.ordinal()] = 121;
                } catch (NoSuchFieldError unused121) {
                }
                try {
                    iArr[Flag.FLAG_KN.ordinal()] = 122;
                } catch (NoSuchFieldError unused122) {
                }
                try {
                    iArr[Flag.FLAG_KP.ordinal()] = 123;
                } catch (NoSuchFieldError unused123) {
                }
                try {
                    iArr[Flag.FLAG_KR.ordinal()] = 124;
                } catch (NoSuchFieldError unused124) {
                }
                try {
                    iArr[Flag.FLAG_KW.ordinal()] = 125;
                } catch (NoSuchFieldError unused125) {
                }
                try {
                    iArr[Flag.FLAG_KY.ordinal()] = 126;
                } catch (NoSuchFieldError unused126) {
                }
                try {
                    iArr[Flag.FLAG_KZ.ordinal()] = 127;
                } catch (NoSuchFieldError unused127) {
                }
                try {
                    iArr[Flag.FLAG_LA.ordinal()] = 128;
                } catch (NoSuchFieldError unused128) {
                }
                try {
                    iArr[Flag.FLAG_LB.ordinal()] = 129;
                } catch (NoSuchFieldError unused129) {
                }
                try {
                    iArr[Flag.FLAG_LC.ordinal()] = 130;
                } catch (NoSuchFieldError unused130) {
                }
                try {
                    iArr[Flag.FLAG_LI.ordinal()] = 131;
                } catch (NoSuchFieldError unused131) {
                }
                try {
                    iArr[Flag.FLAG_LK.ordinal()] = 132;
                } catch (NoSuchFieldError unused132) {
                }
                try {
                    iArr[Flag.FLAG_LR.ordinal()] = 133;
                } catch (NoSuchFieldError unused133) {
                }
                try {
                    iArr[Flag.FLAG_LS.ordinal()] = 134;
                } catch (NoSuchFieldError unused134) {
                }
                try {
                    iArr[Flag.FLAG_LT.ordinal()] = 135;
                } catch (NoSuchFieldError unused135) {
                }
                try {
                    iArr[Flag.FLAG_LU.ordinal()] = 136;
                } catch (NoSuchFieldError unused136) {
                }
                try {
                    iArr[Flag.FLAG_LV.ordinal()] = 137;
                } catch (NoSuchFieldError unused137) {
                }
                try {
                    iArr[Flag.FLAG_LY.ordinal()] = 138;
                } catch (NoSuchFieldError unused138) {
                }
                try {
                    iArr[Flag.FLAG_MA.ordinal()] = 139;
                } catch (NoSuchFieldError unused139) {
                }
                try {
                    iArr[Flag.FLAG_MC.ordinal()] = 140;
                } catch (NoSuchFieldError unused140) {
                }
                try {
                    iArr[Flag.FLAG_MD.ordinal()] = 141;
                } catch (NoSuchFieldError unused141) {
                }
                try {
                    iArr[Flag.FLAG_ME.ordinal()] = 142;
                } catch (NoSuchFieldError unused142) {
                }
                try {
                    iArr[Flag.FLAG_MF.ordinal()] = 143;
                } catch (NoSuchFieldError unused143) {
                }
                try {
                    iArr[Flag.FLAG_MG.ordinal()] = 144;
                } catch (NoSuchFieldError unused144) {
                }
                try {
                    iArr[Flag.FLAG_MH.ordinal()] = 145;
                } catch (NoSuchFieldError unused145) {
                }
                try {
                    iArr[Flag.FLAG_MK.ordinal()] = 146;
                } catch (NoSuchFieldError unused146) {
                }
                try {
                    iArr[Flag.FLAG_ML.ordinal()] = 147;
                } catch (NoSuchFieldError unused147) {
                }
                try {
                    iArr[Flag.FLAG_MM.ordinal()] = 148;
                } catch (NoSuchFieldError unused148) {
                }
                try {
                    iArr[Flag.FLAG_MN.ordinal()] = 149;
                } catch (NoSuchFieldError unused149) {
                }
                try {
                    iArr[Flag.FLAG_MO.ordinal()] = 150;
                } catch (NoSuchFieldError unused150) {
                }
                try {
                    iArr[Flag.FLAG_MP.ordinal()] = 151;
                } catch (NoSuchFieldError unused151) {
                }
                try {
                    iArr[Flag.FLAG_MQ.ordinal()] = 152;
                } catch (NoSuchFieldError unused152) {
                }
                try {
                    iArr[Flag.FLAG_MR.ordinal()] = 153;
                } catch (NoSuchFieldError unused153) {
                }
                try {
                    iArr[Flag.FLAG_MS.ordinal()] = 154;
                } catch (NoSuchFieldError unused154) {
                }
                try {
                    iArr[Flag.FLAG_MT.ordinal()] = 155;
                } catch (NoSuchFieldError unused155) {
                }
                try {
                    iArr[Flag.FLAG_MU.ordinal()] = 156;
                } catch (NoSuchFieldError unused156) {
                }
                try {
                    iArr[Flag.FLAG_MV.ordinal()] = 157;
                } catch (NoSuchFieldError unused157) {
                }
                try {
                    iArr[Flag.FLAG_MW.ordinal()] = 158;
                } catch (NoSuchFieldError unused158) {
                }
                try {
                    iArr[Flag.FLAG_MX.ordinal()] = 159;
                } catch (NoSuchFieldError unused159) {
                }
                try {
                    iArr[Flag.FLAG_MY.ordinal()] = 160;
                } catch (NoSuchFieldError unused160) {
                }
                try {
                    iArr[Flag.FLAG_MZ.ordinal()] = 161;
                } catch (NoSuchFieldError unused161) {
                }
                try {
                    iArr[Flag.FLAG_NA.ordinal()] = 162;
                } catch (NoSuchFieldError unused162) {
                }
                try {
                    iArr[Flag.FLAG_NC.ordinal()] = 163;
                } catch (NoSuchFieldError unused163) {
                }
                try {
                    iArr[Flag.FLAG_NE.ordinal()] = 164;
                } catch (NoSuchFieldError unused164) {
                }
                try {
                    iArr[Flag.FLAG_NF.ordinal()] = 165;
                } catch (NoSuchFieldError unused165) {
                }
                try {
                    iArr[Flag.FLAG_NG.ordinal()] = 166;
                } catch (NoSuchFieldError unused166) {
                }
                try {
                    iArr[Flag.FLAG_NI.ordinal()] = 167;
                } catch (NoSuchFieldError unused167) {
                }
                try {
                    iArr[Flag.FLAG_NL.ordinal()] = 168;
                } catch (NoSuchFieldError unused168) {
                }
                try {
                    iArr[Flag.FLAG_NO.ordinal()] = 169;
                } catch (NoSuchFieldError unused169) {
                }
                try {
                    iArr[Flag.FLAG_NP.ordinal()] = 170;
                } catch (NoSuchFieldError unused170) {
                }
                try {
                    iArr[Flag.FLAG_NR.ordinal()] = 171;
                } catch (NoSuchFieldError unused171) {
                }
                try {
                    iArr[Flag.FLAG_NU.ordinal()] = 172;
                } catch (NoSuchFieldError unused172) {
                }
                try {
                    iArr[Flag.FLAG_NZ.ordinal()] = 173;
                } catch (NoSuchFieldError unused173) {
                }
                try {
                    iArr[Flag.FLAG_OM.ordinal()] = 174;
                } catch (NoSuchFieldError unused174) {
                }
                try {
                    iArr[Flag.FLAG_PA.ordinal()] = 175;
                } catch (NoSuchFieldError unused175) {
                }
                try {
                    iArr[Flag.FLAG_PE.ordinal()] = 176;
                } catch (NoSuchFieldError unused176) {
                }
                try {
                    iArr[Flag.FLAG_PF.ordinal()] = 177;
                } catch (NoSuchFieldError unused177) {
                }
                try {
                    iArr[Flag.FLAG_PG.ordinal()] = 178;
                } catch (NoSuchFieldError unused178) {
                }
                try {
                    iArr[Flag.FLAG_PH.ordinal()] = 179;
                } catch (NoSuchFieldError unused179) {
                }
                try {
                    iArr[Flag.FLAG_PK.ordinal()] = 180;
                } catch (NoSuchFieldError unused180) {
                }
                try {
                    iArr[Flag.FLAG_PL.ordinal()] = 181;
                } catch (NoSuchFieldError unused181) {
                }
                try {
                    iArr[Flag.FLAG_PM.ordinal()] = 182;
                } catch (NoSuchFieldError unused182) {
                }
                try {
                    iArr[Flag.FLAG_PN.ordinal()] = 183;
                } catch (NoSuchFieldError unused183) {
                }
                try {
                    iArr[Flag.FLAG_PR.ordinal()] = 184;
                } catch (NoSuchFieldError unused184) {
                }
                try {
                    iArr[Flag.FLAG_PS.ordinal()] = 185;
                } catch (NoSuchFieldError unused185) {
                }
                try {
                    iArr[Flag.FLAG_PT.ordinal()] = 186;
                } catch (NoSuchFieldError unused186) {
                }
                try {
                    iArr[Flag.FLAG_PW.ordinal()] = 187;
                } catch (NoSuchFieldError unused187) {
                }
                try {
                    iArr[Flag.FLAG_PY.ordinal()] = 188;
                } catch (NoSuchFieldError unused188) {
                }
                try {
                    iArr[Flag.FLAG_QA.ordinal()] = 189;
                } catch (NoSuchFieldError unused189) {
                }
                try {
                    iArr[Flag.FLAG_RE.ordinal()] = 190;
                } catch (NoSuchFieldError unused190) {
                }
                try {
                    iArr[Flag.FLAG_RO.ordinal()] = 191;
                } catch (NoSuchFieldError unused191) {
                }
                try {
                    iArr[Flag.FLAG_RS.ordinal()] = 192;
                } catch (NoSuchFieldError unused192) {
                }
                try {
                    iArr[Flag.FLAG_RU.ordinal()] = 193;
                } catch (NoSuchFieldError unused193) {
                }
                try {
                    iArr[Flag.FLAG_RW.ordinal()] = 194;
                } catch (NoSuchFieldError unused194) {
                }
                try {
                    iArr[Flag.FLAG_SA.ordinal()] = 195;
                } catch (NoSuchFieldError unused195) {
                }
                try {
                    iArr[Flag.FLAG_SB.ordinal()] = 196;
                } catch (NoSuchFieldError unused196) {
                }
                try {
                    iArr[Flag.FLAG_SC.ordinal()] = 197;
                } catch (NoSuchFieldError unused197) {
                }
                try {
                    iArr[Flag.FLAG_SD.ordinal()] = 198;
                } catch (NoSuchFieldError unused198) {
                }
                try {
                    iArr[Flag.FLAG_SE.ordinal()] = 199;
                } catch (NoSuchFieldError unused199) {
                }
                try {
                    iArr[Flag.FLAG_SG.ordinal()] = 200;
                } catch (NoSuchFieldError unused200) {
                }
                try {
                    iArr[Flag.FLAG_SH.ordinal()] = 201;
                } catch (NoSuchFieldError unused201) {
                }
                try {
                    iArr[Flag.FLAG_SI.ordinal()] = 202;
                } catch (NoSuchFieldError unused202) {
                }
                try {
                    iArr[Flag.FLAG_SJ.ordinal()] = 203;
                } catch (NoSuchFieldError unused203) {
                }
                try {
                    iArr[Flag.FLAG_SK.ordinal()] = 204;
                } catch (NoSuchFieldError unused204) {
                }
                try {
                    iArr[Flag.FLAG_SL.ordinal()] = 205;
                } catch (NoSuchFieldError unused205) {
                }
                try {
                    iArr[Flag.FLAG_SM.ordinal()] = 206;
                } catch (NoSuchFieldError unused206) {
                }
                try {
                    iArr[Flag.FLAG_SN.ordinal()] = 207;
                } catch (NoSuchFieldError unused207) {
                }
                try {
                    iArr[Flag.FLAG_SO.ordinal()] = 208;
                } catch (NoSuchFieldError unused208) {
                }
                try {
                    iArr[Flag.FLAG_SR.ordinal()] = 209;
                } catch (NoSuchFieldError unused209) {
                }
                try {
                    iArr[Flag.FLAG_ST.ordinal()] = 210;
                } catch (NoSuchFieldError unused210) {
                }
                try {
                    iArr[Flag.FLAG_SV.ordinal()] = 211;
                } catch (NoSuchFieldError unused211) {
                }
                try {
                    iArr[Flag.FLAG_SX.ordinal()] = 212;
                } catch (NoSuchFieldError unused212) {
                }
                try {
                    iArr[Flag.FLAG_SY.ordinal()] = 213;
                } catch (NoSuchFieldError unused213) {
                }
                try {
                    iArr[Flag.FLAG_SZ.ordinal()] = 214;
                } catch (NoSuchFieldError unused214) {
                }
                try {
                    iArr[Flag.FLAG_TC.ordinal()] = 215;
                } catch (NoSuchFieldError unused215) {
                }
                try {
                    iArr[Flag.FLAG_TD.ordinal()] = 216;
                } catch (NoSuchFieldError unused216) {
                }
                try {
                    iArr[Flag.FLAG_TF.ordinal()] = 217;
                } catch (NoSuchFieldError unused217) {
                }
                try {
                    iArr[Flag.FLAG_TG.ordinal()] = 218;
                } catch (NoSuchFieldError unused218) {
                }
                try {
                    iArr[Flag.FLAG_TH.ordinal()] = 219;
                } catch (NoSuchFieldError unused219) {
                }
                try {
                    iArr[Flag.FLAG_TJ.ordinal()] = 220;
                } catch (NoSuchFieldError unused220) {
                }
                try {
                    iArr[Flag.FLAG_TK.ordinal()] = 221;
                } catch (NoSuchFieldError unused221) {
                }
                try {
                    iArr[Flag.FLAG_TL.ordinal()] = 222;
                } catch (NoSuchFieldError unused222) {
                }
                try {
                    iArr[Flag.FLAG_TM.ordinal()] = 223;
                } catch (NoSuchFieldError unused223) {
                }
                try {
                    iArr[Flag.FLAG_TN.ordinal()] = 224;
                } catch (NoSuchFieldError unused224) {
                }
                try {
                    iArr[Flag.FLAG_TO.ordinal()] = 225;
                } catch (NoSuchFieldError unused225) {
                }
                try {
                    iArr[Flag.FLAG_TR.ordinal()] = 226;
                } catch (NoSuchFieldError unused226) {
                }
                try {
                    iArr[Flag.FLAG_TT.ordinal()] = 227;
                } catch (NoSuchFieldError unused227) {
                }
                try {
                    iArr[Flag.FLAG_TV.ordinal()] = 228;
                } catch (NoSuchFieldError unused228) {
                }
                try {
                    iArr[Flag.FLAG_TW.ordinal()] = 229;
                } catch (NoSuchFieldError unused229) {
                }
                try {
                    iArr[Flag.FLAG_TZ.ordinal()] = 230;
                } catch (NoSuchFieldError unused230) {
                }
                try {
                    iArr[Flag.FLAG_UA.ordinal()] = 231;
                } catch (NoSuchFieldError unused231) {
                }
                try {
                    iArr[Flag.FLAG_UG.ordinal()] = 232;
                } catch (NoSuchFieldError unused232) {
                }
                try {
                    iArr[Flag.FLAG_UM.ordinal()] = 233;
                } catch (NoSuchFieldError unused233) {
                }
                try {
                    iArr[Flag.FLAG_US.ordinal()] = 234;
                } catch (NoSuchFieldError unused234) {
                }
                try {
                    iArr[Flag.FLAG_UY.ordinal()] = 235;
                } catch (NoSuchFieldError unused235) {
                }
                try {
                    iArr[Flag.FLAG_UZ.ordinal()] = 236;
                } catch (NoSuchFieldError unused236) {
                }
                try {
                    iArr[Flag.FLAG_VA.ordinal()] = 237;
                } catch (NoSuchFieldError unused237) {
                }
                try {
                    iArr[Flag.FLAG_VC.ordinal()] = 238;
                } catch (NoSuchFieldError unused238) {
                }
                try {
                    iArr[Flag.FLAG_VE.ordinal()] = 239;
                } catch (NoSuchFieldError unused239) {
                }
                try {
                    iArr[Flag.FLAG_VG.ordinal()] = 240;
                } catch (NoSuchFieldError unused240) {
                }
                try {
                    iArr[Flag.FLAG_VI.ordinal()] = 241;
                } catch (NoSuchFieldError unused241) {
                }
                try {
                    iArr[Flag.FLAG_VN.ordinal()] = 242;
                } catch (NoSuchFieldError unused242) {
                }
                try {
                    iArr[Flag.FLAG_VU.ordinal()] = 243;
                } catch (NoSuchFieldError unused243) {
                }
                try {
                    iArr[Flag.FLAG_WF.ordinal()] = 244;
                } catch (NoSuchFieldError unused244) {
                }
                try {
                    iArr[Flag.FLAG_WS.ordinal()] = 245;
                } catch (NoSuchFieldError unused245) {
                }
                try {
                    iArr[Flag.FLAG_YE.ordinal()] = 246;
                } catch (NoSuchFieldError unused246) {
                }
                try {
                    iArr[Flag.FLAG_YT.ordinal()] = 247;
                } catch (NoSuchFieldError unused247) {
                }
                try {
                    iArr[Flag.FLAG_ZA.ordinal()] = 248;
                } catch (NoSuchFieldError unused248) {
                }
                try {
                    iArr[Flag.FLAG_ZM.ordinal()] = 249;
                } catch (NoSuchFieldError unused249) {
                }
                try {
                    iArr[Flag.FLAG_ZW.ordinal()] = 250;
                } catch (NoSuchFieldError unused250) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FlagDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FlagDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FlagDto> getBinaryBase64Serializer() {
            return (KSerializer) FlagDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Flag> getProtoAdapter() {
            return Flag.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FlagDto getZeroValue() {
            return FlagDto.FLAG_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FlagDto fromProto(Flag proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return FlagDto.FLAG_UNSPECIFIED;
                case 2:
                    return FlagDto.FLAG_AD;
                case 3:
                    return FlagDto.FLAG_AE;
                case 4:
                    return FlagDto.FLAG_AF;
                case 5:
                    return FlagDto.FLAG_AG;
                case 6:
                    return FlagDto.FLAG_AI;
                case 7:
                    return FlagDto.FLAG_AL;
                case 8:
                    return FlagDto.FLAG_AM;
                case 9:
                    return FlagDto.FLAG_AO;
                case 10:
                    return FlagDto.FLAG_AQ;
                case 11:
                    return FlagDto.FLAG_AR;
                case 12:
                    return FlagDto.FLAG_AS;
                case 13:
                    return FlagDto.FLAG_AT;
                case 14:
                    return FlagDto.FLAG_AU;
                case 15:
                    return FlagDto.FLAG_AW;
                case 16:
                    return FlagDto.FLAG_AX;
                case 17:
                    return FlagDto.FLAG_AZ;
                case 18:
                    return FlagDto.FLAG_BA;
                case 19:
                    return FlagDto.FLAG_BB;
                case 20:
                    return FlagDto.FLAG_BD;
                case 21:
                    return FlagDto.FLAG_BE;
                case 22:
                    return FlagDto.FLAG_BF;
                case 23:
                    return FlagDto.FLAG_BG;
                case 24:
                    return FlagDto.FLAG_BH;
                case 25:
                    return FlagDto.FLAG_BI;
                case 26:
                    return FlagDto.FLAG_BJ;
                case 27:
                    return FlagDto.FLAG_BL;
                case 28:
                    return FlagDto.FLAG_BM;
                case 29:
                    return FlagDto.FLAG_BN;
                case 30:
                    return FlagDto.FLAG_BO;
                case 31:
                    return FlagDto.FLAG_BR;
                case 32:
                    return FlagDto.FLAG_BS;
                case 33:
                    return FlagDto.FLAG_BT;
                case 34:
                    return FlagDto.FLAG_BV;
                case 35:
                    return FlagDto.FLAG_BW;
                case 36:
                    return FlagDto.FLAG_BY;
                case 37:
                    return FlagDto.FLAG_BZ;
                case 38:
                    return FlagDto.FLAG_CA;
                case 39:
                    return FlagDto.FLAG_CC;
                case 40:
                    return FlagDto.FLAG_CD;
                case 41:
                    return FlagDto.FLAG_CF;
                case 42:
                    return FlagDto.FLAG_CG;
                case 43:
                    return FlagDto.FLAG_CH;
                case 44:
                    return FlagDto.FLAG_CI;
                case 45:
                    return FlagDto.FLAG_CK;
                case 46:
                    return FlagDto.FLAG_CL;
                case 47:
                    return FlagDto.FLAG_CM;
                case 48:
                    return FlagDto.FLAG_CN;
                case 49:
                    return FlagDto.FLAG_CO;
                case 50:
                    return FlagDto.FLAG_CR;
                case 51:
                    return FlagDto.FLAG_CU;
                case 52:
                    return FlagDto.FLAG_CV;
                case 53:
                    return FlagDto.FLAG_CW;
                case 54:
                    return FlagDto.FLAG_CX;
                case 55:
                    return FlagDto.FLAG_CY;
                case 56:
                    return FlagDto.FLAG_CZ;
                case 57:
                    return FlagDto.FLAG_DE;
                case 58:
                    return FlagDto.FLAG_DJ;
                case 59:
                    return FlagDto.FLAG_DK;
                case 60:
                    return FlagDto.FLAG_DM;
                case 61:
                    return FlagDto.FLAG_DO;
                case 62:
                    return FlagDto.FLAG_DZ;
                case 63:
                    return FlagDto.FLAG_EC;
                case 64:
                    return FlagDto.FLAG_EE;
                case 65:
                    return FlagDto.FLAG_EG;
                case 66:
                    return FlagDto.FLAG_EH;
                case 67:
                    return FlagDto.FLAG_ER;
                case SDK_ASSET_ICON_HOME_VALUE:
                    return FlagDto.FLAG_ES;
                case 69:
                    return FlagDto.FLAG_ET;
                case 70:
                    return FlagDto.FLAG_EU;
                case SDK_ASSET_ICON_GUIDE_VALUE:
                    return FlagDto.FLAG_FI;
                case SDK_ASSET_ICON_GLOBE_VALUE:
                    return FlagDto.FLAG_FJ;
                case 73:
                    return FlagDto.FLAG_FK;
                case 74:
                    return FlagDto.FLAG_FM;
                case 75:
                    return FlagDto.FLAG_FO;
                case 76:
                    return FlagDto.FLAG_FR;
                case 77:
                    return FlagDto.FLAG_GA;
                case 78:
                    return FlagDto.FLAG_GB;
                case 79:
                    return FlagDto.FLAG_GD;
                case 80:
                    return FlagDto.FLAG_GE;
                case 81:
                    return FlagDto.FLAG_GENERIC;
                case 82:
                    return FlagDto.FLAG_GF;
                case 83:
                    return FlagDto.FLAG_GG;
                case 84:
                    return FlagDto.FLAG_GH;
                case 85:
                    return FlagDto.FLAG_GI;
                case 86:
                    return FlagDto.FLAG_GL;
                case 87:
                    return FlagDto.FLAG_GM;
                case 88:
                    return FlagDto.FLAG_GN;
                case 89:
                    return FlagDto.FLAG_GP;
                case 90:
                    return FlagDto.FLAG_GQ;
                case 91:
                    return FlagDto.FLAG_GR;
                case 92:
                    return FlagDto.FLAG_GS;
                case 93:
                    return FlagDto.FLAG_GT;
                case 94:
                    return FlagDto.FLAG_GU;
                case 95:
                    return FlagDto.FLAG_GW;
                case 96:
                    return FlagDto.FLAG_GY;
                case 97:
                    return FlagDto.FLAG_HK;
                case 98:
                    return FlagDto.FLAG_HM;
                case 99:
                    return FlagDto.FLAG_HN;
                case 100:
                    return FlagDto.FLAG_HR;
                case 101:
                    return FlagDto.FLAG_HT;
                case 102:
                    return FlagDto.FLAG_HU;
                case 103:
                    return FlagDto.FLAG_ID;
                case 104:
                    return FlagDto.FLAG_IE;
                case 105:
                    return FlagDto.FLAG_IL;
                case 106:
                    return FlagDto.FLAG_IM;
                case 107:
                    return FlagDto.FLAG_IN;
                case 108:
                    return FlagDto.FLAG_IO;
                case 109:
                    return FlagDto.FLAG_IQ;
                case 110:
                    return FlagDto.FLAG_IR;
                case 111:
                    return FlagDto.FLAG_IS;
                case 112:
                    return FlagDto.FLAG_IT;
                case 113:
                    return FlagDto.FLAG_JE;
                case 114:
                    return FlagDto.FLAG_JM;
                case 115:
                    return FlagDto.FLAG_JO;
                case 116:
                    return FlagDto.FLAG_JP;
                case 117:
                    return FlagDto.FLAG_KE;
                case 118:
                    return FlagDto.FLAG_KG;
                case 119:
                    return FlagDto.FLAG_KH;
                case 120:
                    return FlagDto.FLAG_KI;
                case SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE:
                    return FlagDto.FLAG_KM;
                case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                    return FlagDto.FLAG_KN;
                case 123:
                    return FlagDto.FLAG_KP;
                case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                    return FlagDto.FLAG_KR;
                case 125:
                    return FlagDto.FLAG_KW;
                case SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE:
                    return FlagDto.FLAG_KY;
                case SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE:
                    return FlagDto.FLAG_KZ;
                case 128:
                    return FlagDto.FLAG_LA;
                case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                    return FlagDto.FLAG_LB;
                case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                    return FlagDto.FLAG_LC;
                case 131:
                    return FlagDto.FLAG_LI;
                case SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE:
                    return FlagDto.FLAG_LK;
                case SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE:
                    return FlagDto.FLAG_LR;
                case SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE:
                    return FlagDto.FLAG_LS;
                case SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE:
                    return FlagDto.FLAG_LT;
                case 136:
                    return FlagDto.FLAG_LU;
                case SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE:
                    return FlagDto.FLAG_LV;
                case SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE:
                    return FlagDto.FLAG_LY;
                case SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE:
                    return FlagDto.FLAG_MA;
                case SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE:
                    return FlagDto.FLAG_MC;
                case SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE:
                    return FlagDto.FLAG_MD;
                case SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE:
                    return FlagDto.FLAG_ME;
                case SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE:
                    return FlagDto.FLAG_MF;
                case 144:
                    return FlagDto.FLAG_MG;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE:
                    return FlagDto.FLAG_MH;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE:
                    return FlagDto.FLAG_MK;
                case 147:
                    return FlagDto.FLAG_ML;
                case SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE:
                    return FlagDto.FLAG_MM;
                case SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE:
                    return FlagDto.FLAG_MN;
                case 150:
                    return FlagDto.FLAG_MO;
                case 151:
                    return FlagDto.FLAG_MP;
                case SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE:
                    return FlagDto.FLAG_MQ;
                case SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE:
                    return FlagDto.FLAG_MR;
                case SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE:
                    return FlagDto.FLAG_MS;
                case 155:
                    return FlagDto.FLAG_MT;
                case 156:
                    return FlagDto.FLAG_MU;
                case SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE:
                    return FlagDto.FLAG_MV;
                case SDK_ASSET_ILLUSTRATION_WALLET_VALUE:
                    return FlagDto.FLAG_MW;
                case SDK_ASSET_ILLUSTRATION_INCOME_VALUE:
                    return FlagDto.FLAG_MX;
                case SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE:
                    return FlagDto.FLAG_MY;
                case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE:
                    return FlagDto.FLAG_MZ;
                case SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE:
                    return FlagDto.FLAG_NA;
                case SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE:
                    return FlagDto.FLAG_NC;
                case SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE:
                    return FlagDto.FLAG_NE;
                case 165:
                    return FlagDto.FLAG_NF;
                case SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE:
                    return FlagDto.FLAG_NG;
                case 167:
                    return FlagDto.FLAG_NI;
                case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE:
                    return FlagDto.FLAG_NL;
                case SDK_ASSET_HEADER_CARD_COLLECT_VALUE:
                    return FlagDto.FLAG_NO;
                case SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE:
                    return FlagDto.FLAG_NP;
                case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE:
                    return FlagDto.FLAG_NR;
                case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE:
                    return FlagDto.FLAG_NU;
                case SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE:
                    return FlagDto.FLAG_NZ;
                case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE:
                    return FlagDto.FLAG_OM;
                case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE:
                    return FlagDto.FLAG_PA;
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE:
                    return FlagDto.FLAG_PE;
                case SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE:
                    return FlagDto.FLAG_PF;
                case f2773x8d9721ad:
                    return FlagDto.FLAG_PG;
                case f2780x600b66fe:
                    return FlagDto.FLAG_PH;
                case SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE:
                    return FlagDto.FLAG_PK;
                case SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE:
                    return FlagDto.FLAG_PL;
                case 182:
                    return FlagDto.FLAG_PM;
                case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE:
                    return FlagDto.FLAG_PN;
                case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE:
                    return FlagDto.FLAG_PR;
                case SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE:
                    return FlagDto.FLAG_PS;
                case SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE:
                    return FlagDto.FLAG_PT;
                case SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE:
                    return FlagDto.FLAG_PW;
                case 188:
                    return FlagDto.FLAG_PY;
                case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE:
                    return FlagDto.FLAG_QA;
                case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE:
                    return FlagDto.FLAG_RE;
                case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE:
                    return FlagDto.FLAG_RO;
                case 192:
                    return FlagDto.FLAG_RS;
                case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE:
                    return FlagDto.FLAG_RU;
                case SDK_ASSET_ICON_EXTERNAL_VALUE:
                    return FlagDto.FLAG_RW;
                case SDK_ASSET_ICON_ALERT_WARNING_VALUE:
                    return FlagDto.FLAG_SA;
                case SDK_ASSET_ICON_ARROW_DOWN_VALUE:
                    return FlagDto.FLAG_SB;
                case SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE:
                    return FlagDto.FLAG_SC;
                case SDK_ASSET_ICON_ARROW_UP_VALUE:
                    return FlagDto.FLAG_SD;
                case SDK_ASSET_ICON_CANCEL_VALUE:
                    return FlagDto.FLAG_SE;
                case 200:
                    return FlagDto.FLAG_SG;
                case 201:
                    return FlagDto.FLAG_SH;
                case 202:
                    return FlagDto.FLAG_SI;
                case SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE:
                    return FlagDto.FLAG_SJ;
                case 204:
                    return FlagDto.FLAG_SK;
                case SDK_ASSET_ICON_CLIPBOARD_VALUE:
                    return FlagDto.FLAG_SL;
                case SDK_ASSET_ICON_CLOCK_VALUE:
                    return FlagDto.FLAG_SM;
                case SDK_ASSET_ICON_COMMENT_VALUE:
                    return FlagDto.FLAG_SN;
                case SDK_ASSET_ICON_INCOME_VALUE:
                    return FlagDto.FLAG_SO;
                case SDK_ASSET_ICON_INCOMPLETE_VALUE:
                    return FlagDto.FLAG_SR;
                case SDK_ASSET_ICON_NEW_WINDOW_VALUE:
                    return FlagDto.FLAG_ST;
                case 211:
                    return FlagDto.FLAG_SV;
                case SDK_ASSET_ICON_OVERRIDE_VALUE:
                    return FlagDto.FLAG_SX;
                case SDK_ASSET_ICON_PAUSE_VALUE:
                    return FlagDto.FLAG_SY;
                case SDK_ASSET_ICON_PIN_VALUE:
                    return FlagDto.FLAG_SZ;
                case SDK_ASSET_ICON_PRODUCT_IDV_VALUE:
                    return FlagDto.FLAG_TC;
                case SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE:
                    return FlagDto.FLAG_TD;
                case SDK_ASSET_ICON_PROGRESS_VALUE:
                    return FlagDto.FLAG_TF;
                case SDK_ASSET_ICON_QUESTION_VALUE:
                    return FlagDto.FLAG_TG;
                case SDK_ASSET_ICON_REJECTED_REC_VALUE:
                    return FlagDto.FLAG_TH;
                case SDK_ASSET_ICON_SHIELD_CAUTION_VALUE:
                    return FlagDto.FLAG_TJ;
                case SDK_ASSET_ICON_SUBMIT_VALUE:
                    return FlagDto.FLAG_TK;
                case SDK_ASSET_ICON_SUBTRACT_VALUE:
                    return FlagDto.FLAG_TL;
                case SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE:
                    return FlagDto.FLAG_TM;
                case 224:
                    return FlagDto.FLAG_TN;
                case 225:
                    return FlagDto.FLAG_TO;
                case SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE:
                    return FlagDto.FLAG_TR;
                case SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE:
                    return FlagDto.FLAG_TT;
                case SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE:
                    return FlagDto.FLAG_TV;
                case SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE:
                    return FlagDto.FLAG_TW;
                case SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE:
                    return FlagDto.FLAG_TZ;
                case SDK_ASSET_ILLUSTRATION_EXIT_VALUE:
                    return FlagDto.FLAG_UA;
                case SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE:
                    return FlagDto.FLAG_UG;
                case SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE:
                    return FlagDto.FLAG_UM;
                case SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE:
                    return FlagDto.FLAG_US;
                case SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE:
                    return FlagDto.FLAG_UY;
                case SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE:
                    return FlagDto.FLAG_UZ;
                case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE:
                    return FlagDto.FLAG_VA;
                case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE:
                    return FlagDto.FLAG_VC;
                case 239:
                    return FlagDto.FLAG_VE;
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE:
                    return FlagDto.FLAG_VG;
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE:
                    return FlagDto.FLAG_VI;
                case f2778x3356acf6:
                    return FlagDto.FLAG_VN;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE:
                    return FlagDto.FLAG_VU;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE:
                    return FlagDto.FLAG_WF;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE:
                    return FlagDto.FLAG_WS;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE:
                    return FlagDto.FLAG_YE;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE:
                    return FlagDto.FLAG_YT;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE:
                    return FlagDto.FLAG_ZA;
                case f2779x59907a3d:
                    return FlagDto.FLAG_ZM;
                case 250:
                    return FlagDto.FLAG_ZW;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FlagDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrh_server_driven_ui/v1/FlagDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/FlagDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<FlagDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<FlagDto, Flag> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rh_server_driven_ui.v1.Flag", FlagDto.getEntries(), FlagDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public FlagDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (FlagDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FlagDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static FlagDto valueOf(String str) {
        return (FlagDto) Enum.valueOf(FlagDto.class, str);
    }

    public static FlagDto[] values() {
        return (FlagDto[]) $VALUES.clone();
    }
}
