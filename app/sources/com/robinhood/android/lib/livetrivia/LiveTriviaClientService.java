package com.robinhood.android.lib.livetrivia;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import eoy_giveaway.p456v1.DismissProgramViewRequestDto;
import eoy_giveaway.p456v1.DismissProgramViewResponseDto;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import timber.log.Timber;
import trivia.p550v1.GoldTriviaClientService;
import trivia.p550v1.SeekVideoPlaybackRequestDto;
import trivia.p550v1.SeekVideoPlaybackResponseDto;
import trivia.p550v1.SetTriviaEventReminderRequestDto;
import trivia.p550v1.SetTriviaEventReminderResponseDto;

/* compiled from: LiveTriviaClientService.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/lib/livetrivia/LiveTriviaClientService;", "Ltrivia/v1/GoldTriviaClientService;", "<init>", "()V", "handler", "Lcom/robinhood/android/lib/livetrivia/LiveTriviaInteractionHandler;", "updateClientInteractionHandler", "", "interactionHandler", "DismissProgramView", "Leoy_giveaway/v1/DismissProgramViewResponseDto;", "request", "Leoy_giveaway/v1/DismissProgramViewRequestDto;", "(Leoy_giveaway/v1/DismissProgramViewRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SeekVideoPlayback", "Ltrivia/v1/SeekVideoPlaybackResponseDto;", "Ltrivia/v1/SeekVideoPlaybackRequestDto;", "(Ltrivia/v1/SeekVideoPlaybackRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SetTriviaEventReminder", "Ltrivia/v1/SetTriviaEventReminderResponseDto;", "Ltrivia/v1/SetTriviaEventReminderRequestDto;", "(Ltrivia/v1/SetTriviaEventReminderRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-live-trivia_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class LiveTriviaClientService implements GoldTriviaClientService {
    public static final int $stable = 8;
    private LiveTriviaInteractionHandler handler;

    public Object DismissProgramView(Request<DismissProgramViewRequestDto> request, Continuation<? super Response<DismissProgramViewResponseDto>> continuation) {
        return GoldTriviaClientService.DefaultImpls.DismissProgramView(this, request, continuation);
    }

    public Object SeekVideoPlayback(Request<SeekVideoPlaybackRequestDto> request, Continuation<? super Response<SeekVideoPlaybackResponseDto>> continuation) {
        return GoldTriviaClientService.DefaultImpls.SeekVideoPlayback(this, request, continuation);
    }

    public Object SetTriviaEventReminder(Request<SetTriviaEventReminderRequestDto> request, Continuation<? super Response<SetTriviaEventReminderResponseDto>> continuation) {
        return GoldTriviaClientService.DefaultImpls.SetTriviaEventReminder(this, request, continuation);
    }

    public final void updateClientInteractionHandler(LiveTriviaInteractionHandler interactionHandler) {
        this.handler = interactionHandler;
    }

    @Override // trivia.p550v1.GoldTriviaClientService
    public Object DismissProgramView(DismissProgramViewRequestDto dismissProgramViewRequestDto, Continuation<? super DismissProgramViewResponseDto> continuation) {
        Timber.INSTANCE.mo3350d("DismissProgramView: " + dismissProgramViewRequestDto.getView_id(), new Object[0]);
        LiveTriviaInteractionHandler liveTriviaInteractionHandler = this.handler;
        if (liveTriviaInteractionHandler != null) {
            liveTriviaInteractionHandler.dismissProgramView();
        }
        return new DismissProgramViewResponseDto();
    }

    @Override // trivia.p550v1.GoldTriviaClientService
    public Object SeekVideoPlayback(SeekVideoPlaybackRequestDto seekVideoPlaybackRequestDto, Continuation<? super SeekVideoPlaybackResponseDto> continuation) {
        Timber.INSTANCE.mo3350d("SeekVideoPlayback: " + seekVideoPlaybackRequestDto.getSeek_to_ms(), new Object[0]);
        LiveTriviaInteractionHandler liveTriviaInteractionHandler = this.handler;
        if (liveTriviaInteractionHandler != null) {
            liveTriviaInteractionHandler.seekVideoPlayback(seekVideoPlaybackRequestDto.getSeek_to_ms());
        }
        return new SeekVideoPlaybackResponseDto();
    }

    @Override // trivia.p550v1.GoldTriviaClientService
    public Object SetTriviaEventReminder(SetTriviaEventReminderRequestDto setTriviaEventReminderRequestDto, Continuation<? super SetTriviaEventReminderResponseDto> continuation) {
        Timber.INSTANCE.mo3350d("SetTriviaEventReminder: " + setTriviaEventReminderRequestDto, new Object[0]);
        LiveTriviaInteractionHandler liveTriviaInteractionHandler = this.handler;
        if (liveTriviaInteractionHandler != null) {
            liveTriviaInteractionHandler.setTriviaEventReminder(setTriviaEventReminderRequestDto);
        }
        return new SetTriviaEventReminderResponseDto();
    }
}
