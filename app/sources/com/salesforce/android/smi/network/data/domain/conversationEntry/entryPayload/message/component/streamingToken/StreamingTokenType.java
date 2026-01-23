package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.streamingToken;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StreamingTokenType.kt */
@JsonClass(generateAdapter = false)
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/streamingToken/StreamingTokenType;", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "<init>", "(Ljava/lang/String;II)V", "getIndex", "()I", "StreamingTokenValidation", "MessageStreamingToken", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class StreamingTokenType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StreamingTokenType[] $VALUES;
    private final int index;
    public static final StreamingTokenType StreamingTokenValidation = new StreamingTokenType("StreamingTokenValidation", 0, 0);
    public static final StreamingTokenType MessageStreamingToken = new StreamingTokenType("MessageStreamingToken", 1, 1);

    private static final /* synthetic */ StreamingTokenType[] $values() {
        return new StreamingTokenType[]{StreamingTokenValidation, MessageStreamingToken};
    }

    public static EnumEntries<StreamingTokenType> getEntries() {
        return $ENTRIES;
    }

    private StreamingTokenType(String str, int i, int i2) {
        this.index = i2;
    }

    public final int getIndex() {
        return this.index;
    }

    static {
        StreamingTokenType[] streamingTokenTypeArr$values = $values();
        $VALUES = streamingTokenTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(streamingTokenTypeArr$values);
    }

    public static StreamingTokenType valueOf(String str) {
        return (StreamingTokenType) Enum.valueOf(StreamingTokenType.class, str);
    }

    public static StreamingTokenType[] values() {
        return (StreamingTokenType[]) $VALUES.clone();
    }
}
