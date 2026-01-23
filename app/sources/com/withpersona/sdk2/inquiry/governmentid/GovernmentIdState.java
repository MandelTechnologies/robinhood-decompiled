package com.withpersona.sdk2.inquiry.governmentid;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdScreen2;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig2;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.Hint;
import com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdRequestArguments;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcState;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GovernmentIdState.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\f%&'()*+,-./0B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0017H\u0000¢\u0006\u0002\b\"J\b\u0010#\u001a\u00020$H\u0016R\u0012\u0010\u0004\u001a\u00020\u0005X \u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX \u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\tX \u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0012\u0010\u000f\u001a\u00020\u0010X \u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u0000X \u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u0017X \u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u0082\u0001\n123456789:¨\u0006;"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Landroid/os/Parcelable;", "<init>", "()V", "currentPart", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "getCurrentPart$government_id_release", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "uploadingIds", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "getUploadingIds$government_id_release", "()Ljava/util/List;", "parts", "getParts$government_id_release", "partIndex", "", "getPartIndex$government_id_release", "()I", "backState", "getBackState$government_id_release", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "countryCode", "", "getCountryCode$government_id_release", "()Ljava/lang/String;", "didGoBack", "", "getDidGoBack$government_id_release", "()Z", "setDidGoBack$government_id_release", "(Z)V", "copyWithErrorMessage", "error", "copyWithErrorMessage$government_id_release", "deleteAllIds", "", "ShowInstructions", "ChooseCaptureMethod", "WaitForAutocapture", "CountdownToCapture", "ReviewImageState", "ReviewCapturedImage", "ReviewSelectedImage", "FinalizeLocalVideoCapture", "FinalizeWebRtc", "Submit", "AutoClassificationError", "AutoClassificationManualSelect", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ShowInstructions;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$Submit;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public abstract class GovernmentIdState implements Parcelable {
    private boolean didGoBack;

    public /* synthetic */ GovernmentIdState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: getBackState$government_id_release */
    public abstract GovernmentIdState getBackState();

    /* renamed from: getCountryCode$government_id_release */
    public abstract String getCountryCode();

    /* renamed from: getCurrentPart$government_id_release */
    public abstract IdConfig2 getCurrentPart();

    /* renamed from: getPartIndex$government_id_release */
    public abstract int getPartIndex();

    public abstract List<IdConfig2> getParts$government_id_release();

    public abstract List<GovernmentId> getUploadingIds$government_id_release();

    private GovernmentIdState() {
    }

    /* renamed from: getDidGoBack$government_id_release, reason: from getter */
    public final boolean getDidGoBack() {
        return this.didGoBack;
    }

    public final void setDidGoBack$government_id_release(boolean z) {
        this.didGoBack = z;
    }

    /* compiled from: GovernmentIdState.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019Jt\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010&R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010)R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b*\u0010)R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\n\u001a\u00020\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b1\u0010\u001dR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b5\u0010\u001d¨\u00066"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ShowInstructions;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "currentPart", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "uploadingIds", "parts", "backState", "", "partIndex", "", "countryCode", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "selectedId", "error", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;ILjava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;ILjava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ShowInstructions;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "getCurrentPart$government_id_release", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "Ljava/util/List;", "getUploadingIds$government_id_release", "()Ljava/util/List;", "getParts$government_id_release", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "getBackState$government_id_release", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "I", "getPartIndex$government_id_release", "Ljava/lang/String;", "getCountryCode$government_id_release", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "getSelectedId", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "getError", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class ShowInstructions extends GovernmentIdState {
        public static final Parcelable.Creator<ShowInstructions> CREATOR = new Creator();
        private final GovernmentIdState backState;
        private final String countryCode;
        private final IdConfig2 currentPart;
        private final String error;
        private final int partIndex;
        private final List<IdConfig2> parts;
        private final IdConfig selectedId;
        private final List<GovernmentId> uploadingIds;

        /* compiled from: GovernmentIdState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ShowInstructions> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShowInstructions createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                IdConfig2 idConfig2 = (IdConfig2) parcel.readParcelable(ShowInstructions.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(ShowInstructions.class.getClassLoader()));
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readParcelable(ShowInstructions.class.getClassLoader()));
                }
                return new ShowInstructions(idConfig2, arrayList, arrayList2, (GovernmentIdState) parcel.readParcelable(ShowInstructions.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : IdConfig.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShowInstructions[] newArray(int i) {
                return new ShowInstructions[i];
            }
        }

        public static /* synthetic */ ShowInstructions copy$default(ShowInstructions showInstructions, IdConfig2 idConfig2, List list, List list2, GovernmentIdState governmentIdState, int i, String str, IdConfig idConfig, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                idConfig2 = showInstructions.currentPart;
            }
            if ((i2 & 2) != 0) {
                list = showInstructions.uploadingIds;
            }
            if ((i2 & 4) != 0) {
                list2 = showInstructions.parts;
            }
            if ((i2 & 8) != 0) {
                governmentIdState = showInstructions.backState;
            }
            if ((i2 & 16) != 0) {
                i = showInstructions.partIndex;
            }
            if ((i2 & 32) != 0) {
                str = showInstructions.countryCode;
            }
            if ((i2 & 64) != 0) {
                idConfig = showInstructions.selectedId;
            }
            if ((i2 & 128) != 0) {
                str2 = showInstructions.error;
            }
            IdConfig idConfig3 = idConfig;
            String str3 = str2;
            int i3 = i;
            String str4 = str;
            return showInstructions.copy(idConfig2, list, list2, governmentIdState, i3, str4, idConfig3, str3);
        }

        public final ShowInstructions copy(IdConfig2 currentPart, List<? extends GovernmentId> uploadingIds, List<? extends IdConfig2> parts, GovernmentIdState backState, int partIndex, String countryCode, IdConfig selectedId, String error) {
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(parts, "parts");
            return new ShowInstructions(currentPart, uploadingIds, parts, backState, partIndex, countryCode, selectedId, error);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowInstructions)) {
                return false;
            }
            ShowInstructions showInstructions = (ShowInstructions) other;
            return Intrinsics.areEqual(this.currentPart, showInstructions.currentPart) && Intrinsics.areEqual(this.uploadingIds, showInstructions.uploadingIds) && Intrinsics.areEqual(this.parts, showInstructions.parts) && Intrinsics.areEqual(this.backState, showInstructions.backState) && this.partIndex == showInstructions.partIndex && Intrinsics.areEqual(this.countryCode, showInstructions.countryCode) && Intrinsics.areEqual(this.selectedId, showInstructions.selectedId) && Intrinsics.areEqual(this.error, showInstructions.error);
        }

        public int hashCode() {
            int iHashCode = ((((this.currentPart.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.parts.hashCode()) * 31;
            GovernmentIdState governmentIdState = this.backState;
            int iHashCode2 = (((iHashCode + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31) + Integer.hashCode(this.partIndex)) * 31;
            String str = this.countryCode;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            IdConfig idConfig = this.selectedId;
            int iHashCode4 = (iHashCode3 + (idConfig == null ? 0 : idConfig.hashCode())) * 31;
            String str2 = this.error;
            return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "ShowInstructions(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", parts=" + this.parts + ", backState=" + this.backState + ", partIndex=" + this.partIndex + ", countryCode=" + this.countryCode + ", selectedId=" + this.selectedId + ", error=" + this.error + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.currentPart, flags);
            List<GovernmentId> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<GovernmentId> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            List<IdConfig2> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<IdConfig2> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeParcelable(this.backState, flags);
            dest.writeInt(this.partIndex);
            dest.writeString(this.countryCode);
            IdConfig idConfig = this.selectedId;
            if (idConfig == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                idConfig.writeToParcel(dest, flags);
            }
            dest.writeString(this.error);
        }

        public /* synthetic */ ShowInstructions(IdConfig2 idConfig2, List list, List list2, GovernmentIdState governmentIdState, int i, String str, IdConfig idConfig, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? new IdConfig2.SideIdPart(IdConfig.Side.Front) : idConfig2, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list, (i2 & 4) != 0 ? CollectionsKt.emptyList() : list2, (i2 & 8) != 0 ? null : governmentIdState, (i2 & 16) != 0 ? -1 : i, str, (i2 & 64) != 0 ? null : idConfig, (i2 & 128) != 0 ? null : str2);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getCurrentPart$government_id_release, reason: from getter */
        public IdConfig2 getCurrentPart() {
            return this.currentPart;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public List<GovernmentId> getUploadingIds$government_id_release() {
            return this.uploadingIds;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public List<IdConfig2> getParts$government_id_release() {
            return this.parts;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getBackState$government_id_release, reason: from getter */
        public GovernmentIdState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getPartIndex$government_id_release, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getCountryCode$government_id_release, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        public final String getError() {
            return this.error;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ShowInstructions(IdConfig2 currentPart, List<? extends GovernmentId> uploadingIds, List<? extends IdConfig2> parts, GovernmentIdState governmentIdState, int i, String str, IdConfig idConfig, String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(parts, "parts");
            this.currentPart = currentPart;
            this.uploadingIds = uploadingIds;
            this.parts = parts;
            this.backState = governmentIdState;
            this.partIndex = i;
            this.countryCode = str;
            this.selectedId = idConfig;
            this.error = str2;
        }
    }

    /* compiled from: GovernmentIdState.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ|\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ\u001a\u0010$\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010+R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b,\u0010+R\u001a\u0010\n\u001a\u00020\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u0010 R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\b5\u00106R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0011\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010/\u001a\u0004\b:\u0010 ¨\u0006;"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "currentPart", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "uploadingIds", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "parts", "", "partIndex", "", "countryCode", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "captureConfig", "", "choosingDocumentToUpload", "backState", "error", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;ZLcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;ZLcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "getCurrentPart$government_id_release", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "Ljava/util/List;", "getUploadingIds$government_id_release", "()Ljava/util/List;", "getParts$government_id_release", "I", "getPartIndex$government_id_release", "Ljava/lang/String;", "getCountryCode$government_id_release", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "getCaptureConfig", "()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "Z", "getChoosingDocumentToUpload", "()Z", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "getBackState$government_id_release", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "getError", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class ChooseCaptureMethod extends GovernmentIdState {
        public static final Parcelable.Creator<ChooseCaptureMethod> CREATOR = new Creator();
        private final GovernmentIdState backState;
        private final CaptureConfig captureConfig;
        private final boolean choosingDocumentToUpload;
        private final String countryCode;
        private final IdConfig2.SideIdPart currentPart;
        private final String error;
        private final int partIndex;
        private final List<IdConfig2> parts;
        private final List<GovernmentId> uploadingIds;

        /* compiled from: GovernmentIdState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ChooseCaptureMethod> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChooseCaptureMethod createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                IdConfig2.SideIdPart sideIdPartCreateFromParcel = IdConfig2.SideIdPart.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(ChooseCaptureMethod.class.getClassLoader()));
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readParcelable(ChooseCaptureMethod.class.getClassLoader()));
                }
                return new ChooseCaptureMethod(sideIdPartCreateFromParcel, arrayList, arrayList2, parcel.readInt(), parcel.readString(), (CaptureConfig) parcel.readParcelable(ChooseCaptureMethod.class.getClassLoader()), parcel.readInt() != 0, (GovernmentIdState) parcel.readParcelable(ChooseCaptureMethod.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChooseCaptureMethod[] newArray(int i) {
                return new ChooseCaptureMethod[i];
            }
        }

        public static /* synthetic */ ChooseCaptureMethod copy$default(ChooseCaptureMethod chooseCaptureMethod, IdConfig2.SideIdPart sideIdPart, List list, List list2, int i, String str, CaptureConfig captureConfig, boolean z, GovernmentIdState governmentIdState, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                sideIdPart = chooseCaptureMethod.currentPart;
            }
            if ((i2 & 2) != 0) {
                list = chooseCaptureMethod.uploadingIds;
            }
            if ((i2 & 4) != 0) {
                list2 = chooseCaptureMethod.parts;
            }
            if ((i2 & 8) != 0) {
                i = chooseCaptureMethod.partIndex;
            }
            if ((i2 & 16) != 0) {
                str = chooseCaptureMethod.countryCode;
            }
            if ((i2 & 32) != 0) {
                captureConfig = chooseCaptureMethod.captureConfig;
            }
            if ((i2 & 64) != 0) {
                z = chooseCaptureMethod.choosingDocumentToUpload;
            }
            if ((i2 & 128) != 0) {
                governmentIdState = chooseCaptureMethod.backState;
            }
            if ((i2 & 256) != 0) {
                str2 = chooseCaptureMethod.error;
            }
            GovernmentIdState governmentIdState2 = governmentIdState;
            String str3 = str2;
            CaptureConfig captureConfig2 = captureConfig;
            boolean z2 = z;
            String str4 = str;
            List list3 = list2;
            return chooseCaptureMethod.copy(sideIdPart, list, list3, i, str4, captureConfig2, z2, governmentIdState2, str3);
        }

        public final ChooseCaptureMethod copy(IdConfig2.SideIdPart currentPart, List<? extends GovernmentId> uploadingIds, List<? extends IdConfig2> parts, int partIndex, String countryCode, CaptureConfig captureConfig, boolean choosingDocumentToUpload, GovernmentIdState backState, String error) {
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
            return new ChooseCaptureMethod(currentPart, uploadingIds, parts, partIndex, countryCode, captureConfig, choosingDocumentToUpload, backState, error);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChooseCaptureMethod)) {
                return false;
            }
            ChooseCaptureMethod chooseCaptureMethod = (ChooseCaptureMethod) other;
            return Intrinsics.areEqual(this.currentPart, chooseCaptureMethod.currentPart) && Intrinsics.areEqual(this.uploadingIds, chooseCaptureMethod.uploadingIds) && Intrinsics.areEqual(this.parts, chooseCaptureMethod.parts) && this.partIndex == chooseCaptureMethod.partIndex && Intrinsics.areEqual(this.countryCode, chooseCaptureMethod.countryCode) && Intrinsics.areEqual(this.captureConfig, chooseCaptureMethod.captureConfig) && this.choosingDocumentToUpload == chooseCaptureMethod.choosingDocumentToUpload && Intrinsics.areEqual(this.backState, chooseCaptureMethod.backState) && Intrinsics.areEqual(this.error, chooseCaptureMethod.error);
        }

        public int hashCode() {
            int iHashCode = ((((((this.currentPart.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            String str = this.countryCode;
            int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.captureConfig.hashCode()) * 31) + Boolean.hashCode(this.choosingDocumentToUpload)) * 31;
            GovernmentIdState governmentIdState = this.backState;
            int iHashCode3 = (iHashCode2 + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31;
            String str2 = this.error;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "ChooseCaptureMethod(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", countryCode=" + this.countryCode + ", captureConfig=" + this.captureConfig + ", choosingDocumentToUpload=" + this.choosingDocumentToUpload + ", backState=" + this.backState + ", error=" + this.error + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.currentPart.writeToParcel(dest, flags);
            List<GovernmentId> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<GovernmentId> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            List<IdConfig2> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<IdConfig2> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeInt(this.partIndex);
            dest.writeString(this.countryCode);
            dest.writeParcelable(this.captureConfig, flags);
            dest.writeInt(this.choosingDocumentToUpload ? 1 : 0);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.error);
        }

        public /* synthetic */ ChooseCaptureMethod(IdConfig2.SideIdPart sideIdPart, List list, List list2, int i, String str, CaptureConfig captureConfig, boolean z, GovernmentIdState governmentIdState, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? new IdConfig2.SideIdPart(IdConfig.Side.Front) : sideIdPart, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list, list2, i, str, captureConfig, (i2 & 64) != 0 ? false : z, governmentIdState, (i2 & 256) != 0 ? null : str2);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getCurrentPart$government_id_release, reason: from getter */
        public IdConfig2.SideIdPart getCurrentPart() {
            return this.currentPart;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public List<GovernmentId> getUploadingIds$government_id_release() {
            return this.uploadingIds;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public List<IdConfig2> getParts$government_id_release() {
            return this.parts;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getPartIndex$government_id_release, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getCountryCode$government_id_release, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        public final CaptureConfig getCaptureConfig() {
            return this.captureConfig;
        }

        public final boolean getChoosingDocumentToUpload() {
            return this.choosingDocumentToUpload;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getBackState$government_id_release, reason: from getter */
        public GovernmentIdState getBackState() {
            return this.backState;
        }

        public final String getError() {
            return this.error;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ChooseCaptureMethod(IdConfig2.SideIdPart currentPart, List<? extends GovernmentId> uploadingIds, List<? extends IdConfig2> parts, int i, String str, CaptureConfig captureConfig, boolean z, GovernmentIdState governmentIdState, String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
            this.currentPart = currentPart;
            this.uploadingIds = uploadingIds;
            this.parts = parts;
            this.partIndex = i;
            this.countryCode = str;
            this.captureConfig = captureConfig;
            this.choosingDocumentToUpload = z;
            this.backState = governmentIdState;
            this.error = str2;
        }
    }

    /* compiled from: GovernmentIdState.kt */
    @Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B§\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u0018H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u0018H\u0016¢\u0006\u0004\b&\u0010%J\u001d\u0010*\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u000f¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u000f¢\u0006\u0004\b,\u0010-JÄ\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eHÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b2\u0010-J\u001a\u00105\u001a\u00020\u00182\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b5\u00106R\u001a\u0010\u0005\u001a\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u00109R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010@\u001a\u0004\bA\u0010BR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\bC\u0010<R\u001a\u0010\u0010\u001a\u00020\u000f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0010\u0010D\u001a\u0004\bE\u0010-R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0011\u0010F\u001a\u0004\bG\u0010HR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010I\u001a\u0004\bJ\u0010KR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010L\u001a\u0004\bM\u00101R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010N\u001a\u0004\bO\u0010PR\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010Q\u001a\u0004\bR\u0010SR\u001a\u0010\u001a\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010Q\u001a\u0004\bT\u0010SR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001b\u0010L\u001a\u0004\bU\u00101R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010V\u001a\u0004\bW\u0010XR#\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006¢\u0006\u0012\n\u0004\b \u0010Y\u0012\u0004\b\\\u0010]\u001a\u0004\bZ\u0010[¨\u0006^"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/CameraPermissionRequestState;", "Lcom/withpersona/sdk2/inquiry/governmentid/AudioPermissionRequestState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "currentPart", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "uploadingIds", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "captureConfig", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$CameraScreen$ManualCapture;", "manualCapture", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "parts", "", "partIndex", "backState", "Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/WebRtcState;", "webRtcState", "", "webRtcJwt", "", "error", "", "checkCameraPermissions", "checkAudioPermissions", "countryCode", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "hint", "Lkotlin/Function0;", "", "webRtcConnectionEstablished", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$CameraScreen$ManualCapture;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/WebRtcState;Ljava/lang/String;Ljava/lang/Throwable;ZZLjava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;Lkotlin/jvm/functions/Function0;)V", "newValue", "updateCheckCameraPermissions", "(Z)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "updateCheckAudioPermissions", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$CameraScreen$ManualCapture;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/WebRtcState;Ljava/lang/String;Ljava/lang/Throwable;ZZLjava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;Lkotlin/jvm/functions/Function0;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "getCurrentPart$government_id_release", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "Ljava/util/List;", "getUploadingIds$government_id_release", "()Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "getCaptureConfig", "()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$CameraScreen$ManualCapture;", "getManualCapture", "()Lcom/withpersona/sdk2/inquiry/governmentid/Screen$CameraScreen$ManualCapture;", "getParts$government_id_release", "I", "getPartIndex$government_id_release", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "getBackState$government_id_release", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/WebRtcState;", "getWebRtcState", "()Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/WebRtcState;", "Ljava/lang/String;", "getWebRtcJwt", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "Z", "getCheckCameraPermissions", "()Z", "getCheckAudioPermissions", "getCountryCode$government_id_release", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "getHint", "()Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "Lkotlin/jvm/functions/Function0;", "getWebRtcConnectionEstablished", "()Lkotlin/jvm/functions/Function0;", "getWebRtcConnectionEstablished$annotations", "()V", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class WaitForAutocapture extends GovernmentIdState implements GovernmentIdState4, GovernmentIdState2 {
        public static final Parcelable.Creator<WaitForAutocapture> CREATOR = new Creator();
        private final GovernmentIdState backState;
        private final CaptureConfig captureConfig;
        private final boolean checkAudioPermissions;
        private final boolean checkCameraPermissions;
        private final String countryCode;
        private final IdConfig2.SideIdPart currentPart;
        private final Throwable error;
        private final Hint hint;
        private final GovernmentIdScreen2.CameraScreen.ManualCapture manualCapture;
        private final int partIndex;
        private final List<IdConfig2> parts;
        private final List<GovernmentId> uploadingIds;
        private final Function0<Unit> webRtcConnectionEstablished;
        private final String webRtcJwt;
        private final WebRtcState webRtcState;

        /* compiled from: GovernmentIdState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<WaitForAutocapture> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WaitForAutocapture createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                IdConfig2.SideIdPart sideIdPartCreateFromParcel = IdConfig2.SideIdPart.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(WaitForAutocapture.class.getClassLoader()));
                }
                CaptureConfig captureConfig = (CaptureConfig) parcel.readParcelable(WaitForAutocapture.class.getClassLoader());
                GovernmentIdScreen2.CameraScreen.ManualCapture manualCaptureValueOf = GovernmentIdScreen2.CameraScreen.ManualCapture.valueOf(parcel.readString());
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readParcelable(WaitForAutocapture.class.getClassLoader()));
                }
                return new WaitForAutocapture(sideIdPartCreateFromParcel, arrayList, captureConfig, manualCaptureValueOf, arrayList2, parcel.readInt(), (GovernmentIdState) parcel.readParcelable(WaitForAutocapture.class.getClassLoader()), parcel.readInt() == 0 ? null : WebRtcState.valueOf(parcel.readString()), parcel.readString(), (Throwable) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), (Hint) parcel.readParcelable(WaitForAutocapture.class.getClassLoader()), null, 16384, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WaitForAutocapture[] newArray(int i) {
                return new WaitForAutocapture[i];
            }
        }

        public static /* synthetic */ WaitForAutocapture copy$default(WaitForAutocapture waitForAutocapture, IdConfig2.SideIdPart sideIdPart, List list, CaptureConfig captureConfig, GovernmentIdScreen2.CameraScreen.ManualCapture manualCapture, List list2, int i, GovernmentIdState governmentIdState, WebRtcState webRtcState, String str, Throwable th, boolean z, boolean z2, String str2, Hint hint, Function0 function0, int i2, Object obj) {
            return waitForAutocapture.copy((i2 & 1) != 0 ? waitForAutocapture.currentPart : sideIdPart, (i2 & 2) != 0 ? waitForAutocapture.uploadingIds : list, (i2 & 4) != 0 ? waitForAutocapture.captureConfig : captureConfig, (i2 & 8) != 0 ? waitForAutocapture.manualCapture : manualCapture, (i2 & 16) != 0 ? waitForAutocapture.parts : list2, (i2 & 32) != 0 ? waitForAutocapture.partIndex : i, (i2 & 64) != 0 ? waitForAutocapture.backState : governmentIdState, (i2 & 128) != 0 ? waitForAutocapture.webRtcState : webRtcState, (i2 & 256) != 0 ? waitForAutocapture.webRtcJwt : str, (i2 & 512) != 0 ? waitForAutocapture.error : th, (i2 & 1024) != 0 ? waitForAutocapture.checkCameraPermissions : z, (i2 & 2048) != 0 ? waitForAutocapture.checkAudioPermissions : z2, (i2 & 4096) != 0 ? waitForAutocapture.countryCode : str2, (i2 & 8192) != 0 ? waitForAutocapture.hint : hint, (i2 & 16384) != 0 ? waitForAutocapture.webRtcConnectionEstablished : function0);
        }

        public final WaitForAutocapture copy(IdConfig2.SideIdPart currentPart, List<? extends GovernmentId> uploadingIds, CaptureConfig captureConfig, GovernmentIdScreen2.CameraScreen.ManualCapture manualCapture, List<? extends IdConfig2> parts, int partIndex, GovernmentIdState backState, WebRtcState webRtcState, String webRtcJwt, Throwable error, boolean checkCameraPermissions, boolean checkAudioPermissions, String countryCode, Hint hint, Function0<Unit> webRtcConnectionEstablished) {
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
            Intrinsics.checkNotNullParameter(manualCapture, "manualCapture");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(webRtcConnectionEstablished, "webRtcConnectionEstablished");
            return new WaitForAutocapture(currentPart, uploadingIds, captureConfig, manualCapture, parts, partIndex, backState, webRtcState, webRtcJwt, error, checkCameraPermissions, checkAudioPermissions, countryCode, hint, webRtcConnectionEstablished);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WaitForAutocapture)) {
                return false;
            }
            WaitForAutocapture waitForAutocapture = (WaitForAutocapture) other;
            return Intrinsics.areEqual(this.currentPart, waitForAutocapture.currentPart) && Intrinsics.areEqual(this.uploadingIds, waitForAutocapture.uploadingIds) && Intrinsics.areEqual(this.captureConfig, waitForAutocapture.captureConfig) && this.manualCapture == waitForAutocapture.manualCapture && Intrinsics.areEqual(this.parts, waitForAutocapture.parts) && this.partIndex == waitForAutocapture.partIndex && Intrinsics.areEqual(this.backState, waitForAutocapture.backState) && this.webRtcState == waitForAutocapture.webRtcState && Intrinsics.areEqual(this.webRtcJwt, waitForAutocapture.webRtcJwt) && Intrinsics.areEqual(this.error, waitForAutocapture.error) && this.checkCameraPermissions == waitForAutocapture.checkCameraPermissions && this.checkAudioPermissions == waitForAutocapture.checkAudioPermissions && Intrinsics.areEqual(this.countryCode, waitForAutocapture.countryCode) && Intrinsics.areEqual(this.hint, waitForAutocapture.hint) && Intrinsics.areEqual(this.webRtcConnectionEstablished, waitForAutocapture.webRtcConnectionEstablished);
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.currentPart.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.captureConfig.hashCode()) * 31) + this.manualCapture.hashCode()) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            GovernmentIdState governmentIdState = this.backState;
            int iHashCode2 = (iHashCode + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31;
            WebRtcState webRtcState = this.webRtcState;
            int iHashCode3 = (iHashCode2 + (webRtcState == null ? 0 : webRtcState.hashCode())) * 31;
            String str = this.webRtcJwt;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            Throwable th = this.error;
            int iHashCode5 = (((((iHashCode4 + (th == null ? 0 : th.hashCode())) * 31) + Boolean.hashCode(this.checkCameraPermissions)) * 31) + Boolean.hashCode(this.checkAudioPermissions)) * 31;
            String str2 = this.countryCode;
            int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Hint hint = this.hint;
            return ((iHashCode6 + (hint != null ? hint.hashCode() : 0)) * 31) + this.webRtcConnectionEstablished.hashCode();
        }

        public String toString() {
            return "WaitForAutocapture(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", captureConfig=" + this.captureConfig + ", manualCapture=" + this.manualCapture + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", webRtcState=" + this.webRtcState + ", webRtcJwt=" + this.webRtcJwt + ", error=" + this.error + ", checkCameraPermissions=" + this.checkCameraPermissions + ", checkAudioPermissions=" + this.checkAudioPermissions + ", countryCode=" + this.countryCode + ", hint=" + this.hint + ", webRtcConnectionEstablished=" + this.webRtcConnectionEstablished + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.currentPart.writeToParcel(dest, flags);
            List<GovernmentId> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<GovernmentId> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeParcelable(this.captureConfig, flags);
            dest.writeString(this.manualCapture.name());
            List<IdConfig2> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<IdConfig2> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeInt(this.partIndex);
            dest.writeParcelable(this.backState, flags);
            WebRtcState webRtcState = this.webRtcState;
            if (webRtcState == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(webRtcState.name());
            }
            dest.writeString(this.webRtcJwt);
            dest.writeSerializable(this.error);
            dest.writeInt(this.checkCameraPermissions ? 1 : 0);
            dest.writeInt(this.checkAudioPermissions ? 1 : 0);
            dest.writeString(this.countryCode);
            dest.writeParcelable(this.hint, flags);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getCurrentPart$government_id_release, reason: from getter */
        public IdConfig2.SideIdPart getCurrentPart() {
            return this.currentPart;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public List<GovernmentId> getUploadingIds$government_id_release() {
            return this.uploadingIds;
        }

        public final CaptureConfig getCaptureConfig() {
            return this.captureConfig;
        }

        public final GovernmentIdScreen2.CameraScreen.ManualCapture getManualCapture() {
            return this.manualCapture;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public List<IdConfig2> getParts$government_id_release() {
            return this.parts;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getPartIndex$government_id_release, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getBackState$government_id_release, reason: from getter */
        public GovernmentIdState getBackState() {
            return this.backState;
        }

        public final WebRtcState getWebRtcState() {
            return this.webRtcState;
        }

        public final String getWebRtcJwt() {
            return this.webRtcJwt;
        }

        public final Throwable getError() {
            return this.error;
        }

        public boolean getCheckCameraPermissions() {
            return this.checkCameraPermissions;
        }

        public boolean getCheckAudioPermissions() {
            return this.checkAudioPermissions;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getCountryCode$government_id_release, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        public final Hint getHint() {
            return this.hint;
        }

        public /* synthetic */ WaitForAutocapture(IdConfig2.SideIdPart sideIdPart, List list, CaptureConfig captureConfig, GovernmentIdScreen2.CameraScreen.ManualCapture manualCapture, List list2, int i, GovernmentIdState governmentIdState, WebRtcState webRtcState, String str, Throwable th, boolean z, boolean z2, String str2, Hint hint, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(sideIdPart, list, captureConfig, manualCapture, list2, i, governmentIdState, webRtcState, str, (i2 & 512) != 0 ? null : th, (i2 & 1024) != 0 ? true : z, (i2 & 2048) != 0 ? true : z2, str2, (i2 & 8192) != 0 ? null : hint, (i2 & 16384) != 0 ? new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$WaitForAutocapture$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            } : function0);
        }

        public final Function0<Unit> getWebRtcConnectionEstablished() {
            return this.webRtcConnectionEstablished;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public WaitForAutocapture(IdConfig2.SideIdPart currentPart, List<? extends GovernmentId> uploadingIds, CaptureConfig captureConfig, GovernmentIdScreen2.CameraScreen.ManualCapture manualCapture, List<? extends IdConfig2> parts, int i, GovernmentIdState governmentIdState, WebRtcState webRtcState, String str, Throwable th, boolean z, boolean z2, String str2, Hint hint, Function0<Unit> webRtcConnectionEstablished) {
            super(null);
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
            Intrinsics.checkNotNullParameter(manualCapture, "manualCapture");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(webRtcConnectionEstablished, "webRtcConnectionEstablished");
            this.currentPart = currentPart;
            this.uploadingIds = uploadingIds;
            this.captureConfig = captureConfig;
            this.manualCapture = manualCapture;
            this.parts = parts;
            this.partIndex = i;
            this.backState = governmentIdState;
            this.webRtcState = webRtcState;
            this.webRtcJwt = str;
            this.error = th;
            this.checkCameraPermissions = z;
            this.checkAudioPermissions = z2;
            this.countryCode = str2;
            this.hint = hint;
            this.webRtcConnectionEstablished = webRtcConnectionEstablished;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState4
        public GovernmentIdState updateCheckCameraPermissions(boolean newValue) {
            return copy$default(this, null, null, null, null, null, 0, null, null, null, null, newValue, false, null, null, null, 31743, null);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState2
        public GovernmentIdState updateCheckAudioPermissions(boolean newValue) {
            return copy$default(this, null, null, null, null, null, 0, null, null, null, null, false, newValue, null, null, null, 30719, null);
        }
    }

    /* compiled from: GovernmentIdState.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001fJ|\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010,R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u00102R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u00105R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b6\u0010/R\u001a\u0010\u000e\u001a\u00020\r8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\b8\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b:\u0010;R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\b=\u0010#R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010>\u001a\u0004\b?\u0010@¨\u0006A"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "currentPart", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "uploadingIds", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "captureConfig", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "idForReview", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "parts", "", "partIndex", "backState", "", "countryCode", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "hint", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;)V", "", "deleteAllIds", "()V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "getCurrentPart$government_id_release", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "Ljava/util/List;", "getUploadingIds$government_id_release", "()Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "getCaptureConfig", "()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "getIdForReview", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "getParts$government_id_release", "I", "getPartIndex$government_id_release", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "getBackState$government_id_release", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Ljava/lang/String;", "getCountryCode$government_id_release", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "getHint", "()Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class CountdownToCapture extends GovernmentIdState {
        public static final Parcelable.Creator<CountdownToCapture> CREATOR = new Creator();
        private final GovernmentIdState backState;
        private final CaptureConfig captureConfig;
        private final String countryCode;
        private final IdConfig2.SideIdPart currentPart;
        private final Hint hint;
        private final GovernmentId.GovernmentIdImage idForReview;
        private final int partIndex;
        private final List<IdConfig2> parts;
        private final List<GovernmentId> uploadingIds;

        /* compiled from: GovernmentIdState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<CountdownToCapture> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CountdownToCapture createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                IdConfig2.SideIdPart sideIdPartCreateFromParcel = IdConfig2.SideIdPart.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(CountdownToCapture.class.getClassLoader()));
                }
                CaptureConfig captureConfig = (CaptureConfig) parcel.readParcelable(CountdownToCapture.class.getClassLoader());
                GovernmentId.GovernmentIdImage governmentIdImageCreateFromParcel = GovernmentId.GovernmentIdImage.CREATOR.createFromParcel(parcel);
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readParcelable(CountdownToCapture.class.getClassLoader()));
                }
                return new CountdownToCapture(sideIdPartCreateFromParcel, arrayList, captureConfig, governmentIdImageCreateFromParcel, arrayList2, parcel.readInt(), (GovernmentIdState) parcel.readParcelable(CountdownToCapture.class.getClassLoader()), parcel.readString(), (Hint) parcel.readParcelable(CountdownToCapture.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CountdownToCapture[] newArray(int i) {
                return new CountdownToCapture[i];
            }
        }

        public static /* synthetic */ CountdownToCapture copy$default(CountdownToCapture countdownToCapture, IdConfig2.SideIdPart sideIdPart, List list, CaptureConfig captureConfig, GovernmentId.GovernmentIdImage governmentIdImage, List list2, int i, GovernmentIdState governmentIdState, String str, Hint hint, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                sideIdPart = countdownToCapture.currentPart;
            }
            if ((i2 & 2) != 0) {
                list = countdownToCapture.uploadingIds;
            }
            if ((i2 & 4) != 0) {
                captureConfig = countdownToCapture.captureConfig;
            }
            if ((i2 & 8) != 0) {
                governmentIdImage = countdownToCapture.idForReview;
            }
            if ((i2 & 16) != 0) {
                list2 = countdownToCapture.parts;
            }
            if ((i2 & 32) != 0) {
                i = countdownToCapture.partIndex;
            }
            if ((i2 & 64) != 0) {
                governmentIdState = countdownToCapture.backState;
            }
            if ((i2 & 128) != 0) {
                str = countdownToCapture.countryCode;
            }
            if ((i2 & 256) != 0) {
                hint = countdownToCapture.hint;
            }
            String str2 = str;
            Hint hint2 = hint;
            int i3 = i;
            GovernmentIdState governmentIdState2 = governmentIdState;
            List list3 = list2;
            CaptureConfig captureConfig2 = captureConfig;
            return countdownToCapture.copy(sideIdPart, list, captureConfig2, governmentIdImage, list3, i3, governmentIdState2, str2, hint2);
        }

        public final CountdownToCapture copy(IdConfig2.SideIdPart currentPart, List<? extends GovernmentId> uploadingIds, CaptureConfig captureConfig, GovernmentId.GovernmentIdImage idForReview, List<? extends IdConfig2> parts, int partIndex, GovernmentIdState backState, String countryCode, Hint hint) {
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
            Intrinsics.checkNotNullParameter(idForReview, "idForReview");
            Intrinsics.checkNotNullParameter(parts, "parts");
            return new CountdownToCapture(currentPart, uploadingIds, captureConfig, idForReview, parts, partIndex, backState, countryCode, hint);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CountdownToCapture)) {
                return false;
            }
            CountdownToCapture countdownToCapture = (CountdownToCapture) other;
            return Intrinsics.areEqual(this.currentPart, countdownToCapture.currentPart) && Intrinsics.areEqual(this.uploadingIds, countdownToCapture.uploadingIds) && Intrinsics.areEqual(this.captureConfig, countdownToCapture.captureConfig) && Intrinsics.areEqual(this.idForReview, countdownToCapture.idForReview) && Intrinsics.areEqual(this.parts, countdownToCapture.parts) && this.partIndex == countdownToCapture.partIndex && Intrinsics.areEqual(this.backState, countdownToCapture.backState) && Intrinsics.areEqual(this.countryCode, countdownToCapture.countryCode) && Intrinsics.areEqual(this.hint, countdownToCapture.hint);
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.currentPart.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.captureConfig.hashCode()) * 31) + this.idForReview.hashCode()) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            GovernmentIdState governmentIdState = this.backState;
            int iHashCode2 = (iHashCode + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31;
            String str = this.countryCode;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Hint hint = this.hint;
            return iHashCode3 + (hint != null ? hint.hashCode() : 0);
        }

        public String toString() {
            return "CountdownToCapture(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", captureConfig=" + this.captureConfig + ", idForReview=" + this.idForReview + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", countryCode=" + this.countryCode + ", hint=" + this.hint + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.currentPart.writeToParcel(dest, flags);
            List<GovernmentId> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<GovernmentId> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeParcelable(this.captureConfig, flags);
            this.idForReview.writeToParcel(dest, flags);
            List<IdConfig2> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<IdConfig2> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeInt(this.partIndex);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.countryCode);
            dest.writeParcelable(this.hint, flags);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getCurrentPart$government_id_release, reason: from getter */
        public IdConfig2.SideIdPart getCurrentPart() {
            return this.currentPart;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public List<GovernmentId> getUploadingIds$government_id_release() {
            return this.uploadingIds;
        }

        public final CaptureConfig getCaptureConfig() {
            return this.captureConfig;
        }

        public final GovernmentId.GovernmentIdImage getIdForReview() {
            return this.idForReview;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public List<IdConfig2> getParts$government_id_release() {
            return this.parts;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getPartIndex$government_id_release, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getBackState$government_id_release, reason: from getter */
        public GovernmentIdState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getCountryCode$government_id_release, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        public final Hint getHint() {
            return this.hint;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CountdownToCapture(IdConfig2.SideIdPart currentPart, List<? extends GovernmentId> uploadingIds, CaptureConfig captureConfig, GovernmentId.GovernmentIdImage idForReview, List<? extends IdConfig2> parts, int i, GovernmentIdState governmentIdState, String str, Hint hint) {
            super(null);
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
            Intrinsics.checkNotNullParameter(idForReview, "idForReview");
            Intrinsics.checkNotNullParameter(parts, "parts");
            this.currentPart = currentPart;
            this.uploadingIds = uploadingIds;
            this.captureConfig = captureConfig;
            this.idForReview = idForReview;
            this.parts = parts;
            this.partIndex = i;
            this.backState = governmentIdState;
            this.countryCode = str;
            this.hint = hint;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public void deleteAllIds() {
            super.deleteAllIds();
            Iterator<T> it = this.idForReview.getFrames().iterator();
            while (it.hasNext()) {
                new File(((Frame) it.next()).getAbsoluteFilePath()).delete();
            }
        }
    }

    /* compiled from: GovernmentIdState.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8 X \u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0001\u0002\u0018\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "<init>", "()V", "", "newValue", "updateSubmittingForAutoClassification", "(Z)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "getCurrentPart$government_id_release", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "currentPart", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "getCaptureConfig", "()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "captureConfig", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "getIdForReview", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "idForReview", "Lcom/withpersona/sdk2/camera/CameraProperties;", "getCameraProperties", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static abstract class ReviewImageState extends GovernmentIdState {
        public /* synthetic */ ReviewImageState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract CameraProperties getCameraProperties();

        public abstract CaptureConfig getCaptureConfig();

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getCurrentPart$government_id_release */
        public abstract IdConfig2.SideIdPart getCurrentPart();

        public abstract GovernmentId getIdForReview();

        public abstract ReviewImageState updateSubmittingForAutoClassification(boolean newValue);

        private ReviewImageState() {
            super(null);
        }
    }

    /* compiled from: GovernmentIdState.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\"\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\f¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\f¢\u0006\u0004\b$\u0010%J\u0090\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b*\u0010%J\u001a\u0010-\u001a\u00020\u00142\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u00101R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u00104R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u00107R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b9\u0010:R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b;\u00104R\u001a\u0010\r\u001a\u00020\f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\b=\u0010%R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010D\u001a\u0004\bE\u0010)R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010F\u001a\u0004\bG\u0010HR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0016\u0010D\u001a\u0004\bI\u0010)¨\u0006J"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "currentPart", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "uploadingIds", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "captureConfig", "idForReview", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "parts", "", "partIndex", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "backState", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "error", "", "submittingForAutoClassification", "countryCode", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/lang/String;ZLjava/lang/String;)V", "newValue", "updateSubmittingForAutoClassification", "(Z)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;", "", "deleteAllIds", "()V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/lang/String;ZLjava/lang/String;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "getCurrentPart$government_id_release", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "Ljava/util/List;", "getUploadingIds$government_id_release", "()Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "getCaptureConfig", "()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "getIdForReview", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "getParts$government_id_release", "I", "getPartIndex$government_id_release", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "getBackState$government_id_release", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/camera/CameraProperties;", "getCameraProperties", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "Ljava/lang/String;", "getError", "Z", "getSubmittingForAutoClassification", "()Z", "getCountryCode$government_id_release", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class ReviewCapturedImage extends ReviewImageState {
        public static final Parcelable.Creator<ReviewCapturedImage> CREATOR = new Creator();
        private final GovernmentIdState backState;
        private final CameraProperties cameraProperties;
        private final CaptureConfig captureConfig;
        private final String countryCode;
        private final IdConfig2.SideIdPart currentPart;
        private final String error;
        private final GovernmentId idForReview;
        private final int partIndex;
        private final List<IdConfig2> parts;
        private final boolean submittingForAutoClassification;
        private final List<GovernmentId> uploadingIds;

        /* compiled from: GovernmentIdState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ReviewCapturedImage> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ReviewCapturedImage createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                IdConfig2.SideIdPart sideIdPartCreateFromParcel = IdConfig2.SideIdPart.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(ReviewCapturedImage.class.getClassLoader()));
                }
                CaptureConfig captureConfig = (CaptureConfig) parcel.readParcelable(ReviewCapturedImage.class.getClassLoader());
                GovernmentId governmentId = (GovernmentId) parcel.readParcelable(ReviewCapturedImage.class.getClassLoader());
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readParcelable(ReviewCapturedImage.class.getClassLoader()));
                }
                return new ReviewCapturedImage(sideIdPartCreateFromParcel, arrayList, captureConfig, governmentId, arrayList2, parcel.readInt(), (GovernmentIdState) parcel.readParcelable(ReviewCapturedImage.class.getClassLoader()), (CameraProperties) parcel.readParcelable(ReviewCapturedImage.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ReviewCapturedImage[] newArray(int i) {
                return new ReviewCapturedImage[i];
            }
        }

        public static /* synthetic */ ReviewCapturedImage copy$default(ReviewCapturedImage reviewCapturedImage, IdConfig2.SideIdPart sideIdPart, List list, CaptureConfig captureConfig, GovernmentId governmentId, List list2, int i, GovernmentIdState governmentIdState, CameraProperties cameraProperties, String str, boolean z, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                sideIdPart = reviewCapturedImage.currentPart;
            }
            if ((i2 & 2) != 0) {
                list = reviewCapturedImage.uploadingIds;
            }
            if ((i2 & 4) != 0) {
                captureConfig = reviewCapturedImage.captureConfig;
            }
            if ((i2 & 8) != 0) {
                governmentId = reviewCapturedImage.idForReview;
            }
            if ((i2 & 16) != 0) {
                list2 = reviewCapturedImage.parts;
            }
            if ((i2 & 32) != 0) {
                i = reviewCapturedImage.partIndex;
            }
            if ((i2 & 64) != 0) {
                governmentIdState = reviewCapturedImage.backState;
            }
            if ((i2 & 128) != 0) {
                cameraProperties = reviewCapturedImage.cameraProperties;
            }
            if ((i2 & 256) != 0) {
                str = reviewCapturedImage.error;
            }
            if ((i2 & 512) != 0) {
                z = reviewCapturedImage.submittingForAutoClassification;
            }
            if ((i2 & 1024) != 0) {
                str2 = reviewCapturedImage.countryCode;
            }
            boolean z2 = z;
            String str3 = str2;
            CameraProperties cameraProperties2 = cameraProperties;
            String str4 = str;
            int i3 = i;
            GovernmentIdState governmentIdState2 = governmentIdState;
            List list3 = list2;
            CaptureConfig captureConfig2 = captureConfig;
            return reviewCapturedImage.copy(sideIdPart, list, captureConfig2, governmentId, list3, i3, governmentIdState2, cameraProperties2, str4, z2, str3);
        }

        public final ReviewCapturedImage copy(IdConfig2.SideIdPart currentPart, List<? extends GovernmentId> uploadingIds, CaptureConfig captureConfig, GovernmentId idForReview, List<? extends IdConfig2> parts, int partIndex, GovernmentIdState backState, CameraProperties cameraProperties, String error, boolean submittingForAutoClassification, String countryCode) {
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
            Intrinsics.checkNotNullParameter(idForReview, "idForReview");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            return new ReviewCapturedImage(currentPart, uploadingIds, captureConfig, idForReview, parts, partIndex, backState, cameraProperties, error, submittingForAutoClassification, countryCode);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReviewCapturedImage)) {
                return false;
            }
            ReviewCapturedImage reviewCapturedImage = (ReviewCapturedImage) other;
            return Intrinsics.areEqual(this.currentPart, reviewCapturedImage.currentPart) && Intrinsics.areEqual(this.uploadingIds, reviewCapturedImage.uploadingIds) && Intrinsics.areEqual(this.captureConfig, reviewCapturedImage.captureConfig) && Intrinsics.areEqual(this.idForReview, reviewCapturedImage.idForReview) && Intrinsics.areEqual(this.parts, reviewCapturedImage.parts) && this.partIndex == reviewCapturedImage.partIndex && Intrinsics.areEqual(this.backState, reviewCapturedImage.backState) && Intrinsics.areEqual(this.cameraProperties, reviewCapturedImage.cameraProperties) && Intrinsics.areEqual(this.error, reviewCapturedImage.error) && this.submittingForAutoClassification == reviewCapturedImage.submittingForAutoClassification && Intrinsics.areEqual(this.countryCode, reviewCapturedImage.countryCode);
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.currentPart.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.captureConfig.hashCode()) * 31) + this.idForReview.hashCode()) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            GovernmentIdState governmentIdState = this.backState;
            int iHashCode2 = (((iHashCode + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31) + this.cameraProperties.hashCode()) * 31;
            String str = this.error;
            int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.submittingForAutoClassification)) * 31;
            String str2 = this.countryCode;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "ReviewCapturedImage(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", captureConfig=" + this.captureConfig + ", idForReview=" + this.idForReview + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", cameraProperties=" + this.cameraProperties + ", error=" + this.error + ", submittingForAutoClassification=" + this.submittingForAutoClassification + ", countryCode=" + this.countryCode + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.currentPart.writeToParcel(dest, flags);
            List<GovernmentId> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<GovernmentId> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeParcelable(this.captureConfig, flags);
            dest.writeParcelable(this.idForReview, flags);
            List<IdConfig2> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<IdConfig2> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeInt(this.partIndex);
            dest.writeParcelable(this.backState, flags);
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeString(this.error);
            dest.writeInt(this.submittingForAutoClassification ? 1 : 0);
            dest.writeString(this.countryCode);
        }

        public /* synthetic */ ReviewCapturedImage(IdConfig2.SideIdPart sideIdPart, List list, CaptureConfig captureConfig, GovernmentId governmentId, List list2, int i, GovernmentIdState governmentIdState, CameraProperties cameraProperties, String str, boolean z, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(sideIdPart, list, captureConfig, governmentId, list2, i, governmentIdState, cameraProperties, (i2 & 256) != 0 ? null : str, (i2 & 512) != 0 ? false : z, str2);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getCurrentPart$government_id_release, reason: from getter */
        public IdConfig2.SideIdPart getCurrentPart() {
            return this.currentPart;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public List<GovernmentId> getUploadingIds$government_id_release() {
            return this.uploadingIds;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState.ReviewImageState
        public CaptureConfig getCaptureConfig() {
            return this.captureConfig;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState.ReviewImageState
        public GovernmentId getIdForReview() {
            return this.idForReview;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public List<IdConfig2> getParts$government_id_release() {
            return this.parts;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getPartIndex$government_id_release, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getBackState$government_id_release, reason: from getter */
        public GovernmentIdState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState.ReviewImageState
        public CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        public final String getError() {
            return this.error;
        }

        public boolean getSubmittingForAutoClassification() {
            return this.submittingForAutoClassification;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getCountryCode$government_id_release, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ReviewCapturedImage(IdConfig2.SideIdPart currentPart, List<? extends GovernmentId> uploadingIds, CaptureConfig captureConfig, GovernmentId idForReview, List<? extends IdConfig2> parts, int i, GovernmentIdState governmentIdState, CameraProperties cameraProperties, String str, boolean z, String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
            Intrinsics.checkNotNullParameter(idForReview, "idForReview");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            this.currentPart = currentPart;
            this.uploadingIds = uploadingIds;
            this.captureConfig = captureConfig;
            this.idForReview = idForReview;
            this.parts = parts;
            this.partIndex = i;
            this.backState = governmentIdState;
            this.cameraProperties = cameraProperties;
            this.error = str;
            this.submittingForAutoClassification = z;
            this.countryCode = str2;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState.ReviewImageState
        public ReviewImageState updateSubmittingForAutoClassification(boolean newValue) {
            return copy$default(this, null, null, null, null, null, 0, null, null, null, newValue, null, 1535, null);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public void deleteAllIds() {
            super.deleteAllIds();
            Iterator<T> it = getIdForReview().getFrames().iterator();
            while (it.hasNext()) {
                new File(((Frame) it.next()).getAbsoluteFilePath()).delete();
            }
        }
    }

    /* compiled from: GovernmentIdState.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010#\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u000e¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u000e¢\u0006\u0004\b%\u0010&J\u009c\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b+\u0010&J\u001a\u0010.\u001a\u00020\u00152\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u00102R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u00105R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b7\u00108R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010*R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b>\u00105R\u001a\u0010\u000f\u001a\u00020\u000e8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\b@\u0010&R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0011\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010<\u001a\u0004\bG\u0010*R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010H\u001a\u0004\bI\u0010JR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0017\u0010<\u001a\u0004\bK\u0010*¨\u0006L"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "currentPart", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "uploadingIds", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "captureConfig", "idForReview", "", "fileName", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "parts", "", "partIndex", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "backState", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "error", "", "submittingForAutoClassification", "countryCode", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Ljava/lang/String;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/lang/String;ZLjava/lang/String;)V", "newValue", "updateSubmittingForAutoClassification", "(Z)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;", "", "deleteAllIds", "()V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Ljava/lang/String;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/lang/String;ZLjava/lang/String;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "getCurrentPart$government_id_release", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "Ljava/util/List;", "getUploadingIds$government_id_release", "()Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "getCaptureConfig", "()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "getIdForReview", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "Ljava/lang/String;", "getFileName", "getParts$government_id_release", "I", "getPartIndex$government_id_release", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "getBackState$government_id_release", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/camera/CameraProperties;", "getCameraProperties", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "getError", "Z", "getSubmittingForAutoClassification", "()Z", "getCountryCode$government_id_release", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class ReviewSelectedImage extends ReviewImageState {
        public static final Parcelable.Creator<ReviewSelectedImage> CREATOR = new Creator();
        private final GovernmentIdState backState;
        private final CameraProperties cameraProperties;
        private final CaptureConfig captureConfig;
        private final String countryCode;
        private final IdConfig2.SideIdPart currentPart;
        private final String error;
        private final String fileName;
        private final GovernmentId idForReview;
        private final int partIndex;
        private final List<IdConfig2> parts;
        private final boolean submittingForAutoClassification;
        private final List<GovernmentId> uploadingIds;

        /* compiled from: GovernmentIdState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ReviewSelectedImage> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ReviewSelectedImage createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                IdConfig2.SideIdPart sideIdPartCreateFromParcel = IdConfig2.SideIdPart.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(ReviewSelectedImage.class.getClassLoader()));
                }
                CaptureConfig captureConfig = (CaptureConfig) parcel.readParcelable(ReviewSelectedImage.class.getClassLoader());
                GovernmentId governmentId = (GovernmentId) parcel.readParcelable(ReviewSelectedImage.class.getClassLoader());
                String string2 = parcel.readString();
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readParcelable(ReviewSelectedImage.class.getClassLoader()));
                }
                return new ReviewSelectedImage(sideIdPartCreateFromParcel, arrayList, captureConfig, governmentId, string2, arrayList2, parcel.readInt(), (GovernmentIdState) parcel.readParcelable(ReviewSelectedImage.class.getClassLoader()), (CameraProperties) parcel.readParcelable(ReviewSelectedImage.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ReviewSelectedImage[] newArray(int i) {
                return new ReviewSelectedImage[i];
            }
        }

        public static /* synthetic */ ReviewSelectedImage copy$default(ReviewSelectedImage reviewSelectedImage, IdConfig2.SideIdPart sideIdPart, List list, CaptureConfig captureConfig, GovernmentId governmentId, String str, List list2, int i, GovernmentIdState governmentIdState, CameraProperties cameraProperties, String str2, boolean z, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                sideIdPart = reviewSelectedImage.currentPart;
            }
            if ((i2 & 2) != 0) {
                list = reviewSelectedImage.uploadingIds;
            }
            if ((i2 & 4) != 0) {
                captureConfig = reviewSelectedImage.captureConfig;
            }
            if ((i2 & 8) != 0) {
                governmentId = reviewSelectedImage.idForReview;
            }
            if ((i2 & 16) != 0) {
                str = reviewSelectedImage.fileName;
            }
            if ((i2 & 32) != 0) {
                list2 = reviewSelectedImage.parts;
            }
            if ((i2 & 64) != 0) {
                i = reviewSelectedImage.partIndex;
            }
            if ((i2 & 128) != 0) {
                governmentIdState = reviewSelectedImage.backState;
            }
            if ((i2 & 256) != 0) {
                cameraProperties = reviewSelectedImage.cameraProperties;
            }
            if ((i2 & 512) != 0) {
                str2 = reviewSelectedImage.error;
            }
            if ((i2 & 1024) != 0) {
                z = reviewSelectedImage.submittingForAutoClassification;
            }
            if ((i2 & 2048) != 0) {
                str3 = reviewSelectedImage.countryCode;
            }
            boolean z2 = z;
            String str4 = str3;
            CameraProperties cameraProperties2 = cameraProperties;
            String str5 = str2;
            int i3 = i;
            GovernmentIdState governmentIdState2 = governmentIdState;
            String str6 = str;
            List list3 = list2;
            return reviewSelectedImage.copy(sideIdPart, list, captureConfig, governmentId, str6, list3, i3, governmentIdState2, cameraProperties2, str5, z2, str4);
        }

        public final ReviewSelectedImage copy(IdConfig2.SideIdPart currentPart, List<? extends GovernmentId> uploadingIds, CaptureConfig captureConfig, GovernmentId idForReview, String fileName, List<? extends IdConfig2> parts, int partIndex, GovernmentIdState backState, CameraProperties cameraProperties, String error, boolean submittingForAutoClassification, String countryCode) {
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
            Intrinsics.checkNotNullParameter(idForReview, "idForReview");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            return new ReviewSelectedImage(currentPart, uploadingIds, captureConfig, idForReview, fileName, parts, partIndex, backState, cameraProperties, error, submittingForAutoClassification, countryCode);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReviewSelectedImage)) {
                return false;
            }
            ReviewSelectedImage reviewSelectedImage = (ReviewSelectedImage) other;
            return Intrinsics.areEqual(this.currentPart, reviewSelectedImage.currentPart) && Intrinsics.areEqual(this.uploadingIds, reviewSelectedImage.uploadingIds) && Intrinsics.areEqual(this.captureConfig, reviewSelectedImage.captureConfig) && Intrinsics.areEqual(this.idForReview, reviewSelectedImage.idForReview) && Intrinsics.areEqual(this.fileName, reviewSelectedImage.fileName) && Intrinsics.areEqual(this.parts, reviewSelectedImage.parts) && this.partIndex == reviewSelectedImage.partIndex && Intrinsics.areEqual(this.backState, reviewSelectedImage.backState) && Intrinsics.areEqual(this.cameraProperties, reviewSelectedImage.cameraProperties) && Intrinsics.areEqual(this.error, reviewSelectedImage.error) && this.submittingForAutoClassification == reviewSelectedImage.submittingForAutoClassification && Intrinsics.areEqual(this.countryCode, reviewSelectedImage.countryCode);
        }

        public int hashCode() {
            int iHashCode = ((((((this.currentPart.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.captureConfig.hashCode()) * 31) + this.idForReview.hashCode()) * 31;
            String str = this.fileName;
            int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            GovernmentIdState governmentIdState = this.backState;
            int iHashCode3 = (((iHashCode2 + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31) + this.cameraProperties.hashCode()) * 31;
            String str2 = this.error;
            int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.submittingForAutoClassification)) * 31;
            String str3 = this.countryCode;
            return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "ReviewSelectedImage(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", captureConfig=" + this.captureConfig + ", idForReview=" + this.idForReview + ", fileName=" + this.fileName + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", cameraProperties=" + this.cameraProperties + ", error=" + this.error + ", submittingForAutoClassification=" + this.submittingForAutoClassification + ", countryCode=" + this.countryCode + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.currentPart.writeToParcel(dest, flags);
            List<GovernmentId> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<GovernmentId> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeParcelable(this.captureConfig, flags);
            dest.writeParcelable(this.idForReview, flags);
            dest.writeString(this.fileName);
            List<IdConfig2> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<IdConfig2> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeInt(this.partIndex);
            dest.writeParcelable(this.backState, flags);
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeString(this.error);
            dest.writeInt(this.submittingForAutoClassification ? 1 : 0);
            dest.writeString(this.countryCode);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getCurrentPart$government_id_release, reason: from getter */
        public IdConfig2.SideIdPart getCurrentPart() {
            return this.currentPart;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public List<GovernmentId> getUploadingIds$government_id_release() {
            return this.uploadingIds;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState.ReviewImageState
        public CaptureConfig getCaptureConfig() {
            return this.captureConfig;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState.ReviewImageState
        public GovernmentId getIdForReview() {
            return this.idForReview;
        }

        public final String getFileName() {
            return this.fileName;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public List<IdConfig2> getParts$government_id_release() {
            return this.parts;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getPartIndex$government_id_release, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getBackState$government_id_release, reason: from getter */
        public GovernmentIdState getBackState() {
            return this.backState;
        }

        public /* synthetic */ ReviewSelectedImage(IdConfig2.SideIdPart sideIdPart, List list, CaptureConfig captureConfig, GovernmentId governmentId, String str, List list2, int i, GovernmentIdState governmentIdState, CameraProperties cameraProperties, String str2, boolean z, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(sideIdPart, list, captureConfig, governmentId, str, list2, i, governmentIdState, (i2 & 256) != 0 ? new CameraProperties(null, null, null, 0, 15, null) : cameraProperties, (i2 & 512) != 0 ? null : str2, (i2 & 1024) != 0 ? false : z, str3);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState.ReviewImageState
        public CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        public final String getError() {
            return this.error;
        }

        public boolean getSubmittingForAutoClassification() {
            return this.submittingForAutoClassification;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getCountryCode$government_id_release, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ReviewSelectedImage(IdConfig2.SideIdPart currentPart, List<? extends GovernmentId> uploadingIds, CaptureConfig captureConfig, GovernmentId idForReview, String str, List<? extends IdConfig2> parts, int i, GovernmentIdState governmentIdState, CameraProperties cameraProperties, String str2, boolean z, String str3) {
            super(null);
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
            Intrinsics.checkNotNullParameter(idForReview, "idForReview");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            this.currentPart = currentPart;
            this.uploadingIds = uploadingIds;
            this.captureConfig = captureConfig;
            this.idForReview = idForReview;
            this.fileName = str;
            this.parts = parts;
            this.partIndex = i;
            this.backState = governmentIdState;
            this.cameraProperties = cameraProperties;
            this.error = str2;
            this.submittingForAutoClassification = z;
            this.countryCode = str3;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState.ReviewImageState
        public ReviewImageState updateSubmittingForAutoClassification(boolean newValue) {
            return copy$default(this, null, null, null, null, null, null, 0, null, null, null, newValue, null, 3071, null);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public void deleteAllIds() {
            super.deleteAllIds();
            Iterator<T> it = getIdForReview().getFrames().iterator();
            while (it.hasNext()) {
                new File(((Frame) it.next()).getAbsoluteFilePath()).delete();
            }
        }
    }

    /* compiled from: GovernmentIdState.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u0086\u0001\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u001a\u0010&\u001a\u00020\u00132\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010*R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\b\u001a\u00020\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u00100R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b1\u0010-R\u001a\u0010\u000b\u001a\u00020\n8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010\u001eR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b5\u00106R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\b8\u0010\"R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010?\u001a\u0004\b\u0014\u0010@¨\u0006A"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "id", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "uploadingIds", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "currentPart", "parts", "", "partIndex", "backState", "", "countryCode", "Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;", "governmentIdRequestArguments", "", "minDurationMs", "", "isDelayComplete", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;JZ)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;JZ)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "getId", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "Ljava/util/List;", "getUploadingIds$government_id_release", "()Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "getCurrentPart$government_id_release", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "getParts$government_id_release", "I", "getPartIndex$government_id_release", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "getBackState$government_id_release", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Ljava/lang/String;", "getCountryCode$government_id_release", "Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;", "getGovernmentIdRequestArguments", "()Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;", "J", "getMinDurationMs", "()J", "Z", "()Z", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class FinalizeLocalVideoCapture extends GovernmentIdState {
        public static final Parcelable.Creator<FinalizeLocalVideoCapture> CREATOR = new Creator();
        private final GovernmentIdState backState;
        private final String countryCode;
        private final IdConfig2 currentPart;
        private final GovernmentIdRequestArguments governmentIdRequestArguments;
        private final IdConfig id;
        private final boolean isDelayComplete;
        private final long minDurationMs;
        private final int partIndex;
        private final List<IdConfig2> parts;
        private final List<GovernmentId> uploadingIds;

        /* compiled from: GovernmentIdState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<FinalizeLocalVideoCapture> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FinalizeLocalVideoCapture createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                IdConfig idConfigCreateFromParcel = IdConfig.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(FinalizeLocalVideoCapture.class.getClassLoader()));
                }
                IdConfig2 idConfig2 = (IdConfig2) parcel.readParcelable(FinalizeLocalVideoCapture.class.getClassLoader());
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readParcelable(FinalizeLocalVideoCapture.class.getClassLoader()));
                }
                return new FinalizeLocalVideoCapture(idConfigCreateFromParcel, arrayList, idConfig2, arrayList2, parcel.readInt(), (GovernmentIdState) parcel.readParcelable(FinalizeLocalVideoCapture.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : GovernmentIdRequestArguments.CREATOR.createFromParcel(parcel), parcel.readLong(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FinalizeLocalVideoCapture[] newArray(int i) {
                return new FinalizeLocalVideoCapture[i];
            }
        }

        public static /* synthetic */ FinalizeLocalVideoCapture copy$default(FinalizeLocalVideoCapture finalizeLocalVideoCapture, IdConfig idConfig, List list, IdConfig2 idConfig2, List list2, int i, GovernmentIdState governmentIdState, String str, GovernmentIdRequestArguments governmentIdRequestArguments, long j, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                idConfig = finalizeLocalVideoCapture.id;
            }
            if ((i2 & 2) != 0) {
                list = finalizeLocalVideoCapture.uploadingIds;
            }
            if ((i2 & 4) != 0) {
                idConfig2 = finalizeLocalVideoCapture.currentPart;
            }
            if ((i2 & 8) != 0) {
                list2 = finalizeLocalVideoCapture.parts;
            }
            if ((i2 & 16) != 0) {
                i = finalizeLocalVideoCapture.partIndex;
            }
            if ((i2 & 32) != 0) {
                governmentIdState = finalizeLocalVideoCapture.backState;
            }
            if ((i2 & 64) != 0) {
                str = finalizeLocalVideoCapture.countryCode;
            }
            if ((i2 & 128) != 0) {
                governmentIdRequestArguments = finalizeLocalVideoCapture.governmentIdRequestArguments;
            }
            if ((i2 & 256) != 0) {
                j = finalizeLocalVideoCapture.minDurationMs;
            }
            if ((i2 & 512) != 0) {
                z = finalizeLocalVideoCapture.isDelayComplete;
            }
            boolean z2 = z;
            long j2 = j;
            String str2 = str;
            GovernmentIdRequestArguments governmentIdRequestArguments2 = governmentIdRequestArguments;
            int i3 = i;
            GovernmentIdState governmentIdState2 = governmentIdState;
            return finalizeLocalVideoCapture.copy(idConfig, list, idConfig2, list2, i3, governmentIdState2, str2, governmentIdRequestArguments2, j2, z2);
        }

        public final FinalizeLocalVideoCapture copy(IdConfig id, List<? extends GovernmentId> uploadingIds, IdConfig2 currentPart, List<? extends IdConfig2> parts, int partIndex, GovernmentIdState backState, String countryCode, GovernmentIdRequestArguments governmentIdRequestArguments, long minDurationMs, boolean isDelayComplete) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(parts, "parts");
            return new FinalizeLocalVideoCapture(id, uploadingIds, currentPart, parts, partIndex, backState, countryCode, governmentIdRequestArguments, minDurationMs, isDelayComplete);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FinalizeLocalVideoCapture)) {
                return false;
            }
            FinalizeLocalVideoCapture finalizeLocalVideoCapture = (FinalizeLocalVideoCapture) other;
            return Intrinsics.areEqual(this.id, finalizeLocalVideoCapture.id) && Intrinsics.areEqual(this.uploadingIds, finalizeLocalVideoCapture.uploadingIds) && Intrinsics.areEqual(this.currentPart, finalizeLocalVideoCapture.currentPart) && Intrinsics.areEqual(this.parts, finalizeLocalVideoCapture.parts) && this.partIndex == finalizeLocalVideoCapture.partIndex && Intrinsics.areEqual(this.backState, finalizeLocalVideoCapture.backState) && Intrinsics.areEqual(this.countryCode, finalizeLocalVideoCapture.countryCode) && Intrinsics.areEqual(this.governmentIdRequestArguments, finalizeLocalVideoCapture.governmentIdRequestArguments) && this.minDurationMs == finalizeLocalVideoCapture.minDurationMs && this.isDelayComplete == finalizeLocalVideoCapture.isDelayComplete;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.id.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.currentPart.hashCode()) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            GovernmentIdState governmentIdState = this.backState;
            int iHashCode2 = (iHashCode + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31;
            String str = this.countryCode;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            GovernmentIdRequestArguments governmentIdRequestArguments = this.governmentIdRequestArguments;
            return ((((iHashCode3 + (governmentIdRequestArguments != null ? governmentIdRequestArguments.hashCode() : 0)) * 31) + Long.hashCode(this.minDurationMs)) * 31) + Boolean.hashCode(this.isDelayComplete);
        }

        public String toString() {
            return "FinalizeLocalVideoCapture(id=" + this.id + ", uploadingIds=" + this.uploadingIds + ", currentPart=" + this.currentPart + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", countryCode=" + this.countryCode + ", governmentIdRequestArguments=" + this.governmentIdRequestArguments + ", minDurationMs=" + this.minDurationMs + ", isDelayComplete=" + this.isDelayComplete + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.id.writeToParcel(dest, flags);
            List<GovernmentId> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<GovernmentId> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeParcelable(this.currentPart, flags);
            List<IdConfig2> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<IdConfig2> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeInt(this.partIndex);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.countryCode);
            GovernmentIdRequestArguments governmentIdRequestArguments = this.governmentIdRequestArguments;
            if (governmentIdRequestArguments == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdRequestArguments.writeToParcel(dest, flags);
            }
            dest.writeLong(this.minDurationMs);
            dest.writeInt(this.isDelayComplete ? 1 : 0);
        }

        public /* synthetic */ FinalizeLocalVideoCapture(IdConfig idConfig, List list, IdConfig2 idConfig2, List list2, int i, GovernmentIdState governmentIdState, String str, GovernmentIdRequestArguments governmentIdRequestArguments, long j, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(idConfig, list, idConfig2, list2, i, (i2 & 32) != 0 ? null : governmentIdState, str, (i2 & 128) != 0 ? null : governmentIdRequestArguments, (i2 & 256) != 0 ? 3000L : j, (i2 & 512) != 0 ? false : z);
        }

        public final IdConfig getId() {
            return this.id;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public List<GovernmentId> getUploadingIds$government_id_release() {
            return this.uploadingIds;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getCurrentPart$government_id_release, reason: from getter */
        public IdConfig2 getCurrentPart() {
            return this.currentPart;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public List<IdConfig2> getParts$government_id_release() {
            return this.parts;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getPartIndex$government_id_release, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getBackState$government_id_release, reason: from getter */
        public GovernmentIdState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getCountryCode$government_id_release, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        public final long getMinDurationMs() {
            return this.minDurationMs;
        }

        /* renamed from: isDelayComplete, reason: from getter */
        public final boolean getIsDelayComplete() {
            return this.isDelayComplete;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FinalizeLocalVideoCapture(IdConfig id, List<? extends GovernmentId> uploadingIds, IdConfig2 currentPart, List<? extends IdConfig2> parts, int i, GovernmentIdState governmentIdState, String str, GovernmentIdRequestArguments governmentIdRequestArguments, long j, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(parts, "parts");
            this.id = id;
            this.uploadingIds = uploadingIds;
            this.currentPart = currentPart;
            this.parts = parts;
            this.partIndex = i;
            this.backState = governmentIdState;
            this.countryCode = str;
            this.governmentIdRequestArguments = governmentIdRequestArguments;
            this.minDurationMs = j;
            this.isDelayComplete = z;
        }
    }

    /* compiled from: GovernmentIdState.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\"\u001a\u00020\tJ\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0014\u0010\b\u001a\u00020\tX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\n\u001a\u0004\u0018\u00010\u0001X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006("}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "currentPart", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "uploadingIds", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "parts", "partIndex", "", "backState", "countryCode", "", "id", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "cameraProperties", "Lcom/withpersona/sdk2/camera/CameraProperties;", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;Ljava/util/List;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Lcom/withpersona/sdk2/camera/CameraProperties;)V", "getCurrentPart$government_id_release", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "getUploadingIds$government_id_release", "()Ljava/util/List;", "getParts$government_id_release", "getPartIndex$government_id_release", "()I", "getBackState$government_id_release", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "getCountryCode$government_id_release", "()Ljava/lang/String;", "getId", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "getCameraProperties", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class FinalizeWebRtc extends GovernmentIdState {
        public static final Parcelable.Creator<FinalizeWebRtc> CREATOR = new Creator();
        private final GovernmentIdState backState;
        private final CameraProperties cameraProperties;
        private final String countryCode;
        private final IdConfig2 currentPart;
        private final IdConfig id;
        private final int partIndex;
        private final List<IdConfig2> parts;
        private final List<GovernmentId> uploadingIds;

        /* compiled from: GovernmentIdState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<FinalizeWebRtc> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FinalizeWebRtc createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                IdConfig2 idConfig2 = (IdConfig2) parcel.readParcelable(FinalizeWebRtc.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(FinalizeWebRtc.class.getClassLoader()));
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readParcelable(FinalizeWebRtc.class.getClassLoader()));
                }
                return new FinalizeWebRtc(idConfig2, arrayList, arrayList2, parcel.readInt(), (GovernmentIdState) parcel.readParcelable(FinalizeWebRtc.class.getClassLoader()), parcel.readString(), IdConfig.CREATOR.createFromParcel(parcel), (CameraProperties) parcel.readParcelable(FinalizeWebRtc.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FinalizeWebRtc[] newArray(int i) {
                return new FinalizeWebRtc[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.currentPart, flags);
            List<GovernmentId> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<GovernmentId> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            List<IdConfig2> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<IdConfig2> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeInt(this.partIndex);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.countryCode);
            this.id.writeToParcel(dest, flags);
            dest.writeParcelable(this.cameraProperties, flags);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getCurrentPart$government_id_release, reason: from getter */
        public IdConfig2 getCurrentPart() {
            return this.currentPart;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public List<GovernmentId> getUploadingIds$government_id_release() {
            return this.uploadingIds;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public List<IdConfig2> getParts$government_id_release() {
            return this.parts;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getPartIndex$government_id_release, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getBackState$government_id_release, reason: from getter */
        public GovernmentIdState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getCountryCode$government_id_release, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        public final IdConfig getId() {
            return this.id;
        }

        public final CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FinalizeWebRtc(IdConfig2 currentPart, List<? extends GovernmentId> uploadingIds, List<? extends IdConfig2> parts, int i, GovernmentIdState governmentIdState, String str, IdConfig id, CameraProperties cameraProperties) {
            super(null);
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            this.currentPart = currentPart;
            this.uploadingIds = uploadingIds;
            this.parts = parts;
            this.partIndex = i;
            this.backState = governmentIdState;
            this.countryCode = str;
            this.id = id;
            this.cameraProperties = cameraProperties;
        }
    }

    /* compiled from: GovernmentIdState.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010\u001dJ\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\b\u001a\u00020\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010.R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b/\u0010+R\u001a\u0010\u000b\u001a\u00020\n8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u00104R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b6\u0010\u001fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0011\u00105\u001a\u0004\b:\u0010\u001fR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010;\u001a\u0004\b<\u0010=¨\u0006>"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$Submit;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "id", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "uploadingIds", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "currentPart", "parts", "", "partIndex", "backState", "", "countryCode", "Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;", "governmentIdRequestArguments", "webRtcObjectId", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "getId", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "Ljava/util/List;", "getUploadingIds$government_id_release", "()Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "getCurrentPart$government_id_release", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "getParts$government_id_release", "I", "getPartIndex$government_id_release", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "getBackState$government_id_release", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Ljava/lang/String;", "getCountryCode$government_id_release", "Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;", "getGovernmentIdRequestArguments", "()Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;", "getWebRtcObjectId", "Lcom/withpersona/sdk2/camera/CameraProperties;", "getCameraProperties", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class Submit extends GovernmentIdState {
        public static final Parcelable.Creator<Submit> CREATOR = new Creator();
        private final GovernmentIdState backState;
        private final CameraProperties cameraProperties;
        private final String countryCode;
        private final IdConfig2 currentPart;
        private final GovernmentIdRequestArguments governmentIdRequestArguments;
        private final IdConfig id;
        private final int partIndex;
        private final List<IdConfig2> parts;
        private final List<GovernmentId> uploadingIds;
        private final String webRtcObjectId;

        /* compiled from: GovernmentIdState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Submit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Submit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                IdConfig idConfigCreateFromParcel = IdConfig.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(Submit.class.getClassLoader()));
                }
                IdConfig2 idConfig2 = (IdConfig2) parcel.readParcelable(Submit.class.getClassLoader());
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readParcelable(Submit.class.getClassLoader()));
                }
                return new Submit(idConfigCreateFromParcel, arrayList, idConfig2, arrayList2, parcel.readInt(), (GovernmentIdState) parcel.readParcelable(Submit.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : GovernmentIdRequestArguments.CREATOR.createFromParcel(parcel), parcel.readString(), (CameraProperties) parcel.readParcelable(Submit.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Submit[] newArray(int i) {
                return new Submit[i];
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
            if (!(other instanceof Submit)) {
                return false;
            }
            Submit submit = (Submit) other;
            return Intrinsics.areEqual(this.id, submit.id) && Intrinsics.areEqual(this.uploadingIds, submit.uploadingIds) && Intrinsics.areEqual(this.currentPart, submit.currentPart) && Intrinsics.areEqual(this.parts, submit.parts) && this.partIndex == submit.partIndex && Intrinsics.areEqual(this.backState, submit.backState) && Intrinsics.areEqual(this.countryCode, submit.countryCode) && Intrinsics.areEqual(this.governmentIdRequestArguments, submit.governmentIdRequestArguments) && Intrinsics.areEqual(this.webRtcObjectId, submit.webRtcObjectId) && Intrinsics.areEqual(this.cameraProperties, submit.cameraProperties);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.id.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.currentPart.hashCode()) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            GovernmentIdState governmentIdState = this.backState;
            int iHashCode2 = (iHashCode + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31;
            String str = this.countryCode;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            GovernmentIdRequestArguments governmentIdRequestArguments = this.governmentIdRequestArguments;
            int iHashCode4 = (iHashCode3 + (governmentIdRequestArguments == null ? 0 : governmentIdRequestArguments.hashCode())) * 31;
            String str2 = this.webRtcObjectId;
            return ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.cameraProperties.hashCode();
        }

        public String toString() {
            return "Submit(id=" + this.id + ", uploadingIds=" + this.uploadingIds + ", currentPart=" + this.currentPart + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", countryCode=" + this.countryCode + ", governmentIdRequestArguments=" + this.governmentIdRequestArguments + ", webRtcObjectId=" + this.webRtcObjectId + ", cameraProperties=" + this.cameraProperties + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.id.writeToParcel(dest, flags);
            List<GovernmentId> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<GovernmentId> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeParcelable(this.currentPart, flags);
            List<IdConfig2> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<IdConfig2> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeInt(this.partIndex);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.countryCode);
            GovernmentIdRequestArguments governmentIdRequestArguments = this.governmentIdRequestArguments;
            if (governmentIdRequestArguments == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdRequestArguments.writeToParcel(dest, flags);
            }
            dest.writeString(this.webRtcObjectId);
            dest.writeParcelable(this.cameraProperties, flags);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public List<GovernmentId> getUploadingIds$government_id_release() {
            return this.uploadingIds;
        }

        public /* synthetic */ Submit(IdConfig idConfig, List list, IdConfig2 idConfig2, List list2, int i, GovernmentIdState governmentIdState, String str, GovernmentIdRequestArguments governmentIdRequestArguments, String str2, CameraProperties cameraProperties, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(idConfig, list, (i2 & 4) != 0 ? new IdConfig2.SideIdPart(IdConfig.Side.Front) : idConfig2, list2, i, (i2 & 32) != 0 ? null : governmentIdState, str, (i2 & 128) != 0 ? null : governmentIdRequestArguments, str2, cameraProperties);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getCurrentPart$government_id_release, reason: from getter */
        public IdConfig2 getCurrentPart() {
            return this.currentPart;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public List<IdConfig2> getParts$government_id_release() {
            return this.parts;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getPartIndex$government_id_release, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getBackState$government_id_release, reason: from getter */
        public GovernmentIdState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getCountryCode$government_id_release, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        public final GovernmentIdRequestArguments getGovernmentIdRequestArguments() {
            return this.governmentIdRequestArguments;
        }

        public final String getWebRtcObjectId() {
            return this.webRtcObjectId;
        }

        public final CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Submit(IdConfig id, List<? extends GovernmentId> uploadingIds, IdConfig2 currentPart, List<? extends IdConfig2> parts, int i, GovernmentIdState governmentIdState, String str, GovernmentIdRequestArguments governmentIdRequestArguments, String str2, CameraProperties cameraProperties) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            this.id = id;
            this.uploadingIds = uploadingIds;
            this.currentPart = currentPart;
            this.parts = parts;
            this.partIndex = i;
            this.backState = governmentIdState;
            this.countryCode = str;
            this.governmentIdRequestArguments = governmentIdRequestArguments;
            this.webRtcObjectId = str2;
            this.cameraProperties = cameraProperties;
        }
    }

    public final GovernmentIdState copyWithErrorMessage$government_id_release(String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return this instanceof ReviewCapturedImage ? ReviewCapturedImage.copy$default((ReviewCapturedImage) this, null, null, null, null, null, 0, null, null, error, false, null, 1791, null) : this instanceof ReviewSelectedImage ? ReviewSelectedImage.copy$default((ReviewSelectedImage) this, null, null, null, null, null, null, 0, null, null, error, false, null, 3583, null) : this instanceof ChooseCaptureMethod ? ChooseCaptureMethod.copy$default((ChooseCaptureMethod) this, null, null, null, 0, null, null, false, null, error, 255, null) : this instanceof ShowInstructions ? ShowInstructions.copy$default((ShowInstructions) this, null, null, null, null, 0, null, null, error, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null) : this;
    }

    /* compiled from: GovernmentIdState.kt */
    @Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\t¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b$\u0010!J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010,R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010/R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b0\u0010/R\u001a\u0010\n\u001a\u00020\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u00105R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u0010#R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b8\u0010/R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00109\u001a\u0004\b:\u0010;R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b<\u0010/R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0014\u00106\u001a\u0004\b=\u0010#R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0015\u00106\u001a\u0004\b>\u0010#R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010?\u001a\u0004\b@\u0010A¨\u0006B"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "currentPart", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "uploadingIds", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "parts", "", "partIndex", "backState", "", "countryCode", "Lcom/withpersona/sdk2/inquiry/governmentid/Frame;", "captureFrames", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;", "idConfigsForCountry", "selectedCountryCode", "selectedIdClass", "Lcom/withpersona/sdk2/inquiry/governmentid/AutoClassificationErrorType;", "errorType", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/AutoClassificationErrorType;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "getCurrentPart$government_id_release", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "Ljava/util/List;", "getUploadingIds$government_id_release", "()Ljava/util/List;", "getParts$government_id_release", "I", "getPartIndex$government_id_release", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "getBackState$government_id_release", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Ljava/lang/String;", "getCountryCode$government_id_release", "getCaptureFrames", "Lcom/withpersona/sdk2/camera/CameraProperties;", "getCameraProperties", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "getIdConfigsForCountry", "getSelectedCountryCode", "getSelectedIdClass", "Lcom/withpersona/sdk2/inquiry/governmentid/AutoClassificationErrorType;", "getErrorType", "()Lcom/withpersona/sdk2/inquiry/governmentid/AutoClassificationErrorType;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class AutoClassificationError extends GovernmentIdState {
        public static final Parcelable.Creator<AutoClassificationError> CREATOR = new Creator();
        private final GovernmentIdState backState;
        private final CameraProperties cameraProperties;
        private final List<Frame> captureFrames;
        private final String countryCode;
        private final IdConfig2.SideIdPart currentPart;
        private final GovernmentIdState3 errorType;
        private final List<IdConfigForCountry> idConfigsForCountry;
        private final int partIndex;
        private final List<IdConfig2> parts;
        private final String selectedCountryCode;
        private final String selectedIdClass;
        private final List<GovernmentId> uploadingIds;

        /* compiled from: GovernmentIdState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<AutoClassificationError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AutoClassificationError createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                IdConfig2.SideIdPart sideIdPartCreateFromParcel = IdConfig2.SideIdPart.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(AutoClassificationError.class.getClassLoader()));
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readParcelable(AutoClassificationError.class.getClassLoader()));
                }
                int i5 = parcel.readInt();
                GovernmentIdState governmentIdState = (GovernmentIdState) parcel.readParcelable(AutoClassificationError.class.getClassLoader());
                String string2 = parcel.readString();
                int i6 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i6);
                for (int i7 = 0; i7 != i6; i7++) {
                    arrayList3.add(Frame.CREATOR.createFromParcel(parcel));
                }
                CameraProperties cameraProperties = (CameraProperties) parcel.readParcelable(AutoClassificationError.class.getClassLoader());
                int i8 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i8);
                for (int i9 = 0; i9 != i8; i9++) {
                    arrayList4.add(IdConfigForCountry.CREATOR.createFromParcel(parcel));
                }
                return new AutoClassificationError(sideIdPartCreateFromParcel, arrayList, arrayList2, i5, governmentIdState, string2, arrayList3, cameraProperties, arrayList4, parcel.readString(), parcel.readString(), GovernmentIdState3.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AutoClassificationError[] newArray(int i) {
                return new AutoClassificationError[i];
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
            if (!(other instanceof AutoClassificationError)) {
                return false;
            }
            AutoClassificationError autoClassificationError = (AutoClassificationError) other;
            return Intrinsics.areEqual(this.currentPart, autoClassificationError.currentPart) && Intrinsics.areEqual(this.uploadingIds, autoClassificationError.uploadingIds) && Intrinsics.areEqual(this.parts, autoClassificationError.parts) && this.partIndex == autoClassificationError.partIndex && Intrinsics.areEqual(this.backState, autoClassificationError.backState) && Intrinsics.areEqual(this.countryCode, autoClassificationError.countryCode) && Intrinsics.areEqual(this.captureFrames, autoClassificationError.captureFrames) && Intrinsics.areEqual(this.cameraProperties, autoClassificationError.cameraProperties) && Intrinsics.areEqual(this.idConfigsForCountry, autoClassificationError.idConfigsForCountry) && Intrinsics.areEqual(this.selectedCountryCode, autoClassificationError.selectedCountryCode) && Intrinsics.areEqual(this.selectedIdClass, autoClassificationError.selectedIdClass) && this.errorType == autoClassificationError.errorType;
        }

        public int hashCode() {
            int iHashCode = ((((((this.currentPart.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            GovernmentIdState governmentIdState = this.backState;
            int iHashCode2 = (iHashCode + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31;
            String str = this.countryCode;
            int iHashCode3 = (((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.captureFrames.hashCode()) * 31) + this.cameraProperties.hashCode()) * 31) + this.idConfigsForCountry.hashCode()) * 31;
            String str2 = this.selectedCountryCode;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.selectedIdClass;
            return ((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.errorType.hashCode();
        }

        public String toString() {
            return "AutoClassificationError(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", countryCode=" + this.countryCode + ", captureFrames=" + this.captureFrames + ", cameraProperties=" + this.cameraProperties + ", idConfigsForCountry=" + this.idConfigsForCountry + ", selectedCountryCode=" + this.selectedCountryCode + ", selectedIdClass=" + this.selectedIdClass + ", errorType=" + this.errorType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.currentPart.writeToParcel(dest, flags);
            List<GovernmentId> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<GovernmentId> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            List<IdConfig2> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<IdConfig2> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeInt(this.partIndex);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.countryCode);
            List<Frame> list3 = this.captureFrames;
            dest.writeInt(list3.size());
            Iterator<Frame> it3 = list3.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.cameraProperties, flags);
            List<IdConfigForCountry> list4 = this.idConfigsForCountry;
            dest.writeInt(list4.size());
            Iterator<IdConfigForCountry> it4 = list4.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(dest, flags);
            }
            dest.writeString(this.selectedCountryCode);
            dest.writeString(this.selectedIdClass);
            dest.writeString(this.errorType.name());
        }

        public /* synthetic */ AutoClassificationError(IdConfig2.SideIdPart sideIdPart, List list, List list2, int i, GovernmentIdState governmentIdState, String str, List list3, CameraProperties cameraProperties, List list4, String str2, String str3, GovernmentIdState3 governmentIdState3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? new IdConfig2.SideIdPart(IdConfig.Side.Front) : sideIdPart, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list, list2, i, governmentIdState, str, list3, cameraProperties, list4, (i2 & 512) != 0 ? null : str2, (i2 & 1024) != 0 ? null : str3, governmentIdState3);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getCurrentPart$government_id_release, reason: from getter */
        public IdConfig2.SideIdPart getCurrentPart() {
            return this.currentPart;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public List<GovernmentId> getUploadingIds$government_id_release() {
            return this.uploadingIds;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public List<IdConfig2> getParts$government_id_release() {
            return this.parts;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getPartIndex$government_id_release, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getBackState$government_id_release, reason: from getter */
        public GovernmentIdState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getCountryCode$government_id_release, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        public final List<Frame> getCaptureFrames() {
            return this.captureFrames;
        }

        public final List<IdConfigForCountry> getIdConfigsForCountry() {
            return this.idConfigsForCountry;
        }

        public final GovernmentIdState3 getErrorType() {
            return this.errorType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AutoClassificationError(IdConfig2.SideIdPart currentPart, List<? extends GovernmentId> uploadingIds, List<? extends IdConfig2> parts, int i, GovernmentIdState governmentIdState, String str, List<Frame> captureFrames, CameraProperties cameraProperties, List<IdConfigForCountry> idConfigsForCountry, String str2, String str3, GovernmentIdState3 errorType) {
            super(null);
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(captureFrames, "captureFrames");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(idConfigsForCountry, "idConfigsForCountry");
            Intrinsics.checkNotNullParameter(errorType, "errorType");
            this.currentPart = currentPart;
            this.uploadingIds = uploadingIds;
            this.parts = parts;
            this.partIndex = i;
            this.backState = governmentIdState;
            this.countryCode = str;
            this.captureFrames = captureFrames;
            this.cameraProperties = cameraProperties;
            this.idConfigsForCountry = idConfigsForCountry;
            this.selectedCountryCode = str2;
            this.selectedIdClass = str3;
            this.errorType = errorType;
        }
    }

    /* compiled from: GovernmentIdState.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fJ\u009e\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010,R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010/R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b0\u0010/R\u001a\u0010\n\u001a\u00020\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u00105R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u0010#R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b8\u0010/R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00109\u001a\u0004\b:\u0010;R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b<\u0010/R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0014\u00106\u001a\u0004\b=\u0010#R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0015\u00106\u001a\u0004\b>\u0010#¨\u0006?"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "currentPart", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "uploadingIds", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "parts", "", "partIndex", "backState", "", "countryCode", "Lcom/withpersona/sdk2/inquiry/governmentid/Frame;", "captureFrames", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;", "idConfigsForCountry", "selectedCountryCode", "selectedIdClass", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "getCurrentPart$government_id_release", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "Ljava/util/List;", "getUploadingIds$government_id_release", "()Ljava/util/List;", "getParts$government_id_release", "I", "getPartIndex$government_id_release", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "getBackState$government_id_release", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Ljava/lang/String;", "getCountryCode$government_id_release", "getCaptureFrames", "Lcom/withpersona/sdk2/camera/CameraProperties;", "getCameraProperties", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "getIdConfigsForCountry", "getSelectedCountryCode", "getSelectedIdClass", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class AutoClassificationManualSelect extends GovernmentIdState {
        public static final Parcelable.Creator<AutoClassificationManualSelect> CREATOR = new Creator();
        private final GovernmentIdState backState;
        private final CameraProperties cameraProperties;
        private final List<Frame> captureFrames;
        private final String countryCode;
        private final IdConfig2.SideIdPart currentPart;
        private final List<IdConfigForCountry> idConfigsForCountry;
        private final int partIndex;
        private final List<IdConfig2> parts;
        private final String selectedCountryCode;
        private final String selectedIdClass;
        private final List<GovernmentId> uploadingIds;

        /* compiled from: GovernmentIdState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<AutoClassificationManualSelect> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AutoClassificationManualSelect createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                IdConfig2.SideIdPart sideIdPartCreateFromParcel = IdConfig2.SideIdPart.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(AutoClassificationManualSelect.class.getClassLoader()));
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readParcelable(AutoClassificationManualSelect.class.getClassLoader()));
                }
                int i5 = parcel.readInt();
                GovernmentIdState governmentIdState = (GovernmentIdState) parcel.readParcelable(AutoClassificationManualSelect.class.getClassLoader());
                String string2 = parcel.readString();
                int i6 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i6);
                for (int i7 = 0; i7 != i6; i7++) {
                    arrayList3.add(Frame.CREATOR.createFromParcel(parcel));
                }
                CameraProperties cameraProperties = (CameraProperties) parcel.readParcelable(AutoClassificationManualSelect.class.getClassLoader());
                int i8 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i8);
                for (int i9 = 0; i9 != i8; i9++) {
                    arrayList4.add(IdConfigForCountry.CREATOR.createFromParcel(parcel));
                }
                return new AutoClassificationManualSelect(sideIdPartCreateFromParcel, arrayList, arrayList2, i5, governmentIdState, string2, arrayList3, cameraProperties, arrayList4, parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AutoClassificationManualSelect[] newArray(int i) {
                return new AutoClassificationManualSelect[i];
            }
        }

        public static /* synthetic */ AutoClassificationManualSelect copy$default(AutoClassificationManualSelect autoClassificationManualSelect, IdConfig2.SideIdPart sideIdPart, List list, List list2, int i, GovernmentIdState governmentIdState, String str, List list3, CameraProperties cameraProperties, List list4, String str2, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                sideIdPart = autoClassificationManualSelect.currentPart;
            }
            if ((i2 & 2) != 0) {
                list = autoClassificationManualSelect.uploadingIds;
            }
            if ((i2 & 4) != 0) {
                list2 = autoClassificationManualSelect.parts;
            }
            if ((i2 & 8) != 0) {
                i = autoClassificationManualSelect.partIndex;
            }
            if ((i2 & 16) != 0) {
                governmentIdState = autoClassificationManualSelect.backState;
            }
            if ((i2 & 32) != 0) {
                str = autoClassificationManualSelect.countryCode;
            }
            if ((i2 & 64) != 0) {
                list3 = autoClassificationManualSelect.captureFrames;
            }
            if ((i2 & 128) != 0) {
                cameraProperties = autoClassificationManualSelect.cameraProperties;
            }
            if ((i2 & 256) != 0) {
                list4 = autoClassificationManualSelect.idConfigsForCountry;
            }
            if ((i2 & 512) != 0) {
                str2 = autoClassificationManualSelect.selectedCountryCode;
            }
            if ((i2 & 1024) != 0) {
                str3 = autoClassificationManualSelect.selectedIdClass;
            }
            String str4 = str2;
            String str5 = str3;
            CameraProperties cameraProperties2 = cameraProperties;
            List list5 = list4;
            String str6 = str;
            List list6 = list3;
            GovernmentIdState governmentIdState2 = governmentIdState;
            List list7 = list2;
            return autoClassificationManualSelect.copy(sideIdPart, list, list7, i, governmentIdState2, str6, list6, cameraProperties2, list5, str4, str5);
        }

        public final AutoClassificationManualSelect copy(IdConfig2.SideIdPart currentPart, List<? extends GovernmentId> uploadingIds, List<? extends IdConfig2> parts, int partIndex, GovernmentIdState backState, String countryCode, List<Frame> captureFrames, CameraProperties cameraProperties, List<IdConfigForCountry> idConfigsForCountry, String selectedCountryCode, String selectedIdClass) {
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(captureFrames, "captureFrames");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(idConfigsForCountry, "idConfigsForCountry");
            return new AutoClassificationManualSelect(currentPart, uploadingIds, parts, partIndex, backState, countryCode, captureFrames, cameraProperties, idConfigsForCountry, selectedCountryCode, selectedIdClass);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AutoClassificationManualSelect)) {
                return false;
            }
            AutoClassificationManualSelect autoClassificationManualSelect = (AutoClassificationManualSelect) other;
            return Intrinsics.areEqual(this.currentPart, autoClassificationManualSelect.currentPart) && Intrinsics.areEqual(this.uploadingIds, autoClassificationManualSelect.uploadingIds) && Intrinsics.areEqual(this.parts, autoClassificationManualSelect.parts) && this.partIndex == autoClassificationManualSelect.partIndex && Intrinsics.areEqual(this.backState, autoClassificationManualSelect.backState) && Intrinsics.areEqual(this.countryCode, autoClassificationManualSelect.countryCode) && Intrinsics.areEqual(this.captureFrames, autoClassificationManualSelect.captureFrames) && Intrinsics.areEqual(this.cameraProperties, autoClassificationManualSelect.cameraProperties) && Intrinsics.areEqual(this.idConfigsForCountry, autoClassificationManualSelect.idConfigsForCountry) && Intrinsics.areEqual(this.selectedCountryCode, autoClassificationManualSelect.selectedCountryCode) && Intrinsics.areEqual(this.selectedIdClass, autoClassificationManualSelect.selectedIdClass);
        }

        public int hashCode() {
            int iHashCode = ((((((this.currentPart.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            GovernmentIdState governmentIdState = this.backState;
            int iHashCode2 = (iHashCode + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31;
            String str = this.countryCode;
            int iHashCode3 = (((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.captureFrames.hashCode()) * 31) + this.cameraProperties.hashCode()) * 31) + this.idConfigsForCountry.hashCode()) * 31;
            String str2 = this.selectedCountryCode;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.selectedIdClass;
            return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "AutoClassificationManualSelect(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", countryCode=" + this.countryCode + ", captureFrames=" + this.captureFrames + ", cameraProperties=" + this.cameraProperties + ", idConfigsForCountry=" + this.idConfigsForCountry + ", selectedCountryCode=" + this.selectedCountryCode + ", selectedIdClass=" + this.selectedIdClass + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.currentPart.writeToParcel(dest, flags);
            List<GovernmentId> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<GovernmentId> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            List<IdConfig2> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<IdConfig2> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeInt(this.partIndex);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.countryCode);
            List<Frame> list3 = this.captureFrames;
            dest.writeInt(list3.size());
            Iterator<Frame> it3 = list3.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.cameraProperties, flags);
            List<IdConfigForCountry> list4 = this.idConfigsForCountry;
            dest.writeInt(list4.size());
            Iterator<IdConfigForCountry> it4 = list4.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(dest, flags);
            }
            dest.writeString(this.selectedCountryCode);
            dest.writeString(this.selectedIdClass);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getCurrentPart$government_id_release, reason: from getter */
        public IdConfig2.SideIdPart getCurrentPart() {
            return this.currentPart;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public List<GovernmentId> getUploadingIds$government_id_release() {
            return this.uploadingIds;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public List<IdConfig2> getParts$government_id_release() {
            return this.parts;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getPartIndex$government_id_release, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getBackState$government_id_release, reason: from getter */
        public GovernmentIdState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* renamed from: getCountryCode$government_id_release, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        public final CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        public final List<IdConfigForCountry> getIdConfigsForCountry() {
            return this.idConfigsForCountry;
        }

        public final String getSelectedCountryCode() {
            return this.selectedCountryCode;
        }

        public final String getSelectedIdClass() {
            return this.selectedIdClass;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AutoClassificationManualSelect(IdConfig2.SideIdPart currentPart, List<? extends GovernmentId> uploadingIds, List<? extends IdConfig2> parts, int i, GovernmentIdState governmentIdState, String str, List<Frame> captureFrames, CameraProperties cameraProperties, List<IdConfigForCountry> idConfigsForCountry, String str2, String str3) {
            super(null);
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(captureFrames, "captureFrames");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(idConfigsForCountry, "idConfigsForCountry");
            this.currentPart = currentPart;
            this.uploadingIds = uploadingIds;
            this.parts = parts;
            this.partIndex = i;
            this.backState = governmentIdState;
            this.countryCode = str;
            this.captureFrames = captureFrames;
            this.cameraProperties = cameraProperties;
            this.idConfigsForCountry = idConfigsForCountry;
            this.selectedCountryCode = str2;
            this.selectedIdClass = str3;
        }
    }

    public void deleteAllIds() {
        Iterator<T> it = getUploadingIds$government_id_release().iterator();
        while (it.hasNext()) {
            Iterator<T> it2 = ((GovernmentId) it.next()).getFrames().iterator();
            while (it2.hasNext()) {
                new File(((Frame) it2.next()).getAbsoluteFilePath()).delete();
            }
        }
    }
}
