package microgram.p507ui.p508v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.ScreenDto;
import com.squareup.wire.ProtoAdapter;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import microgram.p507ui.p508v1.BottomSheetBackgroundDto;
import microgram.p507ui.p508v1.BottomSheetContentDto;
import microgram.p507ui.p508v1.LoggingContextDto;
import microgram.p507ui.p508v1.ThemeDto;
import rh_server_driven_ui.p531v1.UIComponent;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: BottomSheetContentDto.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0019\b\u0007\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004?>@AB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0089\u0001\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0006\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010 H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\rH\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\rH\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\rH\u0016¢\u0006\u0004\b,\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F¢\u0006\u0006\u001a\u0004\b4\u00101R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b7\u00106R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006B"}, m3636d2 = {"Lmicrogram/ui/v1/BottomSheetContentDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/ui/v1/BottomSheetContent;", "Landroid/os/Parcelable;", "Lmicrogram/ui/v1/BottomSheetContentDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/ui/v1/BottomSheetContentDto$Surrogate;)V", "Lmicrogram/ui/v1/BottomSheetBackgroundDto;", "background", "", "Lrh_server_driven_ui/v1/UIComponentDto;", CarResultComposable2.BODY, "", "corner_radius", Footer.f10637type, "", "name", "", "android_can_dismiss_with_back_press", "cannot_passively_dismiss", "Lmicrogram/ui/v1/ThemeDto;", "theme", "Lcom/robinhood/rosetta/eventlogging/ScreenDto;", "screen", "Lmicrogram/ui/v1/LoggingContextDto;", "logging_context", "(Lmicrogram/ui/v1/BottomSheetBackgroundDto;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lmicrogram/ui/v1/ThemeDto;Lcom/robinhood/rosetta/eventlogging/ScreenDto;Lmicrogram/ui/v1/LoggingContextDto;)V", "toProto", "()Lmicrogram/ui/v1/BottomSheetContent;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/ui/v1/BottomSheetContentDto$Surrogate;", "getBackground", "()Lmicrogram/ui/v1/BottomSheetBackgroundDto;", "getBody", "()Ljava/util/List;", "getCorner_radius", "()Ljava/lang/Integer;", "getFooter", "getAndroid_can_dismiss_with_back_press", "()Ljava/lang/Boolean;", "getCannot_passively_dismiss", "getTheme", "()Lmicrogram/ui/v1/ThemeDto;", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/ScreenDto;", "getLogging_context", "()Lmicrogram/ui/v1/LoggingContextDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes23.dex */
public final class BottomSheetContentDto implements Dto3<BottomSheetContent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<BottomSheetContentDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<BottomSheetContentDto, BottomSheetContent>> binaryBase64Serializer$delegate;
    private static final BottomSheetContentDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ BottomSheetContentDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private BottomSheetContentDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final BottomSheetBackgroundDto getBackground() {
        return this.surrogate.getBackground();
    }

    public final List<UIComponentDto> getBody() {
        return this.surrogate.getBody();
    }

    public final Integer getCorner_radius() {
        return this.surrogate.getCorner_radius();
    }

    public final List<UIComponentDto> getFooter() {
        return this.surrogate.getFooter();
    }

    public final Boolean getAndroid_can_dismiss_with_back_press() {
        return this.surrogate.getAndroid_can_dismiss_with_back_press();
    }

    public final Boolean getCannot_passively_dismiss() {
        return this.surrogate.getCannot_passively_dismiss();
    }

    public final ThemeDto getTheme() {
        return this.surrogate.getTheme();
    }

    public final ScreenDto getScreen() {
        return this.surrogate.getScreen();
    }

    public final LoggingContextDto getLogging_context() {
        return this.surrogate.getLogging_context();
    }

    public /* synthetic */ BottomSheetContentDto(BottomSheetBackgroundDto bottomSheetBackgroundDto, List list, Integer num, List list2, String str, Boolean bool, Boolean bool2, ThemeDto themeDto, ScreenDto screenDto, LoggingContextDto loggingContextDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bottomSheetBackgroundDto, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : num, (i & 8) != 0 ? CollectionsKt.emptyList() : list2, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : bool2, (i & 128) != 0 ? null : themeDto, (i & 256) != 0 ? null : screenDto, (i & 512) != 0 ? null : loggingContextDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomSheetContentDto(BottomSheetBackgroundDto bottomSheetBackgroundDto, List<UIComponentDto> body, Integer num, List<UIComponentDto> footer, String str, Boolean bool, Boolean bool2, ThemeDto themeDto, ScreenDto screenDto, LoggingContextDto loggingContextDto) {
        this(new Surrogate(bottomSheetBackgroundDto, body, num, footer, str, bool, bool2, themeDto, screenDto, loggingContextDto));
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(footer, "footer");
    }

    @Override // com.robinhood.idl.Dto
    public BottomSheetContent toProto() {
        BottomSheetBackgroundDto background = this.surrogate.getBackground();
        BottomSheetBackground proto = background != null ? background.toProto() : null;
        List<UIComponentDto> body = this.surrogate.getBody();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(body, 10));
        Iterator<T> it = body.iterator();
        while (it.hasNext()) {
            arrayList.add(((UIComponentDto) it.next()).toProto());
        }
        Integer corner_radius = this.surrogate.getCorner_radius();
        List<UIComponentDto> footer = this.surrogate.getFooter();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(footer, 10));
        Iterator<T> it2 = footer.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((UIComponentDto) it2.next()).toProto());
        }
        String name = this.surrogate.getName();
        Boolean android_can_dismiss_with_back_press = this.surrogate.getAndroid_can_dismiss_with_back_press();
        Boolean cannot_passively_dismiss = this.surrogate.getCannot_passively_dismiss();
        ThemeDto theme = this.surrogate.getTheme();
        Theme proto2 = theme != null ? theme.toProto() : null;
        ScreenDto screen = this.surrogate.getScreen();
        Screen proto3 = screen != null ? screen.toProto() : null;
        LoggingContextDto logging_context = this.surrogate.getLogging_context();
        return new BottomSheetContent(proto, arrayList, corner_radius, arrayList2, name, android_can_dismiss_with_back_press, cannot_passively_dismiss, proto2, proto3, logging_context != null ? logging_context.toProto() : null, null, 1024, null);
    }

    public String toString() {
        return "[BottomSheetContentDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof BottomSheetContentDto) && Intrinsics.areEqual(((BottomSheetContentDto) other).surrogate, this.surrogate);
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
    /* compiled from: BottomSheetContentDto.kt */
    @Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b1\b\u0083\b\u0018\u0000 R2\u00020\u0001:\u0002SRB\u0096\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0019\b\u0002\u0010\u000b\u001a\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019B\u008b\u0001\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0018\u0010\u001dJ'\u0010&\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u000f2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010.\u0012\u0004\b1\u00102\u001a\u0004\b/\u00100R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00103\u0012\u0004\b6\u00102\u001a\u0004\b4\u00105R1\u0010\u000b\u001a\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00107\u0012\u0004\b:\u00102\u001a\u0004\b8\u00109R&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00103\u0012\u0004\b<\u00102\u001a\u0004\b;\u00105R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010=\u0012\u0004\b?\u00102\u001a\u0004\b>\u0010(R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010@\u0012\u0004\bC\u00102\u001a\u0004\bA\u0010BR\"\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010@\u0012\u0004\bE\u00102\u001a\u0004\bD\u0010BR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010F\u0012\u0004\bI\u00102\u001a\u0004\bG\u0010HR\"\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010J\u0012\u0004\bM\u00102\u001a\u0004\bK\u0010LR\"\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010N\u0012\u0004\bQ\u00102\u001a\u0004\bO\u0010P¨\u0006T"}, m3636d2 = {"Lmicrogram/ui/v1/BottomSheetContentDto$Surrogate;", "", "Lmicrogram/ui/v1/BottomSheetBackgroundDto;", "background", "", "Lrh_server_driven_ui/v1/UIComponentDto;", CarResultComposable2.BODY, "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "corner_radius", Footer.f10637type, "", "name", "", "android_can_dismiss_with_back_press", "cannot_passively_dismiss", "Lmicrogram/ui/v1/ThemeDto;", "theme", "Lcom/robinhood/rosetta/eventlogging/ScreenDto;", "screen", "Lmicrogram/ui/v1/LoggingContextDto;", "logging_context", "<init>", "(Lmicrogram/ui/v1/BottomSheetBackgroundDto;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lmicrogram/ui/v1/ThemeDto;Lcom/robinhood/rosetta/eventlogging/ScreenDto;Lmicrogram/ui/v1/LoggingContextDto;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmicrogram/ui/v1/BottomSheetBackgroundDto;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lmicrogram/ui/v1/ThemeDto;Lcom/robinhood/rosetta/eventlogging/ScreenDto;Lmicrogram/ui/v1/LoggingContextDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui_v1_externalRelease", "(Lmicrogram/ui/v1/BottomSheetContentDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/v1/BottomSheetBackgroundDto;", "getBackground", "()Lmicrogram/ui/v1/BottomSheetBackgroundDto;", "getBackground$annotations", "()V", "Ljava/util/List;", "getBody", "()Ljava/util/List;", "getBody$annotations", "Ljava/lang/Integer;", "getCorner_radius", "()Ljava/lang/Integer;", "getCorner_radius$annotations", "getFooter", "getFooter$annotations", "Ljava/lang/String;", "getName", "getName$annotations", "Ljava/lang/Boolean;", "getAndroid_can_dismiss_with_back_press", "()Ljava/lang/Boolean;", "getAndroid_can_dismiss_with_back_press$annotations", "getCannot_passively_dismiss", "getCannot_passively_dismiss$annotations", "Lmicrogram/ui/v1/ThemeDto;", "getTheme", "()Lmicrogram/ui/v1/ThemeDto;", "getTheme$annotations", "Lcom/robinhood/rosetta/eventlogging/ScreenDto;", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/ScreenDto;", "getScreen$annotations", "Lmicrogram/ui/v1/LoggingContextDto;", "getLogging_context", "()Lmicrogram/ui/v1/LoggingContextDto;", "getLogging_context$annotations", "Companion", "$serializer", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Boolean android_can_dismiss_with_back_press;
        private final BottomSheetBackgroundDto background;
        private final List<UIComponentDto> body;
        private final Boolean cannot_passively_dismiss;
        private final Integer corner_radius;
        private final List<UIComponentDto> footer;
        private final LoggingContextDto logging_context;
        private final String name;
        private final ScreenDto screen;
        private final ThemeDto theme;

        public Surrogate() {
            this((BottomSheetBackgroundDto) null, (List) null, (Integer) null, (List) null, (String) null, (Boolean) null, (Boolean) null, (ThemeDto) null, (ScreenDto) null, (LoggingContextDto) null, 1023, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(UIComponentDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(UIComponentDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.background, surrogate.background) && Intrinsics.areEqual(this.body, surrogate.body) && Intrinsics.areEqual(this.corner_radius, surrogate.corner_radius) && Intrinsics.areEqual(this.footer, surrogate.footer) && Intrinsics.areEqual(this.name, surrogate.name) && Intrinsics.areEqual(this.android_can_dismiss_with_back_press, surrogate.android_can_dismiss_with_back_press) && Intrinsics.areEqual(this.cannot_passively_dismiss, surrogate.cannot_passively_dismiss) && Intrinsics.areEqual(this.theme, surrogate.theme) && Intrinsics.areEqual(this.screen, surrogate.screen) && Intrinsics.areEqual(this.logging_context, surrogate.logging_context);
        }

        public int hashCode() {
            BottomSheetBackgroundDto bottomSheetBackgroundDto = this.background;
            int iHashCode = (((bottomSheetBackgroundDto == null ? 0 : bottomSheetBackgroundDto.hashCode()) * 31) + this.body.hashCode()) * 31;
            Integer num = this.corner_radius;
            int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.footer.hashCode()) * 31;
            String str = this.name;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.android_can_dismiss_with_back_press;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.cannot_passively_dismiss;
            int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            ThemeDto themeDto = this.theme;
            int iHashCode6 = (iHashCode5 + (themeDto == null ? 0 : themeDto.hashCode())) * 31;
            ScreenDto screenDto = this.screen;
            int iHashCode7 = (iHashCode6 + (screenDto == null ? 0 : screenDto.hashCode())) * 31;
            LoggingContextDto loggingContextDto = this.logging_context;
            return iHashCode7 + (loggingContextDto != null ? loggingContextDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(background=" + this.background + ", body=" + this.body + ", corner_radius=" + this.corner_radius + ", footer=" + this.footer + ", name=" + this.name + ", android_can_dismiss_with_back_press=" + this.android_can_dismiss_with_back_press + ", cannot_passively_dismiss=" + this.cannot_passively_dismiss + ", theme=" + this.theme + ", screen=" + this.screen + ", logging_context=" + this.logging_context + ")";
        }

        /* compiled from: BottomSheetContentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/ui/v1/BottomSheetContentDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/v1/BottomSheetContentDto$Surrogate;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return BottomSheetContentDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: microgram.ui.v1.BottomSheetContentDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BottomSheetContentDto.Surrogate._childSerializers$_anonymous_();
                }
            }), null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: microgram.ui.v1.BottomSheetContentDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BottomSheetContentDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), null, null, null, null, null, null};
        }

        public /* synthetic */ Surrogate(int i, BottomSheetBackgroundDto bottomSheetBackgroundDto, List list, Integer num, List list2, String str, Boolean bool, Boolean bool2, ThemeDto themeDto, ScreenDto screenDto, LoggingContextDto loggingContextDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.background = null;
            } else {
                this.background = bottomSheetBackgroundDto;
            }
            if ((i & 2) == 0) {
                this.body = CollectionsKt.emptyList();
            } else {
                this.body = list;
            }
            if ((i & 4) == 0) {
                this.corner_radius = null;
            } else {
                this.corner_radius = num;
            }
            if ((i & 8) == 0) {
                this.footer = CollectionsKt.emptyList();
            } else {
                this.footer = list2;
            }
            if ((i & 16) == 0) {
                this.name = null;
            } else {
                this.name = str;
            }
            if ((i & 32) == 0) {
                this.android_can_dismiss_with_back_press = null;
            } else {
                this.android_can_dismiss_with_back_press = bool;
            }
            if ((i & 64) == 0) {
                this.cannot_passively_dismiss = null;
            } else {
                this.cannot_passively_dismiss = bool2;
            }
            if ((i & 128) == 0) {
                this.theme = null;
            } else {
                this.theme = themeDto;
            }
            if ((i & 256) == 0) {
                this.screen = null;
            } else {
                this.screen = screenDto;
            }
            if ((i & 512) == 0) {
                this.logging_context = null;
            } else {
                this.logging_context = loggingContextDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$microgram_ui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            BottomSheetBackgroundDto bottomSheetBackgroundDto = self.background;
            if (bottomSheetBackgroundDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, BottomSheetBackgroundDto.Serializer.INSTANCE, bottomSheetBackgroundDto);
            }
            if (!Intrinsics.areEqual(self.body, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.body);
            }
            Integer num = self.corner_radius;
            if (num != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, SignedIntAsNumberSerializer.INSTANCE, num);
            }
            if (!Intrinsics.areEqual(self.footer, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.footer);
            }
            String str = self.name;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, str);
            }
            Boolean bool = self.android_can_dismiss_with_back_press;
            if (bool != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, BooleanSerializer.INSTANCE, bool);
            }
            Boolean bool2 = self.cannot_passively_dismiss;
            if (bool2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, BooleanSerializer.INSTANCE, bool2);
            }
            ThemeDto themeDto = self.theme;
            if (themeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, ThemeDto.Serializer.INSTANCE, themeDto);
            }
            ScreenDto screenDto = self.screen;
            if (screenDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, ScreenDto.Serializer.INSTANCE, screenDto);
            }
            LoggingContextDto loggingContextDto = self.logging_context;
            if (loggingContextDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, LoggingContextDto.Serializer.INSTANCE, loggingContextDto);
            }
        }

        public Surrogate(BottomSheetBackgroundDto bottomSheetBackgroundDto, List<UIComponentDto> body, Integer num, List<UIComponentDto> footer, String str, Boolean bool, Boolean bool2, ThemeDto themeDto, ScreenDto screenDto, LoggingContextDto loggingContextDto) {
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(footer, "footer");
            this.background = bottomSheetBackgroundDto;
            this.body = body;
            this.corner_radius = num;
            this.footer = footer;
            this.name = str;
            this.android_can_dismiss_with_back_press = bool;
            this.cannot_passively_dismiss = bool2;
            this.theme = themeDto;
            this.screen = screenDto;
            this.logging_context = loggingContextDto;
        }

        public final BottomSheetBackgroundDto getBackground() {
            return this.background;
        }

        public final List<UIComponentDto> getBody() {
            return this.body;
        }

        public /* synthetic */ Surrogate(BottomSheetBackgroundDto bottomSheetBackgroundDto, List list, Integer num, List list2, String str, Boolean bool, Boolean bool2, ThemeDto themeDto, ScreenDto screenDto, LoggingContextDto loggingContextDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bottomSheetBackgroundDto, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : num, (i & 8) != 0 ? CollectionsKt.emptyList() : list2, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : bool2, (i & 128) != 0 ? null : themeDto, (i & 256) != 0 ? null : screenDto, (i & 512) != 0 ? null : loggingContextDto);
        }

        public final Integer getCorner_radius() {
            return this.corner_radius;
        }

        public final List<UIComponentDto> getFooter() {
            return this.footer;
        }

        public final String getName() {
            return this.name;
        }

        public final Boolean getAndroid_can_dismiss_with_back_press() {
            return this.android_can_dismiss_with_back_press;
        }

        public final Boolean getCannot_passively_dismiss() {
            return this.cannot_passively_dismiss;
        }

        public final ThemeDto getTheme() {
            return this.theme;
        }

        public final ScreenDto getScreen() {
            return this.screen;
        }

        public final LoggingContextDto getLogging_context() {
            return this.logging_context;
        }
    }

    /* compiled from: BottomSheetContentDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/ui/v1/BottomSheetContentDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/ui/v1/BottomSheetContentDto;", "Lmicrogram/ui/v1/BottomSheetContent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/ui/v1/BottomSheetContentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<BottomSheetContentDto, BottomSheetContent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BottomSheetContentDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BottomSheetContentDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BottomSheetContentDto> getBinaryBase64Serializer() {
            return (KSerializer) BottomSheetContentDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<BottomSheetContent> getProtoAdapter() {
            return BottomSheetContent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BottomSheetContentDto getZeroValue() {
            return BottomSheetContentDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BottomSheetContentDto fromProto(BottomSheetContent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            BottomSheetBackground background = proto.getBackground();
            DefaultConstructorMarker defaultConstructorMarker = null;
            BottomSheetBackgroundDto bottomSheetBackgroundDtoFromProto = background != null ? BottomSheetBackgroundDto.INSTANCE.fromProto(background) : null;
            List<UIComponent> body = proto.getBody();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(body, 10));
            Iterator<T> it = body.iterator();
            while (it.hasNext()) {
                arrayList.add(UIComponentDto.INSTANCE.fromProto((UIComponent) it.next()));
            }
            Integer corner_radius = proto.getCorner_radius();
            List<UIComponent> footer = proto.getFooter();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(footer, 10));
            Iterator<T> it2 = footer.iterator();
            while (it2.hasNext()) {
                arrayList2.add(UIComponentDto.INSTANCE.fromProto((UIComponent) it2.next()));
            }
            String name = proto.getName();
            Boolean android_can_dismiss_with_back_press = proto.getAndroid_can_dismiss_with_back_press();
            Boolean cannot_passively_dismiss = proto.getCannot_passively_dismiss();
            Theme theme = proto.getTheme();
            ThemeDto themeDtoFromProto = theme != null ? ThemeDto.INSTANCE.fromProto(theme) : null;
            Screen screen = proto.getScreen();
            ScreenDto screenDtoFromProto = screen != null ? ScreenDto.INSTANCE.fromProto(screen) : null;
            LoggingContext logging_context = proto.getLogging_context();
            return new BottomSheetContentDto(new Surrogate(bottomSheetBackgroundDtoFromProto, arrayList, corner_radius, arrayList2, name, android_can_dismiss_with_back_press, cannot_passively_dismiss, themeDtoFromProto, screenDtoFromProto, logging_context != null ? LoggingContextDto.INSTANCE.fromProto(logging_context) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.ui.v1.BottomSheetContentDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BottomSheetContentDto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new BottomSheetContentDto(null, null, null, null, null, null, null, null, null, null, 1023, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: BottomSheetContentDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/ui/v1/BottomSheetContentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/v1/BottomSheetContentDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/ui/v1/BottomSheetContentDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes14.dex */
    public static final class Serializer implements KSerializer<BottomSheetContentDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.ui.v1.BottomSheetContent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, BottomSheetContentDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public BottomSheetContentDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new BottomSheetContentDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: BottomSheetContentDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/v1/BottomSheetContentDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "microgram.ui.v1.BottomSheetContentDto";
        }
    }
}
