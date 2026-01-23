package com.robinhood.android.support.supportchat;

import com.robinhood.shared.support.supportchat.format.ChatTimestampFormatter;
import com.robinhood.shared.support.supportchat.p396ui.models.TimestampFormat;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.format.LocalDateTimeFormatter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: TraderChatTimestampFormatter.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/support/supportchat/TraderChatTimestampFormatter;", "Lcom/robinhood/shared/support/supportchat/format/ChatTimestampFormatter;", "<init>", "()V", "j$/time/Instant", "time", "Lcom/robinhood/shared/support/supportchat/ui/models/TimestampFormat;", "format", "", "(Lj$/time/Instant;Lcom/robinhood/shared/support/supportchat/ui/models/TimestampFormat;)Ljava/lang/String;", "lib-support-chat_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class TraderChatTimestampFormatter implements ChatTimestampFormatter {
    public static final TraderChatTimestampFormatter INSTANCE = new TraderChatTimestampFormatter();

    /* compiled from: TraderChatTimestampFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimestampFormat.values().length];
            try {
                iArr[TimestampFormat.NATURAL_DOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimestampFormat.NATURAL_DOT_NO_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimestampFormat.TIME_SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private TraderChatTimestampFormatter() {
    }

    @Override // com.robinhood.shared.support.supportchat.format.ChatTimestampFormatter
    public String format(Instant time, TimestampFormat format2) {
        LocalDateTimeFormatter localDateTimeFormatter;
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(format2, "format");
        int i = WhenMappings.$EnumSwitchMapping$0[format2.ordinal()];
        if (i == 1) {
            localDateTimeFormatter = LocalDateTimeFormatter.NATURAL_DOT;
        } else if (i == 2) {
            localDateTimeFormatter = LocalDateTimeFormatter.NATURAL_DOT_NO_YEAR;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            localDateTimeFormatter = LocalDateTimeFormatter.TIME_SHORT;
        }
        return localDateTimeFormatter.format(Instants.toLocalDateTime$default(time, null, 1, null));
    }
}
