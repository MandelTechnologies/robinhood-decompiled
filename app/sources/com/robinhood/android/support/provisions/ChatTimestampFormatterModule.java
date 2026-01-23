package com.robinhood.android.support.provisions;

import com.robinhood.android.support.supportchat.TraderChatTimestampFormatter;
import com.robinhood.shared.support.supportchat.format.ChatTimestampFormatter;
import kotlin.Metadata;

/* compiled from: ChatTimestampFormatterModule.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/support/provisions/ChatTimestampFormatterModule;", "", "<init>", "()V", "provideRhcChatTimestampFormatter", "Lcom/robinhood/shared/support/supportchat/format/ChatTimestampFormatter;", "lib-support-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class ChatTimestampFormatterModule {
    public static final ChatTimestampFormatterModule INSTANCE = new ChatTimestampFormatterModule();

    private ChatTimestampFormatterModule() {
    }

    public final ChatTimestampFormatter provideRhcChatTimestampFormatter() {
        return TraderChatTimestampFormatter.INSTANCE;
    }
}
