package com.salesforce.android.smi.network.data.domain.participant;

import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.event.entries.ParticipantClientMenu;
import com.squareup.moshi.Json;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CoreParticipant.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 +2\u00020\u0001:\u0001+BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003JU\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010%\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0011R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0014\u0010\n\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0010¨\u0006,"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/participant/CoreParticipant;", "Lcom/salesforce/android/smi/network/data/domain/participant/Participant;", "subject", "", "isLocal", "", "app", "roleType", "Lcom/salesforce/android/smi/network/data/domain/participant/ParticipantRoleType;", "context", "displayName", "clientMenu", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/event/entries/ParticipantClientMenu;", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Lcom/salesforce/android/smi/network/data/domain/participant/ParticipantRoleType;Ljava/lang/String;Ljava/lang/String;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/event/entries/ParticipantClientMenu;)V", "getSubject", "()Ljava/lang/String;", "()Z", "getApp", "getRoleType", "()Lcom/salesforce/android/smi/network/data/domain/participant/ParticipantRoleType;", "getContext", "getDisplayName", "getClientMenu", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/event/entries/ParticipantClientMenu;", "role", "getRole$annotations", "()V", "getRole", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "", "toString", "Companion", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CoreParticipant implements Participant {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String SUBJECT_ID_PLACEHOLDER = "localSubjectID";
    private static volatile String localSubject = SUBJECT_ID_PLACEHOLDER;
    private final String app;
    private final ParticipantClientMenu clientMenu;
    private final String context;
    private final String displayName;
    private final transient boolean isLocal;
    private final transient String role;
    private final ParticipantRoleType roleType;
    private final String subject;

    public static /* synthetic */ CoreParticipant copy$default(CoreParticipant coreParticipant, String str, boolean z, String str2, ParticipantRoleType participantRoleType, String str3, String str4, ParticipantClientMenu participantClientMenu, int i, Object obj) {
        if ((i & 1) != 0) {
            str = coreParticipant.subject;
        }
        if ((i & 2) != 0) {
            z = coreParticipant.isLocal;
        }
        if ((i & 4) != 0) {
            str2 = coreParticipant.app;
        }
        if ((i & 8) != 0) {
            participantRoleType = coreParticipant.roleType;
        }
        if ((i & 16) != 0) {
            str3 = coreParticipant.context;
        }
        if ((i & 32) != 0) {
            str4 = coreParticipant.displayName;
        }
        if ((i & 64) != 0) {
            participantClientMenu = coreParticipant.clientMenu;
        }
        String str5 = str4;
        ParticipantClientMenu participantClientMenu2 = participantClientMenu;
        String str6 = str3;
        String str7 = str2;
        return coreParticipant.copy(str, z, str7, participantRoleType, str6, str5, participantClientMenu2);
    }

    @Deprecated
    public static /* synthetic */ void getRole$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getSubject() {
        return this.subject;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLocal() {
        return this.isLocal;
    }

    /* renamed from: component3, reason: from getter */
    public final String getApp() {
        return this.app;
    }

    /* renamed from: component4, reason: from getter */
    public final ParticipantRoleType getRoleType() {
        return this.roleType;
    }

    /* renamed from: component5, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component7, reason: from getter */
    public final ParticipantClientMenu getClientMenu() {
        return this.clientMenu;
    }

    public final CoreParticipant copy(String subject, boolean isLocal, String app, @Json(name = "role") ParticipantRoleType roleType, String context, String displayName, ParticipantClientMenu clientMenu) {
        Intrinsics.checkNotNullParameter(subject, "subject");
        Intrinsics.checkNotNullParameter(roleType, "roleType");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        return new CoreParticipant(subject, isLocal, app, roleType, context, displayName, clientMenu);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoreParticipant)) {
            return false;
        }
        CoreParticipant coreParticipant = (CoreParticipant) other;
        return Intrinsics.areEqual(this.subject, coreParticipant.subject) && this.isLocal == coreParticipant.isLocal && Intrinsics.areEqual(this.app, coreParticipant.app) && this.roleType == coreParticipant.roleType && Intrinsics.areEqual(this.context, coreParticipant.context) && Intrinsics.areEqual(this.displayName, coreParticipant.displayName) && Intrinsics.areEqual(this.clientMenu, coreParticipant.clientMenu);
    }

    public int hashCode() {
        int iHashCode = ((this.subject.hashCode() * 31) + Boolean.hashCode(this.isLocal)) * 31;
        String str = this.app;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.roleType.hashCode()) * 31;
        String str2 = this.context;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.displayName.hashCode()) * 31;
        ParticipantClientMenu participantClientMenu = this.clientMenu;
        return iHashCode3 + (participantClientMenu != null ? participantClientMenu.hashCode() : 0);
    }

    public String toString() {
        return "CoreParticipant(subject=" + this.subject + ", isLocal=" + this.isLocal + ", app=" + this.app + ", roleType=" + this.roleType + ", context=" + this.context + ", displayName=" + this.displayName + ", clientMenu=" + this.clientMenu + ")";
    }

    public CoreParticipant(String subject, boolean z, String str, @Json(name = "role") ParticipantRoleType roleType, String str2, String displayName, ParticipantClientMenu participantClientMenu) {
        Intrinsics.checkNotNullParameter(subject, "subject");
        Intrinsics.checkNotNullParameter(roleType, "roleType");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        this.subject = subject;
        this.isLocal = z;
        this.app = str;
        this.roleType = roleType;
        this.context = str2;
        this.displayName = displayName;
        this.clientMenu = participantClientMenu;
        this.role = getRoleType().name();
    }

    @Override // com.salesforce.android.smi.network.data.domain.participant.Participant
    public String getSubject() {
        return this.subject;
    }

    @Override // com.salesforce.android.smi.network.data.domain.participant.Participant
    public boolean isLocal() {
        return this.isLocal;
    }

    public /* synthetic */ CoreParticipant(String str, boolean z, String str2, ParticipantRoleType participantRoleType, String str3, String str4, ParticipantClientMenu participantClientMenu, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? Intrinsics.areEqual(localSubject, str) || Intrinsics.areEqual(str, SUBJECT_ID_PLACEHOLDER) : z, (i & 4) != 0 ? "iamessage" : str2, participantRoleType, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "User" : str4, (i & 64) != 0 ? null : participantClientMenu);
    }

    @Override // com.salesforce.android.smi.network.data.domain.participant.Participant
    public String getApp() {
        return this.app;
    }

    @Override // com.salesforce.android.smi.network.data.domain.participant.Participant
    public ParticipantRoleType getRoleType() {
        return this.roleType;
    }

    @Override // com.salesforce.android.smi.network.data.domain.participant.Participant
    public String getContext() {
        return this.context;
    }

    @Override // com.salesforce.android.smi.network.data.domain.participant.Participant
    public String getDisplayName() {
        return this.displayName;
    }

    @Override // com.salesforce.android.smi.network.data.domain.participant.Participant
    public ParticipantClientMenu getClientMenu() {
        return this.clientMenu;
    }

    @Override // com.salesforce.android.smi.network.data.domain.participant.Participant
    public String getRole() {
        return this.role;
    }

    /* compiled from: CoreParticipant.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/participant/CoreParticipant$Companion;", "", "<init>", "()V", "SUBJECT_ID_PLACEHOLDER", "", "localSubject", "getLocalSubject", "()Ljava/lang/String;", "setLocalSubject", "(Ljava/lang/String;)V", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getLocalSubject() {
            return CoreParticipant.localSubject;
        }

        public final void setLocalSubject(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            CoreParticipant.localSubject = str;
        }
    }
}
