package microgram.p507ui.contracts;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: InitialScreenData.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(BM\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b%\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b&\u0010\u0019R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b'\u0010\u0019¨\u0006*"}, m3636d2 = {"Lmicrogram/ui/contracts/InitialScreenData;", "", "", "seen1", "", "routerIdentifier", "Lmicrogram/ui/contracts/Theme;", "theme", "screenType", "screenIdentifier", "encodedInitialContent", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lmicrogram/ui/contracts/Theme;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts", "(Lmicrogram/ui/contracts/InitialScreenData;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRouterIdentifier", "Lmicrogram/ui/contracts/Theme;", "getTheme", "()Lmicrogram/ui/contracts/Theme;", "getScreenType", "getScreenIdentifier", "getEncodedInitialContent", "Companion", "$serializer", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class InitialScreenData {
    private final String encodedInitialContent;
    private final String routerIdentifier;
    private final String screenIdentifier;
    private final String screenType;
    private final Theme theme;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, Theme.INSTANCE.serializer(), null, null, null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitialScreenData)) {
            return false;
        }
        InitialScreenData initialScreenData = (InitialScreenData) other;
        return Intrinsics.areEqual(this.routerIdentifier, initialScreenData.routerIdentifier) && this.theme == initialScreenData.theme && Intrinsics.areEqual(this.screenType, initialScreenData.screenType) && Intrinsics.areEqual(this.screenIdentifier, initialScreenData.screenIdentifier) && Intrinsics.areEqual(this.encodedInitialContent, initialScreenData.encodedInitialContent);
    }

    public int hashCode() {
        return (((((((this.routerIdentifier.hashCode() * 31) + this.theme.hashCode()) * 31) + this.screenType.hashCode()) * 31) + this.screenIdentifier.hashCode()) * 31) + this.encodedInitialContent.hashCode();
    }

    public String toString() {
        return "InitialScreenData(routerIdentifier=" + this.routerIdentifier + ", theme=" + this.theme + ", screenType=" + this.screenType + ", screenIdentifier=" + this.screenIdentifier + ", encodedInitialContent=" + this.encodedInitialContent + ")";
    }

    /* compiled from: InitialScreenData.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/contracts/InitialScreenData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/contracts/InitialScreenData;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InitialScreenData> serializer() {
            return InitialScreenData3.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ InitialScreenData(int i, String str, Theme theme, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptions.throwMissingFieldException(i, 31, InitialScreenData3.INSTANCE.getDescriptor());
        }
        this.routerIdentifier = str;
        this.theme = theme;
        this.screenType = str2;
        this.screenIdentifier = str3;
        this.encodedInitialContent = str4;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$contracts(InitialScreenData self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.routerIdentifier);
        output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.theme);
        output.encodeStringElement(serialDesc, 2, self.screenType);
        output.encodeStringElement(serialDesc, 3, self.screenIdentifier);
        output.encodeStringElement(serialDesc, 4, self.encodedInitialContent);
    }

    public final String getRouterIdentifier() {
        return this.routerIdentifier;
    }

    public final Theme getTheme() {
        return this.theme;
    }

    public final String getScreenType() {
        return this.screenType;
    }

    public final String getScreenIdentifier() {
        return this.screenIdentifier;
    }

    public final String getEncodedInitialContent() {
        return this.encodedInitialContent;
    }
}
