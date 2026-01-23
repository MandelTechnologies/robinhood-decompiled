package com.withpersona.sdk2.inquiry.governmentid.video_capture;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WebRtcState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/WebRtcState;", "", "<init>", "(Ljava/lang/String;I)V", "Connecting", "Connected", "Disconnected", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class WebRtcState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ WebRtcState[] $VALUES;
    public static final WebRtcState Connecting = new WebRtcState("Connecting", 0);
    public static final WebRtcState Connected = new WebRtcState("Connected", 1);
    public static final WebRtcState Disconnected = new WebRtcState("Disconnected", 2);

    private static final /* synthetic */ WebRtcState[] $values() {
        return new WebRtcState[]{Connecting, Connected, Disconnected};
    }

    public static EnumEntries<WebRtcState> getEntries() {
        return $ENTRIES;
    }

    private WebRtcState(String str, int i) {
    }

    static {
        WebRtcState[] webRtcStateArr$values = $values();
        $VALUES = webRtcStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(webRtcStateArr$values);
    }

    public static WebRtcState valueOf(String str) {
        return (WebRtcState) Enum.valueOf(WebRtcState.class, str);
    }

    public static WebRtcState[] values() {
        return (WebRtcState[]) $VALUES.clone();
    }
}
