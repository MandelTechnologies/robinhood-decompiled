package com.withpersona.sdk2.inquiry.governmentid;

import android.os.Parcel;
import android.os.Parcelable;
import com.truelayer.payments.p419ui.utils.TestTags;
import com.withpersona.sdk2.camera.AutoCaptureRuleSet;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdScreen2;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.network.IdClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: IdConfig.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u00040123B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001bJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b,\u0010+R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010/¨\u00064"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "Landroid/os/Parcelable;", "", "idClassKey", "Lcom/withpersona/sdk2/inquiry/governmentid/IdIcon;", "icon", "", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;", "sideConfigs", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "parts", "Lcom/withpersona/sdk2/inquiry/governmentid/network/IdClass;", "type", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/IdIcon;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/network/IdClass;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;", "side", "getSideConfig", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;)Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIdClassKey", "Lcom/withpersona/sdk2/inquiry/governmentid/IdIcon;", "getIcon", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdIcon;", "Ljava/util/List;", "getSideConfigs", "()Ljava/util/List;", "getParts", "Lcom/withpersona/sdk2/inquiry/governmentid/network/IdClass;", "getType", "()Lcom/withpersona/sdk2/inquiry/governmentid/network/IdClass;", "IdSideConfig", "AutoCaptureConfig", "ManualCaptureConfig", "Side", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final /* data */ class IdConfig implements Parcelable {
    public static final Parcelable.Creator<IdConfig> CREATOR = new Creator();
    private final IdIcon icon;
    private final String idClassKey;
    private final List<IdConfig2> parts;
    private final List<IdSideConfig> sideConfigs;
    private final IdClass type;

    /* compiled from: IdConfig.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<IdConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            IdIcon idIconValueOf = IdIcon.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(IdSideConfig.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(parcel.readParcelable(IdConfig.class.getClassLoader()));
            }
            return new IdConfig(string2, idIconValueOf, arrayList, arrayList2, IdClass.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdConfig[] newArray(int i) {
            return new IdConfig[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdConfig)) {
            return false;
        }
        IdConfig idConfig = (IdConfig) other;
        return Intrinsics.areEqual(this.idClassKey, idConfig.idClassKey) && this.icon == idConfig.icon && Intrinsics.areEqual(this.sideConfigs, idConfig.sideConfigs) && Intrinsics.areEqual(this.parts, idConfig.parts) && this.type == idConfig.type;
    }

    public int hashCode() {
        return (((((((this.idClassKey.hashCode() * 31) + this.icon.hashCode()) * 31) + this.sideConfigs.hashCode()) * 31) + this.parts.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "IdConfig(idClassKey=" + this.idClassKey + ", icon=" + this.icon + ", sideConfigs=" + this.sideConfigs + ", parts=" + this.parts + ", type=" + this.type + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.idClassKey);
        dest.writeString(this.icon.name());
        List<IdSideConfig> list = this.sideConfigs;
        dest.writeInt(list.size());
        Iterator<IdSideConfig> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        List<IdConfig2> list2 = this.parts;
        dest.writeInt(list2.size());
        Iterator<IdConfig2> it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable(it2.next(), flags);
        }
        dest.writeString(this.type.name());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IdConfig(String idClassKey, IdIcon icon, List<IdSideConfig> sideConfigs, List<? extends IdConfig2> parts, IdClass type2) {
        Intrinsics.checkNotNullParameter(idClassKey, "idClassKey");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(sideConfigs, "sideConfigs");
        Intrinsics.checkNotNullParameter(parts, "parts");
        Intrinsics.checkNotNullParameter(type2, "type");
        this.idClassKey = idClassKey;
        this.icon = icon;
        this.sideConfigs = sideConfigs;
        this.parts = parts;
        this.type = type2;
    }

    public final String getIdClassKey() {
        return this.idClassKey;
    }

    public final IdIcon getIcon() {
        return this.icon;
    }

    public final List<IdConfig2> getParts() {
        return this.parts;
    }

    public final IdClass getType() {
        return this.type;
    }

    /* compiled from: IdConfig.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;", "Landroid/os/Parcelable;", "", "sideKey", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;", "side", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "overlay", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$AutoCaptureConfig;", "autoCaptureConfig", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$ManualCaptureConfig;", "manualCaptureConfig", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$AutoCaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$ManualCaptureConfig;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSideKey", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;", "getSide", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "getOverlay", "()Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$AutoCaptureConfig;", "getAutoCaptureConfig", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$AutoCaptureConfig;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$ManualCaptureConfig;", "getManualCaptureConfig", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$ManualCaptureConfig;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class IdSideConfig implements Parcelable {
        public static final Parcelable.Creator<IdSideConfig> CREATOR = new Creator();
        private final AutoCaptureConfig autoCaptureConfig;
        private final ManualCaptureConfig manualCaptureConfig;
        private final GovernmentIdScreen2.Overlay overlay;
        private final Side side;
        private final String sideKey;

        /* compiled from: IdConfig.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<IdSideConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IdSideConfig createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IdSideConfig(parcel.readString(), Side.valueOf(parcel.readString()), (GovernmentIdScreen2.Overlay) parcel.readParcelable(IdSideConfig.class.getClassLoader()), AutoCaptureConfig.CREATOR.createFromParcel(parcel), ManualCaptureConfig.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IdSideConfig[] newArray(int i) {
                return new IdSideConfig[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IdSideConfig)) {
                return false;
            }
            IdSideConfig idSideConfig = (IdSideConfig) other;
            return Intrinsics.areEqual(this.sideKey, idSideConfig.sideKey) && this.side == idSideConfig.side && Intrinsics.areEqual(this.overlay, idSideConfig.overlay) && Intrinsics.areEqual(this.autoCaptureConfig, idSideConfig.autoCaptureConfig) && Intrinsics.areEqual(this.manualCaptureConfig, idSideConfig.manualCaptureConfig);
        }

        public int hashCode() {
            return (((((((this.sideKey.hashCode() * 31) + this.side.hashCode()) * 31) + this.overlay.hashCode()) * 31) + this.autoCaptureConfig.hashCode()) * 31) + this.manualCaptureConfig.hashCode();
        }

        public String toString() {
            return "IdSideConfig(sideKey=" + this.sideKey + ", side=" + this.side + ", overlay=" + this.overlay + ", autoCaptureConfig=" + this.autoCaptureConfig + ", manualCaptureConfig=" + this.manualCaptureConfig + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.sideKey);
            dest.writeString(this.side.name());
            dest.writeParcelable(this.overlay, flags);
            this.autoCaptureConfig.writeToParcel(dest, flags);
            this.manualCaptureConfig.writeToParcel(dest, flags);
        }

        public IdSideConfig(String sideKey, Side side, GovernmentIdScreen2.Overlay overlay, AutoCaptureConfig autoCaptureConfig, ManualCaptureConfig manualCaptureConfig) {
            Intrinsics.checkNotNullParameter(sideKey, "sideKey");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(overlay, "overlay");
            Intrinsics.checkNotNullParameter(autoCaptureConfig, "autoCaptureConfig");
            Intrinsics.checkNotNullParameter(manualCaptureConfig, "manualCaptureConfig");
            this.sideKey = sideKey;
            this.side = side;
            this.overlay = overlay;
            this.autoCaptureConfig = autoCaptureConfig;
            this.manualCaptureConfig = manualCaptureConfig;
        }

        public final String getSideKey() {
            return this.sideKey;
        }

        public final Side getSide() {
            return this.side;
        }

        public final GovernmentIdScreen2.Overlay getOverlay() {
            return this.overlay;
        }

        public final AutoCaptureConfig getAutoCaptureConfig() {
            return this.autoCaptureConfig;
        }

        public final ManualCaptureConfig getManualCaptureConfig() {
            return this.manualCaptureConfig;
        }
    }

    /* compiled from: IdConfig.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$AutoCaptureConfig;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/camera/AutoCaptureRuleSet;", "ruleSet", "<init>", "(Lcom/withpersona/sdk2/camera/AutoCaptureRuleSet;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/camera/AutoCaptureRuleSet;", "getRuleSet", "()Lcom/withpersona/sdk2/camera/AutoCaptureRuleSet;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class AutoCaptureConfig implements Parcelable {
        public static final Parcelable.Creator<AutoCaptureConfig> CREATOR = new Creator();
        private final AutoCaptureRuleSet ruleSet;

        /* compiled from: IdConfig.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<AutoCaptureConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AutoCaptureConfig createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AutoCaptureConfig((AutoCaptureRuleSet) parcel.readParcelable(AutoCaptureConfig.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AutoCaptureConfig[] newArray(int i) {
                return new AutoCaptureConfig[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AutoCaptureConfig() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AutoCaptureConfig) && Intrinsics.areEqual(this.ruleSet, ((AutoCaptureConfig) other).ruleSet);
        }

        public int hashCode() {
            return this.ruleSet.hashCode();
        }

        public String toString() {
            return "AutoCaptureConfig(ruleSet=" + this.ruleSet + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.ruleSet, flags);
        }

        public AutoCaptureConfig(AutoCaptureRuleSet ruleSet) {
            Intrinsics.checkNotNullParameter(ruleSet, "ruleSet");
            this.ruleSet = ruleSet;
        }

        public /* synthetic */ AutoCaptureConfig(AutoCaptureRuleSet autoCaptureRuleSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new AutoCaptureRuleSet(null, 1, null) : autoCaptureRuleSet);
        }

        public final AutoCaptureRuleSet getRuleSet() {
            return this.ruleSet;
        }
    }

    /* compiled from: IdConfig.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u0003\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$ManualCaptureConfig;", "Landroid/os/Parcelable;", "", "isEnabled", "", "delayMs", "<init>", "(ZJ)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "J", "getDelayMs", "()J", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class ManualCaptureConfig implements Parcelable {
        public static final Parcelable.Creator<ManualCaptureConfig> CREATOR = new Creator();
        private final long delayMs;
        private final boolean isEnabled;

        /* compiled from: IdConfig.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ManualCaptureConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ManualCaptureConfig createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ManualCaptureConfig(parcel.readInt() != 0, parcel.readLong());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ManualCaptureConfig[] newArray(int i) {
                return new ManualCaptureConfig[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ManualCaptureConfig)) {
                return false;
            }
            ManualCaptureConfig manualCaptureConfig = (ManualCaptureConfig) other;
            return this.isEnabled == manualCaptureConfig.isEnabled && this.delayMs == manualCaptureConfig.delayMs;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.isEnabled) * 31) + Long.hashCode(this.delayMs);
        }

        public String toString() {
            return "ManualCaptureConfig(isEnabled=" + this.isEnabled + ", delayMs=" + this.delayMs + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isEnabled ? 1 : 0);
            dest.writeLong(this.delayMs);
        }

        public ManualCaptureConfig(boolean z, long j) {
            this.isEnabled = z;
            this.delayMs = j;
        }

        /* renamed from: isEnabled, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        public final long getDelayMs() {
            return this.delayMs;
        }
    }

    public final IdSideConfig getSideConfig(Side side) {
        Intrinsics.checkNotNullParameter(side, "side");
        for (IdSideConfig idSideConfig : this.sideConfigs) {
            if (idSideConfig.getSide() == side) {
                return idSideConfig;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IdConfig.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "Front", "Back", "FrontOrBack", "BarcodePdf417", "PassportSignature", "Companion", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Side {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Side[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<Map<String, Side>> sideKeyToSide$delegate;
        private final String key;
        public static final Side Front = new Side("Front", 0, "front");
        public static final Side Back = new Side("Back", 1, TestTags.BACK);
        public static final Side FrontOrBack = new Side("FrontOrBack", 2, "front_or_back");
        public static final Side BarcodePdf417 = new Side("BarcodePdf417", 3, "barcode_pdf417");
        public static final Side PassportSignature = new Side("PassportSignature", 4, "passport_signature");

        private static final /* synthetic */ Side[] $values() {
            return new Side[]{Front, Back, FrontOrBack, BarcodePdf417, PassportSignature};
        }

        public static EnumEntries<Side> getEntries() {
            return $ENTRIES;
        }

        private Side(String str, int i, String str2) {
            this.key = str2;
        }

        public final String getKey() {
            return this.key;
        }

        static {
            Side[] sideArr$values = $values();
            $VALUES = sideArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sideArr$values);
            INSTANCE = new Companion(null);
            sideKeyToSide$delegate = LazyKt.lazy(new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.IdConfig$Side$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IdConfig.Side.sideKeyToSide_delegate$lambda$1();
                }
            });
        }

        /* compiled from: IdConfig.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u0006R'\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side$Companion;", "", "<init>", "()V", "sideKeyToSide", "", "", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;", "getSideKeyToSide", "()Ljava/util/Map;", "sideKeyToSide$delegate", "Lkotlin/Lazy;", "fromSideKey", "sideKey", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            private final Map<String, Side> getSideKeyToSide() {
                return (Map) Side.sideKeyToSide$delegate.getValue();
            }

            public final Side fromSideKey(String sideKey) {
                Intrinsics.checkNotNullParameter(sideKey, "sideKey");
                return getSideKeyToSide().get(sideKey);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map sideKeyToSide_delegate$lambda$1() {
            Side[] sideArrValues = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(sideArrValues.length), 16));
            for (Side side : sideArrValues) {
                linkedHashMap.put(side.key, side);
            }
            return linkedHashMap;
        }

        public static Side valueOf(String str) {
            return (Side) Enum.valueOf(Side.class, str);
        }

        public static Side[] values() {
            return (Side[]) $VALUES.clone();
        }
    }
}
