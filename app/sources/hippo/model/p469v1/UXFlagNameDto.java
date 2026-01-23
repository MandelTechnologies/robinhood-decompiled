package hippo.model.p469v1;

import android.os.Parcel;
import android.os.Parcelable;
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
/* compiled from: UXFlagNameDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b)\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u000245B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u000202H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,¨\u00066"}, m3636d2 = {"Lhippo/model/v1/UXFlagNameDto;", "Lcom/robinhood/idl/EnumDto;", "Lhippo/model/v1/UXFlagName;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "UX_FLAG_NAME_UNSPECIFIED", "BLACK_WIDOW_EDUCATION_FIRST_TRADE", "BLACK_WIDOW_EDUCATION_ADD_LAYOUT", "ONBOARDING_WEB_CLIENT_PREFERENCE", "BLACK_WIDOW_EDUCATION_WIDGET_LINKING", "BLACK_WIDOW_SIGNED_LEGEND_AGREEMENT", "BLACK_WIDOW_FIRST_LAYOUT_CREATED", "BLACK_WIDOW_FIRST_WIDGET_ADDED", "BLACK_WIDOW_FIRST_SINGLE_LEG_TRADE", "BLACK_WIDOW_FIRST_MULTI_LEG_TRADE", "BLACK_WIDOW_EDUCATION_OPTION_CHAIN_L2", "BLACK_WIDOW_EDUCATION_OPTION_CHAIN_L3", "BLACK_WIDOW_EDUCATION_FEATURE_DISCOVERY", "BLACK_WIDOW_EDUCATION_VOLUME_AS_INDICATOR", "BLACK_WIDOW_EDUCATION_OPTION_CHART_LINKED_DERIVATIVE", "BLACK_WIDOW_EDUCATION_CHART_DRAWINGS_SYNC", "BLACK_WIDOW_OPTION_CHAIN_ANALYZER", "BLACK_WIDOW_MAC_POSITION_PILL_OPENED", "BLACK_WIDOW_EDUCATION_OPTION_CHAIN_ANALYZER", "BLACK_WIDOW_SHOULD_DEFAULT_TO_LEGEND", "BLACK_WIDOW_HAS_DEFAULTED_TO_LEGEND", "BLACK_WIDOW_DEFAULT_TO_LEGEND", "BLACK_WIDOW_HAS_SEEN_DEFAULT_TO_LEGEND_BANNER", "BLACK_WIDOW_DEFAULT_WEB_CLIENT", "BLACK_WIDOW_FIRST_WIDGET_ADDED_OPTIONS_INTEREST", "BLACK_WIDOW_EDUCATION_CUSTOMIZE_LAYOUT", "BLACK_WIDOW_OPTIONS_TEMPLATE_APPLIED", "ADVISORY_ANDROID_RETURNS_HUB_BENCHMARK_INFO", "BLACK_WIDOW_EDUCATION_OPTION_ORDER_FORM_LINKED_LEGS", "BLACK_WIDOW_EDUCATION_OPTIONS_INTEREST_FIRST_WIDGET", "EQUITY_SHORT_SELLING_NEW_USER_EXPERIENCE", "EQUITY_SHORT_SELLING_SHIMMER", "BLACK_WIDOW_LADDER_APP_SETTINGS_DISMISSED", "BLACK_WIDOW_EDUCATION_WIDGET_AUTO_SEND", "BLACK_WIDOW_EDUCATION_PRIVACY_MODE", "BLACK_WIDOW_LADDER_APP_SETTINGS_SHOWN", "BLACK_WIDOW_HOTKEY_AUTO_SEND_ORDER_CONFIRMATION_SHOWN", "EQUITY_TAX_LOTS_NEW_LABEL", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public abstract class UXFlagNameDto implements Dto2<UXFlagName>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UXFlagNameDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<UXFlagNameDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<UXFlagNameDto, UXFlagName>> binaryBase64Serializer$delegate;
    public static final UXFlagNameDto UX_FLAG_NAME_UNSPECIFIED = new UXFlagNameDto("UX_FLAG_NAME_UNSPECIFIED", 0) { // from class: hippo.model.v1.UXFlagNameDto.UX_FLAG_NAME_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public UXFlagName toProto() {
            return UXFlagName.UX_FLAG_NAME_UNSPECIFIED;
        }
    };
    public static final UXFlagNameDto BLACK_WIDOW_EDUCATION_FIRST_TRADE = new UXFlagNameDto("BLACK_WIDOW_EDUCATION_FIRST_TRADE", 1) { // from class: hippo.model.v1.UXFlagNameDto.BLACK_WIDOW_EDUCATION_FIRST_TRADE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public UXFlagName toProto() {
            return UXFlagName.BLACK_WIDOW_EDUCATION_FIRST_TRADE;
        }
    };
    public static final UXFlagNameDto BLACK_WIDOW_EDUCATION_ADD_LAYOUT = new UXFlagNameDto("BLACK_WIDOW_EDUCATION_ADD_LAYOUT", 2) { // from class: hippo.model.v1.UXFlagNameDto.BLACK_WIDOW_EDUCATION_ADD_LAYOUT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public UXFlagName toProto() {
            return UXFlagName.BLACK_WIDOW_EDUCATION_ADD_LAYOUT;
        }
    };
    public static final UXFlagNameDto ONBOARDING_WEB_CLIENT_PREFERENCE = new UXFlagNameDto("ONBOARDING_WEB_CLIENT_PREFERENCE", 3) { // from class: hippo.model.v1.UXFlagNameDto.ONBOARDING_WEB_CLIENT_PREFERENCE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public UXFlagName toProto() {
            return UXFlagName.ONBOARDING_WEB_CLIENT_PREFERENCE;
        }
    };
    public static final UXFlagNameDto BLACK_WIDOW_EDUCATION_WIDGET_LINKING = new UXFlagNameDto("BLACK_WIDOW_EDUCATION_WIDGET_LINKING", 4) { // from class: hippo.model.v1.UXFlagNameDto.BLACK_WIDOW_EDUCATION_WIDGET_LINKING
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public UXFlagName toProto() {
            return UXFlagName.BLACK_WIDOW_EDUCATION_WIDGET_LINKING;
        }
    };
    public static final UXFlagNameDto BLACK_WIDOW_SIGNED_LEGEND_AGREEMENT = new UXFlagNameDto("BLACK_WIDOW_SIGNED_LEGEND_AGREEMENT", 5) { // from class: hippo.model.v1.UXFlagNameDto.BLACK_WIDOW_SIGNED_LEGEND_AGREEMENT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public UXFlagName toProto() {
            return UXFlagName.BLACK_WIDOW_SIGNED_LEGEND_AGREEMENT;
        }
    };
    public static final UXFlagNameDto BLACK_WIDOW_FIRST_LAYOUT_CREATED = new UXFlagNameDto("BLACK_WIDOW_FIRST_LAYOUT_CREATED", 6) { // from class: hippo.model.v1.UXFlagNameDto.BLACK_WIDOW_FIRST_LAYOUT_CREATED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public UXFlagName toProto() {
            return UXFlagName.BLACK_WIDOW_FIRST_LAYOUT_CREATED;
        }
    };
    public static final UXFlagNameDto BLACK_WIDOW_FIRST_WIDGET_ADDED = new UXFlagNameDto("BLACK_WIDOW_FIRST_WIDGET_ADDED", 7) { // from class: hippo.model.v1.UXFlagNameDto.BLACK_WIDOW_FIRST_WIDGET_ADDED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public UXFlagName toProto() {
            return UXFlagName.BLACK_WIDOW_FIRST_WIDGET_ADDED;
        }
    };
    public static final UXFlagNameDto BLACK_WIDOW_FIRST_SINGLE_LEG_TRADE = new UXFlagNameDto("BLACK_WIDOW_FIRST_SINGLE_LEG_TRADE", 8) { // from class: hippo.model.v1.UXFlagNameDto.BLACK_WIDOW_FIRST_SINGLE_LEG_TRADE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public UXFlagName toProto() {
            return UXFlagName.BLACK_WIDOW_FIRST_SINGLE_LEG_TRADE;
        }
    };
    public static final UXFlagNameDto BLACK_WIDOW_FIRST_MULTI_LEG_TRADE = new UXFlagNameDto("BLACK_WIDOW_FIRST_MULTI_LEG_TRADE", 9) { // from class: hippo.model.v1.UXFlagNameDto.BLACK_WIDOW_FIRST_MULTI_LEG_TRADE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public UXFlagName toProto() {
            return UXFlagName.BLACK_WIDOW_FIRST_MULTI_LEG_TRADE;
        }
    };
    public static final UXFlagNameDto BLACK_WIDOW_EDUCATION_OPTION_CHAIN_L2 = new UXFlagNameDto("BLACK_WIDOW_EDUCATION_OPTION_CHAIN_L2", 10) { // from class: hippo.model.v1.UXFlagNameDto.BLACK_WIDOW_EDUCATION_OPTION_CHAIN_L2
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public UXFlagName toProto() {
            return UXFlagName.BLACK_WIDOW_EDUCATION_OPTION_CHAIN_L2;
        }
    };
    public static final UXFlagNameDto BLACK_WIDOW_EDUCATION_OPTION_CHAIN_L3 = new UXFlagNameDto("BLACK_WIDOW_EDUCATION_OPTION_CHAIN_L3", 11) { // from class: hippo.model.v1.UXFlagNameDto.BLACK_WIDOW_EDUCATION_OPTION_CHAIN_L3
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public UXFlagName toProto() {
            return UXFlagName.BLACK_WIDOW_EDUCATION_OPTION_CHAIN_L3;
        }
    };
    public static final UXFlagNameDto BLACK_WIDOW_EDUCATION_FEATURE_DISCOVERY = new UXFlagNameDto("BLACK_WIDOW_EDUCATION_FEATURE_DISCOVERY", 12) { // from class: hippo.model.v1.UXFlagNameDto.BLACK_WIDOW_EDUCATION_FEATURE_DISCOVERY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public UXFlagName toProto() {
            return UXFlagName.BLACK_WIDOW_EDUCATION_FEATURE_DISCOVERY;
        }
    };
    public static final UXFlagNameDto BLACK_WIDOW_EDUCATION_VOLUME_AS_INDICATOR = new UXFlagNameDto("BLACK_WIDOW_EDUCATION_VOLUME_AS_INDICATOR", 13) { // from class: hippo.model.v1.UXFlagNameDto.BLACK_WIDOW_EDUCATION_VOLUME_AS_INDICATOR
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public UXFlagName toProto() {
            return UXFlagName.BLACK_WIDOW_EDUCATION_VOLUME_AS_INDICATOR;
        }
    };
    public static final UXFlagNameDto BLACK_WIDOW_EDUCATION_OPTION_CHART_LINKED_DERIVATIVE = new UXFlagNameDto("BLACK_WIDOW_EDUCATION_OPTION_CHART_LINKED_DERIVATIVE", 14) { // from class: hippo.model.v1.UXFlagNameDto.BLACK_WIDOW_EDUCATION_OPTION_CHART_LINKED_DERIVATIVE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public UXFlagName toProto() {
            return UXFlagName.BLACK_WIDOW_EDUCATION_OPTION_CHART_LINKED_DERIVATIVE;
        }
    };
    public static final UXFlagNameDto BLACK_WIDOW_EDUCATION_CHART_DRAWINGS_SYNC = new UXFlagNameDto("BLACK_WIDOW_EDUCATION_CHART_DRAWINGS_SYNC", 15) { // from class: hippo.model.v1.UXFlagNameDto.BLACK_WIDOW_EDUCATION_CHART_DRAWINGS_SYNC
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public UXFlagName toProto() {
            return UXFlagName.BLACK_WIDOW_EDUCATION_CHART_DRAWINGS_SYNC;
        }
    };
    public static final UXFlagNameDto BLACK_WIDOW_OPTION_CHAIN_ANALYZER = new UXFlagNameDto("BLACK_WIDOW_OPTION_CHAIN_ANALYZER", 16) { // from class: hippo.model.v1.UXFlagNameDto.BLACK_WIDOW_OPTION_CHAIN_ANALYZER
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public UXFlagName toProto() {
            return UXFlagName.BLACK_WIDOW_OPTION_CHAIN_ANALYZER;
        }
    };
    public static final UXFlagNameDto BLACK_WIDOW_MAC_POSITION_PILL_OPENED = new UXFlagNameDto("BLACK_WIDOW_MAC_POSITION_PILL_OPENED", 17) { // from class: hippo.model.v1.UXFlagNameDto.BLACK_WIDOW_MAC_POSITION_PILL_OPENED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public UXFlagName toProto() {
            return UXFlagName.BLACK_WIDOW_MAC_POSITION_PILL_OPENED;
        }
    };
    public static final UXFlagNameDto BLACK_WIDOW_EDUCATION_OPTION_CHAIN_ANALYZER = new UXFlagNameDto("BLACK_WIDOW_EDUCATION_OPTION_CHAIN_ANALYZER", 18) { // from class: hippo.model.v1.UXFlagNameDto.BLACK_WIDOW_EDUCATION_OPTION_CHAIN_ANALYZER
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public UXFlagName toProto() {
            return UXFlagName.BLACK_WIDOW_EDUCATION_OPTION_CHAIN_ANALYZER;
        }
    };
    public static final UXFlagNameDto BLACK_WIDOW_SHOULD_DEFAULT_TO_LEGEND = new UXFlagNameDto("BLACK_WIDOW_SHOULD_DEFAULT_TO_LEGEND", 19) { // from class: hippo.model.v1.UXFlagNameDto.BLACK_WIDOW_SHOULD_DEFAULT_TO_LEGEND
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public UXFlagName toProto() {
            return UXFlagName.BLACK_WIDOW_SHOULD_DEFAULT_TO_LEGEND;
        }
    };
    public static final UXFlagNameDto BLACK_WIDOW_HAS_DEFAULTED_TO_LEGEND = new UXFlagNameDto("BLACK_WIDOW_HAS_DEFAULTED_TO_LEGEND", 20) { // from class: hippo.model.v1.UXFlagNameDto.BLACK_WIDOW_HAS_DEFAULTED_TO_LEGEND
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public UXFlagName toProto() {
            return UXFlagName.BLACK_WIDOW_HAS_DEFAULTED_TO_LEGEND;
        }
    };
    public static final UXFlagNameDto BLACK_WIDOW_DEFAULT_TO_LEGEND = new UXFlagNameDto("BLACK_WIDOW_DEFAULT_TO_LEGEND", 21) { // from class: hippo.model.v1.UXFlagNameDto.BLACK_WIDOW_DEFAULT_TO_LEGEND
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public UXFlagName toProto() {
            return UXFlagName.BLACK_WIDOW_DEFAULT_TO_LEGEND;
        }
    };
    public static final UXFlagNameDto BLACK_WIDOW_HAS_SEEN_DEFAULT_TO_LEGEND_BANNER = new UXFlagNameDto("BLACK_WIDOW_HAS_SEEN_DEFAULT_TO_LEGEND_BANNER", 22) { // from class: hippo.model.v1.UXFlagNameDto.BLACK_WIDOW_HAS_SEEN_DEFAULT_TO_LEGEND_BANNER
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public UXFlagName toProto() {
            return UXFlagName.BLACK_WIDOW_HAS_SEEN_DEFAULT_TO_LEGEND_BANNER;
        }
    };
    public static final UXFlagNameDto BLACK_WIDOW_DEFAULT_WEB_CLIENT = new UXFlagNameDto("BLACK_WIDOW_DEFAULT_WEB_CLIENT", 23) { // from class: hippo.model.v1.UXFlagNameDto.BLACK_WIDOW_DEFAULT_WEB_CLIENT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public UXFlagName toProto() {
            return UXFlagName.BLACK_WIDOW_DEFAULT_WEB_CLIENT;
        }
    };
    public static final UXFlagNameDto BLACK_WIDOW_FIRST_WIDGET_ADDED_OPTIONS_INTEREST = new UXFlagNameDto("BLACK_WIDOW_FIRST_WIDGET_ADDED_OPTIONS_INTEREST", 24) { // from class: hippo.model.v1.UXFlagNameDto.BLACK_WIDOW_FIRST_WIDGET_ADDED_OPTIONS_INTEREST
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public UXFlagName toProto() {
            return UXFlagName.BLACK_WIDOW_FIRST_WIDGET_ADDED_OPTIONS_INTEREST;
        }
    };
    public static final UXFlagNameDto BLACK_WIDOW_EDUCATION_CUSTOMIZE_LAYOUT = new UXFlagNameDto("BLACK_WIDOW_EDUCATION_CUSTOMIZE_LAYOUT", 25) { // from class: hippo.model.v1.UXFlagNameDto.BLACK_WIDOW_EDUCATION_CUSTOMIZE_LAYOUT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public UXFlagName toProto() {
            return UXFlagName.BLACK_WIDOW_EDUCATION_CUSTOMIZE_LAYOUT;
        }
    };
    public static final UXFlagNameDto BLACK_WIDOW_OPTIONS_TEMPLATE_APPLIED = new UXFlagNameDto("BLACK_WIDOW_OPTIONS_TEMPLATE_APPLIED", 26) { // from class: hippo.model.v1.UXFlagNameDto.BLACK_WIDOW_OPTIONS_TEMPLATE_APPLIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public UXFlagName toProto() {
            return UXFlagName.BLACK_WIDOW_OPTIONS_TEMPLATE_APPLIED;
        }
    };
    public static final UXFlagNameDto ADVISORY_ANDROID_RETURNS_HUB_BENCHMARK_INFO = new UXFlagNameDto("ADVISORY_ANDROID_RETURNS_HUB_BENCHMARK_INFO", 27) { // from class: hippo.model.v1.UXFlagNameDto.ADVISORY_ANDROID_RETURNS_HUB_BENCHMARK_INFO
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public UXFlagName toProto() {
            return UXFlagName.ADVISORY_ANDROID_RETURNS_HUB_BENCHMARK_INFO;
        }
    };
    public static final UXFlagNameDto BLACK_WIDOW_EDUCATION_OPTION_ORDER_FORM_LINKED_LEGS = new UXFlagNameDto("BLACK_WIDOW_EDUCATION_OPTION_ORDER_FORM_LINKED_LEGS", 28) { // from class: hippo.model.v1.UXFlagNameDto.BLACK_WIDOW_EDUCATION_OPTION_ORDER_FORM_LINKED_LEGS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public UXFlagName toProto() {
            return UXFlagName.BLACK_WIDOW_EDUCATION_OPTION_ORDER_FORM_LINKED_LEGS;
        }
    };
    public static final UXFlagNameDto BLACK_WIDOW_EDUCATION_OPTIONS_INTEREST_FIRST_WIDGET = new UXFlagNameDto("BLACK_WIDOW_EDUCATION_OPTIONS_INTEREST_FIRST_WIDGET", 29) { // from class: hippo.model.v1.UXFlagNameDto.BLACK_WIDOW_EDUCATION_OPTIONS_INTEREST_FIRST_WIDGET
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public UXFlagName toProto() {
            return UXFlagName.BLACK_WIDOW_EDUCATION_OPTIONS_INTEREST_FIRST_WIDGET;
        }
    };
    public static final UXFlagNameDto EQUITY_SHORT_SELLING_NEW_USER_EXPERIENCE = new UXFlagNameDto("EQUITY_SHORT_SELLING_NEW_USER_EXPERIENCE", 30) { // from class: hippo.model.v1.UXFlagNameDto.EQUITY_SHORT_SELLING_NEW_USER_EXPERIENCE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public UXFlagName toProto() {
            return UXFlagName.EQUITY_SHORT_SELLING_NEW_USER_EXPERIENCE;
        }
    };
    public static final UXFlagNameDto EQUITY_SHORT_SELLING_SHIMMER = new UXFlagNameDto("EQUITY_SHORT_SELLING_SHIMMER", 31) { // from class: hippo.model.v1.UXFlagNameDto.EQUITY_SHORT_SELLING_SHIMMER
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public UXFlagName toProto() {
            return UXFlagName.EQUITY_SHORT_SELLING_SHIMMER;
        }
    };
    public static final UXFlagNameDto BLACK_WIDOW_LADDER_APP_SETTINGS_DISMISSED = new UXFlagNameDto("BLACK_WIDOW_LADDER_APP_SETTINGS_DISMISSED", 32) { // from class: hippo.model.v1.UXFlagNameDto.BLACK_WIDOW_LADDER_APP_SETTINGS_DISMISSED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public UXFlagName toProto() {
            return UXFlagName.BLACK_WIDOW_LADDER_APP_SETTINGS_DISMISSED;
        }
    };
    public static final UXFlagNameDto BLACK_WIDOW_EDUCATION_WIDGET_AUTO_SEND = new UXFlagNameDto("BLACK_WIDOW_EDUCATION_WIDGET_AUTO_SEND", 33) { // from class: hippo.model.v1.UXFlagNameDto.BLACK_WIDOW_EDUCATION_WIDGET_AUTO_SEND
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public UXFlagName toProto() {
            return UXFlagName.BLACK_WIDOW_EDUCATION_WIDGET_AUTO_SEND;
        }
    };
    public static final UXFlagNameDto BLACK_WIDOW_EDUCATION_PRIVACY_MODE = new UXFlagNameDto("BLACK_WIDOW_EDUCATION_PRIVACY_MODE", 34) { // from class: hippo.model.v1.UXFlagNameDto.BLACK_WIDOW_EDUCATION_PRIVACY_MODE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public UXFlagName toProto() {
            return UXFlagName.BLACK_WIDOW_EDUCATION_PRIVACY_MODE;
        }
    };
    public static final UXFlagNameDto BLACK_WIDOW_LADDER_APP_SETTINGS_SHOWN = new UXFlagNameDto("BLACK_WIDOW_LADDER_APP_SETTINGS_SHOWN", 35) { // from class: hippo.model.v1.UXFlagNameDto.BLACK_WIDOW_LADDER_APP_SETTINGS_SHOWN
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public UXFlagName toProto() {
            return UXFlagName.BLACK_WIDOW_LADDER_APP_SETTINGS_SHOWN;
        }
    };
    public static final UXFlagNameDto BLACK_WIDOW_HOTKEY_AUTO_SEND_ORDER_CONFIRMATION_SHOWN = new UXFlagNameDto("BLACK_WIDOW_HOTKEY_AUTO_SEND_ORDER_CONFIRMATION_SHOWN", 36) { // from class: hippo.model.v1.UXFlagNameDto.BLACK_WIDOW_HOTKEY_AUTO_SEND_ORDER_CONFIRMATION_SHOWN
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public UXFlagName toProto() {
            return UXFlagName.BLACK_WIDOW_HOTKEY_AUTO_SEND_ORDER_CONFIRMATION_SHOWN;
        }
    };
    public static final UXFlagNameDto EQUITY_TAX_LOTS_NEW_LABEL = new UXFlagNameDto("EQUITY_TAX_LOTS_NEW_LABEL", 37) { // from class: hippo.model.v1.UXFlagNameDto.EQUITY_TAX_LOTS_NEW_LABEL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public UXFlagName toProto() {
            return UXFlagName.EQUITY_TAX_LOTS_NEW_LABEL;
        }
    };

    private static final /* synthetic */ UXFlagNameDto[] $values() {
        return new UXFlagNameDto[]{UX_FLAG_NAME_UNSPECIFIED, BLACK_WIDOW_EDUCATION_FIRST_TRADE, BLACK_WIDOW_EDUCATION_ADD_LAYOUT, ONBOARDING_WEB_CLIENT_PREFERENCE, BLACK_WIDOW_EDUCATION_WIDGET_LINKING, BLACK_WIDOW_SIGNED_LEGEND_AGREEMENT, BLACK_WIDOW_FIRST_LAYOUT_CREATED, BLACK_WIDOW_FIRST_WIDGET_ADDED, BLACK_WIDOW_FIRST_SINGLE_LEG_TRADE, BLACK_WIDOW_FIRST_MULTI_LEG_TRADE, BLACK_WIDOW_EDUCATION_OPTION_CHAIN_L2, BLACK_WIDOW_EDUCATION_OPTION_CHAIN_L3, BLACK_WIDOW_EDUCATION_FEATURE_DISCOVERY, BLACK_WIDOW_EDUCATION_VOLUME_AS_INDICATOR, BLACK_WIDOW_EDUCATION_OPTION_CHART_LINKED_DERIVATIVE, BLACK_WIDOW_EDUCATION_CHART_DRAWINGS_SYNC, BLACK_WIDOW_OPTION_CHAIN_ANALYZER, BLACK_WIDOW_MAC_POSITION_PILL_OPENED, BLACK_WIDOW_EDUCATION_OPTION_CHAIN_ANALYZER, BLACK_WIDOW_SHOULD_DEFAULT_TO_LEGEND, BLACK_WIDOW_HAS_DEFAULTED_TO_LEGEND, BLACK_WIDOW_DEFAULT_TO_LEGEND, BLACK_WIDOW_HAS_SEEN_DEFAULT_TO_LEGEND_BANNER, BLACK_WIDOW_DEFAULT_WEB_CLIENT, BLACK_WIDOW_FIRST_WIDGET_ADDED_OPTIONS_INTEREST, BLACK_WIDOW_EDUCATION_CUSTOMIZE_LAYOUT, BLACK_WIDOW_OPTIONS_TEMPLATE_APPLIED, ADVISORY_ANDROID_RETURNS_HUB_BENCHMARK_INFO, BLACK_WIDOW_EDUCATION_OPTION_ORDER_FORM_LINKED_LEGS, BLACK_WIDOW_EDUCATION_OPTIONS_INTEREST_FIRST_WIDGET, EQUITY_SHORT_SELLING_NEW_USER_EXPERIENCE, EQUITY_SHORT_SELLING_SHIMMER, BLACK_WIDOW_LADDER_APP_SETTINGS_DISMISSED, BLACK_WIDOW_EDUCATION_WIDGET_AUTO_SEND, BLACK_WIDOW_EDUCATION_PRIVACY_MODE, BLACK_WIDOW_LADDER_APP_SETTINGS_SHOWN, BLACK_WIDOW_HOTKEY_AUTO_SEND_ORDER_CONFIRMATION_SHOWN, EQUITY_TAX_LOTS_NEW_LABEL};
    }

    public /* synthetic */ UXFlagNameDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<UXFlagNameDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private UXFlagNameDto(String str, int i) {
    }

    static {
        UXFlagNameDto[] uXFlagNameDtoArr$values = $values();
        $VALUES = uXFlagNameDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(uXFlagNameDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: hippo.model.v1.UXFlagNameDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UXFlagNameDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: UXFlagNameDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lhippo/model/v1/UXFlagNameDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lhippo/model/v1/UXFlagNameDto;", "Lhippo/model/v1/UXFlagName;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lhippo/model/v1/UXFlagNameDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<UXFlagNameDto, UXFlagName> {

        /* compiled from: UXFlagNameDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[UXFlagName.values().length];
                try {
                    iArr[UXFlagName.UX_FLAG_NAME_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[UXFlagName.BLACK_WIDOW_EDUCATION_FIRST_TRADE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[UXFlagName.BLACK_WIDOW_EDUCATION_ADD_LAYOUT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[UXFlagName.ONBOARDING_WEB_CLIENT_PREFERENCE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[UXFlagName.BLACK_WIDOW_EDUCATION_WIDGET_LINKING.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[UXFlagName.BLACK_WIDOW_SIGNED_LEGEND_AGREEMENT.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[UXFlagName.BLACK_WIDOW_FIRST_LAYOUT_CREATED.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[UXFlagName.BLACK_WIDOW_FIRST_WIDGET_ADDED.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[UXFlagName.BLACK_WIDOW_FIRST_SINGLE_LEG_TRADE.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[UXFlagName.BLACK_WIDOW_FIRST_MULTI_LEG_TRADE.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[UXFlagName.BLACK_WIDOW_EDUCATION_OPTION_CHAIN_L2.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[UXFlagName.BLACK_WIDOW_EDUCATION_OPTION_CHAIN_L3.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[UXFlagName.BLACK_WIDOW_EDUCATION_FEATURE_DISCOVERY.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[UXFlagName.BLACK_WIDOW_EDUCATION_VOLUME_AS_INDICATOR.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[UXFlagName.BLACK_WIDOW_EDUCATION_OPTION_CHART_LINKED_DERIVATIVE.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[UXFlagName.BLACK_WIDOW_EDUCATION_CHART_DRAWINGS_SYNC.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[UXFlagName.BLACK_WIDOW_OPTION_CHAIN_ANALYZER.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[UXFlagName.BLACK_WIDOW_MAC_POSITION_PILL_OPENED.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[UXFlagName.BLACK_WIDOW_EDUCATION_OPTION_CHAIN_ANALYZER.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[UXFlagName.BLACK_WIDOW_SHOULD_DEFAULT_TO_LEGEND.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[UXFlagName.BLACK_WIDOW_HAS_DEFAULTED_TO_LEGEND.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[UXFlagName.BLACK_WIDOW_DEFAULT_TO_LEGEND.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[UXFlagName.BLACK_WIDOW_HAS_SEEN_DEFAULT_TO_LEGEND_BANNER.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[UXFlagName.BLACK_WIDOW_DEFAULT_WEB_CLIENT.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[UXFlagName.BLACK_WIDOW_FIRST_WIDGET_ADDED_OPTIONS_INTEREST.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[UXFlagName.BLACK_WIDOW_EDUCATION_CUSTOMIZE_LAYOUT.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[UXFlagName.BLACK_WIDOW_OPTIONS_TEMPLATE_APPLIED.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[UXFlagName.ADVISORY_ANDROID_RETURNS_HUB_BENCHMARK_INFO.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[UXFlagName.BLACK_WIDOW_EDUCATION_OPTION_ORDER_FORM_LINKED_LEGS.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[UXFlagName.BLACK_WIDOW_EDUCATION_OPTIONS_INTEREST_FIRST_WIDGET.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[UXFlagName.EQUITY_SHORT_SELLING_NEW_USER_EXPERIENCE.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[UXFlagName.EQUITY_SHORT_SELLING_SHIMMER.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[UXFlagName.BLACK_WIDOW_LADDER_APP_SETTINGS_DISMISSED.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[UXFlagName.BLACK_WIDOW_EDUCATION_WIDGET_AUTO_SEND.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[UXFlagName.BLACK_WIDOW_EDUCATION_PRIVACY_MODE.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[UXFlagName.BLACK_WIDOW_LADDER_APP_SETTINGS_SHOWN.ordinal()] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[UXFlagName.BLACK_WIDOW_HOTKEY_AUTO_SEND_ORDER_CONFIRMATION_SHOWN.ordinal()] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr[UXFlagName.EQUITY_TAX_LOTS_NEW_LABEL.ordinal()] = 38;
                } catch (NoSuchFieldError unused38) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<UXFlagNameDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<UXFlagNameDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<UXFlagNameDto> getBinaryBase64Serializer() {
            return (KSerializer) UXFlagNameDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<UXFlagName> getProtoAdapter() {
            return UXFlagName.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public UXFlagNameDto getZeroValue() {
            return UXFlagNameDto.UX_FLAG_NAME_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public UXFlagNameDto fromProto(UXFlagName proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return UXFlagNameDto.UX_FLAG_NAME_UNSPECIFIED;
                case 2:
                    return UXFlagNameDto.BLACK_WIDOW_EDUCATION_FIRST_TRADE;
                case 3:
                    return UXFlagNameDto.BLACK_WIDOW_EDUCATION_ADD_LAYOUT;
                case 4:
                    return UXFlagNameDto.ONBOARDING_WEB_CLIENT_PREFERENCE;
                case 5:
                    return UXFlagNameDto.BLACK_WIDOW_EDUCATION_WIDGET_LINKING;
                case 6:
                    return UXFlagNameDto.BLACK_WIDOW_SIGNED_LEGEND_AGREEMENT;
                case 7:
                    return UXFlagNameDto.BLACK_WIDOW_FIRST_LAYOUT_CREATED;
                case 8:
                    return UXFlagNameDto.BLACK_WIDOW_FIRST_WIDGET_ADDED;
                case 9:
                    return UXFlagNameDto.BLACK_WIDOW_FIRST_SINGLE_LEG_TRADE;
                case 10:
                    return UXFlagNameDto.BLACK_WIDOW_FIRST_MULTI_LEG_TRADE;
                case 11:
                    return UXFlagNameDto.BLACK_WIDOW_EDUCATION_OPTION_CHAIN_L2;
                case 12:
                    return UXFlagNameDto.BLACK_WIDOW_EDUCATION_OPTION_CHAIN_L3;
                case 13:
                    return UXFlagNameDto.BLACK_WIDOW_EDUCATION_FEATURE_DISCOVERY;
                case 14:
                    return UXFlagNameDto.BLACK_WIDOW_EDUCATION_VOLUME_AS_INDICATOR;
                case 15:
                    return UXFlagNameDto.BLACK_WIDOW_EDUCATION_OPTION_CHART_LINKED_DERIVATIVE;
                case 16:
                    return UXFlagNameDto.BLACK_WIDOW_EDUCATION_CHART_DRAWINGS_SYNC;
                case 17:
                    return UXFlagNameDto.BLACK_WIDOW_OPTION_CHAIN_ANALYZER;
                case 18:
                    return UXFlagNameDto.BLACK_WIDOW_MAC_POSITION_PILL_OPENED;
                case 19:
                    return UXFlagNameDto.BLACK_WIDOW_EDUCATION_OPTION_CHAIN_ANALYZER;
                case 20:
                    return UXFlagNameDto.BLACK_WIDOW_SHOULD_DEFAULT_TO_LEGEND;
                case 21:
                    return UXFlagNameDto.BLACK_WIDOW_HAS_DEFAULTED_TO_LEGEND;
                case 22:
                    return UXFlagNameDto.BLACK_WIDOW_DEFAULT_TO_LEGEND;
                case 23:
                    return UXFlagNameDto.BLACK_WIDOW_HAS_SEEN_DEFAULT_TO_LEGEND_BANNER;
                case 24:
                    return UXFlagNameDto.BLACK_WIDOW_DEFAULT_WEB_CLIENT;
                case 25:
                    return UXFlagNameDto.BLACK_WIDOW_FIRST_WIDGET_ADDED_OPTIONS_INTEREST;
                case 26:
                    return UXFlagNameDto.BLACK_WIDOW_EDUCATION_CUSTOMIZE_LAYOUT;
                case 27:
                    return UXFlagNameDto.BLACK_WIDOW_OPTIONS_TEMPLATE_APPLIED;
                case 28:
                    return UXFlagNameDto.ADVISORY_ANDROID_RETURNS_HUB_BENCHMARK_INFO;
                case 29:
                    return UXFlagNameDto.BLACK_WIDOW_EDUCATION_OPTION_ORDER_FORM_LINKED_LEGS;
                case 30:
                    return UXFlagNameDto.BLACK_WIDOW_EDUCATION_OPTIONS_INTEREST_FIRST_WIDGET;
                case 31:
                    return UXFlagNameDto.EQUITY_SHORT_SELLING_NEW_USER_EXPERIENCE;
                case 32:
                    return UXFlagNameDto.EQUITY_SHORT_SELLING_SHIMMER;
                case 33:
                    return UXFlagNameDto.BLACK_WIDOW_LADDER_APP_SETTINGS_DISMISSED;
                case 34:
                    return UXFlagNameDto.BLACK_WIDOW_EDUCATION_WIDGET_AUTO_SEND;
                case 35:
                    return UXFlagNameDto.BLACK_WIDOW_EDUCATION_PRIVACY_MODE;
                case 36:
                    return UXFlagNameDto.BLACK_WIDOW_LADDER_APP_SETTINGS_SHOWN;
                case 37:
                    return UXFlagNameDto.BLACK_WIDOW_HOTKEY_AUTO_SEND_ORDER_CONFIRMATION_SHOWN;
                case 38:
                    return UXFlagNameDto.EQUITY_TAX_LOTS_NEW_LABEL;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: UXFlagNameDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lhippo/model/v1/UXFlagNameDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lhippo/model/v1/UXFlagNameDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<UXFlagNameDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<UXFlagNameDto, UXFlagName> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/hippo.model.v1.UXFlagName", UXFlagNameDto.getEntries(), UXFlagNameDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public UXFlagNameDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (UXFlagNameDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, UXFlagNameDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static UXFlagNameDto valueOf(String str) {
        return (UXFlagNameDto) Enum.valueOf(UXFlagNameDto.class, str);
    }

    public static UXFlagNameDto[] values() {
        return (UXFlagNameDto[]) $VALUES.clone();
    }
}
