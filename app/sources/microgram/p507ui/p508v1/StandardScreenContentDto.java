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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import microgram.p507ui.p508v1.AndroidAttributesDto;
import microgram.p507ui.p508v1.IosAttributesDto;
import microgram.p507ui.p508v1.LoggingContextDto;
import microgram.p507ui.p508v1.NavigationBarConfigurationDto;
import microgram.p507ui.p508v1.StandardScreenContentDto;
import microgram.p507ui.p508v1.ThemeDto;
import rh_server_driven_ui.p531v1.ThemedColor;
import rh_server_driven_ui.p531v1.ThemedColorDto;
import rh_server_driven_ui.p531v1.UIComponent;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: StandardScreenContentDto.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001a\b\u0007\u0018\u0000 D2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004EDFGB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B¥\u0001\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#H\u0096\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010/\u001a\u00020.2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020(H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020(H\u0016¢\u0006\u0004\b1\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b7\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128F¢\u0006\u0006\u001a\u0004\b>\u0010=R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128F¢\u0006\u0006\u001a\u0004\b?\u0010=R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006H"}, m3636d2 = {"Lmicrogram/ui/v1/StandardScreenContentDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/ui/v1/StandardScreenContent;", "Landroid/os/Parcelable;", "Lmicrogram/ui/v1/StandardScreenContentDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/ui/v1/StandardScreenContentDto$Surrogate;)V", "Lcom/robinhood/rosetta/eventlogging/ScreenDto;", "screen", "Lmicrogram/ui/v1/LoggingContextDto;", "logging_context", "", "title", "Lmicrogram/ui/v1/NavigationBarConfigurationDto;", "nav_config", "Lmicrogram/ui/v1/ThemeDto;", "theme", "", "Lrh_server_driven_ui/v1/UIComponentDto;", "header", CarResultComposable2.BODY, Footer.f10637type, "Lrh_server_driven_ui/v1/ThemedColorDto;", "background_color", "Lmicrogram/ui/v1/AndroidAttributesDto;", "android_attributes", "Lmicrogram/ui/v1/IosAttributesDto;", "ios_attributes", "name", "(Lcom/robinhood/rosetta/eventlogging/ScreenDto;Lmicrogram/ui/v1/LoggingContextDto;Ljava/lang/String;Lmicrogram/ui/v1/NavigationBarConfigurationDto;Lmicrogram/ui/v1/ThemeDto;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lrh_server_driven_ui/v1/ThemedColorDto;Lmicrogram/ui/v1/AndroidAttributesDto;Lmicrogram/ui/v1/IosAttributesDto;Ljava/lang/String;)V", "toProto", "()Lmicrogram/ui/v1/StandardScreenContent;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/ui/v1/StandardScreenContentDto$Surrogate;", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/ScreenDto;", "getLogging_context", "()Lmicrogram/ui/v1/LoggingContextDto;", "getTitle", "getNav_config", "()Lmicrogram/ui/v1/NavigationBarConfigurationDto;", "getTheme", "()Lmicrogram/ui/v1/ThemeDto;", "getHeader", "()Ljava/util/List;", "getBody", "getFooter", "getBackground_color", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getAndroid_attributes", "()Lmicrogram/ui/v1/AndroidAttributesDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes23.dex */
public final class StandardScreenContentDto implements Dto3<StandardScreenContent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<StandardScreenContentDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<StandardScreenContentDto, StandardScreenContent>> binaryBase64Serializer$delegate;
    private static final StandardScreenContentDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ StandardScreenContentDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private StandardScreenContentDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ScreenDto getScreen() {
        return this.surrogate.getScreen();
    }

    public final LoggingContextDto getLogging_context() {
        return this.surrogate.getLogging_context();
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final NavigationBarConfigurationDto getNav_config() {
        return this.surrogate.getNav_config();
    }

    public final ThemeDto getTheme() {
        return this.surrogate.getTheme();
    }

    public final List<UIComponentDto> getHeader() {
        return this.surrogate.getHeader();
    }

    public final List<UIComponentDto> getBody() {
        return this.surrogate.getBody();
    }

    public final List<UIComponentDto> getFooter() {
        return this.surrogate.getFooter();
    }

    public final ThemedColorDto getBackground_color() {
        return this.surrogate.getBackground_color();
    }

    public final AndroidAttributesDto getAndroid_attributes() {
        return this.surrogate.getAndroid_attributes();
    }

    public /* synthetic */ StandardScreenContentDto(ScreenDto screenDto, LoggingContextDto loggingContextDto, String str, NavigationBarConfigurationDto navigationBarConfigurationDto, ThemeDto themeDto, List list, List list2, List list3, ThemedColorDto themedColorDto, AndroidAttributesDto androidAttributesDto, IosAttributesDto iosAttributesDto, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : screenDto, (i & 2) != 0 ? null : loggingContextDto, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : navigationBarConfigurationDto, (i & 16) != 0 ? null : themeDto, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? CollectionsKt.emptyList() : list2, (i & 128) != 0 ? CollectionsKt.emptyList() : list3, (i & 256) != 0 ? null : themedColorDto, (i & 512) != 0 ? null : androidAttributesDto, (i & 1024) != 0 ? null : iosAttributesDto, (i & 2048) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StandardScreenContentDto(ScreenDto screenDto, LoggingContextDto loggingContextDto, String str, NavigationBarConfigurationDto navigationBarConfigurationDto, ThemeDto themeDto, List<UIComponentDto> header, List<UIComponentDto> body, List<UIComponentDto> footer, ThemedColorDto themedColorDto, AndroidAttributesDto androidAttributesDto, IosAttributesDto iosAttributesDto, String str2) {
        this(new Surrogate(screenDto, loggingContextDto, str, navigationBarConfigurationDto, themeDto, header, body, footer, themedColorDto, androidAttributesDto, iosAttributesDto, str2));
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(footer, "footer");
    }

    @Override // com.robinhood.idl.Dto
    public StandardScreenContent toProto() {
        ScreenDto screen = this.surrogate.getScreen();
        Screen proto = screen != null ? screen.toProto() : null;
        LoggingContextDto logging_context = this.surrogate.getLogging_context();
        LoggingContext proto2 = logging_context != null ? logging_context.toProto() : null;
        String title = this.surrogate.getTitle();
        NavigationBarConfigurationDto nav_config = this.surrogate.getNav_config();
        NavigationBarConfiguration proto3 = nav_config != null ? nav_config.toProto() : null;
        ThemeDto theme = this.surrogate.getTheme();
        Theme proto4 = theme != null ? theme.toProto() : null;
        List<UIComponentDto> header = this.surrogate.getHeader();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(header, 10));
        Iterator<T> it = header.iterator();
        while (it.hasNext()) {
            arrayList.add(((UIComponentDto) it.next()).toProto());
        }
        List<UIComponentDto> body = this.surrogate.getBody();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(body, 10));
        Iterator<T> it2 = body.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((UIComponentDto) it2.next()).toProto());
        }
        List<UIComponentDto> footer = this.surrogate.getFooter();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(footer, 10));
        Iterator<T> it3 = footer.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((UIComponentDto) it3.next()).toProto());
        }
        ThemedColorDto background_color = this.surrogate.getBackground_color();
        ThemedColor proto5 = background_color != null ? background_color.toProto() : null;
        AndroidAttributesDto android_attributes = this.surrogate.getAndroid_attributes();
        AndroidAttributes proto6 = android_attributes != null ? android_attributes.toProto() : null;
        IosAttributesDto ios_attributes = this.surrogate.getIos_attributes();
        return new StandardScreenContent(proto, proto2, title, proto3, proto4, arrayList, arrayList2, arrayList3, proto5, proto6, ios_attributes != null ? ios_attributes.toProto() : null, this.surrogate.getName(), null, 4096, null);
    }

    public String toString() {
        return "[StandardScreenContentDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof StandardScreenContentDto) && Intrinsics.areEqual(((StandardScreenContentDto) other).surrogate, this.surrogate);
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
    /* compiled from: StandardScreenContentDto.kt */
    @Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b/\b\u0083\b\u0018\u0000 Z2\u00020\u0001:\u0002[ZB£\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0018\u0010\u0019B¥\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0018\u0010\u001eJ'\u0010'\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00100\u0012\u0004\b3\u00104\u001a\u0004\b1\u00102R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00105\u0012\u0004\b8\u00104\u001a\u0004\b6\u00107R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00109\u0012\u0004\b;\u00104\u001a\u0004\b:\u0010)R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010<\u0012\u0004\b?\u00104\u001a\u0004\b=\u0010>R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010@\u0012\u0004\bC\u00104\u001a\u0004\bA\u0010BR&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010D\u0012\u0004\bG\u00104\u001a\u0004\bE\u0010FR&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010D\u0012\u0004\bI\u00104\u001a\u0004\bH\u0010FR&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010D\u0012\u0004\bK\u00104\u001a\u0004\bJ\u0010FR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010L\u0012\u0004\bO\u00104\u001a\u0004\bM\u0010NR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010P\u0012\u0004\bS\u00104\u001a\u0004\bQ\u0010RR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010T\u0012\u0004\bW\u00104\u001a\u0004\bU\u0010VR\"\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u00109\u0012\u0004\bY\u00104\u001a\u0004\bX\u0010)¨\u0006\\"}, m3636d2 = {"Lmicrogram/ui/v1/StandardScreenContentDto$Surrogate;", "", "Lcom/robinhood/rosetta/eventlogging/ScreenDto;", "screen", "Lmicrogram/ui/v1/LoggingContextDto;", "logging_context", "", "title", "Lmicrogram/ui/v1/NavigationBarConfigurationDto;", "nav_config", "Lmicrogram/ui/v1/ThemeDto;", "theme", "", "Lrh_server_driven_ui/v1/UIComponentDto;", "header", CarResultComposable2.BODY, Footer.f10637type, "Lrh_server_driven_ui/v1/ThemedColorDto;", "background_color", "Lmicrogram/ui/v1/AndroidAttributesDto;", "android_attributes", "Lmicrogram/ui/v1/IosAttributesDto;", "ios_attributes", "name", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ScreenDto;Lmicrogram/ui/v1/LoggingContextDto;Ljava/lang/String;Lmicrogram/ui/v1/NavigationBarConfigurationDto;Lmicrogram/ui/v1/ThemeDto;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lrh_server_driven_ui/v1/ThemedColorDto;Lmicrogram/ui/v1/AndroidAttributesDto;Lmicrogram/ui/v1/IosAttributesDto;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/rosetta/eventlogging/ScreenDto;Lmicrogram/ui/v1/LoggingContextDto;Ljava/lang/String;Lmicrogram/ui/v1/NavigationBarConfigurationDto;Lmicrogram/ui/v1/ThemeDto;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lrh_server_driven_ui/v1/ThemedColorDto;Lmicrogram/ui/v1/AndroidAttributesDto;Lmicrogram/ui/v1/IosAttributesDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui_v1_externalRelease", "(Lmicrogram/ui/v1/StandardScreenContentDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/rosetta/eventlogging/ScreenDto;", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/ScreenDto;", "getScreen$annotations", "()V", "Lmicrogram/ui/v1/LoggingContextDto;", "getLogging_context", "()Lmicrogram/ui/v1/LoggingContextDto;", "getLogging_context$annotations", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "Lmicrogram/ui/v1/NavigationBarConfigurationDto;", "getNav_config", "()Lmicrogram/ui/v1/NavigationBarConfigurationDto;", "getNav_config$annotations", "Lmicrogram/ui/v1/ThemeDto;", "getTheme", "()Lmicrogram/ui/v1/ThemeDto;", "getTheme$annotations", "Ljava/util/List;", "getHeader", "()Ljava/util/List;", "getHeader$annotations", "getBody", "getBody$annotations", "getFooter", "getFooter$annotations", "Lrh_server_driven_ui/v1/ThemedColorDto;", "getBackground_color", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getBackground_color$annotations", "Lmicrogram/ui/v1/AndroidAttributesDto;", "getAndroid_attributes", "()Lmicrogram/ui/v1/AndroidAttributesDto;", "getAndroid_attributes$annotations", "Lmicrogram/ui/v1/IosAttributesDto;", "getIos_attributes", "()Lmicrogram/ui/v1/IosAttributesDto;", "getIos_attributes$annotations", "getName", "getName$annotations", "Companion", "$serializer", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AndroidAttributesDto android_attributes;
        private final ThemedColorDto background_color;
        private final List<UIComponentDto> body;
        private final List<UIComponentDto> footer;
        private final List<UIComponentDto> header;
        private final IosAttributesDto ios_attributes;
        private final LoggingContextDto logging_context;
        private final String name;
        private final NavigationBarConfigurationDto nav_config;
        private final ScreenDto screen;
        private final ThemeDto theme;
        private final String title;

        public Surrogate() {
            this((ScreenDto) null, (LoggingContextDto) null, (String) null, (NavigationBarConfigurationDto) null, (ThemeDto) null, (List) null, (List) null, (List) null, (ThemedColorDto) null, (AndroidAttributesDto) null, (IosAttributesDto) null, (String) null, 4095, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(UIComponentDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(UIComponentDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
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
            return Intrinsics.areEqual(this.screen, surrogate.screen) && Intrinsics.areEqual(this.logging_context, surrogate.logging_context) && Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.nav_config, surrogate.nav_config) && Intrinsics.areEqual(this.theme, surrogate.theme) && Intrinsics.areEqual(this.header, surrogate.header) && Intrinsics.areEqual(this.body, surrogate.body) && Intrinsics.areEqual(this.footer, surrogate.footer) && Intrinsics.areEqual(this.background_color, surrogate.background_color) && Intrinsics.areEqual(this.android_attributes, surrogate.android_attributes) && Intrinsics.areEqual(this.ios_attributes, surrogate.ios_attributes) && Intrinsics.areEqual(this.name, surrogate.name);
        }

        public int hashCode() {
            ScreenDto screenDto = this.screen;
            int iHashCode = (screenDto == null ? 0 : screenDto.hashCode()) * 31;
            LoggingContextDto loggingContextDto = this.logging_context;
            int iHashCode2 = (iHashCode + (loggingContextDto == null ? 0 : loggingContextDto.hashCode())) * 31;
            String str = this.title;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            NavigationBarConfigurationDto navigationBarConfigurationDto = this.nav_config;
            int iHashCode4 = (iHashCode3 + (navigationBarConfigurationDto == null ? 0 : navigationBarConfigurationDto.hashCode())) * 31;
            ThemeDto themeDto = this.theme;
            int iHashCode5 = (((((((iHashCode4 + (themeDto == null ? 0 : themeDto.hashCode())) * 31) + this.header.hashCode()) * 31) + this.body.hashCode()) * 31) + this.footer.hashCode()) * 31;
            ThemedColorDto themedColorDto = this.background_color;
            int iHashCode6 = (iHashCode5 + (themedColorDto == null ? 0 : themedColorDto.hashCode())) * 31;
            AndroidAttributesDto androidAttributesDto = this.android_attributes;
            int iHashCode7 = (iHashCode6 + (androidAttributesDto == null ? 0 : androidAttributesDto.hashCode())) * 31;
            IosAttributesDto iosAttributesDto = this.ios_attributes;
            int iHashCode8 = (iHashCode7 + (iosAttributesDto == null ? 0 : iosAttributesDto.hashCode())) * 31;
            String str2 = this.name;
            return iHashCode8 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(screen=" + this.screen + ", logging_context=" + this.logging_context + ", title=" + this.title + ", nav_config=" + this.nav_config + ", theme=" + this.theme + ", header=" + this.header + ", body=" + this.body + ", footer=" + this.footer + ", background_color=" + this.background_color + ", android_attributes=" + this.android_attributes + ", ios_attributes=" + this.ios_attributes + ", name=" + this.name + ")";
        }

        /* compiled from: StandardScreenContentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/ui/v1/StandardScreenContentDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/v1/StandardScreenContentDto$Surrogate;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return StandardScreenContentDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: microgram.ui.v1.StandardScreenContentDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StandardScreenContentDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: microgram.ui.v1.StandardScreenContentDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StandardScreenContentDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: microgram.ui.v1.StandardScreenContentDto$Surrogate$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StandardScreenContentDto.Surrogate._childSerializers$_anonymous_$1();
                }
            }), null, null, null, null};
        }

        public /* synthetic */ Surrogate(int i, ScreenDto screenDto, LoggingContextDto loggingContextDto, String str, NavigationBarConfigurationDto navigationBarConfigurationDto, ThemeDto themeDto, List list, List list2, List list3, ThemedColorDto themedColorDto, AndroidAttributesDto androidAttributesDto, IosAttributesDto iosAttributesDto, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.screen = null;
            } else {
                this.screen = screenDto;
            }
            if ((i & 2) == 0) {
                this.logging_context = null;
            } else {
                this.logging_context = loggingContextDto;
            }
            if ((i & 4) == 0) {
                this.title = null;
            } else {
                this.title = str;
            }
            if ((i & 8) == 0) {
                this.nav_config = null;
            } else {
                this.nav_config = navigationBarConfigurationDto;
            }
            if ((i & 16) == 0) {
                this.theme = null;
            } else {
                this.theme = themeDto;
            }
            if ((i & 32) == 0) {
                this.header = CollectionsKt.emptyList();
            } else {
                this.header = list;
            }
            if ((i & 64) == 0) {
                this.body = CollectionsKt.emptyList();
            } else {
                this.body = list2;
            }
            if ((i & 128) == 0) {
                this.footer = CollectionsKt.emptyList();
            } else {
                this.footer = list3;
            }
            if ((i & 256) == 0) {
                this.background_color = null;
            } else {
                this.background_color = themedColorDto;
            }
            if ((i & 512) == 0) {
                this.android_attributes = null;
            } else {
                this.android_attributes = androidAttributesDto;
            }
            if ((i & 1024) == 0) {
                this.ios_attributes = null;
            } else {
                this.ios_attributes = iosAttributesDto;
            }
            if ((i & 2048) == 0) {
                this.name = null;
            } else {
                this.name = str2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$microgram_ui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            ScreenDto screenDto = self.screen;
            if (screenDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, ScreenDto.Serializer.INSTANCE, screenDto);
            }
            LoggingContextDto loggingContextDto = self.logging_context;
            if (loggingContextDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, LoggingContextDto.Serializer.INSTANCE, loggingContextDto);
            }
            String str = self.title;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str);
            }
            NavigationBarConfigurationDto navigationBarConfigurationDto = self.nav_config;
            if (navigationBarConfigurationDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, NavigationBarConfigurationDto.Serializer.INSTANCE, navigationBarConfigurationDto);
            }
            ThemeDto themeDto = self.theme;
            if (themeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, ThemeDto.Serializer.INSTANCE, themeDto);
            }
            if (!Intrinsics.areEqual(self.header, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.header);
            }
            if (!Intrinsics.areEqual(self.body, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 6, lazyArr[6].getValue(), self.body);
            }
            if (!Intrinsics.areEqual(self.footer, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 7, lazyArr[7].getValue(), self.footer);
            }
            ThemedColorDto themedColorDto = self.background_color;
            if (themedColorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, ThemedColorDto.Serializer.INSTANCE, themedColorDto);
            }
            AndroidAttributesDto androidAttributesDto = self.android_attributes;
            if (androidAttributesDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, AndroidAttributesDto.Serializer.INSTANCE, androidAttributesDto);
            }
            IosAttributesDto iosAttributesDto = self.ios_attributes;
            if (iosAttributesDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, IosAttributesDto.Serializer.INSTANCE, iosAttributesDto);
            }
            String str2 = self.name;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, str2);
            }
        }

        public Surrogate(ScreenDto screenDto, LoggingContextDto loggingContextDto, String str, NavigationBarConfigurationDto navigationBarConfigurationDto, ThemeDto themeDto, List<UIComponentDto> header, List<UIComponentDto> body, List<UIComponentDto> footer, ThemedColorDto themedColorDto, AndroidAttributesDto androidAttributesDto, IosAttributesDto iosAttributesDto, String str2) {
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(footer, "footer");
            this.screen = screenDto;
            this.logging_context = loggingContextDto;
            this.title = str;
            this.nav_config = navigationBarConfigurationDto;
            this.theme = themeDto;
            this.header = header;
            this.body = body;
            this.footer = footer;
            this.background_color = themedColorDto;
            this.android_attributes = androidAttributesDto;
            this.ios_attributes = iosAttributesDto;
            this.name = str2;
        }

        public final ScreenDto getScreen() {
            return this.screen;
        }

        public final LoggingContextDto getLogging_context() {
            return this.logging_context;
        }

        public final String getTitle() {
            return this.title;
        }

        public final NavigationBarConfigurationDto getNav_config() {
            return this.nav_config;
        }

        public final ThemeDto getTheme() {
            return this.theme;
        }

        public final List<UIComponentDto> getHeader() {
            return this.header;
        }

        public /* synthetic */ Surrogate(ScreenDto screenDto, LoggingContextDto loggingContextDto, String str, NavigationBarConfigurationDto navigationBarConfigurationDto, ThemeDto themeDto, List list, List list2, List list3, ThemedColorDto themedColorDto, AndroidAttributesDto androidAttributesDto, IosAttributesDto iosAttributesDto, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : screenDto, (i & 2) != 0 ? null : loggingContextDto, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : navigationBarConfigurationDto, (i & 16) != 0 ? null : themeDto, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? CollectionsKt.emptyList() : list2, (i & 128) != 0 ? CollectionsKt.emptyList() : list3, (i & 256) != 0 ? null : themedColorDto, (i & 512) != 0 ? null : androidAttributesDto, (i & 1024) != 0 ? null : iosAttributesDto, (i & 2048) != 0 ? null : str2);
        }

        public final List<UIComponentDto> getBody() {
            return this.body;
        }

        public final List<UIComponentDto> getFooter() {
            return this.footer;
        }

        public final ThemedColorDto getBackground_color() {
            return this.background_color;
        }

        public final AndroidAttributesDto getAndroid_attributes() {
            return this.android_attributes;
        }

        public final IosAttributesDto getIos_attributes() {
            return this.ios_attributes;
        }

        public final String getName() {
            return this.name;
        }
    }

    /* compiled from: StandardScreenContentDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/ui/v1/StandardScreenContentDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/ui/v1/StandardScreenContentDto;", "Lmicrogram/ui/v1/StandardScreenContent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/ui/v1/StandardScreenContentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<StandardScreenContentDto, StandardScreenContent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StandardScreenContentDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StandardScreenContentDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StandardScreenContentDto> getBinaryBase64Serializer() {
            return (KSerializer) StandardScreenContentDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<StandardScreenContent> getProtoAdapter() {
            return StandardScreenContent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StandardScreenContentDto getZeroValue() {
            return StandardScreenContentDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StandardScreenContentDto fromProto(StandardScreenContent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Screen screen = proto.getScreen();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ScreenDto screenDtoFromProto = screen != null ? ScreenDto.INSTANCE.fromProto(screen) : null;
            LoggingContext logging_context = proto.getLogging_context();
            LoggingContextDto loggingContextDtoFromProto = logging_context != null ? LoggingContextDto.INSTANCE.fromProto(logging_context) : null;
            String title = proto.getTitle();
            NavigationBarConfiguration nav_config = proto.getNav_config();
            NavigationBarConfigurationDto navigationBarConfigurationDtoFromProto = nav_config != null ? NavigationBarConfigurationDto.INSTANCE.fromProto(nav_config) : null;
            Theme theme = proto.getTheme();
            ThemeDto themeDtoFromProto = theme != null ? ThemeDto.INSTANCE.fromProto(theme) : null;
            List<UIComponent> header = proto.getHeader();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(header, 10));
            Iterator<T> it = header.iterator();
            while (it.hasNext()) {
                arrayList.add(UIComponentDto.INSTANCE.fromProto((UIComponent) it.next()));
            }
            List<UIComponent> body = proto.getBody();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(body, 10));
            Iterator<T> it2 = body.iterator();
            while (it2.hasNext()) {
                arrayList2.add(UIComponentDto.INSTANCE.fromProto((UIComponent) it2.next()));
            }
            List<UIComponent> footer = proto.getFooter();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(footer, 10));
            Iterator<T> it3 = footer.iterator();
            while (it3.hasNext()) {
                arrayList3.add(UIComponentDto.INSTANCE.fromProto((UIComponent) it3.next()));
            }
            ThemedColor background_color = proto.getBackground_color();
            ThemedColorDto themedColorDtoFromProto = background_color != null ? ThemedColorDto.INSTANCE.fromProto(background_color) : null;
            AndroidAttributes android_attributes = proto.getAndroid_attributes();
            AndroidAttributesDto androidAttributesDtoFromProto = android_attributes != null ? AndroidAttributesDto.INSTANCE.fromProto(android_attributes) : null;
            IosAttributes ios_attributes = proto.getIos_attributes();
            return new StandardScreenContentDto(new Surrogate(screenDtoFromProto, loggingContextDtoFromProto, title, navigationBarConfigurationDtoFromProto, themeDtoFromProto, arrayList, arrayList2, arrayList3, themedColorDtoFromProto, androidAttributesDtoFromProto, ios_attributes != null ? IosAttributesDto.INSTANCE.fromProto(ios_attributes) : null, proto.getName()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.ui.v1.StandardScreenContentDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StandardScreenContentDto.binaryBase64Serializer_delegate$lambda$3();
            }
        });
        zeroValue = new StandardScreenContentDto(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$3() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: StandardScreenContentDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/ui/v1/StandardScreenContentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/v1/StandardScreenContentDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/ui/v1/StandardScreenContentDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes14.dex */
    public static final class Serializer implements KSerializer<StandardScreenContentDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.ui.v1.StandardScreenContent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, StandardScreenContentDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public StandardScreenContentDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new StandardScreenContentDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: StandardScreenContentDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/v1/StandardScreenContentDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "microgram.ui.v1.StandardScreenContentDto";
        }
    }
}
