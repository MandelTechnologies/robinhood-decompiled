package com.robinhood.android.onboarding.p205ui.postsignup;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.onboarding.p205ui.postsignup.event.PostSignUpDestination;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.models.p355ui.identi.UiApplication;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PostSignUpState.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0006HÂ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u00104\u001a\u00020\bHÆ\u0003J\t\u00105\u001a\u00020\bHÆ\u0003J\t\u00106\u001a\u00020\bHÆ\u0003J\u0083\u0001\u00107\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\bHÆ\u0001J\u0006\u00108\u001a\u000209J\u0013\u0010:\u001a\u00020\b2\b\u0010;\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010=\u001a\u000209HÖ\u0001J\t\u0010>\u001a\u00020?HÖ\u0001J\u0016\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u000209R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0016R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0016R\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0017\u0010\u001e\u001a\u00020\b¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0016R\u0017\u0010\"\u001a\u00020\b¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010 \u001a\u0004\b\"\u0010\u0016R\u0017\u0010$\u001a\u00020\b¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010 \u001a\u0004\b&\u0010\u0016R\u0017\u0010'\u001a\u00020\b¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010 \u001a\u0004\b)\u0010\u0016R\u0011\u0010*\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u0016¨\u0006E"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpState;", "Landroid/os/Parcelable;", "latestDocumentRequests", "", "Lcom/robinhood/models/ui/DocumentRequest;", "latestApplication", "Lcom/robinhood/models/ui/identi/UiApplication;", "isDocUploadFlowVisited", "", "hasShownCreateIav", "hasExitedIavRelationship", "shouldPromptForFundingAgain", "lastDestination", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination;", "destination", "isPollingDocuments", "isPollingApplication", "activityWasDestroyedDuringFunding", "<init>", "(Ljava/util/List;Lcom/robinhood/models/ui/identi/UiApplication;ZZZZLcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination;Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination;ZZZ)V", "getLatestDocumentRequests", "()Ljava/util/List;", "()Z", "getHasShownCreateIav", "getHasExitedIavRelationship", "getShouldPromptForFundingAgain", "getLastDestination", "()Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination;", "getDestination", "getActivityWasDestroyedDuringFunding", "hasApplication", "getHasApplication$annotations", "()V", "getHasApplication", "isApplicationApproved", "isApplicationApproved$annotations", "shouldPollApplication", "getShouldPollApplication$annotations", "getShouldPollApplication", "shouldPollDocumentRequests", "getShouldPollDocumentRequests$annotations", "getShouldPollDocumentRequests", "shouldShowDocUploadFlow", "getShouldShowDocUploadFlow", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PostSignUpState implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PostSignUpState> CREATOR = new Creator();
    private final boolean activityWasDestroyedDuringFunding;
    private final PostSignUpDestination destination;
    private final boolean hasApplication;
    private final boolean hasExitedIavRelationship;
    private final boolean hasShownCreateIav;
    private final boolean isApplicationApproved;
    private final boolean isDocUploadFlowVisited;
    private final boolean isPollingApplication;
    private final boolean isPollingDocuments;
    private final PostSignUpDestination lastDestination;
    private final UiApplication latestApplication;
    private final List<DocumentRequest> latestDocumentRequests;
    private final boolean shouldPollApplication;
    private final boolean shouldPollDocumentRequests;
    private final boolean shouldPromptForFundingAgain;

    /* compiled from: PostSignUpState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<PostSignUpState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PostSignUpState createFromParcel(Parcel parcel) {
            Class cls;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(PostSignUpState.class.getClassLoader()));
            }
            UiApplication uiApplication = (UiApplication) parcel.readParcelable(PostSignUpState.class.getClassLoader());
            boolean z5 = true;
            if (parcel.readInt() != 0) {
                cls = PostSignUpState.class;
                z = true;
            } else {
                cls = PostSignUpState.class;
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z5 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = z2;
            } else {
                z3 = z2;
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z4 = z3;
            } else {
                z4 = z3;
                z3 = false;
            }
            return new PostSignUpState(arrayList, uiApplication, z, z5, z2, z3, (PostSignUpDestination) parcel.readParcelable(cls.getClassLoader()), (PostSignUpDestination) parcel.readParcelable(cls.getClassLoader()), parcel.readInt() != 0 ? z4 : false, parcel.readInt() != 0 ? z4 : false, parcel.readInt() != 0 ? z4 : false);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PostSignUpState[] newArray(int i) {
            return new PostSignUpState[i];
        }
    }

    public PostSignUpState() {
        this(null, null, false, false, false, false, null, null, false, false, false, 2047, null);
    }

    /* renamed from: component2, reason: from getter */
    private final UiApplication getLatestApplication() {
        return this.latestApplication;
    }

    public static /* synthetic */ PostSignUpState copy$default(PostSignUpState postSignUpState, List list, UiApplication uiApplication, boolean z, boolean z2, boolean z3, boolean z4, PostSignUpDestination postSignUpDestination, PostSignUpDestination postSignUpDestination2, boolean z5, boolean z6, boolean z7, int i, Object obj) {
        if ((i & 1) != 0) {
            list = postSignUpState.latestDocumentRequests;
        }
        if ((i & 2) != 0) {
            uiApplication = postSignUpState.latestApplication;
        }
        if ((i & 4) != 0) {
            z = postSignUpState.isDocUploadFlowVisited;
        }
        if ((i & 8) != 0) {
            z2 = postSignUpState.hasShownCreateIav;
        }
        if ((i & 16) != 0) {
            z3 = postSignUpState.hasExitedIavRelationship;
        }
        if ((i & 32) != 0) {
            z4 = postSignUpState.shouldPromptForFundingAgain;
        }
        if ((i & 64) != 0) {
            postSignUpDestination = postSignUpState.lastDestination;
        }
        if ((i & 128) != 0) {
            postSignUpDestination2 = postSignUpState.destination;
        }
        if ((i & 256) != 0) {
            z5 = postSignUpState.isPollingDocuments;
        }
        if ((i & 512) != 0) {
            z6 = postSignUpState.isPollingApplication;
        }
        if ((i & 1024) != 0) {
            z7 = postSignUpState.activityWasDestroyedDuringFunding;
        }
        boolean z8 = z6;
        boolean z9 = z7;
        PostSignUpDestination postSignUpDestination3 = postSignUpDestination2;
        boolean z10 = z5;
        boolean z11 = z4;
        PostSignUpDestination postSignUpDestination4 = postSignUpDestination;
        boolean z12 = z3;
        boolean z13 = z;
        return postSignUpState.copy(list, uiApplication, z13, z2, z12, z11, postSignUpDestination4, postSignUpDestination3, z10, z8, z9);
    }

    public static /* synthetic */ void getHasApplication$annotations() {
    }

    public static /* synthetic */ void getShouldPollApplication$annotations() {
    }

    public static /* synthetic */ void getShouldPollDocumentRequests$annotations() {
    }

    public static /* synthetic */ void isApplicationApproved$annotations() {
    }

    public final List<DocumentRequest> component1() {
        return this.latestDocumentRequests;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsPollingApplication() {
        return this.isPollingApplication;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getActivityWasDestroyedDuringFunding() {
        return this.activityWasDestroyedDuringFunding;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsDocUploadFlowVisited() {
        return this.isDocUploadFlowVisited;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHasShownCreateIav() {
        return this.hasShownCreateIav;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHasExitedIavRelationship() {
        return this.hasExitedIavRelationship;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShouldPromptForFundingAgain() {
        return this.shouldPromptForFundingAgain;
    }

    /* renamed from: component7, reason: from getter */
    public final PostSignUpDestination getLastDestination() {
        return this.lastDestination;
    }

    /* renamed from: component8, reason: from getter */
    public final PostSignUpDestination getDestination() {
        return this.destination;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsPollingDocuments() {
        return this.isPollingDocuments;
    }

    public final PostSignUpState copy(List<DocumentRequest> latestDocumentRequests, UiApplication latestApplication, boolean isDocUploadFlowVisited, boolean hasShownCreateIav, boolean hasExitedIavRelationship, boolean shouldPromptForFundingAgain, PostSignUpDestination lastDestination, PostSignUpDestination destination, boolean isPollingDocuments, boolean isPollingApplication, boolean activityWasDestroyedDuringFunding) {
        Intrinsics.checkNotNullParameter(latestDocumentRequests, "latestDocumentRequests");
        return new PostSignUpState(latestDocumentRequests, latestApplication, isDocUploadFlowVisited, hasShownCreateIav, hasExitedIavRelationship, shouldPromptForFundingAgain, lastDestination, destination, isPollingDocuments, isPollingApplication, activityWasDestroyedDuringFunding);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostSignUpState)) {
            return false;
        }
        PostSignUpState postSignUpState = (PostSignUpState) other;
        return Intrinsics.areEqual(this.latestDocumentRequests, postSignUpState.latestDocumentRequests) && Intrinsics.areEqual(this.latestApplication, postSignUpState.latestApplication) && this.isDocUploadFlowVisited == postSignUpState.isDocUploadFlowVisited && this.hasShownCreateIav == postSignUpState.hasShownCreateIav && this.hasExitedIavRelationship == postSignUpState.hasExitedIavRelationship && this.shouldPromptForFundingAgain == postSignUpState.shouldPromptForFundingAgain && Intrinsics.areEqual(this.lastDestination, postSignUpState.lastDestination) && Intrinsics.areEqual(this.destination, postSignUpState.destination) && this.isPollingDocuments == postSignUpState.isPollingDocuments && this.isPollingApplication == postSignUpState.isPollingApplication && this.activityWasDestroyedDuringFunding == postSignUpState.activityWasDestroyedDuringFunding;
    }

    public int hashCode() {
        int iHashCode = this.latestDocumentRequests.hashCode() * 31;
        UiApplication uiApplication = this.latestApplication;
        int iHashCode2 = (((((((((iHashCode + (uiApplication == null ? 0 : uiApplication.hashCode())) * 31) + Boolean.hashCode(this.isDocUploadFlowVisited)) * 31) + Boolean.hashCode(this.hasShownCreateIav)) * 31) + Boolean.hashCode(this.hasExitedIavRelationship)) * 31) + Boolean.hashCode(this.shouldPromptForFundingAgain)) * 31;
        PostSignUpDestination postSignUpDestination = this.lastDestination;
        int iHashCode3 = (iHashCode2 + (postSignUpDestination == null ? 0 : postSignUpDestination.hashCode())) * 31;
        PostSignUpDestination postSignUpDestination2 = this.destination;
        return ((((((iHashCode3 + (postSignUpDestination2 != null ? postSignUpDestination2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isPollingDocuments)) * 31) + Boolean.hashCode(this.isPollingApplication)) * 31) + Boolean.hashCode(this.activityWasDestroyedDuringFunding);
    }

    public String toString() {
        return "PostSignUpState(latestDocumentRequests=" + this.latestDocumentRequests + ", latestApplication=" + this.latestApplication + ", isDocUploadFlowVisited=" + this.isDocUploadFlowVisited + ", hasShownCreateIav=" + this.hasShownCreateIav + ", hasExitedIavRelationship=" + this.hasExitedIavRelationship + ", shouldPromptForFundingAgain=" + this.shouldPromptForFundingAgain + ", lastDestination=" + this.lastDestination + ", destination=" + this.destination + ", isPollingDocuments=" + this.isPollingDocuments + ", isPollingApplication=" + this.isPollingApplication + ", activityWasDestroyedDuringFunding=" + this.activityWasDestroyedDuringFunding + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<DocumentRequest> list = this.latestDocumentRequests;
        dest.writeInt(list.size());
        Iterator<DocumentRequest> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        dest.writeParcelable(this.latestApplication, flags);
        dest.writeInt(this.isDocUploadFlowVisited ? 1 : 0);
        dest.writeInt(this.hasShownCreateIav ? 1 : 0);
        dest.writeInt(this.hasExitedIavRelationship ? 1 : 0);
        dest.writeInt(this.shouldPromptForFundingAgain ? 1 : 0);
        dest.writeParcelable(this.lastDestination, flags);
        dest.writeParcelable(this.destination, flags);
        dest.writeInt(this.isPollingDocuments ? 1 : 0);
        dest.writeInt(this.isPollingApplication ? 1 : 0);
        dest.writeInt(this.activityWasDestroyedDuringFunding ? 1 : 0);
    }

    public PostSignUpState(List<DocumentRequest> latestDocumentRequests, UiApplication uiApplication, boolean z, boolean z2, boolean z3, boolean z4, PostSignUpDestination postSignUpDestination, PostSignUpDestination postSignUpDestination2, boolean z5, boolean z6, boolean z7) {
        Intrinsics.checkNotNullParameter(latestDocumentRequests, "latestDocumentRequests");
        this.latestDocumentRequests = latestDocumentRequests;
        this.latestApplication = uiApplication;
        this.isDocUploadFlowVisited = z;
        this.hasShownCreateIav = z2;
        this.hasExitedIavRelationship = z3;
        this.shouldPromptForFundingAgain = z4;
        this.lastDestination = postSignUpDestination;
        this.destination = postSignUpDestination2;
        this.isPollingDocuments = z5;
        this.isPollingApplication = z6;
        this.activityWasDestroyedDuringFunding = z7;
        this.hasApplication = uiApplication != null;
        this.isApplicationApproved = uiApplication != null ? uiApplication.isApproved() : false;
        this.shouldPollApplication = uiApplication == null || !uiApplication.isStateFinal();
        this.shouldPollDocumentRequests = !z;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ PostSignUpState(java.util.List r3, com.robinhood.models.p355ui.identi.UiApplication r4, boolean r5, boolean r6, boolean r7, boolean r8, com.robinhood.android.onboarding.p205ui.postsignup.event.PostSignUpDestination r9, com.robinhood.android.onboarding.p205ui.postsignup.event.PostSignUpDestination r10, boolean r11, boolean r12, boolean r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r2 = this;
            r15 = r14 & 1
            if (r15 == 0) goto L8
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
        L8:
            r15 = r14 & 2
            r0 = 0
            if (r15 == 0) goto Le
            r4 = r0
        Le:
            r15 = r14 & 4
            r1 = 0
            if (r15 == 0) goto L14
            r5 = r1
        L14:
            r15 = r14 & 8
            if (r15 == 0) goto L19
            r6 = r1
        L19:
            r15 = r14 & 16
            if (r15 == 0) goto L1e
            r7 = r1
        L1e:
            r15 = r14 & 32
            if (r15 == 0) goto L23
            r8 = r1
        L23:
            r15 = r14 & 64
            if (r15 == 0) goto L28
            r9 = r0
        L28:
            r15 = r14 & 128(0x80, float:1.794E-43)
            if (r15 == 0) goto L2d
            r10 = r0
        L2d:
            r15 = r14 & 256(0x100, float:3.59E-43)
            if (r15 == 0) goto L32
            r11 = r1
        L32:
            r15 = r14 & 512(0x200, float:7.175E-43)
            if (r15 == 0) goto L37
            r12 = r1
        L37:
            r14 = r14 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L48
            r15 = r1
            r13 = r11
            r14 = r12
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r4 = r2
            goto L54
        L48:
            r15 = r13
            r14 = r12
            r12 = r10
            r13 = r11
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
        L54:
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.onboarding.p205ui.postsignup.PostSignUpState.<init>(java.util.List, com.robinhood.models.ui.identi.UiApplication, boolean, boolean, boolean, boolean, com.robinhood.android.onboarding.ui.postsignup.event.PostSignUpDestination, com.robinhood.android.onboarding.ui.postsignup.event.PostSignUpDestination, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final List<DocumentRequest> getLatestDocumentRequests() {
        return this.latestDocumentRequests;
    }

    public final boolean isDocUploadFlowVisited() {
        return this.isDocUploadFlowVisited;
    }

    public final boolean getHasShownCreateIav() {
        return this.hasShownCreateIav;
    }

    public final boolean getHasExitedIavRelationship() {
        return this.hasExitedIavRelationship;
    }

    public final boolean getShouldPromptForFundingAgain() {
        return this.shouldPromptForFundingAgain;
    }

    public final PostSignUpDestination getLastDestination() {
        return this.lastDestination;
    }

    public final PostSignUpDestination getDestination() {
        return this.destination;
    }

    public final boolean isPollingDocuments() {
        return this.isPollingDocuments;
    }

    public final boolean isPollingApplication() {
        return this.isPollingApplication;
    }

    public final boolean getActivityWasDestroyedDuringFunding() {
        return this.activityWasDestroyedDuringFunding;
    }

    public final boolean getHasApplication() {
        return this.hasApplication;
    }

    /* renamed from: isApplicationApproved, reason: from getter */
    public final boolean getIsApplicationApproved() {
        return this.isApplicationApproved;
    }

    public final boolean getShouldPollApplication() {
        return this.shouldPollApplication;
    }

    public final boolean getShouldPollDocumentRequests() {
        return this.shouldPollDocumentRequests;
    }

    public final boolean getShouldShowDocUploadFlow() {
        return (this.latestDocumentRequests.isEmpty() || this.isDocUploadFlowVisited) ? false : true;
    }
}
