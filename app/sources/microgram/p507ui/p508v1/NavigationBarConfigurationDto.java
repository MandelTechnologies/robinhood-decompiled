package microgram.p507ui.p508v1;

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
import com.robinhood.utils.extensions.ResourceTypes;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import microgram.p507ui.p508v1.NavigationBarConfiguration;
import microgram.p507ui.p508v1.NavigationBarConfigurationDto;
import microgram.p507ui.p508v1.ProgressBarDto;
import rh_server_driven_ui.p531v1.Button;
import rh_server_driven_ui.p531v1.ButtonDto;
import rh_server_driven_ui.p531v1.ThemedColor;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: NavigationBarConfigurationDto.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000554678B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BU\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0006\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001eH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001eH\u0016¢\u0006\u0004\b'\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f8F¢\u0006\u0006\u001a\u0004\b/\u0010.R\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00069"}, m3636d2 = {"Lmicrogram/ui/v1/NavigationBarConfigurationDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/ui/v1/NavigationBarConfiguration;", "Landroid/os/Parcelable;", "Lmicrogram/ui/v1/NavigationBarConfigurationDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/ui/v1/NavigationBarConfigurationDto$Surrogate;)V", "Lmicrogram/ui/v1/NavigationBarConfigurationDto$StyleDto;", ResourceTypes.STYLE, "Lrh_server_driven_ui/v1/ThemedColorDto;", "tint_color", "", "Lrh_server_driven_ui/v1/ButtonDto;", "left_buttons", "right_buttons", "", "hides_back_button", "Lmicrogram/ui/v1/ProgressBarDto;", "progress_bar", "(Lmicrogram/ui/v1/NavigationBarConfigurationDto$StyleDto;Lrh_server_driven_ui/v1/ThemedColorDto;Ljava/util/List;Ljava/util/List;ZLmicrogram/ui/v1/ProgressBarDto;)V", "toProto", "()Lmicrogram/ui/v1/NavigationBarConfiguration;", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/ui/v1/NavigationBarConfigurationDto$Surrogate;", "getStyle", "()Lmicrogram/ui/v1/NavigationBarConfigurationDto$StyleDto;", "getTint_color", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getLeft_buttons", "()Ljava/util/List;", "getRight_buttons", "getHides_back_button", "()Z", "getProgress_bar", "()Lmicrogram/ui/v1/ProgressBarDto;", "Companion", "Surrogate", "StyleDto", "Serializer", "MultibindingModule", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes23.dex */
public final class NavigationBarConfigurationDto implements Dto3<NavigationBarConfiguration>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<NavigationBarConfigurationDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<NavigationBarConfigurationDto, NavigationBarConfiguration>> binaryBase64Serializer$delegate;
    private static final NavigationBarConfigurationDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ NavigationBarConfigurationDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private NavigationBarConfigurationDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final StyleDto getStyle() {
        return this.surrogate.getStyle();
    }

    public final ThemedColorDto getTint_color() {
        return this.surrogate.getTint_color();
    }

    public final List<ButtonDto> getLeft_buttons() {
        return this.surrogate.getLeft_buttons();
    }

    public final List<ButtonDto> getRight_buttons() {
        return this.surrogate.getRight_buttons();
    }

    public final boolean getHides_back_button() {
        return this.surrogate.getHides_back_button();
    }

    public final ProgressBarDto getProgress_bar() {
        return this.surrogate.getProgress_bar();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ NavigationBarConfigurationDto(microgram.ui.v1.NavigationBarConfigurationDto.StyleDto r2, rh_server_driven_ui.p531v1.ThemedColorDto r3, java.util.List r4, java.util.List r5, boolean r6, microgram.p507ui.p508v1.ProgressBarDto r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto La
            microgram.ui.v1.NavigationBarConfigurationDto$StyleDto$Companion r2 = microgram.ui.v1.NavigationBarConfigurationDto.StyleDto.INSTANCE
            microgram.ui.v1.NavigationBarConfigurationDto$StyleDto r2 = r2.getZeroValue()
        La:
            r9 = r8 & 2
            r0 = 0
            if (r9 == 0) goto L10
            r3 = r0
        L10:
            r9 = r8 & 4
            if (r9 == 0) goto L18
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
        L18:
            r9 = r8 & 8
            if (r9 == 0) goto L20
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
        L20:
            r9 = r8 & 16
            if (r9 == 0) goto L25
            r6 = 0
        L25:
            r8 = r8 & 32
            if (r8 == 0) goto L31
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L38
        L31:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L38:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: microgram.p507ui.p508v1.NavigationBarConfigurationDto.<init>(microgram.ui.v1.NavigationBarConfigurationDto$StyleDto, rh_server_driven_ui.v1.ThemedColorDto, java.util.List, java.util.List, boolean, microgram.ui.v1.ProgressBarDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavigationBarConfigurationDto(StyleDto style, ThemedColorDto themedColorDto, List<ButtonDto> left_buttons, List<ButtonDto> right_buttons, boolean z, ProgressBarDto progressBarDto) {
        this(new Surrogate(style, themedColorDto, left_buttons, right_buttons, z, progressBarDto));
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(left_buttons, "left_buttons");
        Intrinsics.checkNotNullParameter(right_buttons, "right_buttons");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public NavigationBarConfiguration toProto() {
        NavigationBarConfiguration.Style style = (NavigationBarConfiguration.Style) this.surrogate.getStyle().toProto();
        ThemedColorDto tint_color = this.surrogate.getTint_color();
        ThemedColor proto = tint_color != null ? tint_color.toProto() : null;
        List<ButtonDto> left_buttons = this.surrogate.getLeft_buttons();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(left_buttons, 10));
        Iterator<T> it = left_buttons.iterator();
        while (it.hasNext()) {
            arrayList.add(((ButtonDto) it.next()).toProto());
        }
        List<ButtonDto> right_buttons = this.surrogate.getRight_buttons();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(right_buttons, 10));
        Iterator<T> it2 = right_buttons.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ButtonDto) it2.next()).toProto());
        }
        boolean hides_back_button = this.surrogate.getHides_back_button();
        ProgressBarDto progress_bar = this.surrogate.getProgress_bar();
        return new NavigationBarConfiguration(style, proto, arrayList, arrayList2, hides_back_button, progress_bar != null ? progress_bar.toProto() : null, null, 64, null);
    }

    public String toString() {
        return "[NavigationBarConfigurationDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof NavigationBarConfigurationDto) && Intrinsics.areEqual(((NavigationBarConfigurationDto) other).surrogate, this.surrogate);
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
    /* compiled from: NavigationBarConfigurationDto.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b!\b\u0083\b\u0018\u0000 =2\u00020\u0001:\u0002>=BS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBa\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010+\u0012\u0004\b.\u0010*\u001a\u0004\b,\u0010-R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010/\u0012\u0004\b2\u0010*\u001a\u0004\b0\u00101R&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010/\u0012\u0004\b4\u0010*\u001a\u0004\b3\u00101R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00105\u0012\u0004\b8\u0010*\u001a\u0004\b6\u00107R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00109\u0012\u0004\b<\u0010*\u001a\u0004\b:\u0010;¨\u0006?"}, m3636d2 = {"Lmicrogram/ui/v1/NavigationBarConfigurationDto$Surrogate;", "", "Lmicrogram/ui/v1/NavigationBarConfigurationDto$StyleDto;", ResourceTypes.STYLE, "Lrh_server_driven_ui/v1/ThemedColorDto;", "tint_color", "", "Lrh_server_driven_ui/v1/ButtonDto;", "left_buttons", "right_buttons", "", "hides_back_button", "Lmicrogram/ui/v1/ProgressBarDto;", "progress_bar", "<init>", "(Lmicrogram/ui/v1/NavigationBarConfigurationDto$StyleDto;Lrh_server_driven_ui/v1/ThemedColorDto;Ljava/util/List;Ljava/util/List;ZLmicrogram/ui/v1/ProgressBarDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmicrogram/ui/v1/NavigationBarConfigurationDto$StyleDto;Lrh_server_driven_ui/v1/ThemedColorDto;Ljava/util/List;Ljava/util/List;ZLmicrogram/ui/v1/ProgressBarDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui_v1_externalRelease", "(Lmicrogram/ui/v1/NavigationBarConfigurationDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/v1/NavigationBarConfigurationDto$StyleDto;", "getStyle", "()Lmicrogram/ui/v1/NavigationBarConfigurationDto$StyleDto;", "getStyle$annotations", "()V", "Lrh_server_driven_ui/v1/ThemedColorDto;", "getTint_color", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getTint_color$annotations", "Ljava/util/List;", "getLeft_buttons", "()Ljava/util/List;", "getLeft_buttons$annotations", "getRight_buttons", "getRight_buttons$annotations", "Z", "getHides_back_button", "()Z", "getHides_back_button$annotations", "Lmicrogram/ui/v1/ProgressBarDto;", "getProgress_bar", "()Lmicrogram/ui/v1/ProgressBarDto;", "getProgress_bar$annotations", "Companion", "$serializer", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean hides_back_button;
        private final List<ButtonDto> left_buttons;
        private final ProgressBarDto progress_bar;
        private final List<ButtonDto> right_buttons;
        private final StyleDto style;
        private final ThemedColorDto tint_color;

        public Surrogate() {
            this((StyleDto) null, (ThemedColorDto) null, (List) null, (List) null, false, (ProgressBarDto) null, 63, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(ButtonDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(ButtonDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.style == surrogate.style && Intrinsics.areEqual(this.tint_color, surrogate.tint_color) && Intrinsics.areEqual(this.left_buttons, surrogate.left_buttons) && Intrinsics.areEqual(this.right_buttons, surrogate.right_buttons) && this.hides_back_button == surrogate.hides_back_button && Intrinsics.areEqual(this.progress_bar, surrogate.progress_bar);
        }

        public int hashCode() {
            int iHashCode = this.style.hashCode() * 31;
            ThemedColorDto themedColorDto = this.tint_color;
            int iHashCode2 = (((((((iHashCode + (themedColorDto == null ? 0 : themedColorDto.hashCode())) * 31) + this.left_buttons.hashCode()) * 31) + this.right_buttons.hashCode()) * 31) + Boolean.hashCode(this.hides_back_button)) * 31;
            ProgressBarDto progressBarDto = this.progress_bar;
            return iHashCode2 + (progressBarDto != null ? progressBarDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(style=" + this.style + ", tint_color=" + this.tint_color + ", left_buttons=" + this.left_buttons + ", right_buttons=" + this.right_buttons + ", hides_back_button=" + this.hides_back_button + ", progress_bar=" + this.progress_bar + ")";
        }

        /* compiled from: NavigationBarConfigurationDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/ui/v1/NavigationBarConfigurationDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/v1/NavigationBarConfigurationDto$Surrogate;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return NavigationBarConfigurationDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: microgram.ui.v1.NavigationBarConfigurationDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NavigationBarConfigurationDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: microgram.ui.v1.NavigationBarConfigurationDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NavigationBarConfigurationDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), null, null};
        }

        public /* synthetic */ Surrogate(int i, StyleDto styleDto, ThemedColorDto themedColorDto, List list, List list2, boolean z, ProgressBarDto progressBarDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.style = (i & 1) == 0 ? StyleDto.INSTANCE.getZeroValue() : styleDto;
            if ((i & 2) == 0) {
                this.tint_color = null;
            } else {
                this.tint_color = themedColorDto;
            }
            if ((i & 4) == 0) {
                this.left_buttons = CollectionsKt.emptyList();
            } else {
                this.left_buttons = list;
            }
            if ((i & 8) == 0) {
                this.right_buttons = CollectionsKt.emptyList();
            } else {
                this.right_buttons = list2;
            }
            if ((i & 16) == 0) {
                this.hides_back_button = false;
            } else {
                this.hides_back_button = z;
            }
            if ((i & 32) == 0) {
                this.progress_bar = null;
            } else {
                this.progress_bar = progressBarDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$microgram_ui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (self.style != StyleDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, StyleDto.Serializer.INSTANCE, self.style);
            }
            ThemedColorDto themedColorDto = self.tint_color;
            if (themedColorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, ThemedColorDto.Serializer.INSTANCE, themedColorDto);
            }
            if (!Intrinsics.areEqual(self.left_buttons, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.left_buttons);
            }
            if (!Intrinsics.areEqual(self.right_buttons, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.right_buttons);
            }
            boolean z = self.hides_back_button;
            if (z) {
                output.encodeBooleanElement(serialDesc, 4, z);
            }
            ProgressBarDto progressBarDto = self.progress_bar;
            if (progressBarDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, ProgressBarDto.Serializer.INSTANCE, progressBarDto);
            }
        }

        public Surrogate(StyleDto style, ThemedColorDto themedColorDto, List<ButtonDto> left_buttons, List<ButtonDto> right_buttons, boolean z, ProgressBarDto progressBarDto) {
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(left_buttons, "left_buttons");
            Intrinsics.checkNotNullParameter(right_buttons, "right_buttons");
            this.style = style;
            this.tint_color = themedColorDto;
            this.left_buttons = left_buttons;
            this.right_buttons = right_buttons;
            this.hides_back_button = z;
            this.progress_bar = progressBarDto;
        }

        public final StyleDto getStyle() {
            return this.style;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(microgram.ui.v1.NavigationBarConfigurationDto.StyleDto r2, rh_server_driven_ui.p531v1.ThemedColorDto r3, java.util.List r4, java.util.List r5, boolean r6, microgram.p507ui.p508v1.ProgressBarDto r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r1 = this;
                r9 = r8 & 1
                if (r9 == 0) goto La
                microgram.ui.v1.NavigationBarConfigurationDto$StyleDto$Companion r2 = microgram.ui.v1.NavigationBarConfigurationDto.StyleDto.INSTANCE
                microgram.ui.v1.NavigationBarConfigurationDto$StyleDto r2 = r2.getZeroValue()
            La:
                r9 = r8 & 2
                r0 = 0
                if (r9 == 0) goto L10
                r3 = r0
            L10:
                r9 = r8 & 4
                if (r9 == 0) goto L18
                java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            L18:
                r9 = r8 & 8
                if (r9 == 0) goto L20
                java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
            L20:
                r9 = r8 & 16
                if (r9 == 0) goto L25
                r6 = 0
            L25:
                r8 = r8 & 32
                if (r8 == 0) goto L31
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L38
            L31:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L38:
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: microgram.p507ui.p508v1.NavigationBarConfigurationDto.Surrogate.<init>(microgram.ui.v1.NavigationBarConfigurationDto$StyleDto, rh_server_driven_ui.v1.ThemedColorDto, java.util.List, java.util.List, boolean, microgram.ui.v1.ProgressBarDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final ThemedColorDto getTint_color() {
            return this.tint_color;
        }

        public final List<ButtonDto> getLeft_buttons() {
            return this.left_buttons;
        }

        public final List<ButtonDto> getRight_buttons() {
            return this.right_buttons;
        }

        public final boolean getHides_back_button() {
            return this.hides_back_button;
        }

        public final ProgressBarDto getProgress_bar() {
            return this.progress_bar;
        }
    }

    /* compiled from: NavigationBarConfigurationDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/ui/v1/NavigationBarConfigurationDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/ui/v1/NavigationBarConfigurationDto;", "Lmicrogram/ui/v1/NavigationBarConfiguration;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/ui/v1/NavigationBarConfigurationDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<NavigationBarConfigurationDto, NavigationBarConfiguration> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<NavigationBarConfigurationDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NavigationBarConfigurationDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NavigationBarConfigurationDto> getBinaryBase64Serializer() {
            return (KSerializer) NavigationBarConfigurationDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<NavigationBarConfiguration> getProtoAdapter() {
            return NavigationBarConfiguration.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NavigationBarConfigurationDto getZeroValue() {
            return NavigationBarConfigurationDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NavigationBarConfigurationDto fromProto(NavigationBarConfiguration proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            StyleDto styleDtoFromProto = StyleDto.INSTANCE.fromProto(proto.getStyle());
            ThemedColor tint_color = proto.getTint_color();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ThemedColorDto themedColorDtoFromProto = tint_color != null ? ThemedColorDto.INSTANCE.fromProto(tint_color) : null;
            List<Button> left_buttons = proto.getLeft_buttons();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(left_buttons, 10));
            Iterator<T> it = left_buttons.iterator();
            while (it.hasNext()) {
                arrayList.add(ButtonDto.INSTANCE.fromProto((Button) it.next()));
            }
            List<Button> right_buttons = proto.getRight_buttons();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(right_buttons, 10));
            Iterator<T> it2 = right_buttons.iterator();
            while (it2.hasNext()) {
                arrayList2.add(ButtonDto.INSTANCE.fromProto((Button) it2.next()));
            }
            boolean hides_back_button = proto.getHides_back_button();
            ProgressBar progress_bar = proto.getProgress_bar();
            return new NavigationBarConfigurationDto(new Surrogate(styleDtoFromProto, themedColorDtoFromProto, arrayList, arrayList2, hides_back_button, progress_bar != null ? ProgressBarDto.INSTANCE.fromProto(progress_bar) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.ui.v1.NavigationBarConfigurationDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NavigationBarConfigurationDto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new NavigationBarConfigurationDto(null, null, null, null, false, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NavigationBarConfigurationDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/ui/v1/NavigationBarConfigurationDto$StyleDto;", "Lcom/robinhood/idl/EnumDto;", "Lmicrogram/ui/v1/NavigationBarConfiguration$Style;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "STYLE_UNSPECIFIED", "STANDARD", "TRANSPARENT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class StyleDto implements Dto2<NavigationBarConfiguration.Style>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StyleDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<StyleDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<StyleDto, NavigationBarConfiguration.Style>> binaryBase64Serializer$delegate;
        public static final StyleDto STYLE_UNSPECIFIED = new STYLE_UNSPECIFIED("STYLE_UNSPECIFIED", 0);
        public static final StyleDto STANDARD = new STANDARD("STANDARD", 1);
        public static final StyleDto TRANSPARENT = new TRANSPARENT("TRANSPARENT", 2);

        private static final /* synthetic */ StyleDto[] $values() {
            return new StyleDto[]{STYLE_UNSPECIFIED, STANDARD, TRANSPARENT};
        }

        public /* synthetic */ StyleDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<StyleDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: NavigationBarConfigurationDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"microgram/ui/v1/NavigationBarConfigurationDto.StyleDto.STYLE_UNSPECIFIED", "Lmicrogram/ui/v1/NavigationBarConfigurationDto$StyleDto;", "toProto", "Lmicrogram/ui/v1/NavigationBarConfiguration$Style;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STYLE_UNSPECIFIED extends StyleDto {
            STYLE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NavigationBarConfiguration.Style toProto() {
                return NavigationBarConfiguration.Style.STYLE_UNSPECIFIED;
            }
        }

        private StyleDto(String str, int i) {
        }

        static {
            StyleDto[] styleDtoArr$values = $values();
            $VALUES = styleDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(styleDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.ui.v1.NavigationBarConfigurationDto$StyleDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NavigationBarConfigurationDto.StyleDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: NavigationBarConfigurationDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"microgram/ui/v1/NavigationBarConfigurationDto.StyleDto.STANDARD", "Lmicrogram/ui/v1/NavigationBarConfigurationDto$StyleDto;", "toProto", "Lmicrogram/ui/v1/NavigationBarConfiguration$Style;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STANDARD extends StyleDto {
            STANDARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NavigationBarConfiguration.Style toProto() {
                return NavigationBarConfiguration.Style.STANDARD;
            }
        }

        /* compiled from: NavigationBarConfigurationDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"microgram/ui/v1/NavigationBarConfigurationDto.StyleDto.TRANSPARENT", "Lmicrogram/ui/v1/NavigationBarConfigurationDto$StyleDto;", "toProto", "Lmicrogram/ui/v1/NavigationBarConfiguration$Style;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TRANSPARENT extends StyleDto {
            TRANSPARENT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NavigationBarConfiguration.Style toProto() {
                return NavigationBarConfiguration.Style.TRANSPARENT;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: NavigationBarConfigurationDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/ui/v1/NavigationBarConfigurationDto$StyleDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lmicrogram/ui/v1/NavigationBarConfigurationDto$StyleDto;", "Lmicrogram/ui/v1/NavigationBarConfiguration$Style;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/ui/v1/NavigationBarConfigurationDto$StyleDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<StyleDto, NavigationBarConfiguration.Style> {

            /* compiled from: NavigationBarConfigurationDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes14.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[NavigationBarConfiguration.Style.values().length];
                    try {
                        iArr[NavigationBarConfiguration.Style.STYLE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[NavigationBarConfiguration.Style.STANDARD.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[NavigationBarConfiguration.Style.TRANSPARENT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<StyleDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<StyleDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<StyleDto> getBinaryBase64Serializer() {
                return (KSerializer) StyleDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<NavigationBarConfiguration.Style> getProtoAdapter() {
                return NavigationBarConfiguration.Style.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public StyleDto getZeroValue() {
                return StyleDto.STYLE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public StyleDto fromProto(NavigationBarConfiguration.Style proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return StyleDto.STYLE_UNSPECIFIED;
                }
                if (i == 2) {
                    return StyleDto.STANDARD;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return StyleDto.TRANSPARENT;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: NavigationBarConfigurationDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lmicrogram/ui/v1/NavigationBarConfigurationDto$StyleDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/v1/NavigationBarConfigurationDto$StyleDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final class Serializer implements KSerializer<StyleDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<StyleDto, NavigationBarConfiguration.Style> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/microgram.ui.v1.NavigationBarConfiguration.Style", StyleDto.getEntries(), StyleDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public StyleDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (StyleDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, StyleDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static StyleDto valueOf(String str) {
            return (StyleDto) Enum.valueOf(StyleDto.class, str);
        }

        public static StyleDto[] values() {
            return (StyleDto[]) $VALUES.clone();
        }
    }

    /* compiled from: NavigationBarConfigurationDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/ui/v1/NavigationBarConfigurationDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/v1/NavigationBarConfigurationDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/ui/v1/NavigationBarConfigurationDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes14.dex */
    public static final class Serializer implements KSerializer<NavigationBarConfigurationDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.ui.v1.NavigationBarConfiguration", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, NavigationBarConfigurationDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public NavigationBarConfigurationDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new NavigationBarConfigurationDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: NavigationBarConfigurationDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/v1/NavigationBarConfigurationDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "microgram.ui.v1.NavigationBarConfigurationDto";
        }
    }
}
