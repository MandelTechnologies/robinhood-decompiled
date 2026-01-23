package com.salesforce.android.smi.network.data.domain.participant;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ParticipantRoleType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/participant/ParticipantRoleType;", "", "<init>", "(Ljava/lang/String;I)V", "Agent", "Chatbot", "EndUser", "System", "Unknown", "Supervisor", "Router", "Companion", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ParticipantRoleType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ParticipantRoleType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ParticipantRoleType Agent = new ParticipantRoleType("Agent", 0);
    public static final ParticipantRoleType Chatbot = new ParticipantRoleType("Chatbot", 1);
    public static final ParticipantRoleType EndUser = new ParticipantRoleType("EndUser", 2);
    public static final ParticipantRoleType System = new ParticipantRoleType("System", 3);
    public static final ParticipantRoleType Unknown = new ParticipantRoleType("Unknown", 4);
    public static final ParticipantRoleType Supervisor = new ParticipantRoleType("Supervisor", 5);
    public static final ParticipantRoleType Router = new ParticipantRoleType("Router", 6);

    private static final /* synthetic */ ParticipantRoleType[] $values() {
        return new ParticipantRoleType[]{Agent, Chatbot, EndUser, System, Unknown, Supervisor, Router};
    }

    public static EnumEntries<ParticipantRoleType> getEntries() {
        return $ENTRIES;
    }

    private ParticipantRoleType(String str, int i) {
    }

    static {
        ParticipantRoleType[] participantRoleTypeArr$values = $values();
        $VALUES = participantRoleTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(participantRoleTypeArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: ParticipantRoleType.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/participant/ParticipantRoleType$Companion;", "", "<init>", "()V", "enumValueOf", "Lcom/salesforce/android/smi/network/data/domain/participant/ParticipantRoleType;", "str", "", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ParticipantRoleType enumValueOf(String str) {
            if (str != null) {
                try {
                    ParticipantRoleType participantRoleTypeValueOf = ParticipantRoleType.valueOf(str);
                    if (participantRoleTypeValueOf != null) {
                        return participantRoleTypeValueOf;
                    }
                } catch (Exception unused) {
                    return ParticipantRoleType.System;
                }
            }
            return ParticipantRoleType.System;
        }
    }

    public static ParticipantRoleType valueOf(String str) {
        return (ParticipantRoleType) Enum.valueOf(ParticipantRoleType.class, str);
    }

    public static ParticipantRoleType[] values() {
        return (ParticipantRoleType[]) $VALUES.clone();
    }
}
