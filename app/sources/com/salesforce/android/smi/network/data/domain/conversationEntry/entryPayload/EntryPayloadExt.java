package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload;

import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.event.entries.ParticipantChangedEntry;
import com.salesforce.android.smi.network.data.domain.participant.ParticipantRoleType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EntryPayloadExt.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0001\"\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"filterInvalid", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload$ParticipantChangedPayload;", "INVALID_ROLES", "", "Lcom/salesforce/android/smi/network/data/domain/participant/ParticipantRoleType;", "data_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayloadExtKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class EntryPayloadExt {
    private static final List<ParticipantRoleType> INVALID_ROLES = CollectionsKt.listOf((Object[]) new ParticipantRoleType[]{ParticipantRoleType.Supervisor, ParticipantRoleType.Router});

    public static final EntryPayload.ParticipantChangedPayload filterInvalid(EntryPayload.ParticipantChangedPayload participantChangedPayload) {
        Intrinsics.checkNotNullParameter(participantChangedPayload, "<this>");
        List<ParticipantChangedEntry> entries = participantChangedPayload.getEntries();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entries) {
            if (!INVALID_ROLES.contains(((ParticipantChangedEntry) obj).getParticipant().getRoleType())) {
                arrayList.add(obj);
            }
        }
        participantChangedPayload.setEntries(arrayList);
        if (participantChangedPayload.getEntries().isEmpty()) {
            return null;
        }
        return participantChangedPayload;
    }
}
