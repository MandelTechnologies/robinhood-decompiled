package com.robinhood.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.idl.Dto2;
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
/* compiled from: BackendServiceDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\bB\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 O2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002OPB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020MH\u0016J\b\u0010N\u001a\u00020MH\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bG¨\u0006Q"}, m3636d2 = {"Lcom/robinhood/idl/BackendServiceDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/idl/BackendService;", "Landroid/os/Parcelable;", "", "backends", "Lcom/robinhood/idl/BackendsDto;", "<init>", "(Ljava/lang/String;ILcom/robinhood/idl/BackendsDto;)V", "getBackends", "()Lcom/robinhood/idl/BackendsDto;", "BACKEND_SERVICE_UNSPECIFIED", "BACKEND_SERVICE_API", "BACKEND_SERVICE_ANALYTICS", "BACKEND_SERVICE_EXPERIMENTS", "BACKEND_SERVICE_NUMMUS", "BACKEND_SERVICE_DORA", "BACKEND_SERVICE_MINERVA", "BACKEND_SERVICE_ATLAS", "BACKEND_SERVICE_BONFIRE", "BACKEND_SERVICE_CASHIER", "BACKEND_SERVICE_IDENTI", "BACKEND_SERVICE_PIMS", "BACKEND_SERVICE_PLUTO", "BACKEND_SERVICE_OPTIONS_PRODUCT", "BACKEND_SERVICE_CERES", "BACKEND_SERVICE_TEST_DATA", "BACKEND_SERVICE_INBOX_RENDERER", "BACKEND_SERVICE_IDL_SAMPLE_KIOSK", "BACKEND_SERVICE_BFF_POC_APP", "BACKEND_SERVICE_BUGSY_APP", "BACKEND_SERVICE_HIPPO", "BACKEND_SERVICE_ARSENAL", "BACKEND_SERVICE_WORMHOLE", "BACKEND_SERVICE_MERCURY", "BACKEND_SERVICE_BFF_VITALS", "BACKEND_SERVICE_BFF_CRYPTO_TRADING", "BACKEND_SERVICE_CHATBOT", "BACKEND_SERVICE_BFF_SAMPLE_APP", "BACKEND_SERVICE_PORTFOLIO", "BACKEND_SERVICE_BFF_MONEY_MOVEMENT", "BACKEND_SERVICE_BFF_RETIREMENT", "BACKEND_SERVICE_ACATS_AGGREGATION", "BACKEND_SERVICE_BILLY_MAYS", "BACKEND_SERVICE_PATHFINDER", "BACKEND_SERVICE_NIMBUS", "BACKEND_SERVICE_MIDAS", "BACKEND_SERVICE_YODA", "BACKEND_SERVICE_CRYPTO_PERPETUALS", "BACKEND_SERVICE_BLACK_WIDOW_BFF", "BACKEND_SERVICE_ACCOUNT_AGGREGATION", "BACKEND_SERVICE_MD_SERVER_PROXY", "BACKEND_SERVICE_COPILOT", "BACKEND_SERVICE_TESTCASEPROTOS", "BACKEND_SERVICE_GOKU", "BACKEND_SERVICE_AGORA", "BACKEND_SERVICE_SOCIAL_TRADING", "BACKEND_SERVICE_CONFIG_ROLLOUT", "BACKEND_SERVICE_PREDICTION_MARKETS", "BACKEND_SERVICE_BEACON", "BACKEND_SERVICE_WONKA", "BACKEND_SERVICE_POSTOFFICE", "BACKEND_SERVICE_BAFFI", "BACKEND_SERVICE_SURGE", "BACKEND_SERVICE_MONEYTREE", "BACKEND_SERVICE_BONFIRE_IDENTI", "BACKEND_SERVICE_CRYPTO_PORTKEY", "BACKEND_SERVICE_BONFIRE_CRYPTO", "BACKEND_SERVICE_FRONTEND_SERVARS", "BACKEND_SERVICE_BONFIRE_OPTIONS", "BACKEND_SERVICE_HELIOS", "BACKEND_SERVICE_RUDOLPH", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "idl.api.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public abstract class BackendServiceDto implements Dto2<BackendService>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BackendServiceDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<BackendServiceDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<BackendServiceDto, BackendService>> binaryBase64Serializer$delegate;
    private final BackendsDto backends;
    public static final BackendServiceDto BACKEND_SERVICE_UNSPECIFIED = new BackendServiceDto("BACKEND_SERVICE_UNSPECIFIED", 0) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_UNSPECIFIED
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto(""), new ApolloEndpointDto("", ""), new DockerEndpointDto(""));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_UNSPECIFIED;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_API = new BackendServiceDto("BACKEND_SERVICE_API", 1) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_API
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("api", ""), new DockerEndpointDto(""));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_API;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_ANALYTICS = new BackendServiceDto("BACKEND_SERVICE_ANALYTICS", 2) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_ANALYTICS
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://crumbs.robinhood.com/"), new ApolloEndpointDto("api", "analytics"), new DockerEndpointDto("analytics"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_ANALYTICS;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_EXPERIMENTS = new BackendServiceDto("BACKEND_SERVICE_EXPERIMENTS", 3) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_EXPERIMENTS
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("kaizen-assignment", ""), new DockerEndpointDto("kaizen-assignment"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_EXPERIMENTS;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_NUMMUS = new BackendServiceDto("BACKEND_SERVICE_NUMMUS", 4) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_NUMMUS
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://nummus.robinhood.com/"), new ApolloEndpointDto("api", "nummus"), new DockerEndpointDto("nummus"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_NUMMUS;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_DORA = new BackendServiceDto("BACKEND_SERVICE_DORA", 5) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_DORA
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://dora.robinhood.com/"), new ApolloEndpointDto("api", "dora"), new DockerEndpointDto("dora"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_DORA;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_MINERVA = new BackendServiceDto("BACKEND_SERVICE_MINERVA", 6) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_MINERVA
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://minerva.robinhood.com/"), new ApolloEndpointDto("api", "minerva"), new DockerEndpointDto("minerva"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_MINERVA;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_ATLAS = new BackendServiceDto("BACKEND_SERVICE_ATLAS", 7) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_ATLAS
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://atlas.robinhood.com/"), new ApolloEndpointDto("api", "atlas"), new DockerEndpointDto("atlas"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_ATLAS;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_BONFIRE = new BackendServiceDto("BACKEND_SERVICE_BONFIRE", 8) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_BONFIRE
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://bonfire.robinhood.com/"), new ApolloEndpointDto("api", "bonfire"), new DockerEndpointDto("bonfire"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_BONFIRE;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_CASHIER = new BackendServiceDto("BACKEND_SERVICE_CASHIER", 9) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_CASHIER
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://cashier.robinhood.com/"), new ApolloEndpointDto("api", "cashier"), new DockerEndpointDto("cashier"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_CASHIER;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_IDENTI = new BackendServiceDto("BACKEND_SERVICE_IDENTI", 10) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_IDENTI
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://identi.robinhood.com/"), new ApolloEndpointDto("api", "identi"), new DockerEndpointDto("identi"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_IDENTI;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_PIMS = new BackendServiceDto("BACKEND_SERVICE_PIMS", 11) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_PIMS
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/privacy/"), new ApolloEndpointDto("pims", "privacy"), new DockerEndpointDto("privacy"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_PIMS;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_PLUTO = new BackendServiceDto("BACKEND_SERVICE_PLUTO", 12) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_PLUTO
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/pluto/"), new ApolloEndpointDto("pluto", ""), new DockerEndpointDto("pluto"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_PLUTO;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_OPTIONS_PRODUCT = new BackendServiceDto("BACKEND_SERVICE_OPTIONS_PRODUCT", 13) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_OPTIONS_PRODUCT
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("options-product", ""), new DockerEndpointDto("options-product"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_OPTIONS_PRODUCT;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_CERES = new BackendServiceDto("BACKEND_SERVICE_CERES", 14) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_CERES
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("ceres", ""), new DockerEndpointDto("ceres"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_CERES;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_TEST_DATA = new BackendServiceDto("BACKEND_SERVICE_TEST_DATA", 15) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_TEST_DATA
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto(""), new ApolloEndpointDto("api", "test-data-api"), new DockerEndpointDto("test-data-api"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_TEST_DATA;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_INBOX_RENDERER = new BackendServiceDto("BACKEND_SERVICE_INBOX_RENDERER", 16) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_INBOX_RENDERER
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("inbox-renderer", ""), new DockerEndpointDto("inbox-renderer"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_INBOX_RENDERER;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_IDL_SAMPLE_KIOSK = new BackendServiceDto("BACKEND_SERVICE_IDL_SAMPLE_KIOSK", 17) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_IDL_SAMPLE_KIOSK
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("kiosk", ""), new DockerEndpointDto("kiosk"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_IDL_SAMPLE_KIOSK;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_BFF_POC_APP = new BackendServiceDto("BACKEND_SERVICE_BFF_POC_APP", 18) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_BFF_POC_APP
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://bff-poc-app.robinhood.com/"), new ApolloEndpointDto("bff-poc-app", ""), new DockerEndpointDto("bff-poc-app"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_BFF_POC_APP;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_BUGSY_APP = new BackendServiceDto("BACKEND_SERVICE_BUGSY_APP", 19) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_BUGSY_APP
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("bugsy-app", ""), new DockerEndpointDto("bugsy-app"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_BUGSY_APP;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_HIPPO = new BackendServiceDto("BACKEND_SERVICE_HIPPO", 20) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_HIPPO
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("hippo", ""), new DockerEndpointDto("hippo"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_HIPPO;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_ARSENAL = new BackendServiceDto("BACKEND_SERVICE_ARSENAL", 21) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_ARSENAL
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("arsenal", ""), new DockerEndpointDto("arsenal"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_ARSENAL;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_WORMHOLE = new BackendServiceDto("BACKEND_SERVICE_WORMHOLE", 22) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_WORMHOLE
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("wormhole", ""), new DockerEndpointDto("wormhole"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_WORMHOLE;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_MERCURY = new BackendServiceDto("BACKEND_SERVICE_MERCURY", 23) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_MERCURY
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("mercury", ""), new DockerEndpointDto("mercury"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_MERCURY;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_BFF_VITALS = new BackendServiceDto("BACKEND_SERVICE_BFF_VITALS", 24) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_BFF_VITALS
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("bff-vitals", ""), new DockerEndpointDto("bff-vitals"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_BFF_VITALS;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_BFF_CRYPTO_TRADING = new BackendServiceDto("BACKEND_SERVICE_BFF_CRYPTO_TRADING", 25) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_BFF_CRYPTO_TRADING
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("bff-crypto-trading", ""), new DockerEndpointDto("bff-crypto-trading"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_BFF_CRYPTO_TRADING;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_CHATBOT = new BackendServiceDto("BACKEND_SERVICE_CHATBOT", 26) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_CHATBOT
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("chatbot", ""), new DockerEndpointDto("chatbot"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_CHATBOT;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_BFF_SAMPLE_APP = new BackendServiceDto("BACKEND_SERVICE_BFF_SAMPLE_APP", 27) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_BFF_SAMPLE_APP
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("bff-sample-app", ""), new DockerEndpointDto("bff-sample-app"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_BFF_SAMPLE_APP;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_PORTFOLIO = new BackendServiceDto("BACKEND_SERVICE_PORTFOLIO", 28) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_PORTFOLIO
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto(AnalyticsStrings.TAB_NAV_TAB_BAR_PORTFOLIO, ""), new DockerEndpointDto(AnalyticsStrings.TAB_NAV_TAB_BAR_PORTFOLIO));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_PORTFOLIO;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_BFF_MONEY_MOVEMENT = new BackendServiceDto("BACKEND_SERVICE_BFF_MONEY_MOVEMENT", 29) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_BFF_MONEY_MOVEMENT
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("bff-money-movement", ""), new DockerEndpointDto("bff-money-movement"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_BFF_MONEY_MOVEMENT;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_BFF_RETIREMENT = new BackendServiceDto("BACKEND_SERVICE_BFF_RETIREMENT", 30) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_BFF_RETIREMENT
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("bff-retirement", ""), new DockerEndpointDto("bff-retirement"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_BFF_RETIREMENT;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_ACATS_AGGREGATION = new BackendServiceDto("BACKEND_SERVICE_ACATS_AGGREGATION", 31) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_ACATS_AGGREGATION
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("acats-aggregation", ""), new DockerEndpointDto("acats-aggregation"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_ACATS_AGGREGATION;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_BILLY_MAYS = new BackendServiceDto("BACKEND_SERVICE_BILLY_MAYS", 32) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_BILLY_MAYS
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("billy-mays", ""), new DockerEndpointDto("billy-mays"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_BILLY_MAYS;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_PATHFINDER = new BackendServiceDto("BACKEND_SERVICE_PATHFINDER", 33) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_PATHFINDER
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("pathfinder", ""), new DockerEndpointDto("pathfinder"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_PATHFINDER;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_NIMBUS = new BackendServiceDto("BACKEND_SERVICE_NIMBUS", 34) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_NIMBUS
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("nimbus", ""), new DockerEndpointDto("nimbus"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_NIMBUS;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_MIDAS = new BackendServiceDto("BACKEND_SERVICE_MIDAS", 35) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_MIDAS
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("midas-frontend-server", ""), new DockerEndpointDto("midas-frontend-server"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_MIDAS;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_YODA = new BackendServiceDto("BACKEND_SERVICE_YODA", 36) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_YODA
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("yoda", ""), new DockerEndpointDto("yoda"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_YODA;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_CRYPTO_PERPETUALS = new BackendServiceDto("BACKEND_SERVICE_CRYPTO_PERPETUALS", 37) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_CRYPTO_PERPETUALS
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("crypto-perpetuals", ""), new DockerEndpointDto("crypto-perpetuals"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_CRYPTO_PERPETUALS;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_BLACK_WIDOW_BFF = new BackendServiceDto("BACKEND_SERVICE_BLACK_WIDOW_BFF", 38) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_BLACK_WIDOW_BFF
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("black-widow-bff", ""), new DockerEndpointDto("black-widow-bff"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_BLACK_WIDOW_BFF;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_ACCOUNT_AGGREGATION = new BackendServiceDto("BACKEND_SERVICE_ACCOUNT_AGGREGATION", 39) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_ACCOUNT_AGGREGATION
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("account-aggregation", ""), new DockerEndpointDto("account-aggregation"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_ACCOUNT_AGGREGATION;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_MD_SERVER_PROXY = new BackendServiceDto("BACKEND_SERVICE_MD_SERVER_PROXY", 40) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_MD_SERVER_PROXY
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("md-server-proxy", ""), new DockerEndpointDto("md-server-proxy"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_MD_SERVER_PROXY;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_COPILOT = new BackendServiceDto("BACKEND_SERVICE_COPILOT", 41) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_COPILOT
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("copilot", ""), new DockerEndpointDto("copilot"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_COPILOT;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_TESTCASEPROTOS = new BackendServiceDto("BACKEND_SERVICE_TESTCASEPROTOS", 42) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_TESTCASEPROTOS
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("testcaseprotos", ""), new DockerEndpointDto("testcaseprotos"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_TESTCASEPROTOS;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_GOKU = new BackendServiceDto("BACKEND_SERVICE_GOKU", 43) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_GOKU
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("goku", ""), new DockerEndpointDto("goku"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_GOKU;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_AGORA = new BackendServiceDto("BACKEND_SERVICE_AGORA", 44) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_AGORA
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("agora", ""), new DockerEndpointDto("agora"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_AGORA;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_SOCIAL_TRADING = new BackendServiceDto("BACKEND_SERVICE_SOCIAL_TRADING", 45) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_SOCIAL_TRADING
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("social-trading", ""), new DockerEndpointDto("social-trading"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_SOCIAL_TRADING;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_CONFIG_ROLLOUT = new BackendServiceDto("BACKEND_SERVICE_CONFIG_ROLLOUT", 46) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_CONFIG_ROLLOUT
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://servars-management.robinhood.com/"), new ApolloEndpointDto("experiments-edge", ""), new DockerEndpointDto("experiment-assignment"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_CONFIG_ROLLOUT;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_PREDICTION_MARKETS = new BackendServiceDto("BACKEND_SERVICE_PREDICTION_MARKETS", 47) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_PREDICTION_MARKETS
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("prediction-markets", ""), new DockerEndpointDto("prediction-markets"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_PREDICTION_MARKETS;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_BEACON = new BackendServiceDto("BACKEND_SERVICE_BEACON", 48) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_BEACON
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("beacon", ""), new DockerEndpointDto("beacon"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_BEACON;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_WONKA = new BackendServiceDto("BACKEND_SERVICE_WONKA", 49) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_WONKA
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("wonka", ""), new DockerEndpointDto("wonka"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_WONKA;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_POSTOFFICE = new BackendServiceDto("BACKEND_SERVICE_POSTOFFICE", 50) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_POSTOFFICE
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("postoffice", ""), new DockerEndpointDto("postoffice"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_POSTOFFICE;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_BAFFI = new BackendServiceDto("BACKEND_SERVICE_BAFFI", 51) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_BAFFI
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("api", ""), new DockerEndpointDto("baffi"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_BAFFI;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_SURGE = new BackendServiceDto("BACKEND_SERVICE_SURGE", 52) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_SURGE
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("surge", ""), new DockerEndpointDto("surge"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_SURGE;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_MONEYTREE = new BackendServiceDto("BACKEND_SERVICE_MONEYTREE", 53) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_MONEYTREE
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("moneytree", ""), new DockerEndpointDto("moneytree"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_MONEYTREE;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_BONFIRE_IDENTI = new BackendServiceDto("BACKEND_SERVICE_BONFIRE_IDENTI", 54) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_BONFIRE_IDENTI
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("bonfire-identi", ""), new DockerEndpointDto("bonfire-identi"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_BONFIRE_IDENTI;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_CRYPTO_PORTKEY = new BackendServiceDto("BACKEND_SERVICE_CRYPTO_PORTKEY", 55) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_CRYPTO_PORTKEY
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("crypto-portkey", ""), new DockerEndpointDto("crypto-portkey"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_CRYPTO_PORTKEY;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_BONFIRE_CRYPTO = new BackendServiceDto("BACKEND_SERVICE_BONFIRE_CRYPTO", 56) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_BONFIRE_CRYPTO
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("bonfire-crypto", ""), new DockerEndpointDto("bonfire-crypto"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_BONFIRE_CRYPTO;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_FRONTEND_SERVARS = new BackendServiceDto("BACKEND_SERVICE_FRONTEND_SERVARS", 57) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_FRONTEND_SERVARS
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("frontend-servars", ""), new DockerEndpointDto("frontend-servars"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_FRONTEND_SERVARS;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_BONFIRE_OPTIONS = new BackendServiceDto("BACKEND_SERVICE_BONFIRE_OPTIONS", 58) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_BONFIRE_OPTIONS
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("bonfire-options", ""), new DockerEndpointDto("bonfire-options"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_BONFIRE_OPTIONS;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_HELIOS = new BackendServiceDto("BACKEND_SERVICE_HELIOS", 59) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_HELIOS
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("helios", ""), new DockerEndpointDto("helios"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_HELIOS;
        }
    };
    public static final BackendServiceDto BACKEND_SERVICE_RUDOLPH = new BackendServiceDto("BACKEND_SERVICE_RUDOLPH", 60) { // from class: com.robinhood.idl.BackendServiceDto.BACKEND_SERVICE_RUDOLPH
        {
            BackendsDto backendsDto = new BackendsDto(new FixedEndpointDto("https://api.robinhood.com/"), new ApolloEndpointDto("rudolph", ""), new DockerEndpointDto("rudolph"));
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BackendService toProto() {
            return BackendService.BACKEND_SERVICE_RUDOLPH;
        }
    };

    private static final /* synthetic */ BackendServiceDto[] $values() {
        return new BackendServiceDto[]{BACKEND_SERVICE_UNSPECIFIED, BACKEND_SERVICE_API, BACKEND_SERVICE_ANALYTICS, BACKEND_SERVICE_EXPERIMENTS, BACKEND_SERVICE_NUMMUS, BACKEND_SERVICE_DORA, BACKEND_SERVICE_MINERVA, BACKEND_SERVICE_ATLAS, BACKEND_SERVICE_BONFIRE, BACKEND_SERVICE_CASHIER, BACKEND_SERVICE_IDENTI, BACKEND_SERVICE_PIMS, BACKEND_SERVICE_PLUTO, BACKEND_SERVICE_OPTIONS_PRODUCT, BACKEND_SERVICE_CERES, BACKEND_SERVICE_TEST_DATA, BACKEND_SERVICE_INBOX_RENDERER, BACKEND_SERVICE_IDL_SAMPLE_KIOSK, BACKEND_SERVICE_BFF_POC_APP, BACKEND_SERVICE_BUGSY_APP, BACKEND_SERVICE_HIPPO, BACKEND_SERVICE_ARSENAL, BACKEND_SERVICE_WORMHOLE, BACKEND_SERVICE_MERCURY, BACKEND_SERVICE_BFF_VITALS, BACKEND_SERVICE_BFF_CRYPTO_TRADING, BACKEND_SERVICE_CHATBOT, BACKEND_SERVICE_BFF_SAMPLE_APP, BACKEND_SERVICE_PORTFOLIO, BACKEND_SERVICE_BFF_MONEY_MOVEMENT, BACKEND_SERVICE_BFF_RETIREMENT, BACKEND_SERVICE_ACATS_AGGREGATION, BACKEND_SERVICE_BILLY_MAYS, BACKEND_SERVICE_PATHFINDER, BACKEND_SERVICE_NIMBUS, BACKEND_SERVICE_MIDAS, BACKEND_SERVICE_YODA, BACKEND_SERVICE_CRYPTO_PERPETUALS, BACKEND_SERVICE_BLACK_WIDOW_BFF, BACKEND_SERVICE_ACCOUNT_AGGREGATION, BACKEND_SERVICE_MD_SERVER_PROXY, BACKEND_SERVICE_COPILOT, BACKEND_SERVICE_TESTCASEPROTOS, BACKEND_SERVICE_GOKU, BACKEND_SERVICE_AGORA, BACKEND_SERVICE_SOCIAL_TRADING, BACKEND_SERVICE_CONFIG_ROLLOUT, BACKEND_SERVICE_PREDICTION_MARKETS, BACKEND_SERVICE_BEACON, BACKEND_SERVICE_WONKA, BACKEND_SERVICE_POSTOFFICE, BACKEND_SERVICE_BAFFI, BACKEND_SERVICE_SURGE, BACKEND_SERVICE_MONEYTREE, BACKEND_SERVICE_BONFIRE_IDENTI, BACKEND_SERVICE_CRYPTO_PORTKEY, BACKEND_SERVICE_BONFIRE_CRYPTO, BACKEND_SERVICE_FRONTEND_SERVARS, BACKEND_SERVICE_BONFIRE_OPTIONS, BACKEND_SERVICE_HELIOS, BACKEND_SERVICE_RUDOLPH};
    }

    public /* synthetic */ BackendServiceDto(String str, int i, BackendsDto backendsDto, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, backendsDto);
    }

    public static EnumEntries<BackendServiceDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private BackendServiceDto(String str, int i, BackendsDto backendsDto) {
        this.backends = backendsDto;
    }

    public final BackendsDto getBackends() {
        return this.backends;
    }

    static {
        BackendServiceDto[] backendServiceDtoArr$values = $values();
        $VALUES = backendServiceDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(backendServiceDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.idl.BackendServiceDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BackendServiceDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: BackendServiceDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/idl/BackendServiceDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/idl/BackendServiceDto;", "Lcom/robinhood/idl/BackendService;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/idl/BackendServiceDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "idl.api.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<BackendServiceDto, BackendService> {

        /* compiled from: BackendServiceDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[BackendService.values().length];
                try {
                    iArr[BackendService.BACKEND_SERVICE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_API.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_ANALYTICS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_EXPERIMENTS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_NUMMUS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_DORA.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_MINERVA.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_ATLAS.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_BONFIRE.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_CASHIER.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_IDENTI.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_PIMS.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_PLUTO.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_OPTIONS_PRODUCT.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_CERES.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_TEST_DATA.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_INBOX_RENDERER.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_IDL_SAMPLE_KIOSK.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_BFF_POC_APP.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_BUGSY_APP.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_HIPPO.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_ARSENAL.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_WORMHOLE.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_MERCURY.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_BFF_VITALS.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_BFF_CRYPTO_TRADING.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_CHATBOT.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_BFF_SAMPLE_APP.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_PORTFOLIO.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_BFF_MONEY_MOVEMENT.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_BFF_RETIREMENT.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_ACATS_AGGREGATION.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_BILLY_MAYS.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_PATHFINDER.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_NIMBUS.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_MIDAS.ordinal()] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_YODA.ordinal()] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_CRYPTO_PERPETUALS.ordinal()] = 38;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_BLACK_WIDOW_BFF.ordinal()] = 39;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_ACCOUNT_AGGREGATION.ordinal()] = 40;
                } catch (NoSuchFieldError unused40) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_MD_SERVER_PROXY.ordinal()] = 41;
                } catch (NoSuchFieldError unused41) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_COPILOT.ordinal()] = 42;
                } catch (NoSuchFieldError unused42) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_TESTCASEPROTOS.ordinal()] = 43;
                } catch (NoSuchFieldError unused43) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_GOKU.ordinal()] = 44;
                } catch (NoSuchFieldError unused44) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_AGORA.ordinal()] = 45;
                } catch (NoSuchFieldError unused45) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_SOCIAL_TRADING.ordinal()] = 46;
                } catch (NoSuchFieldError unused46) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_CONFIG_ROLLOUT.ordinal()] = 47;
                } catch (NoSuchFieldError unused47) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_PREDICTION_MARKETS.ordinal()] = 48;
                } catch (NoSuchFieldError unused48) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_BEACON.ordinal()] = 49;
                } catch (NoSuchFieldError unused49) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_WONKA.ordinal()] = 50;
                } catch (NoSuchFieldError unused50) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_POSTOFFICE.ordinal()] = 51;
                } catch (NoSuchFieldError unused51) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_BAFFI.ordinal()] = 52;
                } catch (NoSuchFieldError unused52) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_SURGE.ordinal()] = 53;
                } catch (NoSuchFieldError unused53) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_MONEYTREE.ordinal()] = 54;
                } catch (NoSuchFieldError unused54) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_BONFIRE_IDENTI.ordinal()] = 55;
                } catch (NoSuchFieldError unused55) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_CRYPTO_PORTKEY.ordinal()] = 56;
                } catch (NoSuchFieldError unused56) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_BONFIRE_CRYPTO.ordinal()] = 57;
                } catch (NoSuchFieldError unused57) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_FRONTEND_SERVARS.ordinal()] = 58;
                } catch (NoSuchFieldError unused58) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_BONFIRE_OPTIONS.ordinal()] = 59;
                } catch (NoSuchFieldError unused59) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_HELIOS.ordinal()] = 60;
                } catch (NoSuchFieldError unused60) {
                }
                try {
                    iArr[BackendService.BACKEND_SERVICE_RUDOLPH.ordinal()] = 61;
                } catch (NoSuchFieldError unused61) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BackendServiceDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BackendServiceDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BackendServiceDto> getBinaryBase64Serializer() {
            return (KSerializer) BackendServiceDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<BackendService> getProtoAdapter() {
            return BackendService.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BackendServiceDto getZeroValue() {
            return BackendServiceDto.BACKEND_SERVICE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BackendServiceDto fromProto(BackendService proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return BackendServiceDto.BACKEND_SERVICE_UNSPECIFIED;
                case 2:
                    return BackendServiceDto.BACKEND_SERVICE_API;
                case 3:
                    return BackendServiceDto.BACKEND_SERVICE_ANALYTICS;
                case 4:
                    return BackendServiceDto.BACKEND_SERVICE_EXPERIMENTS;
                case 5:
                    return BackendServiceDto.BACKEND_SERVICE_NUMMUS;
                case 6:
                    return BackendServiceDto.BACKEND_SERVICE_DORA;
                case 7:
                    return BackendServiceDto.BACKEND_SERVICE_MINERVA;
                case 8:
                    return BackendServiceDto.BACKEND_SERVICE_ATLAS;
                case 9:
                    return BackendServiceDto.BACKEND_SERVICE_BONFIRE;
                case 10:
                    return BackendServiceDto.BACKEND_SERVICE_CASHIER;
                case 11:
                    return BackendServiceDto.BACKEND_SERVICE_IDENTI;
                case 12:
                    return BackendServiceDto.BACKEND_SERVICE_PIMS;
                case 13:
                    return BackendServiceDto.BACKEND_SERVICE_PLUTO;
                case 14:
                    return BackendServiceDto.BACKEND_SERVICE_OPTIONS_PRODUCT;
                case 15:
                    return BackendServiceDto.BACKEND_SERVICE_CERES;
                case 16:
                    return BackendServiceDto.BACKEND_SERVICE_TEST_DATA;
                case 17:
                    return BackendServiceDto.BACKEND_SERVICE_INBOX_RENDERER;
                case 18:
                    return BackendServiceDto.BACKEND_SERVICE_IDL_SAMPLE_KIOSK;
                case 19:
                    return BackendServiceDto.BACKEND_SERVICE_BFF_POC_APP;
                case 20:
                    return BackendServiceDto.BACKEND_SERVICE_BUGSY_APP;
                case 21:
                    return BackendServiceDto.BACKEND_SERVICE_HIPPO;
                case 22:
                    return BackendServiceDto.BACKEND_SERVICE_ARSENAL;
                case 23:
                    return BackendServiceDto.BACKEND_SERVICE_WORMHOLE;
                case 24:
                    return BackendServiceDto.BACKEND_SERVICE_MERCURY;
                case 25:
                    return BackendServiceDto.BACKEND_SERVICE_BFF_VITALS;
                case 26:
                    return BackendServiceDto.BACKEND_SERVICE_BFF_CRYPTO_TRADING;
                case 27:
                    return BackendServiceDto.BACKEND_SERVICE_CHATBOT;
                case 28:
                    return BackendServiceDto.BACKEND_SERVICE_BFF_SAMPLE_APP;
                case 29:
                    return BackendServiceDto.BACKEND_SERVICE_PORTFOLIO;
                case 30:
                    return BackendServiceDto.BACKEND_SERVICE_BFF_MONEY_MOVEMENT;
                case 31:
                    return BackendServiceDto.BACKEND_SERVICE_BFF_RETIREMENT;
                case 32:
                    return BackendServiceDto.BACKEND_SERVICE_ACATS_AGGREGATION;
                case 33:
                    return BackendServiceDto.BACKEND_SERVICE_BILLY_MAYS;
                case 34:
                    return BackendServiceDto.BACKEND_SERVICE_PATHFINDER;
                case 35:
                    return BackendServiceDto.BACKEND_SERVICE_NIMBUS;
                case 36:
                    return BackendServiceDto.BACKEND_SERVICE_MIDAS;
                case 37:
                    return BackendServiceDto.BACKEND_SERVICE_YODA;
                case 38:
                    return BackendServiceDto.BACKEND_SERVICE_CRYPTO_PERPETUALS;
                case 39:
                    return BackendServiceDto.BACKEND_SERVICE_BLACK_WIDOW_BFF;
                case 40:
                    return BackendServiceDto.BACKEND_SERVICE_ACCOUNT_AGGREGATION;
                case 41:
                    return BackendServiceDto.BACKEND_SERVICE_MD_SERVER_PROXY;
                case 42:
                    return BackendServiceDto.BACKEND_SERVICE_COPILOT;
                case 43:
                    return BackendServiceDto.BACKEND_SERVICE_TESTCASEPROTOS;
                case 44:
                    return BackendServiceDto.BACKEND_SERVICE_GOKU;
                case 45:
                    return BackendServiceDto.BACKEND_SERVICE_AGORA;
                case 46:
                    return BackendServiceDto.BACKEND_SERVICE_SOCIAL_TRADING;
                case 47:
                    return BackendServiceDto.BACKEND_SERVICE_CONFIG_ROLLOUT;
                case 48:
                    return BackendServiceDto.BACKEND_SERVICE_PREDICTION_MARKETS;
                case 49:
                    return BackendServiceDto.BACKEND_SERVICE_BEACON;
                case 50:
                    return BackendServiceDto.BACKEND_SERVICE_WONKA;
                case 51:
                    return BackendServiceDto.BACKEND_SERVICE_POSTOFFICE;
                case 52:
                    return BackendServiceDto.BACKEND_SERVICE_BAFFI;
                case 53:
                    return BackendServiceDto.BACKEND_SERVICE_SURGE;
                case 54:
                    return BackendServiceDto.BACKEND_SERVICE_MONEYTREE;
                case 55:
                    return BackendServiceDto.BACKEND_SERVICE_BONFIRE_IDENTI;
                case 56:
                    return BackendServiceDto.BACKEND_SERVICE_CRYPTO_PORTKEY;
                case 57:
                    return BackendServiceDto.BACKEND_SERVICE_BONFIRE_CRYPTO;
                case 58:
                    return BackendServiceDto.BACKEND_SERVICE_FRONTEND_SERVARS;
                case 59:
                    return BackendServiceDto.BACKEND_SERVICE_BONFIRE_OPTIONS;
                case 60:
                    return BackendServiceDto.BACKEND_SERVICE_HELIOS;
                case 61:
                    return BackendServiceDto.BACKEND_SERVICE_RUDOLPH;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: BackendServiceDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/idl/BackendServiceDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/idl/BackendServiceDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "idl.api.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<BackendServiceDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<BackendServiceDto, BackendService> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/idl.api.v1.BackendService", BackendServiceDto.getEntries(), BackendServiceDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public BackendServiceDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (BackendServiceDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, BackendServiceDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static BackendServiceDto valueOf(String str) {
        return (BackendServiceDto) Enum.valueOf(BackendServiceDto.class, str);
    }

    public static BackendServiceDto[] values() {
        return (BackendServiceDto[]) $VALUES.clone();
    }
}
