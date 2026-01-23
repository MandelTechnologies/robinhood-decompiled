package black_widow_bff.model.p025v1;

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
/* compiled from: AppChannelDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\"#B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006$"}, m3636d2 = {"Lblack_widow_bff/model/v1/AppChannelDto;", "Lcom/robinhood/idl/EnumDto;", "Lblack_widow_bff/model/v1/AppChannel;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "APP_CHANNEL_UNSPECIFIED", "PRODUCTION", "BASELINE", "CANARY", "BETA", "ALPHA", "LOCAL", "APOLLO", "BROWSER_TESTS", "QA_PROD", "QA_DEV", "LOCAL_TEST", "ANDROID_APP_BETA", "ANDROID_APP_DEV", "ANDROID_APP_NIGHTLY", "ANDROID_APP_PROD", "IOS_APP_BETA", "IOS_APP_DEV", "IOS_APP_NIGHTLY", "IOS_APP_PROD", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "black_widow_bff.service.v1.model_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public abstract class AppChannelDto implements Dto2<AppChannel>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AppChannelDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<AppChannelDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AppChannelDto, AppChannel>> binaryBase64Serializer$delegate;
    public static final AppChannelDto APP_CHANNEL_UNSPECIFIED = new AppChannelDto("APP_CHANNEL_UNSPECIFIED", 0) { // from class: black_widow_bff.model.v1.AppChannelDto.APP_CHANNEL_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AppChannel toProto() {
            return AppChannel.APP_CHANNEL_UNSPECIFIED;
        }
    };
    public static final AppChannelDto PRODUCTION = new AppChannelDto("PRODUCTION", 1) { // from class: black_widow_bff.model.v1.AppChannelDto.PRODUCTION
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AppChannel toProto() {
            return AppChannel.PRODUCTION;
        }
    };
    public static final AppChannelDto BASELINE = new AppChannelDto("BASELINE", 2) { // from class: black_widow_bff.model.v1.AppChannelDto.BASELINE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AppChannel toProto() {
            return AppChannel.BASELINE;
        }
    };
    public static final AppChannelDto CANARY = new AppChannelDto("CANARY", 3) { // from class: black_widow_bff.model.v1.AppChannelDto.CANARY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AppChannel toProto() {
            return AppChannel.CANARY;
        }
    };
    public static final AppChannelDto BETA = new AppChannelDto("BETA", 4) { // from class: black_widow_bff.model.v1.AppChannelDto.BETA
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AppChannel toProto() {
            return AppChannel.BETA;
        }
    };
    public static final AppChannelDto ALPHA = new AppChannelDto("ALPHA", 5) { // from class: black_widow_bff.model.v1.AppChannelDto.ALPHA
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AppChannel toProto() {
            return AppChannel.ALPHA;
        }
    };
    public static final AppChannelDto LOCAL = new AppChannelDto("LOCAL", 6) { // from class: black_widow_bff.model.v1.AppChannelDto.LOCAL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AppChannel toProto() {
            return AppChannel.LOCAL;
        }
    };
    public static final AppChannelDto APOLLO = new AppChannelDto("APOLLO", 7) { // from class: black_widow_bff.model.v1.AppChannelDto.APOLLO
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AppChannel toProto() {
            return AppChannel.APOLLO;
        }
    };
    public static final AppChannelDto BROWSER_TESTS = new AppChannelDto("BROWSER_TESTS", 8) { // from class: black_widow_bff.model.v1.AppChannelDto.BROWSER_TESTS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AppChannel toProto() {
            return AppChannel.BROWSER_TESTS;
        }
    };
    public static final AppChannelDto QA_PROD = new AppChannelDto("QA_PROD", 9) { // from class: black_widow_bff.model.v1.AppChannelDto.QA_PROD
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AppChannel toProto() {
            return AppChannel.QA_PROD;
        }
    };
    public static final AppChannelDto QA_DEV = new AppChannelDto("QA_DEV", 10) { // from class: black_widow_bff.model.v1.AppChannelDto.QA_DEV
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AppChannel toProto() {
            return AppChannel.QA_DEV;
        }
    };
    public static final AppChannelDto LOCAL_TEST = new AppChannelDto("LOCAL_TEST", 11) { // from class: black_widow_bff.model.v1.AppChannelDto.LOCAL_TEST
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AppChannel toProto() {
            return AppChannel.LOCAL_TEST;
        }
    };
    public static final AppChannelDto ANDROID_APP_BETA = new AppChannelDto("ANDROID_APP_BETA", 12) { // from class: black_widow_bff.model.v1.AppChannelDto.ANDROID_APP_BETA
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AppChannel toProto() {
            return AppChannel.ANDROID_APP_BETA;
        }
    };
    public static final AppChannelDto ANDROID_APP_DEV = new AppChannelDto("ANDROID_APP_DEV", 13) { // from class: black_widow_bff.model.v1.AppChannelDto.ANDROID_APP_DEV
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AppChannel toProto() {
            return AppChannel.ANDROID_APP_DEV;
        }
    };
    public static final AppChannelDto ANDROID_APP_NIGHTLY = new AppChannelDto("ANDROID_APP_NIGHTLY", 14) { // from class: black_widow_bff.model.v1.AppChannelDto.ANDROID_APP_NIGHTLY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AppChannel toProto() {
            return AppChannel.ANDROID_APP_NIGHTLY;
        }
    };
    public static final AppChannelDto ANDROID_APP_PROD = new AppChannelDto("ANDROID_APP_PROD", 15) { // from class: black_widow_bff.model.v1.AppChannelDto.ANDROID_APP_PROD
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AppChannel toProto() {
            return AppChannel.ANDROID_APP_PROD;
        }
    };
    public static final AppChannelDto IOS_APP_BETA = new AppChannelDto("IOS_APP_BETA", 16) { // from class: black_widow_bff.model.v1.AppChannelDto.IOS_APP_BETA
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AppChannel toProto() {
            return AppChannel.IOS_APP_BETA;
        }
    };
    public static final AppChannelDto IOS_APP_DEV = new AppChannelDto("IOS_APP_DEV", 17) { // from class: black_widow_bff.model.v1.AppChannelDto.IOS_APP_DEV
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AppChannel toProto() {
            return AppChannel.IOS_APP_DEV;
        }
    };
    public static final AppChannelDto IOS_APP_NIGHTLY = new AppChannelDto("IOS_APP_NIGHTLY", 18) { // from class: black_widow_bff.model.v1.AppChannelDto.IOS_APP_NIGHTLY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AppChannel toProto() {
            return AppChannel.IOS_APP_NIGHTLY;
        }
    };
    public static final AppChannelDto IOS_APP_PROD = new AppChannelDto("IOS_APP_PROD", 19) { // from class: black_widow_bff.model.v1.AppChannelDto.IOS_APP_PROD
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AppChannel toProto() {
            return AppChannel.IOS_APP_PROD;
        }
    };

    private static final /* synthetic */ AppChannelDto[] $values() {
        return new AppChannelDto[]{APP_CHANNEL_UNSPECIFIED, PRODUCTION, BASELINE, CANARY, BETA, ALPHA, LOCAL, APOLLO, BROWSER_TESTS, QA_PROD, QA_DEV, LOCAL_TEST, ANDROID_APP_BETA, ANDROID_APP_DEV, ANDROID_APP_NIGHTLY, ANDROID_APP_PROD, IOS_APP_BETA, IOS_APP_DEV, IOS_APP_NIGHTLY, IOS_APP_PROD};
    }

    public /* synthetic */ AppChannelDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<AppChannelDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AppChannelDto(String str, int i) {
    }

    static {
        AppChannelDto[] appChannelDtoArr$values = $values();
        $VALUES = appChannelDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(appChannelDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: black_widow_bff.model.v1.AppChannelDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppChannelDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: AppChannelDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lblack_widow_bff/model/v1/AppChannelDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lblack_widow_bff/model/v1/AppChannelDto;", "Lblack_widow_bff/model/v1/AppChannel;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lblack_widow_bff/model/v1/AppChannelDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "black_widow_bff.service.v1.model_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<AppChannelDto, AppChannel> {

        /* compiled from: AppChannelDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes16.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AppChannel.values().length];
                try {
                    iArr[AppChannel.APP_CHANNEL_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AppChannel.PRODUCTION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AppChannel.BASELINE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AppChannel.CANARY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AppChannel.BETA.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AppChannel.ALPHA.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[AppChannel.LOCAL.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[AppChannel.APOLLO.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[AppChannel.BROWSER_TESTS.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[AppChannel.QA_PROD.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[AppChannel.QA_DEV.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[AppChannel.LOCAL_TEST.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[AppChannel.ANDROID_APP_BETA.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[AppChannel.ANDROID_APP_DEV.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[AppChannel.ANDROID_APP_NIGHTLY.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[AppChannel.ANDROID_APP_PROD.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[AppChannel.IOS_APP_BETA.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[AppChannel.IOS_APP_DEV.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[AppChannel.IOS_APP_NIGHTLY.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[AppChannel.IOS_APP_PROD.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AppChannelDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AppChannelDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AppChannelDto> getBinaryBase64Serializer() {
            return (KSerializer) AppChannelDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AppChannel> getProtoAdapter() {
            return AppChannel.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AppChannelDto getZeroValue() {
            return AppChannelDto.APP_CHANNEL_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AppChannelDto fromProto(AppChannel proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return AppChannelDto.APP_CHANNEL_UNSPECIFIED;
                case 2:
                    return AppChannelDto.PRODUCTION;
                case 3:
                    return AppChannelDto.BASELINE;
                case 4:
                    return AppChannelDto.CANARY;
                case 5:
                    return AppChannelDto.BETA;
                case 6:
                    return AppChannelDto.ALPHA;
                case 7:
                    return AppChannelDto.LOCAL;
                case 8:
                    return AppChannelDto.APOLLO;
                case 9:
                    return AppChannelDto.BROWSER_TESTS;
                case 10:
                    return AppChannelDto.QA_PROD;
                case 11:
                    return AppChannelDto.QA_DEV;
                case 12:
                    return AppChannelDto.LOCAL_TEST;
                case 13:
                    return AppChannelDto.ANDROID_APP_BETA;
                case 14:
                    return AppChannelDto.ANDROID_APP_DEV;
                case 15:
                    return AppChannelDto.ANDROID_APP_NIGHTLY;
                case 16:
                    return AppChannelDto.ANDROID_APP_PROD;
                case 17:
                    return AppChannelDto.IOS_APP_BETA;
                case 18:
                    return AppChannelDto.IOS_APP_DEV;
                case 19:
                    return AppChannelDto.IOS_APP_NIGHTLY;
                case 20:
                    return AppChannelDto.IOS_APP_PROD;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AppChannelDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lblack_widow_bff/model/v1/AppChannelDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lblack_widow_bff/model/v1/AppChannelDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "black_widow_bff.service.v1.model_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class Serializer implements KSerializer<AppChannelDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<AppChannelDto, AppChannel> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/black_widow_bff.model.v1.AppChannel", AppChannelDto.getEntries(), AppChannelDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public AppChannelDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (AppChannelDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AppChannelDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static AppChannelDto valueOf(String str) {
        return (AppChannelDto) Enum.valueOf(AppChannelDto.class, str);
    }

    public static AppChannelDto[] values() {
        return (AppChannelDto[]) $VALUES.clone();
    }
}
