package com.robinhood.android.equitydetail.p123ui.etp;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.models.p320db.bonfire.etp.EtpSector;
import com.robinhood.models.serverdriven.p347db.ThemedColor;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks3;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: EtpCompositionItemHolder.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 (2\u00020\u0001:\u0003&'(B;\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"H\u0007J\u0006\u0010#\u001a\u00020\u0000J\u000e\u0010$\u001a\u00020\t2\u0006\u0010!\u001a\u00020\"J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\n\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0014\u0010\u000b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0013R\u0012\u0010\u0017\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\u001c\u001a\u00020\u001d8G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0001\u0002)*¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemHolder;", "Landroid/os/Parcelable;", "weight", "", ResourceTypes.COLOR, "Lcom/robinhood/models/serverdriven/db/ThemedColor;", "showColorBlock", "", "bottomSheetDescription", "", "showBottomDivider", "isClickable", "<init>", "(FLcom/robinhood/models/serverdriven/db/ThemedColor;ZLjava/lang/String;ZZ)V", "getWeight", "()F", "getColor", "()Lcom/robinhood/models/serverdriven/db/ThemedColor;", "getShowColorBlock", "()Z", "getBottomSheetDescription", "()Ljava/lang/String;", "getShowBottomDivider", "isActive", "weightString", "getWeightString", "name", "getName", "weightColorRes", "", "getWeightColorRes", "()I", "getColorInt", "context", "Landroid/content/Context;", "inactiveCopy", "getFormattedWeight", "bottomDividerCopy", "Sector", "Holding", "DiffCallback", "Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemHolder$Holding;", "Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemHolder$Sector;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public abstract class EtpCompositionItemHolder implements Parcelable {
    private final String bottomSheetDescription;
    private final ThemedColor color;
    private final boolean isClickable;
    private final boolean showBottomDivider;
    private final boolean showColorBlock;
    private final float weight;

    /* renamed from: DiffCallback, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ EtpCompositionItemHolder(float f, ThemedColor themedColor, boolean z, String str, boolean z2, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, themedColor, z, str, z2, z3);
    }

    public abstract boolean isActive();

    private EtpCompositionItemHolder(float f, ThemedColor themedColor, boolean z, String str, boolean z2, boolean z3) {
        this.weight = f;
        this.color = themedColor;
        this.showColorBlock = z;
        this.bottomSheetDescription = str;
        this.showBottomDivider = z2;
        this.isClickable = z3;
    }

    public final float getWeight() {
        return this.weight;
    }

    public ThemedColor getColor() {
        return this.color;
    }

    public boolean getShowColorBlock() {
        return this.showColorBlock;
    }

    public String getBottomSheetDescription() {
        return this.bottomSheetDescription;
    }

    public boolean getShowBottomDivider() {
        return this.showBottomDivider;
    }

    /* renamed from: isClickable, reason: from getter */
    public boolean getIsClickable() {
        return this.isClickable;
    }

    /* compiled from: EtpCompositionItemHolder.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemHolder$Sector;", "Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemHolder;", "sector", "Lcom/robinhood/models/db/bonfire/etp/EtpSector;", "isActive", "", "<init>", "(Lcom/robinhood/models/db/bonfire/etp/EtpSector;Z)V", "getSector", "()Lcom/robinhood/models/db/bonfire/etp/EtpSector;", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Sector extends EtpCompositionItemHolder {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Sector> CREATOR = new Creator();
        private final boolean isActive;
        private final EtpSector sector;

        /* compiled from: EtpCompositionItemHolder.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Sector> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Sector createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Sector((EtpSector) parcel.readParcelable(Sector.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Sector[] newArray(int i) {
                return new Sector[i];
            }
        }

        public static /* synthetic */ Sector copy$default(Sector sector, EtpSector etpSector, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                etpSector = sector.sector;
            }
            if ((i & 2) != 0) {
                z = sector.isActive;
            }
            return sector.copy(etpSector, z);
        }

        /* renamed from: component1, reason: from getter */
        public final EtpSector getSector() {
            return this.sector;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsActive() {
            return this.isActive;
        }

        public final Sector copy(EtpSector sector, boolean isActive) {
            Intrinsics.checkNotNullParameter(sector, "sector");
            return new Sector(sector, isActive);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Sector)) {
                return false;
            }
            Sector sector = (Sector) other;
            return Intrinsics.areEqual(this.sector, sector.sector) && this.isActive == sector.isActive;
        }

        public int hashCode() {
            return (this.sector.hashCode() * 31) + Boolean.hashCode(this.isActive);
        }

        public String toString() {
            return "Sector(sector=" + this.sector + ", isActive=" + this.isActive + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.sector, flags);
            dest.writeInt(this.isActive ? 1 : 0);
        }

        public /* synthetic */ Sector(EtpSector etpSector, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(etpSector, (i & 2) != 0 ? true : z);
        }

        public final EtpSector getSector() {
            return this.sector;
        }

        @Override // com.robinhood.android.equitydetail.p123ui.etp.EtpCompositionItemHolder
        public boolean isActive() {
            return this.isActive;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Sector(EtpSector sector, boolean z) {
            super(sector.getWeight(), sector.getColor(), true, sector.getDescription(), true, !StringsKt.isBlank(sector.getDescription()), null);
            Intrinsics.checkNotNullParameter(sector, "sector");
            this.sector = sector;
            this.isActive = z;
        }
    }

    /* compiled from: EtpCompositionItemHolder.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemHolder$Holding;", "Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemHolder;", "holding", "Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemHolder$Holding$UiEtpHolding;", "isActive", "", "showColorBlock", "showBottomDivider", "<init>", "(Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemHolder$Holding$UiEtpHolding;ZZZ)V", "getHolding", "()Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemHolder$Holding$UiEtpHolding;", "()Z", "getShowColorBlock", "getShowBottomDivider", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "UiEtpHolding", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Holding extends EtpCompositionItemHolder {
        private static final int MAX_SENTENCES = 2;
        private final UiEtpHolding holding;
        private final boolean isActive;
        private final boolean showBottomDivider;
        private final boolean showColorBlock;
        public static final int $stable = 8;
        public static final Parcelable.Creator<Holding> CREATOR = new Creator();

        /* compiled from: EtpCompositionItemHolder.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Holding> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Holding createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Holding(UiEtpHolding.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Holding[] newArray(int i) {
                return new Holding[i];
            }
        }

        public static /* synthetic */ Holding copy$default(Holding holding, UiEtpHolding uiEtpHolding, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                uiEtpHolding = holding.holding;
            }
            if ((i & 2) != 0) {
                z = holding.isActive;
            }
            if ((i & 4) != 0) {
                z2 = holding.showColorBlock;
            }
            if ((i & 8) != 0) {
                z3 = holding.showBottomDivider;
            }
            return holding.copy(uiEtpHolding, z, z2, z3);
        }

        /* renamed from: component1, reason: from getter */
        public final UiEtpHolding getHolding() {
            return this.holding;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsActive() {
            return this.isActive;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShowColorBlock() {
            return this.showColorBlock;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShowBottomDivider() {
            return this.showBottomDivider;
        }

        public final Holding copy(UiEtpHolding holding, boolean isActive, boolean showColorBlock, boolean showBottomDivider) {
            Intrinsics.checkNotNullParameter(holding, "holding");
            return new Holding(holding, isActive, showColorBlock, showBottomDivider);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Holding)) {
                return false;
            }
            Holding holding = (Holding) other;
            return Intrinsics.areEqual(this.holding, holding.holding) && this.isActive == holding.isActive && this.showColorBlock == holding.showColorBlock && this.showBottomDivider == holding.showBottomDivider;
        }

        public int hashCode() {
            return (((((this.holding.hashCode() * 31) + Boolean.hashCode(this.isActive)) * 31) + Boolean.hashCode(this.showColorBlock)) * 31) + Boolean.hashCode(this.showBottomDivider);
        }

        public String toString() {
            return "Holding(holding=" + this.holding + ", isActive=" + this.isActive + ", showColorBlock=" + this.showColorBlock + ", showBottomDivider=" + this.showBottomDivider + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.holding.writeToParcel(dest, flags);
            dest.writeInt(this.isActive ? 1 : 0);
            dest.writeInt(this.showColorBlock ? 1 : 0);
            dest.writeInt(this.showBottomDivider ? 1 : 0);
        }

        public /* synthetic */ Holding(UiEtpHolding uiEtpHolding, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uiEtpHolding, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? true : z3);
        }

        public final UiEtpHolding getHolding() {
            return this.holding;
        }

        @Override // com.robinhood.android.equitydetail.p123ui.etp.EtpCompositionItemHolder
        public boolean isActive() {
            return this.isActive;
        }

        @Override // com.robinhood.android.equitydetail.p123ui.etp.EtpCompositionItemHolder
        public boolean getShowColorBlock() {
            return this.showColorBlock;
        }

        @Override // com.robinhood.android.equitydetail.p123ui.etp.EtpCompositionItemHolder
        public boolean getShowBottomDivider() {
            return this.showBottomDivider;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Holding(UiEtpHolding holding, boolean z, boolean z2, boolean z3) {
            super(holding.getWeight(), holding.getColor(), z2, EtpCompositionResources.takeSentences(holding.getDescription(), 2), z3, (holding.getInstrumentId() == null && StringsKt.isBlank(holding.getDescription())) ? false : true, null);
            Intrinsics.checkNotNullParameter(holding, "holding");
            this.holding = holding;
            this.isActive = z;
            this.showColorBlock = z2;
            this.showBottomDivider = z3;
        }

        /* compiled from: EtpCompositionItemHolder.kt */
        @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003JW\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0006\u0010\"\u001a\u00020#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020#HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemHolder$Holding$UiEtpHolding;", "Landroid/os/Parcelable;", "name", "", "instrumentId", "Ljava/util/UUID;", "symbol", "weight", "", "sector", "description", ResourceTypes.COLOR, "Lcom/robinhood/models/serverdriven/db/ThemedColor;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Lcom/robinhood/models/serverdriven/db/ThemedColor;)V", "getName", "()Ljava/lang/String;", "getInstrumentId", "()Ljava/util/UUID;", "getSymbol", "getWeight", "()F", "getSector", "getDescription", "getColor", "()Lcom/robinhood/models/serverdriven/db/ThemedColor;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class UiEtpHolding implements Parcelable {
            public static final int $stable = 8;
            public static final Parcelable.Creator<UiEtpHolding> CREATOR = new Creator();
            private final ThemedColor color;
            private final String description;
            private final UUID instrumentId;
            private final String name;
            private final String sector;
            private final String symbol;
            private final float weight;

            /* compiled from: EtpCompositionItemHolder.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<UiEtpHolding> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UiEtpHolding createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new UiEtpHolding(parcel.readString(), (UUID) parcel.readSerializable(), parcel.readString(), parcel.readFloat(), parcel.readString(), parcel.readString(), (ThemedColor) parcel.readParcelable(UiEtpHolding.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UiEtpHolding[] newArray(int i) {
                    return new UiEtpHolding[i];
                }
            }

            public static /* synthetic */ UiEtpHolding copy$default(UiEtpHolding uiEtpHolding, String str, UUID uuid, String str2, float f, String str3, String str4, ThemedColor themedColor, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = uiEtpHolding.name;
                }
                if ((i & 2) != 0) {
                    uuid = uiEtpHolding.instrumentId;
                }
                if ((i & 4) != 0) {
                    str2 = uiEtpHolding.symbol;
                }
                if ((i & 8) != 0) {
                    f = uiEtpHolding.weight;
                }
                if ((i & 16) != 0) {
                    str3 = uiEtpHolding.sector;
                }
                if ((i & 32) != 0) {
                    str4 = uiEtpHolding.description;
                }
                if ((i & 64) != 0) {
                    themedColor = uiEtpHolding.color;
                }
                String str5 = str4;
                ThemedColor themedColor2 = themedColor;
                String str6 = str3;
                String str7 = str2;
                return uiEtpHolding.copy(str, uuid, str7, f, str6, str5, themedColor2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getName() {
                return this.name;
            }

            /* renamed from: component2, reason: from getter */
            public final UUID getInstrumentId() {
                return this.instrumentId;
            }

            /* renamed from: component3, reason: from getter */
            public final String getSymbol() {
                return this.symbol;
            }

            /* renamed from: component4, reason: from getter */
            public final float getWeight() {
                return this.weight;
            }

            /* renamed from: component5, reason: from getter */
            public final String getSector() {
                return this.sector;
            }

            /* renamed from: component6, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            /* renamed from: component7, reason: from getter */
            public final ThemedColor getColor() {
                return this.color;
            }

            public final UiEtpHolding copy(String name, UUID instrumentId, String symbol, float weight, String sector, String description, ThemedColor color) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(description, "description");
                return new UiEtpHolding(name, instrumentId, symbol, weight, sector, description, color);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UiEtpHolding)) {
                    return false;
                }
                UiEtpHolding uiEtpHolding = (UiEtpHolding) other;
                return Intrinsics.areEqual(this.name, uiEtpHolding.name) && Intrinsics.areEqual(this.instrumentId, uiEtpHolding.instrumentId) && Intrinsics.areEqual(this.symbol, uiEtpHolding.symbol) && Float.compare(this.weight, uiEtpHolding.weight) == 0 && Intrinsics.areEqual(this.sector, uiEtpHolding.sector) && Intrinsics.areEqual(this.description, uiEtpHolding.description) && Intrinsics.areEqual(this.color, uiEtpHolding.color);
            }

            public int hashCode() {
                int iHashCode = this.name.hashCode() * 31;
                UUID uuid = this.instrumentId;
                int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
                String str = this.symbol;
                int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + Float.hashCode(this.weight)) * 31;
                String str2 = this.sector;
                int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.description.hashCode()) * 31;
                ThemedColor themedColor = this.color;
                return iHashCode4 + (themedColor != null ? themedColor.hashCode() : 0);
            }

            public String toString() {
                return "UiEtpHolding(name=" + this.name + ", instrumentId=" + this.instrumentId + ", symbol=" + this.symbol + ", weight=" + this.weight + ", sector=" + this.sector + ", description=" + this.description + ", color=" + this.color + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.name);
                dest.writeSerializable(this.instrumentId);
                dest.writeString(this.symbol);
                dest.writeFloat(this.weight);
                dest.writeString(this.sector);
                dest.writeString(this.description);
                dest.writeParcelable(this.color, flags);
            }

            public UiEtpHolding(String name, UUID uuid, String str, float f, String str2, String description, ThemedColor themedColor) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(description, "description");
                this.name = name;
                this.instrumentId = uuid;
                this.symbol = str;
                this.weight = f;
                this.sector = str2;
                this.description = description;
                this.color = themedColor;
            }

            public final String getName() {
                return this.name;
            }

            public final UUID getInstrumentId() {
                return this.instrumentId;
            }

            public final String getSymbol() {
                return this.symbol;
            }

            public final float getWeight() {
                return this.weight;
            }

            public final String getSector() {
                return this.sector;
            }

            public final String getDescription() {
                return this.description;
            }

            public final ThemedColor getColor() {
                return this.color;
            }
        }
    }

    private final String getWeightString() {
        NumberFormatter leadingZeroesHundredthPercentFormat;
        if (this.weight == 100.0f) {
            leadingZeroesHundredthPercentFormat = Formats.getWholeNumberWithPercentageSuffixFormat();
        } else {
            leadingZeroesHundredthPercentFormat = Formats.getLeadingZeroesHundredthPercentFormat();
        }
        return leadingZeroesHundredthPercentFormat.format(Float.valueOf(this.weight));
    }

    public final String getName() {
        if (this instanceof Holding) {
            return ((Holding) this).getHolding().getName();
        }
        if (this instanceof Sector) {
            return ((Sector) this).getSector().getName();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int getWeightColorRes() {
        return isActive() ? C20690R.attr.colorForeground1 : C20690R.attr.colorForeground2;
    }

    public final int getColorInt(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (isActive()) {
            return EtpCompositionResources.getColorInt(getColor(), context);
        }
        return ThemeColors.getThemeColor(context, C20690R.attr.colorBackground3);
    }

    public final EtpCompositionItemHolder inactiveCopy() {
        if (this instanceof Holding) {
            return Holding.copy$default((Holding) this, null, false, false, false, 13, null);
        }
        if (this instanceof Sector) {
            return Sector.copy$default((Sector) this, null, false, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getFormattedWeight(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string2 = this.weight < 0.01f ? context.getString(C15314R.string.etp_composition_fractional_weight) : getWeightString();
        Intrinsics.checkNotNull(string2);
        return string2;
    }

    public final EtpCompositionItemHolder bottomDividerCopy(boolean showBottomDivider) {
        if (this instanceof Holding) {
            return Holding.copy$default((Holding) this, null, false, false, showBottomDivider, 7, null);
        }
        if (this instanceof Sector) {
            return this;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: EtpCompositionItemHolder.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemHolder$DiffCallback;", "Lcom/robinhood/utils/ui/view/recyclerview/ItemCallbackAdapter;", "Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemHolder;", "<init>", "()V", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitydetail.ui.etp.EtpCompositionItemHolder$DiffCallback, reason: from kotlin metadata */
    public static final class Companion extends DiffCallbacks3<EtpCompositionItemHolder> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(EtpCompositionItemHolder oldItem, EtpCompositionItemHolder newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if (oldItem instanceof Sector) {
                Sector sector = newItem instanceof Sector ? (Sector) newItem : null;
                return Intrinsics.areEqual(sector != null ? sector.getSector() : null, ((Sector) oldItem).getSector());
            }
            if (!(oldItem instanceof Holding)) {
                throw new NoWhenBranchMatchedException();
            }
            Holding holding = newItem instanceof Holding ? (Holding) newItem : null;
            return Intrinsics.areEqual(holding != null ? holding.getHolding() : null, ((Holding) oldItem).getHolding());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(EtpCompositionItemHolder oldItem, EtpCompositionItemHolder newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.isActive() == newItem.isActive();
        }
    }
}
