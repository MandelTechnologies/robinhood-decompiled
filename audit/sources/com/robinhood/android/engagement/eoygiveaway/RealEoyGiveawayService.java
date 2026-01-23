package com.robinhood.android.engagement.eoygiveaway;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import eoy_giveaway.p456v1.DismissProgramViewRequestDto;
import eoy_giveaway.p456v1.DismissProgramViewResponseDto;
import eoy_giveaway.p456v1.EndOfYearGiveawayClientService;
import eoy_giveaway.p456v1.RunScriptOnCanvasRequestDto;
import eoy_giveaway.p456v1.RunScriptOnCanvasResponseDto;
import eoy_giveaway.p456v1.ShowSystemShareScreenRequestDto;
import eoy_giveaway.p456v1.ShowSystemShareScreenResponseDto;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import timber.log.Timber;

/* compiled from: RealEoyGiveawayService.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/engagement/eoygiveaway/RealEoyGiveawayService;", "Leoy_giveaway/v1/EndOfYearGiveawayClientService;", "<init>", "()V", "handler", "Lcom/robinhood/android/engagement/eoygiveaway/EoyGiveawayInteractionHandler;", "RunScriptOnCanvas", "Leoy_giveaway/v1/RunScriptOnCanvasResponseDto;", "request", "Leoy_giveaway/v1/RunScriptOnCanvasRequestDto;", "(Leoy_giveaway/v1/RunScriptOnCanvasRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "DismissProgramView", "Leoy_giveaway/v1/DismissProgramViewResponseDto;", "Leoy_giveaway/v1/DismissProgramViewRequestDto;", "(Leoy_giveaway/v1/DismissProgramViewRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ShowSystemShareScreen", "Leoy_giveaway/v1/ShowSystemShareScreenResponseDto;", "Leoy_giveaway/v1/ShowSystemShareScreenRequestDto;", "(Leoy_giveaway/v1/ShowSystemShareScreenRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateClientInteractionHandler", "", "interactionHandler", "lib-eoy-giveaway_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class RealEoyGiveawayService implements EndOfYearGiveawayClientService {
    public static final int $stable = 8;
    private EoyGiveawayInteractionHandler handler;

    public Object DismissProgramView(Request<DismissProgramViewRequestDto> request, Continuation<? super Response<DismissProgramViewResponseDto>> continuation) {
        return EndOfYearGiveawayClientService.DefaultImpls.DismissProgramView(this, request, continuation);
    }

    public Object RunScriptOnCanvas(Request<RunScriptOnCanvasRequestDto> request, Continuation<? super Response<RunScriptOnCanvasResponseDto>> continuation) {
        return EndOfYearGiveawayClientService.DefaultImpls.RunScriptOnCanvas(this, request, continuation);
    }

    public Object ShowSystemShareScreen(Request<ShowSystemShareScreenRequestDto> request, Continuation<? super Response<ShowSystemShareScreenResponseDto>> continuation) {
        return EndOfYearGiveawayClientService.DefaultImpls.ShowSystemShareScreen(this, request, continuation);
    }

    @Override // eoy_giveaway.p456v1.EndOfYearGiveawayClientService
    public Object RunScriptOnCanvas(RunScriptOnCanvasRequestDto runScriptOnCanvasRequestDto, Continuation<? super RunScriptOnCanvasResponseDto> continuation) {
        Timber.INSTANCE.mo3350d("RunScriptOnCanvas: " + runScriptOnCanvasRequestDto.getScript(), new Object[0]);
        EoyGiveawayInteractionHandler eoyGiveawayInteractionHandler = this.handler;
        if (eoyGiveawayInteractionHandler != null) {
            eoyGiveawayInteractionHandler.invokeJavascript(runScriptOnCanvasRequestDto.getScript());
        }
        return new RunScriptOnCanvasResponseDto();
    }

    @Override // eoy_giveaway.p456v1.EndOfYearGiveawayClientService
    public Object DismissProgramView(DismissProgramViewRequestDto dismissProgramViewRequestDto, Continuation<? super DismissProgramViewResponseDto> continuation) {
        Timber.INSTANCE.mo3350d("DismissProgramView: " + dismissProgramViewRequestDto.getView_id(), new Object[0]);
        EoyGiveawayInteractionHandler eoyGiveawayInteractionHandler = this.handler;
        if (eoyGiveawayInteractionHandler != null) {
            eoyGiveawayInteractionHandler.dismissProgramView(dismissProgramViewRequestDto.getView_id());
        }
        return new DismissProgramViewResponseDto();
    }

    @Override // eoy_giveaway.p456v1.EndOfYearGiveawayClientService
    public Object ShowSystemShareScreen(ShowSystemShareScreenRequestDto showSystemShareScreenRequestDto, Continuation<? super ShowSystemShareScreenResponseDto> continuation) {
        Timber.INSTANCE.mo3350d("ShowSystemShareScreen: contents=" + showSystemShareScreenRequestDto.getContents() + ", includeCanvasImage=" + showSystemShareScreenRequestDto.getInclude_canvas_image(), new Object[0]);
        EoyGiveawayInteractionHandler eoyGiveawayInteractionHandler = this.handler;
        if (eoyGiveawayInteractionHandler != null) {
            eoyGiveawayInteractionHandler.showSystemShareScreen(showSystemShareScreenRequestDto.getContents(), showSystemShareScreenRequestDto.getInclude_canvas_image());
        }
        return new ShowSystemShareScreenResponseDto();
    }

    public final void updateClientInteractionHandler(EoyGiveawayInteractionHandler interactionHandler) {
        this.handler = interactionHandler;
    }
}
