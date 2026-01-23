package com.salesforce.android.smi.network.data.domain.participant;

import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.event.entries.ParticipantClientMenu;
import com.squareup.moshi.Json;
import kotlin.Deprecated;
import kotlin.Metadata;

/* compiled from: Participant.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0014\u0010\t\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\f8&X§\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0005R\u0012\u0010\u0013\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0005R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u0016X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u001b\u0010\u0005¨\u0006\u001d"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/participant/Participant;", "", "subject", "", "getSubject", "()Ljava/lang/String;", "isLocal", "", "()Z", "app", "getApp", "roleType", "Lcom/salesforce/android/smi/network/data/domain/participant/ParticipantRoleType;", "getRoleType$annotations", "()V", "getRoleType", "()Lcom/salesforce/android/smi/network/data/domain/participant/ParticipantRoleType;", "context", "getContext", "displayName", "getDisplayName", "clientMenu", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/event/entries/ParticipantClientMenu;", "getClientMenu", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/event/entries/ParticipantClientMenu;", "role", "getRole$annotations", "getRole", "Companion", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface Participant {
    public static final String APP = "iamessage";
    public static final String CONTEXT = "";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String DISPLAY_NAME = "User";

    /* compiled from: Participant.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static /* synthetic */ void getRole$annotations() {
        }

        @Json(name = "role")
        public static /* synthetic */ void getRoleType$annotations() {
        }
    }

    String getApp();

    ParticipantClientMenu getClientMenu();

    String getContext();

    String getDisplayName();

    String getRole();

    ParticipantRoleType getRoleType();

    String getSubject();

    boolean isLocal();

    /* compiled from: Participant.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/participant/Participant$Companion;", "", "<init>", "()V", "APP", "", "CONTEXT", "DISPLAY_NAME", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String APP = "iamessage";
        public static final String CONTEXT = "";
        public static final String DISPLAY_NAME = "User";

        private Companion() {
        }
    }
}
