package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
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

/* compiled from: BreakingNewsContextDto.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\"#$%B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\rJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tJ\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bH\u0016J\b\u0010!\u001a\u00020\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000f¨\u0006&"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BreakingNewsContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/BreakingNewsContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/BreakingNewsContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/BreakingNewsContextDto$Surrogate;)V", "title", "", CarResultComposable2.BODY, "url", "asset_id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getBody", "getUrl", "getAsset_id", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class BreakingNewsContextDto implements Dto3<BreakingNewsContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<BreakingNewsContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<BreakingNewsContextDto, BreakingNewsContext>> binaryBase64Serializer$delegate;
    private static final BreakingNewsContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ BreakingNewsContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private BreakingNewsContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final String getBody() {
        return this.surrogate.getBody();
    }

    public final String getUrl() {
        return this.surrogate.getUrl();
    }

    public final String getAsset_id() {
        return this.surrogate.getAsset_id();
    }

    public /* synthetic */ BreakingNewsContextDto(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BreakingNewsContextDto(String title, String body, String url, String asset_id) {
        this(new Surrogate(title, body, url, asset_id));
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(asset_id, "asset_id");
    }

    public static /* synthetic */ BreakingNewsContextDto copy$default(BreakingNewsContextDto breakingNewsContextDto, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = breakingNewsContextDto.surrogate.getTitle();
        }
        if ((i & 2) != 0) {
            str2 = breakingNewsContextDto.surrogate.getBody();
        }
        if ((i & 4) != 0) {
            str3 = breakingNewsContextDto.surrogate.getUrl();
        }
        if ((i & 8) != 0) {
            str4 = breakingNewsContextDto.surrogate.getAsset_id();
        }
        return breakingNewsContextDto.copy(str, str2, str3, str4);
    }

    public final BreakingNewsContextDto copy(String title, String body, String url, String asset_id) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(asset_id, "asset_id");
        return new BreakingNewsContextDto(new Surrogate(title, body, url, asset_id));
    }

    @Override // com.robinhood.idl.Dto
    public BreakingNewsContext toProto() {
        return new BreakingNewsContext(this.surrogate.getTitle(), this.surrogate.getBody(), this.surrogate.getUrl(), this.surrogate.getAsset_id(), null, 16, null);
    }

    public String toString() {
        return "[BreakingNewsContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof BreakingNewsContextDto) && Intrinsics.areEqual(((BreakingNewsContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: BreakingNewsContextDto.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 +2\u00020\u0001:\u0002*+B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\nHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J%\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0001¢\u0006\u0002\b)R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011¨\u0006,"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BreakingNewsContextDto$Surrogate;", "", "title", "", CarResultComposable2.BODY, "url", "asset_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTitle$annotations", "()V", "getTitle", "()Ljava/lang/String;", "getBody$annotations", "getBody", "getUrl$annotations", "getUrl", "getAsset_id$annotations", "getAsset_id", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String asset_id;
        private final String body;
        private final String title;
        private final String url;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.title;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.body;
            }
            if ((i & 4) != 0) {
                str3 = surrogate.url;
            }
            if ((i & 8) != 0) {
                str4 = surrogate.asset_id;
            }
            return surrogate.copy(str, str2, str3, str4);
        }

        @SerialName("assetId")
        @JsonAnnotations2(names = {"asset_id"})
        public static /* synthetic */ void getAsset_id$annotations() {
        }

        @SerialName(CarResultComposable2.BODY)
        @JsonAnnotations2(names = {CarResultComposable2.BODY})
        public static /* synthetic */ void getBody$annotations() {
        }

        @SerialName("title")
        @JsonAnnotations2(names = {"title"})
        public static /* synthetic */ void getTitle$annotations() {
        }

        @SerialName("url")
        @JsonAnnotations2(names = {"url"})
        public static /* synthetic */ void getUrl$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        /* renamed from: component3, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAsset_id() {
            return this.asset_id;
        }

        public final Surrogate copy(String title, String body, String url, String asset_id) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(asset_id, "asset_id");
            return new Surrogate(title, body, url, asset_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.body, surrogate.body) && Intrinsics.areEqual(this.url, surrogate.url) && Intrinsics.areEqual(this.asset_id, surrogate.asset_id);
        }

        public int hashCode() {
            return (((((this.title.hashCode() * 31) + this.body.hashCode()) * 31) + this.url.hashCode()) * 31) + this.asset_id.hashCode();
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", body=" + this.body + ", url=" + this.url + ", asset_id=" + this.asset_id + ")";
        }

        /* compiled from: BreakingNewsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BreakingNewsContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/BreakingNewsContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return BreakingNewsContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.title = "";
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.body = "";
            } else {
                this.body = str2;
            }
            if ((i & 4) == 0) {
                this.url = "";
            } else {
                this.url = str3;
            }
            if ((i & 8) == 0) {
                this.asset_id = "";
            } else {
                this.asset_id = str4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 0, self.title);
            }
            if (!Intrinsics.areEqual(self.body, "")) {
                output.encodeStringElement(serialDesc, 1, self.body);
            }
            if (!Intrinsics.areEqual(self.url, "")) {
                output.encodeStringElement(serialDesc, 2, self.url);
            }
            if (Intrinsics.areEqual(self.asset_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 3, self.asset_id);
        }

        public Surrogate(String title, String body, String url, String asset_id) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(asset_id, "asset_id");
            this.title = title;
            this.body = body;
            this.url = url;
            this.asset_id = asset_id;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getBody() {
            return this.body;
        }

        public final String getUrl() {
            return this.url;
        }

        public final String getAsset_id() {
            return this.asset_id;
        }
    }

    /* compiled from: BreakingNewsContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BreakingNewsContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/BreakingNewsContextDto;", "Lcom/robinhood/rosetta/eventlogging/BreakingNewsContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/BreakingNewsContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<BreakingNewsContextDto, BreakingNewsContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BreakingNewsContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BreakingNewsContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BreakingNewsContextDto> getBinaryBase64Serializer() {
            return (KSerializer) BreakingNewsContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<BreakingNewsContext> getProtoAdapter() {
            return BreakingNewsContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BreakingNewsContextDto getZeroValue() {
            return BreakingNewsContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BreakingNewsContextDto fromProto(BreakingNewsContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new BreakingNewsContextDto(new Surrogate(proto.getTitle(), proto.getBody(), proto.getUrl(), proto.getAsset_id()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.BreakingNewsContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BreakingNewsContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new BreakingNewsContextDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: BreakingNewsContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BreakingNewsContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/BreakingNewsContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/BreakingNewsContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<BreakingNewsContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.BreakingNewsContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, BreakingNewsContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public BreakingNewsContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new BreakingNewsContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: BreakingNewsContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BreakingNewsContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.BreakingNewsContextDto";
        }
    }
}
