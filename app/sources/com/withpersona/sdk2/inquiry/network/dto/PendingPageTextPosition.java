package com.withpersona.sdk2.inquiry.network.dto;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PendingPageTextPosition.kt */
@JsonClass(generateAdapter = false)
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "", "<init>", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "Companion", "network-inquiry_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class PendingPageTextPosition {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PendingPageTextPosition[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final PendingPageTextPosition TOP = new PendingPageTextPosition("TOP", 0);
    public static final PendingPageTextPosition BOTTOM = new PendingPageTextPosition("BOTTOM", 1);

    private static final /* synthetic */ PendingPageTextPosition[] $values() {
        return new PendingPageTextPosition[]{TOP, BOTTOM};
    }

    public static EnumEntries<PendingPageTextPosition> getEntries() {
        return $ENTRIES;
    }

    private PendingPageTextPosition(String str, int i) {
    }

    static {
        PendingPageTextPosition[] pendingPageTextPositionArr$values = $values();
        $VALUES = pendingPageTextPositionArr$values;
        $ENTRIES = EnumEntries2.enumEntries(pendingPageTextPositionArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: PendingPageTextPosition.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0017¨\u0006\r"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition$Companion;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "<init>", "()V", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "network-inquiry_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion extends JsonAdapter<PendingPageTextPosition> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.squareup.moshi.JsonAdapter
        @ToJson
        public void toJson(JsonWriter writer, PendingPageTextPosition value) {
            Intrinsics.checkNotNullParameter(writer, "writer");
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.moshi.JsonAdapter
        @FromJson
        public PendingPageTextPosition fromJson(JsonReader reader) throws IOException {
            Intrinsics.checkNotNullParameter(reader, "reader");
            Object jsonValue = reader.readJsonValue();
            return Intrinsics.areEqual(jsonValue, "start") ? PendingPageTextPosition.TOP : Intrinsics.areEqual(jsonValue, "end") ? PendingPageTextPosition.BOTTOM : PendingPageTextPosition2.getDEFAULT_PROCESSING_TEXT_POSITION();
        }
    }

    public static PendingPageTextPosition valueOf(String str) {
        return (PendingPageTextPosition) Enum.valueOf(PendingPageTextPosition.class, str);
    }

    public static PendingPageTextPosition[] values() {
        return (PendingPageTextPosition[]) $VALUES.clone();
    }
}
