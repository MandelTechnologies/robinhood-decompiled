package redesign_settings.p528v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import microgram.annotation.ManagedServices;

/* compiled from: RedesignSettingsService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lredesign_settings/v1/RedesignSettingsService;", "", "Lredesign_settings/v1/GetHighlightSettingsRequestDto;", "request", "Lredesign_settings/v1/GetHighlightSettingsResponseDto;", "GetHighlightSettings", "(Lredesign_settings/v1/GetHighlightSettingsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "redesign_settings.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "redesign_settings.v1.RedesignSettingsService")
/* loaded from: classes25.dex */
public interface RedesignSettingsService {
    Object GetHighlightSettings(GetHighlightSettingsRequestDto getHighlightSettingsRequestDto, Continuation<? super GetHighlightSettingsResponseDto> continuation);
}
