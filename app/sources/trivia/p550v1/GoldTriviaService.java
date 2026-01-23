package trivia.p550v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import messaging.proto.badge.p484v1.GetBadgeDataRequestDto;
import messaging.proto.badge.p484v1.GetBadgeDataResponseDto;
import microgram.annotation.ManagedServices;

/* compiled from: GoldTriviaService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0003\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH¦@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0010H¦@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0014H¦@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0018H¦@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001cH¦@¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m3636d2 = {"Ltrivia/v1/GoldTriviaService;", "", "Lmessaging/proto/badge/v1/GetBadgeDataRequestDto;", "request", "Lkotlinx/coroutines/flow/Flow;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto;", "GetBadgeData", "(Lmessaging/proto/badge/v1/GetBadgeDataRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Ltrivia/v1/GetVideoViewModelRequestDto;", "Ltrivia/v1/GetVideoViewModelResponseDto;", "GetVideoViewModel", "(Ltrivia/v1/GetVideoViewModelRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Ltrivia/v1/VideoBufferingBeganRequestDto;", "Ltrivia/v1/VideoBufferingBeganResponseDto;", "VideoBufferingBegan", "(Ltrivia/v1/VideoBufferingBeganRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ltrivia/v1/VideoBufferingEndedRequestDto;", "Ltrivia/v1/VideoBufferingEndedResponseDto;", "VideoBufferingEnded", "(Ltrivia/v1/VideoBufferingEndedRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ltrivia/v1/CloseButtonTappedRequestDto;", "Ltrivia/v1/CloseButtonTappedResponseDto;", "CloseButtonTapped", "(Ltrivia/v1/CloseButtonTappedRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ltrivia/v1/ScreenStateChangedRequestDto;", "Ltrivia/v1/ScreenStateChangedResponseDto;", "ScreenStateChanged", "(Ltrivia/v1/ScreenStateChangedRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ltrivia/v1/AppStateChangedRequestDto;", "Ltrivia/v1/AppStateChangedResponseDto;", "AppStateChanged", "(Ltrivia/v1/AppStateChangedRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trivia.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "trivia.v1.GoldTriviaService")
/* loaded from: classes28.dex */
public interface GoldTriviaService {
    Object AppStateChanged(AppStateChangedRequestDto appStateChangedRequestDto, Continuation<? super AppStateChangedResponseDto> continuation);

    Object CloseButtonTapped(CloseButtonTappedRequestDto closeButtonTappedRequestDto, Continuation<? super CloseButtonTappedResponseDto> continuation);

    Flow<GetBadgeDataResponseDto> GetBadgeData(GetBadgeDataRequestDto request);

    Flow<GetVideoViewModelResponseDto> GetVideoViewModel(GetVideoViewModelRequestDto request);

    Object ScreenStateChanged(ScreenStateChangedRequestDto screenStateChangedRequestDto, Continuation<? super ScreenStateChangedResponseDto> continuation);

    Object VideoBufferingBegan(VideoBufferingBeganRequestDto videoBufferingBeganRequestDto, Continuation<? super VideoBufferingBeganResponseDto> continuation);

    Object VideoBufferingEnded(VideoBufferingEndedRequestDto videoBufferingEndedRequestDto, Continuation<? super VideoBufferingEndedResponseDto> continuation);
}
