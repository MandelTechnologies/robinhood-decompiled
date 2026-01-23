package com.robinhood.shared.documents.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.api.ColorTheme;
import com.robinhood.models.p355ui.DocumentRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocUploadAssistant.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015R\u0019\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/documents/contracts/DocUploadAssistant;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "documentRequests", "", "Lcom/robinhood/models/ui/DocumentRequest;", "isFromRhfOnboarding", "", "isFromOnboarding", "mockRequests", "theme", "Lcom/robinhood/models/api/ColorTheme;", "<init>", "(Ljava/util/List;ZZZLcom/robinhood/models/api/ColorTheme;)V", "getDocumentRequests", "()Ljava/util/List;", "()Z", "getMockRequests", "getTheme", "()Lcom/robinhood/models/api/ColorTheme;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class DocUploadAssistant implements IntentKey, Parcelable {
    public static final Parcelable.Creator<DocUploadAssistant> CREATOR = new Creator();
    private final List<DocumentRequest> documentRequests;
    private final boolean isFromOnboarding;
    private final boolean isFromRhfOnboarding;
    private final boolean mockRequests;
    private final ColorTheme theme;

    /* compiled from: DocUploadAssistant.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<DocUploadAssistant> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DocUploadAssistant createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(parcel.readParcelable(DocUploadAssistant.class.getClassLoader()));
                }
                arrayList = arrayList2;
            }
            return new DocUploadAssistant(arrayList, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, ColorTheme.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DocUploadAssistant[] newArray(int i) {
            return new DocUploadAssistant[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<DocumentRequest> list = this.documentRequests;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<DocumentRequest> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }
        dest.writeInt(this.isFromRhfOnboarding ? 1 : 0);
        dest.writeInt(this.isFromOnboarding ? 1 : 0);
        dest.writeInt(this.mockRequests ? 1 : 0);
        dest.writeString(this.theme.name());
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public DocUploadAssistant(List<DocumentRequest> list, boolean z, boolean z2, boolean z3, ColorTheme theme) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.documentRequests = list;
        this.isFromRhfOnboarding = z;
        this.isFromOnboarding = z2;
        this.mockRequests = z3;
        this.theme = theme;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DocUploadAssistant(List list, boolean z, boolean z2, boolean z3, ColorTheme colorTheme, int i, DefaultConstructorMarker defaultConstructorMarker) {
        ColorTheme colorTheme2;
        boolean z4;
        z = (i & 2) != 0 ? false : z;
        z2 = (i & 4) != 0 ? false : z2;
        if ((i & 8) != 0) {
            colorTheme2 = colorTheme;
            z4 = false;
        } else {
            colorTheme2 = colorTheme;
            z4 = z3;
        }
        this(list, z, z2, z4, colorTheme2);
    }

    public final List<DocumentRequest> getDocumentRequests() {
        return this.documentRequests;
    }

    /* renamed from: isFromRhfOnboarding, reason: from getter */
    public final boolean getIsFromRhfOnboarding() {
        return this.isFromRhfOnboarding;
    }

    /* renamed from: isFromOnboarding, reason: from getter */
    public final boolean getIsFromOnboarding() {
        return this.isFromOnboarding;
    }

    public final boolean getMockRequests() {
        return this.mockRequests;
    }

    public final ColorTheme getTheme() {
        return this.theme;
    }
}
