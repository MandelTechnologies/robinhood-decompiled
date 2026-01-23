package com.robinhood.android.lib.livetrivia;

import kotlin.Metadata;
import trivia.p550v1.SetTriviaEventReminderRequestDto;

/* compiled from: LiveTriviaInteractionHandler.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/lib/livetrivia/LiveTriviaInteractionHandler;", "", "dismissProgramView", "", "seekVideoPlayback", "seekToMs", "", "setTriviaEventReminder", "request", "Ltrivia/v1/SetTriviaEventReminderRequestDto;", "lib-live-trivia_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface LiveTriviaInteractionHandler {
    void dismissProgramView();

    void seekVideoPlayback(long seekToMs);

    void setTriviaEventReminder(SetTriviaEventReminderRequestDto request);
}
