package com.robinhood.shared.support.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.singular.sdk.internal.SLRemoteConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: AppointmentsSchedulerFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002()B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001dHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006*"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "campaignId", "", "appointmentId", SLRemoteConfiguration.Constants.DEBUG_JSON_KEY, "Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Debug;", "source", "Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Source;", "useCloseNavButton", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Debug;Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Source;Z)V", "getCampaignId", "()Ljava/lang/String;", "getAppointmentId", "getDebug", "()Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Debug;", "getSource", "()Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Source;", "getUseCloseNavButton", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Source", "Debug", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AppointmentsSchedulerFragmentKey implements FragmentKey {
    public static final Parcelable.Creator<AppointmentsSchedulerFragmentKey> CREATOR = new Creator();
    private final String appointmentId;
    private final String campaignId;
    private final Debug debug;
    private final Source source;
    private final boolean useCloseNavButton;

    /* compiled from: AppointmentsSchedulerFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<AppointmentsSchedulerFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AppointmentsSchedulerFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AppointmentsSchedulerFragmentKey(parcel.readString(), parcel.readString(), (Debug) parcel.readParcelable(AppointmentsSchedulerFragmentKey.class.getClassLoader()), (Source) parcel.readParcelable(AppointmentsSchedulerFragmentKey.class.getClassLoader()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AppointmentsSchedulerFragmentKey[] newArray(int i) {
            return new AppointmentsSchedulerFragmentKey[i];
        }
    }

    public static /* synthetic */ AppointmentsSchedulerFragmentKey copy$default(AppointmentsSchedulerFragmentKey appointmentsSchedulerFragmentKey, String str, String str2, Debug debug, Source source, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appointmentsSchedulerFragmentKey.campaignId;
        }
        if ((i & 2) != 0) {
            str2 = appointmentsSchedulerFragmentKey.appointmentId;
        }
        if ((i & 4) != 0) {
            debug = appointmentsSchedulerFragmentKey.debug;
        }
        if ((i & 8) != 0) {
            source = appointmentsSchedulerFragmentKey.source;
        }
        if ((i & 16) != 0) {
            z = appointmentsSchedulerFragmentKey.useCloseNavButton;
        }
        boolean z2 = z;
        Debug debug2 = debug;
        return appointmentsSchedulerFragmentKey.copy(str, str2, debug2, source, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCampaignId() {
        return this.campaignId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAppointmentId() {
        return this.appointmentId;
    }

    /* renamed from: component3, reason: from getter */
    public final Debug getDebug() {
        return this.debug;
    }

    /* renamed from: component4, reason: from getter */
    public final Source getSource() {
        return this.source;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getUseCloseNavButton() {
        return this.useCloseNavButton;
    }

    public final AppointmentsSchedulerFragmentKey copy(String campaignId, String appointmentId, Debug debug, Source source, boolean useCloseNavButton) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        return new AppointmentsSchedulerFragmentKey(campaignId, appointmentId, debug, source, useCloseNavButton);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppointmentsSchedulerFragmentKey)) {
            return false;
        }
        AppointmentsSchedulerFragmentKey appointmentsSchedulerFragmentKey = (AppointmentsSchedulerFragmentKey) other;
        return Intrinsics.areEqual(this.campaignId, appointmentsSchedulerFragmentKey.campaignId) && Intrinsics.areEqual(this.appointmentId, appointmentsSchedulerFragmentKey.appointmentId) && Intrinsics.areEqual(this.debug, appointmentsSchedulerFragmentKey.debug) && Intrinsics.areEqual(this.source, appointmentsSchedulerFragmentKey.source) && this.useCloseNavButton == appointmentsSchedulerFragmentKey.useCloseNavButton;
    }

    public int hashCode() {
        int iHashCode = this.campaignId.hashCode() * 31;
        String str = this.appointmentId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Debug debug = this.debug;
        int iHashCode3 = (iHashCode2 + (debug == null ? 0 : debug.hashCode())) * 31;
        Source source = this.source;
        return ((iHashCode3 + (source != null ? source.hashCode() : 0)) * 31) + Boolean.hashCode(this.useCloseNavButton);
    }

    public String toString() {
        return "AppointmentsSchedulerFragmentKey(campaignId=" + this.campaignId + ", appointmentId=" + this.appointmentId + ", debug=" + this.debug + ", source=" + this.source + ", useCloseNavButton=" + this.useCloseNavButton + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.campaignId);
        dest.writeString(this.appointmentId);
        dest.writeParcelable(this.debug, flags);
        dest.writeParcelable(this.source, flags);
        dest.writeInt(this.useCloseNavButton ? 1 : 0);
    }

    public AppointmentsSchedulerFragmentKey(String campaignId, String str, Debug debug, Source source, boolean z) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        this.campaignId = campaignId;
        this.appointmentId = str;
        this.debug = debug;
        this.source = source;
        this.useCloseNavButton = z;
    }

    public /* synthetic */ AppointmentsSchedulerFragmentKey(String str, String str2, Debug debug, Source source, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : debug, (i & 8) != 0 ? null : source, (i & 16) != 0 ? true : z);
    }

    public final String getCampaignId() {
        return this.campaignId;
    }

    public final String getAppointmentId() {
        return this.appointmentId;
    }

    public final Debug getDebug() {
        return this.debug;
    }

    public final Source getSource() {
        return this.source;
    }

    public final boolean getUseCloseNavButton() {
        return this.useCloseNavButton;
    }

    /* compiled from: AppointmentsSchedulerFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Source;", "Landroid/os/Parcelable;", "<init>", "()V", "OptionsOnboarding", "Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Source$OptionsOnboarding;", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Source implements Parcelable {
        public /* synthetic */ Source(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Source() {
        }

        /* compiled from: AppointmentsSchedulerFragmentKey.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Source$OptionsOnboarding;", "Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Source;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class OptionsOnboarding extends Source {
            public static final Parcelable.Creator<OptionsOnboarding> CREATOR = new Creator();
            private final String accountNumber;

            /* compiled from: AppointmentsSchedulerFragmentKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<OptionsOnboarding> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final OptionsOnboarding createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new OptionsOnboarding(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final OptionsOnboarding[] newArray(int i) {
                    return new OptionsOnboarding[i];
                }
            }

            public static /* synthetic */ OptionsOnboarding copy$default(OptionsOnboarding optionsOnboarding, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = optionsOnboarding.accountNumber;
                }
                return optionsOnboarding.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAccountNumber() {
                return this.accountNumber;
            }

            public final OptionsOnboarding copy(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                return new OptionsOnboarding(accountNumber);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OptionsOnboarding) && Intrinsics.areEqual(this.accountNumber, ((OptionsOnboarding) other).accountNumber);
            }

            public int hashCode() {
                return this.accountNumber.hashCode();
            }

            public String toString() {
                return "OptionsOnboarding(accountNumber=" + this.accountNumber + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.accountNumber);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OptionsOnboarding(String accountNumber) {
                super(null);
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                this.accountNumber = accountNumber;
            }

            public final String getAccountNumber() {
                return this.accountNumber;
            }
        }
    }

    /* compiled from: AppointmentsSchedulerFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Debug;", "Landroid/os/Parcelable;", "ShortcutToNotes", "ShortcutToReview", "Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Debug$ShortcutToNotes;", "Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Debug$ShortcutToReview;", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Debug extends Parcelable {

        /* compiled from: AppointmentsSchedulerFragmentKey.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Debug$ShortcutToNotes;", "Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Debug;", "notes", "", "<init>", "(Ljava/lang/String;)V", "getNotes", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ShortcutToNotes implements Debug {
            public static final Parcelable.Creator<ShortcutToNotes> CREATOR = new Creator();
            private final String notes;

            /* compiled from: AppointmentsSchedulerFragmentKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<ShortcutToNotes> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ShortcutToNotes createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ShortcutToNotes(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ShortcutToNotes[] newArray(int i) {
                    return new ShortcutToNotes[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public ShortcutToNotes() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ ShortcutToNotes copy$default(ShortcutToNotes shortcutToNotes, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = shortcutToNotes.notes;
                }
                return shortcutToNotes.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getNotes() {
                return this.notes;
            }

            public final ShortcutToNotes copy(String notes) {
                Intrinsics.checkNotNullParameter(notes, "notes");
                return new ShortcutToNotes(notes);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShortcutToNotes) && Intrinsics.areEqual(this.notes, ((ShortcutToNotes) other).notes);
            }

            public int hashCode() {
                return this.notes.hashCode();
            }

            public String toString() {
                return "ShortcutToNotes(notes=" + this.notes + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.notes);
            }

            public ShortcutToNotes(String notes) {
                Intrinsics.checkNotNullParameter(notes, "notes");
                this.notes = notes;
            }

            public /* synthetic */ ShortcutToNotes(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "test" : str);
            }

            public final String getNotes() {
                return this.notes;
            }
        }

        /* compiled from: AppointmentsSchedulerFragmentKey.kt */
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018JB\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b)\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b*\u0010\u0018¨\u0006+"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Debug$ShortcutToReview;", "Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Debug;", "j$/time/Instant", "dateStart", "dateEnd", "", "notes", "phone", "email", "<init>", "(Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lj$/time/Instant;", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "copy", "(Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Debug$ShortcutToReview;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/Instant;", "getDateStart", "getDateEnd", "Ljava/lang/String;", "getNotes", "getPhone", "getEmail", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ShortcutToReview implements Debug {
            public static final Parcelable.Creator<ShortcutToReview> CREATOR = new Creator();
            private final Instant dateEnd;
            private final Instant dateStart;
            private final String email;
            private final String notes;
            private final String phone;

            /* compiled from: AppointmentsSchedulerFragmentKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<ShortcutToReview> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ShortcutToReview createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ShortcutToReview((Instant) parcel.readSerializable(), (Instant) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ShortcutToReview[] newArray(int i) {
                    return new ShortcutToReview[i];
                }
            }

            public static /* synthetic */ ShortcutToReview copy$default(ShortcutToReview shortcutToReview, Instant instant, Instant instant2, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    instant = shortcutToReview.dateStart;
                }
                if ((i & 2) != 0) {
                    instant2 = shortcutToReview.dateEnd;
                }
                if ((i & 4) != 0) {
                    str = shortcutToReview.notes;
                }
                if ((i & 8) != 0) {
                    str2 = shortcutToReview.phone;
                }
                if ((i & 16) != 0) {
                    str3 = shortcutToReview.email;
                }
                String str4 = str3;
                String str5 = str;
                return shortcutToReview.copy(instant, instant2, str5, str2, str4);
            }

            /* renamed from: component1, reason: from getter */
            public final Instant getDateStart() {
                return this.dateStart;
            }

            /* renamed from: component2, reason: from getter */
            public final Instant getDateEnd() {
                return this.dateEnd;
            }

            /* renamed from: component3, reason: from getter */
            public final String getNotes() {
                return this.notes;
            }

            /* renamed from: component4, reason: from getter */
            public final String getPhone() {
                return this.phone;
            }

            /* renamed from: component5, reason: from getter */
            public final String getEmail() {
                return this.email;
            }

            public final ShortcutToReview copy(Instant dateStart, Instant dateEnd, String notes, String phone, String email) {
                Intrinsics.checkNotNullParameter(dateStart, "dateStart");
                Intrinsics.checkNotNullParameter(dateEnd, "dateEnd");
                Intrinsics.checkNotNullParameter(notes, "notes");
                Intrinsics.checkNotNullParameter(phone, "phone");
                Intrinsics.checkNotNullParameter(email, "email");
                return new ShortcutToReview(dateStart, dateEnd, notes, phone, email);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShortcutToReview)) {
                    return false;
                }
                ShortcutToReview shortcutToReview = (ShortcutToReview) other;
                return Intrinsics.areEqual(this.dateStart, shortcutToReview.dateStart) && Intrinsics.areEqual(this.dateEnd, shortcutToReview.dateEnd) && Intrinsics.areEqual(this.notes, shortcutToReview.notes) && Intrinsics.areEqual(this.phone, shortcutToReview.phone) && Intrinsics.areEqual(this.email, shortcutToReview.email);
            }

            public int hashCode() {
                return (((((((this.dateStart.hashCode() * 31) + this.dateEnd.hashCode()) * 31) + this.notes.hashCode()) * 31) + this.phone.hashCode()) * 31) + this.email.hashCode();
            }

            public String toString() {
                return "ShortcutToReview(dateStart=" + this.dateStart + ", dateEnd=" + this.dateEnd + ", notes=" + this.notes + ", phone=" + this.phone + ", email=" + this.email + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.dateStart);
                dest.writeSerializable(this.dateEnd);
                dest.writeString(this.notes);
                dest.writeString(this.phone);
                dest.writeString(this.email);
            }

            public ShortcutToReview(Instant dateStart, Instant dateEnd, String notes, String phone, String email) {
                Intrinsics.checkNotNullParameter(dateStart, "dateStart");
                Intrinsics.checkNotNullParameter(dateEnd, "dateEnd");
                Intrinsics.checkNotNullParameter(notes, "notes");
                Intrinsics.checkNotNullParameter(phone, "phone");
                Intrinsics.checkNotNullParameter(email, "email");
                this.dateStart = dateStart;
                this.dateEnd = dateEnd;
                this.notes = notes;
                this.phone = phone;
                this.email = email;
            }

            public final Instant getDateStart() {
                return this.dateStart;
            }

            public final Instant getDateEnd() {
                return this.dateEnd;
            }

            public final String getNotes() {
                return this.notes;
            }

            public final String getPhone() {
                return this.phone;
            }

            public final String getEmail() {
                return this.email;
            }
        }
    }
}
