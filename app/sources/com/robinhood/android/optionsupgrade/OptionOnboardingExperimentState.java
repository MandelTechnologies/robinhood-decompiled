package com.robinhood.android.optionsupgrade;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.utils.Preconditions;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOnboardingStates.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState;", "", "<init>", "()V", "SplashL0", "SplashL2", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL0;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL2;", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public abstract class OptionOnboardingExperimentState {
    public static final int $stable = 0;

    public /* synthetic */ OptionOnboardingExperimentState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OptionOnboardingExperimentState() {
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL0;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState;", "Landroid/os/Parcelable;", "<init>", "()V", "Swipie", "Redesign", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL0$Redesign;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL0$Swipie;", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class SplashL0 extends OptionOnboardingExperimentState implements Parcelable {
        public static final int $stable = 0;

        public /* synthetic */ SplashL0(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private SplashL0() {
            super(null);
        }

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL0$Swipie;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL0;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Swipie extends SplashL0 {
            public static final int $stable = 0;
            public static final Swipie INSTANCE = new Swipie();
            public static final Parcelable.Creator<Swipie> CREATOR = new Creator();

            /* compiled from: OptionOnboardingStates.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Swipie> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Swipie createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Swipie.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Swipie[] newArray(int i) {
                    return new Swipie[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Swipie);
            }

            public int hashCode() {
                return 1669879108;
            }

            public String toString() {
                return "Swipie";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private Swipie() {
                super(null);
            }
        }

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL0$Redesign;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL0;", "type", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL0$Redesign$RedesignL0AssetType;", "<init>", "(Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL0$Redesign$RedesignL0AssetType;)V", "getType", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL0$Redesign$RedesignL0AssetType;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "RedesignL0AssetType", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Redesign extends SplashL0 {
            public static final int $stable = 0;
            public static final Parcelable.Creator<Redesign> CREATOR = new Creator();
            private final RedesignL0AssetType type;

            /* compiled from: OptionOnboardingStates.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Redesign> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Redesign createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Redesign(RedesignL0AssetType.valueOf(parcel.readString()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Redesign[] newArray(int i) {
                    return new Redesign[i];
                }
            }

            public static /* synthetic */ Redesign copy$default(Redesign redesign, RedesignL0AssetType redesignL0AssetType, int i, Object obj) {
                if ((i & 1) != 0) {
                    redesignL0AssetType = redesign.type;
                }
                return redesign.copy(redesignL0AssetType);
            }

            /* renamed from: component1, reason: from getter */
            public final RedesignL0AssetType getType() {
                return this.type;
            }

            public final Redesign copy(RedesignL0AssetType type2) {
                Intrinsics.checkNotNullParameter(type2, "type");
                return new Redesign(type2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Redesign) && this.type == ((Redesign) other).type;
            }

            public int hashCode() {
                return this.type.hashCode();
            }

            public String toString() {
                return "Redesign(type=" + this.type + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.type.name());
            }

            public final RedesignL0AssetType getType() {
                return this.type;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Redesign(RedesignL0AssetType type2) {
                super(null);
                Intrinsics.checkNotNullParameter(type2, "type");
                this.type = type2;
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: OptionOnboardingStates.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL0$Redesign$RedesignL0AssetType;", "", "<init>", "(Ljava/lang/String;I)V", "IMAGE", "LOTTIE", "VIDEO", "Companion", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class RedesignL0AssetType {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ RedesignL0AssetType[] $VALUES;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                public static final RedesignL0AssetType IMAGE = new RedesignL0AssetType("IMAGE", 0);
                public static final RedesignL0AssetType LOTTIE = new RedesignL0AssetType("LOTTIE", 1);
                public static final RedesignL0AssetType VIDEO = new RedesignL0AssetType("VIDEO", 2);

                private static final /* synthetic */ RedesignL0AssetType[] $values() {
                    return new RedesignL0AssetType[]{IMAGE, LOTTIE, VIDEO};
                }

                public static EnumEntries<RedesignL0AssetType> getEntries() {
                    return $ENTRIES;
                }

                private RedesignL0AssetType(String str, int i) {
                }

                static {
                    RedesignL0AssetType[] redesignL0AssetTypeArr$values = $values();
                    $VALUES = redesignL0AssetTypeArr$values;
                    $ENTRIES = EnumEntries2.enumEntries(redesignL0AssetTypeArr$values);
                    INSTANCE = new Companion(null);
                }

                /* compiled from: OptionOnboardingStates.kt */
                @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL0$Redesign$RedesignL0AssetType$Companion;", "", "<init>", "()V", "fromServerValue", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL0$Redesign$RedesignL0AssetType;", "serverValue", "", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final RedesignL0AssetType fromServerValue(String serverValue) {
                        Intrinsics.checkNotNullParameter(serverValue, "serverValue");
                        if (Intrinsics.areEqual(serverValue, Experiments.OptionsOnboardingL0SplashRedesignExperiment.Variant.COPY.getServerValue())) {
                            return RedesignL0AssetType.IMAGE;
                        }
                        if (Intrinsics.areEqual(serverValue, Experiments.OptionsOnboardingL0SplashRedesignExperiment.Variant.LOTTIE.getServerValue())) {
                            return RedesignL0AssetType.LOTTIE;
                        }
                        if (Intrinsics.areEqual(serverValue, Experiments.OptionsOnboardingL0SplashRedesignExperiment.Variant.VIDEO.getServerValue())) {
                            return RedesignL0AssetType.VIDEO;
                        }
                        Preconditions.INSTANCE.failUnexpectedItemKotlin(this);
                        throw new ExceptionsH();
                    }
                }

                public static RedesignL0AssetType valueOf(String str) {
                    return (RedesignL0AssetType) Enum.valueOf(RedesignL0AssetType.class, str);
                }

                public static RedesignL0AssetType[] values() {
                    return (RedesignL0AssetType[]) $VALUES.clone();
                }
            }
        }
    }

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL2;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState;", "Landroid/os/Parcelable;", "<init>", "()V", "Swipie", "Redesign", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL2$Redesign;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL2$Swipie;", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class SplashL2 extends OptionOnboardingExperimentState implements Parcelable {
        public static final int $stable = 0;

        public /* synthetic */ SplashL2(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private SplashL2() {
            super(null);
        }

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL2$Swipie;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL2;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Swipie extends SplashL2 {
            public static final int $stable = 0;
            public static final Swipie INSTANCE = new Swipie();
            public static final Parcelable.Creator<Swipie> CREATOR = new Creator();

            /* compiled from: OptionOnboardingStates.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Swipie> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Swipie createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Swipie.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Swipie[] newArray(int i) {
                    return new Swipie[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Swipie);
            }

            public int hashCode() {
                return 860532482;
            }

            public String toString() {
                return "Swipie";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private Swipie() {
                super(null);
            }
        }

        /* compiled from: OptionOnboardingStates.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL2$Redesign;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL2;", "type", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL2$Redesign$RedesignL2AssetType;", "<init>", "(Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL2$Redesign$RedesignL2AssetType;)V", "getType", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL2$Redesign$RedesignL2AssetType;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "RedesignL2AssetType", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Redesign extends SplashL2 {
            public static final int $stable = 0;
            public static final Parcelable.Creator<Redesign> CREATOR = new Creator();
            private final RedesignL2AssetType type;

            /* compiled from: OptionOnboardingStates.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Redesign> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Redesign createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Redesign(RedesignL2AssetType.valueOf(parcel.readString()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Redesign[] newArray(int i) {
                    return new Redesign[i];
                }
            }

            public static /* synthetic */ Redesign copy$default(Redesign redesign, RedesignL2AssetType redesignL2AssetType, int i, Object obj) {
                if ((i & 1) != 0) {
                    redesignL2AssetType = redesign.type;
                }
                return redesign.copy(redesignL2AssetType);
            }

            /* renamed from: component1, reason: from getter */
            public final RedesignL2AssetType getType() {
                return this.type;
            }

            public final Redesign copy(RedesignL2AssetType type2) {
                Intrinsics.checkNotNullParameter(type2, "type");
                return new Redesign(type2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Redesign) && this.type == ((Redesign) other).type;
            }

            public int hashCode() {
                return this.type.hashCode();
            }

            public String toString() {
                return "Redesign(type=" + this.type + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.type.name());
            }

            public final RedesignL2AssetType getType() {
                return this.type;
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: OptionOnboardingStates.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL2$Redesign$RedesignL2AssetType;", "", "<init>", "(Ljava/lang/String;I)V", "IMAGE", "LOTTIE", "Companion", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class RedesignL2AssetType {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ RedesignL2AssetType[] $VALUES;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                public static final RedesignL2AssetType IMAGE = new RedesignL2AssetType("IMAGE", 0);
                public static final RedesignL2AssetType LOTTIE = new RedesignL2AssetType("LOTTIE", 1);

                private static final /* synthetic */ RedesignL2AssetType[] $values() {
                    return new RedesignL2AssetType[]{IMAGE, LOTTIE};
                }

                public static EnumEntries<RedesignL2AssetType> getEntries() {
                    return $ENTRIES;
                }

                private RedesignL2AssetType(String str, int i) {
                }

                static {
                    RedesignL2AssetType[] redesignL2AssetTypeArr$values = $values();
                    $VALUES = redesignL2AssetTypeArr$values;
                    $ENTRIES = EnumEntries2.enumEntries(redesignL2AssetTypeArr$values);
                    INSTANCE = new Companion(null);
                }

                /* compiled from: OptionOnboardingStates.kt */
                @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL2$Redesign$RedesignL2AssetType$Companion;", "", "<init>", "()V", "fromServerValue", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL2$Redesign$RedesignL2AssetType;", "serverValue", "", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final RedesignL2AssetType fromServerValue(String serverValue) {
                        Intrinsics.checkNotNullParameter(serverValue, "serverValue");
                        if (Intrinsics.areEqual(serverValue, Experiments.OptionsOnboardingL2SplashRedesignV2Experiment.Variant.COPY.getServerValue())) {
                            return RedesignL2AssetType.IMAGE;
                        }
                        if (Intrinsics.areEqual(serverValue, Experiments.OptionsOnboardingL2SplashRedesignV2Experiment.Variant.LOTTIE.getServerValue())) {
                            return RedesignL2AssetType.LOTTIE;
                        }
                        Preconditions.INSTANCE.failUnexpectedItemKotlin(this);
                        throw new ExceptionsH();
                    }
                }

                public static RedesignL2AssetType valueOf(String str) {
                    return (RedesignL2AssetType) Enum.valueOf(RedesignL2AssetType.class, str);
                }

                public static RedesignL2AssetType[] values() {
                    return (RedesignL2AssetType[]) $VALUES.clone();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Redesign(RedesignL2AssetType type2) {
                super(null);
                Intrinsics.checkNotNullParameter(type2, "type");
                this.type = type2;
            }
        }
    }
}
