package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.WebViewNavigationData;
import com.robinhood.rosetta.eventlogging.WebViewNavigationDataDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
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

/* compiled from: WebViewNavigationDataDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006&'()*+B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u000fJ.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\tJ\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\tH\u0016J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001fH\u0016J\b\u0010%\u001a\u00020\u001fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011¨\u0006,"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$Surrogate;)V", "url", "", "handling_strategy", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$StrategyDto;", "navigation_type", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$NavigationTypeDto;", "masked_url", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$StrategyDto;Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$NavigationTypeDto;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getHandling_strategy", "()Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$StrategyDto;", "getNavigation_type", "()Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$NavigationTypeDto;", "getMasked_url", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "StrategyDto", "NavigationTypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class WebViewNavigationDataDto implements Dto3<WebViewNavigationData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<WebViewNavigationDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<WebViewNavigationDataDto, WebViewNavigationData>> binaryBase64Serializer$delegate;
    private static final WebViewNavigationDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ WebViewNavigationDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private WebViewNavigationDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getUrl() {
        return this.surrogate.getUrl();
    }

    public final StrategyDto getHandling_strategy() {
        return this.surrogate.getHandling_strategy();
    }

    public final NavigationTypeDto getNavigation_type() {
        return this.surrogate.getNavigation_type();
    }

    public final String getMasked_url() {
        return this.surrogate.getMasked_url();
    }

    public /* synthetic */ WebViewNavigationDataDto(String str, StrategyDto strategyDto, NavigationTypeDto navigationTypeDto, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? StrategyDto.INSTANCE.getZeroValue() : strategyDto, (i & 4) != 0 ? NavigationTypeDto.INSTANCE.getZeroValue() : navigationTypeDto, (i & 8) != 0 ? "" : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebViewNavigationDataDto(String url, StrategyDto handling_strategy, NavigationTypeDto navigation_type, String masked_url) {
        this(new Surrogate(url, handling_strategy, navigation_type, masked_url));
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(handling_strategy, "handling_strategy");
        Intrinsics.checkNotNullParameter(navigation_type, "navigation_type");
        Intrinsics.checkNotNullParameter(masked_url, "masked_url");
    }

    public static /* synthetic */ WebViewNavigationDataDto copy$default(WebViewNavigationDataDto webViewNavigationDataDto, String str, StrategyDto strategyDto, NavigationTypeDto navigationTypeDto, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = webViewNavigationDataDto.surrogate.getUrl();
        }
        if ((i & 2) != 0) {
            strategyDto = webViewNavigationDataDto.surrogate.getHandling_strategy();
        }
        if ((i & 4) != 0) {
            navigationTypeDto = webViewNavigationDataDto.surrogate.getNavigation_type();
        }
        if ((i & 8) != 0) {
            str2 = webViewNavigationDataDto.surrogate.getMasked_url();
        }
        return webViewNavigationDataDto.copy(str, strategyDto, navigationTypeDto, str2);
    }

    public final WebViewNavigationDataDto copy(String url, StrategyDto handling_strategy, NavigationTypeDto navigation_type, String masked_url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(handling_strategy, "handling_strategy");
        Intrinsics.checkNotNullParameter(navigation_type, "navigation_type");
        Intrinsics.checkNotNullParameter(masked_url, "masked_url");
        return new WebViewNavigationDataDto(new Surrogate(url, handling_strategy, navigation_type, masked_url));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public WebViewNavigationData toProto() {
        return new WebViewNavigationData(this.surrogate.getUrl(), (WebViewNavigationData.Strategy) this.surrogate.getHandling_strategy().toProto(), (WebViewNavigationData.NavigationType) this.surrogate.getNavigation_type().toProto(), this.surrogate.getMasked_url(), null, 16, null);
    }

    public String toString() {
        return "[WebViewNavigationDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof WebViewNavigationDataDto) && Intrinsics.areEqual(((WebViewNavigationDataDto) other).surrogate, this.surrogate);
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
    /* compiled from: WebViewNavigationDataDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 /2\u00020\u0001:\u0002./B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J1\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\fHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J%\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\b-R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013¨\u00060"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$Surrogate;", "", "url", "", "handling_strategy", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$StrategyDto;", "navigation_type", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$NavigationTypeDto;", "masked_url", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$StrategyDto;Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$NavigationTypeDto;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$StrategyDto;Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$NavigationTypeDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getUrl$annotations", "()V", "getUrl", "()Ljava/lang/String;", "getHandling_strategy$annotations", "getHandling_strategy", "()Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$StrategyDto;", "getNavigation_type$annotations", "getNavigation_type", "()Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$NavigationTypeDto;", "getMasked_url$annotations", "getMasked_url", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final StrategyDto handling_strategy;
        private final String masked_url;
        private final NavigationTypeDto navigation_type;
        private final String url;

        public Surrogate() {
            this((String) null, (StrategyDto) null, (NavigationTypeDto) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, StrategyDto strategyDto, NavigationTypeDto navigationTypeDto, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.url;
            }
            if ((i & 2) != 0) {
                strategyDto = surrogate.handling_strategy;
            }
            if ((i & 4) != 0) {
                navigationTypeDto = surrogate.navigation_type;
            }
            if ((i & 8) != 0) {
                str2 = surrogate.masked_url;
            }
            return surrogate.copy(str, strategyDto, navigationTypeDto, str2);
        }

        @SerialName("handlingStrategy")
        @JsonAnnotations2(names = {"handling_strategy"})
        public static /* synthetic */ void getHandling_strategy$annotations() {
        }

        @SerialName("maskedUrl")
        @JsonAnnotations2(names = {"masked_url"})
        public static /* synthetic */ void getMasked_url$annotations() {
        }

        @SerialName("navigationType")
        @JsonAnnotations2(names = {"navigation_type"})
        public static /* synthetic */ void getNavigation_type$annotations() {
        }

        @SerialName("url")
        @JsonAnnotations2(names = {"url"})
        public static /* synthetic */ void getUrl$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* renamed from: component2, reason: from getter */
        public final StrategyDto getHandling_strategy() {
            return this.handling_strategy;
        }

        /* renamed from: component3, reason: from getter */
        public final NavigationTypeDto getNavigation_type() {
            return this.navigation_type;
        }

        /* renamed from: component4, reason: from getter */
        public final String getMasked_url() {
            return this.masked_url;
        }

        public final Surrogate copy(String url, StrategyDto handling_strategy, NavigationTypeDto navigation_type, String masked_url) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(handling_strategy, "handling_strategy");
            Intrinsics.checkNotNullParameter(navigation_type, "navigation_type");
            Intrinsics.checkNotNullParameter(masked_url, "masked_url");
            return new Surrogate(url, handling_strategy, navigation_type, masked_url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.url, surrogate.url) && this.handling_strategy == surrogate.handling_strategy && this.navigation_type == surrogate.navigation_type && Intrinsics.areEqual(this.masked_url, surrogate.masked_url);
        }

        public int hashCode() {
            return (((((this.url.hashCode() * 31) + this.handling_strategy.hashCode()) * 31) + this.navigation_type.hashCode()) * 31) + this.masked_url.hashCode();
        }

        public String toString() {
            return "Surrogate(url=" + this.url + ", handling_strategy=" + this.handling_strategy + ", navigation_type=" + this.navigation_type + ", masked_url=" + this.masked_url + ")";
        }

        /* compiled from: WebViewNavigationDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return WebViewNavigationDataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, StrategyDto strategyDto, NavigationTypeDto navigationTypeDto, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.url = "";
            } else {
                this.url = str;
            }
            if ((i & 2) == 0) {
                this.handling_strategy = StrategyDto.INSTANCE.getZeroValue();
            } else {
                this.handling_strategy = strategyDto;
            }
            if ((i & 4) == 0) {
                this.navigation_type = NavigationTypeDto.INSTANCE.getZeroValue();
            } else {
                this.navigation_type = navigationTypeDto;
            }
            if ((i & 8) == 0) {
                this.masked_url = "";
            } else {
                this.masked_url = str2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.url, "")) {
                output.encodeStringElement(serialDesc, 0, self.url);
            }
            if (self.handling_strategy != StrategyDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, StrategyDto.Serializer.INSTANCE, self.handling_strategy);
            }
            if (self.navigation_type != NavigationTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, NavigationTypeDto.Serializer.INSTANCE, self.navigation_type);
            }
            if (Intrinsics.areEqual(self.masked_url, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 3, self.masked_url);
        }

        public Surrogate(String url, StrategyDto handling_strategy, NavigationTypeDto navigation_type, String masked_url) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(handling_strategy, "handling_strategy");
            Intrinsics.checkNotNullParameter(navigation_type, "navigation_type");
            Intrinsics.checkNotNullParameter(masked_url, "masked_url");
            this.url = url;
            this.handling_strategy = handling_strategy;
            this.navigation_type = navigation_type;
            this.masked_url = masked_url;
        }

        public /* synthetic */ Surrogate(String str, StrategyDto strategyDto, NavigationTypeDto navigationTypeDto, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? StrategyDto.INSTANCE.getZeroValue() : strategyDto, (i & 4) != 0 ? NavigationTypeDto.INSTANCE.getZeroValue() : navigationTypeDto, (i & 8) != 0 ? "" : str2);
        }

        public final String getUrl() {
            return this.url;
        }

        public final StrategyDto getHandling_strategy() {
            return this.handling_strategy;
        }

        public final NavigationTypeDto getNavigation_type() {
            return this.navigation_type;
        }

        public final String getMasked_url() {
            return this.masked_url;
        }
    }

    /* compiled from: WebViewNavigationDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto;", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<WebViewNavigationDataDto, WebViewNavigationData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<WebViewNavigationDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<WebViewNavigationDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<WebViewNavigationDataDto> getBinaryBase64Serializer() {
            return (KSerializer) WebViewNavigationDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<WebViewNavigationData> getProtoAdapter() {
            return WebViewNavigationData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public WebViewNavigationDataDto getZeroValue() {
            return WebViewNavigationDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public WebViewNavigationDataDto fromProto(WebViewNavigationData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new WebViewNavigationDataDto(new Surrogate(proto.getUrl(), StrategyDto.INSTANCE.fromProto(proto.getHandling_strategy()), NavigationTypeDto.INSTANCE.fromProto(proto.getNavigation_type()), proto.getMasked_url()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.WebViewNavigationDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WebViewNavigationDataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new WebViewNavigationDataDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WebViewNavigationDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$StrategyDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData$Strategy;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "STRATEGY_UNSPECIFIED", "NAVIGATED", "ARTICLE", "DEEP_LINK", "MAIL_TO", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class StrategyDto implements Dto2<WebViewNavigationData.Strategy>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StrategyDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<StrategyDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<StrategyDto, WebViewNavigationData.Strategy>> binaryBase64Serializer$delegate;
        public static final StrategyDto STRATEGY_UNSPECIFIED = new STRATEGY_UNSPECIFIED("STRATEGY_UNSPECIFIED", 0);
        public static final StrategyDto NAVIGATED = new NAVIGATED("NAVIGATED", 1);
        public static final StrategyDto ARTICLE = new ARTICLE("ARTICLE", 2);
        public static final StrategyDto DEEP_LINK = new DEEP_LINK("DEEP_LINK", 3);
        public static final StrategyDto MAIL_TO = new MAIL_TO("MAIL_TO", 4);

        private static final /* synthetic */ StrategyDto[] $values() {
            return new StrategyDto[]{STRATEGY_UNSPECIFIED, NAVIGATED, ARTICLE, DEEP_LINK, MAIL_TO};
        }

        public /* synthetic */ StrategyDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<StrategyDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: WebViewNavigationDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/WebViewNavigationDataDto.StrategyDto.STRATEGY_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$StrategyDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData$Strategy;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STRATEGY_UNSPECIFIED extends StrategyDto {
            STRATEGY_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WebViewNavigationData.Strategy toProto() {
                return WebViewNavigationData.Strategy.STRATEGY_UNSPECIFIED;
            }
        }

        private StrategyDto(String str, int i) {
        }

        static {
            StrategyDto[] strategyDtoArr$values = $values();
            $VALUES = strategyDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(strategyDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.WebViewNavigationDataDto$StrategyDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WebViewNavigationDataDto.StrategyDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: WebViewNavigationDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/WebViewNavigationDataDto.StrategyDto.NAVIGATED", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$StrategyDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData$Strategy;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NAVIGATED extends StrategyDto {
            NAVIGATED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WebViewNavigationData.Strategy toProto() {
                return WebViewNavigationData.Strategy.NAVIGATED;
            }
        }

        /* compiled from: WebViewNavigationDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/WebViewNavigationDataDto.StrategyDto.ARTICLE", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$StrategyDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData$Strategy;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ARTICLE extends StrategyDto {
            ARTICLE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WebViewNavigationData.Strategy toProto() {
                return WebViewNavigationData.Strategy.ARTICLE;
            }
        }

        /* compiled from: WebViewNavigationDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/WebViewNavigationDataDto.StrategyDto.DEEP_LINK", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$StrategyDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData$Strategy;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DEEP_LINK extends StrategyDto {
            DEEP_LINK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WebViewNavigationData.Strategy toProto() {
                return WebViewNavigationData.Strategy.DEEP_LINK;
            }
        }

        /* compiled from: WebViewNavigationDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/WebViewNavigationDataDto.StrategyDto.MAIL_TO", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$StrategyDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData$Strategy;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MAIL_TO extends StrategyDto {
            MAIL_TO(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WebViewNavigationData.Strategy toProto() {
                return WebViewNavigationData.Strategy.MAIL_TO;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: WebViewNavigationDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$StrategyDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$StrategyDto;", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData$Strategy;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$StrategyDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<StrategyDto, WebViewNavigationData.Strategy> {

            /* compiled from: WebViewNavigationDataDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[WebViewNavigationData.Strategy.values().length];
                    try {
                        iArr[WebViewNavigationData.Strategy.STRATEGY_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[WebViewNavigationData.Strategy.NAVIGATED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[WebViewNavigationData.Strategy.ARTICLE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[WebViewNavigationData.Strategy.DEEP_LINK.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[WebViewNavigationData.Strategy.MAIL_TO.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<StrategyDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<StrategyDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<StrategyDto> getBinaryBase64Serializer() {
                return (KSerializer) StrategyDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<WebViewNavigationData.Strategy> getProtoAdapter() {
                return WebViewNavigationData.Strategy.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public StrategyDto getZeroValue() {
                return StrategyDto.STRATEGY_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public StrategyDto fromProto(WebViewNavigationData.Strategy proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return StrategyDto.STRATEGY_UNSPECIFIED;
                }
                if (i == 2) {
                    return StrategyDto.NAVIGATED;
                }
                if (i == 3) {
                    return StrategyDto.ARTICLE;
                }
                if (i == 4) {
                    return StrategyDto.DEEP_LINK;
                }
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return StrategyDto.MAIL_TO;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: WebViewNavigationDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$StrategyDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$StrategyDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<StrategyDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<StrategyDto, WebViewNavigationData.Strategy> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.WebViewNavigationData.Strategy", StrategyDto.getEntries(), StrategyDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public StrategyDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (StrategyDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, StrategyDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static StrategyDto valueOf(String str) {
            return (StrategyDto) Enum.valueOf(StrategyDto.class, str);
        }

        public static StrategyDto[] values() {
            return (StrategyDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WebViewNavigationDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0015\u0016B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$NavigationTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData$NavigationType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "NAVIGATION_UNSPECIFIED", "OTHER", "LINK_ACTIVATED", "FORM_SUBMITTED", "FORM_RESUBMITTED", "BACK_FOWARD", "RELOAD", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class NavigationTypeDto implements Dto2<WebViewNavigationData.NavigationType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ NavigationTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<NavigationTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<NavigationTypeDto, WebViewNavigationData.NavigationType>> binaryBase64Serializer$delegate;
        public static final NavigationTypeDto NAVIGATION_UNSPECIFIED = new NAVIGATION_UNSPECIFIED("NAVIGATION_UNSPECIFIED", 0);
        public static final NavigationTypeDto OTHER = new OTHER("OTHER", 1);
        public static final NavigationTypeDto LINK_ACTIVATED = new LINK_ACTIVATED("LINK_ACTIVATED", 2);
        public static final NavigationTypeDto FORM_SUBMITTED = new FORM_SUBMITTED("FORM_SUBMITTED", 3);
        public static final NavigationTypeDto FORM_RESUBMITTED = new FORM_RESUBMITTED("FORM_RESUBMITTED", 4);
        public static final NavigationTypeDto BACK_FOWARD = new BACK_FOWARD("BACK_FOWARD", 5);
        public static final NavigationTypeDto RELOAD = new RELOAD("RELOAD", 6);

        private static final /* synthetic */ NavigationTypeDto[] $values() {
            return new NavigationTypeDto[]{NAVIGATION_UNSPECIFIED, OTHER, LINK_ACTIVATED, FORM_SUBMITTED, FORM_RESUBMITTED, BACK_FOWARD, RELOAD};
        }

        public /* synthetic */ NavigationTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<NavigationTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private NavigationTypeDto(String str, int i) {
        }

        /* compiled from: WebViewNavigationDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/WebViewNavigationDataDto.NavigationTypeDto.NAVIGATION_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$NavigationTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData$NavigationType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NAVIGATION_UNSPECIFIED extends NavigationTypeDto {
            NAVIGATION_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WebViewNavigationData.NavigationType toProto() {
                return WebViewNavigationData.NavigationType.NAVIGATION_UNSPECIFIED;
            }
        }

        static {
            NavigationTypeDto[] navigationTypeDtoArr$values = $values();
            $VALUES = navigationTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(navigationTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.WebViewNavigationDataDto$NavigationTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WebViewNavigationDataDto.NavigationTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: WebViewNavigationDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/WebViewNavigationDataDto.NavigationTypeDto.OTHER", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$NavigationTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData$NavigationType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OTHER extends NavigationTypeDto {
            OTHER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WebViewNavigationData.NavigationType toProto() {
                return WebViewNavigationData.NavigationType.OTHER;
            }
        }

        /* compiled from: WebViewNavigationDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/WebViewNavigationDataDto.NavigationTypeDto.LINK_ACTIVATED", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$NavigationTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData$NavigationType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LINK_ACTIVATED extends NavigationTypeDto {
            LINK_ACTIVATED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WebViewNavigationData.NavigationType toProto() {
                return WebViewNavigationData.NavigationType.LINK_ACTIVATED;
            }
        }

        /* compiled from: WebViewNavigationDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/WebViewNavigationDataDto.NavigationTypeDto.FORM_SUBMITTED", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$NavigationTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData$NavigationType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FORM_SUBMITTED extends NavigationTypeDto {
            FORM_SUBMITTED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WebViewNavigationData.NavigationType toProto() {
                return WebViewNavigationData.NavigationType.FORM_SUBMITTED;
            }
        }

        /* compiled from: WebViewNavigationDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/WebViewNavigationDataDto.NavigationTypeDto.FORM_RESUBMITTED", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$NavigationTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData$NavigationType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FORM_RESUBMITTED extends NavigationTypeDto {
            FORM_RESUBMITTED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WebViewNavigationData.NavigationType toProto() {
                return WebViewNavigationData.NavigationType.FORM_RESUBMITTED;
            }
        }

        /* compiled from: WebViewNavigationDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/WebViewNavigationDataDto.NavigationTypeDto.BACK_FOWARD", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$NavigationTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData$NavigationType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BACK_FOWARD extends NavigationTypeDto {
            BACK_FOWARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WebViewNavigationData.NavigationType toProto() {
                return WebViewNavigationData.NavigationType.BACK_FOWARD;
            }
        }

        /* compiled from: WebViewNavigationDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/WebViewNavigationDataDto.NavigationTypeDto.RELOAD", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$NavigationTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData$NavigationType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RELOAD extends NavigationTypeDto {
            RELOAD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WebViewNavigationData.NavigationType toProto() {
                return WebViewNavigationData.NavigationType.RELOAD;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: WebViewNavigationDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$NavigationTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$NavigationTypeDto;", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData$NavigationType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$NavigationTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<NavigationTypeDto, WebViewNavigationData.NavigationType> {

            /* compiled from: WebViewNavigationDataDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[WebViewNavigationData.NavigationType.values().length];
                    try {
                        iArr[WebViewNavigationData.NavigationType.NAVIGATION_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[WebViewNavigationData.NavigationType.OTHER.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[WebViewNavigationData.NavigationType.LINK_ACTIVATED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[WebViewNavigationData.NavigationType.FORM_SUBMITTED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[WebViewNavigationData.NavigationType.FORM_RESUBMITTED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[WebViewNavigationData.NavigationType.BACK_FOWARD.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[WebViewNavigationData.NavigationType.RELOAD.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<NavigationTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<NavigationTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<NavigationTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) NavigationTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<WebViewNavigationData.NavigationType> getProtoAdapter() {
                return WebViewNavigationData.NavigationType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public NavigationTypeDto getZeroValue() {
                return NavigationTypeDto.NAVIGATION_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public NavigationTypeDto fromProto(WebViewNavigationData.NavigationType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return NavigationTypeDto.NAVIGATION_UNSPECIFIED;
                    case 2:
                        return NavigationTypeDto.OTHER;
                    case 3:
                        return NavigationTypeDto.LINK_ACTIVATED;
                    case 4:
                        return NavigationTypeDto.FORM_SUBMITTED;
                    case 5:
                        return NavigationTypeDto.FORM_RESUBMITTED;
                    case 6:
                        return NavigationTypeDto.BACK_FOWARD;
                    case 7:
                        return NavigationTypeDto.RELOAD;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: WebViewNavigationDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$NavigationTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$NavigationTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<NavigationTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<NavigationTypeDto, WebViewNavigationData.NavigationType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.WebViewNavigationData.NavigationType", NavigationTypeDto.getEntries(), NavigationTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public NavigationTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (NavigationTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, NavigationTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static NavigationTypeDto valueOf(String str) {
            return (NavigationTypeDto) Enum.valueOf(NavigationTypeDto.class, str);
        }

        public static NavigationTypeDto[] values() {
            return (NavigationTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: WebViewNavigationDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<WebViewNavigationDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.WebViewNavigationData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, WebViewNavigationDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public WebViewNavigationDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new WebViewNavigationDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: WebViewNavigationDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.WebViewNavigationDataDto";
        }
    }
}
