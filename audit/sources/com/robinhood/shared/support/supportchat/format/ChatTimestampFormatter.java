package com.robinhood.shared.support.supportchat.format;

import com.robinhood.shared.support.supportchat.p396ui.models.TimestampFormat;
import kotlin.Metadata;
import p479j$.time.Instant;

/* compiled from: ChatTimestampFormatter.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/support/supportchat/format/ChatTimestampFormatter;", "", "j$/time/Instant", "time", "Lcom/robinhood/shared/support/supportchat/ui/models/TimestampFormat;", "format", "", "(Lj$/time/Instant;Lcom/robinhood/shared/support/supportchat/ui/models/TimestampFormat;)Ljava/lang/String;", "lib-support-chat_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface ChatTimestampFormatter {
    String format(Instant time, TimestampFormat format2);
}
