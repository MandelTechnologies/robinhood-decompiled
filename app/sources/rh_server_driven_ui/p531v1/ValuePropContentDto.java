package rh_server_driven_ui.p531v1;

import android.os.Parcel;
import android.os.Parcelable;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import rh_server_driven_ui.p531v1.RenderableTextDto;
import rh_server_driven_ui.p531v1.TextStyleDto;
import rh_server_driven_ui.p531v1.TextWithActionDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: ValuePropContentDto.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00043245B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BQ\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0006\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001dH\u0016¢\u0006\u0004\b&\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b1\u00100¨\u00066"}, m3636d2 = {"Lrh_server_driven_ui/v1/ValuePropContentDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/ValuePropContent;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/ValuePropContentDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/ValuePropContentDto$Surrogate;)V", "", "title", "Lrh_server_driven_ui/v1/RenderableTextDto;", "content", "Lrh_server_driven_ui/v1/TextWithActionDto;", "supplemental_action", "Lrh_server_driven_ui/v1/TextStyleDto;", "text_style_override", "Lrh_server_driven_ui/v1/ThemedColorDto;", "title_text_color_override", "content_text_color_override", "(Ljava/lang/String;Lrh_server_driven_ui/v1/RenderableTextDto;Lrh_server_driven_ui/v1/TextWithActionDto;Lrh_server_driven_ui/v1/TextStyleDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;)V", "toProto", "()Lrh_server_driven_ui/v1/ValuePropContent;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/ValuePropContentDto$Surrogate;", "getTitle", "getContent", "()Lrh_server_driven_ui/v1/RenderableTextDto;", "getSupplemental_action", "()Lrh_server_driven_ui/v1/TextWithActionDto;", "getText_style_override", "()Lrh_server_driven_ui/v1/TextStyleDto;", "getTitle_text_color_override", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getContent_text_color_override", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class ValuePropContentDto implements Dto3<ValuePropContent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ValuePropContentDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ValuePropContentDto, ValuePropContent>> binaryBase64Serializer$delegate;
    private static final ValuePropContentDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ValuePropContentDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ValuePropContentDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final RenderableTextDto getContent() {
        return this.surrogate.getContent();
    }

    public final TextWithActionDto getSupplemental_action() {
        return this.surrogate.getSupplemental_action();
    }

    public final TextStyleDto getText_style_override() {
        return this.surrogate.getText_style_override();
    }

    public final ThemedColorDto getTitle_text_color_override() {
        return this.surrogate.getTitle_text_color_override();
    }

    public final ThemedColorDto getContent_text_color_override() {
        return this.surrogate.getContent_text_color_override();
    }

    public /* synthetic */ ValuePropContentDto(String str, RenderableTextDto renderableTextDto, TextWithActionDto textWithActionDto, TextStyleDto textStyleDto, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : renderableTextDto, (i & 4) != 0 ? null : textWithActionDto, (i & 8) != 0 ? null : textStyleDto, (i & 16) != 0 ? null : themedColorDto, (i & 32) != 0 ? null : themedColorDto2);
    }

    public ValuePropContentDto(String str, RenderableTextDto renderableTextDto, TextWithActionDto textWithActionDto, TextStyleDto textStyleDto, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2) {
        this(new Surrogate(str, renderableTextDto, textWithActionDto, textStyleDto, themedColorDto, themedColorDto2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ValuePropContent toProto() {
        String title = this.surrogate.getTitle();
        RenderableTextDto content = this.surrogate.getContent();
        RenderableText proto = content != null ? content.toProto() : null;
        TextWithActionDto supplemental_action = this.surrogate.getSupplemental_action();
        TextWithAction proto2 = supplemental_action != null ? supplemental_action.toProto() : null;
        TextStyleDto text_style_override = this.surrogate.getText_style_override();
        TextStyle textStyle = text_style_override != null ? (TextStyle) text_style_override.toProto() : null;
        ThemedColorDto title_text_color_override = this.surrogate.getTitle_text_color_override();
        ThemedColor proto3 = title_text_color_override != null ? title_text_color_override.toProto() : null;
        ThemedColorDto content_text_color_override = this.surrogate.getContent_text_color_override();
        return new ValuePropContent(title, proto, proto2, textStyle, proto3, content_text_color_override != null ? content_text_color_override.toProto() : null, null, 64, null);
    }

    public String toString() {
        return "[ValuePropContentDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ValuePropContentDto) && Intrinsics.areEqual(((ValuePropContentDto) other).surrogate, this.surrogate);
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
    /* compiled from: ValuePropContentDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0083\b\u0018\u0000 ;2\u00020\u0001:\u0002<;BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eBW\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u001eR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b,\u0010(\u001a\u0004\b*\u0010+R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b0\u0010(\u001a\u0004\b.\u0010/R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00101\u0012\u0004\b4\u0010(\u001a\u0004\b2\u00103R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00105\u0012\u0004\b8\u0010(\u001a\u0004\b6\u00107R\"\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00105\u0012\u0004\b:\u0010(\u001a\u0004\b9\u00107¨\u0006="}, m3636d2 = {"Lrh_server_driven_ui/v1/ValuePropContentDto$Surrogate;", "", "", "title", "Lrh_server_driven_ui/v1/RenderableTextDto;", "content", "Lrh_server_driven_ui/v1/TextWithActionDto;", "supplemental_action", "Lrh_server_driven_ui/v1/TextStyleDto;", "text_style_override", "Lrh_server_driven_ui/v1/ThemedColorDto;", "title_text_color_override", "content_text_color_override", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/RenderableTextDto;Lrh_server_driven_ui/v1/TextWithActionDto;Lrh_server_driven_ui/v1/TextStyleDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lrh_server_driven_ui/v1/RenderableTextDto;Lrh_server_driven_ui/v1/TextWithActionDto;Lrh_server_driven_ui/v1/TextStyleDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/ValuePropContentDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "Lrh_server_driven_ui/v1/RenderableTextDto;", "getContent", "()Lrh_server_driven_ui/v1/RenderableTextDto;", "getContent$annotations", "Lrh_server_driven_ui/v1/TextWithActionDto;", "getSupplemental_action", "()Lrh_server_driven_ui/v1/TextWithActionDto;", "getSupplemental_action$annotations", "Lrh_server_driven_ui/v1/TextStyleDto;", "getText_style_override", "()Lrh_server_driven_ui/v1/TextStyleDto;", "getText_style_override$annotations", "Lrh_server_driven_ui/v1/ThemedColorDto;", "getTitle_text_color_override", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getTitle_text_color_override$annotations", "getContent_text_color_override", "getContent_text_color_override$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final RenderableTextDto content;
        private final ThemedColorDto content_text_color_override;
        private final TextWithActionDto supplemental_action;
        private final TextStyleDto text_style_override;
        private final String title;
        private final ThemedColorDto title_text_color_override;

        public Surrogate() {
            this((String) null, (RenderableTextDto) null, (TextWithActionDto) null, (TextStyleDto) null, (ThemedColorDto) null, (ThemedColorDto) null, 63, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.content, surrogate.content) && Intrinsics.areEqual(this.supplemental_action, surrogate.supplemental_action) && this.text_style_override == surrogate.text_style_override && Intrinsics.areEqual(this.title_text_color_override, surrogate.title_text_color_override) && Intrinsics.areEqual(this.content_text_color_override, surrogate.content_text_color_override);
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            RenderableTextDto renderableTextDto = this.content;
            int iHashCode2 = (iHashCode + (renderableTextDto == null ? 0 : renderableTextDto.hashCode())) * 31;
            TextWithActionDto textWithActionDto = this.supplemental_action;
            int iHashCode3 = (iHashCode2 + (textWithActionDto == null ? 0 : textWithActionDto.hashCode())) * 31;
            TextStyleDto textStyleDto = this.text_style_override;
            int iHashCode4 = (iHashCode3 + (textStyleDto == null ? 0 : textStyleDto.hashCode())) * 31;
            ThemedColorDto themedColorDto = this.title_text_color_override;
            int iHashCode5 = (iHashCode4 + (themedColorDto == null ? 0 : themedColorDto.hashCode())) * 31;
            ThemedColorDto themedColorDto2 = this.content_text_color_override;
            return iHashCode5 + (themedColorDto2 != null ? themedColorDto2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", content=" + this.content + ", supplemental_action=" + this.supplemental_action + ", text_style_override=" + this.text_style_override + ", title_text_color_override=" + this.title_text_color_override + ", content_text_color_override=" + this.content_text_color_override + ")";
        }

        /* compiled from: ValuePropContentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/ValuePropContentDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/ValuePropContentDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ValuePropContentDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, RenderableTextDto renderableTextDto, TextWithActionDto textWithActionDto, TextStyleDto textStyleDto, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.title = null;
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.content = null;
            } else {
                this.content = renderableTextDto;
            }
            if ((i & 4) == 0) {
                this.supplemental_action = null;
            } else {
                this.supplemental_action = textWithActionDto;
            }
            if ((i & 8) == 0) {
                this.text_style_override = null;
            } else {
                this.text_style_override = textStyleDto;
            }
            if ((i & 16) == 0) {
                this.title_text_color_override = null;
            } else {
                this.title_text_color_override = themedColorDto;
            }
            if ((i & 32) == 0) {
                this.content_text_color_override = null;
            } else {
                this.content_text_color_override = themedColorDto2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            String str = self.title;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, str);
            }
            RenderableTextDto renderableTextDto = self.content;
            if (renderableTextDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, RenderableTextDto.Serializer.INSTANCE, renderableTextDto);
            }
            TextWithActionDto textWithActionDto = self.supplemental_action;
            if (textWithActionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, TextWithActionDto.Serializer.INSTANCE, textWithActionDto);
            }
            TextStyleDto textStyleDto = self.text_style_override;
            if (textStyleDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, TextStyleDto.Serializer.INSTANCE, textStyleDto);
            }
            ThemedColorDto themedColorDto = self.title_text_color_override;
            if (themedColorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, ThemedColorDto.Serializer.INSTANCE, themedColorDto);
            }
            ThemedColorDto themedColorDto2 = self.content_text_color_override;
            if (themedColorDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, ThemedColorDto.Serializer.INSTANCE, themedColorDto2);
            }
        }

        public Surrogate(String str, RenderableTextDto renderableTextDto, TextWithActionDto textWithActionDto, TextStyleDto textStyleDto, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2) {
            this.title = str;
            this.content = renderableTextDto;
            this.supplemental_action = textWithActionDto;
            this.text_style_override = textStyleDto;
            this.title_text_color_override = themedColorDto;
            this.content_text_color_override = themedColorDto2;
        }

        public /* synthetic */ Surrogate(String str, RenderableTextDto renderableTextDto, TextWithActionDto textWithActionDto, TextStyleDto textStyleDto, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : renderableTextDto, (i & 4) != 0 ? null : textWithActionDto, (i & 8) != 0 ? null : textStyleDto, (i & 16) != 0 ? null : themedColorDto, (i & 32) != 0 ? null : themedColorDto2);
        }

        public final String getTitle() {
            return this.title;
        }

        public final RenderableTextDto getContent() {
            return this.content;
        }

        public final TextWithActionDto getSupplemental_action() {
            return this.supplemental_action;
        }

        public final TextStyleDto getText_style_override() {
            return this.text_style_override;
        }

        public final ThemedColorDto getTitle_text_color_override() {
            return this.title_text_color_override;
        }

        public final ThemedColorDto getContent_text_color_override() {
            return this.content_text_color_override;
        }
    }

    /* compiled from: ValuePropContentDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/ValuePropContentDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/ValuePropContentDto;", "Lrh_server_driven_ui/v1/ValuePropContent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/ValuePropContentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ValuePropContentDto, ValuePropContent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ValuePropContentDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ValuePropContentDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ValuePropContentDto> getBinaryBase64Serializer() {
            return (KSerializer) ValuePropContentDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ValuePropContent> getProtoAdapter() {
            return ValuePropContent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ValuePropContentDto getZeroValue() {
            return ValuePropContentDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ValuePropContentDto fromProto(ValuePropContent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String title = proto.getTitle();
            RenderableText content = proto.getContent();
            DefaultConstructorMarker defaultConstructorMarker = null;
            RenderableTextDto renderableTextDtoFromProto = content != null ? RenderableTextDto.INSTANCE.fromProto(content) : null;
            TextWithAction supplemental_action = proto.getSupplemental_action();
            TextWithActionDto textWithActionDtoFromProto = supplemental_action != null ? TextWithActionDto.INSTANCE.fromProto(supplemental_action) : null;
            TextStyle text_style_override = proto.getText_style_override();
            TextStyleDto textStyleDtoFromProto = text_style_override != null ? TextStyleDto.INSTANCE.fromProto(text_style_override) : null;
            ThemedColor title_text_color_override = proto.getTitle_text_color_override();
            ThemedColorDto themedColorDtoFromProto = title_text_color_override != null ? ThemedColorDto.INSTANCE.fromProto(title_text_color_override) : null;
            ThemedColor content_text_color_override = proto.getContent_text_color_override();
            return new ValuePropContentDto(new Surrogate(title, renderableTextDtoFromProto, textWithActionDtoFromProto, textStyleDtoFromProto, themedColorDtoFromProto, content_text_color_override != null ? ThemedColorDto.INSTANCE.fromProto(content_text_color_override) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.ValuePropContentDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ValuePropContentDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ValuePropContentDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ValuePropContentDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/ValuePropContentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/ValuePropContentDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/ValuePropContentDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<ValuePropContentDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.ValuePropContent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ValuePropContentDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ValuePropContentDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ValuePropContentDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ValuePropContentDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/ValuePropContentDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.ValuePropContentDto";
        }
    }
}
