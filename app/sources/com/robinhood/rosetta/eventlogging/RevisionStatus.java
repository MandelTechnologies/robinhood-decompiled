package com.robinhood.rosetta.eventlogging;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RevisionStatus.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RevisionStatus;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "REVISION_STATUS_UNSPECIFIED", "REVISION_STATUS_UNKNOWN", "REVISION_STATUS_ABANDONED", "REVISION_STATUS_ACCEPTED", "REVISION_STATUS_CHANGES_PLANNED", "REVISION_STATUS_DRAFT", "REVISION_STATUS_NEEDS_REVIEW", "REVISION_STATUS_NEEDS_REVISION", "REVISION_STATUS_PUBLISHED", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class RevisionStatus implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RevisionStatus[] $VALUES;

    @JvmField
    public static final ProtoAdapter<RevisionStatus> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final RevisionStatus REVISION_STATUS_ABANDONED;
    public static final RevisionStatus REVISION_STATUS_ACCEPTED;
    public static final RevisionStatus REVISION_STATUS_CHANGES_PLANNED;
    public static final RevisionStatus REVISION_STATUS_DRAFT;
    public static final RevisionStatus REVISION_STATUS_NEEDS_REVIEW;
    public static final RevisionStatus REVISION_STATUS_NEEDS_REVISION;
    public static final RevisionStatus REVISION_STATUS_PUBLISHED;
    public static final RevisionStatus REVISION_STATUS_UNKNOWN;
    public static final RevisionStatus REVISION_STATUS_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ RevisionStatus[] $values() {
        return new RevisionStatus[]{REVISION_STATUS_UNSPECIFIED, REVISION_STATUS_UNKNOWN, REVISION_STATUS_ABANDONED, REVISION_STATUS_ACCEPTED, REVISION_STATUS_CHANGES_PLANNED, REVISION_STATUS_DRAFT, REVISION_STATUS_NEEDS_REVIEW, REVISION_STATUS_NEEDS_REVISION, REVISION_STATUS_PUBLISHED};
    }

    @JvmStatic
    public static final RevisionStatus fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<RevisionStatus> getEntries() {
        return $ENTRIES;
    }

    private RevisionStatus(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final RevisionStatus revisionStatus = new RevisionStatus("REVISION_STATUS_UNSPECIFIED", 0, 0);
        REVISION_STATUS_UNSPECIFIED = revisionStatus;
        REVISION_STATUS_UNKNOWN = new RevisionStatus("REVISION_STATUS_UNKNOWN", 1, 1);
        REVISION_STATUS_ABANDONED = new RevisionStatus("REVISION_STATUS_ABANDONED", 2, 2);
        REVISION_STATUS_ACCEPTED = new RevisionStatus("REVISION_STATUS_ACCEPTED", 3, 3);
        REVISION_STATUS_CHANGES_PLANNED = new RevisionStatus("REVISION_STATUS_CHANGES_PLANNED", 4, 4);
        REVISION_STATUS_DRAFT = new RevisionStatus("REVISION_STATUS_DRAFT", 5, 5);
        REVISION_STATUS_NEEDS_REVIEW = new RevisionStatus("REVISION_STATUS_NEEDS_REVIEW", 6, 6);
        REVISION_STATUS_NEEDS_REVISION = new RevisionStatus("REVISION_STATUS_NEEDS_REVISION", 7, 7);
        REVISION_STATUS_PUBLISHED = new RevisionStatus("REVISION_STATUS_PUBLISHED", 8, 8);
        RevisionStatus[] revisionStatusArr$values = $values();
        $VALUES = revisionStatusArr$values;
        $ENTRIES = EnumEntries2.enumEntries(revisionStatusArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RevisionStatus.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<RevisionStatus>(orCreateKotlinClass, syntax, revisionStatus) { // from class: com.robinhood.rosetta.eventlogging.RevisionStatus$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public RevisionStatus fromValue(int value) {
                return RevisionStatus.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: RevisionStatus.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RevisionStatus$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/RevisionStatus;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RevisionStatus fromValue(int value) {
            switch (value) {
                case 0:
                    return RevisionStatus.REVISION_STATUS_UNSPECIFIED;
                case 1:
                    return RevisionStatus.REVISION_STATUS_UNKNOWN;
                case 2:
                    return RevisionStatus.REVISION_STATUS_ABANDONED;
                case 3:
                    return RevisionStatus.REVISION_STATUS_ACCEPTED;
                case 4:
                    return RevisionStatus.REVISION_STATUS_CHANGES_PLANNED;
                case 5:
                    return RevisionStatus.REVISION_STATUS_DRAFT;
                case 6:
                    return RevisionStatus.REVISION_STATUS_NEEDS_REVIEW;
                case 7:
                    return RevisionStatus.REVISION_STATUS_NEEDS_REVISION;
                case 8:
                    return RevisionStatus.REVISION_STATUS_PUBLISHED;
                default:
                    return null;
            }
        }
    }

    public static RevisionStatus valueOf(String str) {
        return (RevisionStatus) Enum.valueOf(RevisionStatus.class, str);
    }

    public static RevisionStatus[] values() {
        return (RevisionStatus[]) $VALUES.clone();
    }
}
