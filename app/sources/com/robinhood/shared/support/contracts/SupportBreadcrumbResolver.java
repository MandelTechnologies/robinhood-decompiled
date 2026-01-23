package com.robinhood.shared.support.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumb;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumb2;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumb3;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SupportBreadcrumbResolver.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&\u0082\u0001\u0005\f\r\u000e\u000f\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/SupportBreadcrumbResolver;", "Landroid/os/Parcelable;", "<init>", "()V", "createBreadcrumbs", "", "Lcom/robinhood/android/lib/breadcrumbs/GenericSupportBreadcrumb;", "ExistingCaseId", "StartNewInquiry", "ParcelableBreadcrumbResolver", "IssueError", "ChatbotError", "Lcom/robinhood/shared/support/contracts/SupportBreadcrumbResolver$ChatbotError;", "Lcom/robinhood/shared/support/contracts/SupportBreadcrumbResolver$ExistingCaseId;", "Lcom/robinhood/shared/support/contracts/SupportBreadcrumbResolver$IssueError;", "Lcom/robinhood/shared/support/contracts/SupportBreadcrumbResolver$ParcelableBreadcrumbResolver;", "Lcom/robinhood/shared/support/contracts/SupportBreadcrumbResolver$StartNewInquiry;", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class SupportBreadcrumbResolver implements Parcelable {
    public /* synthetic */ SupportBreadcrumbResolver(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract List<SupportBreadcrumb2> createBreadcrumbs();

    private SupportBreadcrumbResolver() {
    }

    /* compiled from: SupportBreadcrumbResolver.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\t\u0010\t\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/SupportBreadcrumbResolver$ExistingCaseId;", "Lcom/robinhood/shared/support/contracts/SupportBreadcrumbResolver;", "existingCaseId", "", "<init>", "(Ljava/lang/String;)V", "createBreadcrumbs", "", "Lcom/robinhood/android/lib/breadcrumbs/GenericSupportBreadcrumb;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ExistingCaseId extends SupportBreadcrumbResolver {
        public static final Parcelable.Creator<ExistingCaseId> CREATOR = new Creator();
        private final String existingCaseId;

        /* compiled from: SupportBreadcrumbResolver.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ExistingCaseId> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ExistingCaseId createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExistingCaseId(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ExistingCaseId[] newArray(int i) {
                return new ExistingCaseId[i];
            }
        }

        /* renamed from: component1, reason: from getter */
        private final String getExistingCaseId() {
            return this.existingCaseId;
        }

        public static /* synthetic */ ExistingCaseId copy$default(ExistingCaseId existingCaseId, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = existingCaseId.existingCaseId;
            }
            return existingCaseId.copy(str);
        }

        public final ExistingCaseId copy(String existingCaseId) {
            Intrinsics.checkNotNullParameter(existingCaseId, "existingCaseId");
            return new ExistingCaseId(existingCaseId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ExistingCaseId) && Intrinsics.areEqual(this.existingCaseId, ((ExistingCaseId) other).existingCaseId);
        }

        public int hashCode() {
            return this.existingCaseId.hashCode();
        }

        public String toString() {
            return "ExistingCaseId(existingCaseId=" + this.existingCaseId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.existingCaseId);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExistingCaseId(String existingCaseId) {
            super(null);
            Intrinsics.checkNotNullParameter(existingCaseId, "existingCaseId");
            this.existingCaseId = existingCaseId;
        }

        @Override // com.robinhood.shared.support.contracts.SupportBreadcrumbResolver
        public List<SupportBreadcrumb2> createBreadcrumbs() {
            return CollectionsKt.listOf(new SupportBreadcrumb(SupportBreadcrumbType.SUPPORT_EXISTING_CASE, this.existingCaseId, "RequestSupportCallDeeplink"));
        }
    }

    /* compiled from: SupportBreadcrumbResolver.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\t\u0010\n\u001a\u00020\u0003HÂ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/SupportBreadcrumbResolver$StartNewInquiry;", "Lcom/robinhood/shared/support/contracts/SupportBreadcrumbResolver;", "existingIssueId", "", "channel", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "createBreadcrumbs", "", "Lcom/robinhood/android/lib/breadcrumbs/GenericSupportBreadcrumb;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StartNewInquiry extends SupportBreadcrumbResolver {
        private static final String SOURCE_START_NEW_INQUIRY = "StartNewInquiryDeeplink";
        private final String channel;
        private final String existingIssueId;
        public static final Parcelable.Creator<StartNewInquiry> CREATOR = new Creator();

        /* compiled from: SupportBreadcrumbResolver.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<StartNewInquiry> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StartNewInquiry createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StartNewInquiry(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StartNewInquiry[] newArray(int i) {
                return new StartNewInquiry[i];
            }
        }

        /* renamed from: component1, reason: from getter */
        private final String getExistingIssueId() {
            return this.existingIssueId;
        }

        /* renamed from: component2, reason: from getter */
        private final String getChannel() {
            return this.channel;
        }

        public static /* synthetic */ StartNewInquiry copy$default(StartNewInquiry startNewInquiry, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = startNewInquiry.existingIssueId;
            }
            if ((i & 2) != 0) {
                str2 = startNewInquiry.channel;
            }
            return startNewInquiry.copy(str, str2);
        }

        public final StartNewInquiry copy(String existingIssueId, String channel) {
            Intrinsics.checkNotNullParameter(existingIssueId, "existingIssueId");
            return new StartNewInquiry(existingIssueId, channel);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StartNewInquiry)) {
                return false;
            }
            StartNewInquiry startNewInquiry = (StartNewInquiry) other;
            return Intrinsics.areEqual(this.existingIssueId, startNewInquiry.existingIssueId) && Intrinsics.areEqual(this.channel, startNewInquiry.channel);
        }

        public int hashCode() {
            int iHashCode = this.existingIssueId.hashCode() * 31;
            String str = this.channel;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "StartNewInquiry(existingIssueId=" + this.existingIssueId + ", channel=" + this.channel + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.existingIssueId);
            dest.writeString(this.channel);
        }

        public /* synthetic */ StartNewInquiry(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartNewInquiry(String existingIssueId, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(existingIssueId, "existingIssueId");
            this.existingIssueId = existingIssueId;
            this.channel = str;
        }

        @Override // com.robinhood.shared.support.contracts.SupportBreadcrumbResolver
        public List<SupportBreadcrumb2> createBreadcrumbs() {
            String str = this.channel;
            return CollectionsKt.listOfNotNull((Object[]) new SupportBreadcrumb[]{str != null ? new SupportBreadcrumb(SupportBreadcrumbType.SWITCH_SUPPORT_CHANNEL, str, SOURCE_START_NEW_INQUIRY) : null, new SupportBreadcrumb(SupportBreadcrumbType.CLOSED_ISSUE, this.existingIssueId, SOURCE_START_NEW_INQUIRY)});
        }
    }

    /* compiled from: SupportBreadcrumbResolver.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\t\u0010\n\u001a\u00020\u0004HÂ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/SupportBreadcrumbResolver$ParcelableBreadcrumbResolver;", "Landroid/os/Parcelable;", "Lcom/robinhood/shared/support/contracts/SupportBreadcrumbResolver;", "parcelableBreadcrumb", "Lcom/robinhood/android/lib/breadcrumbs/ParcelableSupportBreadcrumb;", "<init>", "(Lcom/robinhood/android/lib/breadcrumbs/ParcelableSupportBreadcrumb;)V", "createBreadcrumbs", "", "Lcom/robinhood/android/lib/breadcrumbs/GenericSupportBreadcrumb;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ParcelableBreadcrumbResolver extends SupportBreadcrumbResolver implements Parcelable {
        public static final Parcelable.Creator<ParcelableBreadcrumbResolver> CREATOR = new Creator();
        private final SupportBreadcrumb3 parcelableBreadcrumb;

        /* compiled from: SupportBreadcrumbResolver.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ParcelableBreadcrumbResolver> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ParcelableBreadcrumbResolver createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ParcelableBreadcrumbResolver((SupportBreadcrumb3) parcel.readParcelable(ParcelableBreadcrumbResolver.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ParcelableBreadcrumbResolver[] newArray(int i) {
                return new ParcelableBreadcrumbResolver[i];
            }
        }

        /* renamed from: component1, reason: from getter */
        private final SupportBreadcrumb3 getParcelableBreadcrumb() {
            return this.parcelableBreadcrumb;
        }

        public static /* synthetic */ ParcelableBreadcrumbResolver copy$default(ParcelableBreadcrumbResolver parcelableBreadcrumbResolver, SupportBreadcrumb3 supportBreadcrumb3, int i, Object obj) {
            if ((i & 1) != 0) {
                supportBreadcrumb3 = parcelableBreadcrumbResolver.parcelableBreadcrumb;
            }
            return parcelableBreadcrumbResolver.copy(supportBreadcrumb3);
        }

        public final ParcelableBreadcrumbResolver copy(SupportBreadcrumb3 parcelableBreadcrumb) {
            Intrinsics.checkNotNullParameter(parcelableBreadcrumb, "parcelableBreadcrumb");
            return new ParcelableBreadcrumbResolver(parcelableBreadcrumb);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ParcelableBreadcrumbResolver) && Intrinsics.areEqual(this.parcelableBreadcrumb, ((ParcelableBreadcrumbResolver) other).parcelableBreadcrumb);
        }

        public int hashCode() {
            return this.parcelableBreadcrumb.hashCode();
        }

        public String toString() {
            return "ParcelableBreadcrumbResolver(parcelableBreadcrumb=" + this.parcelableBreadcrumb + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.parcelableBreadcrumb, flags);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParcelableBreadcrumbResolver(SupportBreadcrumb3 parcelableBreadcrumb) {
            super(null);
            Intrinsics.checkNotNullParameter(parcelableBreadcrumb, "parcelableBreadcrumb");
            this.parcelableBreadcrumb = parcelableBreadcrumb;
        }

        @Override // com.robinhood.shared.support.contracts.SupportBreadcrumbResolver
        public List<SupportBreadcrumb2> createBreadcrumbs() {
            return CollectionsKt.listOf(this.parcelableBreadcrumb);
        }
    }

    /* compiled from: SupportBreadcrumbResolver.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\t\u0010\n\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÂ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/SupportBreadcrumbResolver$IssueError;", "Lcom/robinhood/shared/support/contracts/SupportBreadcrumbResolver;", "existingIssueId", "", "channel", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "createBreadcrumbs", "", "Lcom/robinhood/android/lib/breadcrumbs/GenericSupportBreadcrumb;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class IssueError extends SupportBreadcrumbResolver {
        private static final String SOURCE_ISSUE_ERROR = "IssueError";
        private final String channel;
        private final String existingIssueId;
        public static final Parcelable.Creator<IssueError> CREATOR = new Creator();

        /* compiled from: SupportBreadcrumbResolver.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<IssueError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IssueError createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IssueError(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IssueError[] newArray(int i) {
                return new IssueError[i];
            }
        }

        /* renamed from: component1, reason: from getter */
        private final String getExistingIssueId() {
            return this.existingIssueId;
        }

        /* renamed from: component2, reason: from getter */
        private final String getChannel() {
            return this.channel;
        }

        public static /* synthetic */ IssueError copy$default(IssueError issueError, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = issueError.existingIssueId;
            }
            if ((i & 2) != 0) {
                str2 = issueError.channel;
            }
            return issueError.copy(str, str2);
        }

        public final IssueError copy(String existingIssueId, String channel) {
            Intrinsics.checkNotNullParameter(existingIssueId, "existingIssueId");
            Intrinsics.checkNotNullParameter(channel, "channel");
            return new IssueError(existingIssueId, channel);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IssueError)) {
                return false;
            }
            IssueError issueError = (IssueError) other;
            return Intrinsics.areEqual(this.existingIssueId, issueError.existingIssueId) && Intrinsics.areEqual(this.channel, issueError.channel);
        }

        public int hashCode() {
            return (this.existingIssueId.hashCode() * 31) + this.channel.hashCode();
        }

        public String toString() {
            return "IssueError(existingIssueId=" + this.existingIssueId + ", channel=" + this.channel + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.existingIssueId);
            dest.writeString(this.channel);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IssueError(String existingIssueId, String channel) {
            super(null);
            Intrinsics.checkNotNullParameter(existingIssueId, "existingIssueId");
            Intrinsics.checkNotNullParameter(channel, "channel");
            this.existingIssueId = existingIssueId;
            this.channel = channel;
        }

        @Override // com.robinhood.shared.support.contracts.SupportBreadcrumbResolver
        public List<SupportBreadcrumb2> createBreadcrumbs() {
            return CollectionsKt.listOf((Object[]) new SupportBreadcrumb[]{new SupportBreadcrumb(SupportBreadcrumbType.SWITCH_SUPPORT_CHANNEL, this.channel, SOURCE_ISSUE_ERROR), new SupportBreadcrumb(SupportBreadcrumbType.ISSUE_ERROR, this.existingIssueId, SOURCE_ISSUE_ERROR)});
        }
    }

    /* compiled from: SupportBreadcrumbResolver.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\t\u0010\n\u001a\u00020\u0003HÂ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/SupportBreadcrumbResolver$ChatbotError;", "Lcom/robinhood/shared/support/contracts/SupportBreadcrumbResolver;", "chatbot_interaction_id", "", "error_reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "createBreadcrumbs", "", "Lcom/robinhood/android/lib/breadcrumbs/GenericSupportBreadcrumb;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ChatbotError extends SupportBreadcrumbResolver {
        private static final String SOURCE_CHATBOT_ERROR = "ChatbotError";
        private final String chatbot_interaction_id;
        private final String error_reason;
        public static final Parcelable.Creator<ChatbotError> CREATOR = new Creator();

        /* compiled from: SupportBreadcrumbResolver.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ChatbotError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChatbotError createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChatbotError(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChatbotError[] newArray(int i) {
                return new ChatbotError[i];
            }
        }

        /* renamed from: component1, reason: from getter */
        private final String getChatbot_interaction_id() {
            return this.chatbot_interaction_id;
        }

        /* renamed from: component2, reason: from getter */
        private final String getError_reason() {
            return this.error_reason;
        }

        public static /* synthetic */ ChatbotError copy$default(ChatbotError chatbotError, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = chatbotError.chatbot_interaction_id;
            }
            if ((i & 2) != 0) {
                str2 = chatbotError.error_reason;
            }
            return chatbotError.copy(str, str2);
        }

        public final ChatbotError copy(String chatbot_interaction_id, String error_reason) {
            Intrinsics.checkNotNullParameter(chatbot_interaction_id, "chatbot_interaction_id");
            return new ChatbotError(chatbot_interaction_id, error_reason);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChatbotError)) {
                return false;
            }
            ChatbotError chatbotError = (ChatbotError) other;
            return Intrinsics.areEqual(this.chatbot_interaction_id, chatbotError.chatbot_interaction_id) && Intrinsics.areEqual(this.error_reason, chatbotError.error_reason);
        }

        public int hashCode() {
            int iHashCode = this.chatbot_interaction_id.hashCode() * 31;
            String str = this.error_reason;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ChatbotError(chatbot_interaction_id=" + this.chatbot_interaction_id + ", error_reason=" + this.error_reason + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.chatbot_interaction_id);
            dest.writeString(this.error_reason);
        }

        public /* synthetic */ ChatbotError(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChatbotError(String chatbot_interaction_id, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(chatbot_interaction_id, "chatbot_interaction_id");
            this.chatbot_interaction_id = chatbot_interaction_id;
            this.error_reason = str;
        }

        @Override // com.robinhood.shared.support.contracts.SupportBreadcrumbResolver
        public List<SupportBreadcrumb2> createBreadcrumbs() {
            return CollectionsKt.listOf(new SupportBreadcrumb(SupportBreadcrumbType.CHATBOT_ERROR, this, SOURCE_CHATBOT_ERROR));
        }
    }
}
